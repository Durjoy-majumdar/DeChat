package hn2;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: hn2.a */
public final class C32968a {

    /* renamed from: a */
    public final String f89572a;

    /* renamed from: b */
    public long f89573b;

    /* renamed from: c */
    public int f89574c;

    /* renamed from: d */
    public int f89575d;

    public C32968a(String str, long j, int i, int i2, int i3, C8480h hVar) {
        j = (i3 & 2) != 0 ? 0 : j;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        C87412m.m108594g(str, "path");
        this.f89572a = str;
        this.f89573b = j;
        this.f89574c = i;
        this.f89575d = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32968a)) {
            return false;
        }
        C32968a aVar = (C32968a) obj;
        return C87412m.m108589b(this.f89572a, aVar.f89572a) && this.f89573b == aVar.f89573b && this.f89574c == aVar.f89574c && this.f89575d == aVar.f89575d;
    }

    public int hashCode() {
        long j = this.f89573b;
        return (((((this.f89572a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f89574c) * 31) + this.f89575d;
    }

    public String toString() {
        return "DirEnt(path=" + this.f89572a + ", diskSpace=" + this.f89573b + ", fileCount=" + this.f89574c + ", dirCount=" + this.f89575d + ')';
    }
}
