package i31;

import a14.C0000n0;
import a14.C53895h;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.datapreloader.FutureTask$2", mo125469f = "FutureTask.kt", mo125470l = {37}, mo125471m = "invokeSuspend")
/* renamed from: i31.a */
public final class C117130a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f350940d;

    /* renamed from: e */
    public final /* synthetic */ C117134d<Object, Object, C117139g<Object, Object>> f350941e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C117139g<Object, Object>> f350942f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.datapreloader.FutureTask$2$1", mo125469f = "FutureTask.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: i31.a$a */
    public static final class C117131a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C117134d<Object, Object, C117139g<Object, Object>> f350943d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C117139g<Object, Object>> f350944e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117131a(C117134d<Object, Object, C117139g<Object, Object>> dVar, C32224a<C117139g<Object, Object>> aVar, C15601d<? super C117131a> dVar2) {
            super(2, dVar2);
            this.f350943d = dVar;
            this.f350944e = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C117131a(this.f350943d, this.f350944e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C117131a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C117134d<Object, Object, C117139g<Object, Object>> dVar = this.f350943d;
            T t = (C117139g) this.f350944e.invoke();
            dVar.getClass();
            C87412m.m108594g(t, "<set-?>");
            dVar.f350949b = t;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117130a(C117134d<Object, Object, C117139g<Object, Object>> dVar, C32224a<C117139g<Object, Object>> aVar, C15601d<? super C117130a> dVar2) {
        super(2, dVar2);
        this.f350941e = dVar;
        this.f350942f = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C117130a(this.f350941e, this.f350942f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C117130a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f350940d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C66212f coroutineContext = this.f350941e.mo181069c().getCoroutineContext();
            C117131a aVar2 = new C117131a(this.f350941e, this.f350942f, (C15601d<? super C117131a>) null);
            this.f350940d = 1;
            if (C53895h.m60469g(coroutineContext, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f350941e.f350953f = null;
        return C13598b0.f38549a;
    }
}
