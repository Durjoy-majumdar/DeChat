package ol2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: ol2.a */
public final class C21795a {

    /* renamed from: a */
    public final long f61776a;

    /* renamed from: b */
    public HashMap<Long, C21796a> f61777b = new HashMap<>();

    /* renamed from: c */
    public List<Integer> f61778c = new ArrayList();

    /* renamed from: ol2.a$a */
    public static final class C21796a {

        /* renamed from: a */
        public long f61779a;

        /* renamed from: b */
        public long f61780b;

        public C21796a(long j, long j2) {
            this.f61779a = j;
            this.f61780b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21796a)) {
                return false;
            }
            C21796a aVar = (C21796a) obj;
            return this.f61779a == aVar.f61779a && this.f61780b == aVar.f61780b;
        }

        public int hashCode() {
            long j = this.f61779a;
            long j2 = this.f61780b;
            return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "PerformanceRecord(startScanProduct=" + this.f61779a + ", endScanProduct=" + this.f61780b + ')';
        }
    }

    public C21795a(long j) {
        this.f61776a = j;
    }
}
