package xo1;

import ak1.C0047e0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Looper;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import bp1.C54519d;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import cp1.C57952m;
import d60.C58124b;
import di3.C86312j;
import gh1.C59453p;
import gh1.C8313a;
import gy3.C87412m;
import ht1.C8777j5;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import qj1.C63163zd;
import zo1.C66913a0;
import zo1.C66925j0;
import zo1.C66949y;

/* renamed from: xo1.b */
public final class C66382b extends C8313a {

    /* renamed from: j */
    public final String f191095j = "ReplayLongPressSpeedPlugin";

    /* renamed from: n */
    public C59453p f191096n;

    /* renamed from: o */
    public View f191097o;

    /* renamed from: p */
    public View f191098p;

    /* renamed from: q */
    public AnimatorSet f191099q;

    /* renamed from: r */
    public final C66383a f191100r = new C66383a(new WeakReference(this));

    /* renamed from: s */
    public boolean f191101s;

    /* renamed from: xo1.b$a */
    public static final class C66383a implements View.OnTouchListener {

        /* renamed from: d */
        public final WeakReference<C66382b> f191102d;

        /* renamed from: e */
        public final MMHandler f191103e = new MMHandler(Looper.getMainLooper());

        /* renamed from: f */
        public final Vibrator f191104f;

        /* renamed from: g */
        public final Runnable f191105g;

        /* renamed from: h */
        public float f191106h;

        /* renamed from: i */
        public float f191107i;

        /* renamed from: xo1.b$a$a */
        public static final class C66384a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C66383a f191108d;

            public C66384a(C66383a aVar) {
                this.f191108d = aVar;
            }

