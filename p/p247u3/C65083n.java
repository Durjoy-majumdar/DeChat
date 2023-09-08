package p247u3;

import d14.C45252f;
import d14.C45253g;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: u3.n */
public final class C65083n implements C45252f<Object> {

    /* renamed from: d */
    public final /* synthetic */ C45252f f187316d;

    /* renamed from: u3.n$a */
    public static final class C65084a implements C45253g<C13604l<? extends Integer, Object>> {

        /* renamed from: d */
        public final /* synthetic */ C45253g f187317d;

        @C91590f(mo125468c = "androidx.paging.ConflatedEventBus$$special$$inlined$mapNotNull$1$2", mo125469f = "ConflatedEventBus.kt", mo125470l = {136}, mo125471m = "emit")
        /* renamed from: u3.n$a$a */
        public static final class C65085a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f187318d;

            /* renamed from: e */
            public int f187319e;

            /* renamed from: f */
            public final /* synthetic */ C65084a f187320f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65085a(C65084a aVar, C15601d dVar) {
                super(dVar);
                this.f187320f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f187318d = obj;
                this.f187319e |= Integer.MIN_VALUE;
                return this.f187320f.emit((Object) null, this);
            }
        }

        public C65084a(C45253g gVar, C65083n nVar) {
            this.f187317d = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r5, wx3.C15601d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p247u3.C65083n.C65084a.C65085a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                u3.n$a$a r0 = (p247u3.C65083n.C65084a.C65085a) r0
                int r1 = r0.f187319e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f187319e = r1
                goto L_0x0018
            L_0x0013:
                u3.n$a$a r0 = new u3.n$a$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f187318d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f187319e
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                kotlin.ResultKt.throwOnFailure(r6)
                goto L_0x0043
            L_0x0027:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r6)
                d14.g r6 = r4.f187317d
                rx3.l r5 = (rx3.C13604l) r5
                B r5 = r5.f38556e
                if (r5 == 0) goto L_0x0046
                r0.f187319e = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L_0x0043
                return r1
            L_0x0043:
                rx3.b0 r5 = rx3.C13598b0.f38549a
                goto L_0x0048
            L_0x0046:
                rx3.b0 r5 = rx3.C13598b0.f38549a
            L_0x0048:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65083n.C65084a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    public C65083n(C45252f fVar) {
        this.f187316d = fVar;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g gVar, C15601d dVar) {
        Object a = this.f187316d.mo31880a(new C65084a(gVar, this), dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }
}
