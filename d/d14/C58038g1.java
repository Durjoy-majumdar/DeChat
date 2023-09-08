package d14;

import fy3.C32227p;
import gy3.C8477a0;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: d14.g1 */
public final class C58038g1 implements C58032e1 {

    @C91590f(mo125468c = "kotlinx.coroutines.flow.StartedLazily$command$1", mo125469f = "SharingStarted.kt", mo125470l = {155}, mo125471m = "invokeSuspend")
    /* renamed from: d14.g1$a */
    public static final class C58039a extends C91594j implements C32227p<C45253g<? super C58025c1>, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f166008d;

        /* renamed from: e */
        public /* synthetic */ Object f166009e;

        /* renamed from: f */
        public final /* synthetic */ C58050i1<Integer> f166010f;

        /* renamed from: d14.g1$a$a */
        public static final class C58040a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C8477a0 f166011d;

            /* renamed from: e */
            public final /* synthetic */ C45253g<C58025c1> f166012e;

            @C91590f(mo125468c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", mo125469f = "SharingStarted.kt", mo125470l = {158}, mo125471m = "emit")
            /* renamed from: d14.g1$a$a$a */
            public static final class C58041a extends C66704d {

                /* renamed from: d */
                public /* synthetic */ Object f166013d;

                /* renamed from: e */
                public final /* synthetic */ C58040a<T> f166014e;

                /* renamed from: f */
                public int f166015f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C58041a(C58040a<? super T> aVar, C15601d<? super C58041a> dVar) {
                    super(dVar);
                    this.f166014e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f166013d = obj;
                    this.f166015f |= Integer.MIN_VALUE;
                    return this.f166014e.mo82825a(0, this);
                }
            }

            public C58040a(C8477a0 a0Var, C45253g<? super C58025c1> gVar) {
                this.f166011d = a0Var;
                this.f166012e = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo82825a(int r5, wx3.C15601d<? super rx3.C13598b0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof d14.C58038g1.C58039a.C58040a.C58041a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    d14.g1$a$a$a r0 = (d14.C58038g1.C58039a.C58040a.C58041a) r0
                    int r1 = r0.f166015f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f166015f = r1
                    goto L_0x0018
                L_0x0013:
                    d14.g1$a$a$a r0 = new d14.g1$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f166013d
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f166015f
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L_0x0049
                L_0x0027:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x002f:
                    kotlin.ResultKt.throwOnFailure(r6)
                    if (r5 <= 0) goto L_0x004c
                    gy3.a0 r5 = r4.f166011d
                    boolean r6 = r5.f27482d
                    if (r6 != 0) goto L_0x004c
                    r5.f27482d = r3
                    d14.g<d14.c1> r5 = r4.f166012e
                    d14.c1 r6 = d14.C58025c1.START
                    r0.f166015f = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    rx3.b0 r5 = rx3.C13598b0.f38549a
                    return r5
                L_0x004c:
                    rx3.b0 r5 = rx3.C13598b0.f38549a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: d14.C58038g1.C58039a.C58040a.mo82825a(int, wx3.d):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C15601d dVar) {
                return mo82825a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58039a(C58050i1<Integer> i1Var, C15601d<? super C58039a> dVar) {
            super(2, dVar);
            this.f166010f = i1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C58039a aVar = new C58039a(this.f166010f, dVar);
            aVar.f166009e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            ((C58039a) create((C45253g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f166008d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8477a0 a0Var = new C8477a0();
                C58050i1<Integer> i1Var = this.f166010f;
                C58040a aVar2 = new C58040a(a0Var, (C45253g) this.f166009e);
                this.f166008d = 1;
                if (i1Var.mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    /* renamed from: a */
    public C45252f<C58025c1> mo82822a(C58050i1<Integer> i1Var) {
        return new C58095x0(new C58039a(i1Var, (C15601d<? super C58039a>) null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
