package gr1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C49704hh0;

/* renamed from: gr1.s0 */
public final class C45950s0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C45950s0 f123958d = new C45950s0();

    public C45950s0() {
        super(0);
    }

    public Object invoke() {
        C45946r0 r0Var = C45946r0.f123945a;
        if (C45946r0.f123952h == null) {
            Log.m105924i("Finder.FinderNetworkStatusStatistic", "cacheStatusToFile for generateClientStatus.");
            C45946r0.f123952h = r0Var.mo71349c();
        }
        try {
            C49704hh0 hh02 = C45946r0.f123952h;
            if (hh02 != null) {
                byte[] byteArray = hh02.toByteArray();
                C86009m1 m1Var = new C86009m1(C58784w3.f168295a.mo83907W(10));
                if (!m1Var.mo119977o()) {
                    m1Var.mo119966f();
                }
                if (!m1Var.mo119967g()) {
                    m1Var.mo119987x();
                }
                String str = m1Var.mo119971i() + "/Finder.FinderNetworkStatusStatistic.ext";
                C86013q1.m106437S(str, byteArray);
                Log.m105924i("Finder.FinderNetworkStatusStatistic", "cacheStatusToFile " + Integer.valueOf(byteArray.length) + ' ' + str + "  netType:" + hh02.f134634d + " bandwidthKbps:" + hh02.f134636f + " lastVideosDownloadInfo:" + hh02.f134637g.size() + " last_preload_download_info:" + hh02.f134649v.size() + " recent_finder_download_speed:" + hh02.f134647t.size() + " recent_wechat_download_speed:" + hh02.f134648u.size());
            }
        } catch (Exception e) {
            Log.printErrStackTrace("Finder.FinderNetworkStatusStatistic", e, "cacheStatusToFile Exception ", new Object[0]);
        }
        return C13598b0.f38549a;
    }
}
