package gy3;

import java.io.Serializable;

/* renamed from: gy3.a */
public class C87411a implements C24562j, Serializable {

    /* renamed from: d */
    public final Object f253295d;

    /* renamed from: e */
    public final Class f253296e;

    /* renamed from: f */
    public final String f253297f;

    /* renamed from: g */
    public final String f253298g;

    /* renamed from: h */
    public final boolean f253299h;

    /* renamed from: i */
    public final int f253300i;

    /* renamed from: j */
    public final int f253301j;

    public C87411a(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.f253295d = obj;
        this.f253296e = cls;
        this.f253297f = str;
        this.f253298g = str2;
        this.f253299h = (i2 & 1) == 1;
        this.f253300i = i;
        this.f253301j = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87411a)) {
            return false;
        }
        C87411a aVar = (C87411a) obj;
        return this.f253299h == aVar.f253299h && this.f253300i == aVar.f253300i && this.f253301j == aVar.f253301j && C87412m.m108589b(this.f253295d, aVar.f253295d) && C87412m.m108589b(this.f253296e, aVar.f253296e) && this.f253297f.equals(aVar.f253297f) && this.f253298g.equals(aVar.f253298g);
    }

    public int getArity() {
        return this.f253300i;
    }

    public int hashCode() {
        Object obj = this.f253295d;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f253296e;
        if (cls != null) {
            i = cls.hashCode();
        }
        return ((((((((((hashCode + i) * 31) + this.f253297f.hashCode()) * 31) + this.f253298g.hashCode()) * 31) + (this.f253299h ? 1231 : 1237)) * 31) + this.f253300i) * 31) + this.f253301j;
    }

    public String toString() {
        return C24560g0.f70158a.mo51274h(this);
    }
}
