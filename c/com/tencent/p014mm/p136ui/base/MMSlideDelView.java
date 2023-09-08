package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.tencent.mm.ui.base.MMSlideDelView */
public class MMSlideDelView extends ViewGroup {

    /* renamed from: d */
    public float f214890d;

    /* renamed from: e */
    public float f214891e;

    /* renamed from: f */
    public final Scroller f214892f;

    /* renamed from: g */
    public VelocityTracker f214893g;

    /* renamed from: h */
    public boolean f214894h = false;

    /* renamed from: i */
    public int f214895i;

    /* renamed from: j */
    public C73188i f214896j;

    /* renamed from: n */
    public C73185e f214897n;

    /* renamed from: o */
    public C73186f f214898o;

    /* renamed from: p */
    public boolean f214899p = false;

    /* renamed from: q */
    public C73184d f214900q;

    /* renamed from: r */
    public boolean f214901r = true;

    /* renamed from: s */
    public Runnable f214902s;

    /* renamed from: t */
    public final int f214903t;

    /* renamed from: u */
    public long f214904u;

    /* renamed from: v */
    public boolean f214905v = false;

    /* renamed from: w */
    public C73183c f214906w = null;

    /* renamed from: x */
    public MMHandler f214907x = new MMHandler();

    /* renamed from: y */
    public long f214908y;

    /* renamed from: com.tencent.mm.ui.base.MMSlideDelView$g */
    public interface C44712g {
        /* renamed from: a */
        void mo69910a(View view);
    }

    /* renamed from: com.tencent.mm.ui.base.MMSlideDelView$a */
    public class C73181a implements C73186f {
        /* renamed from: a */
        public boolean mo97956a() {
            return ((HashSet) C73186f.f214912a).size() > 0;
        }

        /* renamed from: b */
        public void mo97957b() {
            Iterator it = ((HashSet) C73186f.f214912a).iterator();
            while (it.hasNext()) {
                MMSlideDelView mMSlideDelView = (MMSlideDelView) it.next();
                if (mMSlideDelView != null) {
                    mMSlideDelView.mo101784d();
                }
            }
            ((HashSet) C73186f.f214912a).clear();
        }

        /* renamed from: c */
        public void mo97958c() {
            Iterator it = ((HashSet) C73186f.f214912a).iterator();
            while (it.hasNext()) {
                MMSlideDelView mMSlideDelView = (MMSlideDelView) it.next();
                if (mMSlideDelView != null) {
                    mMSlideDelView.mo101782c();
                }
            }
            ((HashSet) C73186f.f214912a).clear();
        }

