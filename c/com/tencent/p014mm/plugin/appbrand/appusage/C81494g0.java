package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.plugin.appbrand.appusage.C81478e0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81481f0;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.g0 */
public class C81494g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f239094d;

    /* renamed from: e */
    public final /* synthetic */ C81481f0.C81483b f239095e;

    public C81494g0(C81481f0.C81483b bVar, String str) {
        this.f239095e = bVar;
        this.f239094d = str;
    }

    public void run() {
        Map<String, String> parseXml;
        C81478e0.C81479a aVar = C81478e0.C81479a.FORCE_OFF;
        C81481f0.C81483b bVar = this.f239095e;
        String str = this.f239094d;
        bVar.getClass();
        boolean a = C86709a0.m107522a();
        Log.m105925i("MicroMsg.AppBrandPushNewOrRedDotLogic", "parseThenProcess, accReady %b, received xml %s", Boolean.valueOf(a), str);
        if (a && (parseXml = XmlParser.parseXml(str, "sysmsg", (String) null)) != null && parseXml.size() > 0) {
            String str2 = parseXml.get(".sysmsg.wxareddot.id");
            int i = Util.getInt(parseXml.get(".sysmsg.wxareddot.activitytype"), 0);
            if (Util.isNullOrNil(str2)) {
                return;
            }
            if (i == 1 || i == 2) {
                int i2 = Util.getInt(parseXml.get(".sysmsg.wxareddot.close"), 0);
                long j = Util.getLong(parseXml.get(".sysmsg.wxareddot.pushtime"), 0);
                long j2 = Util.getLong(parseXml.get(".sysmsg.wxareddot.duration"), 0);
                long j3 = Util.getLong(parseXml.get(".sysmsg.wxareddot.frequency"), 0);
                String str3 = parseXml.get(".sysmsg.wxareddot.tips");
                boolean z = false;
                int i3 = Util.getInt(parseXml.get(".sysmsg.wxareddot.showType"), 0);
                int i4 = Util.getInt(parseXml.get(".sysmsg.wxareddot.reason"), 0);
                if (i == 1) {
                    C85801v1 i5 = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING;
                    if (!str2.equals((String) i5.mo119685f(aVar2, (Object) null)) && !C81508l.m100002d() && !Util.getTopActivityName(MMApplicationContext.getContext()).equals(AppBrandLauncherUI.class.getName())) {
                        Set<Object> set = C81478e0.f239071d;
                        if ((!C86709a0.m107522a() ? aVar : C81478e0.C81479a.FORCE_ON) != aVar) {
                            C86709a0.m107535s().mo121142i().mo119677K(aVar2, str2);
                            C85801v1 i6 = C86709a0.m107535s().mo121142i();
                            C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG;
                            i6.mo119677K(aVar3, Long.valueOf(j));
                            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_SHOWTYPE_INT, Integer.valueOf(i3));
                            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_REASON_INT, Integer.valueOf(i4));
                            int i7 = 1;
                            if (i2 == 1) {
                                if (C81481f0.m99955a()) {
                                    C81481f0.C81486e eVar = C81481f0.C81486e.f239082a;
                                    eVar.mo113785b((String) C86709a0.m107535s().mo121142i().mo119685f(aVar2, ""), ((Long) C86709a0.m107535s().mo121142i().mo119685f(aVar3, 0L)).longValue(), 4, eVar.mo113784a());
                                }
                                i7 = 1;
                            }
                            C81481f0.m99957c(i2 != i7, j2);
                        }
                    }
                } else if (i == 2 && !str2.equals((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_MSG_ID_STRING, (Object) null))) {
                    if (i2 != 1) {
                        z = true;
                    }
                    C81481f0.m99956b(z, j2, j3);
                }
            }
        }
    }
}
