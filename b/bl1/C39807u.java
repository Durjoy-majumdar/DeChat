package bl1;

import gy3.C87412m;
import java.util.ArrayList;
import te3.C51977xi;

/* renamed from: bl1.u */
public final class C39807u {

    /* renamed from: a */
    public final String f106814a;

    /* renamed from: b */
    public final ArrayList<C39775b> f106815b;

    /* renamed from: c */
    public long f106816c;

    /* renamed from: d */
    public final C51977xi f106817d;

    public C39807u(String str, ArrayList<C39775b> arrayList, long j, C51977xi xiVar) {
        C87412m.m108594g(str, "boxId");
        C87412m.m108594g(arrayList, "dataList");
        C87412m.m108594g(xiVar, "bindBoxContext");
        this.f106814a = str;
        this.f106815b = arrayList;
        this.f106816c = j;
        this.f106817d = xiVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39807u)) {
            return false;
        }
        C39807u uVar = (C39807u) obj;
        return C87412m.m108589b(this.f106814a, uVar.f106814a) && C87412m.m108589b(this.f106815b, uVar.f106815b) && this.f106816c == uVar.f106816c && C87412m.m108589b(this.f106817d, uVar.f106817d);
    }

    public int hashCode() {
        long j = this.f106816c;
        return (((((this.f106814a.hashCode() * 31) + this.f106815b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f106817d.hashCode();
    }

    public String toString() {
        return "BoxMsgInfo(boxId=" + this.f106814a + ", dataList=" + this.f106815b + ", lastEnterTimeStamp=" + this.f106816c + ", bindBoxContext=" + this.f106817d + ')';
    }
}
