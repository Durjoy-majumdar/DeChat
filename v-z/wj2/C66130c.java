package wj2;

import gy3.C87412m;

/* renamed from: wj2.c */
public final class C66130c {

    /* renamed from: a */
    public C66131d f190068a;

    /* renamed from: b */
    public int f190069b;

    /* renamed from: c */
    public boolean f190070c;

    public C66130c(C66131d dVar, int i, boolean z) {
        C87412m.m108594g(dVar, "soundType");
        this.f190068a = dVar;
        this.f190069b = i;
        this.f190070c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66130c)) {
            return false;
        }
        C66130c cVar = (C66130c) obj;
        return this.f190068a == cVar.f190068a && this.f190069b == cVar.f190069b && this.f190070c == cVar.f190070c;
    }

    public int hashCode() {
        int hashCode = ((this.f190068a.hashCode() * 31) + this.f190069b) * 31;
        boolean z = this.f190070c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "RingtonePlayInfo(soundType=" + this.f190068a + ", streamType=" + this.f190069b + ", isLoop=" + this.f190070c + ')';
    }
}
