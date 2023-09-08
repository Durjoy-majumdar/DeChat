package jj2;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: jj2.a */
public final class C98944a {

    /* renamed from: a */
    public String f290040a;

    /* renamed from: b */
    public long f290041b;

    /* renamed from: c */
    public long f290042c;

    /* renamed from: d */
    public int f290043d;

    public C98944a() {
        this((String) null, 0, 0, 0, 15, (C8480h) null);
    }

    public C98944a(String str, long j, long j2, int i, int i2, C8480h hVar) {
        str = (i2 & 1) != 0 ? "" : str;
        j = (i2 & 2) != 0 ? 0 : j;
        j2 = (i2 & 4) != 0 ? 0 : j2;
        i = (i2 & 8) != 0 ? 0 : i;
        C87412m.m108594g(str, "name");
        this.f290040a = str;
        this.f290041b = j;
        this.f290042c = j2;
        this.f290043d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C98944a)) {
            return false;
        }
        C98944a aVar = (C98944a) obj;
        return C87412m.m108589b(this.f290040a, aVar.f290040a) && this.f290041b == aVar.f290041b && this.f290042c == aVar.f290042c && this.f290043d == aVar.f290043d;
    }

    public int hashCode() {
        long j = this.f290041b;
        long j2 = this.f290042c;
        return (((((this.f290040a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f290043d;
    }

    public String toString() {
        return "ConversationData(name=" + this.f290040a + ", startTime=" + this.f290041b + ", endTime=" + this.f290042c + ", count=" + this.f290043d + ')';
    }
}
