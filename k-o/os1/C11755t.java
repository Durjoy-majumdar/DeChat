package os1;

import bl3.C0327w;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import te3.C51270sn1;

/* renamed from: os1.t */
public final class C11755t extends C0327w<FinderCommonFeatureService> {

    /* renamed from: e */
    public ArrayList<BaseFinderFeed> f34412e;

    /* renamed from: f */
    public final ConcurrentHashMap<String, C11756a> f34413f = new ConcurrentHashMap<>();

    /* renamed from: os1.t$a */
    public static final class C11756a {

        /* renamed from: a */
        public final String f34414a;

        /* renamed from: b */
        public List<? extends C0740i2> f34415b = new LinkedList();

        /* renamed from: c */
        public C51270sn1 f34416c;

        public C11756a(String str) {
            C87412m.m108594g(str, "keyWord");
            this.f34414a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11756a) && C87412m.m108589b(this.f34414a, ((C11756a) obj).f34414a);
        }

        public int hashCode() {
            return this.f34414a.hashCode();
        }

        public String toString() {
            return "Cache(keyWord=" + this.f34414a + ')';
        }
    }

    /* renamed from: c3 */
    public final C11756a mo11627c3(String str) {
        C87412m.m108594g(str, "keyWord");
        C11756a aVar = this.f34413f.get(str);
        if (aVar != null) {
            return aVar;
        }
        C11756a aVar2 = new C11756a(str);
        this.f34413f.put(str, new C11756a(str));
        return aVar2;
    }
}
