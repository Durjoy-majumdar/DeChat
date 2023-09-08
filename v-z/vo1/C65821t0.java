package vo1;

import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import androidx.camera.core.FocusMeteringAction;
import bp1.C54519d;
import bp1.C54523e;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: vo1.t0 */
public final class C65821t0 extends C8313a {

    /* renamed from: j */
    public final String f189290j = "TransitionReplayController";

    /* renamed from: n */
    public final C13601g f189291n = C36568h.m40985a(new C65823b(this));

    /* renamed from: vo1.t0$a */
    public static final class C65822a implements C54519d.C54520a {

        /* renamed from: a */
        public final String f189292a;

        /* renamed from: b */
        public final WeakReference<C65821t0> f189293b;

        public C65822a(String str, WeakReference<C65821t0> weakReference) {
            C87412m.m108594g(str, "tag");
            C87412m.m108594g(weakReference, "rController");
            this.f189292a = str;
            this.f189293b = weakReference;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: rx3.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: rx3.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: rx3.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: rx3.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: rx3.b0} */
        /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x017c  */
        /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo75381a(boolean r18) {
            /*
                r17 = this;
                r0 = r17
                if (r18 == 0) goto L_0x0185
                vo1.a0$b r1 = vo1.C65770a0.f189184r
                vo1.a0 r2 = r1.mo89819a()
                cp1.o r2 = r2.f189191e
                r3 = 0
                if (r2 == 0) goto L_0x0042
                java.lang.String r4 = r0.f189292a
                java.lang.String r5 = "watchReplayAduting fullScreen update!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                java.lang.Class<zo1.b0> r4 = zo1.C16344b0.class
                qj1.c r2 = r2.mo78582g(r4)
                zo1.b0 r2 = (zo1.C16344b0) r2
                if (r2 == 0) goto L_0x003b
                r2.mo14826f1()
                com.tencent.mm.plugin.finder.live.view.b r4 = r2.mo14484z0()
                com.tencent.mm.plugin.finder.live.infrastructure.coroutine.a r5 = r4.getViewScope()
                zo1.i0 r8 = new zo1.i0
                r8.<init>(r2, r3)
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                a14.C53895h.m60466d(r5, r6, r7, r8, r9, r10)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                goto L_0x003c
            L_0x003b:
                r2 = r3
            L_0x003c:
                if (r2 != 0) goto L_0x003f
                goto L_0x0042
            L_0x003f:
                r3 = r2
                goto L_0x017a
            L_0x0042:
                vo1.a0 r2 = r1.mo89819a()
                cp1.h r2 = r2.f189192f
                if (r2 == 0) goto L_0x017a
                java.lang.String r4 = r0.f189292a
                java.lang.String r5 = "watchReplayAduting miniView update!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                java.lang.ref.WeakReference<vo1.t0> r4 = r0.f189293b
                java.lang.Object r4 = r4.get()
                vo1.t0 r4 = (vo1.C65821t0) r4
                if (r4 == 0) goto L_0x017a
                java.lang.Class<bp1.d> r5 = bp1.C54519d.class
                java.lang.String r6 = r4.f189290j
                java.lang.String r7 = "ReplayTransition2.1:playReplay"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                vo1.a0 r6 = r1.mo89819a()
                cp1.m r6 = r6.f189201o
                if (r6 == 0) goto L_0x016f
                r6.mo82763i()
                androidx.lifecycle.i0 r6 = r4.business(r5)
                bp1.d r6 = (bp1.C54519d) r6
                r7 = 2
                r6.mo75377l3(r7)
                androidx.lifecycle.i0 r6 = r4.business(r5)
                bp1.d r6 = (bp1.C54519d) r6
                r7 = 0
                r6.f152841C = r7
                androidx.lifecycle.i0 r6 = r4.business(r5)
                bp1.d r6 = (bp1.C54519d) r6
                r6.f152842D = r7
                sk1.a r8 = sk1.C63947a.f181274a
                androidx.lifecycle.i0 r6 = r4.business(r5)
                bp1.d r6 = (bp1.C54519d) r6
                te3.c21 r9 = r6.mo75372e3()
                r11 = 0
                r12 = 2
                r13 = 0
                java.lang.String r10 = "playReplayWhenMiniView"
                java.lang.String r6 = sk1.C63947a.m75194h(r8, r9, r10, r11, r12, r13)
                te3.rq2 r9 = new te3.rq2
                r9.<init>()
                boolean r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r8 == 0) goto L_0x00b1
                java.lang.String r8 = "https"
                java.lang.String r10 = "http"
                java.lang.String r6 = z04.C112551y.m153814n(r6, r8, r10, r7)
            L_0x00b1:
                r9.f185266d = r6
                java.lang.String r6 = p823sg.C90193h.m112876d(r6)
                r9.f185275p = r6
                up1.y r10 = up1.C27696y.V0_VIDEO
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 56
                r16 = 0
                pl1.r0 r6 = new pl1.r0
                java.lang.String r11 = "xV0"
                r8 = r6
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                r8 = 8
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "#replay_data#:startPlay url:"
                r9.append(r10)
                te3.rq2 r10 = r6.f177253e
                java.lang.String r10 = r10.f185266d
                r9.append(r10)
                java.lang.String r10 = " source:"
                r9.append(r10)
                r9.append(r8)
                java.lang.String r8 = r9.toString()
                java.lang.String r9 = "FinderLiveReplayMiniView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
                vo1.a0 r1 = r1.mo89819a()
                cp1.m r1 = r1.f189201o
                fj1.b r2 = r2.f165834f
                if (r1 == 0) goto L_0x016d
                if (r2 == 0) goto L_0x016d
                androidx.lifecycle.i0 r8 = r2.mo71262a(r5)
                bp1.d r8 = (bp1.C54519d) r8
                te3.c21 r8 = r8.mo75372e3()
                te3.e71 r8 = r8.f182388Z
                if (r8 == 0) goto L_0x010c
                java.lang.String r8 = r8.f182939r
                goto L_0x010d
            L_0x010c:
                r8 = r3
            L_0x010d:
                java.lang.String r9 = ""
                if (r8 != 0) goto L_0x0112
                r8 = r9
            L_0x0112:
                com.tencent.mm.plugin.finder.storage.FeedData r10 = new com.tencent.mm.plugin.finder.storage.FeedData
                r10.<init>()
                androidx.lifecycle.i0 r5 = r2.mo71262a(r5)
                bp1.d r5 = (bp1.C54519d) r5
                int r5 = r5.f152839A
                r10.setPosition(r5)
                java.lang.Class<cl1.u> r5 = cl1.C55001u.class
                androidx.lifecycle.i0 r5 = r2.mo71262a(r5)
                cl1.u r5 = (cl1.C55001u) r5
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.f154422s
                if (r5 == 0) goto L_0x0131
                java.lang.String r5 = r5.description
                goto L_0x0132
            L_0x0131:
                r5 = r3
            L_0x0132:
                if (r5 != 0) goto L_0x0149
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r11 = "replay-"
                r5.append(r11)
                int r11 = r10.hashCode()
                r5.append(r11)
                java.lang.String r5 = r5.toString()
            L_0x0149:
                r10.setDescription(r5)
                java.lang.Class<cl1.o> r5 = cl1.C54991o.class
                androidx.lifecycle.i0 r2 = r2.mo71262a(r5)
                cl1.o r2 = (cl1.C54991o) r2
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f154341n
                if (r2 == 0) goto L_0x015a
                java.lang.String r3 = r2.nickname
            L_0x015a:
                if (r3 != 0) goto L_0x015d
                goto L_0x015e
            L_0x015d:
                r9 = r3
            L_0x015e:
                r10.setNickName(r9)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                r1.mo82755a(r6, r8, r7, r10)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                r1.mo82759e(r2)
            L_0x016d:
                rx3.b0 r3 = rx3.C13598b0.f38549a
            L_0x016f:
                if (r3 != 0) goto L_0x0178
                java.lang.String r1 = r4.f189290j
                java.lang.String r2 = "playReplayWhenMiniView err,curPlayerWidget is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            L_0x0178:
                rx3.b0 r3 = rx3.C13598b0.f38549a
            L_0x017a:
                if (r3 != 0) goto L_0x0192
                java.lang.String r1 = r0.f189292a
                java.lang.String r2 = "watchReplayAduting error!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                goto L_0x0192
            L_0x0185:
                java.lang.ref.WeakReference<vo1.t0> r1 = r0.f189293b
                java.lang.Object r1 = r1.get()
                vo1.t0 r1 = (vo1.C65821t0) r1
                if (r1 == 0) goto L_0x0192
                r1.mo89858m3()
            L_0x0192:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vo1.C65821t0.C65822a.mo75381a(boolean):void");
        }
    }

    /* renamed from: vo1.t0$b */
    public static final class C65823b extends C87413o implements C32224a<C65822a> {

        /* renamed from: d */
        public final /* synthetic */ C65821t0 f189294d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65823b(C65821t0 t0Var) {
            super(0);
            this.f189294d = t0Var;
        }

        public Object invoke() {
            return new C65822a(this.f189294d.f189290j, new WeakReference(this.f189294d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65821t0(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public final void mo89858m3() {
        C54519d dVar = (C54519d) business(C54519d.class);
        C65822a aVar = (C65822a) ((C36570n) this.f189291n).getValue();
        dVar.getClass();
        C87412m.m108594g(aVar, "replayListener");
        C53973z1 z1Var = dVar.f152843E;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        dVar.f152843E = C53895h.m60466d(dVar.f107146d.f123702i, (C66212f) null, (C53934p0) null, new C54523e(dVar, 30000, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, aVar, (C15601d<? super C54523e>) null), 3, (Object) null);
    }

    public void onLiveActivate() {
        Log.m105924i(this.f189290j, "onReplayActivate");
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        Log.m105924i(this.f189290j, "onReplayDeactivate");
    }
}
