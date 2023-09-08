package p247u3;

import gy3.C87412m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p247u3.C65145q1;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: u3.r1 */
public final class C65164r1<Key, Value> {

    /* renamed from: a */
    public final List<C65145q1.C65150b.C65152b<Key, Value>> f187590a;

    /* renamed from: b */
    public final Integer f187591b;

    /* renamed from: c */
    public final C65078l1 f187592c;

    /* renamed from: d */
    public final int f187593d;

    public C65164r1(List<C65145q1.C65150b.C65152b<Key, Value>> list, Integer num, C65078l1 l1Var, int i) {
        C87412m.m108594g(list, "pages");
        C87412m.m108594g(l1Var, "config");
        this.f187590a = list;
        this.f187591b = num;
        this.f187592c = l1Var;
        this.f187593d = i;
    }

    /* renamed from: a */
    public final C65145q1.C65150b.C65152b<Key, Value> mo89319a(int i) {
        List<C65145q1.C65150b.C65152b<Key, Value>> list = this.f187590a;
        int i2 = 0;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C65145q1.C65150b.C65152b) it.next()).f187562a.isEmpty()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            return null;
        }
        int i3 = i - this.f187593d;
        while (i2 < C64197v.m75536e(this.f187590a) && i3 > C64197v.m75536e(this.f187590a.get(i2).f187562a)) {
            i3 -= this.f187590a.get(i2).f187562a.size();
            i2++;
        }
        return i3 < 0 ? (C65145q1.C65150b.C65152b) C110818d0.m150914L(this.f187590a) : this.f187590a.get(i2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C65164r1) {
            C65164r1 r1Var = (C65164r1) obj;
            return C87412m.m108589b(this.f187590a, r1Var.f187590a) && C87412m.m108589b(this.f187591b, r1Var.f187591b) && C87412m.m108589b(this.f187592c, r1Var.f187592c) && this.f187593d == r1Var.f187593d;
        }
    }

    public int hashCode() {
        int hashCode = this.f187590a.hashCode();
        Integer num = this.f187591b;
        return hashCode + (num != null ? num.hashCode() : 0) + this.f187592c.hashCode() + this.f187593d;
    }

    public String toString() {
        return "PagingState(pages=" + this.f187590a + ", anchorPosition=" + this.f187591b + ", config=" + this.f187592c + ", " + "leadingPlaceholderCount=" + this.f187593d + ')';
    }
}
