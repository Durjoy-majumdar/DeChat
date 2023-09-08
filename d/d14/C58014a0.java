package d14;

import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.a0 */
public final class C58014a0 implements C45252f<C45252f<Object>> {

    /* renamed from: d */
    public final /* synthetic */ C45252f f165956d;

    /* renamed from: e */
    public final /* synthetic */ C32227p f165957e;

    /* renamed from: d14.a0$a */
    public static final class C58015a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C45253g f165958d;

        /* renamed from: e */
        public final /* synthetic */ C32227p f165959e;

        @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", mo125469f = "Merge.kt", mo125470l = {223, 223}, mo125471m = "emit")
        /* renamed from: d14.a0$a$a */
        public static final class C58016a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f165960d;

            /* renamed from: e */
            public int f165961e;

            /* renamed from: f */
            public Object f165962f;

            /* renamed from: g */
            public final /* synthetic */ C58015a f165963g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58016a(C58015a aVar, C15601d dVar) {
                super(dVar);
                this.f165963g = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f165960d = obj;
                this.f165961e |= Integer.MIN_VALUE;
                return this.f165963g.emit((Object) null, this);
            }
        }

        public C58015a(C45253g gVar, C32227p pVar) {
            this.f165958d = gVar;
            this.f165959e = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r7, wx3.C15601d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof d14.C58014a0.C58015a.C58016a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                d14.a0$a$a r0 = (d14.C58014a0.C58015a.C58016a) r0
                int r1 = r0.f165961e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f165961e = r1
                goto L_0x0018
            L_0x0013:
                d14.a0$a$a r0 = new d14.a0$a$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f165960d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f165961e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x005b
            L_0x002a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0032:
                java.lang.Object r7 = r0.f165962f
                d14.g r7 = (d14.C45253g) r7
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x004f
            L_0x003a:
                kotlin.ResultKt.throwOnFailure(r8)
                d14.g r8 = r6.f165958d
                fy3.p r2 = r6.f165959e
                r0.f165962f = r8
                r0.f165961e = r4
                java.lang.Object r7 = r2.invoke(r7, r0)
                if (r7 != r1) goto L_0x004c
                return r1
            L_0x004c:
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x004f:
                r2 = 0
                r0.f165962f = r2
                r0.f165961e = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L_0x005b
                return r1
            L_0x005b:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: d14.C58014a0.C58015a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    public C58014a0(C45252f fVar, C32227p pVar) {
        this.f165956d = fVar;
        this.f165957e = pVar;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g gVar, C15601d dVar) {
        Object a = this.f165956d.mo31880a(new C58015a(gVar, this.f165957e), dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }
}
