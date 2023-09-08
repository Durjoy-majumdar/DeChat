package e14;

import c14.C54647v;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", mo125469f = "ChannelFlow.kt", mo125470l = {60}, mo125471m = "invokeSuspend")
/* renamed from: e14.f */
public final class C58481f extends C91594j implements C32227p<C54647v<Object>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f167470d;

    /* renamed from: e */
    public /* synthetic */ Object f167471e;

    /* renamed from: f */
    public final /* synthetic */ C58482g<Object> f167472f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58481f(C58482g<Object> gVar, C15601d<? super C58481f> dVar) {
        super(2, dVar);
        this.f167472f = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C58481f fVar = new C58481f(this.f167472f, dVar);
        fVar.f167471e = obj;
        return fVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C58481f) create((C54647v) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f167470d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58482g<Object> gVar = this.f167472f;
            this.f167470d = 1;
            if (gVar.mo82812g((C54647v) this.f167471e, this) == aVar) {
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
