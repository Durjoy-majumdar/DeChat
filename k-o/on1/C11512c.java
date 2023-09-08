package on1;

import cm1.C0740i2;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;

/* renamed from: on1.c */
public class C11512c<T extends C0740i2> {
    /* renamed from: a */
    public void mo11474a(List<T> list, List<? extends T> list2) {
        C87412m.m108594g(list, "dataList");
        C87412m.m108594g(list2, "increment");
        if (!list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                C0740i2 i2Var = (C0740i2) it.next();
                Iterator<T> it4 = list.iterator();
                int i = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((C0740i2) it4.next()).mo76f(i2Var) == 0) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    C87412m.m108594g(i2Var, "incrementItem");
                    list.set(i, i2Var);
                } else {
                    list.add(i2Var);
                }
            }
        }
    }
}
