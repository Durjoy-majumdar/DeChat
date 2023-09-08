package d14;

import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.c0 */
public final class C58023c0<T> implements C45253g {

    /* renamed from: d */
    public final /* synthetic */ C45253g<T> f165976d;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", mo125469f = "Merge.kt", mo125470l = {80}, mo125471m = "emit")
    /* renamed from: d14.c0$a */
    public static final class C58024a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f165977d;

        /* renamed from: e */
        public final /* synthetic */ C58023c0<T> f165978e;

        /* renamed from: f */
        public int f165979f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58024a(C58023c0<? super T> c0Var, C15601d<? super C58024a> dVar) {
            super(dVar);
            this.f165978e = c0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f165977d = obj;
            this.f165979f |= Integer.MIN_VALUE;
            return this.f165978e.emit((C45252f) null, this);
        }
    }

    public C58023c0(C45253g<? super T> gVar) {
        this.f165976d = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(d14.C45252f<? extends T> r5, wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d14.C58023c0.C58024a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            d14.c0$a r0 = (d14.C58023c0.C58024a) r0
            int r1 = r0.f165979f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f165979f = r1
            goto L_0x0018
        L_0x0013:
            d14.c0$a r0 = new d14.c0$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f165977d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f165979f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r6)
            d14.g<T> r6 = r4.f165976d
            r0.f165979f = r3
            boolean r2 = r6 instanceof d14.C58072n1
            if (r2 != 0) goto L_0x0049
            java.lang.Object r5 = r5.mo31880a(r6, r0)
            if (r5 != r1) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x0043:
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        L_0x0049:
            d14.n1 r6 = (d14.C58072n1) r6
            java.lang.Throwable r5 = r6.f166092d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58023c0.emit(d14.f, wx3.d):java.lang.Object");
    }
}
