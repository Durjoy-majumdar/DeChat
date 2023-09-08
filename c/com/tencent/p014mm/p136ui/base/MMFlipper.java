package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ht1.C60165e4;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.base.MMFlipper */
public class MMFlipper extends ViewGroup {

    /* renamed from: d */
    public Scroller f214775d;

    /* renamed from: e */
    public VelocityTracker f214776e;

    /* renamed from: f */
    public int f214777f;

    /* renamed from: g */
    public int f214778g;

    /* renamed from: h */
    public int f214779h;

    /* renamed from: i */
    public int f214780i;

    /* renamed from: j */
    public int f214781j;

    /* renamed from: n */
    public float f214782n;

    /* renamed from: o */
    public float f214783o;

    /* renamed from: p */
    public boolean f214784p;

    /* renamed from: q */
    public C73165c f214785q;

    /* renamed from: r */
    public C73163a f214786r;

    /* renamed from: s */
    public C73164b f214787s;

    /* renamed from: t */
    public Interpolator f214788t;

    /* renamed from: u */
    public boolean f214789u;

    /* renamed from: com.tencent.mm.ui.base.MMFlipper$a */
    public interface C73163a {
    }

    /* renamed from: com.tencent.mm.ui.base.MMFlipper$b */
    public interface C73164b {
        /* renamed from: a */
        void mo100336a(int i, int i2);
    }

    /* renamed from: com.tencent.mm.ui.base.MMFlipper$c */
    public interface C73165c {
        /* renamed from: a */
        void mo65479a(int i, int i2, boolean z);
    }

