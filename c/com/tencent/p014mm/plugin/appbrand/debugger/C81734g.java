package com.tencent.p014mm.plugin.appbrand.debugger;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29199d3;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di0.C86299o;
import di3.C86312j;
import java.io.IOException;
import java.util.Map;
import kr0.C76630x0;
import p170ic.C87688b;
import wi0.C90989n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.g */
public final class C81734g implements C29199d3.C29201d, DebuggerShell.C81694b {

    /* renamed from: a */
    public static String[] f239854a = {"Needjs", "Needmainjs", "Needwebviewjs"};

    /* renamed from: c */
    public static void m100283c(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = str3;
        try {
            str4 = WxaPkgWrappingInfo.m99521f(new C86009m1(str3));
        } catch (IOException unused) {
            str4 = "";
        }
        objArr[3] = str4;
        Log.m105925i("MicroMsg.AppBrand.ForceOpenAppNotify", "setWxAutoTestJsFilePath appId:%s, name:%s, path:%s, md5:%s", objArr);
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MicroMsg.AppBrand.ForceOpenAppNotify.TestInjectJsPath", 2);
        mmkv.putString(str + "-" + str2, str3).commit();
    }

    /* renamed from: d */
    public static String m100284d(String str, String str2) {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MicroMsg.AppBrand.ForceOpenAppNotify.TestInjectJsPath", 2);
        String string = mmkv.getString(str + "-" + str2, (String) null);
        if (!TextUtils.isEmpty(string) && C86013q1.m106450k(string)) {
            try {
                return C86013q1.m106432N(string);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.ForceOpenAppNotify", "readWxAutoTestJsIfFileExisted(appId:%s, name:%s) get exception:%s", str, str2, e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo56728a(Intent intent) {
        String stringExtra = intent.getStringExtra("appId");
        int intExtra = intent.getIntExtra("versionType", 0);
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245533f = 1030;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0((Context) null, (String) null, stringExtra, intExtra, 0, (String) null, appBrandStatObject);
    }

    /* renamed from: b */
    public void mo56511b(String str, Map<String, String> map) {
        Map<String, String> map2 = map;
        if (DebuggerShell.f239772d) {
            Log.m105925i("MicroMsg.AppBrand.ForceOpenAppNotify", "handleMessage %s", str);
            String str2 = map2.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppID");
            String str3 = map2.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.UserName");
            int i = Util.getInt(map2.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.VersionType"), -1);
            int i2 = Util.getInt(map2.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppVersion"), -1);
            String str4 = map2.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.Path");
            String str5 = map2.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.URL");
            String str6 = map2.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.MD5");
            String str7 = map2.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.ExtJsonInfo");
            if (i >= 0) {
                if (!TextUtils.isEmpty(str2)) {
                    int i3 = Util.getInt(map2.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.setEnableDebug"), -1);
                    if (i3 == 1) {
                        C90989n.m114156a(str2, true);
                    } else if (i3 == 0) {
                        MultiProcessMMKV multiProcessMMKV = C90989n.f261076a;
                        if (!multiProcessMMKV.contains(str2 + "_AppDebugEnabled")) {
                            C90989n.m114156a(str2, false);
                        }
                    }
                }
                if (i != 0) {
                    C81161g2.requireAccountInitializedOnDemand();
                    if (C81161g2.f238471g != null) {
                        if (!Util.isNullOrNil(str5) && !Util.isNullOrNil(str6)) {
                            C81161g2.requireAccountInitializedOnDemand();
                            if (C81161g2.f238471g.mo113526j(str2, i, str5, str6, Util.nowSecond(), Util.nowSecond() + 432000)) {
                                AppBrandProcessesManager.m103869I().mo111407t(str2, i);
                            }
                        } else if (i == 1) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                Log.m105925i("MicroMsg.AppBrand.ForceOpenAppNotify", "before start weapp username[%s], appId[%s], versionType[%d]", str3, str2, Integer.valueOf(i));
                g$$b g__b = new g$$b(this, i, str5, str6, str2, str7, new C86299o(), str3, str4, i2);
                String[] strArr = f239854a;
                C87688b bVar = new C87688b(g__b, 3);
                for (int i4 = 0; i4 < 3; i4++) {
                    String str8 = strArr[i4];
                    String str9 = map2.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo." + str8);
                    if (TextUtils.isEmpty(str9)) {
                        bVar.mo122118a();
                    } else {
                        g$$a g__a = new g$$a(bVar);
                        ((C119157j) C119157j.f356862d).mo183875f(new C81737h(str2, str8, str9, g__a));
                    }
                }
            }
        }
    }

    public String name() {
        return "ForceOpenAppNotify";
    }
}
