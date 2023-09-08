package d14;

import fy3.C32227p;
import gy3.C8479f0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.g0 */
public final class C58036g0 implements C45253g<Object> {

    /* renamed from: d */
    public final /* synthetic */ C32227p f166001d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0 f166002e;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", mo125469f = "Reduce.kt", mo125470l = {142}, mo125471m = "emit")
    /* renamed from: d14.g0$a */
    public static final class C58037a extends C66704d {

        /* renamed from: d */
        public Object f166003d;

        /* renamed from: e */
        public /* synthetic */ Object f166004e;

        /* renamed from: f */
        public int f166005f;

        /* renamed from: g */
        public final /* synthetic */ C58036g0 f166006g;

        /* renamed from: h */
        public Object f166007h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58037a(C58036g0 g0Var, C15601d dVar) {
            super(dVar);
            this.f166006g = g0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f166004e = obj;
            this.f166005f |= Integer.MIN_VALUE;
            return this.f166006g.emit((Object) null, this);
        }
    }

    public C58036g0(C32227p pVar, C8479f0 f0Var) {
        this.f166001d = pVar;
        this.f166002e = f0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(T r5, wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d14.C58036g0.C58037a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            d14.g0$a r0 = (d14.C58036g0.C58037a) r0
            int r1 = r0.f166005f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166005f = r1
            goto L_0x0018
        L_0x0013:
            d14.g0$a r0 = new d14.g0$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f166004e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166005f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f166007h
            java.lang.Object r0 = r0.f166003d
            d14.g0 r0 = (d14.C58036g0) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0048
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            fy3.p r6 = r4.f166001d
            r0.f166003d = r4
            r0.f166007h = r5
            r0.f166005f = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = r4
        L_0x0048:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0055
            gy3.f0 r6 = r0.f166002e
            r6.f27484d = r5
            r3 = 0
        L_0x0055:
            if (r3 == 0) goto L_0x005a
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        L_0x005a:
            e14.a r5 = new e14.a
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58036g0.emit(java.lang.Object, wx3.d):java.lang.Object");
    }
}
