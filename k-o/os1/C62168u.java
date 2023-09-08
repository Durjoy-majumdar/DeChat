package os1;

import bl3.C0327w;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import o40.C61926c;

/* renamed from: os1.u */
public final class C62168u extends C0327w<FinderCommonFeatureService> {

    /* renamed from: e */
    public C62169a f176746e;

    /* renamed from: f */
    public HashMap<String, C62169a> f176747f = new HashMap<>();

    /* renamed from: g */
    public HashMap<Long, Integer> f176748g = new HashMap<>();

    /* renamed from: h */
    public HashMap<Long, C11757b> f176749h = new HashMap<>();

    /* renamed from: os1.u$b */
    public static final class C11757b {

        /* renamed from: a */
        public final long f34417a;

        /* renamed from: b */
        public final boolean f34418b;

        /* renamed from: c */
        public final float f34419c;

        /* renamed from: d */
        public boolean f34420d = true;

        /* renamed from: e */
        public long f34421e;

        /* renamed from: f */
        public float f34422f;

        /* renamed from: g */
        public boolean f34423g;

        public C11757b(long j, boolean z, float f) {
            this.f34417a = j;
            this.f34418b = z;
            this.f34419c = f;
            this.f34421e = j;
            this.f34422f = f;
            this.f34423g = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11757b)) {
                return false;
            }
            C11757b bVar = (C11757b) obj;
            return this.f34417a == bVar.f34417a && this.f34418b == bVar.f34418b && C87412m.m108589b(Float.valueOf(this.f34419c), Float.valueOf(bVar.f34419c));
        }

        public int hashCode() {
            long j = this.f34417a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            boolean z = this.f34418b;
            if (z) {
                z = true;
            }
            return ((i + (z ? 1 : 0)) * 31) + Float.floatToIntBits(this.f34419c);
        }

        public String toString() {
            return "StartStateCache(pos=" + this.f34417a + ", isPauseOnStart=" + this.f34418b + ", speedRatio=" + this.f34419c + ')';
        }
    }

    /* renamed from: os1.u$a */
    public static final class C62169a {

        /* renamed from: a */
        public final long f176750a;

        /* renamed from: b */
        public final int f176751b;

        /* renamed from: c */
        public int f176752c;

        /* renamed from: d */
        public long f176753d;

        /* renamed from: e */
        public float f176754e = 1.0f;

        /* renamed from: f */
        public final long f176755f = System.currentTimeMillis();

        public C62169a(long j, int i) {
            this.f176750a = j;
            this.f176751b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C62169a)) {
                return false;
            }
            C62169a aVar = (C62169a) obj;
            return this.f176750a == aVar.f176750a && this.f176751b == aVar.f176751b;
        }

        public int hashCode() {
            long j = this.f176750a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f176751b;
        }

        public String toString() {
            return "Cache(feedId=" + this.f176750a + ", tabType=" + this.f176751b + ')';
        }
    }

    /* renamed from: c3 */
    public final void mo87219c3(long j) {
        this.f176747f.remove(C61926c.m72691p(j));
        Log.m105924i("Finder.VideoStateCacheVM", "clearFeedProgress: feedId=" + C61926c.m72691p(j));
    }

    /* renamed from: d3 */
    public final int mo87220d3(long j) {
        Integer num = this.f176748g.get(Long.valueOf(j));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: e3 */
    public final C11757b mo87221e3(long j) {
        return this.f176749h.get(Long.valueOf(j));
    }

    /* renamed from: f3 */
    public final C62169a mo87222f3(long j, boolean z) {
        C62169a aVar = this.f176747f.get(C61926c.m72691p(j));
        if (z) {
            this.f176747f.remove(C61926c.m72691p(j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[getVideoProgress] feedId=");
        sb.append(C61926c.m72691p(j));
        sb.append(" progress=");
        Long l = null;
        sb.append(aVar != null ? Integer.valueOf(aVar.f176752c) : null);
        sb.append(", timestamp=");
        if (aVar != null) {
            l = Long.valueOf(aVar.f176753d);
        }
        sb.append(l);
        sb.append(", needRemove=");
        sb.append(z);
        Log.m105924i("Finder.VideoStateCacheVM", sb.toString());
        return aVar;
    }

    /* renamed from: g3 */
    public final C62169a mo87223g3(long j, int i) {
        if (((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11603f3(i)) {
            return null;
        }
        C62169a aVar = this.f176746e;
        boolean z = false;
        if (aVar != null && aVar.f176750a == j) {
            z = true;
        }
        if (z) {
            return aVar;
        }
        return null;
    }

    /* renamed from: i3 */
    public final void mo87224i3(long j, int i, int i2, long j2, float f) {
        Log.m105924i("Finder.VideoStateCacheVM", "[store] feedId=" + C61926c.m72691p(j) + " progress=" + i2 + " playTimeMs=" + j2);
        C62169a aVar = new C62169a(j, i);
        aVar.f176752c = i2;
        aVar.f176753d = j2;
        aVar.f176754e = f;
        this.f176746e = aVar;
    }

    /* renamed from: j3 */
    public final void mo87225j3(long j, int i, int i2, long j2, float f) {
        Log.m105924i("Finder.VideoStateCacheVM", "[storeProgress] feedId=" + C61926c.m72691p(j) + " progress=" + i2 + " playTimeMs=" + j2);
        HashMap<String, C62169a> hashMap = this.f176747f;
        String p = C61926c.m72691p(j);
        C62169a aVar = new C62169a(j, i);
        aVar.f176752c = i2;
        aVar.f176753d = j2;
        aVar.f176754e = f;
        hashMap.put(p, aVar);
    }
}
