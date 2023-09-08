package mo1;

import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: mo1.e1 */
public final class C10994e1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32704d;

    public C10994e1(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32704d = finderProfileHeaderUIC;
    }

    public final void run() {
        try {
            FinderProfileUiStyleUIC finderProfileUiStyleUIC = (FinderProfileUiStyleUIC) C39818r.f106831a.mo62444c(this.f32704d.getActivity()).mo75002a(FinderProfileUiStyleUIC.class);
            String str = this.f32704d.f16213S0;
            finderProfileUiStyleUIC.getClass();
            C87412m.m108594g(str, "username");
            finderProfileUiStyleUIC.mo3860d3(str, false);
        } catch (Exception e) {
            Log.printErrStackTrace("Finder.FinderProfileHeaderUIC", e, "", new Object[0]);
        }
    }
}
