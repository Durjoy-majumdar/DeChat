package p190l1;

import gy3.C87412m;
import java.util.Map;
import p410k0.C108793e;
import p631o1.C109857o;

/* renamed from: l1.k */
public class C109104k {

    /* renamed from: a */
    public final C108793e<C109103j> f326706a = new C108793e<>(new C109103j[16], 0);

    /* renamed from: a */
    public boolean mo160344a(Map<C109110r, C109111s> map, C109857o oVar, C109097g gVar, boolean z) {
        C87412m.m108594g(map, "changes");
        C87412m.m108594g(oVar, "parentCoordinates");
        C87412m.m108594g(gVar, "internalPointerEvent");
        C108793e<C109103j> eVar = this.f326706a;
        int i = eVar.f325786f;
        if (i <= 0) {
            return false;
        }
        T[] tArr = eVar.f325784d;
        int i2 = 0;
        boolean z2 = false;
        do {
            z2 = ((C109103j) tArr[i2]).mo160344a(map, oVar, gVar, z) || z2;
            i2++;
        } while (i2 < i);
        return z2;
    }

    /* renamed from: b */
    public void mo160345b(C109097g gVar) {
        C87412m.m108594g(gVar, "internalPointerEvent");
        int i = this.f326706a.f325786f;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((C109103j) this.f326706a.f325784d[i]).f326699c.mo159867i()) {
                this.f326706a.mo159871m(i);
            }
        }
    }

    /* renamed from: c */
    public final void mo160350c() {
        int i = 0;
        while (true) {
            C108793e<C109103j> eVar = this.f326706a;
            if (i < eVar.f325786f) {
                C109103j jVar = (C109103j) eVar.f325784d[i];
                if (!jVar.f326698b.f326748e) {
                    eVar.mo159871m(i);
                    jVar.mo160346d();
                } else {
                    i++;
                    jVar.mo160350c();
                }
            } else {
                return;
            }
        }
    }
}
