package e14;

import d14.C45253g;
import f14.C58878f0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: e14.c0 */
public final class C58477c0<T> implements C45253g<T> {

    /* renamed from: d */
    public final C66212f f167460d;

    /* renamed from: e */
    public final Object f167461e;

    /* renamed from: f */
    public final C32227p<T, C15601d<? super C13598b0>, Object> f167462f;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", mo125469f = "ChannelFlow.kt", mo125470l = {212}, mo125471m = "invokeSuspend")
    /* renamed from: e14.c0$a */
    public static final class C58478a extends C91594j implements C32227p<T, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f167463d;

        /* renamed from: e */
        public /* synthetic */ Object f167464e;

        /* renamed from: f */
        public final /* synthetic */ C45253g<T> f167465f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58478a(C45253g<? super T> gVar, C15601d<? super C58478a> dVar) {
            super(2, dVar);
            this.f167465f = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C58478a aVar = new C58478a(this.f167465f, dVar);
            aVar.f167464e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C58478a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f167463d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f167464e;
                C45253g<T> gVar = this.f167465f;
                this.f167463d = 1;
                if (gVar.emit(obj2, this) == aVar) {
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

    public C58477c0(C45253g<? super T> gVar, C66212f fVar) {
        this.f167460d = fVar;
        this.f167461e = C58878f0.m68715b(fVar);
        this.f167462f = new C58478a(gVar, (C15601d<? super C58478a>) null);
    }

    public Object emit(T t, C15601d<? super C13598b0> dVar) {
        Object a = C58483h.m67917a(this.f167460d, t, this.f167461e, this.f167462f, dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }
}
