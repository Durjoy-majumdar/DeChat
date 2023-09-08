package d14;

import gy3.C8478d0;
import sx3.C64188i0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.o0 */
public final class C58073o0<T> implements C45253g {

    /* renamed from: d */
    public final /* synthetic */ C45253g<C64188i0<? extends T>> f166093d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f166094e;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", mo125469f = "Transform.kt", mo125470l = {65}, mo125471m = "emit")
    /* renamed from: d14.o0$a */
    public static final class C58074a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f166095d;

        /* renamed from: e */
        public final /* synthetic */ C58073o0<T> f166096e;

        /* renamed from: f */
        public int f166097f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58074a(C58073o0<? super T> o0Var, C15601d<? super C58074a> dVar) {
            super(dVar);
            this.f166096e = o0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f166095d = obj;
            this.f166097f |= Integer.MIN_VALUE;
            return this.f166096e.emit(null, this);
        }
    }

    public C58073o0(C45253g<? super C64188i0<? extends T>> gVar, C8478d0 d0Var) {
        this.f166093d = gVar;
        this.f166094e = d0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r8, wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof d14.C58073o0.C58074a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            d14.o0$a r0 = (d14.C58073o0.C58074a) r0
            int r1 = r0.f166097f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166097f = r1
            goto L_0x0018
        L_0x0013:
            d14.o0$a r0 = new d14.o0$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f166095d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166097f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x004c
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r9)
            d14.g<sx3.i0<? extends T>> r9 = r7.f166093d
            sx3.i0 r2 = new sx3.i0
            gy3.d0 r4 = r7.f166094e
            int r5 = r4.f27483d
            int r6 = r5 + 1
            r4.f27483d = r6
            if (r5 < 0) goto L_0x004f
            r2.<init>(r5, r8)
            r0.f166097f = r3
            java.lang.Object r8 = r9.emit(r2, r0)
            if (r8 != r1) goto L_0x004c
            return r1
        L_0x004c:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        L_0x004f:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "Index overflow has happened"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58073o0.emit(java.lang.Object, wx3.d):java.lang.Object");
    }
}
