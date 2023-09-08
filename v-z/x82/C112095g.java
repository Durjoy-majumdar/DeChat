package x82;

import gy3.C87412m;
import java.util.HashSet;

/* renamed from: x82.g */
public final class C112095g {

    /* renamed from: a */
    public HashSet<Integer> f335602a;

    /* renamed from: b */
    public HashSet<C38462a> f335603b;

    /* renamed from: c */
    public HashSet<Integer> f335604c;

    /* renamed from: x82.g$a */
    public static final class C38462a {

        /* renamed from: a */
        public String f101449a;

        /* renamed from: b */
        public int f101450b;

        public C38462a(String str, int i) {
            C87412m.m108594g(str, "name");
            this.f101449a = str;
            this.f101450b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38462a)) {
                return false;
            }
            C38462a aVar = (C38462a) obj;
            return C87412m.m108589b(this.f101449a, aVar.f101449a) && this.f101450b == aVar.f101450b;
        }

        public int hashCode() {
            return (this.f101449a.hashCode() * 31) + this.f101450b;
        }

        public String toString() {
            return "MoreItem(name=" + this.f101449a + ", func=" + this.f101450b + ')';
        }
    }

    public C112095g(HashSet<Integer> hashSet, HashSet<C38462a> hashSet2, HashSet<Integer> hashSet3, int i) {
        C87412m.m108594g(hashSet, "supportFuncList");
        C87412m.m108594g(hashSet2, "moreFuncList");
        C87412m.m108594g(hashSet3, "featureSupportList");
        this.f335602a = hashSet;
        this.f335603b = hashSet2;
        this.f335604c = hashSet3;
    }
}
