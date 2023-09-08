package os1;

import bl3.C0327w;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import gy3.C87412m;
import java.util.LinkedList;
import p823sg.C101611g;
import q90.C101062d;
import w60.C102354f;

/* renamed from: os1.s */
public final class C62167s extends C0327w<FinderCommonFeatureService> {

    /* renamed from: e */
    public final C102354f<String, C11754a> f176745e = new C102354f<>(6);

    /* renamed from: os1.s$a */
    public static final class C11754a {

        /* renamed from: a */
        public final String f34411a;

        public C11754a(String str) {
            C87412m.m108594g(str, "key");
            this.f34411a = str;
            new LinkedList();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11754a) && C87412m.m108589b(this.f34411a, ((C11754a) obj).f34411a);
        }

        public int hashCode() {
            return this.f34411a.hashCode();
        }

        public String toString() {
            return "Cache(key=" + this.f34411a + ')';
        }
    }

    public void onCleared() {
        super.onCleared();
        C101611g<K, V> gVar = this.f176745e.f301454a;
        if (gVar != null) {
            ((C101062d) gVar).trimToSize(-1);
            return;
        }
        throw new NullPointerException("mData == null");
    }
}
