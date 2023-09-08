package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.widget.recent.C85028b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import java.util.concurrent.TimeUnit;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49335eu3;
import te3.C50509n82;
import te3.C50647o82;
import tr0.C90575a;
import wi0.C38158d;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.m0 */
public final class C81511m0 extends C89132b<C50647o82> {

    /* renamed from: i */
    public static final long f239110i = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.m0$a */
    public enum C81512a {
        DAILY,
        SEARCH
    }

    public C81511m0(C81512a aVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50509n82 n822 = new C50509n82();
        n822.f138478d = aVar.ordinal() + 1;
        bVar.f127066a = n822;
        bVar.f127067b = new C50647o82();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/getsearchshowoutwxaapp";
        bVar.f127069d = 1314;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: k */
    public static void m100004k(C81512a aVar) {
        if (C86709a0.m107523b().f251765p && !((C85028b) C86312j.m106911c(C85028b.class)).d80()) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                C85801v1 i = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_APP_BRAND_SEARCH_SHOW_OUT_DAILY_SYNC_LAST_TIME_SECOND_LONG;
                if (((Long) i.mo119685f(aVar2, 0L)).longValue() + TimeUnit.DAYS.toSeconds(1) <= Util.nowSecond()) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(Util.nowSecond()));
                } else {
                    return;
                }
            } else if (ordinal == 1) {
                if (Util.getLong(C81161g2.m99451h1().mo61553Lo("GetSearchShowOutWxaApp_lastCheck", "$$invalid"), 0) + Util.getLong(C81161g2.m99451h1().mo61553Lo("GetSearchShowOutWxaApp_interval", "$$invalid"), f239110i) <= Util.nowSecond()) {
                    C81161g2.m99451h1().mo61552B9("GetSearchShowOutWxaApp_lastCheck", String.valueOf(Util.nowSecond()));
                } else {
                    return;
                }
            }
            new C81511m0(aVar).mo9225i();
        }
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50647o82 o822 = (C50647o82) eu32;
        C38158d h1 = C81161g2.m99451h1();
        C81161g2.requireAccountInitializedOnDemand();
        C90575a aVar = C81161g2.f238478q;
        if (h1 == null || aVar == null) {
            Log.m105921e("MicroMsg.CgiGetSearchShowOutWxaApp", "storage NULL [ %s | %s ]", h1, aVar);
            return;
        }
        h1.mo61552B9("GetSearchShowOutWxaApp_interval", String.valueOf((i == 0 && i2 == 0 && o822 != null) ? (long) o822.f139028g : f239110i));
        if (i == 0 && i2 == 0 && o822 != null) {
            try {
                aVar.mo124710Lo("GetSearchShowOutWxaApp_resp", o822.toByteArray());
            } catch (Exception e) {
                Log.m105921e("MicroMsg.CgiGetSearchShowOutWxaApp", "save resp e %s", e);
            }
        }
    }
}
