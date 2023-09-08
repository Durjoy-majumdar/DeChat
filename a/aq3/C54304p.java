package aq3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53965x0;
import f14.C58901s;
import fy3.C32227p;
import kotlin.ResultKt;
import qo3.C89779i0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.view.activity.ImageQueryMainUIC$initFirstTime$1", mo125469f = "ImageQueryMainUIC.kt", mo125470l = {76, 77}, mo125471m = "invokeSuspend")
/* renamed from: aq3.p */
public final class C54304p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f152419d;

    /* renamed from: e */
    public final /* synthetic */ C54301o f152420e;

    @C91590f(mo125468c = "com.tencent.mm.view.activity.ImageQueryMainUIC$initFirstTime$1$1", mo125469f = "ImageQueryMainUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: aq3.p$a */
    public static final class C54305a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C54301o f152421d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54305a(C54301o oVar, C15601d<? super C54305a> dVar) {
            super(2, dVar);
            this.f152421d = oVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54305a(this.f152421d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54305a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C89779i0 i0Var = this.f152421d.f152413f;
            boolean z = true;
            if (i0Var == null || !i0Var.isShowing()) {
                z = false;
            }
            if (z) {
                C89779i0 i0Var2 = this.f152421d.f152413f;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
                this.f152421d.f152413f = null;
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54304p(C54301o oVar, C15601d<? super C54304p> dVar) {
        super(2, dVar);
        this.f152420e = oVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54304p(this.f152420e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54304p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f152419d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f152419d = 1;
            if (C53965x0.m60607b(3000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var = C58901s.f168555a;
        C54305a aVar2 = new C54305a(this.f152420e, (C15601d<? super C54305a>) null);
        this.f152419d = 2;
        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
