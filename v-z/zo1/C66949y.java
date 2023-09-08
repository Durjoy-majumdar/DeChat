package zo1;

import android.view.View;
import android.view.ViewGroup;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import qj1.C12252b;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49712hj1;

/* renamed from: zo1.y */
public final class C66949y extends C12252b {

    /* renamed from: q */
    public final C58124b f192341q;

    /* renamed from: r */
    public View f192342r;

    /* renamed from: s */
    public boolean f192343s;

    /* renamed from: t */
    public final C13601g f192344t = C36568h.m40985a(new C66952b(this));

    /* renamed from: zo1.y$a */
    public static final class C66950a implements View.OnTouchListener {

        /* renamed from: d */
        public final WeakReference<C66949y> f192345d;

        /* renamed from: e */
        public int f192346e;

        /* renamed from: f */
        public int f192347f;

        /* renamed from: g */
        public boolean f192348g;

        /* renamed from: h */
        public final C13601g f192349h = C36568h.m40985a(new C66951a(this));

        /* renamed from: i */
        public int f192350i;

        /* renamed from: j */
        public int f192351j;

        /* renamed from: zo1.y$a$a */
        public static final class C66951a extends C87413o implements C32224a<Integer> {

            /* renamed from: d */
            public final /* synthetic */ C66950a f192352d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66951a(C66950a aVar) {
                super(0);
                this.f192352d = aVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                r0 = (r0 = r0.f166287d).getContext();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r2 = this;
                    zo1.y$a r0 = r2.f192352d
                    java.lang.ref.WeakReference<zo1.y> r0 = r0.f192345d
                    java.lang.Object r0 = r0.get()
                    zo1.y r0 = (zo1.C66949y) r0
                    if (r0 == 0) goto L_0x001f
                    android.view.ViewGroup r0 = r0.f166287d
                    if (r0 == 0) goto L_0x001f
                    android.content.Context r0 = r0.getContext()
                    if (r0 == 0) goto L_0x001f
                    android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
                    int r0 = r0.getScaledTouchSlop()
                    goto L_0x002e
                L_0x001f:
                    android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.content.res.Resources r0 = r0.getResources()
                    r1 = 2131165371(0x7f0700bb, float:1.7944957E38)
                    int r0 = r0.getDimensionPixelOffset(r1)
                L_0x002e:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: zo1.C66949y.C66950a.C66951a.invoke():java.lang.Object");
            }
        }

