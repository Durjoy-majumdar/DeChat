package p463c0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p1166z0.C112541g;
import p631o1.C109857o;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2", mo125469f = "BringIntoViewResponder.kt", mo125470l = {272}, mo125471m = "invokeSuspend")
/* renamed from: c0.n */
public final class C104204n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f308482d;

    /* renamed from: e */
    public /* synthetic */ Object f308483e;

    /* renamed from: f */
    public final /* synthetic */ C104202m f308484f;

    /* renamed from: g */
    public final /* synthetic */ C112541g f308485g;

    /* renamed from: h */
    public final /* synthetic */ C109857o f308486h;

    /* renamed from: i */
    public final /* synthetic */ C112541g f308487i;

    @C91590f(mo125468c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1", mo125469f = "BringIntoViewResponder.kt", mo125470l = {267}, mo125471m = "invokeSuspend")
    /* renamed from: c0.n$a */
    public static final class C104205a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f308488d;

        /* renamed from: e */
        public final /* synthetic */ C104202m f308489e;

        /* renamed from: f */
        public final /* synthetic */ C112541g f308490f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104205a(C104202m mVar, C112541g gVar, C15601d<? super C104205a> dVar) {
            super(2, dVar);
            this.f308489e = mVar;
            this.f308490f = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C104205a(this.f308489e, this.f308490f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C104205a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f308488d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C104200k kVar = this.f308489e.f308472g;
                if (kVar != null) {
                    C112541g gVar = this.f308490f;
                    this.f308488d = 1;
                    if (kVar.mo145811b(gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    C87412m.m108603p("responder");
                    throw null;
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
    public C104204n(C104202m mVar, C112541g gVar, C109857o oVar, C112541g gVar2, C15601d<? super C104204n> dVar) {
        super(2, dVar);
        this.f308484f = mVar;
        this.f308485g = gVar;
        this.f308486h = oVar;
        this.f308487i = gVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C104204n nVar = new C104204n(this.f308484f, this.f308485g, this.f308486h, this.f308487i, dVar);
        nVar.f308483e = obj;
        return nVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C104204n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f308482d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53895h.m60466d((C0000n0) this.f308483e, (C66212f) null, (C53934p0) null, new C104205a(this.f308484f, this.f308487i, (C15601d<? super C104205a>) null), 3, (Object) null);
            C104202m mVar = this.f308484f;
            C104192d dVar = mVar.f308455e;
            if (dVar == null) {
                dVar = mVar.f308454d;
            }
            C112541g gVar = this.f308485g;
            C109857o oVar = this.f308486h;
            this.f308482d = 1;
            if (dVar.mo145807b(gVar, oVar, this) == aVar) {
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
