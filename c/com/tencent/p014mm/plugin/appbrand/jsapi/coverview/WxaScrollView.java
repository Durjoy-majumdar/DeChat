package com.tencent.p014mm.plugin.appbrand.jsapi.coverview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import cl0.C80070s;
import cl0.C80071t;
import cl0.C80072u;
import com.tencent.p014mm.sdk.platformtools.Log;
import sn0.C90267g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView */
public class WxaScrollView extends FrameLayout implements C80071t, C80072u, C90267g {

    /* renamed from: d */
    public FrameLayout f241385d;

    /* renamed from: e */
    public ScrollView f241386e;

    /* renamed from: f */
    public C80070s f241387f;

    /* renamed from: g */
    public boolean f241388g = true;

    /* renamed from: h */
    public float f241389h;

    /* renamed from: i */
    public float[] f241390i;

    /* renamed from: j */
    public float f241391j;

    /* renamed from: n */
    public int f241392n;

    /* renamed from: o */
    public int f241393o;

    /* renamed from: p */
    public Paint f241394p = new Paint();

    /* renamed from: q */
    public GradientDrawable f241395q = new GradientDrawable();

    /* renamed from: r */
    public float[] f241396r = new float[8];

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView$a */
    public class C82352a extends ScrollView {
        public C82352a(Context context) {
            super(context);
        }

        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            WxaScrollView wxaScrollView = WxaScrollView.this;
            C80070s sVar = wxaScrollView.f241387f;
            if (sVar != null) {
                sVar.mo110321a(wxaScrollView, i, i2, i3, i4);
            }
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 2 || WxaScrollView.this.f241388g) {
                return super.onTouchEvent(motionEvent);
            }
            Log.m105920e("MicroMsg.WxaScrollView", "can not move");
            return false;
        }
    }

    public WxaScrollView(Context context) {
        super(context);
        mo114755a();
    }

    private Drawable getShadowDrawable() {
        int i;
        int i2 = this.f241393o;
        if (i2 != 0) {
            this.f241395q.setColor(i2);
        }
        float[] fArr = this.f241390i;
        if (fArr != null && fArr.length > 3) {
            float[] fArr2 = this.f241396r;
            fArr2[0] = fArr[0];
            fArr2[1] = fArr[0];
            float f = fArr[1];
            fArr2[2] = f;
            fArr2[3] = f;
            float f2 = fArr[3];
            fArr2[4] = f2;
            fArr2[5] = f2;
            float f3 = fArr[2];
            fArr2[6] = f3;
            fArr2[7] = f3;
            this.f241395q.setCornerRadii(fArr2);
        }
        float f4 = this.f241391j;
        if (f4 > 0.0f && (i = this.f241392n) != 0) {
            this.f241395q.setStroke((int) f4, i);
        }
        return this.f241395q;
    }

    /* renamed from: a */
    public final void mo114755a() {
        this.f241386e = new C82352a(getContext());
        this.f241385d = new FrameLayout(getContext());
        super.addView(this.f241386e, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f241386e.addView(this.f241385d, 0, new ViewGroup.LayoutParams(-1, -2));
        this.f241394p.setStyle(Paint.Style.STROKE);
        this.f241394p.setAntiAlias(true);
        setWillNotDraw(false);
    }

    public void addView(View view, int i) {
        this.f241385d.addView(view, i);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = this.f241389h;
            boolean z = true;
            if (f > 0.0f) {
                double pow = Math.pow((double) f, 2.0d);
                float width = (float) getWidth();
                float height = (float) getHeight();
                float f2 = this.f241389h;
                if (x >= f2 ? !(x <= width - f2 || (y >= f2 ? y <= height - f2 || Math.pow((double) ((x + f2) - width), 2.0d) + Math.pow((double) ((y + this.f241389h) - height), 2.0d) <= pow : Math.pow((double) ((x + f2) - width), 2.0d) + Math.pow((double) (this.f241389h - y), 2.0d) <= pow)) : !(y >= f2 ? y <= height - f2 || Math.pow((double) (f2 - x), 2.0d) + Math.pow((double) ((y + this.f241389h) - height), 2.0d) <= pow : Math.pow((double) (f2 - x), 2.0d) + Math.pow((double) (this.f241389h - y), 2.0d) <= pow)) {
                    z = false;
                }
            }
            if (!z) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void draw(Canvas canvas) {
        float[] fArr = this.f241390i;
        if (fArr == null || fArr.length != 4) {
            boolean z = true;
            float f = 0.0f;
            boolean z2 = this.f241389h > 0.0f;
            if (z2) {
                canvas.save();
                Path path = new Path();
                RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
                float f2 = this.f241389h;
                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                canvas.clipPath(path);
            }
            int i = this.f241393o;
            if (i != 0) {
                canvas.drawColor(i);
            }
            float f3 = this.f241391j;
            if (f3 > 0.0f) {
                float f4 = f3 / 2.0f;
                RectF rectF2 = new RectF(f4, f4, ((float) getWidth()) - f4, ((float) getHeight()) - f4);
                float f5 = this.f241389h;
                canvas.drawRoundRect(rectF2, f5, f5, this.f241394p);
                if (z2) {
                    canvas.restore();
                }
                canvas.save();
                Path path2 = new Path();
                float f6 = this.f241389h;
                if (f6 > 0.0f) {
                    float f7 = this.f241391j;
                    if (f6 - f7 > 0.0f) {
                        f = f6 - f7;
                    }
                }
                float f8 = this.f241391j;
                path2.addRoundRect(new RectF(f8, f8, ((float) getWidth()) - this.f241391j, ((float) getHeight()) - this.f241391j), f, f, Path.Direction.CW);
                canvas.clipPath(path2);
            } else {
                z = z2;
            }
            int save = canvas.save();
            super.draw(canvas);
            canvas.restoreToCount(save);
            if (z) {
                canvas.restore();
                return;
            }
            return;
        }
        super.draw(canvas);
    }

    public ViewGroup getTargetView() {
        return this.f241385d;
    }

    public int getTargetViewChildCount() {
        return this.f241385d.getChildCount();
    }

    public void removeView(View view) {
        this.f241385d.removeView(view);
    }

    public void scrollTo(int i, int i2) {
        this.f241386e.scrollTo(i, i2);
        invalidate();
    }

    public void setBgColor(int i) {
        this.f241393o = i;
    }

    public void setBorderColor(int i) {
        this.f241392n = i;
        this.f241394p.setColor(i);
    }

    public void setBorderRadius(float f) {
        this.f241389h = f;
    }

    public void setBorderWidth(float f) {
        this.f241391j = f;
        this.f241394p.setStrokeWidth(f);
    }

    public void setOnScrollChangedListener(C80070s sVar) {
        this.f241387f = sVar;
    }

    public void setScrollHorizontal(boolean z) {
    }

    public void setScrollVertical(boolean z) {
        this.f241388g = z;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.f241385d.addView(view, i, layoutParams);
    }

    public void setBorderRadius(float[] fArr) {
        this.f241390i = fArr;
        if (fArr != null && fArr.length > 0) {
            setBackground(getShadowDrawable());
        }
    }

    public WxaScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo114755a();
    }

    public WxaScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo114755a();
    }
}
