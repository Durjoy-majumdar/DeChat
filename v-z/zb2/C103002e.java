package zb2;

import androidx.recyclerview.widget.C54248l;
import gy3.C87412m;
import java.util.List;
import sx3.C110818d0;
import zb2.C103001d;

/* renamed from: zb2.e */
public final class C103002e<T extends C103001d<T>> extends C54248l.C54250b {

    /* renamed from: a */
    public final List<T> f303945a;

    /* renamed from: b */
    public final List<T> f303946b;

    public C103002e(List<? extends T> list, List<? extends T> list2) {
        C87412m.m108594g(list, "oldList");
        C87412m.m108594g(list2, "newList");
        this.f303945a = list;
        this.f303946b = list2;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        Object O = C110818d0.m150917O(this.f303945a, i);
        Object O2 = C110818d0.m150917O(this.f303946b, i2);
        if (O == null || O2 == null) {
            return false;
        }
        return ((C103001d) O).mo347g5((C103001d) O2);
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        Object O = C110818d0.m150917O(this.f303945a, i);
        Object O2 = C110818d0.m150917O(this.f303946b, i2);
        if (O == null || O2 == null) {
            return false;
        }
        return ((C103001d) O).mo90778Yt((C103001d) O2);
    }

    /* renamed from: c */
    public Object mo11467c(int i, int i2) {
        Object O = C110818d0.m150917O(this.f303945a, i);
        Object O2 = C110818d0.m150917O(this.f303946b, i2);
        if (O == null || O2 == null) {
            return null;
        }
        return ((C103001d) O2).mo90782kD((C103001d) O);
    }

    /* renamed from: d */
    public int mo11468d() {
        return this.f303946b.size();
    }

    /* renamed from: e */
    public int mo11469e() {
        return this.f303945a.size();
    }
}
