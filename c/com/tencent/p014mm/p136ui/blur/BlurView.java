package com.tencent.p014mm.p136ui.blur;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import t40.C77853a;
import tj3.C111004a;
import tj3.C64956f;
import tj3.C78034d;

/* renamed from: com.tencent.mm.ui.blur.BlurView */
public class BlurView extends FrameLayout {

    /* renamed from: d */
    public C78034d f215140d = new C64956f(this);

    /* renamed from: e */
    public int f215141e;

    /* renamed from: f */
    public float f215142f = 0.0f;

    /* renamed from: g */
    public final Path f215143g = new Path();

    /* renamed from: h */
    public final RectF f215144h = new RectF();

    /* renamed from: i */
    public float[] f215145i;

    /* renamed from: j */
    public boolean f215146j = false;

    static {
        Class<BlurView> cls = BlurView.class;
    }

    public BlurView(Context context) {
        super(context);
        mo101976a((AttributeSet) null, 0);
    }

    private void setBlurController(C78034d dVar) {
        this.f215140d.destroy();
        this.f215140d = dVar;
    }

    /* renamed from: a */
    public final void mo101976a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C77853a.f226856b, i, 0);
        this.f215141e = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    /* renamed from: b */
    public BlurView mo101977b(int i) {
        if (i != this.f215141e) {
            this.f215141e = i;
            invalidate();
        }
        return this;
    }

    /* renamed from: c */
    public BlurView mo101978c(ViewGroup viewGroup) {
        C111004a aVar = new C111004a(this, viewGroup);
        setBlurController(aVar);
        if (!isHardwareAccelerated()) {
            aVar.mo89116b(false);
        }
        return this;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f215140d.mo89118d(canvas);
    }

    public void draw(Canvas canvas) {
        if (this.f215142f != 0.0f) {
            this.f215143g.reset();
            if (this.f215146j) {
                float f = this.f215142f;
                this.f215145i = new float[]{f, f, f, f, f, f, f, f};
            } else {
                float f2 = this.f215142f;
                this.f215145i = new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f};
            }
            this.f215144h.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            this.f215143g.addRoundRect(this.f215144h, this.f215145i, Path.Direction.CCW);
            canvas.clipPath(this.f215143g);
        }
        if (canvas.isHardwareAccelerated()) {
            this.f215140d.mo89117c(canvas);
            int i = this.f215141e;
            if (i != 0) {
                canvas.drawColor(i);
            }
            super.draw(canvas);
        } else if (!isHardwareAccelerated()) {
            super.draw(canvas);
        }
    }

    public C78034d getBlurController() {
        return this.f215140d;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.f215140d.mo89116b(true);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f215140d.mo89116b(false);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f215140d.mo89122g();
    }

    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo101976a(attributeSet, 0);
    }

    public BlurView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo101976a(attributeSet, i);
    }
}
