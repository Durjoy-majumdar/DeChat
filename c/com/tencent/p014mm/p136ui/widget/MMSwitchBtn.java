package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import j20.C117292a;
import java.util.ArrayList;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.widget.MMSwitchBtn */
public class MMSwitchBtn extends View implements View.OnClickListener {

    /* renamed from: J */
    public static final /* synthetic */ int f220405J = 0;

    /* renamed from: A */
    public RectF f220406A = new RectF();

    /* renamed from: B */
    public RectF f220407B = new RectF();

    /* renamed from: C */
    public int f220408C;

    /* renamed from: D */
    public int f220409D;

    /* renamed from: E */
    public int f220410E;

    /* renamed from: F */
    public String f220411F;

    /* renamed from: G */
    public String f220412G;

    /* renamed from: H */
    public C74959c f220413H = new C74959c((C74958a) null);

    /* renamed from: I */
    public C7041b f220414I;

    /* renamed from: d */
    public float f220415d;

    /* renamed from: e */
    public float f220416e;

    /* renamed from: f */
    public long f220417f;

    /* renamed from: g */
    public int f220418g;

    /* renamed from: h */
    public int f220419h;

    /* renamed from: i */
    public int f220420i;

    /* renamed from: j */
    public int f220421j;

    /* renamed from: n */
    public int f220422n;

    /* renamed from: o */
    public boolean f220423o = false;

    /* renamed from: p */
    public boolean f220424p = false;

    /* renamed from: q */
    public int f220425q;

    /* renamed from: r */
    public int f220426r;

    /* renamed from: s */
    public float f220427s;

    /* renamed from: t */
    public float f220428t;

    /* renamed from: u */
    public int f220429u;

    /* renamed from: v */
    public int f220430v;

    /* renamed from: w */
    public int f220431w;

    /* renamed from: x */
    public int f220432x;

    /* renamed from: y */
    public boolean f220433y = false;

    /* renamed from: z */
    public Paint f220434z = new Paint(1);

    /* renamed from: com.tencent.mm.ui.widget.MMSwitchBtn$b */
    public interface C7041b {
        void onStatusChange(boolean z);
    }

    /* renamed from: com.tencent.mm.ui.widget.MMSwitchBtn$c */
    public class C74959c extends Animation {

        /* renamed from: d */
        public int f220435d = 0;

        /* renamed from: e */
        public float f220436e = 0.0f;

        /* renamed from: f */
        public long f220437f = 0;

        public C74959c(C74958a aVar) {
            setInterpolator(new AccelerateDecelerateInterpolator());
            setAnimationListener(new C74970b(this, MMSwitchBtn.this));
        }

        public void applyTransformation(float f, Transformation transformation) {
            if (this.f220435d == 0) {
                MMSwitchBtn.this.f220407B.left = this.f220436e - (f * ((float) this.f220437f));
            } else {
                MMSwitchBtn.this.f220407B.left = this.f220436e + (f * ((float) this.f220437f));
            }
            MMSwitchBtn mMSwitchBtn = MMSwitchBtn.this;
            int i = MMSwitchBtn.f220405J;
            mMSwitchBtn.mo104310b();
            MMSwitchBtn.this.invalidate();
        }
    }

