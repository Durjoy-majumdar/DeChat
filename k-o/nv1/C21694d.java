package nv1;

import java.util.Comparator;
import lv1.C99681n;

/* renamed from: nv1.d */
public class C21694d implements Comparator<C99681n> {

    /* renamed from: d */
    public static final C21694d f61404d = new C21694d();

    public int compare(Object obj, Object obj2) {
        int i;
        int i2;
        C99681n nVar = (C99681n) obj;
        C99681n nVar2 = (C99681n) obj2;
        int i3 = (nVar.f292152f > nVar2.f292152f ? 1 : (nVar.f292152f == nVar2.f292152f ? 0 : -1));
        if (i3 > 0) {
            return -1;
        }
        if (i3 >= 0 && (i = nVar.f292149c) >= (i2 = nVar2.f292149c)) {
            return i > i2 ? -1 : 0;
        }
        return 1;
    }
}
