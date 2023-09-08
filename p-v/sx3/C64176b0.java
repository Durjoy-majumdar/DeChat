package sx3;

import java.util.List;
import my3.C61594j;

/* renamed from: sx3.b0 */
public class C64176b0 extends C64175a0 {
    /* renamed from: y */
    public static final int m75517y(List list, int i) {
        if (new C61594j(0, C64197v.m75536e(list)).mo86532k(i)) {
            return C64197v.m75536e(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new C61594j(0, C64197v.m75536e(list)) + "].");
    }
}
