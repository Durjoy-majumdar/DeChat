package com.tencent.p014mm.ext.p313ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ext.p313ui.C104623b;
import com.tencent.p014mm.ext.p313ui.C17733d;
import com.tencent.p014mm.ext.p313ui.C80847a;
import java.util.WeakHashMap;
import p1005ma.C88718b;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.ext.ui.SwipeBackLayout */
public class SwipeBackLayout extends FrameLayout {

    /* renamed from: A */
    public Handler f48787A;

    /* renamed from: B */
    public boolean f48788B;

    /* renamed from: C */
    public boolean f48789C;

    /* renamed from: D */
    public C17731b f48790D;

    /* renamed from: d */
    public float f48791d;

    /* renamed from: e */
    public boolean f48792e;

    /* renamed from: f */
    public int f48793f;

    /* renamed from: g */
    public int f48794g;

    /* renamed from: h */
    public boolean f48795h;

    /* renamed from: i */
    public boolean f48796i;

    /* renamed from: j */
    public View f48797j;

    /* renamed from: n */
    public C17733d f48798n;

    /* renamed from: o */
    public float f48799o;

    /* renamed from: p */
    public Drawable f48800p;

    /* renamed from: q */
    public float f48801q;

    /* renamed from: r */
    public Rect f48802r;

    /* renamed from: s */
    public boolean f48803s;

    /* renamed from: t */
    public boolean f48804t;

    /* renamed from: u */
    public boolean f48805u;

    /* renamed from: v */
    public boolean f48806v;

    /* renamed from: w */
    public boolean f48807w;

    /* renamed from: x */
    public boolean f48808x;

    /* renamed from: y */
    public boolean f48809y;

    /* renamed from: z */
    public Drawable f48810z;

    /* renamed from: com.tencent.mm.ext.ui.SwipeBackLayout$d */
    public class C17725d extends C17733d.C17735b implements C80847a.C80849b {

        /* renamed from: a */
        public int f48811a = 0;

        /* renamed from: b */
        public int f48812b = 0;

        /* renamed from: com.tencent.mm.ext.ui.SwipeBackLayout$d$a */
        public class C17726a implements Runnable {
            public C17726a() {
            }

            public void run() {
                if (SwipeBackLayout.this.f48790D != null) {
                    C88718b.m110681c("MicroMsg.SwipeBackLayout", "ashutest:: on popOut", new Object[0]);
                    if (SwipeBackLayout.this.getContext() instanceof Activity) {
                        SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
                        if (swipeBackLayout.f48810z != null) {
                            if (swipeBackLayout.f48789C) {
                                ((Activity) swipeBackLayout.getContext()).getWindow().getDecorView().setBackground(SwipeBackLayout.this.f48810z);
                            }
                            SwipeBackLayout.this.f48810z = null;
                        }
                    }
                    ((SwipeBackActivity) SwipeBackLayout.this.f48790D).onSwipeBack();
                }
                SwipeBackLayout.this.f48807w = false;
            }
        }

        /* renamed from: com.tencent.mm.ext.ui.SwipeBackLayout$d$b */
        public class C17727b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f48815d;

            /* renamed from: com.tencent.mm.ext.ui.SwipeBackLayout$d$b$a */
            public class C17728a implements C104623b.C104625b {
                public C17728a() {
                }

                /* renamed from: a */
                public void mo21287a() {
                    onAnimationEnd();
                }

                /* renamed from: b */
                public void mo21288b() {
                }

                public void onAnimationEnd() {
                    SwipeBackLayout.this.f48807w = false;
                }

                public void onAnimationStart() {
                }
            }

            /* renamed from: com.tencent.mm.ext.ui.SwipeBackLayout$d$b$b */
            public class C17729b implements C104623b.C104625b {

                /* renamed from: com.tencent.mm.ext.ui.SwipeBackLayout$d$b$b$a */
                public class C17730a implements Runnable {
                    public C17730a() {
                    }

