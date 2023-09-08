package com.github.henryye.nativeiv;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SystemClock;
import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import java.io.InputStream;
import p1024q6.C89484c;
import p673r6.C89876b;

public class LegacyBitmap implements IBitmap<Bitmap> {

    /* renamed from: a */
    public Bitmap f234720a = null;

    /* renamed from: b */
    public long f234721b = -1;

    /* renamed from: a */
    public Bitmap mo111021a(InputStream inputStream, ImageDecodeConfig imageDecodeConfig, C89484c cVar) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = imageDecodeConfig.mConfig;
        options.inPremultiplied = imageDecodeConfig.mPremultiplyAlpha;
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        if (decodeStream == null || decodeStream.getConfig() == Bitmap.Config.ARGB_8888) {
            return decodeStream;
        }
        C89876b.f258326a.mo123906w("Ni.LegacyBitmap", "hy: config not argb-8888", new Object[0]);
        Bitmap createBitmap = Bitmap.createBitmap(decodeStream.getWidth(), decodeStream.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(decodeStream, 0.0f, 0.0f, (Paint) null);
        decodeStream.recycle();
        return createBitmap;
    }

    public void decodeInputStream(InputStream inputStream, ImageDecodeConfig imageDecodeConfig, C89484c cVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f234720a = mo111021a(inputStream, imageDecodeConfig, cVar);
        this.f234721b = SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    public long getDecodeTime() {
        return this.f234721b;
    }

    public BitmapType getType() {
        return BitmapType.Legacy;
    }

    public void recycle() {
        Bitmap bitmap = this.f234720a;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public Bitmap provide() {
        return this.f234720a;
    }
}
