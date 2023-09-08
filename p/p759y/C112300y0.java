package p759y;

import p1166z0.C112539e;
import p175j0.C60667k2;
import p560i2.C108330s;
import p582k1.C108796a;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: y.y0 */
public final class C112300y0 implements C108796a {

    /* renamed from: d */
    public final /* synthetic */ boolean f336300d;

    /* renamed from: e */
    public final /* synthetic */ C60667k2<C112196b1> f336301e;

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", mo125469f = "Scrollable.kt", mo125470l = {423}, mo125471m = "onPostFling-RZ2iAVY")
    /* renamed from: y.y0$a */
    public static final class C112301a extends C66704d {

        /* renamed from: d */
        public long f336302d;

        /* renamed from: e */
        public /* synthetic */ Object f336303e;

        /* renamed from: f */
        public final /* synthetic */ C112300y0 f336304f;

        /* renamed from: g */
        public int f336305g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112301a(C112300y0 y0Var, C15601d<? super C112301a> dVar) {
            super(dVar);
            this.f336304f = y0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f336303e = obj;
            this.f336305g |= Integer.MIN_VALUE;
            return this.f336304f.mo159897d(0, 0, this);
        }
    }

    public C112300y0(boolean z, C60667k2<C112196b1> k2Var) {
        this.f336300d = z;
        this.f336301e = k2Var;
    }

    /* renamed from: b */
    public long mo159896b(long j, long j2, int i) {
        if (!this.f336300d) {
            return C112539e.f336955b;
        }
        C112196b1 value = this.f336301e.getValue();
        if (value.f335913d.mo90552a()) {
            return C112539e.f336955b;
        }
        C112302z0 z0Var = value.f335913d;
        float d = value.mo164022d(j2);
        if (value.f335911b) {
            d *= (float) -1;
        }
        float b = z0Var.mo90553b(d);
        if (value.f335911b) {
            b *= (float) -1;
        }
        return value.mo164023e(b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo159897d(long r3, long r5, wx3.C15601d<? super p560i2.C108330s> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof p759y.C112300y0.C112301a
            if (r3 == 0) goto L_0x0013
            r3 = r7
            y.y0$a r3 = (p759y.C112300y0.C112301a) r3
            int r4 = r3.f336305g
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L_0x0013
            int r4 = r4 - r0
            r3.f336305g = r4
            goto L_0x0018
        L_0x0013:
            y.y0$a r3 = new y.y0$a
            r3.<init>(r2, r7)
        L_0x0018:
            java.lang.Object r4 = r3.f336303e
            xx3.a r7 = xx3.C15911a.COROUTINE_SUSPENDED
            int r0 = r3.f336305g
            r1 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r1) goto L_0x0029
            long r5 = r3.f336302d
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x004b
        L_0x0029:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r4)
            boolean r4 = r2.f336300d
            if (r4 == 0) goto L_0x0054
            j0.k2<y.b1> r4 = r2.f336301e
            java.lang.Object r4 = r4.getValue()
            y.b1 r4 = (p759y.C112196b1) r4
            r3.f336302d = r5
            r3.f336305g = r1
            java.lang.Object r4 = r4.mo164020b(r5, r3)
            if (r4 != r7) goto L_0x004b
            return r7
        L_0x004b:
            i2.s r4 = (p560i2.C108330s) r4
            long r3 = r4.f324356a
            long r3 = p560i2.C108330s.m146748d(r5, r3)
            goto L_0x0058
        L_0x0054:
            int r3 = p560i2.C108330s.f324355c
            long r3 = p560i2.C108330s.f324354b
        L_0x0058:
            i2.s r5 = new i2.s
            r5.<init>(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112300y0.mo159897d(long, long, wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public long mo159898e(long j, int i) {
        return C112539e.f336955b;
    }

    /* renamed from: f */
    public Object mo159899f(long j, C15601d<? super C108330s> dVar) {
        return new C108330s(C108330s.f324354b);
    }
}
