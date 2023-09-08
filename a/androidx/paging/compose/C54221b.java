package androidx.paging.compose;

import androidx.paging.compose.C54222c;
import fy3.C32227p;
import kotlin.ResultKt;
import p247u3.C65081m1;
import p247u3.C65109o1;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", mo125469f = "LazyPagingItems.kt", mo125470l = {218}, mo125471m = "invokeSuspend")
/* renamed from: androidx.paging.compose.b */
public final class C54221b extends C91594j implements C32227p<C65081m1<Object>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f152183d;

    /* renamed from: e */
    public /* synthetic */ Object f152184e;

    /* renamed from: f */
    public final /* synthetic */ C54222c<Object> f152185f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54221b(C54222c<Object> cVar, C15601d<? super C54221b> dVar) {
        super(2, dVar);
        this.f152185f = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C54221b bVar = new C54221b(this.f152185f, dVar);
        bVar.f152184e = obj;
        return bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54221b) create((C65081m1) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f152183d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C54222c.C54224b bVar = this.f152185f.f152188c;
            this.f152183d = 1;
            Object a = bVar.f187356e.mo89338a(0, new C65109o1(bVar, (C65081m1) this.f152184e, (C15601d) null), this);
            if (a != aVar) {
                a = C13598b0.f38549a;
            }
            if (a == aVar) {
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
