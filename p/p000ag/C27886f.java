package p000ag;

import gy3.C8480h;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ag.f */
public final class C27886f {

    /* renamed from: a */
    public static final C27886f f77042a = new C27886f();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, C27887a> f77043b = new ConcurrentHashMap<>();

    /* renamed from: ag.f$a */
    public static final class C27887a {

        /* renamed from: a */
        public long f77044a;

        /* renamed from: b */
        public long f77045b;

        public C27887a() {
            this(0, 0, 3, (C8480h) null);
        }

        public C27887a(long j, long j2, int i, C8480h hVar) {
            j = (i & 1) != 0 ? 0 : j;
            j2 = (i & 2) != 0 ? 0 : j2;
            this.f77044a = j;
            this.f77045b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27887a)) {
                return false;
            }
            C27887a aVar = (C27887a) obj;
            return this.f77044a == aVar.f77044a && this.f77045b == aVar.f77045b;
        }

        public int hashCode() {
            long j = this.f77044a;
            long j2 = this.f77045b;
            return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "Info(initTime=" + this.f77044a + ", renderStartTime=" + this.f77045b + ')';
        }
    }
}
