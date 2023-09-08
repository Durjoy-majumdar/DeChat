package tj1;

import gy3.C87412m;
import java.util.LinkedList;
import te3.C48769aw;

/* renamed from: tj1.a */
public final class C13929a {

    /* renamed from: a */
    public int f39130a;

    /* renamed from: b */
    public long f39131b;

    /* renamed from: c */
    public LinkedList<C13930a> f39132c;

    /* renamed from: tj1.a$a */
    public static final class C13930a {

        /* renamed from: a */
        public boolean f39133a;

        /* renamed from: b */
        public C48769aw f39134b;

        public C13930a(boolean z, C48769aw awVar) {
            C87412m.m108594g(awVar, "productItem");
            this.f39133a = z;
            this.f39134b = awVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13930a)) {
                return false;
            }
            C13930a aVar = (C13930a) obj;
            return this.f39133a == aVar.f39133a && C87412m.m108589b(this.f39134b, aVar.f39134b);
        }

        public int hashCode() {
            boolean z = this.f39133a;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f39134b.hashCode();
        }

        public String toString() {
            return "isChoose=" + this.f39133a + ",  count=" + this.f39134b.f130787e + ", giftId=" + this.f39134b.f130786d;
        }
    }

    public C13929a(int i, long j, LinkedList<C13930a> linkedList) {
        C87412m.m108594g(linkedList, "productList");
        this.f39130a = i;
        this.f39131b = j;
        this.f39132c = linkedList;
    }

    public String toString() {
        String str = "FinderLiveGiftPkgChooseResult: level=" + this.f39130a + ", coin=" + this.f39131b + " \n";
        StringBuilder sb = new StringBuilder();
        for (C13930a aVar : this.f39132c) {
            sb.append(aVar.toString());
            sb.append("\n");
        }
        return str + sb;
    }
}
