package com.davemorrissey.labs.subscaleview.decoder;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;

public class SkiaPooledImageRegionDecoder implements ImageRegionDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private static final String TAG = "SkiaPooledImageRegionDecoder";
    private static boolean debug;
    private final Bitmap.Config bitmapConfig;
    private Context context;
    private final ReadWriteLock decoderLock;
    /* access modifiers changed from: private */
    public DecoderPool decoderPool;
    /* access modifiers changed from: private */
    public long fileLength;
    private Point imageDimensions;
    private final AtomicBoolean lazyInited;
    private Uri uri;

    public static class DecoderPool {
        private final Semaphore available;
        private Map<BitmapRegionDecoder, Boolean> decoders;

        private DecoderPool() {
            this.available = new Semaphore(0, true);
            this.decoders = new ConcurrentHashMap();
        }

        /* access modifiers changed from: private */
        public BitmapRegionDecoder acquire() {
            this.available.acquireUninterruptibly();
            return getNextAvailable();
        }

        /* access modifiers changed from: private */
        public synchronized void add(BitmapRegionDecoder bitmapRegionDecoder) {
            this.decoders.put(bitmapRegionDecoder, Boolean.FALSE);
            this.available.release();
        }

        private synchronized BitmapRegionDecoder getNextAvailable() {
            for (Map.Entry next : this.decoders.entrySet()) {
                if (!((Boolean) next.getValue()).booleanValue()) {
                    next.setValue(Boolean.TRUE);
                    return (BitmapRegionDecoder) next.getKey();
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public synchronized boolean isEmpty() {
            return this.decoders.isEmpty();
        }

        private synchronized boolean markAsUnused(BitmapRegionDecoder bitmapRegionDecoder) {
            for (Map.Entry next : this.decoders.entrySet()) {
                if (bitmapRegionDecoder == next.getKey()) {
                    if (!((Boolean) next.getValue()).booleanValue()) {
                        return false;
                    }
                    next.setValue(Boolean.FALSE);
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public synchronized void recycle() {
            while (!this.decoders.isEmpty()) {
                BitmapRegionDecoder acquire = acquire();
                acquire.recycle();
                this.decoders.remove(acquire);
            }
        }

        /* access modifiers changed from: private */
        public void release(BitmapRegionDecoder bitmapRegionDecoder) {
            if (markAsUnused(bitmapRegionDecoder)) {
                this.available.release();
            }
        }

        /* access modifiers changed from: private */
        public synchronized int size() {
            return this.decoders.size();
        }
    }

    public SkiaPooledImageRegionDecoder() {
        this((Bitmap.Config) null);
    }

    /* access modifiers changed from: private */
    public void debug(String str) {
    }

    private int getNumCoresOldPhones() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {
                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]+", file.getName());
                }
            }).length;
        } catch (Exception unused) {
            return 1;
        }
    }

    private int getNumberOfCores() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* access modifiers changed from: private */
    public void initialiseDecoder() {
        BitmapRegionDecoder bitmapRegionDecoder;
        C86001b0 q;
        int i;
        boolean equals = RESOURCE_PREFIX.equals(this.uri.getScheme());
        long j = MAlarmHandler.NEXT_FIRE_INTERVAL;
        if (equals) {
            String authority = this.uri.getAuthority();
            Resources resources = this.context.getPackageName().equals(authority) ? this.context.getResources() : this.context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = this.uri.getPathSegments();
            int size = pathSegments.size();
            if (size != 2 || !pathSegments.get(0).equals("drawable")) {
                if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    try {
                        i = Util.getInt(pathSegments.get(0), 0);
                    } catch (NumberFormatException unused) {
                    }
                }
                i = 0;
            } else {
                i = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            }
            try {
                j = this.context.getResources().openRawResourceFd(i).getLength();
            } catch (Exception unused2) {
            }
            bitmapRegionDecoder = BitmapRegionDecoder.newInstance(this.context.getResources().openRawResource(i), false);
        } else {
            Uri uri2 = this.uri;
            String path = uri2.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!uri2.getPath().equals(k)) {
                    uri2 = uri2.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(uri2, (C116281f0.C116288h) null);
            long j2 = (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) ? q.f250473c : 0;
            if (j2 != 0) {
                j = j2;
            }
            InputStream C = C86013q1.m106421C(this.uri, (C116281f0.C116288h) null);
            try {
                BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(C, false);
                if (C != null) {
                    C.close();
                }
                bitmapRegionDecoder = newInstance;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        this.fileLength = j;
        this.imageDimensions.set(bitmapRegionDecoder.getWidth(), bitmapRegionDecoder.getHeight());
        this.decoderLock.writeLock().lock();
        try {
            DecoderPool decoderPool2 = this.decoderPool;
            if (decoderPool2 != null) {
                decoderPool2.add(bitmapRegionDecoder);
            }
            return;
        } finally {
            this.decoderLock.writeLock().unlock();
        }
        throw th;
    }

    private boolean isLowMemory() {
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null) {
            return true;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    private void lazyInit() {
        if (this.lazyInited.compareAndSet(false, true) && this.fileLength < MAlarmHandler.NEXT_FIRE_INTERVAL) {
            debug("Starting lazy newInstance of additional decoders");
            new Thread() {
                public void run() {
                    while (SkiaPooledImageRegionDecoder.this.decoderPool != null) {
                        SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = SkiaPooledImageRegionDecoder.this;
                        if (skiaPooledImageRegionDecoder.allowAdditionalDecoder(skiaPooledImageRegionDecoder.decoderPool.size(), SkiaPooledImageRegionDecoder.this.fileLength)) {
                            try {
                                if (SkiaPooledImageRegionDecoder.this.decoderPool != null) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    SkiaPooledImageRegionDecoder.this.debug("Starting decoder");
                                    SkiaPooledImageRegionDecoder.this.initialiseDecoder();
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder2 = SkiaPooledImageRegionDecoder.this;
                                    skiaPooledImageRegionDecoder2.debug("Started decoder, took " + (currentTimeMillis2 - currentTimeMillis) + LocaleUtil.MALAY);
                                }
                            } catch (Exception e) {
                                SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder3 = SkiaPooledImageRegionDecoder.this;
                                skiaPooledImageRegionDecoder3.debug("Failed to start decoder: " + e.getMessage());
                            }
                        } else {
                            return;
                        }
                    }
                }
            }.start();
        }
    }

    public static void setDebug(boolean z) {
        debug = z;
    }

    public boolean allowAdditionalDecoder(int i, long j) {
        if (i >= 4) {
            debug("No additional decoders allowed, reached hard limit (4)");
            return false;
        }
        long j2 = ((long) i) * j;
        if (j2 > 20971520) {
            debug("No additional encoders allowed, reached hard memory limit (20Mb)");
            return false;
        } else if (i >= getNumberOfCores()) {
            debug("No additional encoders allowed, limited by CPU cores (" + getNumberOfCores() + ")");
            return false;
        } else if (isLowMemory()) {
            debug("No additional encoders allowed, memory is low");
            return false;
        } else {
            debug("Additional decoder allowed, current count is " + i + ", estimated native memory " + (j2 / 1048576) + "Mb");
            return true;
        }
    }

    public Bitmap decodeRegion(Rect rect, int i) {
        BitmapRegionDecoder access$700;
        debug("Decode region " + rect + " on thread " + Thread.currentThread().getName());
        if (rect.width() < this.imageDimensions.x || rect.height() < this.imageDimensions.y) {
            lazyInit();
        }
        this.decoderLock.readLock().lock();
        try {
            DecoderPool decoderPool2 = this.decoderPool;
            if (decoderPool2 != null) {
                access$700 = decoderPool2.acquire();
                if (access$700 != null) {
                    if (!access$700.isRecycled()) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = i;
                        options.inPreferredConfig = this.bitmapConfig;
                        Bitmap decodeRegion = access$700.decodeRegion(rect, options);
                        if (decodeRegion != null) {
                            this.decoderPool.release(access$700);
                            this.decoderLock.readLock().unlock();
                            return decodeRegion;
                        }
                        throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                    }
                }
                if (access$700 != null) {
                    this.decoderPool.release(access$700);
                }
            }
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        } catch (Throwable th) {
            this.decoderLock.readLock().unlock();
            throw th;
        }
    }

    public Point init(Context context2, Uri uri2) {
        this.context = context2;
        this.uri = uri2;
        initialiseDecoder();
        return this.imageDimensions;
    }

    public synchronized boolean isReady() {
        DecoderPool decoderPool2;
        decoderPool2 = this.decoderPool;
        return decoderPool2 != null && !decoderPool2.isEmpty();
    }

    public synchronized void recycle() {
        this.decoderLock.writeLock().lock();
        try {
            DecoderPool decoderPool2 = this.decoderPool;
            if (decoderPool2 != null) {
                decoderPool2.recycle();
                this.decoderPool = null;
                this.context = null;
                this.uri = null;
            }
        } finally {
            this.decoderLock.writeLock().unlock();
        }
    }

    public SkiaPooledImageRegionDecoder(Bitmap.Config config) {
        this.decoderPool = new DecoderPool();
        this.decoderLock = new ReentrantReadWriteLock(true);
        this.fileLength = MAlarmHandler.NEXT_FIRE_INTERVAL;
        this.imageDimensions = new Point(0, 0);
        this.lazyInited = new AtomicBoolean(false);
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.bitmapConfig = config;
        } else if (preferredBitmapConfig != null) {
            this.bitmapConfig = preferredBitmapConfig;
        } else {
            this.bitmapConfig = Bitmap.Config.RGB_565;
        }
    }
}
