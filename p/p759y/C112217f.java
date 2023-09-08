package p759y;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p1166z0.C112541g;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.gestures.ContentInViewModifier$onSizeChanged$1", mo125469f = "Scrollable.kt", mo125470l = {524}, mo125471m = "invokeSuspend")
/* renamed from: y.f */
public final class C112217f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f335977d;

    /* renamed from: e */
    public final /* synthetic */ C112213e f335978e;

    /* renamed from: f */
    public final /* synthetic */ C112541g f335979f;

    /* renamed from: g */
    public final /* synthetic */ C112541g f335980g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112217f(C112213e eVar, C112541g gVar, C112541g gVar2, C15601d<? super C112217f> dVar) {
        super(2, dVar);
        this.f335978e = eVar;
        this.f335979f = gVar;
        this.f335980g = gVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112217f(this.f335978e, this.f335979f, this.f335980g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112217f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f335977d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C112213e eVar = this.f335978e;
            C112541g gVar = this.f335979f;
            C112541g gVar2 = this.f335980g;
            this.f335977d = 1;
            if (eVar.mo164029f(gVar, gVar2, this) == aVar) {
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
