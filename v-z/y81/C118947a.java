package y81;

import java.util.Comparator;
import u81.C118605b;

/* renamed from: y81.a */
public class C118947a implements Comparator<C118605b> {
    public C118947a(C91381b bVar) {
    }

    public int compare(Object obj, Object obj2) {
        int i = ((C118605b) obj).f354923a;
        int i2 = ((C118605b) obj2).f354923a;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }
}
