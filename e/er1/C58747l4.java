package er1;

import cj1.C54785k6;
import gy3.C87412m;
import java.util.Comparator;

/* renamed from: er1.l4 */
public final class C58747l4 implements Comparator<C54785k6> {
    public int compare(Object obj, Object obj2) {
        C54785k6 k6Var = (C54785k6) obj;
        C54785k6 k6Var2 = (C54785k6) obj2;
        C87412m.m108594g(k6Var, "o1");
        C87412m.m108594g(k6Var2, "o2");
        int i = k6Var.f153568c;
        int i2 = k6Var2.f153568c;
        if (i != i2) {
            return i2 - i;
        }
        long j = k6Var.f153567b;
        long j2 = k6Var2.f153567b;
        return j != j2 ? (int) (j2 - j) : k6Var.f153566a.compareTo(k6Var2.f153566a);
    }
}
