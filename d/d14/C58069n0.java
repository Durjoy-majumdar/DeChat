package d14;

import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.n0 */
public final class C58069n0 implements C45252f<Object> {

    /* renamed from: d */
    public final /* synthetic */ C45252f f166083d;

    /* renamed from: e */
    public final /* synthetic */ C32227p f166084e;

    /* renamed from: d14.n0$a */
    public static final class C58070a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C45253g f166085d;

        /* renamed from: e */
        public final /* synthetic */ C32227p f166086e;

        @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", mo125469f = "Transform.kt", mo125470l = {223, 224}, mo125471m = "emit")
        /* renamed from: d14.n0$a$a */
        public static final class C58071a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f166087d;

            /* renamed from: e */
            public int f166088e;

            /* renamed from: f */
            public final /* synthetic */ C58070a f166089f;

            /* renamed from: g */
            public Object f166090g;

            /* renamed from: h */
            public Object f166091h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58071a(C58070a aVar, C15601d dVar) {
                super(dVar);
                this.f166089f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f166087d = obj;
                this.f166088e |= Integer.MIN_VALUE;
                return this.f166089f.emit(null, this);
            }
        }

        public C58070a(C45253g gVar, C32227p pVar) {
            this.f166085d = gVar;
            this.f166086e = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, wx3.C15601d<? super rx3.C13598b0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof d14.C58069n0.C58070a.C58071a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                d14.n0$a$a r0 = (d14.C58069n0.C58070a.C58071a) r0
                int r1 = r0.f166088e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f166088e = r1
                goto L_0x0018
            L_0x0013:
                d14.n0$a$a r0 = new d14.n0$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f166087d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f166088e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003c
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0060
            L_0x002a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0032:
                java.lang.Object r6 = r0.f166091h
                d14.g r6 = (d14.C45253g) r6
                java.lang.Object r2 = r0.f166090g
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0052
            L_0x003c:
                kotlin.ResultKt.throwOnFailure(r7)
                d14.g r7 = r5.f166085d
                fy3.p r2 = r5.f166086e
                r0.f166090g = r6
                r0.f166091h = r7
                r0.f166088e = r4
                java.lang.Object r2 = r2.invoke(r6, r0)
                if (r2 != r1) goto L_0x0050
                return r1
            L_0x0050:
                r2 = r6
                r6 = r7
            L_0x0052:
                r7 = 0
                r0.f166090g = r7
                r0.f166091h = r7
                r0.f166088e = r3
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L_0x0060
                return r1
            L_0x0060:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: d14.C58069n0.C58070a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    public C58069n0(C45252f fVar, C32227p pVar) {
        this.f166083d = fVar;
        this.f166084e = pVar;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g gVar, C15601d dVar) {
        Object a = this.f166083d.mo31880a(new C58070a(gVar, this.f166084e), dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }
}
