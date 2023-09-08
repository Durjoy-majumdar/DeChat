package cm1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import kj2.C117407d;
import ot1.C11767a;
import p749xh.C66261f3;
import te3.C49712hj1;
import up1.C37521f;
import vq1.C65866w;
import wp1.C15587j;

/* renamed from: cm1.q0 */
public final class C0768q0 {

    /* renamed from: a */
    public static final C0768q0 f1810a = new C0768q0();

    /* renamed from: a */
    public final void mo710a(C49712hj1 hj12, int i, FinderItem finderItem, boolean z, boolean z2, int i2, boolean z3, boolean z4, boolean z5) {
        int i3 = i;
        C87412m.m108594g(hj12, "contextObj");
        C87412m.m108594g(finderItem, C66261f3.COL_FINDEROBJECT);
        if (!C11767a.f34453a.mo11659a("like")) {
            C117407d.INSTANCE.idkeyStat(1278, z ? 0 : 1, 1, false);
            int i4 = 0;
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Tx0(hj12, finderItem.getId(), (z2 || z4) ? 6 : 1, z ? 2 : 1, i, "", i2, z3, z5, (z5 || z2 || z4 || C15587j.f42215a.mo14351c(finderItem.getFeedObject().objectType) == null) ? 0 : 1);
            C37521f.f99374d.getClass();
            boolean z6 = C37521f.f99244N7.mo60266n().intValue() != 0;
            if (i3 != 1) {
                if (i3 == 2) {
                    i4 = 1;
                }
            }
            int i5 = (i3 != 1 || !z6) ? i4 : 2;
            C65866w.C14968a aVar = C65866w.f189406g;
            C65866w.m77594c(C65866w.f189407h, finderItem, z, z2, i2, i5, (C65866w.C14969b) null, hj12, 32, (Object) null);
        }
    }
}
