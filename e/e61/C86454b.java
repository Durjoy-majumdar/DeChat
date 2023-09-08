package e61;

import gy3.C87412m;

/* renamed from: e61.b */
public final class C86454b {

    /* renamed from: d */
    public static final C86454b f251246d = new C86454b("", "", "");

    /* renamed from: a */
    public final String f251247a;

    /* renamed from: b */
    public final String f251248b;

    /* renamed from: c */
    public final String f251249c;

    public C86454b(String str, String str2, String str3) {
        C87412m.m108594g(str, "eggKey");
        C87412m.m108594g(str2, "eggId");
        C87412m.m108594g(str3, "sceneId");
        this.f251247a = str;
        this.f251248b = str2;
        this.f251249c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86454b)) {
            return false;
        }
        C86454b bVar = (C86454b) obj;
        return C87412m.m108589b(this.f251247a, bVar.f251247a) && C87412m.m108589b(this.f251248b, bVar.f251248b) && C87412m.m108589b(this.f251249c, bVar.f251249c);
    }

    public int hashCode() {
        return (((this.f251247a.hashCode() * 31) + this.f251248b.hashCode()) * 31) + this.f251249c.hashCode();
    }

    public String toString() {
        return "MagicEmojiEggMeta(eggKey=" + this.f251247a + ", eggId=" + this.f251248b + ", sceneId=" + this.f251249c + ')';
    }
}
