package fh1;

import cj1.C54795n5;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C49778i01;

/* renamed from: fh1.k0 */
public final class C59038k0 extends C8313a {

    /* renamed from: j */
    public final String f168937j = "Finder.JoinLivePreloadController";

    /* renamed from: fh1.k0$a */
    public static final class C59039a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59038k0 f168938d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59039a(C59038k0 k0Var) {
            super(0);
            this.f168938d = k0Var;
        }

        public Object invoke() {
            this.f168938d.mo84255n3();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fh1.k0$b */
    public static final class C59040b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59038k0 f168939d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59040b(C59038k0 k0Var) {
            super(0);
            this.f168939d = k0Var;
        }

        public Object invoke() {
            C59038k0 k0Var = this.f168939d;
            k0Var.getClass();
            C62042e.f176370a.mo86993B1(k0Var.getStore().getLiveRoomData(), "preloadLeadsComponetList", (C32226l<? super C49778i01, C13598b0>) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fh1.k0$c */
    public static final class C59041c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59038k0 f168940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59041c(C59038k0 k0Var) {
            super(0);
            this.f168940d = k0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
            if (r3.booleanValue() == false) goto L_0x004c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r19 = this;
                r0 = r19
                fh1.k0 r1 = r0.f168940d
                java.lang.String r1 = r1.f168937j
                java.lang.String r2 = "[preloadProductList]"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r1.getClass()
                com.tencent.mm.plugin.finder.live.view.b r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
                boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout
                r3 = 0
                if (r2 == 0) goto L_0x001a
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r1 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) r1
                goto L_0x001b
            L_0x001a:
                r1 = r3
            L_0x001b:
                if (r1 == 0) goto L_0x00d1
                hl1.k r1 = r1.getStartUIC()
                if (r1 == 0) goto L_0x00d1
                java.lang.Class<cl1.o> r2 = cl1.C54991o.class
                java.lang.Class<cl1.h1> r4 = cl1.C54979h1.class
                androidx.lifecycle.i0 r5 = r1.mo83051g(r4)
                cl1.h1 r5 = (cl1.C54979h1) r5
                boolean r5 = r5.f154137i
                if (r5 == 0) goto L_0x00d1
                qj1.w6 r5 = r1.f171230n1
                if (r5 == 0) goto L_0x004c
                il1.p4 r5 = r5.f179023q
                if (r5 == 0) goto L_0x0041
                boolean r3 = r5.mo85446b()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            L_0x0041:
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.Boolean"
                gy3.C87412m.m108592e(r3, r5)
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L_0x00d1
            L_0x004c:
                androidx.lifecycle.i0 r3 = r1.mo83051g(r2)
                cl1.o r3 = (cl1.C54991o) r3
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f154341n
                r5 = 0
                r6 = 1
                if (r3 == 0) goto L_0x0061
                long r7 = eg1.C58598w.f167766j
                long r9 = r3.f164794id
                int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r3 != 0) goto L_0x0061
                r5 = 1
            L_0x0061:
                if (r5 != 0) goto L_0x00d1
                java.lang.Class<cl1.u> r3 = cl1.C55001u.class
                java.lang.Class<ak1.w> r5 = ak1.C54116w.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                ak1.w r5 = (ak1.C54116w) r5
                r5.f151906J = r6
                androidx.lifecycle.i0 r5 = r1.mo83051g(r4)
                cl1.h1 r5 = (cl1.C54979h1) r5
                boolean r5 = r5.f154150y
                if (r5 != 0) goto L_0x00d1
                androidx.lifecycle.i0 r4 = r1.mo83051g(r4)
                cl1.h1 r4 = (cl1.C54979h1) r4
                r4.f154150y = r6
                cj1.n5 r7 = r1.mo83048k()
                if (r7 == 0) goto L_0x00d1
                androidx.appcompat.app.AppCompatActivity r4 = r1.f166847e
                java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r4, r5)
                r8 = r4
                com.tencent.mm.ui.MMActivity r8 = (com.tencent.p014mm.p136ui.MMActivity) r8
                androidx.lifecycle.i0 r4 = r1.mo83051g(r3)
                cl1.u r4 = (cl1.C55001u) r4
                te3.c21 r4 = r4.f154420q
                long r9 = r4.f182392d
                androidx.lifecycle.i0 r4 = r1.mo83051g(r3)
                cl1.u r4 = (cl1.C55001u) r4
                long r11 = r4.f154416j
                androidx.lifecycle.i0 r4 = r1.mo83051g(r2)
                cl1.o r4 = (cl1.C54991o) r4
                java.lang.String r13 = r4.f154345o
                androidx.lifecycle.i0 r3 = r1.mo83051g(r3)
                cl1.u r3 = (cl1.C55001u) r3
                byte[] r14 = r3.f154417n
                r15 = 0
                r16 = 1
                androidx.lifecycle.i0 r2 = r1.mo83051g(r2)
                cl1.o r2 = (cl1.C54991o) r2
                java.lang.String r2 = r2.f154357q3
                hl1.k$c r3 = new hl1.k$c
                java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference
                r4.<init>(r1)
                java.lang.String r1 = r1.f171222i
                r3.<init>(r4, r1)
                r17 = r2
                r18 = r3
                r7.mo75746n(r8, r9, r11, r13, r14, r15, r16, r17, r18)
            L_0x00d1:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fh1.C59038k0.C59041c.invoke():java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59038k0(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public final void mo84254m3(long j, long j2, C32224a<C13598b0> aVar) {
        if (C61926c.m72697v(j, j2)) {
            aVar.invoke();
            return;
        }
        String str = this.f168937j;
        Log.m105924i(str, "checkPreload skip " + j2);
    }

    /* renamed from: n3 */
    public final void mo84255n3() {
        Class cls = C55001u.class;
        C32444a aVar = C32444a.f86121a;
        if (!((Boolean) C32444a.f86071J2.mo60266n()).booleanValue()) {
            FinderLiveService.f159376d.getClass();
            C54795n5 n5Var = FinderLiveService.f159396y;
            if (n5Var != null) {
                C54795n5.C54796a.m61724b(n5Var, ((C55001u) business(cls)).f154420q.f182392d, ((C55001u) business(cls)).f154416j, ((C55001u) business(cls)).f154423t, 2, (C32227p) null, 16, (Object) null);
            }
        }
    }

    public void onLiveActivate() {
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r3 = r10.f144836Y0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLiveStart(te3.C52005xq0 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r9.f168937j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "preloadFlag:"
            r1.append(r2)
            r2 = 0
            if (r10 == 0) goto L_0x001a
            te3.k71 r3 = r10.f144836Y0
            if (r3 == 0) goto L_0x001a
            long r3 = r3.f136595d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x001b
        L_0x001a:
            r3 = r2
        L_0x001b:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            if (r10 == 0) goto L_0x004f
            te3.k71 r10 = r10.f144836Y0
            if (r10 == 0) goto L_0x004f
            long r0 = r10.f136595d
            r6 = 1
            fh1.k0$a r8 = new fh1.k0$a
            r8.<init>(r9)
            r3 = r9
            r4 = r0
            r3.mo84254m3(r4, r6, r8)
            r6 = 8
            fh1.k0$b r8 = new fh1.k0$b
            r8.<init>(r9)
            r3.mo84254m3(r4, r6, r8)
            r6 = 4
            fh1.k0$c r8 = new fh1.k0$c
            r8.<init>(r9)
            r3.mo84254m3(r4, r6, r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x004f:
            if (r2 != 0) goto L_0x0054
            r9.mo84255n3()
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59038k0.onLiveStart(te3.xq0):void");
    }
}
