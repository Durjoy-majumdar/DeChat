package com.davemorrissey.labs.subscaleview.decoder;

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
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SkiaImageRegionDecoder implements ImageRegionDecoder {
    private static final String RESOURCE_PREFIX = "android.resource://";
    private final Bitmap.Config bitmapConfig;
    private BitmapRegionDecoder decoder;
    private final ReadWriteLock decoderLock;

    public SkiaImageRegionDecoder() {
        this((Bitmap.Config) null);
    }

    private Lock getDecodeLock() {
        return this.decoderLock.readLock();
    }

    public Bitmap decodeRegion(Rect rect, int i) {
        getDecodeLock().lock();
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.decoder;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i;
            options.inPreferredConfig = this.bitmapConfig;
            Bitmap decodeRegion = this.decoder.decodeRegion(rect, options);
            if (decodeRegion != null) {
                return decodeRegion;
            }
            throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
        } finally {
            getDecodeLock().unlock();
        }
    }

    public Point init(Context context, Uri uri) {
        int i;
        if (uri.toString().startsWith(RESOURCE_PREFIX)) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
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
            this.decoder = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(i), false);
        } else {
            InputStream C = C86013q1.m106421C(uri, (C116281f0.C116288h) null);
            try {
                this.decoder = BitmapRegionDecoder.newInstance(C, false);
                if (C != null) {
                    C.close();
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return new Point(this.decoder.getWidth(), this.decoder.getHeight());
        throw th;
    }

    public synchronized boolean isReady() {
        BitmapRegionDecoder bitmapRegionDecoder;
        bitmapRegionDecoder = this.decoder;
        return bitmapRegionDecoder != null && !bitmapRegionDecoder.isRecycled();
    }

    public synchronized void recycle() {
        this.decoderLock.writeLock().lock();
        try {
            this.decoder.recycle();
            this.decoder = null;
        } finally {
            this.decoderLock.writeLock().unlock();
        }
    }

    public SkiaImageRegionDecoder(Bitmap.Config config) {
        this.decoderLock = new ReentrantReadWriteLock(true);
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
