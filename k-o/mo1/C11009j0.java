package mo1;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import dp1.C58363h;
import gy3.C87412m;
import zc1.C66785b;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: mo1.j0 */
public final class C11009j0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ FinderProfileHeaderUIC f32726a;

    public C11009j0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32726a = finderProfileHeaderUIC;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            C58363h hVar = C58363h.f167137a;
            C58363h.C58364b bVar = C58363h.f167143g;
            bVar.mo83123c(C66785b.f191882e.mo90662O5(), "", this.f32726a.f16213S0);
            C58363h.C58364b.m67609b(bVar, this.f32726a.getContextObj(), 3, (Long) null, 4, (Object) null);
            FrameLayout frameLayout = this.f32726a.mo3808J3().f42933n0;
            C87412m.m108593f(frameLayout, "profileHeaderUiBinding.sendMsgBtn");
            C23564m.m28138h(frameLayout, (C23555k.C23562d) null);
        }
    }
}
