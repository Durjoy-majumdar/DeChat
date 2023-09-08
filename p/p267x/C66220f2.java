package p267x;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p257w.C37901h;
import p759y.C112273p0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", mo125469f = "Scroll.kt", mo125470l = {284, 286}, mo125471m = "invokeSuspend")
/* renamed from: x.f2 */
public final class C66220f2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f190257d;

    /* renamed from: e */
    public final /* synthetic */ boolean f190258e;

    /* renamed from: f */
    public final /* synthetic */ C111932l2 f190259f;

    /* renamed from: g */
    public final /* synthetic */ float f190260g;

    /* renamed from: h */
    public final /* synthetic */ float f190261h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66220f2(boolean z, C111932l2 l2Var, float f, float f2, C15601d<? super C66220f2> dVar) {
        super(2, dVar);
        this.f190258e = z;
        this.f190259f = l2Var;
        this.f190260g = f;
        this.f190261h = f2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66220f2(this.f190258e, this.f190259f, this.f190260g, this.f190261h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66220f2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f190257d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f190258e) {
                C111932l2 l2Var = this.f190259f;
                float f = this.f190260g;
                this.f190257d = 1;
                if (C112273p0.m153169b(l2Var, f, (C37901h) null, this, 2, (Object) null) == aVar) {
                    return aVar;
                }
            } else {
                C111932l2 l2Var2 = this.f190259f;
                float f2 = this.f190261h;
                this.f190257d = 2;
                if (C112273p0.m153169b(l2Var2, f2, (C37901h) null, this, 2, (Object) null) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
