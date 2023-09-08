package lq1;

import gy3.C87412m;

/* renamed from: lq1.a */
public final class C46889a {

    /* renamed from: a */
    public final String f126091a;

    /* renamed from: b */
    public final String f126092b;

    /* renamed from: c */
    public long f126093c;

    /* renamed from: d */
    public final long f126094d;

    /* renamed from: e */
    public boolean f126095e;

    public C46889a(String str, String str2, long j, long j2) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "nickname");
        this.f126091a = str;
        this.f126092b = str2;
        this.f126093c = j;
        this.f126094d = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46889a)) {
            return false;
        }
        C46889a aVar = (C46889a) obj;
        return C87412m.m108589b(this.f126091a, aVar.f126091a) && C87412m.m108589b(this.f126092b, aVar.f126092b) && this.f126093c == aVar.f126093c && this.f126094d == aVar.f126094d;
    }

    public int hashCode() {
        long j = this.f126093c;
        long j2 = this.f126094d;
        return (((((this.f126091a.hashCode() * 31) + this.f126092b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "MentionContact(username='" + this.f126091a + "', nickname='" + this.f126092b + "', start=" + this.f126093c + ", length=" + this.f126094d + ')';
    }
}
