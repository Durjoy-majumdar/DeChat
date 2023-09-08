package p175j0;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sx3.C110818d0;

/* renamed from: j0.e1 */
public final class C108496e1 {

    /* renamed from: a */
    public final List<Integer> f324821a;

    public C108496e1(List<Integer> list, int i, C8480h hVar) {
        list = (i & 1) != 0 ? new ArrayList<>() : list;
        C87412m.m108594g(list, "list");
        this.f324821a = list;
    }

    /* renamed from: a */
    public final void mo159366a(int i) {
        if (!this.f324821a.isEmpty()) {
            if (this.f324821a.get(0).intValue() != i) {
                List<Integer> list = this.f324821a;
                if (list.get(list.size() - 1).intValue() == i) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.f324821a.size();
        this.f324821a.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = this.f324821a.get(i2).intValue();
            if (i <= intValue) {
                break;
            }
            this.f324821a.set(size, Integer.valueOf(intValue));
            size = i2;
        }
        this.f324821a.set(size, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final int mo159367b() {
        int intValue;
        if (this.f324821a.size() > 0) {
            int intValue2 = this.f324821a.get(0).intValue();
            while ((!this.f324821a.isEmpty()) && this.f324821a.get(0).intValue() == intValue2) {
                List<Integer> list = this.f324821a;
                list.set(0, C110818d0.m150923U(list));
                List<Integer> list2 = this.f324821a;
                list2.remove(list2.size() - 1);
                int size = this.f324821a.size();
                int size2 = this.f324821a.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = this.f324821a.get(i).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = this.f324821a.get(i3).intValue();
                    if (i2 < size && (intValue = this.f324821a.get(i2).intValue()) > intValue4) {
                        if (intValue <= intValue3) {
                            break;
                        }
                        this.f324821a.set(i, Integer.valueOf(intValue));
                        this.f324821a.set(i2, Integer.valueOf(intValue3));
                        i = i2;
                    } else if (intValue4 <= intValue3) {
                        break;
                    } else {
                        this.f324821a.set(i, Integer.valueOf(intValue4));
                        this.f324821a.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                }
            }
            return intValue2;
        }
        C24715p.m31027c("Set is empty".toString());
        throw null;
    }
}
