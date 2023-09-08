package nv1;

import java.util.Comparator;
import lv1.C99681n;

/* renamed from: nv1.c */
public class C100220c implements Comparator<C99681n> {

    /* renamed from: d */
    public static final C100220c f293646d = new C100220c();

    public int compare(Object obj, Object obj2) {
        C99681n nVar = (C99681n) obj;
        C99681n nVar2 = (C99681n) obj2;
        int i = nVar.f292149c - nVar2.f292149c;
        if (i != 0) {
            return i;
        }
        int i2 = nVar.f292156j - nVar2.f292156j;
        return i2 != 0 ? i2 : nVar.f292157k.compareTo(nVar2.f292157k);
    }
}
