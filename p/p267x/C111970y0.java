package p267x;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p1165z.C112521g;
import p1165z.C112527l;
import p175j0.C60690y0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.HoverableKt$hoverable$2$2", mo125469f = "Hoverable.kt", mo125470l = {85}, mo125471m = "invokeSuspend")
/* renamed from: x.y0 */
public final class C111970y0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f335213d;

    /* renamed from: e */
    public final /* synthetic */ boolean f335214e;

    /* renamed from: f */
    public final /* synthetic */ C60690y0<C112521g> f335215f;

    /* renamed from: g */
    public final /* synthetic */ C112527l f335216g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111970y0(boolean z, C60690y0<C112521g> y0Var, C112527l lVar, C15601d<? super C111970y0> dVar) {
        super(2, dVar);
        this.f335214e = z;
        this.f335215f = y0Var;
        this.f335216g = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111970y0(this.f335214e, this.f335215f, this.f335216g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111970y0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f335213d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.f335214e) {
                C60690y0<C112521g> y0Var = this.f335215f;
                C112527l lVar = this.f335216g;
                this.f335213d = 1;
                if (C111892c1.m152613b(y0Var, lVar, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
