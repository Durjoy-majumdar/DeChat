package com.tencent.p014mm.plugin.game.commlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import s10.C77600a;

/* renamed from: com.tencent.mm.plugin.game.commlib.view.FixAspectRatioImageView */
public class FixAspectRatioImageView extends AppCompatImageView {

    /* renamed from: f */
    public int f198321f;

    /* renamed from: g */
    public int f198322g;

    /* renamed from: h */
    public float f198323h = 0.0f;

    /* renamed from: i */
    public int f198324i = 0;

    /* renamed from: j */
    public int f198325j = 0;

    /* renamed from: n */
    public int f198326n = 0;

    /* renamed from: o */
    public int f198327o = 0;

    /* renamed from: p */
    public int f198328p = 0;

    public FixAspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo94997p(context, attributeSet, 0);
    }

    public void onDraw(Canvas canvas) {
        int max = Math.max(this.f198325j, this.f198327o) + Math.max(this.f198326n, this.f198328p);
        int max2 = Math.max(this.f198325j, this.f198326n) + Math.max(this.f198327o, this.f198328p);
        if (this.f198321f >= max && this.f198322g >= max2) {
            Path path = new Path();
            path.moveTo((float) this.f198325j, 0.0f);
            path.lineTo((float) (this.f198321f - this.f198326n), 0.0f);
            int i = this.f198321f;
            path.quadTo((float) i, 0.0f, (float) i, (float) this.f198326n);
            path.lineTo((float) this.f198321f, (float) (this.f198322g - this.f198328p));
            int i2 = this.f198321f;
            int i3 = this.f198322g;
            path.quadTo((float) i2, (float) i3, (float) (i2 - this.f198328p), (float) i3);
            path.lineTo((float) this.f198327o, (float) this.f198322g);
            int i4 = this.f198322g;
            path.quadTo(0.0f, (float) i4, 0.0f, (float) (i4 - this.f198327o));
            path.lineTo(0.0f, (float) this.f198325j);
            path.quadTo(0.0f, 0.0f, (float) this.f198325j, 0.0f);
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f198321f = getWidth();
        this.f198322g = getHeight();
    }

    public void onMeasure(int i, int i2) {
        if (this.f198323h != 0.0f) {
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (this.f198323h * ((float) size)), 1073741824));
            return;
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: p */
    public final void mo94997p(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77600a.f226230a, i, 0);
        this.f198323h = obtainStyledAttributes.getFloat(0, 0.0f);
        this.f198324i = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f198325j = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f198326n = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        this.f198327o = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        this.f198328p = dimensionPixelOffset;
        int i2 = this.f198325j;
        if (i2 == 0) {
            i2 = this.f198324i;
        }
        this.f198325j = i2;
        int i3 = this.f198326n;
        if (i3 == 0) {
            i3 = this.f198324i;
        }
        this.f198326n = i3;
        int i4 = this.f198327o;
        if (i4 == 0) {
            i4 = this.f198324i;
        }
        this.f198327o = i4;
        if (dimensionPixelOffset == 0) {
            dimensionPixelOffset = this.f198324i;
        }
        this.f198328p = dimensionPixelOffset;
        obtainStyledAttributes.recycle();
    }

    public FixAspectRatioImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo94997p(context, attributeSet, i);
    }
}
