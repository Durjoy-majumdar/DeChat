package p246u1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112541g;
import p560i2.C33183o;
import p631o1.C109857o;
import p631o1.C109861p;
import p658q1.C110301j;
import p658q1.C110311s;

/* renamed from: u1.f */
public final class C111068f implements Comparable<C111068f> {

    /* renamed from: h */
    public static C111069a f332594h = C111069a.Stripe;

    /* renamed from: d */
    public final C110301j f332595d;

    /* renamed from: e */
    public final C110301j f332596e;

    /* renamed from: f */
    public final C112541g f332597f;

    /* renamed from: g */
    public final C33183o f332598g;

    /* renamed from: u1.f$a */
    public enum C111069a {
        Stripe,
        Location
    }

    /* renamed from: u1.f$b */
    public static final class C111070b extends C87413o implements C32226l<C110301j, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C112541g f332602d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111070b(C112541g gVar) {
            super(1);
            this.f332602d = gVar;
        }

        public Object invoke(Object obj) {
            C110301j jVar = (C110301j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            C110311s c = C111066b0.m151460c(jVar);
            return Boolean.valueOf(c.mo161183y() && !C87412m.m108589b(this.f332602d, C109861p.m149326b(c)));
        }
    }

    /* renamed from: u1.f$c */
    public static final class C111071c extends C87413o implements C32226l<C110301j, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C112541g f332603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111071c(C112541g gVar) {
            super(1);
            this.f332603d = gVar;
        }

        public Object invoke(Object obj) {
            C110301j jVar = (C110301j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            C110311s c = C111066b0.m151460c(jVar);
            return Boolean.valueOf(c.mo161183y() && !C87412m.m108589b(this.f332603d, C109861p.m149326b(c)));
        }
    }

    public C111068f(C110301j jVar, C110301j jVar2) {
        C87412m.m108594g(jVar, "subtreeRoot");
        C87412m.m108594g(jVar2, "node");
        this.f332595d = jVar;
        this.f332596e = jVar2;
        this.f332598g = jVar.f329929x;
        C110311s sVar = jVar.f329895I;
        C110311s c = C111066b0.m151460c(jVar2);
        C112541g gVar = null;
        if (sVar.mo161183y() && c.mo161183y()) {
            gVar = C109857o.C109858a.m149324a(sVar, c, false, 2, (Object) null);
        }
        this.f332597f = gVar;
    }

    /* renamed from: a */
    public int compareTo(C111068f fVar) {
        C87412m.m108594g(fVar, "other");
        C112541g gVar = this.f332597f;
        if (gVar == null) {
            return 1;
        }
        C112541g gVar2 = fVar.f332597f;
        if (gVar2 == null) {
            return -1;
        }
        if (f332594h == C111069a.Stripe) {
            if (gVar.f336964d - gVar2.f336962b <= 0.0f) {
                return -1;
            }
            if (gVar.f336962b - gVar2.f336964d >= 0.0f) {
                return 1;
            }
        }
        boolean z = false;
        if (this.f332598g == C33183o.Ltr) {
            int i = ((gVar.f336961a - gVar2.f336961a) > 0.0f ? 1 : ((gVar.f336961a - gVar2.f336961a) == 0.0f ? 0 : -1));
            if (!(i == 0)) {
                return i < 0 ? -1 : 1;
            }
        } else {
            int i2 = ((gVar.f336963c - gVar2.f336963c) > 0.0f ? 1 : ((gVar.f336963c - gVar2.f336963c) == 0.0f ? 0 : -1));
            if (!(i2 == 0)) {
                return i2 < 0 ? 1 : -1;
            }
        }
        float f = gVar.f336962b;
        float f2 = gVar2.f336962b;
        int i3 = ((f - f2) > 0.0f ? 1 : ((f - f2) == 0.0f ? 0 : -1));
        if (!(i3 == 0)) {
            return i3 < 0 ? -1 : 1;
        }
        int i4 = (((gVar.f336964d - f) - (gVar2.f336964d - f2)) > 0.0f ? 1 : (((gVar.f336964d - f) - (gVar2.f336964d - f2)) == 0.0f ? 0 : -1));
        if (!(i4 == 0)) {
            return i4 < 0 ? 1 : -1;
        }
        int i5 = (((gVar.f336963c - gVar.f336961a) - (gVar2.f336963c - gVar2.f336961a)) > 0.0f ? 1 : (((gVar.f336963c - gVar.f336961a) - (gVar2.f336963c - gVar2.f336961a)) == 0.0f ? 0 : -1));
        if (i5 == 0) {
            z = true;
        }
        if (!z) {
            return i5 < 0 ? 1 : -1;
        }
        C112541g b = C109861p.m149326b(C111066b0.m151460c(this.f332596e));
        C112541g b2 = C109861p.m149326b(C111066b0.m151460c(fVar.f332596e));
        C110301j a = C111066b0.m151458a(this.f332596e, new C111070b(b));
        C110301j a2 = C111066b0.m151458a(fVar.f332596e, new C111071c(b2));
        return (a == null || a2 == null) ? a != null ? 1 : -1 : new C111068f(this.f332595d, a).compareTo(new C111068f(fVar.f332595d, a2));
    }
}
