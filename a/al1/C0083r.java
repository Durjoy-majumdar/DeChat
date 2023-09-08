package al1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: al1.r */
public final class C0083r {

    /* renamed from: a */
    public LinkedList<String> f513a;

    /* renamed from: b */
    public String f514b;

    public C0083r() {
        this((LinkedList) null, (String) null, 3, (C8480h) null);
    }

    public C0083r(LinkedList<String> linkedList, String str, int i, C8480h hVar) {
        linkedList = (i & 1) != 0 ? new LinkedList<>() : linkedList;
        str = (i & 2) != 0 ? null : str;
        C87412m.m108594g(linkedList, "chatroomList");
        this.f513a = linkedList;
        this.f514b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0083r)) {
            return false;
        }
        C0083r rVar = (C0083r) obj;
        return C87412m.m108589b(this.f513a, rVar.f513a) && C87412m.m108589b(this.f514b, rVar.f514b);
    }

    public int hashCode() {
        int hashCode = this.f513a.hashCode() * 31;
        String str = this.f514b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LuckyMoneyLiveData(chatroomList=" + this.f513a + ", clientBuff=" + this.f514b + ')';
    }
}
