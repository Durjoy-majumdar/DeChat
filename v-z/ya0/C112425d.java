package ya0;

import d14.C45253g;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: ya0.d */
public final class C112425d<T> implements C45253g {

    /* renamed from: d */
    public final /* synthetic */ C45253g f336641d;

    /* renamed from: e */
    public final /* synthetic */ C112430i f336642e;

    @C91590f(mo125468c = "com.tencent.mm.mm_compose.widget.pager.PagerKt$Pager$5$1$invokeSuspend$$inlined$filter$1$2", mo125469f = "Pager.kt", mo125470l = {224}, mo125471m = "emit")
    /* renamed from: ya0.d$a */
    public static final class C112426a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f336643d;

        /* renamed from: e */
        public int f336644e;

        /* renamed from: f */
        public final /* synthetic */ C112425d f336645f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112426a(C112425d dVar, C15601d dVar2) {
            super(dVar2);
            this.f336645f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f336643d = obj;
            this.f336644e |= Integer.MIN_VALUE;
            return this.f336645f.emit((Object) null, this);
        }
    }

    public C112425d(C45253g gVar, C112430i iVar) {
        this.f336641d = gVar;
        this.f336642e = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r5, wx3.C15601d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ya0.C112425d.C112426a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ya0.d$a r0 = (ya0.C112425d.C112426a) r0
            int r1 = r0.f336644e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f336644e = r1
            goto L_0x0018
        L_0x0013:
            ya0.d$a r0 = new ya0.d$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f336643d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f336644e
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0049
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r6)
            d14.g r6 = r4.f336641d
            r2 = r5
            b0.k r2 = (p004b0.C54380k) r2
            ya0.i r2 = r4.f336642e
            boolean r2 = r2.mo90552a()
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0049
            r0.f336644e = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ya0.C112425d.emit(java.lang.Object, wx3.d):java.lang.Object");
    }
}
