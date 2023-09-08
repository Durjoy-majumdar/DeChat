package p1105d5;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p1128k5.C108896c;
import p632o5.C109956h;
import p632o5.C109959i;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "coil.RealImageLoader$executeChain$2", mo125469f = "RealImageLoader.kt", mo125470l = {233}, mo125471m = "invokeSuspend")
/* renamed from: d5.i */
public final class C107001i extends C91594j implements C32227p<C0000n0, C15601d<? super C109959i>, Object> {

    /* renamed from: d */
    public int f320291d;

    /* renamed from: e */
    public final /* synthetic */ C108896c f320292e;

    /* renamed from: f */
    public final /* synthetic */ C109956h f320293f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107001i(C108896c cVar, C109956h hVar, C15601d<? super C107001i> dVar) {
        super(2, dVar);
        this.f320292e = cVar;
        this.f320293f = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C107001i(this.f320292e, this.f320293f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C107001i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f320291d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C108896c cVar = this.f320292e;
            C109956h hVar = this.f320293f;
            this.f320291d = 1;
            obj = cVar.mo160028c(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
