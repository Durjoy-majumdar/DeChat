package p1221x4;

/* renamed from: x4.d */
public class C118830d {

    /* renamed from: a */
    public String f355525a;

    /* renamed from: b */
    public Long f355526b;

    public C118830d(String str, long j) {
        this.f355525a = str;
        this.f355526b = Long.valueOf(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C118830d)) {
            return false;
        }
        C118830d dVar = (C118830d) obj;
        if (!this.f355525a.equals(dVar.f355525a)) {
            return false;
        }
        Long l = this.f355526b;
        Long l2 = dVar.f355526b;
        return l != null ? l.equals(l2) : l2 == null;
    }

    public int hashCode() {
        int hashCode = this.f355525a.hashCode() * 31;
        Long l = this.f355526b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
