package p759y;

import com.google.android.gms.common.internal.Constants;
import gy3.C87412m;
import k14.C60942d;
import k14.C99088c;
import p560i2.C108322d;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: y.m0 */
public final class C112260m0 implements C112255l0, C108322d {

    /* renamed from: d */
    public final /* synthetic */ C108322d f336141d;

    /* renamed from: e */
    public boolean f336142e;

    /* renamed from: f */
    public boolean f336143f;

    /* renamed from: g */
    public final C99088c f336144g = new C60942d(false);

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", mo125469f = "TapGestureDetector.kt", mo125470l = {325}, mo125471m = "tryAwaitRelease")
    /* renamed from: y.m0$a */
    public static final class C112261a extends C66704d {

        /* renamed from: d */
        public Object f336145d;

        /* renamed from: e */
        public /* synthetic */ Object f336146e;

        /* renamed from: f */
        public final /* synthetic */ C112260m0 f336147f;

        /* renamed from: g */
        public int f336148g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112261a(C112260m0 m0Var, C15601d<? super C112261a> dVar) {
            super(dVar);
            this.f336147f = m0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f336146e = obj;
            this.f336148g |= Integer.MIN_VALUE;
            return this.f336147f.mo164036o(this);
        }
    }

    public C112260m0(C108322d dVar) {
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        this.f336141d = dVar;
    }

    /* renamed from: F */
    public long mo143031F(float f) {
        return this.f336141d.mo143031F(f);
    }

    /* renamed from: M */
    public int mo143032M(float f) {
        return this.f336141d.mo143032M(f);
    }

    /* renamed from: O */
    public float mo143033O(long j) {
        return this.f336141d.mo143033O(j);
    }

    /* renamed from: T */
    public float mo143034T(float f) {
        return this.f336141d.mo143034T(f);
    }

    /* renamed from: d0 */
    public float mo143035d0(float f) {
        return this.f336141d.mo143035d0(f);
    }

    /* renamed from: g0 */
    public long mo143036g0(long j) {
        return this.f336141d.mo143036g0(j);
    }

    public float getDensity() {
        return this.f336141d.getDensity();
    }

    public float getFontScale() {
        return this.f336141d.getFontScale();
    }

    /* renamed from: m */
    public float mo143039m(int i) {
        return this.f336141d.mo143039m(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo164036o(wx3.C15601d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p759y.C112260m0.C112261a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            y.m0$a r0 = (p759y.C112260m0.C112261a) r0
            int r1 = r0.f336148g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f336148g = r1
            goto L_0x0018
        L_0x0013:
            y.m0$a r0 = new y.m0$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f336146e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f336148g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f336145d
            y.m0 r0 = (p759y.C112260m0) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x004f
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            boolean r5 = r4.f336142e
            if (r5 != 0) goto L_0x004e
            boolean r5 = r4.f336143f
            if (r5 != 0) goto L_0x004e
            k14.c r5 = r4.f336144g
            r0.f336145d = r4
            r0.f336148g = r3
            r2 = 0
            k14.d r5 = (k14.C60942d) r5
            java.lang.Object r5 = r5.mo85908b(r2, r0)
            if (r5 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r0 = r4
        L_0x004f:
            boolean r5 = r0.f336142e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112260m0.mo164036o(wx3.d):java.lang.Object");
    }

    /* renamed from: q */
    public long mo143040q(long j) {
        return this.f336141d.mo143040q(j);
    }
}
