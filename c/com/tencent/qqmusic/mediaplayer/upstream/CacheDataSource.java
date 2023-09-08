package com.tencent.qqmusic.mediaplayer.upstream;

import android.net.Uri;
import android.os.Looper;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.DataRangeTracker;
import com.tencent.qqmusic.mediaplayer.downstream.FileDataSink;
import com.tencent.qqmusic.mediaplayer.downstream.IDataSink;
import com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector;
import com.tencent.qqmusic.mediaplayer.network.DefaultMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.perf.Collectable;
import com.tencent.qqmusic.mediaplayer.perf.ErrorUploadCollector;
import com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector;
import com.tencent.qqmusic.mediaplayer.upstream.Loader;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.tav.coremedia.TimeUtil;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class CacheDataSource implements IDataSource, Collectable {
    private static final int CHUNK_LOAD_BUFFER_SIZE = 8192;
    private static final int DISCONTINUITY_THRESHOLD = 8192;
    public static final long NO_RESET_PENDING = Long.MIN_VALUE;
    private static final int PROFILE_ending = 10;
    private static final int PROFILE_isCached = 8;
    private static final int PROFILE_lock = 5;
    private static final int PROFILE_onBufferEnd = 7;
    private static final int PROFILE_onBufferStarted = 4;
    private static final int PROFILE_onBytesTransferred = 9;
    private static final int PROFILE_onBytesTransferring = 3;
    private static final int PROFILE_onReadContinuity = 1;
    private static final int PROFILE_onReadDiscontinuity = 2;
    private static final int PROFILE_readAt = 6;
    private static final int PROFILE_total = 0;
    private static final int READ_WAIT_TIMEOUT = 30000;
    private static final String TAG = "CacheDataSource";
    private static final String[] profiles = {"total", "onReadContinuity", "onReadDiscontinuity", "onBytesTransferring", "onBufferStarted", "lock", "readAt", "onBufferEnd", "isCached", "onBytesTransferred", "ending"};
    public final IDataSource cacheSource;
    /* access modifiers changed from: private */
    public final DataRangeTracker cachedDataTracker;
    private long[] costs;
    /* access modifiers changed from: private */
    public long currentLoadStartPosition;
    /* access modifiers changed from: private */
    public Chunk currentLoadingChunk;
    /* access modifiers changed from: private */
    public volatile boolean isToReleaseLock;
    /* access modifiers changed from: private */
    public volatile boolean isWaitingForFirstPiece;
    /* access modifiers changed from: private */
    public Listener listener;
    /* access modifiers changed from: private */
    public boolean loadFinished;
    /* access modifiers changed from: private */
    public final Loader loader;
    private LoaderListener loaderListener;
    private long nextContinuousPosition;
    private boolean opened;
    public long pendingRestartPositionByte;
    public long pendingStartPositionByte;
    private TimerTask pendingTask;
    private Timer restartHandler;

    public interface Listener extends TransferListener {
        void onBufferEnded();

        void onBufferStarted(long j);

        long onStreamingError(IOException iOException);

        void onStreamingFinished();

        void onUpStreamTransfer(long j, long j2);
    }

    public class LoaderListener implements Loader.Listener {
        private long loadedPosition;

        private LoaderListener() {
            this.loadedPosition = Long.MIN_VALUE;
        }

        public synchronized void onLoadCancelled(boolean z) {
            Logger.m21791i(CacheDataSource.TAG, "[onLoadCancelled] enter. terminated: " + z);
            if (!z) {
                try {
                    if (!CacheDataSource.this.startLoadingIfNeeded()) {
                        CacheDataSource.this.cachedDataTracker.abandonLock();
                    }
                } catch (IllegalStateException e) {
                    onLoadError(new IOException("failed to start load after cancelling", e));
                    CacheDataSource.this.cachedDataTracker.abandonLock();
                }
            } else {
                CacheDataSource.this.cachedDataTracker.abandonLock();
            }
        }

        public void onLoadCompleted() {
            long unused = CacheDataSource.this.currentLoadStartPosition = Long.MIN_VALUE;
            Chunk unused2 = CacheDataSource.this.currentLoadingChunk = null;
            boolean unused3 = CacheDataSource.this.loadFinished = true;
            CacheDataSource.this.cachedDataTracker.abandonLock();
            if (CacheDataSource.this.listener != null) {
                CacheDataSource.this.listener.onStreamingFinished();
            }
        }

        public void onLoadError(IOException iOException) {
            Logger.m21788e(CacheDataSource.TAG, "[onLoadError] enter.", (Throwable) iOException);
            long j = this.loadedPosition;
            long j2 = j == Long.MIN_VALUE ? 0 : j;
            CacheDataSource cacheDataSource = CacheDataSource.this;
            cacheDataSource.pendingRestartPositionByte = j;
            if (cacheDataSource.listener != null) {
                long onStreamingError = CacheDataSource.this.listener.onStreamingError(iOException);
                if (onStreamingError >= 0) {
                    CacheDataSource.this.scheduleRestart(j2, onStreamingError);
                    CacheDataSource.this.pendingRestartPositionByte = Long.MIN_VALUE;
                    return;
                }
                long unused = CacheDataSource.this.currentLoadStartPosition = Long.MIN_VALUE;
                Chunk unused2 = CacheDataSource.this.currentLoadingChunk = null;
                CacheDataSource.this.cachedDataTracker.abandonLock();
                return;
            }
            long unused3 = CacheDataSource.this.currentLoadStartPosition = Long.MIN_VALUE;
            Chunk unused4 = CacheDataSource.this.currentLoadingChunk = null;
            CacheDataSource.this.cachedDataTracker.abandonLock();
        }

        public void onLoadProgress(long j, long j2) {
            this.loadedPosition = j2;
            CacheDataSource.this.cachedDataTracker.addRange(j, j2, CacheDataSource.this.isWaitingForFirstPiece);
            Loader access$1000 = CacheDataSource.this.loader;
            Listener access$800 = CacheDataSource.this.listener;
            if (access$800 != null && access$1000 != null) {
                CacheDataSource.this.cachedDataTracker.setFileTotalSize(access$1000.getUpstreamSize(), true);
                access$800.onUpStreamTransfer(j2, access$1000.getUpstreamSize());
            }
        }
    }

    public CacheDataSource(final IDataSource iDataSource, IDataSource iDataSource2, final IDataSink iDataSink, final Looper looper) {
        this(iDataSource2, new Loader.Factory() {
            public Loader createLoader(Loader.Listener listener) {
                return new DefaultLoader(looper, new DummyUriLoader((Uri) null), listener) {
                    public IDataSink createCacheSink(StreamingRequest streamingRequest) {
                        return iDataSink;
                    }

                    public IDataSource createUpStream(StreamingRequest streamingRequest) {
                        return iDataSource;
                    }
                };
            }
        });
    }

    private void clearState() {
        this.loadFinished = false;
    }

    private boolean isCached(long j, int i) {
        long upstreamSize = this.loader.getUpstreamSize();
        if (upstreamSize > 0 && ((long) i) + j > upstreamSize - 1 && (i = (int) ((upstreamSize - j) - 1)) < 0) {
            j += (long) i;
            i = 0;
        }
        return this.cachedDataTracker.isCached(j, i);
    }

    private void onReadContinuity(long j) {
    }

    private void onReadDiscontinuity(long j, boolean z) {
        long max;
        long j2 = this.currentLoadStartPosition;
        if (j != j2) {
            long j3 = j - j2;
            if (j3 < 0 || j3 >= 8192) {
                synchronized (this.cachedDataTracker) {
                    max = Math.max(j, this.cachedDataTracker.findStart(j));
                }
                long j4 = this.currentLoadStartPosition;
                if (j4 != max) {
                    long j5 = max - j4;
                    if ((j5 < 0 || j5 >= 8192) && max != getSize()) {
                        Chunk chunk = this.currentLoadingChunk;
                        if (!z || chunk == null || !chunk.contains(max)) {
                            restartLoading(max);
                        }
                    }
                }
            }
        }
    }

    private void reportProfiling() {
    }

    /* access modifiers changed from: private */
    public synchronized void restartLoading(long j) {
        Logger.m21791i(TAG, "[restartLoading] from: " + j);
        this.pendingStartPositionByte = j;
        this.loadFinished = false;
        if (this.loader.isLoading()) {
            this.cachedDataTracker.block();
            this.loader.cancelLoading();
        } else {
            clearState();
            startLoadingIfNeeded();
        }
    }

    /* access modifiers changed from: private */
    public synchronized void scheduleRestart(final long j, long j2) {
        Logger.m21791i(TAG, String.format("[scheduleRestart] position: %d, delay: %d", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        if (this.restartHandler == null) {
            this.restartHandler = new Timer("CacheDataSource.Restart");
        }
        TimerTask timerTask = this.pendingTask;
        if (timerTask != null) {
            timerTask.cancel();
            this.restartHandler.purge();
        }
        C199683 r0 = new TimerTask() {
            public void run() {
                Logger.m21791i(CacheDataSource.TAG, "[scheduleRestart] restart loading from position: " + j);
                CacheDataSource.this.restartLoading(j);
            }
        };
        this.pendingTask = r0;
        this.restartHandler.schedule(r0, j2);
    }

    /* access modifiers changed from: private */
    public synchronized boolean startLoadingIfNeeded() {
        Chunk chunk;
        if (this.loadFinished) {
            return false;
        }
        long j = this.pendingStartPositionByte;
        this.pendingStartPositionByte = Long.MIN_VALUE;
        if (!this.opened) {
            if (j == Long.MIN_VALUE) {
                Logger.m21791i(TAG, "[startLoadingIfNeeded] start a fresh load");
                chunk = new Chunk(8192, 0, -1);
            } else {
                Logger.m21791i(TAG, "[startLoadingIfNeeded] start a pending load: " + j);
                chunk = new Chunk(8192, j, -1);
            }
        } else if (j != Long.MIN_VALUE) {
            Logger.m21791i(TAG, "[startLoadingIfNeeded] restart a pending load: " + j);
            chunk = new Chunk(8192, j, -1);
        } else {
            throw new IllegalStateException("pendingStartPositionByte must be set!");
        }
        this.currentLoadingChunk = chunk;
        this.currentLoadStartPosition = chunk.start;
        this.cachedDataTracker.unblock();
        this.loader.startLoading(chunk);
        return true;
    }

    public void accept(ErrorUploadCollector errorUploadCollector) {
    }

    public void accept(PlayerInfoCollector playerInfoCollector) {
        int i = 1;
        long j = 0;
        for (int i2 = 1; i2 < profiles.length; i2++) {
            j += this.costs[i2];
        }
        long[] jArr = this.costs;
        double length = ((double) (jArr[0] - j)) / ((double) jArr.length);
        int length2 = jArr.length;
        long[] jArr2 = new long[length2];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        for (int i3 = 1; i3 < length2; i3++) {
            jArr2[i3] = Math.max(jArr2[i3] - ((long) length), 0);
        }
        while (true) {
            String[] strArr = profiles;
            if (i < strArr.length) {
                playerInfoCollector.putLong("CacheDataSource." + strArr[i], jArr2[i] / TimeUtil.SECOND_TO_US);
                i++;
            } else {
                return;
            }
        }
    }

    public void close() {
        Logger.m21791i(TAG, "[close] enter.");
        if (!this.opened) {
            Logger.m21791i(TAG, "[close] not opened. return");
            return;
        }
        this.cachedDataTracker.abandonLock();
        try {
            this.loader.shutdown();
        } catch (InterruptedException unused) {
        }
        this.cacheSource.close();
        Listener listener2 = this.listener;
        if (listener2 != null) {
            listener2.onTransferEnd();
        }
        reportProfiling();
        this.opened = false;
        Logger.m21791i(TAG, "[close] exit");
    }

    public synchronized boolean continueLoadIfNeeded() {
        if (!this.opened) {
            Logger.m21793w(TAG, "[continueLoadIfNeeded] not opened!");
            return false;
        }
        long j = this.pendingRestartPositionByte;
        if (j == Long.MIN_VALUE) {
            return false;
        }
        if (this.loadFinished) {
            return false;
        }
        this.pendingRestartPositionByte = Long.MIN_VALUE;
        scheduleRestart(j, 0);
        Logger.m21791i(TAG, "[continueLoadIfNeeded] schedule restart from: " + j);
        return true;
    }

    public AudioFormat.AudioType getAudioType() {
        return FormatDetector.getAudioFormat((IDataSource) this, false);
    }

    public long getBufferTimeout(long j, int i) {
        return 30000;
    }

    public Loader getLoader() {
        return this.loader;
    }

    public long getSize() {
        Loader loader2 = this.loader;
        if (loader2 != null) {
            return loader2.getUpstreamSize();
        }
        return 0;
    }

    public void initDataSourceSize(long j, long j2) {
        LoaderListener loaderListener2 = this.loaderListener;
        if (loaderListener2 != null) {
            loaderListener2.onLoadProgress(j, j2);
        }
    }

    public boolean isCacheFileComplete() {
        long continuousStart = this.cachedDataTracker.getContinuousStart();
        long continuousEnd = this.cachedDataTracker.getContinuousEnd();
        return continuousEnd != -1 && continuousEnd == this.loader.getUpstreamSize() - 1 && continuousStart == 0;
    }

    public void open() {
        Logger.m21791i(TAG, "[open] enter.");
        if (!this.opened) {
            this.nextContinuousPosition = 0;
            this.pendingRestartPositionByte = Long.MIN_VALUE;
            this.cacheSource.open();
            this.loader.prepare();
            startLoadingIfNeeded();
            Listener listener2 = this.listener;
            if (listener2 != null) {
                listener2.onTransferStart();
            }
            this.opened = true;
            Logger.m21791i(TAG, "[open] opened = true;");
            Logger.m21791i(TAG, "[open] exit");
        }
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        long j2 = j;
        int i3 = i2;
        try {
            if (!this.opened) {
                Logger.m21787e(TAG, "[readAt] not opened!");
                this.cachedDataTracker.abandonLock();
                throw new IOException("[readAt] not opened!");
            } else if (j2 >= 0) {
                boolean isCached = isCached(j, i3);
                if (j2 == this.nextContinuousPosition) {
                    onReadContinuity(j);
                } else {
                    onReadDiscontinuity(j, isCached);
                }
                Listener listener2 = this.listener;
                if (listener2 != null) {
                    listener2.onBytesTransferring(j, (long) i3);
                }
                int readAt = isCached ? this.cacheSource.readAt(j, bArr, i, i2) : -1;
                if (readAt < 0) {
                    if (!this.loader.isLoading()) {
                        readAt = this.cacheSource.readAt(j, bArr, i, i2);
                        Logger.m21787e(TAG, "[readAt] load not started: " + j + ", size: " + i3 + ", read: " + readAt);
                    } else {
                        Logger.m21793w(TAG, "[readAt] load has started, lock util data has been downloaded : " + j + ", size: " + i3 + ", read: " + readAt);
                        Listener listener3 = this.listener;
                        if (listener3 != null) {
                            listener3.onBufferStarted(j);
                        }
                        this.cachedDataTracker.lock(j, i2, getBufferTimeout(j, i3), new DataRangeTracker.LockJudgerCallback() {
                            public boolean isToAbandonLock() {
                                return CacheDataSource.this.isToReleaseLock;
                            }
                        });
                        Listener listener4 = this.listener;
                        if (listener4 != null) {
                            listener4.onBufferEnded();
                        }
                        readAt = this.cacheSource.readAt(j, bArr, i, i2);
                    }
                }
                int i4 = readAt;
                boolean z = false;
                if (i4 > 0) {
                    this.nextContinuousPosition = ((long) i4) + j2;
                } else if (i4 < 0) {
                    Logger.m21787e(TAG, "[readAt]: read error! read < 0， read = " + i4);
                    z = true;
                } else {
                    if (i3 != 0) {
                        z = true;
                    }
                    Logger.m21787e(TAG, "[readAt]: read error! read = 0, hasError = " + z);
                }
                Listener listener5 = this.listener;
                if (listener5 != null) {
                    if (z) {
                        listener5.onBytesTransferError(j, (long) i3, (long) i4);
                    } else {
                        listener5.onBytesTransferred(j, (long) i4);
                    }
                }
                return i4;
            } else {
                Logger.m21787e(TAG, "[readAt] invalid position: " + j);
                throw new IOException("invalid position: " + j);
            }
        } catch (InterruptedException e) {
            throw new IOException("interrupted!", e);
        } catch (Throwable th) {
            Logger.m21788e(TAG, "[readAt] error occurred: " + j, th);
            throw th;
        }
    }

    public void releaseLock() {
        Logger.m21791i(TAG, "[releaseLock]");
        this.isToReleaseLock = true;
    }

    public void setFileTotalSize(long j) {
        this.cachedDataTracker.setFileTotalSize(j, false);
    }

    public void setListener(Listener listener2) {
        this.listener = listener2;
    }

    public boolean waitForFirstPiece(int i, long j) {
        this.isWaitingForFirstPiece = true;
        boolean lock = this.cachedDataTracker.lock(0, i, j, (DataRangeTracker.LockJudgerCallback) null);
        this.isWaitingForFirstPiece = false;
        return lock;
    }

    public CacheDataSource(IDataSource iDataSource, Loader.Factory factory) {
        this.currentLoadStartPosition = Long.MIN_VALUE;
        this.loaderListener = null;
        this.isWaitingForFirstPiece = false;
        this.costs = new long[profiles.length];
        this.isToReleaseLock = false;
        this.cacheSource = iDataSource;
        this.cachedDataTracker = new DataRangeTracker();
        this.opened = false;
        this.loadFinished = false;
        LoaderListener loaderListener2 = new LoaderListener();
        this.loaderListener = loaderListener2;
        this.loader = factory.createLoader(loaderListener2);
    }

    public static class Factory {
        private static Loader.Factory createDefaultLoaderFactory(final File file, final UriLoader uriLoader) {
            return new Loader.Factory() {
                public Loader createLoader(Loader.Listener listener) {
                    return new DefaultLoader(Looper.getMainLooper(), uriLoader, listener) {
                        public IDataSink createCacheSink(StreamingRequest streamingRequest) {
                            return new FileDataSink(file.getAbsolutePath());
                        }

                        public IDataSource createUpStream(StreamingRequest streamingRequest) {
                            return new HttpDataSource(streamingRequest.uri, streamingRequest.headers, new DefaultMediaHTTPService());
                        }
                    };
                }
            };
        }

        public static CacheDataSource createFromLoader(File file, Loader.Factory factory) {
            return new CacheDataSource(new FileDataSource(file.getAbsolutePath()), factory);
        }

        public static CacheDataSource createFromUri(File file, Uri uri) {
            return createFromUriLoader(file, (UriLoader) new DummyUriLoader(uri));
        }

        public static CacheDataSource createFromUriLoader(UriLoader uriLoader, String str) {
            final File file;
            if (str != null) {
                try {
                    if (!str.isEmpty()) {
                        file = File.createTempFile("mediaHttpCommonPlayer", "tmp", new File(str));
                        ensureFile(file);
                        return new CacheDataSource(new FileDataSource(file.getAbsolutePath()) {
                            public void close() {
                                try {
                                    super.close();
                                } catch (IOException unused) {
                                }
                                if (!file.delete()) {
                                    Logger.m21793w(CacheDataSource.TAG, "failed to delete buffer file: " + file);
                                }
                            }
                        }, createDefaultLoaderFactory(file, uriLoader));
                    }
                } catch (IOException e) {
                    throw new DataSourceException(-8, "failed to ensure buffer file!", e);
                }
            }
            file = File.createTempFile("mediaHttpCommonPlayer", "tmp");
            ensureFile(file);
            return new CacheDataSource(new FileDataSource(file.getAbsolutePath()) {
                public void close() {
                    try {
                        super.close();
                    } catch (IOException unused) {
                    }
                    if (!file.delete()) {
                        Logger.m21793w(CacheDataSource.TAG, "failed to delete buffer file: " + file);
                    }
                }
            }, createDefaultLoaderFactory(file, uriLoader));
        }

        private static void ensureFile(File file) {
            file.delete();
            if (!file.createNewFile()) {
                throw new IOException("failed to create file!");
            }
        }

        public static CacheDataSource createFromUriLoader(File file, UriLoader uriLoader) {
            return new CacheDataSource(new FileDataSource(file.getAbsolutePath()), createDefaultLoaderFactory(file, uriLoader));
        }
    }
}
