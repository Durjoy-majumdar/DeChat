package vp1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pe3.C89349b;
import rx3.C13598b0;
import up1.C65426w0;

/* renamed from: vp1.f */
public final class C65838f {

    /* renamed from: a */
    public static final C65838f f189333a = new C65838f();

    /* renamed from: b */
    public static final Map<C37799a, List<C65426w0>> f189334b = new LinkedHashMap();

    /* renamed from: c */
    public static final Map<C37799a, C65839b> f189335c = new LinkedHashMap();

    /* renamed from: vp1.f$a */
    public static final class C37799a {

        /* renamed from: a */
        public final long f100116a;

        /* renamed from: b */
        public final long f100117b;

        public C37799a(long j, long j2) {
            this.f100116a = j;
            this.f100117b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37799a)) {
                return false;
            }
            C37799a aVar = (C37799a) obj;
            return this.f100116a == aVar.f100116a && this.f100117b == aVar.f100117b;
        }

        public int hashCode() {
            long j = this.f100116a;
            long j2 = this.f100117b;
            return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "CacheKey(feedId=" + this.f100116a + ", refCommentId=" + this.f100117b + ')';
        }
    }

    /* renamed from: vp1.f$b */
    public static final class C65839b {

        /* renamed from: a */
        public final int f189336a;

        /* renamed from: b */
        public final C89349b f189337b;

        /* renamed from: c */
        public final boolean f189338c;

        /* renamed from: d */
        public final boolean f189339d;

        /* renamed from: e */
        public final boolean f189340e;

        public C65839b(int i, C89349b bVar, boolean z, boolean z2, boolean z3) {
            this.f189336a = i;
            this.f189337b = bVar;
            this.f189338c = z;
            this.f189339d = z2;
            this.f189340e = z3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C65839b)) {
                return false;
            }
            C65839b bVar = (C65839b) obj;
            return this.f189336a == bVar.f189336a && C87412m.m108589b(this.f189337b, bVar.f189337b) && this.f189338c == bVar.f189338c && this.f189339d == bVar.f189339d && this.f189340e == bVar.f189340e;
        }

        public int hashCode() {
            int i = this.f189336a * 31;
            C89349b bVar = this.f189337b;
            int hashCode = (i + (bVar == null ? 0 : bVar.hashCode())) * 31;
            boolean z = this.f189338c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f189339d;
            if (z3) {
                z3 = true;
            }
            int i3 = (i2 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f189340e;
            if (!z4) {
                z2 = z4;
            }
            return i3 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "Extra(pos=" + this.f189336a + ", lastBuffer=" + this.f189337b + ", upContinue=" + this.f189338c + ", downContinue=" + this.f189339d + ", hasExpand=" + this.f189340e + ')';
        }
    }

    /* renamed from: a */
    public final void mo89880a(long j, long j2, List<C65426w0> list) {
        Map<C37799a, List<C65426w0>> map;
        C87412m.m108594g(list, "comments");
        synchronized (this) {
            synchronized (f189333a) {
                map = f189334b;
                map.remove(new C37799a(j, j2));
                C65839b remove = f189335c.remove(new C37799a(j, j2));
            }
            List put = map.put(new C37799a(j, j2), list);
        }
    }

    /* renamed from: b */
    public final void mo89881b(long j, long j2, int i, C89349b bVar, boolean z, boolean z2, boolean z3) {
        synchronized (this) {
            long j3 = j;
            long j4 = j2;
            C65839b put = f189335c.put(new C37799a(j, j2), new C65839b(i, bVar, z, z2, z3));
        }
    }

    /* renamed from: c */
    public final void mo89882c() {
        Log.m105924i("Finder.FinderCommentCache", "clearCache all");
        synchronized (this) {
            ((LinkedHashMap) f189334b).clear();
            ((LinkedHashMap) f189335c).clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: d */
    public final List<C65426w0> mo89883d(long j, long j2) {
        List<C65426w0> list;
        synchronized (this) {
            list = (List) ((LinkedHashMap) f189334b).get(new C37799a(j, j2));
        }
        return list;
    }
}
