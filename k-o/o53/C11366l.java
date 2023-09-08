package o53;

import a14.C0000n0;
import a14.C53965x0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C48932c00;
import te3.C49286eh3;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.wallet.wecoin.logic.WeCoinConsumeLogic$startConsumeWeCoinCgi$1$1", mo125469f = "WeCoinConsumeLogic.kt", mo125470l = {231}, mo125471m = "invokeSuspend")
/* renamed from: o53.l */
public final class C11366l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f33463d;

    /* renamed from: e */
    public final /* synthetic */ C48932c00 f33464e;

    /* renamed from: f */
    public final /* synthetic */ C11367m f33465f;

    /* renamed from: g */
    public final /* synthetic */ C49286eh3 f33466g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11366l(C48932c00 c002, C11367m mVar, C49286eh3 eh32, C15601d<? super C11366l> dVar) {
        super(2, dVar);
        this.f33464e = c002;
        this.f33465f = mVar;
        this.f33466g = eh32;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11366l(this.f33464e, this.f33465f, this.f33466g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11366l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f33463d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f33463d = 1;
            if (C53965x0.m60607b((long) this.f33464e.f131418e.f137050d, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f33465f.mo11383e(this.f33466g);
        return C13598b0.f38549a;
    }
}
