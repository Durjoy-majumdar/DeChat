package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;

/* renamed from: com.tencent.mapsdk.internal.ly */
public final class C55067ly {

    /* renamed from: a */
    private static final int f154619a = 7;

    /* renamed from: b */
    private static Canvas f154620b = new Canvas(f154622d[1]);

    /* renamed from: c */
    private static int f154621c = 1;

    /* renamed from: d */
    private static Bitmap[] f154622d;

    /* renamed from: e */
    private static Bitmap f154623e = null;

    static {
        Bitmap[] bitmapArr = new Bitmap[7];
        f154622d = bitmapArr;
        bitmapArr[0] = Bitmap.createBitmap(64, 32, Bitmap.Config.ARGB_8888);
        f154622d[1] = Bitmap.createBitmap(128, 32, Bitmap.Config.ARGB_8888);
        f154622d[2] = Bitmap.createBitmap(128, 64, Bitmap.Config.ARGB_8888);
        f154622d[3] = Bitmap.createBitmap(256, 32, Bitmap.Config.ARGB_8888);
        f154622d[4] = Bitmap.createBitmap(256, 128, Bitmap.Config.ARGB_8888);
        f154622d[5] = Bitmap.createBitmap(32, 128, Bitmap.Config.ARGB_8888);
        f154622d[6] = Bitmap.createBitmap(32, 256, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: a */
    private static Canvas m62182a(float f, float f2) {
        int i = 0;
        while (i < 7 && (((float) f154622d[i].getWidth()) < f || ((float) f154622d[i].getHeight()) < f2)) {
            i++;
        }
        if (i < 7) {
            f154621c = i;
            f154620b.setBitmap(f154622d[i]);
            f154622d[i].eraseColor(0);
            return f154620b;
        }
        f154621c = f154622d.length;
        int i2 = 1;
        int i3 = 1;
        while (((float) i3) < f) {
            i3 <<= 1;
        }
        while (((float) i2) < f2) {
            i2 <<= 1;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        f154623e = createBitmap;
        f154620b.setBitmap(createBitmap);
        f154623e.eraseColor(0);
        return f154620b;
    }

    /* renamed from: b */
    private static Bitmap m62185b() {
        int i = f154621c;
        return i < 7 ? f154622d[i] : f154623e;
    }

    /* renamed from: a */
    private static void m62184a(float f, float f2, Point point) {
        int i = 0;
        while (i < 7) {
            if (((float) f154622d[i].getWidth()) < f || ((float) f154622d[i].getHeight()) < f2) {
                i++;
            } else {
                point.set(f154622d[i].getWidth(), f154622d[i].getHeight());
                return;
            }
        }
        int i2 = 1;
        int i3 = 1;
        while (((float) i3) < f) {
            i3 <<= 1;
        }
        while (((float) i2) < f2) {
            i2 <<= 1;
        }
        point.set(i3, i2);
    }

    /* renamed from: a */
    private static void m62183a() {
        Bitmap bitmap = f154623e;
        if (bitmap != null) {
            bitmap.recycle();
            f154623e = null;
        }
    }
}
