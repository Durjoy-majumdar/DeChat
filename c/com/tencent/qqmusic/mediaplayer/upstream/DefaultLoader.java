package com.tencent.qqmusic.mediaplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.qqmusic.mediaplayer.downstream.IDataSink;
import com.tencent.qqmusic.mediaplayer.upstream.Loader;
import com.tencent.qqmusic.mediaplayer.upstream.UriLoader;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public abstract class DefaultLoader extends Thread implements Loader {
    private static final int MSG_LOAD_CANCELLED = 5;
    private static final int MSG_LOAD_COMPLETED = 3;
    private static final int MSG_LOAD_ERROR = 4;
    private static final int MSG_LOAD_PROGRESS = 2;
    private static final int MSG_LOAD_STARTED = 1;
    private static final int SIZE_UNSET = -1;
    private static final String TAG = "DefaultLoader";
    private final Chunk END_OF_QUEUE = new Chunk(0, 0, 0);
    /* access modifiers changed from: private */
    public IDataSink cacheSink;
    private volatile boolean cancelled = false;
    private final BlockingQueue<Chunk> chunks;
    /* access modifiers changed from: private */
    public final Handler eventHandler;
    /* access modifiers changed from: private */
    public volatile boolean isLoading = false;
    /* access modifiers changed from: private */
    public volatile boolean shutdown;
    /* access modifiers changed from: private */
    public IDataSource upstream;
    /* access modifiers changed from: private */
    public long upstreamSize = -1;
    private final UriLoader uriLoader;

    public DefaultLoader(Looper looper, UriLoader uriLoader2, final Loader.Listener listener) {
        this.uriLoader = uriLoader2;
        this.eventHandler = new Handler(looper, new Handler.Callback() {
            public boolean handleMessage(Message message) {
                Loader.Listener listener = listener;
                if (listener == null) {
                    return false;
                }
                if (message.what != 2) {
                    boolean unused = DefaultLoader.this.isLoading = false;
                    Logger.m21791i(DefaultLoader.TAG, "[handleMessage] loading = false");
                    int i = message.what;
                    if (i == 3) {
                        listener.onLoadCompleted();
                        return true;
                    } else if (i == 4) {
                        listener.onLoadError((IOException) message.obj);
                        return true;
                    } else if (i != 5) {
                        return false;
                    } else {
                        listener.onLoadCancelled(DefaultLoader.this.shutdown);
                        return true;
                    }
                } else {
                    listener.onLoadProgress((long) message.arg1, (long) message.arg2);
                    return true;
                }
            }
        });
        this.chunks = new LinkedBlockingQueue(1);
    }

    private boolean loadChunk(Chunk chunk) {
        Chunk chunk2 = chunk;
        if (this.upstream == null || this.cacheSink == null) {
            throw new IllegalStateException("loader must be prepared first!");
        }
        long j = chunk2.start;
        long j2 = chunk2.size;
        Logger.m21786d(TAG, "[loadChunk] enter. startPosition: " + j + ", chunkSize: " + j2);
        int i = chunk2.bufferSize;
        byte[] bArr = new byte[i];
        boolean z = j2 == -1;
        if (!z) {
            i = (int) Math.min((long) i, j2);
        }
        long j3 = 0;
        boolean z2 = false;
        while (true) {
            long j4 = j + j3;
            try {
                int readAt = this.upstream.readAt(j4, bArr, 0, i);
                if (readAt == -1) {
                    Logger.m21791i(TAG, "[loadChunk] read EOF.");
                    break;
                } else if (readAt == 0) {
                    Logger.m21786d(TAG, "[loadChunk] read none.");
                    break;
                } else if (readAt >= 0) {
                    try {
                        j3 += (long) readAt;
                        this.eventHandler.removeMessages(2);
                        this.eventHandler.obtainMessage(2, (int) j, (int) ((j4 + ((long) this.cacheSink.write(j4, bArr, 0, readAt))) - 1)).sendToTarget();
                        z2 = this.cancelled || this.shutdown;
                        if (z2 || (!z && j3 >= j2)) {
                            break;
                        }
                    } catch (IOException e) {
                        throw new IOException(new SinkWriteException(e));
                    }
                } else {
                    throw new IOException(new SourceReadException("read error: " + readAt, ""));
                }
            } catch (IOException e2) {
                throw new IOException(new SourceReadException(e2, ""));
            }
        }
        Logger.m21786d(TAG, "[loadChunk] exit. startPosition: " + j + ", loadedBytes: " + j3 + ", this.cancelled: " + this.cancelled + ", shutdown: " + this.shutdown);
        return !z2;
    }

    public void cancelLoading() {
        Logger.m21791i(TAG, "[cancelLoading] cancel");
        this.uriLoader.cancelLoading();
        this.cancelled = true;
    }

    public abstract IDataSink createCacheSink(StreamingRequest streamingRequest);

    public abstract IDataSource createUpStream(StreamingRequest streamingRequest);

    public long getUpstreamSize() {
        return this.upstreamSize;
    }

    public boolean isLoading() {
        if (this.uriLoader.isLoading()) {
            return true;
        }
        return this.isLoading && !this.shutdown;
    }

    public void prepare() {
        IDataSource iDataSource = this.upstream;
        if (iDataSource != null) {
            iDataSource.close();
        }
        IDataSink iDataSink = this.cacheSink;
        if (iDataSink != null) {
            iDataSink.close();
        }
    }

    public void run() {
        while (true) {
            if (this.shutdown) {
                break;
            }
            try {
                Chunk take = this.chunks.take();
                if (this.END_OF_QUEUE == take) {
                    Logger.m21791i(TAG, "[run] end of queue!");
                    break;
                }
                try {
                    if (loadChunk(take)) {
                        this.eventHandler.obtainMessage(3).sendToTarget();
                    } else {
                        this.eventHandler.obtainMessage(5).sendToTarget();
                    }
                } catch (IOException e) {
                    Logger.m21788e(TAG, "[run] got error!", (Throwable) e);
                    this.eventHandler.obtainMessage(4, e).sendToTarget();
                }
            } catch (InterruptedException unused) {
                Logger.m21793w(TAG, "[run] interrupted when taking chunk");
            }
        }
        Logger.m21791i(TAG, "[run] exit. this.cancelled: " + this.cancelled + ", shutdown: " + this.shutdown);
        try {
            IDataSource iDataSource = this.upstream;
            if (iDataSource != null) {
                iDataSource.close();
            }
        } catch (IOException unused2) {
            Logger.m21793w(TAG, "[shutdown] failed to close upstream");
        }
        try {
            IDataSink iDataSink = this.cacheSink;
            if (iDataSink != null) {
                iDataSink.close();
            }
        } catch (IOException unused3) {
            Logger.m21793w(TAG, "[shutdown] failed to close cacheSink");
        }
    }

    public void shutdown() {
        Logger.m21791i(TAG, "[shutdown] enter");
        this.shutdown = true;
        this.chunks.offer(this.END_OF_QUEUE);
        cancelLoading();
        Logger.m21791i(TAG, "[shutdown] exit");
    }

    public void startLoading(Chunk chunk) {
        Logger.m21791i(TAG, "[startLoading] chunk: " + chunk);
        this.chunks.clear();
        if (this.chunks.offer(chunk)) {
            this.isLoading = true;
            Logger.m21791i(TAG, "[handleMessage] loading = true");
            this.cancelled = false;
            if (getState() == Thread.State.NEW) {
                this.uriLoader.startLoading(0, TimeUnit.MILLISECONDS, new UriLoader.Callback() {
                    public void onCancelled() {
                        DefaultLoader.this.eventHandler.obtainMessage(5).sendToTarget();
                    }

                    public void onFailed(Throwable th) {
                        DefaultLoader.this.eventHandler.obtainMessage(4, new IOException("failed to load uri", th)).sendToTarget();
                    }

                    public void onSucceed(StreamingRequest streamingRequest) {
                        Logger.m21791i(DefaultLoader.TAG, "[startLoading] uriLoader.startLoading onSucceed");
                        IDataSource createUpStream = DefaultLoader.this.createUpStream(streamingRequest);
                        try {
                            createUpStream.open();
                            long unused = DefaultLoader.this.upstreamSize = createUpStream.getSize();
                        } catch (IOException e) {
                            DefaultLoader.this.eventHandler.obtainMessage(4, e).sendToTarget();
                        }
                        IDataSink createCacheSink = DefaultLoader.this.createCacheSink(streamingRequest);
                        try {
                            createCacheSink.open();
                        } catch (IOException e2) {
                            DefaultLoader.this.eventHandler.obtainMessage(4, e2).sendToTarget();
                        }
                        IDataSink unused2 = DefaultLoader.this.cacheSink = createCacheSink;
                        IDataSource unused3 = DefaultLoader.this.upstream = createUpStream;
                        DefaultLoader.this.start();
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("exceeds maximum of queue!");
    }
}
