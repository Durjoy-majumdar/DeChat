package p558i0;

import a14.C0000n0;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.ResultKt;
import p257w.C111626b;
import p257w.C37901h;
import p257w.C37907l;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", mo125469f = "Ripple.kt", mo125470l = {296}, mo125471m = "invokeSuspend")
/* renamed from: i0.t */
public final class C33172t extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f90041d;

    /* renamed from: e */
    public final /* synthetic */ C108312u f90042e;

    /* renamed from: f */
    public final /* synthetic */ C37901h<Float> f90043f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33172t(C108312u uVar, C37901h<Float> hVar, C15601d<? super C33172t> dVar) {
        super(2, dVar);
        this.f90042e = uVar;
        this.f90043f = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C33172t(this.f90042e, this.f90043f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C33172t) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f90041d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C111626b<Float, C37907l> bVar = this.f90042e.f324320c;
            Float f = new Float(0.0f);
            C37901h<Float> hVar = this.f90043f;
            this.f90041d = 1;
            if (C111626b.m152137b(bVar, f, hVar, (Object) null, (C32226l) null, this, 12, (Object) null) == aVar) {
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
