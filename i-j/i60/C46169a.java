package i60;

import gy3.C87412m;

/* renamed from: i60.a */
public final class C46169a {

    /* renamed from: a */
    public String f124457a;

    /* renamed from: b */
    public String f124458b;

    /* renamed from: c */
    public CharSequence f124459c;

    /* renamed from: d */
    public int f124460d;

    /* renamed from: e */
    public int f124461e;

    public C46169a() {
        this("", "", "", 1, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46169a)) {
            return false;
        }
        C46169a aVar = (C46169a) obj;
        return C87412m.m108589b(this.f124457a, aVar.f124457a) && C87412m.m108589b(this.f124458b, aVar.f124458b) && C87412m.m108589b(this.f124459c, aVar.f124459c) && this.f124460d == aVar.f124460d && this.f124461e == aVar.f124461e;
    }

    public int hashCode() {
        return (((((((this.f124457a.hashCode() * 31) + this.f124458b.hashCode()) * 31) + this.f124459c.hashCode()) * 31) + this.f124460d) * 31) + this.f124461e;
    }

    public String toString() {
        return "CommentData(identityId=" + this.f124457a + ", headImageUrl=" + this.f124458b + ", content=" + this.f124459c + ", msgType=" + this.f124460d + ", time=" + this.f124461e + ')';
    }

    public C46169a(String str, String str2, CharSequence charSequence, int i, int i2) {
        C87412m.m108594g(str, "identityId");
        C87412m.m108594g(str2, "headImageUrl");
        C87412m.m108594g(charSequence, "content");
        this.f124457a = str;
        this.f124458b = str2;
        this.f124459c = charSequence;
        this.f124460d = i;
        this.f124461e = i2;
    }
}
