package t72;

import java.util.Comparator;
import t72.C118387c;

/* renamed from: t72.m */
public class C118400m implements Comparator<C118387c.C118389b> {
    public C118400m(C118391i iVar) {
    }

    public int compare(Object obj, Object obj2) {
        int i = (((long) (((C118387c.C118389b) obj).f353812b - ((C118387c.C118389b) obj2).f353812b)) > 0 ? 1 : (((long) (((C118387c.C118389b) obj).f353812b - ((C118387c.C118389b) obj2).f353812b)) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i == 0 ? 0 : -1;
    }
}
