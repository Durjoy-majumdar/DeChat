package eg1;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import eb0.C31543z5;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C33078t2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import te3.C49098d51;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: eg1.n */
public final class C31588n extends C86301e implements C33078t2 {

    /* renamed from: d */
    public int f84416d = 60;

    /* renamed from: e */
    public final ConcurrentHashMap<C31589a, C31590b> f84417e = new ConcurrentHashMap<>();

    /* renamed from: eg1.n$a */
    public static final class C31589a {

        /* renamed from: a */
        public final String f84418a;

        /* renamed from: b */
        public final String f84419b;

        public C31589a(String str, String str2) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(str2, "noticeId");
            this.f84418a = str;
            this.f84419b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31589a)) {
                return false;
            }
            C31589a aVar = (C31589a) obj;
            return C87412m.m108589b(this.f84418a, aVar.f84418a) && C87412m.m108589b(this.f84419b, aVar.f84419b);
        }

        public int hashCode() {
            return (this.f84418a.hashCode() * 31) + this.f84419b.hashCode();
        }

        public String toString() {
            return "CacheKey(username=" + this.f84418a + ", noticeId=" + this.f84419b + ')';
        }
    }

    /* renamed from: eg1.n$b */
    public static final class C31590b {

        /* renamed from: a */
        public final C49098d51 f84420a;

        /* renamed from: b */
        public final int f84421b;

        public C31590b(C49098d51 d512, int i) {
            C87412m.m108594g(d512, "noticeInfo");
            this.f84420a = d512;
            this.f84421b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31590b)) {
                return false;
            }
            C31590b bVar = (C31590b) obj;
            return C87412m.m108589b(this.f84420a, bVar.f84420a) && this.f84421b == bVar.f84421b;
        }

        public int hashCode() {
            return (this.f84420a.hashCode() * 31) + this.f84421b;
        }

        public String toString() {
            return "CacheValue(noticeInfo=" + this.f84420a + ", saveTimeSec=" + this.f84421b + ')';
        }
    }

    /* renamed from: Ex */
    public void mo58242Ex(String str, String str2, C49098d51 d512) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "noticeId");
        C87412m.m108594g(d512, "noticeInfo");
        this.f84417e.put(new C31589a(str, str2), new C31590b(d512, C31543z5.m39455e()));
    }

    /* renamed from: Oe */
    public void mo58243Oe(String str, String str2, boolean z) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "noticeId");
        C31590b bVar = this.f84417e.get(new C31589a(str, str2));
        C49098d51 d512 = bVar != null ? bVar.f84420a : null;
        if (d512 != null) {
            d512.f132119e = z ^ true ? 1 : 0;
        }
    }

    /* renamed from: Vo */
    public void mo58244Vo(String str, boolean z) {
        C87412m.m108594g(str, "username");
        for (Map.Entry next : this.f84417e.entrySet()) {
            if (C87412m.m108589b(((C31589a) next.getKey()).f84418a, str)) {
                ((C31590b) next.getValue()).f84420a.f132119e = z ^ true ? 1 : 0;
            }
        }
    }

    /* renamed from: vv */
    public void mo58245vv(int i) {
        this.f84416d = i;
    }

    /* renamed from: zi */
    public Boolean mo58246zi(String str, String str2) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "noticeId");
        C31590b bVar = this.f84417e.get(new C31589a(str, str2));
        if (bVar == null || C31543z5.m39455e() - bVar.f84421b >= this.f84416d) {
            return null;
        }
        return Boolean.valueOf(bVar.f84420a.f132119e == 0);
    }
}
