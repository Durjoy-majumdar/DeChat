package p009c2;

import gy3.C87412m;

/* renamed from: c2.c */
public final class C104241c implements C104247d {

    /* renamed from: a */
    public final int f308548a;

    /* renamed from: b */
    public final int f308549b;

    public C104241c(int i, int i2) {
        this.f308548a = i;
        this.f308549b = i2;
    }

    /* renamed from: a */
    public void mo145851a(C104251f fVar) {
        C87412m.m108594g(fVar, "buffer");
        int i = this.f308548a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2++;
            int i4 = fVar.f308577b;
            if (i4 > i2) {
                if (Character.isHighSurrogate(fVar.mo145872b((i4 - i2) + -1)) && Character.isLowSurrogate(fVar.mo145872b(fVar.f308577b - i2))) {
                    i2++;
                }
            }
            if (i2 == fVar.f308577b) {
                break;
            }
        }
        int i5 = this.f308549b;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6++;
            if (fVar.f308578c + i6 < fVar.mo145873c()) {
                if (Character.isHighSurrogate(fVar.mo145872b((fVar.f308578c + i6) + -1)) && Character.isLowSurrogate(fVar.mo145872b(fVar.f308578c + i6))) {
                    i6++;
                }
            }
            if (fVar.f308578c + i6 == fVar.mo145873c()) {
                break;
            }
        }
        int i8 = fVar.f308578c;
        fVar.mo145871a(i8, i6 + i8);
        int i9 = fVar.f308577b;
        fVar.mo145871a(i9 - i2, i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104241c)) {
            return false;
        }
        C104241c cVar = (C104241c) obj;
        return this.f308548a == cVar.f308548a && this.f308549b == cVar.f308549b;
    }

    public int hashCode() {
        return (this.f308548a * 31) + this.f308549b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f308548a + ", lengthAfterCursor=" + this.f308549b + ')';
    }
}
