package my3;

import gy3.C87412m;

/* renamed from: my3.c */
public final class C61590c extends C61588a implements C61591g<Character> {
    static {
        new C61590c(1, 0);
    }

    public C61590c(char c, char c2) {
        super(c, c2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C61590c) {
            if (C87412m.m108596i(this.f175167d, this.f175168e) > 0) {
                C61590c cVar = (C61590c) obj;
                if (C87412m.m108596i(cVar.f175167d, cVar.f175168e) > 0) {
                    return true;
                }
            }
            C61590c cVar2 = (C61590c) obj;
            return this.f175167d == cVar2.f175167d && this.f175168e == cVar2.f175168e;
        }
    }

    /* renamed from: f0 */
    public Comparable mo59687f0() {
        return Character.valueOf(this.f175167d);
    }

    /* renamed from: g0 */
    public Comparable mo59688g0() {
        return Character.valueOf(this.f175168e);
    }

    public int hashCode() {
        if (C87412m.m108596i(this.f175167d, this.f175168e) > 0) {
            return -1;
        }
        return (this.f175167d * 31) + this.f175168e;
    }

    public String toString() {
        return this.f175167d + ".." + this.f175168e;
    }
}
