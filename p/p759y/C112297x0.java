package p759y;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import fy3.C32227p;
import fy3.C32228q;
import kotlin.ResultKt;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p582k1.C108797b;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4", mo125469f = "Scrollable.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: y.x0 */
public final class C112297x0 extends C91594j implements C32228q<C0000n0, Float, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ float f336294d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<C108797b> f336295e;

    /* renamed from: f */
    public final /* synthetic */ C60667k2<C112196b1> f336296f;

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4$1", mo125469f = "Scrollable.kt", mo125470l = {216}, mo125471m = "invokeSuspend")
    /* renamed from: y.x0$a */
    public static final class C112298a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f336297d;

        /* renamed from: e */
        public final /* synthetic */ C60667k2<C112196b1> f336298e;

        /* renamed from: f */
        public final /* synthetic */ float f336299f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112298a(C60667k2<C112196b1> k2Var, float f, C15601d<? super C112298a> dVar) {
            super(2, dVar);
            this.f336298e = k2Var;
            this.f336299f = f;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C112298a(this.f336298e, this.f336299f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112298a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f336297d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                float f = this.f336299f;
                this.f336297d = 1;
                if (this.f336298e.getValue().mo164021c(f, this) == aVar) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112297x0(C60690y0<C108797b> y0Var, C60667k2<C112196b1> k2Var, C15601d<? super C112297x0> dVar) {
        super(3, dVar);
        this.f336295e = y0Var;
        this.f336296f = k2Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C0000n0 n0Var = (C0000n0) obj;
        float floatValue = ((Number) obj2).floatValue();
        C112297x0 x0Var = new C112297x0(this.f336295e, this.f336296f, (C15601d) obj3);
        x0Var.f336294d = floatValue;
        return x0Var.invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C53895h.m60466d(this.f336295e.getValue().mo159903d(), (C66212f) null, (C53934p0) null, new C112298a(this.f336296f, this.f336294d, (C15601d<? super C112298a>) null), 3, (Object) null);
        return C13598b0.f38549a;
    }
}
