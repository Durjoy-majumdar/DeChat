package com.tencent.p014mm.plugin.appbrand.appcache;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C1684x0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import f40.C86718e;
import ob0.C47350c;
import ob0.C89144l0;
import te3.t45;
import te3.u45;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.k2$$a */
public final /* synthetic */ class k2$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f238690d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f238691e;

    public /* synthetic */ k2$$a(boolean z, Runnable runnable) {
        this.f238690d = z;
        this.f238691e = runnable;
    }

    public final void run() {
        int i;
        boolean z = this.f238690d;
        Runnable runnable = this.f238691e;
        if (z) {
            Log.m105924i("MicroMsg.WxaCommLibVersionChecker", "cgiCheckUpdate, force true");
            C81285k2.m99659c(false);
        }
        if (!C86709a0.m107522a() || C86718e.m107551r()) {
            Log.m105920e("MicroMsg.WxaCommLibVersionChecker", "check MMCore null, skip");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Long l = (Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_PUBLIC_LIB_UPDATE_NEXT_TIME_SEC_LONG, 0L);
        long nowSecond = Util.nowSecond();
        Log.m105925i("MicroMsg.WxaCommLibVersionChecker", "check, nextSec = %d, nowSec = %d", l, Long.valueOf(nowSecond));
        if (nowSecond >= l.longValue()) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            t45 t45 = new t45();
            C81161g2.requireAccountInitializedOnDemand();
            if (C81161g2.f238471g == null) {
                i = C81352s2.f238828a;
            } else {
                C81161g2.requireAccountInitializedOnDemand();
                C29315z2 x = C81161g2.f238471g.mo113516Kn("@LibraryAppId", 0, ProviderConstants.API_COLNAME_FEATURE_VERSION);
                i = x == null ? C81352s2.f238828a : x.field_version;
            }
            t45.f141957d = i;
            bVar.f127066a = t45;
            bVar.f127067b = new u45();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/getpubliclibinfo";
            bVar.f127069d = C1684x0.CTRL_INDEX;
            C115669n.INSTANCE.mo175911u(1509, 0);
            C89144l0.m111429e(bVar.mo72403a(), new C81287l2(runnable), true);
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
