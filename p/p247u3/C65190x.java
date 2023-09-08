package p247u3;

import d14.C45252f;
import d14.C58042h;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", mo125469f = "FlowExt.kt", mo125470l = {76}, mo125471m = "invokeSuspend")
/* renamed from: u3.x */
public final class C65190x extends C91594j implements C32227p<C65189w1<Object>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f187684d;

    /* renamed from: e */
    public int f187685e;

    /* renamed from: f */
    public final /* synthetic */ C45252f f187686f;

    /* renamed from: g */
    public final /* synthetic */ C32228q f187687g;

    @C91590f(mo125468c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", mo125469f = "FlowExt.kt", mo125470l = {77}, mo125471m = "invokeSuspend")
    /* renamed from: u3.x$a */
    public static final class C65191a extends C91594j implements C32227p<Object, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f187688d;

        /* renamed from: e */
        public int f187689e;

        /* renamed from: f */
        public final /* synthetic */ C65190x f187690f;

        /* renamed from: g */
        public final /* synthetic */ C65076l f187691g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65191a(C65190x xVar, C65076l lVar, C15601d dVar) {
            super(2, dVar);
            this.f187690f = xVar;
            this.f187691g = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            C65191a aVar = new C65191a(this.f187690f, this.f187691g, dVar);
            aVar.f187688d = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65191a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f187689e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f187688d;
                C32228q qVar = this.f187690f.f187687g;
                C65076l lVar = this.f187691g;
                this.f187689e = 1;
                if (qVar.invoke(lVar, obj2, this) == aVar) {
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
    public C65190x(C45252f fVar, C32228q qVar, C15601d dVar) {
        super(2, dVar);
        this.f187686f = fVar;
        this.f187687g = qVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        C65190x xVar = new C65190x(this.f187686f, this.f187687g, dVar);
        xVar.f187684d = obj;
        return xVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C65190x) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187685e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f fVar = this.f187686f;
            C65191a aVar2 = new C65191a(this, new C65076l((C65189w1) this.f187684d), (C15601d) null);
            this.f187685e = 1;
            if (C58042h.m67194c(fVar, aVar2, this) == aVar) {
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
