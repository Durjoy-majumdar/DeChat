package qj1;

import a14.C53872d1;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54116w;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import c30.C104289g;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback;
import com.tencent.p014mm.plugin.finder.live.multistream.MultiStreamRecyclerView;
import com.tencent.p014mm.plugin.finder.live.sidebar.FinderLiveSideBar;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dk1.C58312g;
import f14.C58901s;
import f50.C58924d;
import fy3.C32224a;
import fy3.C32226l;
import g50.C107744b;
import g50.C107754k;
import g50.C59363a;
import g50.C59364c;
import gy3.C87412m;
import gy3.C87413o;
import h50.C108147c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import nk1.C11207i;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import wx3.C15601d;

/* renamed from: qj1.zd */
public final class C63163zd extends C62660c implements C107754k {

    /* renamed from: A */
    public boolean f179224A;

    /* renamed from: p */
    public final C58124b f179225p;

    /* renamed from: q */
    public FinderLiveInterceptTouchRelativeLayout f179226q;

    /* renamed from: r */
    public long f179227r;

    /* renamed from: s */
    public long f179228s;

    /* renamed from: t */
    public LinkedList<View.OnTouchListener> f179229t;

    /* renamed from: u */
    public final C13601g f179230u;

    /* renamed from: v */
    public C53973z1 f179231v;

    /* renamed from: w */
    public View f179232w;

    /* renamed from: x */
    public MultiStreamRecyclerView f179233x;

    /* renamed from: y */
    public int f179234y;

    /* renamed from: z */
    public boolean f179235z;

    /* renamed from: qj1.zd$a */
    public static final class C63164a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C63163zd f179236d;

