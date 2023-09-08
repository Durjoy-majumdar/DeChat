package tm1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fm1.C8164o;
import te3.C64858yi1;

/* renamed from: tm1.a */
public final class C14045a {

    /* renamed from: a */
    public static final C14045a f39395a = new C14045a();

    /* renamed from: a */
    public final int mo13453a(int i, int i2) {
        Class cls = FinderCommonFeatureService.class;
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderLiveEntrance");
        if (!(G5 == null || G5.mo77308o2("FinderLiveEntrance") == null || G5.field_ctrInfo.f144670e != 16)) {
            C64858yi1 s = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77279s("NearbyLiveTab");
            i2 = s != null ? s.f186558s : 0;
        }
        if (i2 == 0) {
            i2 = C8164o.f27042a.mo9219c(i);
            Log.m105924i("FinderLiveSquareConfig", "getTargetLiveTabId use last cache targetTabId=" + i2 + " commentScene=" + i);
        }
        if (i2 != 0) {
            return i2;
        }
        Log.m105924i("FinderLiveSquareConfig", "getTargetLiveTabId use default targetTabId=88890");
        return 88890;
    }
}
