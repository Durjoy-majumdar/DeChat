package vp1;

import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import je1.C9377s4;

/* renamed from: vp1.p */
public final class C14940p {

    /* renamed from: a */
    public static final C14940p f40978a = new C14940p();

    /* renamed from: b */
    public static final Map<String, C14941a> f40979b = new LinkedHashMap();

    /* renamed from: vp1.p$a */
    public static final class C14941a {

        /* renamed from: a */
        public final long f40980a;

        /* renamed from: b */
        public final C9377s4 f40981b;

        public C14941a(long j, C9377s4 s4Var) {
            C87412m.m108594g(s4Var, "userPage");
            this.f40980a = j;
            this.f40981b = s4Var;
        }

        /* renamed from: a */
        public final C9377s4 mo13993a() {
            return this.f40981b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14941a)) {
                return false;
            }
            C14941a aVar = (C14941a) obj;
            return this.f40980a == aVar.f40980a && C87412m.m108589b(this.f40981b, aVar.f40981b);
        }

        public int hashCode() {
            long j = this.f40980a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f40981b.hashCode();
        }

        public String toString() {
            return "CacheData(cachedTime=" + this.f40980a + ", userPage=" + this.f40981b + ')';
        }
    }

    /* renamed from: a */
    public final C14941a mo13992a(String str) {
        C14941a aVar;
        C87412m.m108594g(str, "userName");
        synchronized (this) {
            aVar = (C14941a) ((LinkedHashMap) f40979b).get(str);
        }
        return aVar;
    }
}
