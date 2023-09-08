package p381s7;

import java.util.Collections;
import java.util.List;

/* renamed from: s7.b */
public final class C22302b extends C22304c {

    /* renamed from: c */
    public final int f63217c;

    /* renamed from: d */
    public final long f63218d;

    /* renamed from: e */
    public final long f63219e;

    /* renamed from: f */
    public final boolean f63220f;

    /* renamed from: g */
    public final int f63221g;

    /* renamed from: h */
    public final int f63222h;

    /* renamed from: i */
    public final int f63223i;

    /* renamed from: j */
    public final long f63224j;

    /* renamed from: k */
    public final boolean f63225k;

    /* renamed from: l */
    public final boolean f63226l;

    /* renamed from: m */
    public final boolean f63227m;

    /* renamed from: n */
    public final C22303a f63228n;

    /* renamed from: o */
    public final List<C22303a> f63229o;

    /* renamed from: p */
    public final long f63230p;

    /* renamed from: s7.b$a */
    public static final class C22303a implements Comparable<Long> {

        /* renamed from: d */
        public final String f63231d;

        /* renamed from: e */
        public final long f63232e;

        /* renamed from: f */
        public final int f63233f;

        /* renamed from: g */
        public final long f63234g;

        /* renamed from: h */
        public final boolean f63235h;

        /* renamed from: i */
        public final String f63236i;

        /* renamed from: j */
        public final String f63237j;

        /* renamed from: n */
        public final long f63238n;

        /* renamed from: o */
        public final long f63239o;

        public C22303a(String str, long j, int i, long j2, boolean z, String str2, String str3, long j3, long j4) {
            this.f63231d = str;
            this.f63232e = j;
            this.f63233f = i;
            this.f63234g = j2;
            this.f63235h = z;
            this.f63236i = str2;
            this.f63237j = str3;
            this.f63238n = j3;
            this.f63239o = j4;
        }

        public int compareTo(Object obj) {
            Long l = (Long) obj;
            if (this.f63234g > l.longValue()) {
                return 1;
            }
            return this.f63234g < l.longValue() ? -1 : 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22302b(int i, String str, List<String> list, long j, long j2, boolean z, int i2, int i3, int i4, long j3, boolean z2, boolean z3, boolean z4, C22303a aVar, List<C22303a> list2) {
        super(str, list);
        String str2 = str;
        List<String> list3 = list;
        this.f63217c = i;
        this.f63219e = j2;
        this.f63220f = z;
        this.f63221g = i2;
        this.f63222h = i3;
        this.f63223i = i4;
        this.f63224j = j3;
        this.f63225k = z2;
        this.f63226l = z3;
        this.f63227m = z4;
        this.f63228n = aVar;
        this.f63229o = Collections.unmodifiableList(list2);
        if (!list2.isEmpty()) {
            C22303a aVar2 = list2.get(list2.size() - 1);
            this.f63230p = aVar2.f63234g + aVar2.f63232e;
        } else {
            this.f63230p = 0;
        }
        this.f63218d = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : this.f63230p + j;
    }
}
