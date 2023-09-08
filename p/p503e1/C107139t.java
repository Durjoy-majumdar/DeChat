package p503e1;

import gy3.C24560g0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p436a1.C103257q;

/* renamed from: e1.t */
public final class C107139t extends C107126n {

    /* renamed from: d */
    public final String f320699d;

    /* renamed from: e */
    public final List<C31381e> f320700e;

    /* renamed from: f */
    public final int f320701f;

    /* renamed from: g */
    public final C103257q f320702g;

    /* renamed from: h */
    public final float f320703h;

    /* renamed from: i */
    public final C103257q f320704i;

    /* renamed from: j */
    public final float f320705j;

    /* renamed from: n */
    public final float f320706n;

    /* renamed from: o */
    public final int f320707o;

    /* renamed from: p */
    public final int f320708p;

    /* renamed from: q */
    public final float f320709q;

    /* renamed from: r */
    public final float f320710r;

    /* renamed from: s */
    public final float f320711s;

    /* renamed from: t */
    public final float f320712t;

    public C107139t(String str, List list, int i, C103257q qVar, float f, C103257q qVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, C8480h hVar) {
        this.f320699d = str;
        this.f320700e = list;
        this.f320701f = i;
        this.f320702g = qVar;
        this.f320703h = f;
        this.f320704i = qVar2;
        this.f320705j = f2;
        this.f320706n = f3;
        this.f320707o = i2;
        this.f320708p = i3;
        this.f320709q = f4;
        this.f320710r = f5;
        this.f320711s = f6;
        this.f320712t = f7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C87412m.m108589b(C24560g0.m30725a(C107139t.class), C24560g0.m30725a(obj.getClass()))) {
            return false;
        }
        C107139t tVar = (C107139t) obj;
        if (!C87412m.m108589b(this.f320699d, tVar.f320699d) || !C87412m.m108589b(this.f320702g, tVar.f320702g)) {
            return false;
        }
        if (!(this.f320703h == tVar.f320703h) || !C87412m.m108589b(this.f320704i, tVar.f320704i)) {
            return false;
        }
        if (!(this.f320705j == tVar.f320705j)) {
            return false;
        }
        if (!(this.f320706n == tVar.f320706n)) {
            return false;
        }
        if (!(this.f320707o == tVar.f320707o)) {
            return false;
        }
        if (!(this.f320708p == tVar.f320708p)) {
            return false;
        }
        if (!(this.f320709q == tVar.f320709q)) {
            return false;
        }
        if (!(this.f320710r == tVar.f320710r)) {
            return false;
        }
        if (!(this.f320711s == tVar.f320711s)) {
            return false;
        }
        if (!(this.f320712t == tVar.f320712t)) {
            return false;
        }
        return (this.f320701f == tVar.f320701f) && C87412m.m108589b(this.f320700e, tVar.f320700e);
    }

    public int hashCode() {
        int hashCode = ((this.f320699d.hashCode() * 31) + this.f320700e.hashCode()) * 31;
        C103257q qVar = this.f320702g;
        int i = 0;
        int hashCode2 = (((hashCode + (qVar != null ? qVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f320703h)) * 31;
        C103257q qVar2 = this.f320704i;
        if (qVar2 != null) {
            i = qVar2.hashCode();
        }
        return ((((((((((((((((((hashCode2 + i) * 31) + Float.floatToIntBits(this.f320705j)) * 31) + Float.floatToIntBits(this.f320706n)) * 31) + this.f320707o) * 31) + this.f320708p) * 31) + Float.floatToIntBits(this.f320709q)) * 31) + Float.floatToIntBits(this.f320710r)) * 31) + Float.floatToIntBits(this.f320711s)) * 31) + Float.floatToIntBits(this.f320712t)) * 31) + this.f320701f;
    }
}
