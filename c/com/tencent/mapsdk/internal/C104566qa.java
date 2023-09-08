package com.tencent.mapsdk.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: com.tencent.mapsdk.internal.qa */
public final class C104566qa extends Drawable {

    /* renamed from: a */
    private static final int f309963a = -12028419;

    /* renamed from: b */
    private Paint f309964b;

    public C104566qa() {
        Paint paint = new Paint();
        this.f309964b = paint;
        paint.setAntiAlias(true);
        if (C114207sl.f341931c.equals("wechat")) {
            this.f309964b.setColor(-16531104);
        } else {
            this.f309964b.setColor(f309963a);
        }
    }

    /* renamed from: a */
    private void m140076a(int i) {
        this.f309964b.setColor(i);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        canvas.drawCircle(((float) getBounds().width()) / 2.0f, ((float) getBounds().height()) / 2.0f, ((float) getBounds().width()) / 2.0f, this.f309964b);
    }

    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f309964b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f309964b.setColorFilter(colorFilter);
    }
}
