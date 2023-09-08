package p735w1;

import gy3.C8480h;
import gy3.C87412m;
import p544h2.C32657c;
import p544h2.C32659e;
import p544h2.C32660g;
import p544h2.C32662j;
import p560i2.C33184p;
import p560i2.C33185q;

/* renamed from: w1.k */
public final class C37966k {

    /* renamed from: a */
    public final C32659e f100437a;

    /* renamed from: b */
    public final C32660g f100438b;

    /* renamed from: c */
    public final long f100439c;

    /* renamed from: d */
    public final C32662j f100440d;

    public C37966k(C32659e eVar, C32660g gVar, long j, C32662j jVar, C37968n nVar, C32657c cVar, C8480h hVar) {
        this.f100437a = eVar;
        this.f100438b = gVar;
        this.f100439c = j;
        this.f100440d = jVar;
        if (!C33184p.m39968a(j, C33184p.f90062c)) {
            if (!(C33184p.m39970c(j) >= 0.0f)) {
                throw new IllegalStateException(("lineHeight can't be negative (" + C33184p.m39970c(j) + ')').toString());
            }
        }
    }

    /* renamed from: a */
    public final C37966k mo61464a(C37966k kVar) {
        if (kVar == null) {
            return this;
        }
        long j = C33185q.m39975c(kVar.f100439c) ? this.f100439c : kVar.f100439c;
        C32662j jVar = kVar.f100440d;
        if (jVar == null) {
            jVar = this.f100440d;
        }
        C32662j jVar2 = jVar;
        C32659e eVar = kVar.f100437a;
        if (eVar == null) {
            eVar = this.f100437a;
        }
        C32659e eVar2 = eVar;
        C32660g gVar = kVar.f100438b;
        if (gVar == null) {
            gVar = this.f100438b;
        }
        kVar.getClass();
        return new C37966k(eVar2, gVar, j, jVar2, (C37968n) null, (C32657c) null, (C8480h) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37966k)) {
            return false;
        }
        C37966k kVar = (C37966k) obj;
        if (!C87412m.m108589b(this.f100437a, kVar.f100437a) || !C87412m.m108589b(this.f100438b, kVar.f100438b) || !C33184p.m39968a(this.f100439c, kVar.f100439c) || !C87412m.m108589b(this.f100440d, kVar.f100440d)) {
            return false;
        }
        kVar.getClass();
        if (!C87412m.m108589b((Object) null, (Object) null)) {
            return false;
        }
        kVar.getClass();
        return C87412m.m108589b((Object) null, (Object) null);
    }

    public int hashCode() {
        C32659e eVar = this.f100437a;
        int i = (eVar != null ? eVar.f86670a : 0) * 31;
        C32660g gVar = this.f100438b;
        int d = (((i + (gVar != null ? gVar.f86671a : 0)) * 31) + C33184p.m39971d(this.f100439c)) * 31;
        C32662j jVar = this.f100440d;
        return ((((d + (jVar != null ? jVar.hashCode() : 0)) * 31) + 0) * 31) + 0;
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + this.f100437a + ", textDirection=" + this.f100438b + ", lineHeight=" + C33184p.m39972e(this.f100439c) + ", textIndent=" + this.f100440d + ", platformStyle=" + null + ", lineHeightStyle=" + null + ')';
    }
}
