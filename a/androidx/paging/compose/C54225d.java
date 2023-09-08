package androidx.paging.compose;

import a14.C0000n0;
import androidx.paging.compose.C54222c;
import d14.C58042h;
import d14.C58052j1;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32229r;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import p004b0.C103941f;
import p004b0.C54372f0;
import p175j0.C108494d2;
import p175j0.C108504h;
import p247u3.C65006a0;
import p247u3.C65007a1;
import p247u3.C65053e2;
import p247u3.C65060g0;
import p247u3.C65066h0;
import p415q0.C110261c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: androidx.paging.compose.d */
public final class C54225d {

    /* renamed from: a */
    public static final C65066h0 f152192a;

    @C91590f(mo125468c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1", mo125469f = "LazyPagingItems.kt", mo125470l = {242}, mo125471m = "invokeSuspend")
    /* renamed from: androidx.paging.compose.d$a */
    public static final class C54226a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f152193d;

        /* renamed from: e */
        public final /* synthetic */ C54222c<T> f152194e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54226a(C54222c<T> cVar, C15601d<? super C54226a> dVar) {
            super(2, dVar);
            this.f152194e = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54226a(this.f152194e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54226a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f152193d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C54222c<T> cVar = this.f152194e;
                this.f152193d = 1;
                Object c = C58042h.m67194c(cVar.f152186a, new C54221b(cVar, (C15601d<? super C54221b>) null), this);
                if (c != aVar) {
                    c = C13598b0.f38549a;
                }
                if (c == aVar) {
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

    @C91590f(mo125468c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2", mo125469f = "LazyPagingItems.kt", mo125470l = {245}, mo125471m = "invokeSuspend")
    /* renamed from: androidx.paging.compose.d$b */
    public static final class C54227b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f152195d;

        /* renamed from: e */
        public final /* synthetic */ C54222c<T> f152196e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54227b(C54222c<T> cVar, C15601d<? super C54227b> dVar) {
            super(2, dVar);
            this.f152196e = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54227b(this.f152196e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54227b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f152195d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C54222c<T> cVar = this.f152196e;
                this.f152195d = 1;
                Object a = ((C58052j1) cVar.f152188c.f187360i).mo31880a(new C54220a(cVar), this);
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

    /* renamed from: androidx.paging.compose.d$c */
    public static final class C54228c extends C87413o implements C32226l<Integer, Object> {

        /* renamed from: d */
        public final /* synthetic */ C54222c<T> f152197d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<Integer, T, Object> f152198e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54228c(C54222c<T> cVar, C32227p<? super Integer, ? super T, ? extends Object> pVar) {
            super(1);
            this.f152197d = cVar;
            this.f152198e = pVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            Object obj2 = ((C65006a0) ((C108494d2) this.f152197d.f152187b).getValue()).get(intValue);
            return obj2 == null ? new PagingPlaceholderKey(intValue) : this.f152198e.invoke(Integer.valueOf(intValue), obj2);
        }
    }

    /* renamed from: androidx.paging.compose.d$d */
    public static final class C54229d extends C87413o implements C32229r<C103941f, Integer, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32230s<C103941f, Integer, T, C108504h, Integer, C13598b0> f152199d;

        /* renamed from: e */
        public final /* synthetic */ C54222c<T> f152200e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54229d(C32230s<? super C103941f, ? super Integer, ? super T, ? super C108504h, ? super Integer, C13598b0> sVar, C54222c<T> cVar) {
            super(4);
            this.f152199d = sVar;
            this.f152200e = cVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int i;
            C103941f fVar = (C103941f) obj;
            int intValue = ((Number) obj2).intValue();
            C108504h hVar = (C108504h) obj3;
            int intValue2 = ((Number) obj4).intValue();
            C87412m.m108594g(fVar, "$this$items");
            if ((intValue2 & 14) == 0) {
                i = (hVar.mo51619x(fVar) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 112) == 0) {
                i |= hVar.mo51592j(intValue) ? 32 : 16;
            }
            if (((i & 731) ^ 146) != 0 || !hVar.mo51575a()) {
                C32230s<C103941f, Integer, T, C108504h, Integer, C13598b0> sVar = this.f152199d;
                Integer valueOf = Integer.valueOf(intValue);
                C54222c<T> cVar = this.f152200e;
                C54222c.C54224b bVar = cVar.f152188c;
                bVar.f187357f = true;
                bVar.f187358g = intValue;
                C65053e2 e2Var = bVar.f187353b;
                if (e2Var != null) {
                    e2Var.mo89250b(bVar.f187352a.mo89219a(intValue));
                }
                C65007a1<T> a1Var = bVar.f187352a;
                if (intValue < 0) {
                    a1Var.getClass();
                } else if (intValue < a1Var.mo89222d()) {
                    int i2 = intValue - a1Var.f187141c;
                    if (i2 >= 0 && i2 < a1Var.f187140b) {
                        a1Var.mo89221c(i2);
                    }
                    sVar.mo237D(fVar, valueOf, ((C65006a0) ((C108494d2) cVar.f152187b).getValue()).get(intValue), hVar, Integer.valueOf((i & 14) | (i & 112)));
                }
                throw new IndexOutOfBoundsException("Index: " + intValue + ", Size: " + a1Var.mo89222d());
            }
            hVar.mo51581d();
            return C13598b0.f38549a;
        }
    }

    static {
        C65060g0.C65063c cVar = new C65060g0.C65063c(false);
        f152192a = new C65066h0(cVar, cVar, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r0 == p175j0.C108504h.C60656a.f172772a) goto L_0x0021;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> androidx.paging.compose.C54222c<T> m60913a(d14.C45252f<p247u3.C65081m1<T>> r2, p175j0.C108504h r3, int r4) {
        /*
            java.lang.String r4 = "<this>"
            gy3.C87412m.m108594g(r2, r4)
            r4 = 1046463763(0x3e5fc513, float:0.21852522)
            r3.mo51557H(r4)
            r4 = -3686930(0xffffffffffc7bdee, float:NaN)
            r3.mo51557H(r4)
            boolean r4 = r3.mo51619x(r2)
            java.lang.Object r0 = r3.mo51606q()
            if (r4 != 0) goto L_0x0021
            int r4 = p175j0.C108504h.f324828a
            java.lang.Object r4 = p175j0.C108504h.C60656a.f172772a
            if (r0 != r4) goto L_0x0029
        L_0x0021:
            androidx.paging.compose.c r0 = new androidx.paging.compose.c
            r0.<init>(r2)
            r3.mo51553F(r0)
        L_0x0029:
            r3.mo51565P()
            androidx.paging.compose.c r0 = (androidx.paging.compose.C54222c) r0
            androidx.paging.compose.d$a r2 = new androidx.paging.compose.d$a
            r4 = 0
            r2.<init>(r0, r4)
            r1 = 8
            p175j0.C60655g0.m70932c(r0, r2, r3, r1)
            androidx.paging.compose.d$b r2 = new androidx.paging.compose.d$b
            r2.<init>(r0, r4)
            p175j0.C60655g0.m70932c(r0, r2, r3, r1)
            r3.mo51565P()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.compose.C54225d.m60913a(d14.f, j0.h, int):androidx.paging.compose.c");
    }

    /* renamed from: b */
    public static final <T> void m60914b(C54372f0 f0Var, C54222c<T> cVar, C32227p<? super Integer, ? super T, ? extends Object> pVar, C32230s<? super C103941f, ? super Integer, ? super T, ? super C108504h, ? super Integer, C13598b0> sVar) {
        C87412m.m108594g(f0Var, "<this>");
        C87412m.m108594g(cVar, "items");
        C87412m.m108594g(sVar, "itemContent");
        f0Var.mo75138a(cVar.mo75006b(), pVar == null ? null : new C54228c(cVar, pVar), C110261c.m149879c(-985538649, true, new C54229d(sVar, cVar)));
    }
}
