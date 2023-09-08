package com.tencent.mapsdk.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: com.tencent.mapsdk.internal.py */
public final class C104564py extends Drawable {

    /* renamed from: c */
    private static final int f309956c = -2829100;

    /* renamed from: d */
    private static final int f309957d = -10066330;

    /* renamed from: e */
    private static final int f309958e = 16777215;

    /* renamed from: a */
    public boolean f309959a = false;

    /* renamed from: b */
    public boolean f309960b;

    /* renamed from: f */
    private Paint f309961f;

    public C104564py() {
        Paint paint = new Paint();
        this.f309961f = paint;
        paint.setAntiAlias(true);
        this.f309961f.setStrokeJoin(Paint.Join.BEVEL);
    }

    /* renamed from: b */
    private void m140074b(boolean z) {
        this.f309960b = z;
    }

    /* renamed from: a */
    public final void mo147888a(float f) {
        this.f309961f.setStrokeWidth(f);
    }

    public final void draw(Canvas canvas) {
        if (this.f309959a) {
            this.f309961f.setColor(this.f309960b ? f309957d : f309956c);
        } else {
            this.f309961f.setColor(f309958e);
        }
        canvas.drawLines(new float[]{0.0f, (float) getBounds().height(), ((float) getBounds().width()) / 2.0f, 0.0f, ((float) getBounds().width()) / 2.0f, 0.0f, (float) getBounds().width(), (float) getBounds().height()}, this.f309961f);
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
        this.f309961f.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f309961f.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    private void m140073a(boolean z) {
        this.f309959a = z;
    }
}
