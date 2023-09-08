package p61;

import gy3.C8480h;

/* renamed from: p61.l */
public final class C100663l {

    /* renamed from: a */
    public final int f294883a;

    /* renamed from: b */
    public int f294884b;

    /* renamed from: c */
    public int f294885c;

    public C100663l() {
        this(0, 0, 0, 7, (C8480h) null);
    }

    public C100663l(int i, int i2, int i3, int i4, C8480h hVar) {
        i = (i4 & 1) != 0 ? -1 : i;
        i2 = (i4 & 2) != 0 ? -1 : i2;
        i3 = (i4 & 4) != 0 ? -1 : i3;
        this.f294883a = i;
        this.f294884b = i2;
        this.f294885c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C100663l)) {
            return false;
        }
        C100663l lVar = (C100663l) obj;
        return this.f294883a == lVar.f294883a && this.f294884b == lVar.f294884b && this.f294885c == lVar.f294885c;
    }

    public int hashCode() {
        return (((this.f294883a * 31) + this.f294884b) * 31) + this.f294885c;
    }

    public String toString() {
        return "EmojiStoreV3EmotionRecRange(startPos=" + this.f294883a + ", endPos=" + this.f294884b + ", reportScene=" + this.f294885c + ')';
    }
}
