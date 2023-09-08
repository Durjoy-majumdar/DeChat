package p720v;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p257w.C111654m;
import p257w.C111656m1;
import p257w.C37892b0;
import p257w.C37903i;
import p257w.C37906k1;
import p257w.C37944w0;
import p436a1.C103222a1;
import p560i2.C108329n;
import p560i2.C33177j;
import p560i2.C33179k;
import p560i2.C33181m;

/* renamed from: v.o */
public final class C111278o {

    /* renamed from: a */
    public static final C37906k1<C103222a1, C111654m> f333187a = C111656m1.m152187a(C111279a.f333192d, C111280b.f333193d);

    /* renamed from: b */
    public static final C60690y0<Float> f333188b = C108500f2.m146996c(Float.valueOf(1.0f), (C108497e2) null, 2, (Object) null);

    /* renamed from: c */
    public static final C37944w0<Float> f333189c = C37903i.m41594b(0.0f, 400.0f, (Object) null, 5, (Object) null);

    /* renamed from: d */
    public static final C37944w0<C33177j> f333190d = C37903i.m41594b(0.0f, 400.0f, new C33177j(C33179k.m39964a(1, 1)), 1, (Object) null);

    /* renamed from: e */
    public static final C37944w0<C33181m> f333191e = C37903i.m41594b(0.0f, 400.0f, new C33181m(C108329n.m146743a(1, 1)), 1, (Object) null);

    /* renamed from: v.o$c */
    public static final class C37631c extends C87413o implements C32226l<C33181m, C33177j> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Integer, Integer> f99771d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37631c(C32226l<? super Integer, Integer> lVar) {
            super(1);
            this.f99771d = lVar;
        }

        public Object invoke(Object obj) {
            return new C33177j(C33179k.m39964a(0, this.f99771d.invoke(Integer.valueOf(C33181m.m39966b(((C33181m) obj).f90057a))).intValue()));
        }
    }

    /* renamed from: v.o$d */
    public static final class C37632d extends C87413o implements C32226l<C33181m, C33177j> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Integer, Integer> f99772d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37632d(C32226l<? super Integer, Integer> lVar) {
            super(1);
            this.f99772d = lVar;
        }

        public Object invoke(Object obj) {
            return new C33177j(C33179k.m39964a(0, this.f99772d.invoke(Integer.valueOf(C33181m.m39966b(((C33181m) obj).f90057a))).intValue()));
        }
    }

    /* renamed from: v.o$a */
    public static final class C111279a extends C87413o implements C32226l<C103222a1, C111654m> {

        /* renamed from: d */
        public static final C111279a f333192d = new C111279a();

        public C111279a() {
            super(1);
        }

        public Object invoke(Object obj) {
            long j = ((C103222a1) obj).f304426a;
            return new C111654m(Float.intBitsToFloat((int) (j >> 32)), C103222a1.m136604a(j));
        }
    }

    /* renamed from: v.o$b */
    public static final class C111280b extends C87413o implements C32226l<C111654m, C103222a1> {

        /* renamed from: d */
        public static final C111280b f333193d = new C111280b();

        public C111280b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C111654m mVar = (C111654m) obj;
            C87412m.m108594g(mVar, LocaleUtil.ITALIAN);
            return new C103222a1((((long) Float.floatToIntBits(mVar.f334250a)) << 32) | (((long) Float.floatToIntBits(mVar.f334251b)) & Util.MAX_32BIT_VALUE));
        }
    }

    static {
        int i = C33177j.f90051c;
    }

    /* renamed from: a */
    public static C111292y m151774a(C37892b0 b0Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            b0Var = C37903i.m41594b(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        C87412m.m108594g(b0Var, "animationSpec");
        return new C111293z(new C111283p0(new C37623d0(f, b0Var), (C37629k0) null, (C111256g) null, (C111259h0) null, 14, (C8480h) null));
    }

    /* renamed from: b */
    public static C111239a0 m151775b(C37892b0 b0Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            b0Var = C37903i.m41594b(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        C87412m.m108594g(b0Var, "animationSpec");
        return new C111246b0(new C111283p0(new C37623d0(f, b0Var), (C37629k0) null, (C111256g) null, (C111259h0) null, 14, (C8480h) null));
    }

    /* renamed from: c */
    public static final C111292y m151776c(C37892b0<C33177j> b0Var, C32226l<? super Integer, Integer> lVar) {
        C87412m.m108594g(b0Var, "animationSpec");
        C87412m.m108594g(lVar, "initialOffsetY");
        return new C111293z(new C111283p0((C37623d0) null, new C37629k0(new C37631c(lVar), b0Var), (C111256g) null, (C111259h0) null, 13, (C8480h) null));
    }

    /* renamed from: d */
    public static final C111239a0 m151777d(C37892b0<C33177j> b0Var, C32226l<? super Integer, Integer> lVar) {
        C87412m.m108594g(b0Var, "animationSpec");
        C87412m.m108594g(lVar, "targetOffsetY");
        return new C111246b0(new C111283p0((C37623d0) null, new C37629k0(new C37632d(lVar), b0Var), (C111256g) null, (C111259h0) null, 13, (C8480h) null));
    }
}
