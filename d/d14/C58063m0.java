package d14;

import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.m0 */
public final class C58063m0 implements C45252f<Object> {

    /* renamed from: d */
    public final /* synthetic */ C45252f f166071d;

    /* renamed from: d14.m0$a */
    public static final class C58064a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C45253g f166072d;

        @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", mo125469f = "Transform.kt", mo125470l = {223}, mo125471m = "emit")
        /* renamed from: d14.m0$a$a */
        public static final class C58065a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f166073d;

            /* renamed from: e */
            public int f166074e;

            /* renamed from: f */
            public final /* synthetic */ C58064a f166075f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58065a(C58064a aVar, C15601d dVar) {
                super(dVar);
                this.f166075f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f166073d = obj;
                this.f166074e |= Integer.MIN_VALUE;
                return this.f166075f.emit(null, this);
            }
        }

        public C58064a(C45253g gVar) {
            this.f166072d = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r5, wx3.C15601d<? super rx3.C13598b0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof d14.C58063m0.C58064a.C58065a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                d14.m0$a$a r0 = (d14.C58063m0.C58064a.C58065a) r0
                int r1 = r0.f166074e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f166074e = r1
                goto L_0x0018
            L_0x0013:
                d14.m0$a$a r0 = new d14.m0$a$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f166073d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f166074e
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                kotlin.ResultKt.throwOnFailure(r6)
                goto L_0x003f
            L_0x0027:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r6)
                d14.g r6 = r4.f166072d
                if (r5 == 0) goto L_0x003f
                r0.f166074e = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L_0x003f
                return r1
            L_0x003f:
                rx3.b0 r5 = rx3.C13598b0.f38549a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: d14.C58063m0.C58064a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    public C58063m0(C45252f fVar) {
        this.f166071d = fVar;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g gVar, C15601d dVar) {
        Object a = this.f166071d.mo31880a(new C58064a(gVar), dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }
}
