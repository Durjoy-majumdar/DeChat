package p247u3;

import d14.C45252f;
import d14.C45253g;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: u3.p1 */
public final class C65121p1 implements C45252f<C65086n0<Object>> {

    /* renamed from: d */
    public final /* synthetic */ C45252f f187438d;

    /* renamed from: e */
    public final /* synthetic */ C32227p f187439e;

    /* renamed from: u3.p1$a */
    public static final class C65122a implements C45253g<C65086n0<Object>> {

        /* renamed from: d */
        public final /* synthetic */ C45253g f187440d;

        /* renamed from: e */
        public final /* synthetic */ C65121p1 f187441e;

        @C91590f(mo125468c = "androidx.paging.PagingDataTransforms$filter$$inlined$transform$1$2", mo125469f = "PagingDataTransforms.kt", mo125470l = {136, 136}, mo125471m = "emit")
        /* renamed from: u3.p1$a$a */
        public static final class C65123a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f187442d;

            /* renamed from: e */
            public int f187443e;

            /* renamed from: f */
            public Object f187444f;

            /* renamed from: g */
            public final /* synthetic */ C65122a f187445g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65123a(C65122a aVar, C15601d dVar) {
                super(dVar);
                this.f187445g = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f187442d = obj;
                this.f187443e |= Integer.MIN_VALUE;
                return this.f187445g.emit((Object) null, this);
            }
        }

        public C65122a(C45253g gVar, C65121p1 p1Var) {
            this.f187440d = gVar;
            this.f187441e = p1Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r7, wx3.C15601d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p247u3.C65121p1.C65122a.C65123a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                u3.p1$a$a r0 = (p247u3.C65121p1.C65122a.C65123a) r0
                int r1 = r0.f187443e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f187443e = r1
                goto L_0x0018
            L_0x0013:
                u3.p1$a$a r0 = new u3.p1$a$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f187442d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f187443e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x005f
            L_0x002a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0032:
                java.lang.Object r7 = r0.f187444f
                d14.g r7 = (d14.C45253g) r7
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x0053
            L_0x003a:
                kotlin.ResultKt.throwOnFailure(r8)
                d14.g r8 = r6.f187440d
                u3.n0 r7 = (p247u3.C65086n0) r7
                u3.p1 r2 = r6.f187441e
                fy3.p r2 = r2.f187439e
                r0.f187444f = r8
                r0.f187443e = r4
                java.lang.Object r7 = r7.mo89282a(r2, r0)
                if (r7 != r1) goto L_0x0050
                return r1
            L_0x0050:
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x0053:
                r2 = 0
                r0.f187444f = r2
                r0.f187443e = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L_0x005f
                return r1
            L_0x005f:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65121p1.C65122a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    public C65121p1(C45252f fVar, C32227p pVar) {
        this.f187438d = fVar;
        this.f187439e = pVar;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g gVar, C15601d dVar) {
        Object a = this.f187438d.mo31880a(new C65122a(gVar, this), dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }
}
