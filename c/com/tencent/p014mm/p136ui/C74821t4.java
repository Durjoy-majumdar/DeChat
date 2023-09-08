package com.tencent.p014mm.p136ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.tencent.mm.ui.t4 */
public class C74821t4 {
    /* renamed from: a */
    public static Bitmap m89550a(Bitmap bitmap, boolean z, float f, boolean z2) {
        Bitmap bitmap2;
        if (bitmap == null || bitmap.isRecycled()) {
            C85975v4.m106305b("WeUIBitmapUtil", "getRoundedCornerBitmap in bitmap is null", new Object[0]);
            return null;
        }
        try {
            bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        } catch (Throwable unused) {
            bitmap2 = null;
        }
        if (bitmap2 == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-4144960);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (z) {
            C85975v4.m106306c("WeUIBitmapUtil", "getRoundedCornerBitmap bitmap recycle %s", bitmap);
            bitmap.recycle();
        }
        return bitmap2;
    }
}
