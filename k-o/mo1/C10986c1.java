package mo1;

import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: mo1.c1 */
public final class C10986c1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32689d;

    public C10986c1(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32689d = finderProfileHeaderUIC;
    }

    public final void run() {
        try {
            FinderProfileUiStyleUIC finderProfileUiStyleUIC = (FinderProfileUiStyleUIC) C39818r.f106831a.mo62444c(this.f32689d.getActivity()).mo75002a(FinderProfileUiStyleUIC.class);
            String str = this.f32689d.f16213S0;
            finderProfileUiStyleUIC.getClass();
            C87412m.m108594g(str, "username");
            finderProfileUiStyleUIC.mo3860d3(str, false);
        } catch (Exception e) {
            Log.printErrStackTrace("Finder.FinderProfileHeaderUIC", e, "", new Object[0]);
        }
    }
}
