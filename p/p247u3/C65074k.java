package p247u3;

import a14.C53973z1;
import c14.C54612b0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", mo125469f = "CancelableChannelFlow.kt", mo125470l = {30}, mo125471m = "invokeSuspend")
/* renamed from: u3.k */
public final class C65074k extends C91594j implements C32227p<C65189w1<Object>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f187289d;

    /* renamed from: e */
    public int f187290e;

    /* renamed from: f */
    public final /* synthetic */ C53973z1 f187291f;

    /* renamed from: g */
    public final /* synthetic */ C32227p f187292g;

    /* renamed from: u3.k$a */
    public static final class C65075a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65189w1 f187293d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65075a(C65189w1 w1Var) {
            super(1);
            this.f187293d = w1Var;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C54612b0.C54613a.m61404a(this.f187293d, (Throwable) null, 1, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65074k(C53973z1 z1Var, C32227p pVar, C15601d dVar) {
        super(2, dVar);
        this.f187291f = z1Var;
        this.f187292g = pVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        C65074k kVar = new C65074k(this.f187291f, this.f187292g, dVar);
        kVar.f187289d = obj;
        return kVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C65074k) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187290e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C65189w1 w1Var = (C65189w1) this.f187289d;
            this.f187291f.mo74515E(new C65075a(w1Var));
            C32227p pVar = this.f187292g;
            this.f187290e = 1;
            if (pVar.invoke(w1Var, this) == aVar) {
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
