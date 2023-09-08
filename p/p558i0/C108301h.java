package p558i0;

import a14.C53952u;
import a14.C53956v;
import a14.C53973z1;
import gy3.C8480h;
import p1166z0.C112539e;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p257w.C111626b;
import p257w.C111628c;
import p257w.C37907l;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: i0.h */
public final class C108301h {

    /* renamed from: a */
    public C112539e f324279a;

    /* renamed from: b */
    public final float f324280b;

    /* renamed from: c */
    public final boolean f324281c;

    /* renamed from: d */
    public Float f324282d;

    /* renamed from: e */
    public Float f324283e;

    /* renamed from: f */
    public C112539e f324284f;

    /* renamed from: g */
    public final C111626b<Float, C37907l> f324285g = C111628c.m152140a(0.0f, 0.0f, 2, (Object) null);

    /* renamed from: h */
    public final C111626b<Float, C37907l> f324286h = C111628c.m152140a(0.0f, 0.0f, 2, (Object) null);

    /* renamed from: i */
    public final C111626b<Float, C37907l> f324287i = C111628c.m152140a(0.0f, 0.0f, 2, (Object) null);

    /* renamed from: j */
    public final C53952u<C13598b0> f324288j = new C53956v((C53973z1) null);

    /* renamed from: k */
    public final C60690y0 f324289k;

    /* renamed from: l */
    public final C60690y0 f324290l;

    @C91590f(mo125468c = "androidx.compose.material.ripple.RippleAnimation", mo125469f = "RippleAnimation.kt", mo125470l = {80, 82, 83}, mo125471m = "animate")
    /* renamed from: i0.h$a */
    public static final class C108302a extends C66704d {

        /* renamed from: d */
        public Object f324291d;

        /* renamed from: e */
        public /* synthetic */ Object f324292e;

        /* renamed from: f */
        public final /* synthetic */ C108301h f324293f;

        /* renamed from: g */
        public int f324294g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108302a(C108301h hVar, C15601d<? super C108302a> dVar) {
            super(dVar);
            this.f324293f = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324292e = obj;
            this.f324294g |= Integer.MIN_VALUE;
            return this.f324293f.mo158761a(this);
        }
    }

    public C108301h(C112539e eVar, float f, boolean z, C8480h hVar) {
        this.f324279a = eVar;
        this.f324280b = f;
        this.f324281c = z;
        Boolean bool = Boolean.FALSE;
        this.f324289k = C108500f2.m146996c(bool, (C108497e2) null, 2, (Object) null);
        this.f324290l = C108500f2.m146996c(bool, (C108497e2) null, 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158761a(wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p558i0.C108301h.C108302a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            i0.h$a r0 = (p558i0.C108301h.C108302a) r0
            int r1 = r0.f324294g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f324294g = r1
            goto L_0x0018
        L_0x0013:
            i0.h$a r0 = new i0.h$a
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f324292e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324294g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0046
            if (r2 == r5) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x008f
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0036:
            java.lang.Object r2 = r0.f324291d
            i0.h r2 = (p558i0.C108301h) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0077
        L_0x003e:
            java.lang.Object r2 = r0.f324291d
            i0.h r2 = (p558i0.C108301h) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x005f
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f324291d = r7
            r0.f324294g = r5
            i0.i r8 = new i0.i
            r8.<init>(r7, r6)
            java.lang.Object r8 = a14.C53930o0.m60559f(r8, r0)
            if (r8 != r1) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            rx3.b0 r8 = rx3.C13598b0.f38549a
        L_0x005b:
            if (r8 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r7
        L_0x005f:
            j0.y0 r8 = r2.f324289k
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            j0.d2 r8 = (p175j0.C108494d2) r8
            r8.setValue(r5)
            a14.u<rx3.b0> r8 = r2.f324288j
            r0.f324291d = r2
            r0.f324294g = r4
            a14.v r8 = (a14.C53956v) r8
            java.lang.Object r8 = r8.mo74549z(r0)
            if (r8 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r0.f324291d = r6
            r0.f324294g = r3
            r2.getClass()
            i0.j r8 = new i0.j
            r8.<init>(r2, r6)
            java.lang.Object r8 = a14.C53930o0.m60559f(r8, r0)
            if (r8 != r1) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            rx3.b0 r8 = rx3.C13598b0.f38549a
        L_0x008c:
            if (r8 != r1) goto L_0x008f
            return r1
        L_0x008f:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p558i0.C108301h.mo158761a(wx3.d):java.lang.Object");
    }
}
