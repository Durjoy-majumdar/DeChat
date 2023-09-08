package xm1;

import an1.C0096i;
import an1.C0100m;
import an1.C0101n;
import an1.C0102o;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import en1.C7766a;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import sx3.C110818d0;
import sx3.C26236u;
import te3.C48682a91;
import te3.C48972c91;
import te3.C49114d91;
import te3.C49712hj1;
import te3.C52231z81;
import wp1.C15585f;

/* renamed from: xm1.d0 */
public final class C15827d0 {

    /* renamed from: a */
    public static final C15827d0 f42635a = new C15827d0();

    /* renamed from: a */
    public final boolean mo14506a(List<C0740i2> list, C52231z81 z812, C7766a aVar, C49712hj1 hj12) {
        FinderItem finderItem;
        FinderItem finderItem2;
        C48972c91 c912;
        List<C0740i2> list2 = list;
        C52231z81 z813 = z812;
        C49712hj1 hj13 = hj12;
        C87412m.m108594g(list2, "targetList");
        C87412m.m108594g(z813, "card");
        C87412m.m108594g(aVar, "item");
        int i = z813.f145755e;
        if (i == 4) {
            FinderObject finderObject = z813.f145756f;
            if (!(finderObject == null || (finderItem = (FinderItem) C110818d0.m150916N(C15585f.f42211a.mo14343f(C26236u.m33719b(finderObject), C58784w3.f168295a.mo83887M1(0), hj13))) == null)) {
                list2.add(new C0100m(finderItem, aVar.mo84i(), z813.f145762o, true));
                return true;
            }
        } else if (i == 5) {
            C49114d91 d912 = z813.f145758h;
            if (d912 != null) {
                list2.add(new C0101n(d912, aVar.mo84i()));
                return true;
            }
        } else if (i == 6) {
            FinderObject finderObject2 = z813.f145756f;
            if (!(finderObject2 == null || (finderItem2 = (FinderItem) C110818d0.m150916N(C15585f.f42211a.mo14343f(C26236u.m33719b(finderObject2), C58784w3.f168295a.mo83887M1(0), hj13))) == null)) {
                C48682a91 i2 = aVar.mo84i();
                LinkedList<FinderObject> linkedList = z813.f145759i;
                C87412m.m108593f(linkedList, "card.relate_living");
                list2.add(new C0102o(finderItem2, i2, linkedList, z813.f145763p, z813.f145762o, false, 32, (C8480h) null));
                return true;
            }
        } else if (i == 7 && (c912 = z813.f145760j) != null) {
            list2.add(new C0096i(c912, aVar.mo84i()));
            return true;
        }
        return false;
    }
}