                    public void run() {
                        SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
                        if (swipeBackLayout.f48790D != null) {
                            if (swipeBackLayout.getContext() instanceof Activity) {
                                SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
                                if (swipeBackLayout2.f48810z != null) {
                                    if (swipeBackLayout2.f48789C) {
                                        ((Activity) swipeBackLayout2.getContext()).getWindow().getDecorView().setBackground(SwipeBackLayout.this.f48810z);
                                    }
                                    SwipeBackLayout.this.f48810z = null;
                                }
                            }
                            ((SwipeBackActivity) SwipeBackLayout.this.f48790D).onSwipeBack();
                            C88718b.m110679a("MicroMsg.SwipeBackLayout", "ashutest:: on onSwipeBack", new Object[0]);
                        }
                        C114718c.m161370b(1.0f);
                        SwipeBackLayout.this.f48807w = false;
                    }
                }

                public C17729b() {
                }

                /* renamed from: a */
                public void mo21287a() {
                    onAnimationEnd();
                }

                /* renamed from: b */
                public void mo21288b() {
                }

                public void onAnimationEnd() {
                    SwipeBackLayout.this.f48806v = true;
                    new Handler().post(new C17730a());
                }

                public void onAnimationStart() {
                }
            }

            public C17727b(boolean z) {
                this.f48815d = z;
            }

            public void run() {
                C88718b.m110681c("MicroMsg.SwipeBackLayout", "on Complete, result %B, releaseLeft %d", Boolean.valueOf(this.f48815d), Integer.valueOf(C17725d.this.f48812b));
                C17725d dVar = C17725d.this;
                SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
                boolean z = this.f48815d;
                swipeBackLayout.f48804t = z;
                if (!z) {
                    swipeBackLayout.f48807w = false;
                } else if (dVar.f48812b > 0) {
                    C114718c.m161370b(0.0f);
                } else {
                    C114718c.m161370b(1.0f);
                }
                SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
                boolean z2 = this.f48815d;
                swipeBackLayout2.getClass();
                C88718b.m110681c("MicroMsg.SwipeBackLayout", "ashutest::markTranslucent %B", Boolean.valueOf(z2));
                swipeBackLayout2.f48805u = z2;
                if (this.f48815d) {
                    C17725d dVar2 = C17725d.this;
                    SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
                    if (swipeBackLayout3.f48808x) {
                        int i = dVar2.f48812b;
                        if (i == 0) {
                            C104623b.m140236a(swipeBackLayout3.f48797j, 200, 0.0f, 0.0f, new C17728a());
                        } else {
                            C104623b.m140236a(swipeBackLayout3.f48797j, 200, (float) i, 0.0f, new C17729b());
                            C114718c.m161369a(true, C17725d.this.f48812b);
                        }
                    }
                }
                SwipeBackLayout.this.f48808x = false;
            }
        }

