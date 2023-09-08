package p157gk;

import gy3.C87412m;

/* renamed from: gk.a */
public final class C32466a {

    /* renamed from: a */
    public final String f86261a;

    /* renamed from: b */
    public final String f86262b;

    public C32466a(String str, String str2) {
        C87412m.m108594g(str, "labelId");
        C87412m.m108594g(str2, "cropImagePath");
        this.f86261a = str;
        this.f86262b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32466a)) {
            return false;
        }
        C32466a aVar = (C32466a) obj;
        return C87412m.m108589b(this.f86261a, aVar.f86261a) && C87412m.m108589b(this.f86262b, aVar.f86262b);
    }

    public int hashCode() {
        return (this.f86261a.hashCode() * 31) + this.f86262b.hashCode();
    }

    public String toString() {
        return "CropImageItem(labelId=" + this.f86261a + ", cropImagePath=" + this.f86262b + ')';
    }
}
