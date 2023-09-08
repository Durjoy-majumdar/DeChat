package rp3;

import java.util.Comparator;

/* renamed from: rp3.l */
public class C110615l implements Comparator<Object> {
    public C110615l(C110616m mVar) {
    }

    public int compare(Object obj, Object obj2) {
        int i = ((C110619p) obj).f330962b;
        int i2 = ((C110619p) obj2).f330962b;
        if (i2 < i) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }
}
