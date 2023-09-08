package p1165z;

import a14.C0000n0;
import d14.C45252f;
import d14.C45253g;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60655g0;
import p175j0.C60667k2;
import p175j0.C60690y0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: z.q */
public final class C112532q {

    @C91590f(mo125468c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1", mo125469f = "PressInteraction.kt", mo125470l = {85}, mo125471m = "invokeSuspend")
    /* renamed from: z.q$a */
    public static final class C112533a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f336944d;

        /* renamed from: e */
        public final /* synthetic */ C112526k f336945e;

        /* renamed from: f */
        public final /* synthetic */ C60690y0<Boolean> f336946f;

        /* renamed from: z.q$a$a */
        public static final class C112534a implements C45253g<C112525j> {

            /* renamed from: d */
            public final /* synthetic */ List<C112530o> f336947d;

            /* renamed from: e */
            public final /* synthetic */ C60690y0<Boolean> f336948e;

            public C112534a(List<C112530o> list, C60690y0<Boolean> y0Var) {
                this.f336947d = list;
                this.f336948e = y0Var;
            }

            public Object emit(Object obj, C15601d dVar) {
                C112525j jVar = (C112525j) obj;
                if (jVar instanceof C112530o) {
                    this.f336947d.add(jVar);
                } else if (jVar instanceof C112531p) {
                    this.f336947d.remove(((C112531p) jVar).f336943a);
                } else if (jVar instanceof C112529n) {
                    this.f336947d.remove(((C112529n) jVar).f336941a);
                }
                this.f336948e.setValue(Boolean.valueOf(!this.f336947d.isEmpty()));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112533a(C112526k kVar, C60690y0<Boolean> y0Var, C15601d<? super C112533a> dVar) {
            super(2, dVar);
            this.f336945e = kVar;
            this.f336946f = y0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C112533a(this.f336945e, this.f336946f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112533a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f336944d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                C45252f<C112525j> c = this.f336945e.mo164251c();
                C112534a aVar2 = new C112534a(arrayList, this.f336946f);
                this.f336944d = 1;
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

    /* renamed from: a */
    public static final C60667k2<Boolean> m153726a(C112526k kVar, C108504h hVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        hVar.mo51557H(-1692965168);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i2 = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            q = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        C60655g0.m70932c(kVar, new C112533a(kVar, y0Var, (C15601d<? super C112533a>) null), hVar, i & 14);
        hVar.mo51565P();
        return y0Var;
    }
}
