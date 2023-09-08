package com.tencent.p014mm.plugin.appbrand;

import android.system.ErrnoException;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81228b0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81244g0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81272j0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81396z3;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81429q;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83158e0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83167j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import ji0.C87966b;
import vq0.C90861d;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandPruner$$a */
public final /* synthetic */ class AppBrandPruner$$a implements Runnable {
    public final void run() {
        if (C86709a0.m107523b().f251765p) {
            try {
                long j = AppBrandGlobalSystemConfig.m100099b().f239288K.f239337d;
                C85801v1 i = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_APP_BRAND_PRUNE_PKG_NEXT_TIME_SEC_LONG;
                long longValue = ((Long) i.mo119685f(aVar, 0L)).longValue();
                long nowSecond = Util.nowSecond();
                if (nowSecond >= longValue) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(nowSecond + j));
                    C81244g0.f238642a.run();
                    C81272j0.m99630b();
                    C81228b0.f238600a.run();
                    ((C81396z3) C86312j.m106911c(C81396z3.class)).iq0();
                    C83158e0.m102050c();
                    C83167j0.m102064b();
                    C87966b bVar = (C87966b) C81161g2.Bx0(C87966b.class);
                    if (bVar != null) {
                        bVar.mo122422Lo();
                    }
                    C90861d.m113947b();
                    C81429q.m99908a();
                    return;
                }
                long j2 = nowSecond + j;
                if (j2 < longValue) {
                    Log.m105921e("MicroMsg.AppBrandPruner", "AccountScopedRunnable.run() invalid freq control mark, next:%d, now:%d, interval:%d", Long.valueOf(longValue), Long.valueOf(nowSecond), Long.valueOf(j));
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(j2));
                }
            } catch (Exception e) {
                if (e instanceof ErrnoException) {
                    Log.m105921e("MicroMsg.AppBrandPruner", "runNow() get ErrnoException:%s", e);
                    return;
                }
                throw e;
            }
        }
    }
}
