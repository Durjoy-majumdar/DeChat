package fh1;

import a14.C0000n0;
import a14.C53934p0;
import al1.C54133o;
import cl1.C54963d0;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import d14.C45253g;
import d14.C58052j1;
import d14.C58087u0;
import fy3.C32227p;
import gh1.C8313a;
import gi1.C8324b;
import gy3.C87412m;
import hh1.C59894a;
import kotlin.ResultKt;
import nk1.C11207i;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: fh1.i1 */
public final class C59030i1 extends C8313a implements C59894a {

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveMiniWindowController$onLiveActivate$1", mo125469f = "LiveMiniWindowController.kt", mo125470l = {34}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.i1$a */
    public static final class C59031a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f168917d;

        /* renamed from: e */
        public final /* synthetic */ C59030i1 f168918e;

        /* renamed from: fh1.i1$a$a */
        public static final class C59032a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C59030i1 f168919d;

            public C59032a(C59030i1 i1Var) {
                this.f168919d = i1Var;
            }

            /* JADX WARNING: type inference failed for: r7v10, types: [j50.a] */
            /* JADX WARNING: type inference failed for: r7v18, types: [j50.a] */
            /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
                r0 = r0.f172989A;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 2 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, wx3.C15601d r8) {
                /*
                    r6 = this;
                    java.lang.Class<cl1.o> r8 = cl1.C54991o.class
                    al1.o r7 = (al1.C54133o) r7
                    com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                    r0.getClass()
                    j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                    r1 = 1
                    if (r0 == 0) goto L_0x001a
                    d50.i r0 = r0.f172989A
                    if (r0 == 0) goto L_0x001a
                    boolean r0 = r0.mo82881c()
                    if (r0 != r1) goto L_0x001a
                    r0 = 1
                    goto L_0x001b
                L_0x001a:
                    r0 = 0
                L_0x001b:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "liveInfoChangeLiveData collect value "
                    r2.append(r3)
                    r2.append(r7)
                    java.lang.String r3 = " isFloatMode: "
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r3 = "LiveMiniWindowController"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                    if (r0 != 0) goto L_0x003f
                    rx3.b0 r7 = rx3.C13598b0.f38549a
                    goto L_0x00e3
                L_0x003f:
                    boolean r0 = r7 instanceof al1.C54124c
                    r2 = 0
                    java.lang.String r3 = ""
                    if (r0 == 0) goto L_0x00b0
                    fh1.i1 r0 = r6.f168919d
                    al1.c r7 = (al1.C54124c) r7
                    r0.getClass()
                    y50.f r7 = r7.f151969a
                    java.lang.String r7 = r7.f191337d
                    if (r7 != 0) goto L_0x0054
                    goto L_0x0055
                L_0x0054:
                    r3 = r7
                L_0x0055:
                    androidx.lifecycle.i0 r7 = r0.business(r8)
                    cl1.o r7 = (cl1.C54991o) r7
                    java.lang.String r7 = r7.mo76015n4()
                    boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r3)
                    if (r7 == 0) goto L_0x00e1
                    j50.a r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                    boolean r3 = r7 instanceof p50.C62197e
                    if (r3 == 0) goto L_0x006e
                    r2 = r7
                    p50.e r2 = (p50.C62197e) r2
                L_0x006e:
                    if (r2 == 0) goto L_0x00e1
                    r50.f r7 = r2.f173028o
                    com.tencent.mm.live.core.view.LiveVideoView r3 = new com.tencent.mm.live.core.view.LiveVideoView
                    android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    java.lang.String r5 = "getContext()"
                    gy3.C87412m.m108593f(r4, r5)
                    r3.<init>(r4)
                    if (r7 == 0) goto L_0x0085
                    r7.mo88273c(r3)
                L_0x0085:
                    b50.g r7 = r2.f176822Y0
                    f50.d r7 = r7.f152627a
                    if (r7 != 0) goto L_0x00aa
                    android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    gy3.C87412m.m108593f(r7, r5)
                    ok1.e r4 = ok1.C62042e.f176370a
                    com.tencent.rtmp.TXLivePlayConfig r4 = r4.mo87034Q()
                    fh1.g1 r5 = new fh1.g1
                    r5.<init>()
                    androidx.lifecycle.i0 r8 = r0.business(r8)
                    cl1.o r8 = (cl1.C54991o) r8
                    boolean r8 = r8.mo76007j4()
                    r2.mo87268G0(r7, r4, r5, r8)
                L_0x00aa:
                    fh1.h1 r7 = fh1.C8056h1.f26794d
                    r2.mo87255B0(r1, r3, r7)
                    goto L_0x00e1
                L_0x00b0:
                    boolean r0 = r7 instanceof al1.C54123a
                    if (r0 == 0) goto L_0x00e1
                    fh1.i1 r0 = r6.f168919d
                    al1.a r7 = (al1.C54123a) r7
                    r0.getClass()
                    y50.a r7 = r7.f151968a
                    java.lang.String r7 = r7.f191310c
                    if (r7 != 0) goto L_0x00c2
                    goto L_0x00c3
                L_0x00c2:
                    r3 = r7
                L_0x00c3:
                    androidx.lifecycle.i0 r7 = r0.business(r8)
                    cl1.o r7 = (cl1.C54991o) r7
                    java.lang.String r7 = r7.mo76015n4()
                    boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r3)
                    if (r7 == 0) goto L_0x00e1
                    j50.a r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                    boolean r8 = r7 instanceof p50.C62197e
                    if (r8 == 0) goto L_0x00dc
                    r2 = r7
                    p50.e r2 = (p50.C62197e) r2
                L_0x00dc:
                    if (r2 == 0) goto L_0x00e1
                    r2.mo87256C0(r1)
                L_0x00e1:
                    rx3.b0 r7 = rx3.C13598b0.f38549a
                L_0x00e3:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: fh1.C59030i1.C59031a.C59032a.emit(java.lang.Object, wx3.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59031a(C59030i1 i1Var, C15601d<? super C59031a> dVar) {
            super(2, dVar);
            this.f168918e = i1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59031a(this.f168918e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C59031a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f168917d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58087u0<C54133o> u0Var = ((C54963d0) this.f168918e.business(C54963d0.class)).f154066f;
                C59032a aVar2 = new C59032a(this.f168918e);
                this.f168917d = 1;
                if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59030i1(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: J1 */
    public void mo9728J1(C8324b bVar) {
        C87412m.m108594g(bVar, "micInfoData");
    }

    /* renamed from: g2 */
    public void mo9729g2(boolean z) {
    }

    public void onLiveActivate() {
        C11207i.m11066b(this, (C66212f) null, (C53934p0) null, new C59031a(this, (C15601d<? super C59031a>) null), 3, (Object) null);
    }

    /* renamed from: v0 */
    public void mo9732v0(JSONObject jSONObject) {
    }
}