        /* renamed from: d */
        public void mo97959d(MMSlideDelView mMSlideDelView, boolean z) {
            if (z) {
                ((HashSet) C73186f.f214912a).add(mMSlideDelView);
            } else {
                ((HashSet) C73186f.f214912a).remove(mMSlideDelView);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMSlideDelView$b */
    public class C73182b implements Runnable {
        public C73182b() {
        }

        public void run() {
            MMSlideDelView.this.setPressed(false);
            Log.m105926v("MicroMsg.MMSlideDelView", "onClick");
            MMSlideDelView mMSlideDelView = MMSlideDelView.this;
            mMSlideDelView.f214896j.mo96225a(mMSlideDelView, mMSlideDelView.f214895i, 0);
            MMSlideDelView.this.mo101782c();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMSlideDelView$c */
    public class C73183c extends C73189j implements Runnable {
        public C73183c(C73181a aVar) {
            super((C73181a) null);
        }

        public void run() {
            if ((MMSlideDelView.this.hasWindowFocus() && MMSlideDelView.this.getWindowAttachCount() == this.f214913d) && !MMSlideDelView.this.f214894h) {
                Log.m105924i("MicroMsg.MMSlideDelView", "is long press");
                if (MMSlideDelView.this.getParent() != null) {
                    MMSlideDelView mMSlideDelView = MMSlideDelView.this;
                    mMSlideDelView.f214905v = true;
                    mMSlideDelView.performLongClick();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMSlideDelView$d */
    public class C73184d implements Runnable {
        public C73184d() {
        }

        public void run() {
            Log.m105926v("MicroMsg.MMSlideDelView", "checkfortap");
            MMSlideDelView.this.setPressed(true);
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMSlideDelView$e */
    public interface C73185e {
        /* renamed from: a */
        int mo96224a(View view);
    }

    /* renamed from: com.tencent.mm.ui.base.MMSlideDelView$f */
    public interface C73186f {

        /* renamed from: a */
        public static final Set<MMSlideDelView> f214912a = new HashSet();

        /* renamed from: a */
        boolean mo97956a();

        /* renamed from: b */
        void mo97957b();

        /* renamed from: c */
        void mo97958c();

        /* renamed from: d */
        void mo97959d(MMSlideDelView mMSlideDelView, boolean z);
    }

    /* renamed from: com.tencent.mm.ui.base.MMSlideDelView$h */
    public interface C73187h {
        /* renamed from: a */
        void mo7896a(Object obj);
    }

    /* renamed from: com.tencent.mm.ui.base.MMSlideDelView$i */
    public interface C73188i {
        /* renamed from: a */
        void mo96225a(View view, int i, int i2);
    }

    /* renamed from: com.tencent.mm.ui.base.MMSlideDelView$j */
    public class C73189j {

        /* renamed from: d */
        public int f214913d;

        public C73189j(C73181a aVar) {
        }
    }

    public MMSlideDelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f214892f = new Scroller(context, new LinearInterpolator());
        this.f214903t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f214904u = (long) ViewConfiguration.getLongPressTimeout();
    }

    public static C73186f getItemStatusCallBack() {
        return new C73181a();
    }

    /* renamed from: b */
    public void mo101779b() {
        setPressed(false);
        if (this.f214899p) {
            mo101784d();
            return;
        }
        VelocityTracker velocityTracker = this.f214893g;
        velocityTracker.computeCurrentVelocity(1000);
        int xVelocity = (int) velocityTracker.getXVelocity();
        if (xVelocity < -600) {
            int scrollX = getScrollX();
            int width = getChildAt(1).getWidth() - scrollX;
            this.f214898o.mo97959d(this, true);
            this.f214899p = true;
            this.f214892f.startScroll(scrollX, 0, width, 0, 100);
            invalidate();
        } else if (xVelocity > 600) {
            mo101784d();
        } else {
            int scrollX2 = getScrollX();
            int width2 = getChildAt(1).getWidth();
            int i = width2 - scrollX2;
            if (scrollX2 > width2 / 2) {
                this.f214898o.mo97959d(this, true);
                this.f214899p = true;
                this.f214892f.startScroll(scrollX2, 0, i, 0, 100);
            } else {
                this.f214899p = false;
                this.f214898o.mo97959d(this, false);
                this.f214892f.startScroll(scrollX2, 0, -scrollX2, 0, 100);
            }
            invalidate();
        }
        VelocityTracker velocityTracker2 = this.f214893g;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f214893g = null;
        }
        this.f214894h = false;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public void buildDrawingCache() {
    }

    public void buildDrawingCache(boolean z) {
    }

    /* renamed from: c */
    public void mo101782c() {
        this.f214898o.mo97959d(this, false);
        this.f214899p = false;
        scrollTo(0, 0);
        invalidate();
    }

    public void computeScroll() {
        if (this.f214892f.computeScrollOffset()) {
            scrollTo(this.f214892f.getCurrX(), this.f214892f.getCurrY());
            postInvalidate();
        }
    }

    /* renamed from: d */
    public void mo101784d() {
        int scrollX = getScrollX();
        this.f214898o.mo97959d(this, false);
        this.f214899p = false;
        this.f214892f.startScroll(scrollX, 0, -scrollX, 0, 100);
        invalidate();
    }

    public Bitmap getDrawingCache() {
        return null;
    }

    public Bitmap getDrawingCache(boolean z) {
        return null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() >= 2) {
            int childCount = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8) {
                    int measuredWidth = childAt.getMeasuredWidth() + i5;
                    childAt.layout(i5, 0, measuredWidth, i4 - i2);
                    i5 = measuredWidth;
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (getChildCount() >= 2) {
            int size = View.MeasureSpec.getSize(i);
            try {
                getChildAt(0).measure(i, i2);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            int max = Math.max(0, getChildAt(0).getMeasuredHeight());
            ViewGroup.LayoutParams layoutParams = getChildAt(1).getLayoutParams();
            View childAt = getChildAt(1);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                try {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(max, 1073741824));
                } catch (ArrayIndexOutOfBoundsException unused2) {
                }
                max = Math.max(max, childAt.getMeasuredHeight());
            }
            setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(max, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            boolean r0 = r14.f214901r
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r15.getAction()
            float r2 = r15.getX()
            float r3 = r15.getY()
            com.tencent.mm.ui.base.MMSlideDelView$f r4 = r14.f214898o
            boolean r4 = r4.mo97956a()
            if (r4 == 0) goto L_0x002c
            boolean r4 = r14.f214899p
            if (r4 != 0) goto L_0x002c
            java.lang.String r4 = "MicroMsg.MMSlideDelView"
            java.lang.String r5 = "onTouchEvent a menu has been shown, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r4, r5)
            r14.f214905v = r1
            com.tencent.mm.ui.base.MMSlideDelView$f r4 = r14.f214898o
            r4.mo97957b()
        L_0x002c:
            android.view.VelocityTracker r4 = r14.f214893g
            if (r4 != 0) goto L_0x0036
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r14.f214893g = r4
        L_0x0036:
            android.view.VelocityTracker r4 = r14.f214893g
            r4.addMovement(r15)
            boolean r15 = r14.f214905v
            if (r15 == 0) goto L_0x0040
            return r1
        L_0x0040:
            r15 = 0
            r4 = 1
            if (r0 == 0) goto L_0x01ab
            if (r0 == r4) goto L_0x0149
            r5 = 2
            r6 = 3
            if (r0 == r5) goto L_0x007e
            if (r0 == r6) goto L_0x0057
            com.tencent.mm.sdk.platformtools.MMHandler r15 = r14.f214907x
            if (r15 == 0) goto L_0x0214
            com.tencent.mm.ui.base.MMSlideDelView$c r0 = r14.f214906w
            r15.removeCallbacks(r0)
            goto L_0x0214
        L_0x0057:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r14.f214907x
            if (r0 == 0) goto L_0x0060
            com.tencent.mm.ui.base.MMSlideDelView$d r2 = r14.f214900q
            r0.removeCallbacks(r2)
        L_0x0060:
            r14.setPressed(r1)
            boolean r0 = r14.f214894h
            if (r0 == 0) goto L_0x006a
            r14.mo101779b()
        L_0x006a:
            android.view.VelocityTracker r0 = r14.f214893g
            if (r0 == 0) goto L_0x0073
            r0.clear()
            r14.f214893g = r15
        L_0x0073:
            com.tencent.mm.sdk.platformtools.MMHandler r15 = r14.f214907x
            if (r15 == 0) goto L_0x0214
            com.tencent.mm.ui.base.MMSlideDelView$c r0 = r14.f214906w
            r15.removeCallbacks(r0)
            goto L_0x0214
        L_0x007e:
            float r15 = r14.f214890d
            float r15 = r15 - r2
            int r15 = (int) r15
            float r0 = r14.f214891e
            float r0 = r0 - r3
            int r0 = (int) r0
            int r5 = r14.getScrollX()
            boolean r7 = r14.f214894h
            if (r7 != 0) goto L_0x00ba
            if (r15 >= 0) goto L_0x0091
            goto L_0x00a8
        L_0x0091:
            int r7 = java.lang.Math.abs(r15)
            int r8 = r14.f214903t
            int r8 = r8 / r6
            if (r7 >= r8) goto L_0x009b
            goto L_0x00a8
        L_0x009b:
            if (r0 != 0) goto L_0x009e
            r0 = 1
        L_0x009e:
            int r0 = r15 / r0
            int r0 = java.lang.Math.abs(r0)
            if (r0 <= r6) goto L_0x00a8
            r0 = 1
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            if (r0 != 0) goto L_0x00af
            boolean r0 = r14.f214899p
            if (r0 == 0) goto L_0x00ba
        L_0x00af:
            r14.f214894h = r4
            android.view.ViewParent r0 = r14.getParent()
            if (r0 == 0) goto L_0x00ba
            r0.requestDisallowInterceptTouchEvent(r4)
        L_0x00ba:
            boolean r0 = r14.f214894h
            if (r0 == 0) goto L_0x0143
            android.view.View r0 = r14.getChildAt(r4)
            if (r0 == 0) goto L_0x0108
            boolean r4 = r0.isShown()
            if (r4 != 0) goto L_0x0108
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r4.mo10233c(r6)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/ui/base/MMSlideDelView"
            java.lang.String r9 = "setDelViewShown"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r0
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r4 = r4.mo10231a(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setVisibility(r4)
            java.lang.String r7 = "com/tencent/mm/ui/base/MMSlideDelView"
            java.lang.String r8 = "setDelViewShown"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x0108:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r14.f214907x
            if (r0 == 0) goto L_0x0111
            com.tencent.mm.ui.base.MMSlideDelView$d r4 = r14.f214900q
            r0.removeCallbacks(r4)
        L_0x0111:
            r14.setPressed(r1)
            android.view.ViewParent r0 = r14.getParent()
            r4 = 1
            if (r0 == 0) goto L_0x011e
            r0.requestDisallowInterceptTouchEvent(r4)
        L_0x011e:
            int r0 = r5 + r15
            if (r0 >= 0) goto L_0x0124
            int r15 = -r5
            goto L_0x0137
        L_0x0124:
            android.view.View r6 = r14.getChildAt(r4)
            int r6 = r6.getWidth()
            if (r0 <= r6) goto L_0x0137
            android.view.View r15 = r14.getChildAt(r4)
            int r15 = r15.getWidth()
            int r15 = r15 - r5
        L_0x0137:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r14.f214907x
            if (r0 == 0) goto L_0x0140
            com.tencent.mm.ui.base.MMSlideDelView$c r4 = r14.f214906w
            r0.removeCallbacks(r4)
        L_0x0140:
            r14.scrollBy(r15, r1)
        L_0x0143:
            r14.f214890d = r2
            r14.f214891e = r3
            goto L_0x0214
        L_0x0149:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r14.f214907x
            if (r0 == 0) goto L_0x0152
            com.tencent.mm.ui.base.MMSlideDelView$d r2 = r14.f214900q
            r0.removeCallbacks(r2)
        L_0x0152:
            boolean r0 = r14.f214894h
            if (r0 != 0) goto L_0x018e
            boolean r0 = r14.isPressed()
            if (r0 != 0) goto L_0x0169
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r14.f214908y
            long r2 = r2 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x018e
        L_0x0169:
            com.tencent.mm.ui.base.MMSlideDelView$i r0 = r14.f214896j
            if (r0 == 0) goto L_0x018e
            boolean r0 = r14.f214899p
            if (r0 != 0) goto L_0x018e
            r0 = 1
            r14.setPressed(r0)
            java.lang.Runnable r0 = r14.f214902s
            if (r0 == 0) goto L_0x017c
            r14.removeCallbacks(r0)
        L_0x017c:
            com.tencent.mm.ui.base.MMSlideDelView$b r0 = new com.tencent.mm.ui.base.MMSlideDelView$b
            r0.<init>()
            r14.f214902s = r0
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r14.f214907x
            int r2 = android.view.ViewConfiguration.getPressedStateDuration()
            long r2 = (long) r2
            r1.postDelayed(r0, r2)
            goto L_0x0191
        L_0x018e:
            r14.setPressed(r1)
        L_0x0191:
            boolean r0 = r14.f214894h
            if (r0 == 0) goto L_0x0198
            r14.mo101779b()
        L_0x0198:
            android.view.VelocityTracker r0 = r14.f214893g
            if (r0 == 0) goto L_0x01a1
            r0.clear()
            r14.f214893g = r15
        L_0x01a1:
            com.tencent.mm.sdk.platformtools.MMHandler r15 = r14.f214907x
            if (r15 == 0) goto L_0x0214
            com.tencent.mm.ui.base.MMSlideDelView$c r0 = r14.f214906w
            r15.removeCallbacks(r0)
            goto L_0x0214
        L_0x01ab:
            android.content.Context r0 = r14.getContext()
            boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r0 == 0) goto L_0x01bc
            android.content.Context r0 = r14.getContext()
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            r0.hideVKB()
        L_0x01bc:
            r14.f214894h = r1
            android.widget.Scroller r0 = r14.f214892f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01cb
            android.widget.Scroller r0 = r14.f214892f
            r0.abortAnimation()
        L_0x01cb:
            long r0 = java.lang.System.currentTimeMillis()
            r14.f214908y = r0
            com.tencent.mm.ui.base.MMSlideDelView$e r0 = r14.f214897n
            if (r0 == 0) goto L_0x01db
            int r0 = r0.mo96224a(r14)
            r14.f214895i = r0
        L_0x01db:
            com.tencent.mm.ui.base.MMSlideDelView$d r0 = r14.f214900q
            if (r0 != 0) goto L_0x01e6
            com.tencent.mm.ui.base.MMSlideDelView$d r0 = new com.tencent.mm.ui.base.MMSlideDelView$d
            r0.<init>()
            r14.f214900q = r0
        L_0x01e6:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r14.f214907x
            com.tencent.mm.ui.base.MMSlideDelView$d r1 = r14.f214900q
            int r4 = android.view.ViewConfiguration.getTapTimeout()
            long r4 = (long) r4
            r0.postDelayed(r1, r4)
            r14.f214890d = r2
            r14.f214891e = r3
            com.tencent.mm.ui.base.MMSlideDelView$c r0 = r14.f214906w
            if (r0 != 0) goto L_0x0201
            com.tencent.mm.ui.base.MMSlideDelView$c r0 = new com.tencent.mm.ui.base.MMSlideDelView$c
            r0.<init>(r15)
            r14.f214906w = r0
        L_0x0201:
            com.tencent.mm.ui.base.MMSlideDelView$c r15 = r14.f214906w
            com.tencent.mm.ui.base.MMSlideDelView r0 = com.tencent.p014mm.p136ui.base.MMSlideDelView.this
            int r0 = r0.getWindowAttachCount()
            r15.f214913d = r0
            com.tencent.mm.sdk.platformtools.MMHandler r15 = r14.f214907x
            com.tencent.mm.ui.base.MMSlideDelView$c r0 = r14.f214906w
            long r1 = r14.f214904u
            r15.postDelayed(r0, r1)
        L_0x0214:
            r15 = 1
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MMSlideDelView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onWindowFocusChanged(boolean z) {
        Log.m105926v("MicroMsg.MMSlideDelView", "window focus change, reset long press status");
        this.f214905v = false;
        super.onWindowFocusChanged(z);
    }

    public void setEnable(boolean z) {
        this.f214901r = z;
    }

    public void setGetViewPositionCallback(C73185e eVar) {
        this.f214897n = eVar;
    }

    public void setItemStatusCallBack(C73186f fVar) {
        this.f214898o = fVar;
    }

    public void setOnDelViewShowCallback(C44712g gVar) {
    }

    public void setPerformItemClickListener(C73188i iVar) {
        this.f214896j = iVar;
    }

    public void setView(View view) {
        if (getChildCount() == 2) {
            removeViewAt(0);
        }
        addView(view, 0, new ViewGroup.LayoutParams(-1, -2));
    }
}
