package p544h2;

import gy3.C8480h;
import p560i2.C33184p;
import p560i2.C33185q;

/* renamed from: h2.j */
public final class C32662j {

    /* renamed from: c */
    public static final C32662j f86675c = new C32662j(C33185q.m39974b(0), C33185q.m39974b(0), (C8480h) null);

    /* renamed from: a */
    public final long f86676a;

    /* renamed from: b */
    public final long f86677b;

    public C32662j(long j, long j2, C8480h hVar) {
        this.f86676a = j;
        this.f86677b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32662j)) {
            return false;
        }
        C32662j jVar = (C32662j) obj;
        return C33184p.m39968a(this.f86676a, jVar.f86676a) && C33184p.m39968a(this.f86677b, jVar.f86677b);
    }

    public int hashCode() {
        return (C33184p.m39971d(this.f86676a) * 31) + C33184p.m39971d(this.f86677b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + C33184p.m39972e(this.f86676a) + ", restLine=" + C33184p.m39972e(this.f86677b) + ')';
    }
}
