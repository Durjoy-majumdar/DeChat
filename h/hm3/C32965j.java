package hm3;

import gy3.C87412m;

/* renamed from: hm3.j */
public final class C32965j<T> {

    /* renamed from: a */
    public final T f89567a;

    /* renamed from: b */
    public final long f89568b;

    public C32965j(T t, long j) {
        this.f89567a = t;
        this.f89568b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32965j)) {
            return false;
        }
        C32965j jVar = (C32965j) obj;
        return C87412m.m108589b(this.f89567a, jVar.f89567a) && this.f89568b == jVar.f89568b;
    }

    public int hashCode() {
        T t = this.f89567a;
        int hashCode = t == null ? 0 : t.hashCode();
        long j = this.f89568b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "WhiteListItem(value=" + this.f89567a + ", expiredTimeMillis=" + this.f89568b + ')';
    }
}
