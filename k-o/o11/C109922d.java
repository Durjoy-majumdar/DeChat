package o11;

import gy3.C87412m;
import y11.C112358a;

/* renamed from: o11.d */
public final class C109922d {

    /* renamed from: a */
    public final String f328894a;

    /* renamed from: b */
    public final C112358a.C112359a f328895b;

    /* renamed from: c */
    public final int f328896c;

    /* renamed from: d */
    public final int f328897d;

    /* renamed from: e */
    public final boolean f328898e;

    /* renamed from: f */
    public final int f328899f;

    public C109922d(String str, C112358a.C112359a aVar, int i, int i2, boolean z, int i3) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(aVar, "dataBuffer");
        this.f328894a = str;
        this.f328895b = aVar;
        this.f328896c = i;
        this.f328897d = i2;
        this.f328898e = z;
        this.f328899f = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109922d)) {
            return false;
        }
        C109922d dVar = (C109922d) obj;
        return C87412m.m108589b(this.f328894a, dVar.f328894a) && C87412m.m108589b(this.f328895b, dVar.f328895b) && this.f328896c == dVar.f328896c && this.f328897d == dVar.f328897d && this.f328898e == dVar.f328898e && this.f328899f == dVar.f328899f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f328894a.hashCode() * 31) + this.f328895b.hashCode()) * 31) + this.f328896c) * 31) + this.f328897d) * 31;
        boolean z = this.f328898e;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f328899f;
    }

    public String toString() {
        return "DecodeResult(username=" + this.f328894a + ", dataBuffer=" + this.f328895b + ", w=" + this.f328896c + ", h=" + this.f328897d + ", screenFrame=" + this.f328898e + ", screenOri=" + this.f328899f + ')';
    }
}
