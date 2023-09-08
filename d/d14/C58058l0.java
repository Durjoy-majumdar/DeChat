package d14;

import a14.C0000n0;
import d14.C58032e1;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", mo125469f = "Share.kt", mo125470l = {214, 218, 219, 225}, mo125471m = "invokeSuspend")
/* renamed from: d14.l0 */
public final class C58058l0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f166055d;

    /* renamed from: e */
    public final /* synthetic */ C58032e1 f166056e;

    /* renamed from: f */
    public final /* synthetic */ C45252f<Object> f166057f;

    /* renamed from: g */
    public final /* synthetic */ C58085t0<Object> f166058g;

    /* renamed from: h */
    public final /* synthetic */ Object f166059h;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", mo125469f = "Share.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: d14.l0$a */
    public static final class C7160a extends C91594j implements C32227p<Integer, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public /* synthetic */ int f25135d;

        public C7160a(C15601d<? super C7160a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C7160a aVar = new C7160a(dVar);
            aVar.f25135d = ((Number) obj).intValue();
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C7160a) create(Integer.valueOf(((Number) obj).intValue()), (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return Boolean.valueOf(this.f25135d > 0);
        }
    }

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", mo125469f = "Share.kt", mo125470l = {227}, mo125471m = "invokeSuspend")
    /* renamed from: d14.l0$b */
    public static final class C58059b extends C91594j implements C32227p<C58025c1, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f166060d;

        /* renamed from: e */
        public /* synthetic */ Object f166061e;

        /* renamed from: f */
        public final /* synthetic */ C45252f<Object> f166062f;

        /* renamed from: g */
        public final /* synthetic */ C58085t0<Object> f166063g;

        /* renamed from: h */
        public final /* synthetic */ Object f166064h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58059b(C45252f<Object> fVar, C58085t0<Object> t0Var, Object obj, C15601d<? super C58059b> dVar) {
            super(2, dVar);
            this.f166062f = fVar;
            this.f166063g = t0Var;
            this.f166064h = obj;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C58059b bVar = new C58059b(this.f166062f, this.f166063g, this.f166064h, dVar);
            bVar.f166061e = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C58059b) create((C58025c1) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f166060d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int ordinal = ((C58025c1) this.f166061e).ordinal();
                if (ordinal == 0) {
                    C45252f<Object> fVar = this.f166062f;
                    C58085t0<Object> t0Var = this.f166063g;
                    this.f166060d = 1;
                    if (fVar.mo31880a(t0Var, this) == aVar) {
                        return aVar;
                    }
                } else if (ordinal == 2) {
                    Object obj2 = this.f166064h;
                    if (obj2 == C58017a1.f165964a) {
                        this.f166063g.mo82830b();
                    } else {
                        this.f166063g.mo82832d(obj2);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58058l0(C58032e1 e1Var, C45252f<Object> fVar, C58085t0<Object> t0Var, Object obj, C15601d<? super C58058l0> dVar) {
        super(2, dVar);
        this.f166056e = e1Var;
        this.f166057f = fVar;
        this.f166058g = t0Var;
        this.f166059h = obj;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C58058l0(this.f166056e, this.f166057f, this.f166058g, this.f166059h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C58058l0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f166055d;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                } else if (!(i == 3 || i == 4)) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        }
        ResultKt.throwOnFailure(obj);
        C58032e1 e1Var = this.f166056e;
        int i2 = C58032e1.f165997a;
        if (e1Var == C58032e1.C58033a.f165998a) {
            C45252f<Object> fVar = this.f166057f;
            C58085t0<Object> t0Var = this.f166058g;
            this.f166055d = 1;
            if (fVar.mo31880a(t0Var, this) == aVar) {
                return aVar;
            }
        } else if (e1Var == C58032e1.C58033a.f165999b) {
            C58050i1<Integer> e = this.f166058g.mo82839e();
            C7160a aVar2 = new C7160a((C15601d<? super C7160a>) null);
            this.f166055d = 2;
            if (C58042h.m67198g(e, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            C45252f<C58025c1> e2 = C58042h.m67196e(e1Var.mo82822a(this.f166058g.mo82839e()));
            C58059b bVar = new C58059b(this.f166057f, this.f166058g, this.f166059h, (C15601d<? super C58059b>) null);
            this.f166055d = 4;
            if (C58042h.m67194c(e2, bVar, this) == aVar) {
                return aVar;
            }
        }
        return C13598b0.f38549a;
        C45252f<Object> fVar2 = this.f166057f;
        C58085t0<Object> t0Var2 = this.f166058g;
        this.f166055d = 3;
        if (fVar2.mo31880a(t0Var2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
