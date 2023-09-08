package com.tencent.p014mm.plugin.appbrand.debugger;

import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.p014mm.plugin.appbrand.launching.C29567d1;
import com.tencent.p014mm.plugin.appbrand.launching.C29583l3;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import f62.C31924c1;
import java.util.List;
import java.util.Map;
import ob0.C35136m;
import p823sg.C77710q;
import wi0.C90982g0;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.q */
public class C81741q implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        String str2;
        Map<String, String> map2 = map;
        if (C86709a0.m107522a() && map2 != null) {
            String str3 = map2.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.AppID");
            String str4 = map2.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.UserName");
            String str5 = map2.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.Path");
            String str6 = map2.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.URL");
            String str7 = map2.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.MD5");
            String str8 = map2.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.ExtInfo");
            String str9 = map2.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.WsEndpoint");
            Log.m105925i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "onNewXmlReceived appId %s, userName %s, path %s, url %s, md5 %s, extInfo %s, wsEndpoint:%s", str3, str4, str5, str6, str7, str8, str9);
            Class cls = C29583l3.class;
            if (Util.isNullOrNil(str3) || Util.isNullOrNil(str4) || Util.isNullOrNil(str6)) {
                Log.m105925i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "appId = %s, username = %s, codeURL = %s, invalid, return", str3, str4, str6);
                return;
            }
            C81161g2.requireAccountInitializedOnDemand();
            String str10 = "MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener";
            if (C81161g2.f238471g.mo113526j(str3, 1, str6, str7, 0, Util.nowSecond() + 7200)) {
                AppBrandProcessesManager.m103869I().mo111407t(str3, 1);
            }
            LaunchParamsOptional launchParamsOptional = new LaunchParamsOptional();
            launchParamsOptional.f237920f = str8;
            launchParamsOptional.f237923i = str9;
            ((C29567d1) C81161g2.Bx0(C29567d1.class)).mo56814Lo(str3, 1, str8);
            if (!Util.isNullOrNil(str8)) {
                WxaAttributes.WxaVersionInfo a = C90982g0.m114149a(str8);
                List<WxaAttributes.WxaPluginCodeInfo> list = a.f239458j;
                List<WxaAttributes.WxaVersionModuleInfo> list2 = a.f239460o;
                if (list2 == null || list2.size() <= 0) {
                    String str11 = str10;
                    if (list != null && list.size() > 0) {
                        for (WxaAttributes.WxaPluginCodeInfo next : list) {
                            if (!Util.isNullOrNil(next.f239444n)) {
                                Log.m105925i(str11, "start: dev plugin provider:%s,versionDesc:%s,devUin:%d saveRet:%b", next.f239437d, next.f239444n, Integer.valueOf(new C77710q(next.f239443j).f226490d), Boolean.valueOf(((C29583l3) C81161g2.Bx0(cls)).mo56825qq(next.f239437d, next.f239444n, next.f239443j)));
                            }
                        }
                    }
                } else {
                    for (WxaAttributes.WxaVersionModuleInfo next2 : list2) {
                        List<WxaAttributes.WxaPluginCodeInfo> list3 = next2.f239477i;
                        if (list3 != null && list3.size() > 0) {
                            for (WxaAttributes.WxaPluginCodeInfo next3 : next2.f239477i) {
                                if (!Util.isNullOrNil(next3.f239444n)) {
                                    str2 = str10;
                                    Log.m105925i(str2, "start: module :%s dev plugin provider:%s,versionDesc:%s,devUin:%d saveRet:%b", next2.f239472d, next3.f239437d, next3.f239444n, Integer.valueOf(new C77710q(next3.f239443j).f226490d), Boolean.valueOf(((C29583l3) C81161g2.Bx0(cls)).mo56825qq(next3.f239437d, next3.f239444n, next3.f239443j)));
                                } else {
                                    str2 = str10;
                                }
                                str10 = str2;
                            }
                        }
                        str10 = str10;
                    }
                }
            }
            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
            appBrandStatObject.f245533f = 1101;
            appBrandStatObject.f245534g = str3 + XVFSFile.PATH_SEPARATOR + str4;
            AppBrandLaunchProxyUI.m102164N7(MMApplicationContext.getContext(), str4, (String) null, str5, 1, -1, appBrandStatObject, (AppBrandLaunchReferrer) null, launchParamsOptional);
        }
    }
}