            public final void run() {
                C54519d dVar;
                C57952m mVar;
                C57952m mVar2;
                Class cls = C54519d.class;
                C66383a aVar = this.f191108d;
                aVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", true);
                C66382b bVar = aVar.f191102d.get();
                if (bVar != null) {
                    ((C54991o) bVar.business(C54991o.class)).f154286Z = true;
                    bVar.mo9313k3(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
                }
                C66382b bVar2 = this.f191108d.f191102d.get();
                if (bVar2 != null) {
                    bVar2.f191101s = true;
                    C59453p pVar = bVar2.f191096n;
                    View view = pVar != null ? pVar.f169882a : null;
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup != null) {
                        viewGroup.requestDisallowInterceptTouchEvent(true);
                    }
                    C59453p pVar2 = bVar2.f191096n;
                    boolean z = false;
                    if (pVar2 != null) {
                        pVar2.mo84560c(0);
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar2.f191097o, "alpha", new float[]{0.1f, 0.8f});
                    ofFloat.setDuration(250);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar2.f191097o, "alpha", new float[]{0.8f, 0.1f});
                    ofFloat2.setDuration(250);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar2.f191098p, "alpha", new float[]{0.1f, 0.8f});
                    ofFloat3.setDuration(250);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bVar2.f191098p, "alpha", new float[]{0.8f, 0.1f});
                    ofFloat4.setDuration(250);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(ofFloat);
                    animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
                    animatorSet.play(ofFloat4).after(ofFloat2);
                    animatorSet.addListener(new C66385c(bVar2));
                    animatorSet.start();
                    bVar2.f191099q = animatorSet;
                    C66913a0 a0Var = (C66913a0) bVar2.controller(C66913a0.class);
                    if (a0Var != null) {
                        Class cls2 = C66925j0.class;
                        if (((C54519d) a0Var.business(cls)).f152840B == 2.0f) {
                            z = true;
                        }
                        if (z) {
                            C66925j0 j0Var = (C66925j0) a0Var.mo9307d3(cls2);
                            if (!(j0Var == null || (mVar2 = j0Var.f192301r) == null)) {
                                mVar2.f165852a.setPlaySpeed(3.0f);
                            }
                        } else {
                            C66925j0 j0Var2 = (C66925j0) a0Var.mo9307d3(cls2);
                            if (!(j0Var2 == null || (mVar = j0Var2.f192301r) == null)) {
                                mVar.f165852a.setPlaySpeed(2.0f);
                            }
                        }
                    }
                    C66949y yVar = (C66949y) bVar2.mo9307d3(C66949y.class);
                    if (yVar != null) {
                        yVar.f192343s = true;
                    }
                }
                Vibrator vibrator = this.f191108d.f191104f;
                if (vibrator != null) {
                    vibrator.vibrate(10);
                }
                C66383a aVar2 = this.f191108d;
                aVar2.getClass();
                JSONObject b = C0047e0.m34b(C0047e0.f58a, (JSONObject) null, 1, (Object) null);
                C66382b bVar3 = aVar2.f191102d.get();
                b.put("press_before_type", Float.valueOf((bVar3 == null || (dVar = (C54519d) bVar3.business(cls)) == null) ? 1.0f : dVar.f152840B));
                String jSONObject = b.toString();
                C87412m.m108593f(jSONObject, "params.toString()");
                ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("watch_live_speed_press", jSONObject);
            }
        }

        public C66383a(WeakReference<C66382b> weakReference) {
            C87412m.m108594g(weakReference, "controller");
            this.f191102d = weakReference;
            Object systemService = MMApplicationContext.getContext().getSystemService("vibrator");
            this.f191104f = systemService instanceof Vibrator ? (Vibrator) systemService : null;
            this.f191105g = new C66384a(this);
        }

        /* renamed from: a */
        public final boolean mo90474a() {
            C66382b bVar = this.f191102d.get();
            return bVar != null && bVar.f191101s;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
            if (r9 != 3) goto L_0x0122;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            /*
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r9)
                r0.add(r10)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/replay/controller/ReplaySpeedUpController$LongPressSpeedListener"
                java.lang.String r2 = "android/view/View$OnTouchListener"
                java.lang.String r3 = "onTouch"
                java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r8
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                java.lang.String r0 = "v"
                gy3.C87412m.m108594g(r9, r0)
                java.lang.String r9 = "event"
                gy3.C87412m.m108594g(r10, r9)
                int r9 = r10.getActionMasked()
                if (r9 == 0) goto L_0x010a
                r0 = 0
                r1 = 1
                if (r9 == r1) goto L_0x0084
                r2 = 2
                if (r9 == r2) goto L_0x003b
                r10 = 3
                if (r9 == r10) goto L_0x0084
                goto L_0x0122
            L_0x003b:
                boolean r9 = r8.mo90474a()
                if (r9 != 0) goto L_0x0122
                float r9 = r10.getRawX()
                float r10 = r10.getRawY()
                float r3 = r8.f191106h
                float r4 = r8.f191107i
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
                int r5 = r5.getScaledTouchSlop()
                float r9 = r9 - r3
                double r6 = (double) r9
                double r2 = (double) r2
                double r6 = java.lang.Math.pow(r6, r2)
                float r9 = (float) r6
                float r10 = r10 - r4
                double r6 = (double) r10
                double r2 = java.lang.Math.pow(r6, r2)
                float r10 = (float) r2
                float r9 = r9 + r10
                double r9 = (double) r9
                double r9 = java.lang.Math.sqrt(r9)
                float r9 = (float) r9
                float r9 = java.lang.Math.abs(r9)
                float r10 = (float) r5
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x0079
                r0 = 1
            L_0x0079:
                if (r0 == 0) goto L_0x0122
                com.tencent.mm.sdk.platformtools.MMHandler r9 = r8.f191103e
                java.lang.Runnable r10 = r8.f191105g
                r9.removeCallbacks(r10)
                goto L_0x0122
            L_0x0084:
                com.tencent.mm.sdk.platformtools.MMHandler r9 = r8.f191103e
                java.lang.Runnable r10 = r8.f191105g
                r9.removeCallbacks(r10)
                boolean r9 = r8.mo90474a()
                if (r9 == 0) goto L_0x0122
                java.lang.ref.WeakReference<xo1.b> r9 = r8.f191102d
                java.lang.Object r9 = r9.get()
                xo1.b r9 = (xo1.C66382b) r9
                if (r9 == 0) goto L_0x0100
                r9.f191101s = r0
                gh1.p r10 = r9.f191096n
                r1 = 0
                if (r10 == 0) goto L_0x00a5
                android.view.View r10 = r10.f169882a
                goto L_0x00a6
            L_0x00a5:
                r10 = r1
            L_0x00a6:
                boolean r2 = r10 instanceof android.view.ViewGroup
                if (r2 == 0) goto L_0x00ad
                r1 = r10
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            L_0x00ad:
                if (r1 == 0) goto L_0x00b2
                r1.requestDisallowInterceptTouchEvent(r0)
            L_0x00b2:
                java.lang.Class<zo1.a0> r10 = zo1.C66913a0.class
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r10 = r9.controller(r10)
                zo1.a0 r10 = (zo1.C66913a0) r10
                if (r10 == 0) goto L_0x00e4
                java.lang.Class<bp1.d> r1 = bp1.C54519d.class
                androidx.lifecycle.i0 r2 = r10.business(r1)
                bp1.d r2 = (bp1.C54519d) r2
                float r2 = r2.f152840B
                androidx.lifecycle.i0 r1 = r10.business(r1)
                bp1.d r1 = (bp1.C54519d) r1
                r1.f152840B = r2
                java.lang.Class<zo1.j0> r1 = zo1.C66925j0.class
                qj1.c r1 = r10.mo9307d3(r1)
                zo1.j0 r1 = (zo1.C66925j0) r1
                if (r1 == 0) goto L_0x00e1
                cp1.m r1 = r1.f192301r
                if (r1 == 0) goto L_0x00e1
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r1 = r1.f165852a
                r1.setPlaySpeed(r2)
            L_0x00e1:
                r10.mo90908n3()
            L_0x00e4:
                java.lang.Class<zo1.y> r10 = zo1.C66949y.class
                qj1.c r10 = r9.mo9307d3(r10)
                zo1.y r10 = (zo1.C66949y) r10
                if (r10 == 0) goto L_0x00f0
                r10.f192343s = r0
            L_0x00f0:
                gh1.p r10 = r9.f191096n
                if (r10 == 0) goto L_0x00f9
                r0 = 8
                r10.mo84560c(r0)
            L_0x00f9:
                android.animation.AnimatorSet r9 = r9.f191099q
                if (r9 == 0) goto L_0x0100
                r9.cancel()
            L_0x0100:
                android.os.Vibrator r9 = r8.f191104f
                if (r9 == 0) goto L_0x0122
                r0 = 10
                r9.vibrate(r0)
                goto L_0x0122
            L_0x010a:
                float r9 = r10.getRawX()
                r8.f191106h = r9
                float r9 = r10.getRawY()
                r8.f191107i = r9
                com.tencent.mm.sdk.platformtools.MMHandler r9 = r8.f191103e
                java.lang.Runnable r10 = r8.f191105g
                int r0 = android.view.ViewConfiguration.getLongPressTimeout()
                long r0 = (long) r0
                r9.postDelayed(r10, r0)
            L_0x0122:
                boolean r9 = r8.mo90474a()
                java.lang.String r4 = "com/tencent/mm/plugin/finder/replay/controller/ReplaySpeedUpController$LongPressSpeedListener"
                java.lang.String r5 = "android/view/View$OnTouchListener"
                java.lang.String r6 = "onTouch"
                java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r2 = r9
                r3 = r8
                j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: xo1.C66382b.C66383a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66382b(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    public void onLiveActivate() {
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.o9c);
        C87412m.m108593f(viewGroup2, "rootView");
        this.f191096n = new C59453p(viewGroup2, this);
        this.f191097o = viewGroup2.findViewById(C0966R.C0970id.o_1);
        this.f191098p = viewGroup2.findViewById(C0966R.C0970id.o_2);
        C63163zd zdVar = (C63163zd) mo9307d3(C63163zd.class);
        if (zdVar != null) {
            zdVar.mo88083b1(this.f191100r);
        }
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        C59453p pVar = this.f191096n;
        if (pVar != null) {
            pVar.mo84560c(8);
        }
        this.f191097o = null;
        this.f191098p = null;
        this.f191101s = false;
    }
}
