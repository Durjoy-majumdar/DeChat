package e61;

import gy3.C87412m;

/* renamed from: e61.a */
public final class C86453a {

    /* renamed from: c */
    public static final C86453a f251243c = new C86453a("", 0);

    /* renamed from: a */
    public final String f251244a;

    /* renamed from: b */
    public final long f251245b;

    public C86453a(String str, long j) {
        C87412m.m108594g(str, "keyword");
        this.f251244a = str;
        this.f251245b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86453a)) {
            return false;
        }
        C86453a aVar = (C86453a) obj;
        return C87412m.m108589b(this.f251244a, aVar.f251244a) && this.f251245b == aVar.f251245b;
    }

    public int hashCode() {
        long j = this.f251245b;
        return (this.f251244a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MagicEmojiEggExtData(keyword=" + this.f251244a + ", messageLocalId=" + this.f251245b + ')';
    }
}
