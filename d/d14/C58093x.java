package d14;

import gy3.C8478d0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.x */
public final class C58093x<T> implements C45253g {

    /* renamed from: d */
    public final /* synthetic */ C8478d0 f166143d;

    /* renamed from: e */
    public final /* synthetic */ int f166144e;

    /* renamed from: f */
    public final /* synthetic */ C45253g<T> f166145f;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", mo125469f = "Limit.kt", mo125470l = {25}, mo125471m = "emit")
    /* renamed from: d14.x$a */
    public static final class C58094a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f166146d;

        /* renamed from: e */
        public final /* synthetic */ C58093x<T> f166147e;

        /* renamed from: f */
        public int f166148f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58094a(C58093x<? super T> xVar, C15601d<? super C58094a> dVar) {
            super(dVar);
            this.f166147e = xVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f166146d = obj;
            this.f166148f |= Integer.MIN_VALUE;
            return this.f166147e.emit(null, this);
        }
    }

    public C58093x(C8478d0 d0Var, int i, C45253g<? super T> gVar) {
        this.f166143d = d0Var;
        this.f166144e = i;
        this.f166145f = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r6, wx3.C15601d<? super rx3.C13598b0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d14.C58093x.C58094a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            d14.x$a r0 = (d14.C58093x.C58094a) r0
            int r1 = r0.f166148f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166148f = r1
            goto L_0x0018
        L_0x0013:
            d14.x$a r0 = new d14.x$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f166146d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166148f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0045
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r7)
            gy3.d0 r7 = r5.f166143d
            int r2 = r7.f27483d
            int r4 = r5.f166144e
            if (r2 < r4) goto L_0x0048
            d14.g<T> r7 = r5.f166145f
            r0.f166148f = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        L_0x0048:
            int r2 = r2 + r3
            r7.f27483d = r2
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58093x.emit(java.lang.Object, wx3.d):java.lang.Object");
    }
}