        public C66950a(WeakReference<C66949y> weakReference) {
            C87412m.m108594g(weakReference, "rDragPlugin");
            this.f192345d = weakReference;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
            if (r10 != 3) goto L_0x024f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r15, android.view.MotionEvent r16) {
            /*
                r14 = this;
                r6 = r14
                r7 = r16
                java.lang.Class<xo1.f> r8 = xo1.C66388f.class
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r15
                r0.add(r15)
                r0.add(r7)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener"
                java.lang.String r1 = "android/view/View$OnTouchListener"
                java.lang.String r2 = "onTouch"
                java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r4 = r14
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                java.lang.ref.WeakReference<zo1.y> r0 = r6.f192345d
                java.lang.Object r0 = r0.get()
                zo1.y r0 = (zo1.C66949y) r0
                r9 = 0
                if (r0 != 0) goto L_0x003d
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r14
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r9
            L_0x003d:
                boolean r1 = r0.f192343s
                if (r1 == 0) goto L_0x004f
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r14
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r9
            L_0x004f:
                java.lang.Class<zo1.j0> r1 = zo1.C66925j0.class
                qj1.c r1 = r0.mo87687E0(r1)
                zo1.j0 r1 = (zo1.C66925j0) r1
                if (r1 != 0) goto L_0x0067
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r14
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r9
            L_0x0067:
                java.lang.Class<cl1.o> r2 = cl1.C54991o.class
                androidx.lifecycle.i0 r2 = r0.mo87696x0(r2)
                cl1.o r2 = (cl1.C54991o) r2
                boolean r2 = r2.f154286Z
                if (r7 != 0) goto L_0x0084
                r0.mo90936Z0(r9, r9, r9)
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r14
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r9
            L_0x0084:
                cp1.m r3 = r1.f192301r
                if (r3 == 0) goto L_0x008b
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = r3.f165852a
                goto L_0x008c
            L_0x008b:
                r3 = 0
            L_0x008c:
                java.lang.Class<bp1.d> r4 = bp1.C54519d.class
                androidx.lifecycle.i0 r4 = r1.mo87696x0(r4)
                bp1.d r4 = (bp1.C54519d) r4
                int r4 = r4.mo75375i3()
                r5 = 600(0x258, float:8.41E-43)
                if (r4 <= r5) goto L_0x009d
                goto L_0x009e
            L_0x009d:
                r5 = r4
            L_0x009e:
                if (r3 == 0) goto L_0x0279
                if (r4 > 0) goto L_0x00a4
                goto L_0x0279
            L_0x00a4:
                int r10 = r16.getAction()
                r11 = 1
                if (r10 == 0) goto L_0x025d
                java.lang.String r12 = "ReplayScreenDragLazyPlugin"
                if (r10 == r11) goto L_0x01ac
                r13 = 2
                if (r10 == r13) goto L_0x00b7
                r2 = 3
                if (r10 == r2) goto L_0x01ac
                goto L_0x024f
            L_0x00b7:
                int r1 = r16.getPointerCount()
                if (r1 <= r11) goto L_0x00ce
                r0.mo90936Z0(r9, r9, r9)
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r14
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r9
            L_0x00ce:
                float r1 = r16.getX()
                int r1 = (int) r1
                float r7 = r16.getY()
                int r7 = (int) r7
                boolean r10 = r6.f192348g
                if (r10 != 0) goto L_0x0108
                int r10 = r6.f192346e
                int r10 = r1 - r10
                float r10 = (float) r10
                int r13 = r6.f192347f
                int r7 = r7 - r13
                float r7 = (float) r7
                float r10 = r10 / r7
                float r7 = java.lang.Math.abs(r10)
                r10 = 1065353216(0x3f800000, float:1.0)
                int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
                if (r7 <= 0) goto L_0x024f
                int r7 = r6.f192346e
                int r7 = r1 - r7
                int r7 = java.lang.Math.abs(r7)
                rx3.g r10 = r6.f192349h
                rx3.n r10 = (rx3.C36570n) r10
                java.lang.Object r10 = r10.getValue()
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                if (r7 <= r10) goto L_0x024f
            L_0x0108:
                boolean r7 = r6.f192348g
                if (r7 != 0) goto L_0x0157
                int r7 = r3.getCurrentPlaySecond()
                r6.f192350i = r7
                r3.pause()
                java.lang.Class<zo1.o0> r7 = zo1.C66939o0.class
                qj1.c r7 = r0.mo87687E0(r7)
                zo1.o0 r7 = (zo1.C66939o0) r7
                if (r7 == 0) goto L_0x0124
                com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar r7 = r7.f192323r
                r7.setDragging(r11)
            L_0x0124:
                if (r2 != 0) goto L_0x0131
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r7 = r0.mo87685B0(r8)
                xo1.f r7 = (xo1.C66388f) r7
                if (r7 == 0) goto L_0x0131
                r7.mo90487I3(r11)
            L_0x0131:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "onFinderLiveTPProxyTouch: start track move, startTime = "
                r7.append(r8)
                int r8 = r6.f192350i
                r7.append(r8)
                java.lang.String r8 = " videoTotalTime="
                r7.append(r8)
                r7.append(r4)
                java.lang.String r8 = ",maxDragDuration:"
                r7.append(r8)
                r7.append(r5)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
            L_0x0157:
                r6.f192348g = r11
                android.view.ViewGroup r7 = r0.f166287d
                r7.requestDisallowInterceptTouchEvent(r11)
                int r7 = r6.f192346e
                int r1 = r1 - r7
                float r1 = (float) r1
                int r3 = r3.getWidth()
                float r3 = (float) r3
                float r1 = r1 / r3
                int r3 = r6.f192350i
                float r5 = (float) r5
                float r1 = r1 * r5
                int r1 = iy3.C60641c.m70921b(r1)
                int r3 = r3 + r1
                if (r3 >= 0) goto L_0x0175
                goto L_0x0176
            L_0x0175:
                r9 = r3
            L_0x0176:
                r6.f192351j = r9
                java.lang.Class<zo1.o0> r1 = zo1.C66939o0.class
                qj1.c r1 = r0.mo87687E0(r1)
                zo1.o0 r1 = (zo1.C66939o0) r1
                if (r1 == 0) goto L_0x018a
                int r3 = r6.f192351j
                float r3 = (float) r3
                float r5 = (float) r4
                float r3 = r3 / r5
                r1.mo90924Z0(r3)
            L_0x018a:
                java.lang.Class<zo1.o0> r1 = zo1.C66939o0.class
                qj1.c r1 = r0.mo87687E0(r1)
                zo1.o0 r1 = (zo1.C66939o0) r1
                if (r1 == 0) goto L_0x0199
                int r3 = r6.f192351j
                r1.mo90928d1(r3)
            L_0x0199:
                int r1 = r6.f192351j
                r0.mo90936Z0(r1, r4, r2)
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r14
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r11
            L_0x01ac:
                android.view.ViewGroup r2 = r0.f166287d
                r2.requestDisallowInterceptTouchEvent(r9)
                java.lang.Class<zo1.o0> r2 = zo1.C66939o0.class
                qj1.c r2 = r0.mo87687E0(r2)
                zo1.o0 r2 = (zo1.C66939o0) r2
                if (r2 == 0) goto L_0x01c0
                com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar r2 = r2.f192323r
                r2.setDragging(r9)
            L_0x01c0:
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r2 = r0.mo87685B0(r8)
                xo1.f r2 = (xo1.C66388f) r2
                if (r2 == 0) goto L_0x01cb
                r2.mo90485F3()
            L_0x01cb:
                boolean r2 = r6.f192348g
                if (r2 == 0) goto L_0x0204
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onFinderLiveTPProxyTouch: seek end, target time = "
                r2.append(r3)
                int r3 = r6.f192351j
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
                r6.f192348g = r9
                r6.f192350i = r9
                int r2 = r6.f192351j
                r0.mo90936Z0(r2, r4, r9)
                int r0 = r6.f192351j
                double r2 = (double) r0
                r1.mo90917c1(r2, r11)
                r6.f192351j = r9
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r14
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r11
            L_0x0204:
                float r1 = r16.getX()
                int r2 = r6.f192346e
                float r2 = (float) r2
                float r1 = r1 - r2
                float r1 = java.lang.Math.abs(r1)
                rx3.g r2 = r6.f192349h
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                float r2 = (float) r2
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 >= 0) goto L_0x024f
                float r1 = r16.getY()
                int r2 = r6.f192347f
                float r2 = (float) r2
                float r1 = r1 - r2
                float r1 = java.lang.Math.abs(r1)
                rx3.g r2 = r6.f192349h
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                float r2 = (float) r2
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 >= 0) goto L_0x024f
                java.lang.String r1 = "onFinderLiveTPProxyTouch: performClick"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
                r3.performClick()
                int r1 = r6.f192351j
                r0.mo90936Z0(r1, r4, r9)
            L_0x024f:
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r14
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r9
            L_0x025d:
                float r0 = r16.getX()
                int r0 = (int) r0
                r6.f192346e = r0
                float r0 = r16.getY()
                int r0 = (int) r0
                r6.f192347f = r0
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r14
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r11
            L_0x0279:
                r6.f192348g = r9
                r6.f192350i = r9
                r6.f192351j = r9
                r0.mo90936Z0(r9, r9, r9)
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r14
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: zo1.C66949y.C66950a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: zo1.y$b */
    public static final class C66952b extends C87413o implements C32224a<C66950a> {

        /* renamed from: d */
        public final /* synthetic */ C66949y f192353d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66952b(C66949y yVar) {
            super(0);
            this.f192353d = yVar;
        }

        public Object invoke() {
            return new C66950a(new WeakReference(this.f192353d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66949y(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "mustVisibleRoot");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f192341q = bVar;
    }

    /* JADX WARNING: type inference failed for: r11v4, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90936Z0(int r11, int r12, boolean r13) {
        /*
            r10 = this;
            r0 = 0
            if (r13 != 0) goto L_0x004d
            android.view.View r11 = r10.f192342r
            if (r11 != 0) goto L_0x0009
            goto L_0x00c6
        L_0x0009:
            r12 = 8
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.mo10233c(r12)
            java.lang.Object[] r2 = r13.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin"
            java.lang.String r4 = "onSeekTime"
            java.lang.String r5 = "(IIZ)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r11
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r12 = r13.mo10231a(r0)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.setVisibility(r12)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin"
            java.lang.String r3 = "onSeekTime"
            java.lang.String r4 = "(IIZ)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00c6
        L_0x004d:
            vo1.i0 r13 = vo1.C65799i0.f189246a
            java.lang.String r11 = r13.mo89847b(r11)
            java.lang.String r12 = r13.mo89847b(r12)
            android.view.View r13 = r10.f192342r
            r1 = 0
            if (r13 == 0) goto L_0x0066
            r2 = 2131300628(0x7f091114, float:1.821929E38)
            android.view.View r13 = r13.findViewById(r2)
            android.widget.TextView r13 = (android.widget.TextView) r13
            goto L_0x0067
        L_0x0066:
            r13 = r1
        L_0x0067:
            if (r13 != 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            r13.setText(r11)
        L_0x006d:
            android.view.View r11 = r10.f192342r
            if (r11 == 0) goto L_0x007b
            r13 = 2131315570(0x7f094b72, float:1.8249597E38)
            android.view.View r11 = r11.findViewById(r13)
            r1 = r11
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x007b:
            if (r1 != 0) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            r1.setText(r12)
        L_0x0081:
            android.view.View r11 = r10.f192342r
            if (r11 != 0) goto L_0x0086
            goto L_0x00c6
        L_0x0086:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r12.mo10233c(r13)
            java.lang.Object[] r3 = r12.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin"
            java.lang.String r5 = "onSeekTime"
            java.lang.String r6 = "(IIZ)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r11
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r12 = r12.mo10231a(r0)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.setVisibility(r12)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin"
            java.lang.String r4 = "onSeekTime"
            java.lang.String r5 = "(IIZ)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zo1.C66949y.mo90936Z0(int, int, boolean):void");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }
}
