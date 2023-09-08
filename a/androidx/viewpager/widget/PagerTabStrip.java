package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p385u2.C111105a;

public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: A */
    public int f306790A;

    /* renamed from: B */
    public int f306791B;

    /* renamed from: C */
    public final Paint f306792C;

    /* renamed from: D */
    public final Rect f306793D = new Rect();

    /* renamed from: E */
    public int f306794E = 255;

    /* renamed from: F */
    public boolean f306795F = false;

    /* renamed from: G */
    public boolean f306796G = false;

    /* renamed from: H */
    public int f306797H;

    /* renamed from: I */
    public boolean f306798I;

    /* renamed from: J */
    public float f306799J;

    /* renamed from: K */
    public float f306800K;

    /* renamed from: L */
    public int f306801L;

    /* renamed from: w */
    public int f306802w;

    /* renamed from: x */
    public int f306803x;

    /* renamed from: y */
    public int f306804y;

    /* renamed from: z */
    public int f306805z;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    public class C103840a implements View.OnClickListener {
        public C103840a() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f306810d;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    public class C103841b implements View.OnClickListener {
        public C103841b() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f306810d;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f306792C = paint;
        int i = this.f306823t;
        this.f306802w = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f306803x = (int) ((3.0f * f) + 0.5f);
        this.f306804y = (int) ((6.0f * f) + 0.5f);
        this.f306805z = (int) (64.0f * f);
        this.f306791B = (int) ((16.0f * f) + 0.5f);
        this.f306797H = (int) ((1.0f * f) + 0.5f);
        this.f306790A = (int) ((f * 32.0f) + 0.5f);
        this.f306801L = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f306811e.setFocusable(true);
        this.f306811e.setOnClickListener(new C103840a());
        this.f306813g.setFocusable(true);
        this.f306813g.setOnClickListener(new C103841b());
        if (getBackground() == null) {
            this.f306795F = true;
        }
    }

    /* renamed from: c */
    public void mo145373c(int i, float f, boolean z) {
        Rect rect = this.f306793D;
        int height = getHeight();
        int left = this.f306812f.getLeft() - this.f306791B;
        int right = this.f306812f.getRight() + this.f306791B;
        int i2 = height - this.f306803x;
        rect.set(left, i2, right, height);
        super.mo145373c(i, f, z);
        this.f306794E = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f306812f.getLeft() - this.f306791B, i2, this.f306812f.getRight() + this.f306791B, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f306795F;
    }

    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f306790A);
    }

    public int getTabIndicatorColor() {
        return this.f306802w;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f306812f.getLeft() - this.f306791B;
        int right = this.f306812f.getRight() + this.f306791B;
        this.f306792C.setColor((this.f306794E << 24) | (this.f306802w & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) (height - this.f306803x), (float) right, f, this.f306792C);
        if (this.f306795F) {
            this.f306792C.setColor(-16777216 | (this.f306802w & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f306797H), (float) (getWidth() - getPaddingRight()), f, this.f306792C);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f306798I) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f306799J = x;
            this.f306800K = y;
            this.f306798I = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.f306799J) > ((float) this.f306801L) || Math.abs(y - this.f306800K) > ((float) this.f306801L))) {
                this.f306798I = true;
            }
        } else if (x < ((float) (this.f306812f.getLeft() - this.f306791B))) {
            ViewPager viewPager = this.f306810d;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > ((float) (this.f306812f.getRight() + this.f306791B))) {
            ViewPager viewPager2 = this.f306810d;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.f306796G) {
            this.f306795F = (i & -16777216) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f306796G) {
            this.f306795F = drawable == null;
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.f306796G) {
            this.f306795F = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f306795F = z;
        this.f306796G = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f306804y;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.f306802w = i;
        this.f306792C.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(C111105a.m151500b(getContext(), i));
    }

    public void setTextSpacing(int i) {
        int i2 = this.f306805z;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }
}
