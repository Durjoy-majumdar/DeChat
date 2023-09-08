package hi0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29299s1;
import com.tencent.p014mm.plugin.appbrand.appcache.C29301t1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81273j1;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.launching.C83396o0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gi0.C87192d;
import gi0.C87194e;
import hi0.C32920k;
import hp3.C87581a;
import java.util.concurrent.ConcurrentSkipListSet;
import ki0.C88153c;
import ki0.C88154d;
import lp3.C46888b;
import lp3.C88643g;
import nr3.C89059e;
import nr3.C89060f;

/* renamed from: hi0.q */
public class C87504q implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ C88153c f253503a;

    /* renamed from: b */
    public final /* synthetic */ C87502p f253504b;

    public C87504q(C87502p pVar, C88153c cVar) {
        this.f253504b = pVar;
        this.f253503a = cVar;
    }

    public Object call(Object obj) {
        WxaPkgWrappingInfo wxaPkgWrappingInfo;
        Void voidR = (Void) obj;
        Class cls = C88154d.class;
        Log.m105925i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "try record %s", this.f253503a);
        ((ConcurrentSkipListSet) this.f253504b.f253501f).add(this.f253503a.field_appId);
        C88153c cVar = this.f253503a;
        C81273j1 j1Var = new C81273j1(cVar.field_appId, cVar.field_packageKey, cVar.field_packageType);
        try {
            wxaPkgWrappingInfo = C83396o0.m102337b(j1Var.toString(), 0);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", e, "[Captured crash]", new Object[0]);
            wxaPkgWrappingInfo = null;
        }
        if (wxaPkgWrappingInfo == null || wxaPkgWrappingInfo.pkgVersion < this.f253503a.field_version) {
            C88153c cVar2 = this.f253503a;
            if (!cVar2.field_firstTimeTried) {
                cVar2.field_firstTimeTried = true;
                cVar2.field_lastRetryTime = Util.nowSecond();
                ((C88154d) C81161g2.Bx0(cls)).update(this.f253503a, new String[0]);
            } else if (cVar2.field_retryTimes <= 0) {
                Log.m105921e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "record(%s) retryTimes == 0, skip", j1Var.toString());
                ((C88154d) C81161g2.Bx0(cls)).delete(this.f253503a, new String[0]);
            } else if (cVar2.field_lastRetryTime + cVar2.field_retryInterval > Util.nowSecond()) {
                Log.m105921e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "exceed record(%s) retryInterval %d, skip", j1Var.toString(), Long.valueOf(this.f253503a.field_retryInterval));
            } else {
                C88153c cVar3 = this.f253503a;
                int i = cVar3.field_retriedCount + 1;
                if (i > cVar3.field_retryTimes) {
                    Log.m105921e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "exceed record(%s) retryTimes %d, skip", j1Var.toString(), Integer.valueOf(this.f253503a.field_retryTimes));
                    ((C88154d) C81161g2.Bx0(cls)).delete(this.f253503a, new String[0]);
                } else {
                    cVar3.field_retriedCount = i;
                    cVar3.field_lastRetryTime = Util.nowSecond();
                    ((C88154d) C81161g2.Bx0(cls)).update(this.f253503a, new String[0]);
                }
            }
            if (this.f253503a.field_type == 0) {
                C81161g2.requireAccountInitializedOnDemand();
                C81258h3 h3Var = C81161g2.f238471g;
                String j1Var2 = j1Var.toString();
                C88153c cVar4 = this.f253503a;
                h3Var.mo113527k(j1Var2, 0, cVar4.field_version, cVar4.field_pkgMd5, (String) null);
                C46888b b = C88643g.m110544b();
                b.mo72092b();
                C88153c cVar5 = this.f253503a;
                new C87194e(cVar5, new q$$a(this, cVar5, b)).mo121631c();
            } else {
                C29301t1 t1Var = (C29301t1) C81161g2.Bx0(C29301t1.class);
                C88153c cVar6 = this.f253503a;
                C29299s1 qq = t1Var.mo56578qq(cVar6.field_appId, cVar6.field_type, cVar6.field_version);
                if (qq != null) {
                    boolean f = C32920k.m39851f(qq, C32920k.C32921a.GET_CODE);
                    C88153c cVar7 = this.f253503a;
                    Log.m105925i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "record(%s %d %d) integrated, decryptResult %b", cVar7.field_appId, Integer.valueOf(cVar7.field_type), Integer.valueOf(this.f253503a.field_version), Boolean.valueOf(f));
                } else {
                    C88153c cVar8 = this.f253503a;
                    String str = cVar8.field_appId;
                    int i2 = cVar8.field_type;
                    int i3 = cVar8.field_version;
                    String str2 = cVar8.field_pkgMd5;
                    C29299s1 s1Var = new C29299s1();
                    s1Var.field_appId = str;
                    s1Var.field_type = i2;
                    s1Var.field_version = i3;
                    boolean z = t1Var.get(s1Var, new String[0]);
                    s1Var.field_pkgMd5 = str2;
                    if (z) {
                        t1Var.update(s1Var, new String[0]);
                    } else {
                        t1Var.insert(s1Var);
                    }
                    C46888b b2 = C88643g.m110544b();
                    b2.mo72092b();
                    C89059e b3 = C89060f.m111323b(this.f253503a);
                    b3.mo123419C(new C87192d());
                    b3.mo123420E(new C87505r(this, b2));
                }
            }
        } else {
            Log.m105925i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "available pkg(%s %d) >= record(%s %d), skip", j1Var.toString(), Integer.valueOf(wxaPkgWrappingInfo.pkgVersion), j1Var.toString(), Integer.valueOf(this.f253503a.field_version));
            ((C88154d) C81161g2.Bx0(cls)).delete(this.f253503a, new String[0]);
        }
        return null;
    }
}
