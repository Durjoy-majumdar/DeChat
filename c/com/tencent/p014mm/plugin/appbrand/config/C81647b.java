package com.tencent.p014mm.plugin.appbrand.config;

import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82417d;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;

/* renamed from: com.tencent.mm.plugin.appbrand.config.b */
public class C81647b {

    /* renamed from: a */
    public static final String f239668a = WeChatHosts.domainString(C0966R.string.fme);

    /* renamed from: a */
    public static C82417d m100143a(AppBrandSysConfigLU appBrandSysConfigLU) {
        C82417d dVar = new C82417d();
        long j = (long) AppBrandGlobalSystemConfig.m100099b().f239306g;
        dVar.f241498e = j;
        if (j <= 0) {
            dVar.f241498e = 300;
        }
        long j2 = appBrandSysConfigLU.f234870P;
        dVar.f241497d = j2;
        if (j2 <= 0) {
            dVar.f241497d = 10;
        }
        long j3 = appBrandSysConfigLU.f234868M;
        dVar.f241499f = j3;
        if (j3 <= 0) {
            dVar.f241499f = 300;
        }
        long j4 = appBrandSysConfigLU.f234869N;
        dVar.f241500g = j4;
        if (j4 <= 0) {
            dVar.f241500g = 100;
        }
        long j5 = appBrandSysConfigLU.f234876S0.f239289L;
        dVar.f241501h = j5;
        if (j5 <= 0) {
            dVar.f241501h = 30;
        }
        long j6 = appBrandSysConfigLU.f234872Q0;
        dVar.f241502i = j6;
        if (j6 <= 0) {
            dVar.f241502i = 200;
        }
        return dVar;
    }
}
