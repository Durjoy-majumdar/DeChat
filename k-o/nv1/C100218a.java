package nv1;

import java.util.Comparator;
import kv1.C99249c;
import kv1.C99251g;
import lv1.C99681n;

/* renamed from: nv1.a */
public class C100218a implements Comparator<C99681n> {

    /* renamed from: d */
    public static final C100218a f293644d = new C100218a();

    public int compare(Object obj, Object obj2) {
        int b;
        C99681n nVar = (C99681n) obj;
        C99681n nVar2 = (C99681n) obj2;
        int i = nVar2.f292162p;
        int i2 = nVar.f292162p;
        int i3 = i - i2;
        if (i3 != 0) {
            return i3;
        }
        if (i >= 50 && i2 >= 50 && (b = C99251g.m129281b(C99249c.f291016n, nVar.f292149c, nVar2.f292149c)) != 0) {
            return b;
        }
        int i4 = nVar2.f292167u - nVar.f292167u;
        if (i4 != 0) {
            return i4;
        }
        int i5 = (nVar2.f292152f > nVar.f292152f ? 1 : (nVar2.f292152f == nVar.f292152f ? 0 : -1));
        if (i5 > 0) {
            return 1;
        }
        return i5 < 0 ? -1 : 0;
    }
}
