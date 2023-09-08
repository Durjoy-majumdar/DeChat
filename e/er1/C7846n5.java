package er1;

/* renamed from: er1.n5 */
public final class C7846n5 {

    /* renamed from: a */
    public long f26420a;

    /* renamed from: b */
    public long f26421b;

    public C7846n5(long j, long j2) {
        this.f26420a = j;
        this.f26421b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7846n5)) {
            return false;
        }
        C7846n5 n5Var = (C7846n5) obj;
        return this.f26420a == n5Var.f26420a && this.f26421b == n5Var.f26421b;
    }

    public int hashCode() {
        long j = this.f26420a;
        long j2 = this.f26421b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "QuotaConfig(noticeAmount=" + this.f26420a + ", saveTime=" + this.f26421b + ')';
    }
}
