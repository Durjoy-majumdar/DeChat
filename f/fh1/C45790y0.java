package fh1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import cl1.C0702z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C48642a01;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveDanmakuInputController$getFloatMsgConfig$1", mo125469f = "LiveDanmakuInputController.kt", mo125470l = {53, 74, 81}, mo125471m = "invokeSuspend")
/* renamed from: fh1.y0 */
public final class C45790y0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f123688d;

    /* renamed from: e */
    public int f123689e;

    /* renamed from: f */
    public final /* synthetic */ C45793z0 f123690f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveDanmakuInputController$getFloatMsgConfig$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "LiveDanmakuInputController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.y0$a */
    public static final class C45791a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f123691d;

        /* renamed from: e */
        public final /* synthetic */ C45793z0 f123692e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45791a(C0287e eVar, C15601d dVar, C45793z0 z0Var) {
            super(2, dVar);
            this.f123691d = eVar;
            this.f123692e = z0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C45791a(this.f123691d, dVar, this.f123692e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C45791a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0280a aVar = (C0280a) ((C0281b) this.f123691d).f843b;
            Log.m105924i(this.f123692e.f123695j, "requestDelete fail!");
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveDanmakuInputController$getFloatMsgConfig$1$invokeSuspend$$inlined$success$default$1", mo125469f = "LiveDanmakuInputController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.y0$b */
    public static final class C45792b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f123693d;

        /* renamed from: e */
        public final /* synthetic */ C45793z0 f123694e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45792b(C0287e eVar, C15601d dVar, C45793z0 z0Var) {
            super(2, dVar);
            this.f123693d = eVar;
            this.f123694e = z0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C45792b(this.f123693d, dVar, this.f123694e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C45792b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i(this.f123694e.f123695j, "getFloatMsgConfig success!");
            ((C0702z0) this.f123694e.business(C0702z0.class)).f1669A = ((C48642a01) ((C0288f) this.f123693d).f855b).f130183d;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45790y0(C45793z0 z0Var, C15601d<? super C45790y0> dVar) {
        super(2, dVar);
        this.f123690f = z0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C45790y0(this.f123690f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C45790y0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r11.f123689e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0031
            if (r2 == r5) goto L_0x002c
            if (r2 == r4) goto L_0x0023
            if (r2 != r3) goto L_0x001b
            java.lang.Object r0 = r11.f123688d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00ec
        L_0x001b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0023:
            java.lang.Object r0 = r11.f123688d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00ce
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00ad
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r12)
            te3.zz0 r12 = new te3.zz0
            r12.<init>()
            fh1.z0 r2 = r11.f123690f
            je1.h2 r7 = je1.C46523h2.f125330a
            r8 = 11231(0x2bdf, float:1.5738E-41)
            te3.ig0 r7 = r7.mo71859a(r8)
            r12.f146285d = r7
            androidx.lifecycle.i0 r7 = r2.business(r0)
            cl1.u r7 = (cl1.C55001u) r7
            byte[] r7 = r7.f154417n
            pe3.b r7 = pe3.C89349b.m111674a(r7)
            r12.f146286e = r7
            androidx.lifecycle.i0 r7 = r2.business(r0)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            long r9 = r7.f182392d
            r12.f146287f = r9
            androidx.lifecycle.i0 r0 = r2.business(r0)
            cl1.u r0 = (cl1.C55001u) r0
            long r9 = r0.f154416j
            r12.f146288g = r9
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r2.business(r0)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.f154345o
            r12.f146289h = r0
            zc1.b r0 = zc1.C66785b.f191882e
            java.lang.String r0 = r0.mo90662O5()
            r12.f146290i = r0
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            r0.f127069d = r8
            java.lang.String r2 = "/cgi-bin/micromsg-bin/finderlivegetfloatmsgconfig"
            r0.f127068c = r2
            r0.f127066a = r12
            te3.a01 r12 = new te3.a01
            r12.<init>()
            r0.f127067b = r12
            ob0.c r12 = r0.mo72403a()
            java.lang.Class<ht1.s1> r0 = ht1.C8802s1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.s1 r0 = (ht1.C8802s1) r0
            ob0.b r0 = r0.mo9632ui()
            r0.mo123453j(r12)
            r11.f123689e = r5
            java.lang.Object r12 = bi1.C0283d.m245c(r0, r6, r11, r5, r6)
            if (r12 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            r0 = r12
            bi1.e r0 = (bi1.C0287e) r0
            fh1.z0 r12 = r11.f123690f
            boolean r2 = r0 instanceof bi1.C0288f
            if (r2 == 0) goto L_0x00ce
            wx3.f r2 = r0.f854a
            if (r2 != 0) goto L_0x00be
            wx3.f r2 = r11.getContext()
        L_0x00be:
            fh1.y0$b r5 = new fh1.y0$b
            r5.<init>(r0, r6, r12)
            r11.f123688d = r0
            r11.f123689e = r4
            java.lang.Object r12 = a14.C53895h.m60469g(r2, r5, r11)
            if (r12 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            fh1.z0 r12 = r11.f123690f
            boolean r2 = r0 instanceof bi1.C0281b
            if (r2 == 0) goto L_0x00ec
            wx3.f r2 = r0.f854a
            if (r2 != 0) goto L_0x00dc
            wx3.f r2 = r11.getContext()
        L_0x00dc:
            fh1.y0$a r4 = new fh1.y0$a
            r4.<init>(r0, r6, r12)
            r11.f123688d = r0
            r11.f123689e = r3
            java.lang.Object r12 = a14.C53895h.m60469g(r2, r4, r11)
            if (r12 != r1) goto L_0x00ec
            return r1
        L_0x00ec:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C45790y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
