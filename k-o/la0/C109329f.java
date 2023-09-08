package la0;

import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import fy3.C32228q;
import ha0.C108183c0;
import ha0.C108236x0;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$performCreationWithRecommendTemplate$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: la0.f */
public final class C109329f extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f327302d;

    /* renamed from: e */
    public final /* synthetic */ C109300b f327303e;

    /* renamed from: f */
    public final /* synthetic */ C108183c0 f327304f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109329f(C109300b bVar, C108183c0 c0Var, C15601d<? super C109329f> dVar) {
        super(3, dVar);
        this.f327303e = bVar;
        this.f327304f = c0Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C45253g gVar = (C45253g) obj;
        C109329f fVar = new C109329f(this.f327303e, this.f327304f, (C15601d) obj3);
        fVar.f327302d = (Throwable) obj2;
        return fVar.invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Throwable th = (Throwable) this.f327302d;
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "startMovieCreation recommend onComplete");
        C109300b.m148412e3(this.f327303e, this.f327304f, th instanceof C108236x0 ? (C108236x0) th : null);
        return C13598b0.f38549a;
    }
}
