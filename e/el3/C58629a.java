package el3;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import bl3.C54498z;
import c14.C54624g;
import d14.C45253g;
import d14.C58017a1;
import d14.C58085t0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: el3.a */
public final class C58629a<Target> {

    /* renamed from: a */
    public final LinkedList<C54498z> f167857a = new LinkedList<>();

    /* renamed from: el3.a$a */
    public static abstract class C58630a<T> {

        /* renamed from: a */
        public final C58629a<T> f167858a;

        @C91590f(mo125468c = "com.tencent.mm.ui.component.support.StateTransform$BaseStateBuilder$asSharedFlow$1", mo125469f = "StateTransform.kt", mo125470l = {258}, mo125471m = "invokeSuspend")
        /* renamed from: el3.a$a$a */
        public static final class C58631a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f167859d;

            /* renamed from: e */
            public final /* synthetic */ C58630a<T> f167860e;

            /* renamed from: f */
            public final /* synthetic */ C58085t0<T> f167861f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58631a(C58630a<T> aVar, C58085t0<T> t0Var, C15601d<? super C58631a> dVar) {
                super(2, dVar);
                this.f167860e = aVar;
                this.f167861f = t0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C58631a(this.f167860e, this.f167861f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C58631a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f167859d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C58630a<T> aVar2 = this.f167860e;
                    C58085t0<T> t0Var = this.f167861f;
                    this.f167859d = 1;
                    if (aVar2.mo83511b(t0Var, this) == aVar) {
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

        public C58630a(C58629a<T> aVar) {
            C87412m.m108594g(aVar, "stateTransform");
            this.f167858a = aVar;
        }

        /* renamed from: a */
        public C58085t0<T> mo83510a(C0000n0 n0Var, int i) {
            C87412m.m108594g(n0Var, "lifecycleScope");
            this.f167858a.getClass();
            C58085t0<T> a = C58017a1.m67172a(i, Integer.MAX_VALUE, C54624g.DROP_OLDEST);
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C58631a(this, a, (C15601d<? super C58631a>) null), 3, (Object) null);
            return a;
        }

        /* renamed from: b */
        public abstract Object mo83511b(C58085t0<T> t0Var, C15601d<? super C13598b0> dVar);
    }

    /* renamed from: el3.a$b */
    public static final class C58632b<T, S1 extends C54498z, S2 extends C54498z> extends C58630a<T> {

        /* renamed from: b */
        public C32227p<? super S1, ? super S2, ? extends T> f167862b;

        /* renamed from: c */
        public C32226l<? super C54498z, C13598b0> f167863c;

        @C91590f(mo125468c = "com.tencent.mm.ui.component.support.StateTransform$StateBuilder2", mo125469f = "StateTransform.kt", mo125470l = {86}, mo125471m = "bindFlow")
        /* renamed from: el3.a$b$a */
        public static final class C58633a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f167864d;

            /* renamed from: e */
            public final /* synthetic */ C58632b<T, S1, S2> f167865e;

            /* renamed from: f */
            public int f167866f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58633a(C58632b<T, S1, S2> bVar, C15601d<? super C58633a> dVar) {
                super(dVar);
                this.f167865e = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f167864d = obj;
                this.f167866f |= Integer.MIN_VALUE;
                return this.f167865e.mo83511b((C58085t0) null, this);
            }
        }

        /* renamed from: el3.a$b$b */
        public static final class C58634b<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C58632b<T, S1, S2> f167867d;

            /* renamed from: e */
            public final /* synthetic */ C58085t0<T> f167868e;

            public C58634b(C58632b<T, S1, S2> bVar, C58085t0<T> t0Var) {
                this.f167867d = bVar;
                this.f167868e = t0Var;
            }

            public Object emit(Object obj, C15601d dVar) {
                C54498z zVar = (C54498z) obj;
                C32226l<? super C54498z, C13598b0> lVar = this.f167867d.f167863c;
                if (lVar != null) {
                    lVar.invoke(zVar);
                }
                C58632b<T, S1, S2> bVar = this.f167867d;
                C32227p<? super S1, ? super S2, ? extends T> pVar = bVar.f167862b;
                if (pVar != null) {
                    C54498z zVar2 = bVar.f167858a.f167857a.get(0);
                    C87412m.m108592e(zVar2, "null cannot be cast to non-null type S1 of com.tencent.mm.ui.component.support.StateTransform.StateBuilder2.bindFlow$lambda-0");
                    C54498z zVar3 = this.f167867d.f167858a.f167857a.get(1);
                    C87412m.m108592e(zVar3, "null cannot be cast to non-null type S2 of com.tencent.mm.ui.component.support.StateTransform.StateBuilder2.bindFlow$lambda-0");
                    Object invoke = pVar.invoke(zVar2, zVar3);
                    if (invoke != null) {
                        this.f167868e.mo82832d(invoke);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58632b(C58629a<T> aVar) {
            super(aVar);
            C87412m.m108594g(aVar, "stateTransform");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo83511b(d14.C58085t0<T> r5, wx3.C15601d<? super rx3.C13598b0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof el3.C58629a.C58632b.C58633a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                el3.a$b$a r0 = (el3.C58629a.C58632b.C58633a) r0
                int r1 = r0.f167866f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f167866f = r1
                goto L_0x0018
            L_0x0013:
                el3.a$b$a r0 = new el3.a$b$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f167864d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f167866f
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 == r3) goto L_0x002b
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x002b:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L_0x005e
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r6)
                el3.a<T> r6 = r4.f167858a
                java.util.LinkedList<bl3.z> r6 = r6.f167857a
                java.util.Iterator r6 = r6.iterator()
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x0064
                java.lang.Object r6 = r6.next()
                bl3.z r6 = (bl3.C54498z) r6
                rx3.g r6 = r6.f152777d
                rx3.n r6 = (rx3.C36570n) r6
                java.lang.Object r6 = r6.getValue()
                d14.t0 r6 = (d14.C58085t0) r6
                el3.a$b$b r2 = new el3.a$b$b
                r2.<init>(r4, r5)
                r0.f167866f = r3
                java.lang.Object r5 = r6.mo31880a(r2, r0)
                if (r5 != r1) goto L_0x005e
                return r1
            L_0x005e:
                rx3.d r5 = new rx3.d
                r5.<init>()
                throw r5
            L_0x0064:
                rx3.b0 r5 = rx3.C13598b0.f38549a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: el3.C58629a.C58632b.mo83511b(d14.t0, wx3.d):java.lang.Object");
        }
    }
}
