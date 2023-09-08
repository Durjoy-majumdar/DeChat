package os1;

import bl3.C0327w;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import fy3.C32224a;
import gy3.C87413o;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import o40.C61926c;
import rx3.C13601g;
import rx3.C36568h;
import up1.C37521f;

/* renamed from: os1.a */
public final class C35279a extends C0327w<FinderCommonFeatureService> {

    /* renamed from: e */
    public boolean f94529e;

    /* renamed from: f */
    public final C13601g f94530f = C36568h.m40985a(C35281b.f94537d);

    /* renamed from: g */
    public final int f94531g = 300;

    /* renamed from: h */
    public final ConcurrentHashMap<String, C35280a> f94532h = new ConcurrentHashMap<>();

    /* renamed from: os1.a$a */
    public static final class C35280a implements Serializable {

        /* renamed from: d */
        public final int f94533d;

        /* renamed from: e */
        public final long f94534e;

        /* renamed from: f */
        public int f94535f;

        /* renamed from: g */
        public long f94536g;

        public C35280a(int i, long j) {
            this.f94533d = i;
            this.f94534e = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35280a)) {
                return false;
            }
            C35280a aVar = (C35280a) obj;
            return this.f94533d == aVar.f94533d && this.f94534e == aVar.f94534e;
        }

        public int hashCode() {
            long j = this.f94534e;
            return (this.f94533d * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "Item(scene=" + this.f94533d + ", feedId=" + this.f94534e + ')';
        }
    }

    /* renamed from: os1.a$b */
    public static final class C35281b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C35281b f94537d = new C35281b();

        public C35281b() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            return C37521f.f99472o2.mo60266n();
        }
    }

    /* renamed from: c3 */
    public final String mo60178c3(int i, long j) {
        return i + '-' + C61926c.m72691p(j);
    }
}
