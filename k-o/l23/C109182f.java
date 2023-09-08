package l23;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: l23.f */
public final class C109182f {

    /* renamed from: a */
    public Map<Integer, C109183a> f326902a = new LinkedHashMap();

    /* renamed from: l23.f$a */
    public static final class C109183a {

        /* renamed from: a */
        public final int f326903a;

        /* renamed from: b */
        public final long f326904b;

        /* renamed from: c */
        public final long f326905c;

        public C109183a(int i, long j, long j2) {
            this.f326903a = i;
            this.f326904b = j;
            this.f326905c = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C109183a)) {
                return false;
            }
            C109183a aVar = (C109183a) obj;
            return this.f326903a == aVar.f326903a && this.f326904b == aVar.f326904b && this.f326905c == aVar.f326905c;
        }

        public int hashCode() {
            long j = this.f326904b;
            long j2 = this.f326905c;
            return (((this.f326903a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "TrackState(transOrder=" + this.f326903a + ", trackStartTimeMs=" + this.f326904b + ", trackEndTimeMs=" + this.f326905c + ')';
        }
    }
}
