package p247u3;

import a14.C0000n0;
import d14.C45252f;
import d14.C45253g;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: u3.d */
public final class C65043d implements C45252f<C65077l0<Object>> {

    /* renamed from: d */
    public final /* synthetic */ C45252f f187221d;

    /* renamed from: e */
    public final /* synthetic */ C0000n0 f187222e;

    /* renamed from: u3.d$a */
    public static final class C65044a implements C45253g<C65081m1<Object>> {

        /* renamed from: d */
        public final /* synthetic */ C45253g f187223d;

        /* renamed from: e */
        public final /* synthetic */ C65043d f187224e;

        @C91590f(mo125468c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", mo125469f = "CachedPagingData.kt", mo125470l = {135}, mo125471m = "emit")
        /* renamed from: u3.d$a$a */
        public static final class C65045a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f187225d;

            /* renamed from: e */
            public int f187226e;

            /* renamed from: f */
            public final /* synthetic */ C65044a f187227f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65045a(C65044a aVar, C15601d dVar) {
                super(dVar);
                this.f187227f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f187225d = obj;
                this.f187226e |= Integer.MIN_VALUE;
                return this.f187227f.emit((Object) null, this);
            }
        }

        public C65044a(C45253g gVar, C65043d dVar) {
            this.f187223d = gVar;
            this.f187224e = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r11, wx3.C15601d r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof p247u3.C65043d.C65044a.C65045a
                if (r0 == 0) goto L_0x0013
                r0 = r12
                u3.d$a$a r0 = (p247u3.C65043d.C65044a.C65045a) r0
                int r1 = r0.f187226e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f187226e = r1
                goto L_0x0018
            L_0x0013:
                u3.d$a$a r0 = new u3.d$a$a
                r0.<init>(r10, r12)
            L_0x0018:
                java.lang.Object r12 = r0.f187225d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f187226e
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x004d
            L_0x0027:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r12)
                d14.g r12 = r10.f187223d
                r6 = r11
                u3.m1 r6 = (p247u3.C65081m1) r6
                u3.l0 r11 = new u3.l0
                u3.d r2 = r10.f187224e
                a14.n0 r5 = r2.f187222e
                r7 = 0
                r8 = 4
                r9 = 0
                r4 = r11
                r4.<init>(r5, r6, r7, r8, r9)
                r0.f187226e = r3
                java.lang.Object r11 = r12.emit(r11, r0)
                if (r11 != r1) goto L_0x004d
                return r1
            L_0x004d:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65043d.C65044a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    public C65043d(C45252f fVar, C0000n0 n0Var) {
        this.f187221d = fVar;
        this.f187222e = n0Var;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g gVar, C15601d dVar) {
        Object a = this.f187221d.mo31880a(new C65044a(gVar, this), dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }
}
