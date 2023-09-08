package p157gk;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.data.ImageDataManager$stopIdentify$1", mo125469f = "ImageDataManager.kt", mo125470l = {360}, mo125471m = "invokeSuspend")
/* renamed from: gk.i */
public final class C59490i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f169994d;

    /* renamed from: e */
    public final /* synthetic */ C59481e f169995e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59490i(C59481e eVar, C15601d<? super C59490i> dVar) {
        super(2, dVar);
        this.f169995e = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59490i(this.f169995e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59490i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f169994d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C59503r rVar = C59503r.f170040a;
            this.f169994d = 1;
            if (rVar.mo84589j(this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Log.m105924i("MicroMsg.ImageDataManager", "sdk core stop finish");
        this.f169995e.f169965e = false;
        this.f169995e.f169961a = C59477b.IDLE;
        return C13598b0.f38549a;
    }
}
