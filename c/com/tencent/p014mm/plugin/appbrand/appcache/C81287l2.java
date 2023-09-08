package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.t45;
import te3.u45;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.l2 */
public class C81287l2 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ Runnable f238698d;

    public C81287l2(Runnable runnable) {
        this.f238698d = runnable;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(368, 40, 1, false);
        if (C86709a0.m107522a()) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_APP_BRAND_PUBLIC_LIB_UPDATE_NEXT_TIME_SEC_LONG, Long.valueOf(Util.nowSecond() + 86400));
        }
        if (i == 0 && i2 == 0) {
            nVar.mo175911u(1509, 1);
            try {
                C81285k2.m99658b(((t45) cVar.f127055a.f127080a).f141957d, (u45) cVar.f127056b.f127083a, k2$$b.CGI, this.f238698d);
            } catch (RuntimeException e) {
                Log.m105921e("MicroMsg.WxaCommLibVersionChecker", "onResp, e %s", e);
            }
            return 0;
        }
        Log.m105921e("MicroMsg.WxaCommLibVersionChecker", "onResp, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        nVar.mo175911u(1509, 2);
        Runnable runnable = this.f238698d;
        if (runnable != null) {
            runnable.run();
        }
        return 0;
    }
}
