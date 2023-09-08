package wo0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appusage.C29378l0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81488g;
import com.tencent.p014mm.plugin.appbrand.appusage.C81508l;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C24564k0;
import gy3.C87412m;
import hp3.C87581a;
import java.util.List;
import sx3.C64197v;
import te3.C90444vm2;
import xt0.C78983j;
import xt0.C78985l;

/* renamed from: wo0.e */
public class C91046e implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ boolean f261193a;

    /* renamed from: b */
    public final /* synthetic */ CgiLaunchWxaApp f261194b;

    public C91046e(CgiLaunchWxaApp cgiLaunchWxaApp, boolean z) {
        this.f261194b = cgiLaunchWxaApp;
        this.f261193a = z;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        CgiLaunchWxaApp cgiLaunchWxaApp = this.f261194b;
        if (1248 == ((C90444vm2) cgiLaunchWxaApp.f243440p.f127055a.f127080a).f259881e.f259733f) {
            String remove = CgiLaunchWxaApp.f243439w.remove(cgiLaunchWxaApp.mo115601r());
            if (!TextUtils.isEmpty(remove)) {
                String f = C81661j.m100181f(remove);
                boolean z = false;
                Log.m105925i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "onCgiBack cgiHash[%d] sessionId[%s], remove usage (%s, %s) for migrate", Integer.valueOf(this.f261194b.hashCode()), this.f261194b.f243441q, remove, f);
                C81161g2.requireAccountInitializedOnDemand();
                C81161g2.f238473i.mo56644bF(f, 0, 4);
                C7335d c = C86312j.m106911c(C81488g.class);
                C87412m.m108593f(c, "getService(AppBrandColle…torageExport::class.java)");
                ((C81488g) c).requireAccountInitialized();
                C81488g gVar = C81488g.f239086e;
                if (gVar != null) {
                    String r = this.f261194b.mo115601r();
                    C87412m.m108594g(remove, "sourceAppId");
                    C87412m.m108594g(r, "targetAppId");
                    String f2 = C81661j.m100181f(remove);
                    String f3 = C81661j.m100181f(r);
                    Log.m105924i("MicroMsg.AppBrandCollectionStorageExport[collection]", "replaceForMigrate, source(" + f2 + ' ' + remove + ") -> target(" + f3 + ' ' + r + ')');
                    if (!(f2 == null || f2.length() == 0)) {
                        if (!(f3 == null || f3.length() == 0)) {
                            C78985l lVar = C78983j.f231933a;
                            List<? extends LocalUsageInfo> pM = gVar.mo94245pM(lVar.f231936b, lVar.f231937c);
                            if (pM != null) {
                                int i = -1;
                                int i2 = -1;
                                int i3 = 0;
                                for (T next : pM) {
                                    int i4 = i3 + 1;
                                    if (i3 >= 0) {
                                        LocalUsageInfo localUsageInfo = (LocalUsageInfo) next;
                                        if (C87412m.m108589b(f2, localUsageInfo.f239040d) && C81289m.C81290a.m99664b(localUsageInfo.f239042f)) {
                                            i = i3;
                                        } else if (C87412m.m108589b(f3, localUsageInfo.f239040d) && C81289m.C81290a.m99664b(localUsageInfo.f239042f)) {
                                            i2 = i3;
                                        }
                                        if (i >= 0 && i2 >= 0) {
                                            break;
                                        }
                                        i3 = i4;
                                    } else {
                                        C64197v.m75542k();
                                        throw null;
                                    }
                                }
                                if (i >= 0) {
                                    if (i2 >= 0) {
                                        pM.remove(i);
                                    } else {
                                        C24564k0.m30738b(pM).set(i, new LocalUsageInfo(f3, r, 0, 0, "", "", "", true, 0, 0));
                                        z = true;
                                    }
                                    gVar.wx0(pM, (C81488g.C81490b) null, z);
                                }
                            }
                        }
                    }
                }
            }
        }
        C81161g2.requireAccountInitializedOnDemand();
        C29378l0 l0Var = C81161g2.f238473i;
        String f4 = C81661j.m100181f(this.f261194b.mo115601r());
        CgiLaunchWxaApp cgiLaunchWxaApp2 = this.f261194b;
        int i5 = ((C90444vm2) cgiLaunchWxaApp2.f243440p.f127055a.f127080a).f259881e.f259731d;
        boolean t = cgiLaunchWxaApp2.mo115603t();
        CgiLaunchWxaApp cgiLaunchWxaApp3 = this.f261194b;
        int i6 = ((C90444vm2) cgiLaunchWxaApp3.f243440p.f127055a.f127080a).f259881e.f259733f;
        String str = cgiLaunchWxaApp3.f243441q;
        boolean z2 = this.f261193a;
        if (l0Var.mo56645jo(f4, i5, 2, true, t, i6, 1, str)) {
            C81508l.m100003e(true, !z2, str);
        }
        return null;
    }
}
