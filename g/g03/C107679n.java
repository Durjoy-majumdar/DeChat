package g03;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sx3.C64197v;

/* renamed from: g03.n */
public final class C107679n {

    /* renamed from: a */
    public ArrayList<C107678m> f322149a;

    public C107679n(List<C107678m> list) {
        C87412m.m108594g(list, "trackList");
        ArrayList<C107678m> arrayList = new ArrayList<>();
        this.f322149a = arrayList;
        arrayList.addAll(list);
        if (!this.f322149a.isEmpty()) {
            long j = 0;
            int i = 0;
            for (T next : this.f322149a) {
                int i2 = i + 1;
                if (i >= 0) {
                    C107678m mVar = (C107678m) next;
                    mVar.f322142b = j;
                    j += (long) (((float) (mVar.f322145e - mVar.f322144d)) / mVar.f322146f);
                    mVar.f322143c = j;
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }
}