        public C17725d(C17724a aVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo21283a(android.view.View r4, int r5, int r6, int r7, int r8) {
            /*
                r3 = this;
                com.tencent.mm.ext.ui.SwipeBackLayout r4 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
                boolean r7 = r4.f48805u
                java.lang.String r8 = "MicroMsg.SwipeBackLayout"
                r0 = 0
                if (r7 != 0) goto L_0x0011
                java.lang.Object[] r4 = new java.lang.Object[r0]
                java.lang.String r5 = "[onViewPositionChanged] mHasTranslucent is false"
                p1005ma.C88718b.m110682d(r8, r5, r4)
                return
            L_0x0011:
                float r7 = (float) r5
                android.view.View r1 = r4.f48797j
                int r1 = r1.getWidth()
                com.tencent.mm.ext.ui.SwipeBackLayout r2 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
                android.graphics.drawable.Drawable r2 = r2.f48800p
                int r2 = r2.getIntrinsicWidth()
                int r1 = r1 + r2
                float r1 = (float) r1
                float r7 = r7 / r1
                float r7 = java.lang.Math.abs(r7)
                r4.f48799o = r7
                com.tencent.mm.ext.ui.SwipeBackLayout r4 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
                r4.f48793f = r5
                r4.f48794g = r6
                r4.invalidate()
                com.tencent.mm.ext.ui.SwipeBackLayout r4 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
                r4.getClass()
                com.tencent.mm.ext.ui.SwipeBackLayout r4 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
                float r4 = r4.f48799o
                r5 = 1065353216(0x3f800000, float:1.0)
                int r4 = java.lang.Float.compare(r4, r5)
                r5 = 1
                if (r4 < 0) goto L_0x0057
                com.tencent.mm.ext.ui.SwipeBackLayout r4 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
                boolean r6 = r4.f48806v
                if (r6 != 0) goto L_0x0057
                r4.f48806v = r5
                android.os.Handler r4 = r4.f48787A
                com.tencent.mm.ext.ui.SwipeBackLayout$d$a r6 = new com.tencent.mm.ext.ui.SwipeBackLayout$d$a
                r6.<init>()
                r4.post(r6)
                goto L_0x0082
            L_0x0057:
                com.tencent.mm.ext.ui.SwipeBackLayout r4 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
                float r4 = r4.f48799o
                r6 = 1008981770(0x3c23d70a, float:0.01)
                int r4 = java.lang.Float.compare(r4, r6)
                if (r4 > 0) goto L_0x0082
                com.tencent.mm.ext.ui.SwipeBackLayout r4 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
                r4.f48807w = r0
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]
                float r4 = r4.f48799o
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r6[r0] = r4
                com.tencent.mm.ext.ui.SwipeBackLayout r4 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
                boolean r4 = r4.f48806v
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r6[r5] = r4
                java.lang.String r4 = "[onViewPositionChanged] mScrollPercent:%s mHasCallPopOut:%s"
                p1005ma.C88718b.m110682d(r8, r4, r6)
            L_0x0082:
                com.tencent.mm.ext.ui.SwipeBackLayout r4 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
                com.tencent.mm.ext.ui.d r6 = r4.f48798n
                int r6 = r6.f48820a
                if (r6 != r5) goto L_0x008f
                float r4 = r4.f48799o
                com.tencent.p014mm.ext.p313ui.C114718c.m161370b(r4)
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.ext.p313ui.SwipeBackLayout.C17725d.mo21283a(android.view.View, int, int, int, int):void");
        }

        public void onComplete(boolean z) {
            SwipeBackLayout.this.f48787A.post(new C17727b(z));
        }
    }

    /* renamed from: com.tencent.mm.ext.ui.SwipeBackLayout$b */
    public interface C17731b {
    }

    /* renamed from: com.tencent.mm.ext.ui.SwipeBackLayout$c */
    public interface C17732c {
        /* renamed from: a */
        void mo21292a(MotionEvent motionEvent);

        /* renamed from: b */
        int mo21293b(boolean z);

        /* renamed from: h */
        void mo21294h(int i, int i2, int i3, int i4, float f);
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo21265a() {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(getContext(), C0966R.C0968anim.f2435cy);
        C17733d dVar = new C17733d(getContext(), this, new C17725d((C17724a) null), loadInterpolator);
        this.f48798n = dVar;
        dVar.f48835p = 1;
        float f = getResources().getDisplayMetrics().density;
        C17733d dVar2 = this.f48798n;
        dVar2.f48833n = 100.0f * f;
        dVar2.f48832m = f * 300.0f;
        this.f48793f = 0;
        this.f48794g = 0;
    }

    public void computeScroll() {
        this.f48801q = Math.max(0.0f, 1.0f - this.f48799o);
        C17733d dVar = this.f48798n;
        if (dVar.f48820a == 2) {
            boolean computeScrollOffset = dVar.f48836q.f306426a.computeScrollOffset();
            int currX = dVar.f48836q.f306426a.getCurrX();
            int b = dVar.f48836q.mo145036b();
            int left = currX - dVar.f48838s.getLeft();
            int top = b - dVar.f48838s.getTop();
            if (left != 0) {
                dVar.f48838s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                dVar.f48838s.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                dVar.f48837r.mo21283a(dVar.f48838s, currX, b, left, top);
            }
            if (computeScrollOffset && currX == dVar.f48836q.f306426a.getFinalX() && b == dVar.f48836q.f306426a.getFinalY()) {
                dVar.f48836q.mo145035a();
                computeScrollOffset = dVar.f48836q.mo145037c();
            }
            if (!computeScrollOffset) {
                dVar.f48840u.post(dVar.f48841v);
            }
        }
        if (dVar.f48820a == 2) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048 A[SYNTHETIC, Splitter:B:25:0x0048] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.SwipeBackLayout"
            boolean r1 = r6.f48796i
            if (r1 == 0) goto L_0x000b
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        L_0x000b:
            boolean r1 = r6.f48795h
            if (r1 != 0) goto L_0x0014
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        L_0x0014:
            int r1 = r7.getAction()
            r2 = 0
            if (r1 != 0) goto L_0x001d
            r6.f48788B = r2
        L_0x001d:
            boolean r1 = r6.f48788B
            if (r1 == 0) goto L_0x0026
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        L_0x0026:
            boolean r1 = r6.f48807w
            r3 = 1
            if (r1 != 0) goto L_0x002c
            goto L_0x003e
        L_0x002c:
            android.view.View r1 = r6.f48797j
            int r1 = r1.getLeft()
            float r1 = (float) r1
            r4 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = java.lang.Float.compare(r1, r4)
            if (r1 > 0) goto L_0x0040
            r6.f48807w = r2
        L_0x003e:
            r1 = 0
            goto L_0x0041
        L_0x0040:
            r1 = 1
        L_0x0041:
            if (r1 == 0) goto L_0x0048
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        L_0x0048:
            com.tencent.mm.ext.ui.d r1 = r6.f48798n     // Catch:{ NullPointerException -> 0x009d, IllegalArgumentException -> 0x008e, ArrayIndexOutOfBoundsException -> 0x007f, IllegalStateException -> 0x0070 }
            int r4 = r1.f48820a     // Catch:{ NullPointerException -> 0x009d, IllegalArgumentException -> 0x008e, ArrayIndexOutOfBoundsException -> 0x007f, IllegalStateException -> 0x0070 }
            if (r4 != r3) goto L_0x0052
            r1.mo21301g(r7)     // Catch:{ NullPointerException -> 0x009d, IllegalArgumentException -> 0x008e, ArrayIndexOutOfBoundsException -> 0x007f, IllegalStateException -> 0x0070 }
            return r3
        L_0x0052:
            boolean r1 = r1.mo21307m(r7)     // Catch:{ NullPointerException -> 0x009d, IllegalArgumentException -> 0x008e, ArrayIndexOutOfBoundsException -> 0x007f, IllegalStateException -> 0x0070 }
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = "changelcai"
            java.lang.String r4 = "shouldInterceptTouchEvent %s"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ NullPointerException -> 0x009d, IllegalArgumentException -> 0x008e, ArrayIndexOutOfBoundsException -> 0x007f, IllegalStateException -> 0x0070 }
            r5[r2] = r7     // Catch:{ NullPointerException -> 0x009d, IllegalArgumentException -> 0x008e, ArrayIndexOutOfBoundsException -> 0x007f, IllegalStateException -> 0x0070 }
            p1005ma.C88718b.m110681c(r1, r4, r5)     // Catch:{ NullPointerException -> 0x009d, IllegalArgumentException -> 0x008e, ArrayIndexOutOfBoundsException -> 0x007f, IllegalStateException -> 0x0070 }
            r1 = 3
            r7.setAction(r1)     // Catch:{ NullPointerException -> 0x009d, IllegalArgumentException -> 0x008e, ArrayIndexOutOfBoundsException -> 0x007f, IllegalStateException -> 0x0070 }
            super.dispatchTouchEvent(r7)     // Catch:{ NullPointerException -> 0x009d, IllegalArgumentException -> 0x008e, ArrayIndexOutOfBoundsException -> 0x007f, IllegalStateException -> 0x0070 }
            return r3
        L_0x006c:
            super.dispatchTouchEvent(r7)     // Catch:{ NullPointerException -> 0x009d, IllegalArgumentException -> 0x008e, ArrayIndexOutOfBoundsException -> 0x007f, IllegalStateException -> 0x0070 }
            return r3
        L_0x0070:
            r7 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r7 = r7.toString()
            r1[r2] = r7
            java.lang.String r7 = "got an IllegalStateException: %s"
            p1005ma.C88718b.m110680b(r0, r7, r1)
            return r2
        L_0x007f:
            r7 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r7 = r7.toString()
            r1[r2] = r7
            java.lang.String r7 = "got an ArrayIndexOutOfBoundsException: %s"
            p1005ma.C88718b.m110680b(r0, r7, r1)
            return r2
        L_0x008e:
            r7 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r7 = r7.toString()
            r1[r2] = r7
            java.lang.String r7 = "got an IllegalArgumentException: %s"
            p1005ma.C88718b.m110680b(r0, r7, r1)
            return r2
        L_0x009d:
            r7 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r7 = r7.toString()
            r1[r2] = r7
            java.lang.String r7 = "got an NullPointerException: %s"
            p1005ma.C88718b.m110680b(r0, r7, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.ext.p313ui.SwipeBackLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = view == this.f48797j;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (Float.compare(this.f48801q, 0.0f) > 0 && z && this.f48798n.f48820a != 0) {
            Rect rect = this.f48802r;
            view.getHitRect(rect);
            Drawable drawable = this.f48800p;
            drawable.setBounds(rect.left - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
            this.f48800p.setAlpha((int) (this.f48801q * 255.0f));
            this.f48800p.draw(canvas);
            C88718b.m110681c("MicroMsg.SwipeBackLayout", "shadow left:%d top:%d right:%d bootom:%d", Integer.valueOf(this.f48800p.getBounds().left), Integer.valueOf(this.f48800p.getBounds().top), Integer.valueOf(this.f48800p.getBounds().right), Integer.valueOf(this.f48800p.getBounds().bottom));
        }
        return drawChild;
    }

    public View getTargetContentView() {
        return this.f48797j;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f48797j = this;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f48792e = true;
        View view = this.f48797j;
        if (view != null) {
            int i5 = this.f48793f;
            view.layout(i5, this.f48794g, view.getMeasuredWidth() + i5, this.f48794g + this.f48797j.getMeasuredHeight());
        }
        this.f48792e = false;
    }

    public void onMeasure(int i, int i2) {
        View view;
        if (this.f48809y && (view = this.f48797j) != null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        super.onMeasure(i, i2);
    }

    public void requestLayout() {
        if (!this.f48792e) {
            super.requestLayout();
        }
    }

    public void setContentView(View view) {
        this.f48797j = view;
    }

    public void setEnableGesture(boolean z) {
        this.f48795h = z;
    }

    public void setForceDisEnable(boolean z) {
        this.f48796i = z;
    }

    public void setFullscreen(boolean z) {
        this.f48809y = z;
    }

    public void setNeedChangeWindowBackground(boolean z) {
        this.f48789C = z;
    }

    public void setNeedRequestActivityTranslucent(boolean z) {
        this.f48803s = z;
        if (z) {
            this.f48804t = false;
        }
    }

    public void setOnceDisEnableGesture(boolean z) {
        C88718b.m110681c("MicroMsg.SwipeBackLayout", "[setOnceDisEnableGesture] enable:%s", Boolean.valueOf(z));
        this.f48788B = z;
    }

    public void setSwipeBackListener(C17732c cVar) {
    }

    public void setSwipeGestureDelegate(C17731b bVar) {
        this.f48790D = bVar;
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f48791d = 0.3f;
        this.f48795h = true;
        this.f48796i = false;
        this.f48802r = new Rect();
        this.f48803s = true;
        this.f48804t = false;
        this.f48805u = false;
        this.f48806v = false;
        this.f48807w = false;
        this.f48808x = false;
        this.f48809y = false;
        this.f48787A = new Handler(Looper.getMainLooper());
        this.f48789C = true;
        this.f48790D = null;
        this.f48800p = getResources().getDrawable(C0966R.C0969drawable.bqb);
        setFocusable(true);
        setDescendantFocusability(262144);
        mo21265a();
    }
}
