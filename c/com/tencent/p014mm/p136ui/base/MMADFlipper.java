package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import wq3.C111847h;

/* renamed from: com.tencent.mm.ui.base.MMADFlipper */
public class MMADFlipper extends ViewGroup implements C111847h {

    /* renamed from: d */
    public int f214743d;

    /* renamed from: e */
    public int f214744e;

    /* renamed from: f */
    public Context f214745f;

    /* renamed from: g */
    public Scroller f214746g;

    /* renamed from: h */
    public Interpolator f214747h;

    /* renamed from: i */
    public VelocityTracker f214748i;

    /* renamed from: j */
    public int f214749j;

    /* renamed from: n */
    public int f214750n;

    /* renamed from: o */
    public View f214751o;

    /* renamed from: p */
    public View f214752p;

    /* renamed from: q */
    public float f214753q;

    /* renamed from: r */
    public float f214754r;

    /* renamed from: s */
    public boolean f214755s;

    /* renamed from: t */
    public boolean f214756t;

    /* renamed from: com.tencent.mm.ui.base.MMADFlipper$a */
    public interface C73158a {
        /* renamed from: a */
        void mo101632a(int i, int i2);
    }

    public MMADFlipper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Interpolator getInterpolator() {
        return new LinearInterpolator();
    }

    /* renamed from: a */
    public void mo101618a(int i) {
        int max = Math.max(0, Math.min(i, getChildCount() - 1));
        if (getScrollX() != getWidth() * max) {
            int width = (max * getWidth()) - getScrollX();
            this.f214746g.startScroll(getScrollX(), 0, width, 0, C76577a.m92152c(getContext(), Math.abs(width) * 2));
            invalidate();
        }
        Log.m105919d("MicroMsg.MMFlipper", "mCurScreen:%d, mLastScreen:%d, whichScreen:%d", Integer.valueOf(this.f214749j), Integer.valueOf(this.f214750n), Integer.valueOf(i));
        this.f214750n = i;
    }

    public void computeScroll() {
        if (this.f214746g.computeScrollOffset()) {
            scrollTo(this.f214746g.getCurrX(), this.f214746g.getCurrY());
            postInvalidate();
        } else if (this.f214755s) {
            this.f214755s = false;
            int i = this.f214749j;
            if (i <= 0) {
                int realChildCount = getRealChildCount();
                this.f214749j = realChildCount;
                setScrollXOffest(realChildCount * getWidth());
            } else if (i >= getChildCount() - 1) {
                this.f214749j = 1;
                setScrollXOffest(1 * getWidth());
            }
        }
    }

    public int getCurScreen() {
        return this.f214749j;
    }

    public int getRealChildCount() {
        return getChildCount() > 1 ? getChildCount() - 2 : getChildCount();
    }