    public MMSwitchBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo104311c();
        mo104312d(context.obtainStyledAttributes(attributeSet, C79142a.f232409h));
    }

    /* renamed from: a */
    public final void mo104309a(boolean z) {
        this.f220423o = true;
        this.f220413H.reset();
        if (z) {
            C74959c cVar = this.f220413H;
            cVar.f220437f = (((long) this.f220419h) - ((long) this.f220407B.left)) + ((long) this.f220426r);
            cVar.f220435d = 1;
        } else {
            C74959c cVar2 = this.f220413H;
            cVar2.f220437f = (long) this.f220407B.left;
            cVar2.f220435d = 0;
        }
        C74959c cVar3 = this.f220413H;
        cVar3.f220436e = this.f220407B.left;
        cVar3.setDuration((cVar3.f220437f * 80) / ((long) this.f220419h));
        startAnimation(this.f220413H);
    }

    /* renamed from: b */
    public final void mo104310b() {
        RectF rectF = this.f220407B;
        float f = rectF.left;
        int i = this.f220426r;
        if (f < ((float) i)) {
            rectF.left = (float) i;
        }
        float f2 = rectF.left;
        int i2 = this.f220419h;
        if (f2 > ((float) (i2 + i))) {
            rectF.left = (float) (i2 + i);
        }
        rectF.right = rectF.left + ((float) ((int) (this.f220428t * 2.0f)));
    }

    /* renamed from: c */
    public final void mo104311c() {
        this.f220426r = getResources().getDimensionPixelSize(C0966R.dimen.f3963ll);
        this.f220427s = (float) getResources().getDimensionPixelSize(C0966R.dimen.f3970ls);
        this.f220428t = (float) getResources().getDimensionPixelSize(C0966R.dimen.f3969lr);
        this.f220429u = getResources().getColor(C0966R.color.f2975b6);
        this.f220430v = getResources().getColor(C0966R.color.afy);
        this.f220431w = getResources().getColor(C0966R.color.afz);
        this.f220432x = getResources().getColor(C0966R.color.f3140go);
        this.f220409D = this.f220431w;
        this.f220408C = this.f220430v;
        this.f220410E = this.f220429u;
        this.f220425q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setOnClickListener(this);
    }

    /* renamed from: d */
    public final void mo104312d(TypedArray typedArray) {
        this.f220409D = typedArray.getColor(2, this.f220431w);
        this.f220408C = typedArray.getColor(0, this.f220430v);
        this.f220410E = typedArray.getColor(4, this.f220429u);
        this.f220411F = typedArray.getString(3);
        this.f220412G = typedArray.getString(1);
        typedArray.recycle();
    }

    /* renamed from: e */
    public final void mo104313e() {
        int i = this.f220422n;
        int i2 = this.f220421j;
        if (i < i2) {
            RectF rectF = this.f220407B;
            int i3 = this.f220426r;
            float f = (float) (((i2 - i) / 2) + i3);
            rectF.top = f;
            rectF.bottom = (f + ((float) i)) - ((float) (i3 * 2));
        } else {
            RectF rectF2 = this.f220407B;
            int i4 = this.f220426r;
            rectF2.top = (float) i4;
            rectF2.bottom = (float) (i2 - i4);
        }
        if (this.f220433y) {
            RectF rectF3 = this.f220407B;
            int i5 = this.f220419h;
            int i6 = this.f220426r;
            rectF3.left = (float) (i5 + i6);
            rectF3.right = (float) (this.f220420i - i6);
            return;
        }
        RectF rectF4 = this.f220407B;
        int i7 = this.f220426r;
        rectF4.left = (float) i7;
        rectF4.right = (float) (((int) (this.f220428t * 2.0f)) + i7);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/MMSwitchBtn", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mo104309a(!this.f220433y);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.f220424p = false;
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/MMSwitchBtn", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDraw(Canvas canvas) {
        int i;
        if (!isEnabled()) {
            i = this.f220432x;
            this.f220434z.setAlpha(38);
        } else {
            i = this.f220408C;
            this.f220434z.setAlpha(255);
        }
        this.f220434z.setColor(i);
        RectF rectF = this.f220406A;
        float f = this.f220427s;
        canvas.drawRoundRect(rectF, f, f, this.f220434z);
        this.f220434z.setColor(this.f220409D);
        this.f220434z.setAlpha(Math.min(255, (int) (((this.f220407B.left - ((float) this.f220426r)) / ((float) this.f220419h)) * 255.0f)));
        RectF rectF2 = this.f220406A;
        float f2 = this.f220427s;
        canvas.drawRoundRect(rectF2, f2, f2, this.f220434z);
        this.f220434z.setColor(this.f220410E);
        RectF rectF3 = this.f220407B;
        float f3 = this.f220428t;
        canvas.drawRoundRect(rectF3, f3, f3, this.f220434z);
        if (this.f220411F != null && this.f220412G != null) {
            Paint paint = new Paint();
            paint.setTextSize(getResources().getDimension(C0966R.dimen.f3957lf));
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(getResources().getColor(C0966R.color.al_));
            paint.setAntiAlias(true);
            int min = Math.min(255, (int) (((this.f220407B.left - ((float) this.f220426r)) / ((float) this.f220419h)) * 255.0f));
            Rect rect = new Rect();
            String str = this.f220411F;
            paint.getTextBounds(str, 0, str.length(), rect);
            paint.setAlpha(min);
            RectF rectF4 = this.f220406A;
            float a = (((rectF4.left + rectF4.right) / 2.0f) - this.f220428t) + ((float) C74942w4.m89784a(getContext(), 1));
            RectF rectF5 = this.f220406A;
            float height = (((rectF5.top + rectF5.bottom) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) C74942w4.m89784a(getContext(), 1));
            canvas.drawText(this.f220411F, a, height, paint);
            RectF rectF6 = this.f220406A;
            paint.setAlpha(255 - min);
            canvas.drawText(this.f220412G, (((rectF6.left + rectF6.right) / 2.0f) + this.f220428t) - ((float) C74942w4.m89784a(getContext(), 1)), height, paint);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        this.f220420i = i5;
        this.f220421j = i4 - i2;
        int i6 = (i5 - ((int) (this.f220428t * 2.0f))) - (this.f220426r * 2);
        this.f220419h = i6;
        this.f220418g = i6 / 2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3968lq);
        this.f220422n = dimensionPixelSize;
        int i7 = this.f220421j;
        if (dimensionPixelSize < i7) {
            RectF rectF = this.f220406A;
            float f = (float) ((i7 - dimensionPixelSize) / 2);
            rectF.top = f;
            rectF.bottom = f + ((float) dimensionPixelSize);
        } else {
            RectF rectF2 = this.f220406A;
            rectF2.top = 0.0f;
            rectF2.bottom = (float) i7;
        }
        RectF rectF3 = this.f220406A;
        rectF3.left = 0.0f;
        rectF3.right = (float) this.f220420i;
        mo104313e();
        this.f220434z.setStyle(Paint.Style.FILL);
        this.f220434z.setColor(this.f220430v);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f220423o || !isEnabled()) {
            return true;
        }
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            clearAnimation();
            this.f220415d = motionEvent.getX();
            this.f220416e = motionEvent.getY();
            this.f220417f = SystemClock.elapsedRealtime();
            this.f220424p = false;
        } else if (action == 1) {
            if (SystemClock.elapsedRealtime() - this.f220417f < 300) {
                mo104309a(!this.f220433y);
            } else if (this.f220407B.left > ((float) this.f220418g)) {
                mo104309a(true);
            } else {
                mo104309a(false);
            }
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.f220424p = false;
        } else if (action == 2) {
            if (this.f220424p) {
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                this.f220407B.left += motionEvent.getX() - this.f220415d;
                mo104310b();
            } else {
                float x = motionEvent.getX() - this.f220415d;
                float y = motionEvent.getY() - this.f220416e;
                if (Math.abs(x) >= ((float) this.f220425q) / 10.0f) {
                    if (y == 0.0f) {
                        y = 1.0f;
                    }
                    if (Math.abs(x / y) > 3.0f) {
                        z = true;
                    }
                }
                if (z) {
                    this.f220424p = true;
                    ViewParent parent3 = getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            this.f220415d = motionEvent.getX();
            this.f220416e = motionEvent.getY();
        } else if (action == 3) {
            if (this.f220424p) {
                if (this.f220407B.left > ((float) this.f220418g)) {
                    mo104309a(true);
                } else {
                    mo104309a(false);
                }
            }
            ViewParent parent4 = getParent();
            if (parent4 != null) {
                parent4.requestDisallowInterceptTouchEvent(false);
            }
            this.f220424p = false;
        }
        if (this.f220424p) {
            invalidate();
        }
        return true;
    }

    public void setCheck(boolean z) {
        if (this.f220433y != z) {
            clearAnimation();
            this.f220433y = z;
            mo104313e();
            this.f220423o = false;
            invalidate();
        }
    }

    public void setOffColor(int i) {
        this.f220408C = i;
    }

    public void setSwitchListener(C7041b bVar) {
        this.f220414I = bVar;
    }

    public MMSwitchBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo104311c();
        mo104312d(context.obtainStyledAttributes(attributeSet, C79142a.f232409h));
    }

    public MMSwitchBtn(Context context) {
        super(context);
        mo104311c();
    }
}
