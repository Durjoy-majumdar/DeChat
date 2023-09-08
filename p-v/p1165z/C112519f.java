package p1165z;

import a14.C0000n0;
import d14.C45252f;
import d14.C45253g;
import fy3.C32227p;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import p175j0.C60690y0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1", mo125469f = "FocusInteraction.kt", mo125470l = {69}, mo125471m = "invokeSuspend")
/* renamed from: z.f */
public final class C112519f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f336929d;

    /* renamed from: e */
    public final /* synthetic */ C112526k f336930e;

    /* renamed from: f */
    public final /* synthetic */ C60690y0<Boolean> f336931f;

    /* renamed from: z.f$a */
    public static final class C112520a implements C45253g<C112525j> {

        /* renamed from: d */
        public final /* synthetic */ List<C112517d> f336932d;

        /* renamed from: e */
        public final /* synthetic */ C60690y0<Boolean> f336933e;

        public C112520a(List<C112517d> list, C60690y0<Boolean> y0Var) {
            this.f336932d = list;
            this.f336933e = y0Var;
        }

        public Object emit(Object obj, C15601d dVar) {
            C112525j jVar = (C112525j) obj;
            if (jVar instanceof C112517d) {
                this.f336932d.add(jVar);
            } else if (jVar instanceof C112518e) {
                this.f336932d.remove(((C112518e) jVar).f336928a);
            }
            this.f336933e.setValue(Boolean.valueOf(!this.f336932d.isEmpty()));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112519f(C112526k kVar, C60690y0<Boolean> y0Var, C15601d<? super C112519f> dVar) {
        super(2, dVar);
        this.f336930e = kVar;
        this.f336931f = y0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112519f(this.f336930e, this.f336931f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112519f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f336929d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            C45252f<C112525j> c = this.f336930e.mo164251c();
            C112520a aVar2 = new C112520a(arrayList, this.f336931f);
            this.f336929d = 1;
            if (c.mo31880a(aVar2, this) == aVar) {
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
