package d14;

import e14.C58509v;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.e */
public final class C58028e<T> implements C45252f<T> {

    /* renamed from: d */
    public final C45252f<T> f165987d;

    /* renamed from: e */
    public final C32226l<T, Object> f165988e;

    /* renamed from: f */
    public final C32227p<Object, Object, Boolean> f165989f;

    /* renamed from: d14.e$a */
    public static final class C58029a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C58028e<T> f165990d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<Object> f165991e;

        /* renamed from: f */
        public final /* synthetic */ C45253g<T> f165992f;

        @C91590f(mo125468c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", mo125469f = "Distinct.kt", mo125470l = {81}, mo125471m = "emit")
        /* renamed from: d14.e$a$a */
        public static final class C58030a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f165993d;

            /* renamed from: e */
            public final /* synthetic */ C58029a<T> f165994e;

            /* renamed from: f */
            public int f165995f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58030a(C58029a<? super T> aVar, C15601d<? super C58030a> dVar) {
                super(dVar);
                this.f165994e = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f165993d = obj;
                this.f165995f |= Integer.MIN_VALUE;
                return this.f165994e.emit(null, this);
            }
        }

        public C58029a(C58028e<T> eVar, C8479f0<Object> f0Var, C45253g<? super T> gVar) {
            this.f165990d = eVar;
            this.f165991e = f0Var;
            this.f165992f = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, wx3.C15601d<? super rx3.C13598b0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof d14.C58028e.C58029a.C58030a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                d14.e$a$a r0 = (d14.C58028e.C58029a.C58030a) r0
                int r1 = r0.f165995f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f165995f = r1
                goto L_0x0018
            L_0x0013:
                d14.e$a$a r0 = new d14.e$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f165993d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f165995f
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0065
            L_0x0027:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r7)
                d14.e<T> r7 = r5.f165990d
                fy3.l<T, java.lang.Object> r7 = r7.f165988e
                java.lang.Object r7 = r7.invoke(r6)
                gy3.f0<java.lang.Object> r2 = r5.f165991e
                T r2 = r2.f27484d
                f14.c0 r4 = e14.C58509v.f167541a
                if (r2 == r4) goto L_0x0056
                d14.e<T> r4 = r5.f165990d
                fy3.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f165989f
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0053
                goto L_0x0056
            L_0x0053:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            L_0x0056:
                gy3.f0<java.lang.Object> r2 = r5.f165991e
                r2.f27484d = r7
                d14.g<T> r7 = r5.f165992f
                r0.f165995f = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0065
                return r1
            L_0x0065:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: d14.C58028e.C58029a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    public C58028e(C45252f<? extends T> fVar, C32226l<? super T, ? extends Object> lVar, C32227p<Object, Object, Boolean> pVar) {
        this.f165987d = fVar;
        this.f165988e = lVar;
        this.f165989f = pVar;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g<? super T> gVar, C15601d<? super C13598b0> dVar) {
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = C58509v.f167541a;
        Object a = this.f165987d.mo31880a(new C58029a(this, f0Var, gVar), dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }
}