        public C63164a(C63163zd zdVar) {
            this.f179236d = zdVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                this.f179236d.f179228s = SystemClock.elapsedRealtime();
            } else if (valueOf != null && valueOf.intValue() == 1) {
                if (this.f179236d.f179228s > 0 && SystemClock.elapsedRealtime() - this.f179236d.f179228s <= ((long) ViewConfiguration.getTapTimeout())) {
                    this.f179236d.mo88085d1((Boolean) null);
                }
                this.f179236d.f179228s = -1;
            }
            C63163zd.m74507Z0(this.f179236d, motionEvent);
            LinkedList<View.OnTouchListener> linkedList = this.f179236d.f179229t;
            if (linkedList != null) {
                for (View.OnTouchListener onTouch : linkedList) {
                    onTouch.onTouch(view, motionEvent);
                }
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: qj1.zd$b */
    public static final class C63165b extends C87413o implements C32226l<MotionEvent, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63163zd f179237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63165b(C63163zd zdVar) {
            super(1);
            this.f179237d = zdVar;
        }

        public Object invoke(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            MultiStreamRecyclerView multiStreamRecyclerView = this.f179237d.f179233x;
            boolean z = true;
            if (multiStreamRecyclerView == null || !multiStreamRecyclerView.isShown()) {
                z = false;
            }
            if (z) {
                C63163zd.m74507Z0(this.f179237d, motionEvent);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.zd$c */
    public static final class C63166c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C63163zd f179238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63166c(C63163zd zdVar) {
            super(0);
            this.f179238d = zdVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f179238d.f179226q.getInterceptTouch());
        }
    }

    /* renamed from: qj1.zd$d */
    public static final class C63167d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63163zd f179239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63167d(C63163zd zdVar) {
            super(0);
            this.f179239d = zdVar;
        }

        public Object invoke() {
            C63163zd zdVar = this.f179239d;
            if (!zdVar.f179235z) {
                zdVar.mo88085d1((Boolean) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.zd$e */
    public static final class C63168e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63163zd f179240d;

        public C63168e(C63163zd zdVar) {
            this.f179240d = zdVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f179240d.mo88085d1((Boolean) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.zd$f */
    public static final class C63169f extends C87413o implements C32224a<Vibrator> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f179241d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63169f(ViewGroup viewGroup) {
            super(0);
            this.f179241d = viewGroup;
        }

        public Object invoke() {
            Object systemService = this.f179241d.getContext().getSystemService("vibrator");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            return (Vibrator) systemService;
        }
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C63163zd(android.view.ViewGroup r4, d60.C58124b r5) {
        /*
            r3 = this;
            java.lang.String r0 = "root"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "statusMonitor"
            gy3.C87412m.m108594g(r5, r0)
            r0 = 0
            r3.<init>(r4, r5, r0)
            r3.f179225p = r5
            boolean r1 = r4 instanceof com.tencent.p014mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout
            if (r1 == 0) goto L_0x0019
            r1 = r4
            com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout r1 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout) r1
            goto L_0x0027
        L_0x0019:
            r1 = 2131304241(0x7f091f31, float:1.822662E38)
            android.view.View r1 = r4.findViewById(r1)
            java.lang.String r2 = "root.findViewById(R.id.f…ive_screen_clear_ui_root)"
            gy3.C87412m.m108593f(r1, r2)
            com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout r1 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout) r1
        L_0x0027:
            r3.f179226q = r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3.f179227r = r1
            r1 = -1
            r3.f179228s = r1
            qj1.zd$f r1 = new qj1.zd$f
            r1.<init>(r4)
            rx3.g r1 = rx3.C36568h.m40985a(r1)
            r3.f179230u = r1
            boolean r1 = r5 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0046
            r1 = r5
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x0047
        L_0x0046:
            r1 = r0
        L_0x0047:
            if (r1 == 0) goto L_0x0051
            r2 = 2131303487(0x7f091c3f, float:1.822509E38)
            android.view.View r1 = r1.findViewById(r2)
            goto L_0x0052
        L_0x0051:
            r1 = r0
        L_0x0052:
            r3.f179232w = r1
            boolean r1 = r5 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x005b
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x005c
        L_0x005b:
            r5 = r0
        L_0x005c:
            if (r5 == 0) goto L_0x0068
            r0 = 2131307823(0x7f092d2f, float:1.8233884E38)
            android.view.View r5 = r5.findViewById(r0)
            r0 = r5
            com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView r0 = (com.tencent.p014mm.plugin.finder.live.multistream.MultiStreamRecyclerView) r0
        L_0x0068:
            r3.f179233x = r0
            r5 = 1
            r3.f179234y = r5
            r3.f179235z = r5
            com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout r5 = r3.f179226q
            qj1.zd$a r0 = new qj1.zd$a
            r0.<init>(r3)
            r5.setOnTouchListener(r0)
            com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView r5 = r3.f179233x
            if (r5 == 0) goto L_0x008b
            qj1.zd$b r0 = new qj1.zd$b
            r0.<init>(r3)
            qj1.zd$c r1 = new qj1.zd$c
            r1.<init>(r3)
            r5.f159455N1 = r0
            r5.f159456O1 = r1
        L_0x008b:
            r5 = 4
            r4.setImportantForAccessibility(r5)
            android.content.Context r5 = r4.getContext()
            r0 = 2131828745(0x7f112009, float:1.929044E38)
            java.lang.String r5 = r5.getString(r0)
            r4.setContentDescription(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63163zd.<init>(android.view.ViewGroup, d60.b):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m74507Z0(qj1.C63163zd r6, android.view.MotionEvent r7) {
        /*
            java.lang.Class<qj1.ze> r0 = qj1.C63170ze.class
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r2 = r6.mo87696x0(r1)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo76007j4()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0066
            androidx.lifecycle.i0 r2 = r6.mo87696x0(r1)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo76007j4()
            if (r2 != 0) goto L_0x0020
            goto L_0x0128
        L_0x0020:
            if (r7 == 0) goto L_0x0128
            qj1.c r0 = r6.mo87687E0(r0)
            qj1.ze r0 = (qj1.C63170ze) r0
            if (r0 == 0) goto L_0x002f
            f50.d r0 = r0.mo88091c1()
            goto L_0x0030
        L_0x002f:
            r0 = r3
        L_0x0030:
            androidx.lifecycle.i0 r6 = r6.mo87696x0(r1)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.f154286Z
            if (r6 == 0) goto L_0x004e
            boolean r6 = r0 instanceof g50.C59364c
            if (r6 == 0) goto L_0x0041
            r3 = r0
            g50.c r3 = (g50.C59364c) r3
        L_0x0041:
            if (r3 == 0) goto L_0x004e
            g50.a r6 = r3.mo84474d()
            if (r6 == 0) goto L_0x004e
            g50.b r6 = (g50.C107744b) r6
            r6.mo158158h(r7)
        L_0x004e:
            int r6 = r7.getActionMasked()
            if (r6 != r4) goto L_0x0128
            java.lang.Class<ak1.w> r6 = ak1.C54116w.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ak1.w r6 = (ak1.C54116w) r6
            r7 = 6
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6.Cy0(r7)
            goto L_0x0128
        L_0x0066:
            int r2 = r6.f179234y
            if (r2 != r4) goto L_0x0128
            boolean r2 = r6.f179224A
            if (r2 == 0) goto L_0x0070
            goto L_0x0128
        L_0x0070:
            if (r7 == 0) goto L_0x0128
            qj1.c r0 = r6.mo87687E0(r0)
            qj1.ze r0 = (qj1.C63170ze) r0
            if (r0 == 0) goto L_0x007f
            f50.d r0 = r0.mo88091c1()
            goto L_0x0080
        L_0x007f:
            r0 = r3
        L_0x0080:
            boolean r2 = r0 instanceof g50.C59364c
            if (r2 == 0) goto L_0x0087
            r3 = r0
            g50.c r3 = (g50.C59364c) r3
        L_0x0087:
            if (r3 == 0) goto L_0x0128
            com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout r0 = r6.f179226q
            g50.a r2 = r3.mo84474d()
            r5 = 0
            if (r2 == 0) goto L_0x00a0
            g50.b r2 = (g50.C107744b) r2
            h50.c r2 = r2.f322449y
            if (r2 == 0) goto L_0x009b
            boolean r2 = r2.f323847c
            goto L_0x009c
        L_0x009b:
            r2 = 0
        L_0x009c:
            if (r2 != r4) goto L_0x00a0
            r2 = 1
            goto L_0x00a1
        L_0x00a0:
            r2 = 0
        L_0x00a1:
            r0.setInterceptTouch(r2)
            com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout r0 = r6.f179226q
            boolean r0 = r0.getInterceptTouch()
            if (r0 == 0) goto L_0x00d1
            androidx.lifecycle.i0 r0 = r6.mo87696x0(r1)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154286Z
            if (r0 != 0) goto L_0x00cc
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.mo88085d1(r0)
            rx3.g r0 = r6.f179230u
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            r1 = 50
            r0.vibrate(r1)
            r6.f179235z = r5
        L_0x00cc:
            com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout r0 = r6.f179226q
            r0.requestDisallowInterceptTouchEvent(r4)
        L_0x00d1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handlePlayerEvent pointerCount: "
            r0.append(r1)
            int r1 = r7.getPointerCount()
            r0.append(r1)
            java.lang.String r1 = " action: "
            r0.append(r1)
            int r1 = r7.getAction()
            r0.append(r1)
            java.lang.String r1 = " interceptTouch: "
            r0.append(r1)
            com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout r1 = r6.f179226q
            boolean r1 = r1.getInterceptTouch()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.LiveScreenClearPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            g50.a r0 = r3.mo84474d()
            if (r0 == 0) goto L_0x0110
            g50.b r0 = (g50.C107744b) r0
            r0.mo158158h(r7)
        L_0x0110:
            g50.a r0 = r3.mo84474d()
            if (r0 == 0) goto L_0x011e
            g50.b r0 = (g50.C107744b) r0
            h50.c r0 = r0.f322449y
            if (r0 == 0) goto L_0x011e
            r0.f323850f = r6
        L_0x011e:
            int r7 = r7.getPointerCount()
            r0 = 2
            if (r7 < r0) goto L_0x0128
            r6.mo88082a1()
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63163zd.m74507Z0(qj1.zd, android.view.MotionEvent):void");
    }

    /* renamed from: T */
    public void mo88081T() {
        C61926c.m72668M(new C63167d(this));
    }

    /* renamed from: a1 */
    public final void mo88082a1() {
        View view = this.f179232w;
        if (view != null && view.getVisibility() == 0) {
            View view2 = this.f179232w;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin", "hideFrameScaleTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin", "hideFrameScaleTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C62042e.f176370a.mo87106p0().putBoolean("FRAME_SCALE_TIPS_SHOW_KEY", false);
            C53973z1 z1Var = this.f179231v;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo88083b1(View.OnTouchListener onTouchListener) {
        LinkedList<View.OnTouchListener> linkedList;
        if (onTouchListener != null) {
            if (this.f179229t == null) {
                this.f179229t = new LinkedList<>();
            }
            LinkedList<View.OnTouchListener> linkedList2 = this.f179229t;
            boolean z = true;
            if (linkedList2 == null || !linkedList2.contains(onTouchListener)) {
                z = false;
            }
            if (!z && (linkedList = this.f179229t) != null) {
                linkedList.add(onTouchListener);
            }
        }
    }

    /* renamed from: c1 */
    public final void mo88084c1(int i) {
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54067f0.C54076o0 o0Var = C54067f0.C54076o0.FRAME_SCALE;
        C104289g gVar = new C104289g();
        gVar.mo145953n("type", i);
        gVar.mo145953n("screen_status", this.f179235z ? 1 : 0);
        C13598b0 b0Var = C13598b0.f38549a;
        C54116w.Ex0((C54116w) c, o0Var, gVar.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* renamed from: d1 */
    public final void mo88085d1(Boolean bool) {
        View view;
        C59363a d;
        C108147c cVar;
        Class cls = C54116w.class;
        Class cls2 = C54991o.class;
        Log.m105924i("Finder.LiveScreenClearPlugin", "screenClickLogic");
        if (SystemClock.elapsedRealtime() - this.f179227r >= ((long) ViewConfiguration.getDoubleTapTimeout())) {
            this.f179227r = SystemClock.elapsedRealtime();
            int i = 0;
            if (FinderLiveViewCallback.f159198L != 0) {
                Log.m105924i("Finder.LiveScreenClearPlugin", "[screenAction] inNewGuideStatus:" + FinderLiveViewCallback.f159198L + " return");
            } else {
                C39818r rVar = C39818r.f106831a;
                Context context = this.f179226q.getContext();
                C87412m.m108593f(context, "clearView.context");
                C39622i0 a = rVar.mo62443b(context).mo75002a(C58312g.class);
                C87412m.m108593f(a, "UICProvider.of(clearView…veSideBarUIC::class.java)");
                C58312g gVar = (C58312g) a;
                if (gVar.f166967e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("inSideBarStatus, is NUll? ");
                    sb.append(gVar.f166968f == null);
                    Log.m105924i("Finder.LiveScreenClearPlugin", sb.toString());
                    gVar.f166971i.f166979h = 3;
                    FinderLiveSideBar finderLiveSideBar = gVar.f166968f;
                    if (finderLiveSideBar != null) {
                        finderLiveSideBar.mo77737d();
                    }
                } else {
                    ((C54991o) mo87696x0(cls2)).f154286Z = bool != null ? bool.booleanValue() : !((C54991o) mo87696x0(cls2)).f154286Z;
                    Log.m105924i("Finder.LiveScreenClearPlugin", "screenAction business(LiveCommonSlice::class.java).screenClear:" + ((C54991o) mo87696x0(cls2)).f154286Z);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((C54991o) mo87696x0(cls2)).f154286Z);
                    this.f179225p.statusChange(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
                    if (this.f179225p.getLiveRole() == 0) {
                        ((C54116w) C86312j.m106911c(cls)).Ox0(((C54991o) mo87696x0(cls2)).f154286Z ? C54067f0.C0057g.CLICK_CLEAR_SCREEN : C54067f0.C0057g.CLICK_CLEAR_SCREEN_CANCEL);
                    }
                    if (((C54991o) mo87696x0(cls2)).f154286Z && mo82893g0()) {
                        Context context2 = this.f166287d.getContext();
                        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                        ((Activity) context2).getWindow().getDecorView().setSystemUiVisibility(3846);
                    }
                }
            }
            C59364c cVar2 = null;
            if (((C54991o) mo87696x0(cls2)).f154286Z) {
                if (C62042e.f176370a.mo87106p0().getBoolean("FRAME_SCALE_TIPS_SHOW_KEY", true) && this.f179234y == 1 && !this.f179224A) {
                    C53896h0 h0Var = C53872d1.f151117a;
                    this.f179231v = C11207i.m11072h(this, C58901s.f168555a, (C53934p0) null, new C12249ae(this, (C15601d<? super C12249ae>) null), 2, (Object) null);
                }
                this.f179235z = true;
            } else {
                this.f166287d.post(new C62657be(this));
                C63170ze zeVar = (C63170ze) mo87687E0(C63170ze.class);
                C58924d c1 = zeVar != null ? zeVar.mo88091c1() : null;
                if (c1 instanceof C59364c) {
                    cVar2 = (C59364c) c1;
                }
                if (!(cVar2 == null || (d = cVar2.mo84474d()) == null || (cVar = ((C107744b) d).f322449y) == null)) {
                    cVar.mo158553c();
                }
                mo88082a1();
            }
            Class cls3 = C12786zh.class;
            if (!((C54991o) mo87696x0(cls2)).mo76007j4()) {
                return;
            }
            if (((C54991o) mo87696x0(cls2)).f154286Z) {
                C12786zh zhVar = (C12786zh) mo87687E0(cls3);
                if (zhVar != null) {
                    if (zhVar.f36607r == null) {
                        zhVar.f36607r = zhVar.f166287d.findViewById(C0966R.C0970id.dyl);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("init vrTipGroup:");
                        View view2 = zhVar.f36607r;
                        if (view2 != null) {
                            i = view2.hashCode();
                        }
                        sb4.append(i);
                        Log.m105924i("FinderLiveVisitorVRActionTipsLazyPlugin", sb4.toString());
                        View view3 = zhVar.f36607r;
                        if (view3 != null) {
                            C85875k4.m106189j0(((TextView) view3.findViewById(C0966R.C0970id.e1z)).getPaint(), 0.8f);
                            C85875k4.m106189j0(((TextView) view3.findViewById(C0966R.C0970id.e1y)).getPaint(), 0.8f);
                            view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), C74942w4.m89784a(zhVar.f166287d.getContext(), 32) + C75044y4.m89991c(zhVar.f166287d.getContext()));
                        }
                    }
                    View view4 = zhVar.f36607r;
                    if (view4 != null) {
                        ((C54116w) C86312j.m106911c(cls)).Cy0(String.valueOf(5));
                        view4.animate().alpha(1.0f).translationY(0.0f).withStartAction(new C12263bi(view4, zhVar)).withEndAction(new C62689ci(zhVar)).start();
                    }
                }
                this.f166287d.post(new C62688ce(this));
                return;
            }
            C12786zh zhVar2 = (C12786zh) mo87687E0(cls3);
            if (!(zhVar2 == null || (view = zhVar2.f36607r) == null)) {
                view.removeCallbacks((Runnable) ((C36570n) zhVar2.f36608s).getValue());
                view.animate().alpha(0.0f).translationY(((float) C75044y4.m89990b(zhVar2.f166287d.getContext()).y) / 2.0f).withEndAction(new C62637ai(view, zhVar2)).start();
            }
            this.f166287d.post(new C62739de(this));
        }
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("visibility:");
        sb.append(i == 0);
        Log.m105924i("Finder.LiveScreenClearPlugin", sb.toString());
        super.mo10792g(i);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "micUserMap");
        this.f179234y = linkedHashMap.size();
    }

    /* renamed from: p */
    public void mo88086p() {
        mo88084c1(2);
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        boolean z = false;
        if (ordinal == 124) {
            if (bundle != null) {
                z = bundle.getBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false);
            }
            if (z) {
                this.f166287d.setImportantForAccessibility(1);
                this.f166287d.setOnClickListener(new C63168e(this));
                return;
            }
            this.f166287d.setImportantForAccessibility(4);
            this.f166287d.setOnClickListener((View.OnClickListener) null);
        } else if (ordinal == 169) {
            if (bundle != null) {
                z = bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
            }
            this.f179224A = z;
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        this.f179229t = null;
    }
}
