package p503e1;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: e1.e */
public abstract class C31381e {

    /* renamed from: a */
    public final boolean f83976a;

    /* renamed from: b */
    public final boolean f83977b;

    /* renamed from: e1.e$a */
    public static final class C31382a extends C31381e {

        /* renamed from: c */
        public final float f83978c;

        /* renamed from: d */
        public final float f83979d;

        /* renamed from: e */
        public final float f83980e;

        /* renamed from: f */
        public final boolean f83981f;

        /* renamed from: g */
        public final boolean f83982g;

        /* renamed from: h */
        public final float f83983h;

        /* renamed from: i */
        public final float f83984i;

        public C31382a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, (C8480h) null);
            this.f83978c = f;
            this.f83979d = f2;
            this.f83980e = f3;
            this.f83981f = z;
            this.f83982g = z2;
            this.f83983h = f4;
            this.f83984i = f5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31382a)) {
                return false;
            }
            C31382a aVar = (C31382a) obj;
            return C87412m.m108589b(Float.valueOf(this.f83978c), Float.valueOf(aVar.f83978c)) && C87412m.m108589b(Float.valueOf(this.f83979d), Float.valueOf(aVar.f83979d)) && C87412m.m108589b(Float.valueOf(this.f83980e), Float.valueOf(aVar.f83980e)) && this.f83981f == aVar.f83981f && this.f83982g == aVar.f83982g && C87412m.m108589b(Float.valueOf(this.f83983h), Float.valueOf(aVar.f83983h)) && C87412m.m108589b(Float.valueOf(this.f83984i), Float.valueOf(aVar.f83984i));
        }

        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.f83978c) * 31) + Float.floatToIntBits(this.f83979d)) * 31) + Float.floatToIntBits(this.f83980e)) * 31;
            boolean z = this.f83981f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (floatToIntBits + (z ? 1 : 0)) * 31;
            boolean z3 = this.f83982g;
            if (!z3) {
                z2 = z3;
            }
            return ((((i + (z2 ? 1 : 0)) * 31) + Float.floatToIntBits(this.f83983h)) * 31) + Float.floatToIntBits(this.f83984i);
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f83978c + ", verticalEllipseRadius=" + this.f83979d + ", theta=" + this.f83980e + ", isMoreThanHalf=" + this.f83981f + ", isPositiveArc=" + this.f83982g + ", arcStartX=" + this.f83983h + ", arcStartY=" + this.f83984i + ')';
        }
    }

    /* renamed from: e1.e$b */
    public static final class C31383b extends C31381e {

        /* renamed from: c */
        public static final C31383b f83985c = new C31383b();

        public C31383b() {
            super(false, false, 3, (C8480h) null);
        }
    }

    /* renamed from: e1.e$c */
    public static final class C31384c extends C31381e {

        /* renamed from: c */
        public final float f83986c;

        /* renamed from: d */
        public final float f83987d;

        /* renamed from: e */
        public final float f83988e;

        /* renamed from: f */
        public final float f83989f;

        /* renamed from: g */
        public final float f83990g;

        /* renamed from: h */
        public final float f83991h;

        public C31384c(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, (C8480h) null);
            this.f83986c = f;
            this.f83987d = f2;
            this.f83988e = f3;
            this.f83989f = f4;
            this.f83990g = f5;
            this.f83991h = f6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31384c)) {
                return false;
            }
            C31384c cVar = (C31384c) obj;
            return C87412m.m108589b(Float.valueOf(this.f83986c), Float.valueOf(cVar.f83986c)) && C87412m.m108589b(Float.valueOf(this.f83987d), Float.valueOf(cVar.f83987d)) && C87412m.m108589b(Float.valueOf(this.f83988e), Float.valueOf(cVar.f83988e)) && C87412m.m108589b(Float.valueOf(this.f83989f), Float.valueOf(cVar.f83989f)) && C87412m.m108589b(Float.valueOf(this.f83990g), Float.valueOf(cVar.f83990g)) && C87412m.m108589b(Float.valueOf(this.f83991h), Float.valueOf(cVar.f83991h));
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f83986c) * 31) + Float.floatToIntBits(this.f83987d)) * 31) + Float.floatToIntBits(this.f83988e)) * 31) + Float.floatToIntBits(this.f83989f)) * 31) + Float.floatToIntBits(this.f83990g)) * 31) + Float.floatToIntBits(this.f83991h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f83986c + ", y1=" + this.f83987d + ", x2=" + this.f83988e + ", y2=" + this.f83989f + ", x3=" + this.f83990g + ", y3=" + this.f83991h + ')';
        }
    }

    /* renamed from: e1.e$d */
    public static final class C31385d extends C31381e {

        /* renamed from: c */
        public final float f83992c;

        public C31385d(float f) {
            super(false, false, 3, (C8480h) null);
            this.f83992c = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C31385d) && C87412m.m108589b(Float.valueOf(this.f83992c), Float.valueOf(((C31385d) obj).f83992c));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f83992c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f83992c + ')';
        }
    }

    /* renamed from: e1.e$e */
    public static final class C31386e extends C31381e {

        /* renamed from: c */
        public final float f83993c;

        /* renamed from: d */
        public final float f83994d;

        public C31386e(float f, float f2) {
            super(false, false, 3, (C8480h) null);
            this.f83993c = f;
            this.f83994d = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31386e)) {
                return false;
            }
            C31386e eVar = (C31386e) obj;
            return C87412m.m108589b(Float.valueOf(this.f83993c), Float.valueOf(eVar.f83993c)) && C87412m.m108589b(Float.valueOf(this.f83994d), Float.valueOf(eVar.f83994d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f83993c) * 31) + Float.floatToIntBits(this.f83994d);
        }

        public String toString() {
            return "LineTo(x=" + this.f83993c + ", y=" + this.f83994d + ')';
        }
    }

    /* renamed from: e1.e$f */
    public static final class C31387f extends C31381e {

        /* renamed from: c */
        public final float f83995c;

        /* renamed from: d */
        public final float f83996d;

        public C31387f(float f, float f2) {
            super(false, false, 3, (C8480h) null);
            this.f83995c = f;
            this.f83996d = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31387f)) {
                return false;
            }
            C31387f fVar = (C31387f) obj;
            return C87412m.m108589b(Float.valueOf(this.f83995c), Float.valueOf(fVar.f83995c)) && C87412m.m108589b(Float.valueOf(this.f83996d), Float.valueOf(fVar.f83996d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f83995c) * 31) + Float.floatToIntBits(this.f83996d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f83995c + ", y=" + this.f83996d + ')';
        }
    }

    /* renamed from: e1.e$g */
    public static final class C31388g extends C31381e {

        /* renamed from: c */
        public final float f83997c;

        /* renamed from: d */
        public final float f83998d;

        /* renamed from: e */
        public final float f83999e;

        /* renamed from: f */
        public final float f84000f;

        public C31388g(float f, float f2, float f3, float f4) {
            super(false, true, 1, (C8480h) null);
            this.f83997c = f;
            this.f83998d = f2;
            this.f83999e = f3;
            this.f84000f = f4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31388g)) {
                return false;
            }
            C31388g gVar = (C31388g) obj;
            return C87412m.m108589b(Float.valueOf(this.f83997c), Float.valueOf(gVar.f83997c)) && C87412m.m108589b(Float.valueOf(this.f83998d), Float.valueOf(gVar.f83998d)) && C87412m.m108589b(Float.valueOf(this.f83999e), Float.valueOf(gVar.f83999e)) && C87412m.m108589b(Float.valueOf(this.f84000f), Float.valueOf(gVar.f84000f));
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f83997c) * 31) + Float.floatToIntBits(this.f83998d)) * 31) + Float.floatToIntBits(this.f83999e)) * 31) + Float.floatToIntBits(this.f84000f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f83997c + ", y1=" + this.f83998d + ", x2=" + this.f83999e + ", y2=" + this.f84000f + ')';
        }
    }

    /* renamed from: e1.e$h */
    public static final class C31389h extends C31381e {

        /* renamed from: c */
        public final float f84001c;

        /* renamed from: d */
        public final float f84002d;

        /* renamed from: e */
        public final float f84003e;

        /* renamed from: f */
        public final float f84004f;

        public C31389h(float f, float f2, float f3, float f4) {
            super(true, false, 2, (C8480h) null);
            this.f84001c = f;
            this.f84002d = f2;
            this.f84003e = f3;
            this.f84004f = f4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31389h)) {
                return false;
            }
            C31389h hVar = (C31389h) obj;
            return C87412m.m108589b(Float.valueOf(this.f84001c), Float.valueOf(hVar.f84001c)) && C87412m.m108589b(Float.valueOf(this.f84002d), Float.valueOf(hVar.f84002d)) && C87412m.m108589b(Float.valueOf(this.f84003e), Float.valueOf(hVar.f84003e)) && C87412m.m108589b(Float.valueOf(this.f84004f), Float.valueOf(hVar.f84004f));
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f84001c) * 31) + Float.floatToIntBits(this.f84002d)) * 31) + Float.floatToIntBits(this.f84003e)) * 31) + Float.floatToIntBits(this.f84004f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f84001c + ", y1=" + this.f84002d + ", x2=" + this.f84003e + ", y2=" + this.f84004f + ')';
        }
    }

    /* renamed from: e1.e$i */
    public static final class C31390i extends C31381e {

        /* renamed from: c */
        public final float f84005c;

        /* renamed from: d */
        public final float f84006d;

        public C31390i(float f, float f2) {
            super(false, true, 1, (C8480h) null);
            this.f84005c = f;
            this.f84006d = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31390i)) {
                return false;
            }
            C31390i iVar = (C31390i) obj;
            return C87412m.m108589b(Float.valueOf(this.f84005c), Float.valueOf(iVar.f84005c)) && C87412m.m108589b(Float.valueOf(this.f84006d), Float.valueOf(iVar.f84006d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f84005c) * 31) + Float.floatToIntBits(this.f84006d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f84005c + ", y=" + this.f84006d + ')';
        }
    }

    /* renamed from: e1.e$j */
    public static final class C31391j extends C31381e {

        /* renamed from: c */
        public final float f84007c;

        /* renamed from: d */
        public final float f84008d;

        /* renamed from: e */
        public final float f84009e;

        /* renamed from: f */
        public final boolean f84010f;

        /* renamed from: g */
        public final boolean f84011g;

        /* renamed from: h */
        public final float f84012h;

        /* renamed from: i */
        public final float f84013i;

        public C31391j(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, (C8480h) null);
            this.f84007c = f;
            this.f84008d = f2;
            this.f84009e = f3;
            this.f84010f = z;
            this.f84011g = z2;
            this.f84012h = f4;
            this.f84013i = f5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31391j)) {
                return false;
            }
            C31391j jVar = (C31391j) obj;
            return C87412m.m108589b(Float.valueOf(this.f84007c), Float.valueOf(jVar.f84007c)) && C87412m.m108589b(Float.valueOf(this.f84008d), Float.valueOf(jVar.f84008d)) && C87412m.m108589b(Float.valueOf(this.f84009e), Float.valueOf(jVar.f84009e)) && this.f84010f == jVar.f84010f && this.f84011g == jVar.f84011g && C87412m.m108589b(Float.valueOf(this.f84012h), Float.valueOf(jVar.f84012h)) && C87412m.m108589b(Float.valueOf(this.f84013i), Float.valueOf(jVar.f84013i));
        }

        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.f84007c) * 31) + Float.floatToIntBits(this.f84008d)) * 31) + Float.floatToIntBits(this.f84009e)) * 31;
            boolean z = this.f84010f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (floatToIntBits + (z ? 1 : 0)) * 31;
            boolean z3 = this.f84011g;
            if (!z3) {
                z2 = z3;
            }
            return ((((i + (z2 ? 1 : 0)) * 31) + Float.floatToIntBits(this.f84012h)) * 31) + Float.floatToIntBits(this.f84013i);
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f84007c + ", verticalEllipseRadius=" + this.f84008d + ", theta=" + this.f84009e + ", isMoreThanHalf=" + this.f84010f + ", isPositiveArc=" + this.f84011g + ", arcStartDx=" + this.f84012h + ", arcStartDy=" + this.f84013i + ')';
        }
    }

    /* renamed from: e1.e$k */
    public static final class C31392k extends C31381e {

        /* renamed from: c */
        public final float f84014c;

        /* renamed from: d */
        public final float f84015d;

        /* renamed from: e */
        public final float f84016e;

        /* renamed from: f */
        public final float f84017f;

        /* renamed from: g */
        public final float f84018g;

        /* renamed from: h */
        public final float f84019h;

        public C31392k(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, (C8480h) null);
            this.f84014c = f;
            this.f84015d = f2;
            this.f84016e = f3;
            this.f84017f = f4;
            this.f84018g = f5;
            this.f84019h = f6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31392k)) {
                return false;
            }
            C31392k kVar = (C31392k) obj;
            return C87412m.m108589b(Float.valueOf(this.f84014c), Float.valueOf(kVar.f84014c)) && C87412m.m108589b(Float.valueOf(this.f84015d), Float.valueOf(kVar.f84015d)) && C87412m.m108589b(Float.valueOf(this.f84016e), Float.valueOf(kVar.f84016e)) && C87412m.m108589b(Float.valueOf(this.f84017f), Float.valueOf(kVar.f84017f)) && C87412m.m108589b(Float.valueOf(this.f84018g), Float.valueOf(kVar.f84018g)) && C87412m.m108589b(Float.valueOf(this.f84019h), Float.valueOf(kVar.f84019h));
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f84014c) * 31) + Float.floatToIntBits(this.f84015d)) * 31) + Float.floatToIntBits(this.f84016e)) * 31) + Float.floatToIntBits(this.f84017f)) * 31) + Float.floatToIntBits(this.f84018g)) * 31) + Float.floatToIntBits(this.f84019h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f84014c + ", dy1=" + this.f84015d + ", dx2=" + this.f84016e + ", dy2=" + this.f84017f + ", dx3=" + this.f84018g + ", dy3=" + this.f84019h + ')';
        }
    }

    /* renamed from: e1.e$l */
    public static final class C31393l extends C31381e {

        /* renamed from: c */
        public final float f84020c;

        public C31393l(float f) {
            super(false, false, 3, (C8480h) null);
            this.f84020c = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C31393l) && C87412m.m108589b(Float.valueOf(this.f84020c), Float.valueOf(((C31393l) obj).f84020c));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f84020c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f84020c + ')';
        }
    }

    /* renamed from: e1.e$m */
    public static final class C31394m extends C31381e {

        /* renamed from: c */
        public final float f84021c;

        /* renamed from: d */
        public final float f84022d;

        public C31394m(float f, float f2) {
            super(false, false, 3, (C8480h) null);
            this.f84021c = f;
            this.f84022d = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31394m)) {
                return false;
            }
            C31394m mVar = (C31394m) obj;
            return C87412m.m108589b(Float.valueOf(this.f84021c), Float.valueOf(mVar.f84021c)) && C87412m.m108589b(Float.valueOf(this.f84022d), Float.valueOf(mVar.f84022d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f84021c) * 31) + Float.floatToIntBits(this.f84022d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f84021c + ", dy=" + this.f84022d + ')';
        }
    }

    /* renamed from: e1.e$n */
    public static final class C31395n extends C31381e {

        /* renamed from: c */
        public final float f84023c;

        /* renamed from: d */
        public final float f84024d;

        public C31395n(float f, float f2) {
            super(false, false, 3, (C8480h) null);
            this.f84023c = f;
            this.f84024d = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31395n)) {
                return false;
            }
            C31395n nVar = (C31395n) obj;
            return C87412m.m108589b(Float.valueOf(this.f84023c), Float.valueOf(nVar.f84023c)) && C87412m.m108589b(Float.valueOf(this.f84024d), Float.valueOf(nVar.f84024d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f84023c) * 31) + Float.floatToIntBits(this.f84024d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f84023c + ", dy=" + this.f84024d + ')';
        }
    }

    /* renamed from: e1.e$o */
    public static final class C31396o extends C31381e {

        /* renamed from: c */
        public final float f84025c;

        /* renamed from: d */
        public final float f84026d;

        /* renamed from: e */
        public final float f84027e;

        /* renamed from: f */
        public final float f84028f;

        public C31396o(float f, float f2, float f3, float f4) {
            super(false, true, 1, (C8480h) null);
            this.f84025c = f;
            this.f84026d = f2;
            this.f84027e = f3;
            this.f84028f = f4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31396o)) {
                return false;
            }
            C31396o oVar = (C31396o) obj;
            return C87412m.m108589b(Float.valueOf(this.f84025c), Float.valueOf(oVar.f84025c)) && C87412m.m108589b(Float.valueOf(this.f84026d), Float.valueOf(oVar.f84026d)) && C87412m.m108589b(Float.valueOf(this.f84027e), Float.valueOf(oVar.f84027e)) && C87412m.m108589b(Float.valueOf(this.f84028f), Float.valueOf(oVar.f84028f));
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f84025c) * 31) + Float.floatToIntBits(this.f84026d)) * 31) + Float.floatToIntBits(this.f84027e)) * 31) + Float.floatToIntBits(this.f84028f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f84025c + ", dy1=" + this.f84026d + ", dx2=" + this.f84027e + ", dy2=" + this.f84028f + ')';
        }
    }

    /* renamed from: e1.e$p */
    public static final class C31397p extends C31381e {

        /* renamed from: c */
        public final float f84029c;

        /* renamed from: d */
        public final float f84030d;

        /* renamed from: e */
        public final float f84031e;

        /* renamed from: f */
        public final float f84032f;

        public C31397p(float f, float f2, float f3, float f4) {
            super(true, false, 2, (C8480h) null);
            this.f84029c = f;
            this.f84030d = f2;
            this.f84031e = f3;
            this.f84032f = f4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31397p)) {
                return false;
            }
            C31397p pVar = (C31397p) obj;
            return C87412m.m108589b(Float.valueOf(this.f84029c), Float.valueOf(pVar.f84029c)) && C87412m.m108589b(Float.valueOf(this.f84030d), Float.valueOf(pVar.f84030d)) && C87412m.m108589b(Float.valueOf(this.f84031e), Float.valueOf(pVar.f84031e)) && C87412m.m108589b(Float.valueOf(this.f84032f), Float.valueOf(pVar.f84032f));
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f84029c) * 31) + Float.floatToIntBits(this.f84030d)) * 31) + Float.floatToIntBits(this.f84031e)) * 31) + Float.floatToIntBits(this.f84032f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f84029c + ", dy1=" + this.f84030d + ", dx2=" + this.f84031e + ", dy2=" + this.f84032f + ')';
        }
    }

    /* renamed from: e1.e$q */
    public static final class C31398q extends C31381e {

        /* renamed from: c */
        public final float f84033c;

        /* renamed from: d */
        public final float f84034d;

        public C31398q(float f, float f2) {
            super(false, true, 1, (C8480h) null);
            this.f84033c = f;
            this.f84034d = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31398q)) {
                return false;
            }
            C31398q qVar = (C31398q) obj;
            return C87412m.m108589b(Float.valueOf(this.f84033c), Float.valueOf(qVar.f84033c)) && C87412m.m108589b(Float.valueOf(this.f84034d), Float.valueOf(qVar.f84034d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f84033c) * 31) + Float.floatToIntBits(this.f84034d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f84033c + ", dy=" + this.f84034d + ')';
        }
    }

    /* renamed from: e1.e$r */
    public static final class C31399r extends C31381e {

        /* renamed from: c */
        public final float f84035c;

        public C31399r(float f) {
            super(false, false, 3, (C8480h) null);
            this.f84035c = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C31399r) && C87412m.m108589b(Float.valueOf(this.f84035c), Float.valueOf(((C31399r) obj).f84035c));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f84035c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f84035c + ')';
        }
    }

    /* renamed from: e1.e$s */
    public static final class C31400s extends C31381e {

        /* renamed from: c */
        public final float f84036c;

        public C31400s(float f) {
            super(false, false, 3, (C8480h) null);
            this.f84036c = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C31400s) && C87412m.m108589b(Float.valueOf(this.f84036c), Float.valueOf(((C31400s) obj).f84036c));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f84036c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f84036c + ')';
        }
    }

    public C31381e(boolean z, boolean z2, int i, C8480h hVar) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        this.f83976a = z;
        this.f83977b = z2;
    }
}
