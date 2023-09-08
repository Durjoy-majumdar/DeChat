package zn1;

import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pe3.C89349b;

/* renamed from: zn1.a */
public final class C16309a {

    /* renamed from: a */
    public static final C16309a f43609a = new C16309a();

    /* renamed from: b */
    public static final Map<C16310a, List<C16340u>> f43610b = new LinkedHashMap();

    /* renamed from: c */
    public static final Map<C16310a, C16311b> f43611c = new LinkedHashMap();

    /* renamed from: zn1.a$a */
    public static final class C16310a {

        /* renamed from: a */
        public final long f43612a;

        public C16310a(long j) {
            this.f43612a = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C16310a) && this.f43612a == ((C16310a) obj).f43612a;
        }

        public int hashCode() {
            long j = this.f43612a;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            return "CacheKey(collectionId=" + this.f43612a + ')';
        }
    }

    /* renamed from: zn1.a$b */
    public static final class C16311b {

        /* renamed from: a */
        public final C89349b f43613a;

        /* renamed from: b */
        public final boolean f43614b;

        /* renamed from: c */
        public final boolean f43615c;

        public C16311b(C89349b bVar, boolean z, boolean z2) {
            this.f43613a = bVar;
            this.f43614b = z;
            this.f43615c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16311b)) {
                return false;
            }
            C16311b bVar = (C16311b) obj;
            return C87412m.m108589b(this.f43613a, bVar.f43613a) && this.f43614b == bVar.f43614b && this.f43615c == bVar.f43615c;
        }

        public int hashCode() {
            C89349b bVar = this.f43613a;
            int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            boolean z = this.f43614b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f43615c;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            return "Extra(lastBuffer=" + this.f43613a + ", upContinue=" + this.f43614b + ", downContinue=" + this.f43615c + ')';
        }
    }
}
