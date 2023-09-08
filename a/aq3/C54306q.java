package aq3;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import p157gk.C59481e;
import p157gk.C59491j;
import qo3.C89779i0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.view.activity.ImageQueryMainUIC$initFirstTime$2", mo125469f = "ImageQueryMainUIC.kt", mo125470l = {91, 93}, mo125471m = "invokeSuspend")
/* renamed from: aq3.q */
public final class C54306q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f152422d;

    /* renamed from: e */
    public final /* synthetic */ C54301o f152423e;

    @C91590f(mo125468c = "com.tencent.mm.view.activity.ImageQueryMainUIC$initFirstTime$2$2", mo125469f = "ImageQueryMainUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: aq3.q$a */
    public static final class C54307a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C54301o f152424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54307a(C54301o oVar, C15601d<? super C54307a> dVar) {
            super(2, dVar);
            this.f152424d = oVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54307a(this.f152424d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54307a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.ImageQueryMainUIC", "init engine done");
            C59481e eVar = C59491j.f169998c;
            if (eVar != null) {
                eVar.mo84579a(this.f152424d.getActivity());
            }
            C89779i0 i0Var = this.f152424d.f152413f;
            boolean z = true;
            if (i0Var == null || !i0Var.isShowing()) {
                z = false;
            }
            if (z) {
                C89779i0 i0Var2 = this.f152424d.f152413f;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
                this.f152424d.f152413f = null;
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54306q(C54301o oVar, C15601d<? super C54306q> dVar) {
        super(2, dVar);
        this.f152423e = oVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54306q(this.f152423e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54306q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r7.f152422d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x001f
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00d8
        L_0x0012:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001a:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00c2
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r8)
            bp3.i r8 = bp3.C54526i.f152882a
            boolean r1 = r8.mo75389a()
            if (r1 == 0) goto L_0x0042
            boolean r8 = r8.mo75390b()
            if (r8 != 0) goto L_0x0031
            goto L_0x0042
        L_0x0031:
            gk.e r8 = p157gk.C59491j.f169998c
            if (r8 != 0) goto L_0x0049
            gk.e r8 = new gk.e
            r8.<init>()
            p157gk.C59491j.f169998c = r8
            com.tencent.mm.storage.a4 r8 = com.tencent.p014mm.storage.C57593a4.f164912a
            r8.mo81936a()
            goto L_0x0049
        L_0x0042:
            java.lang.String r8 = "MicroMsg.ImageQueryDataModel"
            java.lang.String r1 = "checkInitDB >> entrance is close"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
        L_0x0049:
            gk.r r8 = p157gk.C59503r.f170040a
            r8.mo84583d()
            java.lang.String r8 = p157gk.C59491j.f169997b
            ug.k0 r1 = p157gk.C59492k.f169999a
            if (r1 == 0) goto L_0x0059
            android.util.Pair r8 = r1.mo137229p(r8)
            goto L_0x005a
        L_0x0059:
            r8 = r4
        L_0x005a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "initFirstTime >> new Data: "
            r1.append(r5)
            if (r8 == 0) goto L_0x0076
            java.lang.Object r5 = r8.first
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 == 0) goto L_0x0076
            int r5 = r5.size()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            goto L_0x0077
        L_0x0076:
            r6 = r4
        L_0x0077:
            r1.append(r6)
            java.lang.String r5 = ". old data: "
            r1.append(r5)
            if (r8 == 0) goto L_0x0091
            java.lang.Object r5 = r8.second
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 == 0) goto L_0x0091
            int r5 = r5.size()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            goto L_0x0092
        L_0x0091:
            r6 = r4
        L_0x0092:
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "MicroMsg.ImageQueryMainUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            if (r8 == 0) goto L_0x00c4
            java.lang.Object r1 = r8.first
            java.lang.String r5 = "it.first"
            gy3.C87412m.m108593f(r1, r5)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r8 = r8.second
            java.lang.String r5 = "it.second"
            gy3.C87412m.m108593f(r8, r5)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r7.f152422d = r3
            a14.h0 r3 = a14.C53872d1.f151119c
            com.tencent.mm.storage.z3 r5 = new com.tencent.mm.storage.z3
            r5.<init>(r1, r8, r4)
            java.lang.Object r8 = a14.C53895h.m60469g(r3, r5, r7)
            if (r8 != r0) goto L_0x00c2
            return r0
        L_0x00c2:
            rx3.b0 r8 = (rx3.C13598b0) r8
        L_0x00c4:
            a14.h0 r8 = a14.C53872d1.f151117a
            a14.k2 r8 = f14.C58901s.f168555a
            aq3.q$a r1 = new aq3.q$a
            aq3.o r3 = r7.f152423e
            r1.<init>(r3, r4)
            r7.f152422d = r2
            java.lang.Object r8 = a14.C53895h.m60469g(r8, r1, r7)
            if (r8 != r0) goto L_0x00d8
            return r0
        L_0x00d8:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: aq3.C54306q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
