package zb2;

import a14.C0000n0;
import a14.C53934p0;
import ac2.C39534d;
import ac2.C53998c;
import c14.C54624g;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import d14.C58017a1;
import d14.C58085t0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: zb2.l */
public final class C66778l {

    /* renamed from: a */
    public static final C66779a f191877a = new C66779a((C8480h) null);

    /* renamed from: zb2.l$a */
    public static final class C66779a {

        @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmPageHelper$Companion$emitPageData$1", mo125469f = "MvvmPageHelper.kt", mo125470l = {31}, mo125471m = "invokeSuspend")
        /* renamed from: zb2.l$a$a */
        public static final class C66780a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f191878d;

            /* renamed from: e */
            public final /* synthetic */ C58085t0<C39534d<T>> f191879e;

            /* renamed from: f */
            public final /* synthetic */ C39534d<T> f191880f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66780a(C58085t0<C39534d<T>> t0Var, C39534d<T> dVar, C15601d<? super C66780a> dVar2) {
                super(2, dVar2);
                this.f191879e = t0Var;
                this.f191880f = dVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C66780a(this.f191879e, this.f191880f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C66780a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f191878d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C58085t0<C39534d<T>> t0Var = this.f191879e;
                    C39534d<T> dVar = this.f191880f;
                    this.f191878d = 1;
                    if (t0Var.emit(dVar, this) == aVar) {
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

        public C66779a(C8480h hVar) {
        }

        /* renamed from: a */
        public final <T> C45252f<C39534d<T>> mo90783a(LifecycleScope lifecycleScope, C39534d<T> dVar) {
            C87412m.m108594g(lifecycleScope, "scope");
            C87412m.m108594g(dVar, "response");
            C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
            LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C66780a(b, dVar, (C15601d<? super C66780a>) null), 1, (Object) null);
            return b;
        }

        /* renamed from: b */
        public final <T> C39534d<T> mo90784b(int i, C53998c<T> cVar, C32226l<? super Integer, ? extends T> lVar) {
            C87412m.m108594g(cVar, "request");
            C87412m.m108594g(lVar, "creator");
            C39534d<T> dVar = new C39534d<>(cVar);
            boolean z = false;
            if (i > cVar.f151264a) {
                int i2 = cVar.f151265b;
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = cVar.f151264a;
                    int i5 = i4 + i3;
                    if (i4 + i3 < i) {
                        dVar.f106151b.add(lVar.invoke(Integer.valueOf(i5)));
                    }
                }
                if (dVar.f106151b.size() >= cVar.f151265b) {
                    z = true;
                }
                dVar.f106150a = z;
            } else {
                dVar.f106150a = false;
            }
            return dVar;
        }
    }
}
