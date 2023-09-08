package vo2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import di3.C86312j;
import h81.C32735h;

/* renamed from: vo2.d */
public class C65833d {

    /* renamed from: a */
    public static RecyclerViewDrawerSquares.C45117c f189314a;

    /* renamed from: b */
    public static boolean f189315b;

    /* renamed from: a */
    public static boolean m77546a() {
        try {
            return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_landingpage_halfscreen_anim_notify, 1) > 0;
        } catch (Throwable th) {
            Log.m105920e("AdHalfScreenLandingPageState", "isNotifyHalfScreenHeightChange, exp=" + th.toString());
            return true;
        }
    }

    /* renamed from: b */
    public static void m77547b(boolean z) {
        Log.m105924i("AdHalfScreenLandingPageState", "setHalfScreenLandingPageShowState:" + z);
        f189315b = z;
        if (!z) {
            m77548c((RecyclerViewDrawerSquares.C45117c) null);
        }
    }

    /* renamed from: c */
    public static void m77548c(RecyclerViewDrawerSquares.C45117c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("setHalfStateChangeListener:");
        sb.append(cVar == null ? "null" : Integer.valueOf(cVar.hashCode()));
        Log.m105924i("AdHalfScreenLandingPageState", sb.toString());
        f189314a = cVar;
    }
}
