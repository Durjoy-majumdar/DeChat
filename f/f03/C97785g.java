package f03;

/* renamed from: f03.g */
public interface C97785g {

    /* renamed from: f03.g$a */
    public static final class C97786a {

        /* renamed from: a */
        public final long f286873a;

        /* renamed from: b */
        public final long f286874b;

        /* renamed from: c */
        public final long f286875c;

        /* renamed from: d */
        public final long f286876d;

        public C97786a(long j, long j2, long j3, long j4) {
            this.f286873a = j;
            this.f286874b = j2;
            this.f286875c = j3;
            this.f286876d = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C97786a)) {
                return false;
            }
            C97786a aVar = (C97786a) obj;
            return this.f286873a == aVar.f286873a && this.f286874b == aVar.f286874b && this.f286875c == aVar.f286875c && this.f286876d == aVar.f286876d;
        }

        public int hashCode() {
            long j = this.f286873a;
            long j2 = this.f286874b;
            long j3 = this.f286875c;
            long j4 = this.f286876d;
            return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
        }

        public String toString() {
            return "Stat(progress=" + this.f286873a + ", totalLength=" + this.f286874b + ", moovOffset=" + this.f286875c + ", moovLength=" + this.f286876d + ')';
        }
    }

    /* renamed from: a */
    void mo126303a();

    /* renamed from: b */
    boolean mo126304b();

    /* renamed from: c */
    C97786a mo126305c();

    /* renamed from: d */
    int mo126306d();

    /* renamed from: e */
    String mo126307e();

    /* renamed from: f */
    void mo126308f();

    /* renamed from: g */
    Long mo126309g();

    long getLength();

    String getMediaId();

    /* renamed from: h */
    String mo126312h();

    boolean isFinished();

    boolean start();

    void stop();
}