    /* renamed from: com.tencent.mm.ui.base.MMFlipper$d */
    public static class C73166d implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2) + 1.0f;
        }
    }

    public MMFlipper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        mo101664b(context);
    }

    /* renamed from: a */
    public void mo101663a(int i) {
        int max = Math.max(0, Math.min(i, getChildCount() - 1));
        this.f214784p = false;
        if (!this.f214775d.isFinished()) {
            this.f214775d.abortAnimation();
        }
        this.f214778g = this.f214777f;
        this.f214777f = max;
        scrollTo(max * getWidth(), 0);
    }

    /* renamed from: b */
    public final void mo101664b(Context context) {
        this.f214788t = getInterpolator();
        this.f214775d = new Scroller(context, this.f214788t);
        this.f214778g = -1;
        this.f214777f = 0;
        this.f214779h = 0;
        this.f214781j = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* renamed from: c */
    public void mo101665c(int i) {
        int max = Math.max(0, Math.min(i, getChildCount() - 1));
        if (getScrollX() != getWidth() * max) {
            int width = (getWidth() * max) - getScrollX();
            this.f214775d.startScroll(getScrollX(), 0, width, 0, C76577a.m92152c(getContext(), (int) (((float) Math.abs(width)) * 1.3f)));
            int i2 = this.f214777f;
            if (i2 != max) {
                this.f214784p = true;
                this.f214779h += max - i2;
            }
            this.f214778g = i2;
            this.f214777f = max;
            invalidate();
        }
    }

    public void computeScroll() {
        this.f214775d.getCurrX();
        if (this.f214775d.computeScrollOffset()) {
            scrollTo(this.f214775d.getCurrX(), this.f214775d.getCurrY());
            postInvalidate();
        } else if (this.f214784p) {
            this.f214784p = false;
            C73165c cVar = this.f214785q;
            if (cVar != null) {
                cVar.mo65479a(this.f214778g, this.f214779h, true);
            }
        } else {
            C73163a aVar = this.f214786r;
            if (aVar != null && this.f214782n == 0.0f && this.f214778g != this.f214777f) {
                int i = this.f214779h;
                AppPanel.C72747b bVar = (AppPanel.C72747b) aVar;
                bVar.getClass();
                Log.m105925i("MicroMsg.AppPanel", "viewpage reshow %s", Integer.valueOf(i));
                int p = AppPanel.this.mo100318p(14);
                if (i == p && AppPanel.this.f211687A.f212152A.f212183a) {
                    ((C60165e4) C86312j.m106911c(C60165e4.class)).T10(p + 1);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo101667d(int i) {
        this.f214779h = i;
    }

    public int getCurScreen() {
        Log.m105919d("MicroMsg.MMFlipper", "cur screen is %d", Integer.valueOf(this.f214777f));
        return this.f214777f;
    }

    public Interpolator getInterpolator() {
        return new C73166d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r0 != 3) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f214789u
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
            int r3 = r5.f214780i
            if (r3 == 0) goto L_0x0021
            return r1
        L_0x0021:
            float r3 = r6.getX()
            float r6 = r6.getY()
            r4 = 0
            if (r0 == 0) goto L_0x0077
            if (r0 == r1) goto L_0x0074
            if (r0 == r2) goto L_0x0034
            r6 = 3
            if (r0 == r6) goto L_0x0074
            goto L_0x0084
        L_0x0034:
            float r0 = r5.f214782n
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            float r2 = r5.f214783o
            float r2 = r2 - r6
            float r6 = java.lang.Math.abs(r2)
            int r6 = (int) r6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "xDif = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", yDif = "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.MMFlipper"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r3, r2)
            int r2 = r5.f214781j
            if (r0 <= r2) goto L_0x006b
            if (r6 >= r2) goto L_0x006b
            r6 = 1
            goto L_0x006c
        L_0x006b:
            r6 = 0
        L_0x006c:
            if (r6 == 0) goto L_0x0071
            r5.f214780i = r1
            goto L_0x0084
        L_0x0071:
            r5.f214780i = r4
            goto L_0x0084
        L_0x0074:
            r5.f214780i = r4
            goto L_0x0084
        L_0x0077:
            r5.f214782n = r3
            r5.f214783o = r6
            android.widget.Scroller r6 = r5.f214775d
            boolean r6 = r6.isFinished()
            r6 = r6 ^ r1
            r5.f214780i = r6
        L_0x0084:
            int r6 = r5.f214780i
            if (r6 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MMFlipper.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        long currentTicks = Util.currentTicks();
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                Log.m105926v("MicroMsg.MMFlipper", "flipper onLayout childWidth:" + measuredWidth);
                int i7 = measuredWidth + i5;
                childAt.layout(i5, 0, i7, childAt.getMeasuredHeight());
                i5 = i7;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("use ");
        sb.append(Util.ticksToNow(currentTicks));
        sb.append(" ms, flipper onLayout changed:");
        boolean z2 = z;
        sb.append(z);
        sb.append(" Left,Top,Right,Bottom:");
        int i8 = i;
        sb.append(i);
        sb.append(",");
        int i9 = i2;
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append(",");
        sb.append(i4);
        Log.m105926v("MicroMsg.MMFlipper", sb.toString());
    }

    public void onMeasure(int i, int i2) {
        long currentTicks = Util.currentTicks();
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        C73164b bVar = this.f214787s;
        if (bVar != null) {
            bVar.mo100336a(size, size2);
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
        scrollTo(this.f214777f * size, 0);
        Log.m105924i("MicroMsg.MMFlipper", "flipper onMeasure:" + size + "," + View.MeasureSpec.getSize(i2) + " childCount:" + childCount + ", use " + Util.ticksToNow(currentTicks));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r0 != 3) goto L_0x0099;
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
            android.view.VelocityTracker r0 = r4.f214776e
            if (r0 != 0) goto L_0x0016
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.f214776e = r0
        L_0x0016:
            android.view.VelocityTracker r0 = r4.f214776e
            r0.addMovement(r5)
            int r0 = r5.getAction()
            float r2 = r5.getX()
            r5.getY()
            if (r0 == 0) goto L_0x008a
            r5 = 0
            if (r0 == r1) goto L_0x003c
            r3 = 2
            if (r0 == r3) goto L_0x0032
            r2 = 3
            if (r0 == r2) goto L_0x003c
            goto L_0x0099
        L_0x0032:
            float r0 = r4.f214782n
            float r0 = r0 - r2
            int r0 = (int) r0
            r4.f214782n = r2
            r4.scrollBy(r0, r5)
            goto L_0x0099
        L_0x003c:
            android.view.VelocityTracker r0 = r4.f214776e
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2)
            float r0 = r0.getXVelocity()
            int r0 = (int) r0
            r2 = 600(0x258, float:8.41E-43)
            if (r0 <= r2) goto L_0x0055
            int r2 = r4.f214777f
            if (r2 <= 0) goto L_0x0055
            int r2 = r2 - r1
            r4.mo101665c(r2)
            goto L_0x0078
        L_0x0055:
            r2 = -600(0xfffffffffffffda8, float:NaN)
            if (r0 >= r2) goto L_0x0069
            int r0 = r4.f214777f
            int r2 = r4.getChildCount()
            int r2 = r2 - r1
            if (r0 >= r2) goto L_0x0069
            int r0 = r4.f214777f
            int r0 = r0 + r1
            r4.mo101665c(r0)
            goto L_0x0078
        L_0x0069:
            int r0 = r4.getWidth()
            int r2 = r4.getScrollX()
            int r3 = r0 / 2
            int r2 = r2 + r3
            int r2 = r2 / r0
            r4.mo101665c(r2)
        L_0x0078:
            android.view.VelocityTracker r0 = r4.f214776e
            if (r0 == 0) goto L_0x0082
            r0.recycle()
            r0 = 0
            r4.f214776e = r0
        L_0x0082:
            r4.f214780i = r5
            r5 = 0
            r4.f214782n = r5
            r4.f214783o = r5
            goto L_0x0099
        L_0x008a:
            android.widget.Scroller r5 = r4.f214775d
            boolean r5 = r5.isFinished()
            if (r5 != 0) goto L_0x0097
            android.widget.Scroller r5 = r4.f214775d
            r5.abortAnimation()
        L_0x0097:
            r4.f214782n = r2
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MMFlipper.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnFlipperViewShowedListener(C73163a aVar) {
        this.f214786r = aVar;
    }

    public void setOnMeasureListener(C73164b bVar) {
        this.f214787s = bVar;
    }

    public void setOnScreenChangedListener(C73165c cVar) {
        this.f214785q = cVar;
    }

    public void setScrollEnable(boolean z) {
        this.f214789u = z;
    }

    public void setToScreen(int i) {
        int max = Math.max(0, Math.min(i, getChildCount() - 1));
        this.f214784p = false;
        if (!this.f214775d.isFinished()) {
            this.f214775d.abortAnimation();
        }
        C73165c cVar = this.f214785q;
        if (cVar != null) {
            cVar.mo65479a(this.f214778g, max, false);
        }
        this.f214778g = this.f214777f;
        this.f214777f = max;
        this.f214779h = max;
        scrollTo(max * getWidth(), 0);
    }

    public MMFlipper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f214780i = 0;
        this.f214784p = false;
        this.f214789u = true;
        mo101664b(context);
    }
}
