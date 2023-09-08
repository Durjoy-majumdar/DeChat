package kx1;

import cx1.C45221c;
import cx1.C45223e;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import rx3.C13604l;

/* renamed from: kx1.c */
public final class C46791c {

    /* renamed from: a */
    public static final C46791c f125914a = new C46791c();

    /* renamed from: a */
    public final List<C45221c> mo72013a(List<C45221c> list) {
        C87412m.m108594g(list, "list");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (C45221c cVar : list) {
            String str = cVar.f122549b.f122556b;
            if (!(str == null || str.length() == 0)) {
                int i5 = cVar.f122551d;
                if (i5 == 1) {
                    i++;
                    i5 = i;
                } else if (i5 == 101) {
                    i5 = i2 + 101;
                    i2++;
                } else if (i5 == 201) {
                    i5 = i3 + 201;
                    i3++;
                } else if (i5 == 701) {
                    i5 = i4 + 701;
                    i4++;
                }
                C13604l<Boolean, String> lVar = cVar.f122548a;
                C45223e eVar = cVar.f122549b;
                boolean z = cVar.f122550c;
                C87412m.m108594g(lVar, "topTip");
                C87412m.m108594g(eVar, "user");
                arrayList.add(new C45221c(lVar, eVar, z, i5));
            }
        }
        return arrayList;
    }
}
