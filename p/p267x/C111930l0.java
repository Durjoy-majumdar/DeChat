package p267x;

import a14.C0000n0;
import fy3.C32227p;
import p1165z.C112517d;
import p1165z.C112527l;
import p175j0.C60690y0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", mo125469f = "Focusable.kt", mo125470l = {152, 156}, mo125471m = "invokeSuspend")
/* renamed from: x.l0 */
public final class C111930l0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f335089d;

    /* renamed from: e */
    public int f335090e;

    /* renamed from: f */
    public final /* synthetic */ C60690y0<C112517d> f335091f;

    /* renamed from: g */
    public final /* synthetic */ C112527l f335092g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111930l0(C60690y0<C112517d> y0Var, C112527l lVar, C15601d<? super C111930l0> dVar) {
        super(2, dVar);
        this.f335091f = y0Var;
        this.f335092g = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111930l0(this.f335091f, this.f335092g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111930l0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f335090e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r0 = r6.f335089d
            z.d r0 = (p1165z.C112517d) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0062
        L_0x0014:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001c:
            java.lang.Object r1 = r6.f335089d
            j0.y0 r1 = (p175j0.C60690y0) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0048
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r7)
            j0.y0<z.d> r7 = r6.f335091f
            java.lang.Object r7 = r7.getValue()
            z.d r7 = (p1165z.C112517d) r7
            if (r7 == 0) goto L_0x004d
            z.l r1 = r6.f335092g
            j0.y0<z.d> r4 = r6.f335091f
            z.e r5 = new z.e
            r5.<init>(r7)
            if (r1 == 0) goto L_0x0049
            r6.f335089d = r4
            r6.f335090e = r3
            java.lang.Object r7 = r1.mo164252a(r5, r6)
            if (r7 != r0) goto L_0x0047
            return r0
        L_0x0047:
            r1 = r4
        L_0x0048:
            r4 = r1
        L_0x0049:
            r7 = 0
            r4.setValue(r7)
        L_0x004d:
            z.d r7 = new z.d
            r7.<init>()
            z.l r1 = r6.f335092g
            if (r1 == 0) goto L_0x0063
            r6.f335089d = r7
            r6.f335090e = r2
            java.lang.Object r1 = r1.mo164252a(r7, r6)
            if (r1 != r0) goto L_0x0061
            return r0
        L_0x0061:
            r0 = r7
        L_0x0062:
            r7 = r0
        L_0x0063:
            j0.y0<z.d> r0 = r6.f335091f
            r0.setValue(r7)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p267x.C111930l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