    public int getRealCurScreen() {
        return getChildCount() > 1 ? this.f214749j - 1 : this.f214749j;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r0 != 3) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f214756t
            if (r0 != 0) goto L_0x0009
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        L_0x0009:
            int r0 = r5.getChildCount()
            r1 = 1
            if (r0 != r1) goto L_0x0015
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        L_0x0015:
            int r0 = r6.getAction()
            r2 = 2
            if (r0 != r2) goto L_0x0021
            int r3 = r5.f214743d
            if (r3 == 0) goto L_0x0021
            return r1
        L_0x0021:
            float r3 = r6.getX()
            float r6 = r6.getY()
            r4 = 0
            if (r0 == 0) goto L_0x0058
            if (r0 == r1) goto L_0x0055
            if (r0 == r2) goto L_0x0034
            r6 = 3
            if (r0 == r6) goto L_0x0055
            goto L_0x0065
        L_0x0034:
            float r0 = r5.f214753q
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            float r2 = r5.f214754r
            float r2 = r2 - r6
            float r6 = java.lang.Math.abs(r2)
            int r6 = (int) r6
            int r2 = r5.f214744e
            if (r0 <= r2) goto L_0x004c
            if (r6 >= r2) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            if (r6 == 0) goto L_0x0052
            r5.f214743d = r1
            goto L_0x0065
        L_0x0052:
            r5.f214743d = r4
            goto L_0x0065
        L_0x0055:
            r5.f214743d = r4
            goto L_0x0065
        L_0x0058:
            r5.f214753q = r3
            r5.f214754r = r6
            android.widget.Scroller r6 = r5.f214746g
            boolean r6 = r6.isFinished()
            r6 = r6 ^ r1
            r5.f214743d = r6
        L_0x0065:
            int r6 = r5.f214743d
            if (r6 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MMADFlipper.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth() + i5;
                childAt.layout(i5, 0, measuredWidth, childAt.getMeasuredHeight());
                i5 = measuredWidth;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 1
            if (r0 != r1) goto L_0x000c
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L_0x000c:
            android.view.VelocityTracker r0 = r4.f214748i
            if (r0 != 0) goto L_0x0016
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.f214748i = r0
        L_0x0016:
            android.view.VelocityTracker r0 = r4.f214748i
            r0.addMovement(r5)
            int r0 = r5.getAction()
            float r5 = r5.getX()
            if (r0 == 0) goto L_0x009c
            r2 = 0
            if (r0 == r1) goto L_0x003b
            r3 = 2
            if (r0 == r3) goto L_0x0030
            r5 = 3
            if (r0 == r5) goto L_0x003b
            goto L_0x00ab
        L_0x0030:
            float r0 = r4.f214753q
            float r0 = r0 - r5
            int r0 = (int) r0
            r4.f214753q = r5
            r4.scrollBy(r0, r2)
            goto L_0x00ab
        L_0x003b:
            android.view.VelocityTracker r5 = r4.f214748i
            r0 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r0)
            float r5 = r5.getXVelocity()
            int r5 = (int) r5
            r0 = 600(0x258, float:8.41E-43)
            if (r5 <= r0) goto L_0x0061
            int r5 = r4.getChildCount()
            if (r5 <= r1) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            if (r5 == 0) goto L_0x005e
            int r5 = r4.f214749j
            int r5 = r5 - r1
            r4.f214749j = r5
            r4.mo101618a(r5)
        L_0x005e:
            r4.f214755s = r1
            goto L_0x008a
        L_0x0061:
            r0 = -600(0xfffffffffffffda8, float:NaN)
            if (r5 >= r0) goto L_0x007b
            int r5 = r4.getChildCount()
            if (r5 <= r1) goto L_0x006d
            r5 = 1
            goto L_0x006e
        L_0x006d:
            r5 = 0
        L_0x006e:
            if (r5 == 0) goto L_0x0078
            int r5 = r4.f214749j
            int r5 = r5 + r1
            r4.f214749j = r5
            r4.mo101618a(r5)
        L_0x0078:
            r4.f214755s = r1
            goto L_0x008a
        L_0x007b:
            int r5 = r4.getWidth()
            int r0 = r4.getScrollX()
            int r3 = r5 / 2
            int r0 = r0 + r3
            int r0 = r0 / r5
            r4.mo101618a(r0)
        L_0x008a:
            android.view.VelocityTracker r5 = r4.f214748i
            if (r5 == 0) goto L_0x0094
            r5.recycle()
            r5 = 0
            r4.f214748i = r5
        L_0x0094:
            r4.f214743d = r2
            r5 = 0
            r4.f214753q = r5
            r4.f214754r = r5
            goto L_0x00ab
        L_0x009c:
            android.widget.Scroller r0 = r4.f214746g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00a9
            android.widget.Scroller r0 = r4.f214746g
            r0.abortAnimation()
        L_0x00a9:
            r4.f214753q = r5
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MMADFlipper.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setFooterView(View view) {
        this.f214752p = view;
    }

    public void setHeaderView(View view) {
        this.f214751o = view;
    }

    public void setOnScreenChangedListener(C73158a aVar) {
    }

    public void setScrollEnable(boolean z) {
        this.f214756t = z;
    }

    public void setScrollXOffest(int i) {
        setScrollX(i);
    }

    public MMADFlipper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f214743d = 0;
        this.f214755s = false;
        this.f214756t = true;
        this.f214745f = context;
        this.f214747h = getInterpolator();
        this.f214746g = new Scroller(this.f214745f, this.f214747h);
        this.f214744e = ViewConfiguration.get(this.f214745f).getScaledDoubleTapSlop();
    }
}
