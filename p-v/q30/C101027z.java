package q30;

import k30.C99096a;
import te3.a94;

/* renamed from: q30.z */
public class C101027z implements C99096a.C99098b {
    public C101027z(C100991j0 j0Var) {
    }

    public Object getData() {
        a94 a94 = new a94();
        int i = a94.f130396h;
        int i2 = a94.f130395g;
        boolean z = true;
        boolean z2 = i == 4320 && (i2 & 4096) > 0;
        boolean z3 = i == 72 && (i2 & 4096) > 0;
        if (i != 720 || (i2 & 4096) <= 0) {
            z = false;
        }
        return z2 ? new int[]{0, 0, 1, 0} : z ? new int[]{0, 1, 0, 0} : z3 ? new int[]{1, 0, 0, 0} : new int[]{0, 0, 0, 1};
    }
}
