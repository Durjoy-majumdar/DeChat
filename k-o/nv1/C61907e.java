package nv1;

import java.util.Comparator;
import lv1.C99681n;

/* renamed from: nv1.e */
public class C61907e implements Comparator<C99681n> {

    /* renamed from: d */
    public static final C61907e f176012d = new C61907e();

    public int compare(Object obj, Object obj2) {
        int i = (((C99681n) obj2).f292152f > ((C99681n) obj).f292152f ? 1 : (((C99681n) obj2).f292152f == ((C99681n) obj).f292152f ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }
}
