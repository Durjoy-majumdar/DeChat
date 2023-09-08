package d14;

import fy3.C32227p;
import gy3.C8477a0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.z */
public final class C58098z<T> implements C45253g {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f166152d;

    /* renamed from: e */
    public final /* synthetic */ C45253g<T> f166153e;

    /* renamed from: f */
    public final /* synthetic */ C32227p<T, C15601d<? super Boolean>, Object> f166154f;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", mo125469f = "Limit.kt", mo125470l = {37, 38, 40}, mo125471m = "emit")
    /* renamed from: d14.z$a */
    public static final class C58099a extends C66704d {

        /* renamed from: d */
        public Object f166155d;

        /* renamed from: e */
        public Object f166156e;

        /* renamed from: f */
        public /* synthetic */ Object f166157f;

        /* renamed from: g */
        public final /* synthetic */ C58098z<T> f166158g;

        /* renamed from: h */
        public int f166159h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58099a(C58098z<? super T> zVar, C15601d<? super C58099a> dVar) {
            super(dVar);
            this.f166158g = zVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f166157f = obj;
            this.f166159h |= Integer.MIN_VALUE;
            return this.f166158g.emit(null, this);
        }
    }

    public C58098z(C8477a0 a0Var, C45253g<? super T> gVar, C32227p<? super T, ? super C15601d<? super Boolean>, ? extends Object> pVar) {
        this.f166152d = a0Var;
        this.f166153e = gVar;
        this.f166154f = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof d14.C58098z.C58099a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            d14.z$a r0 = (d14.C58098z.C58099a) r0
            int r1 = r0.f166159h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166159h = r1
            goto L_0x0018
        L_0x0013:
            d14.z$a r0 = new d14.z$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f166157f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166159h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0086
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.Object r7 = r0.f166156e
            java.lang.Object r2 = r0.f166155d
            d14.z r2 = (d14.C58098z) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x006a
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0057
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r8)
            gy3.a0 r8 = r6.f166152d
            boolean r8 = r8.f27482d
            if (r8 == 0) goto L_0x005a
            d14.g<T> r8 = r6.f166153e
            r0.f166159h = r5
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x005a:
            fy3.p<T, wx3.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f166154f
            r0.f166155d = r6
            r0.f166156e = r7
            r0.f166159h = r4
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r2 = r6
        L_0x006a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0089
            gy3.a0 r8 = r2.f166152d
            r8.f27482d = r5
            d14.g<T> r8 = r2.f166153e
            r2 = 0
            r0.f166155d = r2
            r0.f166156e = r2
            r0.f166159h = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L_0x0086
            return r1
        L_0x0086:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x0089:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58098z.emit(java.lang.Object, wx3.d):java.lang.Object");
    }
}
