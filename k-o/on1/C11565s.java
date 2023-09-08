package on1;

import a14.C0000n0;
import cm1.C0740i2;
import fy3.C32227p;
import kotlin.ResultKt;
import on1.C11537n;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$insert$3", mo125469f = "Loader.kt", mo125470l = {205}, mo125471m = "invokeSuspend")
/* renamed from: on1.s */
public final class C11565s extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f33934d;

    /* renamed from: e */
    public final /* synthetic */ C11548q<C0740i2> f33935e;

    /* renamed from: f */
    public final /* synthetic */ C11537n.C11540c<C0740i2> f33936f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11565s(C11548q<C0740i2> qVar, C11537n.C11540c<C0740i2> cVar, C15601d<? super C11565s> dVar) {
        super(2, dVar);
        this.f33935e = qVar;
        this.f33936f = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11565s(this.f33935e, this.f33936f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11565s) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f33934d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C11548q<C0740i2> qVar = this.f33935e;
            C11537n.C11540c<C0740i2> cVar = this.f33936f;
            this.f33934d = 1;
            if (qVar.mo11509l3(cVar, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
