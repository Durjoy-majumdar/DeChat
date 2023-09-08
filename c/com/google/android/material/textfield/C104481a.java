package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* renamed from: com.google.android.material.textfield.a */
public class C104481a extends GradientDrawable {

    /* renamed from: a */
    public final Paint f309613a;

    /* renamed from: b */
    public final RectF f309614b = new RectF();

    /* renamed from: c */
    public int f309615c;

    public C104481a() {
        Paint paint = new Paint(1);
        this.f309613a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: a */
    public void mo147051a(float f, float f2, float f3, float f4) {
        RectF rectF = this.f309614b;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ((View) callback).setLayerType(2, (Paint) null);
        } else {
            this.f309615c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        }
        super.draw(canvas);
        canvas.drawRect(this.f309614b, this.f309613a);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.f309615c);
        }
    }
}
