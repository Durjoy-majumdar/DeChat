package nk1;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: nk1.a */
public final class C34862a {

    /* renamed from: a */
    public String f93648a;

    /* renamed from: b */
    public long f93649b;

    /* renamed from: c */
    public int f93650c;

    /* renamed from: d */
    public long f93651d;

    public C34862a() {
        this((String) null, 0, 0, 0, 15, (C8480h) null);
    }

    public C34862a(String str, long j, int i, long j2, int i2, C8480h hVar) {
        str = (i2 & 1) != 0 ? "" : str;
        j = (i2 & 2) != 0 ? 0 : j;
        i = (i2 & 4) != 0 ? 0 : i;
        j2 = (i2 & 8) != 0 ? 0 : j2;
        C87412m.m108594g(str, "key");
        this.f93648a = str;
        this.f93649b = j;
        this.f93650c = i;
        this.f93651d = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34862a)) {
            return false;
        }
        C34862a aVar = (C34862a) obj;
        return C87412m.m108589b(this.f93648a, aVar.f93648a) && this.f93649b == aVar.f93649b && this.f93650c == aVar.f93650c && this.f93651d == aVar.f93651d;
    }

    public int hashCode() {
        long j = this.f93649b;
        long j2 = this.f93651d;
        return (((((this.f93648a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f93650c) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "AverageCachePair(key=" + this.f93648a + ", valueCount=" + this.f93649b + ", times=" + this.f93650c + ", averageValue=" + this.f93651d + ')';
    }
}
