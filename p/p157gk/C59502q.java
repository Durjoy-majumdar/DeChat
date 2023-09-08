package p157gk;

import a14.C0000n0;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.storage.C57593a4;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$clusterDataBack$3$1$1", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: gk.q */
public final class C59502q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ QueryImageData f170039d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59502q(QueryImageData queryImageData, C15601d<? super C59502q> dVar) {
        super(2, dVar);
        this.f170039d = queryImageData;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59502q(this.f170039d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59502q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C57593a4 a4Var = C57593a4.f164912a;
        QueryImageData queryImageData = this.f170039d;
        C87412m.m108593f(queryImageData, "image");
        a4Var.mo81945j(queryImageData, C59491j.f169997b);
        return C13598b0.f38549a;
    }
}
