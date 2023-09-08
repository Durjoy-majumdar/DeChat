package com.tencent.p014mm.plugin.appbrand.report;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppTradeCommentReportStruct;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82260t;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p206nj.C117627q;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.report.s */
public class C84240s {
    /* renamed from: a */
    public static void m103835a(String str, int i, int i2, long j, boolean z) {
        String b = C84116i0.m103659b(MMApplicationContext.getContext());
        if (Util.isNullOrNil(b)) {
            b = "unknown";
        }
        int e = m103839e(str);
        long nowSecond = Util.nowSecond();
        Log.m105919d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, sceneNote %s, sessionId %s, appid %s, appversion %d, appState %d, usedState %d, pagePath %s, networkType %s, eventId %d,eventRusult %d, eventPercent %d, installCostTime %s, eventTime %s, useModule %b, appType %s", 13537, 1000, "", "", str, 0, 0, 0, "", b, Integer.valueOf(i), Integer.valueOf(i2), 0, Long.valueOf(j), Long.valueOf(nowSecond), Boolean.valueOf(z), Integer.valueOf(e));
        C115669n.INSTANCE.mo160131h(13537, 1000, "", "", str, 0, 0, 0, "", b, Integer.valueOf(i), Integer.valueOf(i2), 0, Long.valueOf(j), Long.valueOf(nowSecond), Integer.valueOf(z ? 1 : 0), Integer.valueOf(e));
    }

    /* renamed from: b */
    public static void m103836b(String str, int i, int i2, List<IDKey> list) {
        LinkedList linkedList = new LinkedList();
        for (IDKey next : list) {
            linkedList.add(C90599h.m113515h(new String[]{str, String.valueOf(i), String.valueOf(1 + i2), String.valueOf(next.GetID()), String.valueOf(next.GetValue()), String.valueOf(next.GetValue())}, ","));
        }
        C115669n.INSTANCE.mo160137l(14369, linkedList);
    }

    /* renamed from: c */
    public static void m103837c(int i, String str, int i2, String str2, int i3, String str3, String str4) {
        Log.m105925i("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, appid %s, appversion %d, appidlist %snearbyAppIdCount %s, nearbyAppIdList %s  sceneNote %s", 13533, Integer.valueOf(i), Util.nullAsNil(str), Integer.valueOf(i2), str2, Integer.valueOf(i3), str3, str4);
        C115669n.INSTANCE.mo160131h(13533, Integer.valueOf(i), Util.nullAsNil(str), Integer.valueOf(i2), str2, Integer.valueOf(i3), str3, 0, str4);
    }

    /* renamed from: d */
    public static String m103838d(Context context) {
        return C84116i0.m103659b(context);
    }

    /* renamed from: e */
    public static int m103839e(String str) {
        int indexOf;
        if ("@LibraryAppId".equals(str)) {
            return 0;
        }
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf(36)) >= 0) {
            str = str.substring(0, indexOf);
        }
        int b = C84241t.m103848b(str);
        if (b < 0) {
            if (MMApplicationContext.isMMProcess()) {
                WxaAttributes mL = C81161g2.Cx0().mo114011mL(str, "appInfo");
                if (mL != null) {
                    b = mL.mo113940m2().f239488d;
                    C84241t.m103847a(str, b);
                } else {
                    Log.m105924i("MicroMsg.AppBrandReporterManager", "getServiceTypeForReport null = attrs!");
                }
            } else {
                AppBrandRuntimeWC b2 = C81682d.m100222b(str);
                AppBrandInitConfigWC M1 = b2 == null ? null : b2.mo113210l1();
                if (M1 != null) {
                    b = M1.f234841u;
                    C84241t.m103847a(str, b);
                } else {
                    Log.m105925i("MicroMsg.AppBrandReporterManager", "getServiceTypeForReport null = initConfig! appServiceType:%s", Integer.valueOf(b));
                }
            }
        }
        return b + 1000;
    }

    /* renamed from: f */
    public static void m103840f(String str, String str2, int i, String str3, long j, int i2, int i3) {
        String str4;
        String str5;
        String str6 = str2;
        String str7 = str3;
        AppBrandStatObject d = C81682d.m100224d(str);
        if (d == null) {
            Log.m105920e("MicroMsg.AppBrandReporterManager", "statObject is Null!");
            return;
        }
        String substring = (Util.isNullOrNil(str2) || !str6.contains(".html")) ? "" : str6.substring(0, str6.lastIndexOf(".html") + 5);
        try {
            str4 = C117627q.m165909b(Util.nullAsNil(substring), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.m105921e("MicroMsg.AppBrandReporterManager", "innerMenuClickReport, encode page path error!, appId = %s", str);
            Log.printErrStackTrace("MicroMsg.AppBrandReporterManager", e, "", new Object[0]);
            str4 = "";
        }
        AppBrandSysConfigWC e2 = C81682d.m100225e(str);
        int i4 = e2 == null ? 0 : e2.f261072r.pkgVersion;
        int i5 = e2 == null ? 0 : e2.f261072r.f238585d + 1;
        String nullAsNil = Util.nullAsNil(str3);
        if (i == 18) {
            if (!Util.isNullOrNil(str3) && str7.contains(".html")) {
                nullAsNil = str7.substring(0, str7.lastIndexOf(".html") + 5);
            }
            str5 = nullAsNil;
            try {
                nullAsNil = C117627q.m165909b(Util.nullAsNil(str5), "UTF-8");
            } catch (UnsupportedEncodingException e3) {
                Log.m105920e("MicroMsg.AppBrandReporterManager", "encode actionNote error!");
                Log.printErrStackTrace("MicroMsg.AppBrandReporterManager", e3, "", new Object[0]);
            }
        }
        str5 = nullAsNil;
        String nullAsNil2 = Util.nullAsNil(d.f245534g);
        String str8 = null;
        try {
            str8 = Util.nullAsNil(C81682d.m100222b(str).mo113210l1().f234837q);
        } catch (Exception e4) {
            Log.m105921e("MicroMsg.AppBrandReporterManager", "innerMenuClickReport, get runtime by %s, e = %s", str, e4);
        }
        if (d.f245533f == 0) {
            d.f245533f = 1000;
        }
        int i6 = d.f245531d;
        String str9 = d.f245532e;
        int e5 = m103839e(str);
        Log.m105919d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, sceneNote : %s, sessionId : %s, appid : %s, appversion : %d, appState : %d, usedState : %d, pagePath : %s, action : %d, actionNote : %s,actionTime : %s, actionResult : %d, actionErrorcode : %d, preScene : %d, preSceneNote : %s, appType : %d", 13539, Integer.valueOf(d.f245533f), nullAsNil2, str8, str, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(d.f245535h), substring, Integer.valueOf(i), str5, Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i6), str9, Integer.valueOf(e5));
        C115669n.INSTANCE.mo160131h(13539, Integer.valueOf(d.f245533f), nullAsNil2, str8, str, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(d.f245535h), str4, Integer.valueOf(i), str5, Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i6), str9, Integer.valueOf(e5));
    }

    /* renamed from: g */
    public static void m103841g(String str, String str2, int i) {
        String str3 = "";
        AppBrandStatObject d = C81682d.m100224d(str);
        if (d == null) {
            Log.m105920e("MicroMsg.AppBrandReporterManager", "statObject is Null!");
            return;
        }
        AppBrandSysConfigWC e = C81682d.m100225e(str);
        int i2 = e == null ? 0 : e.f261072r.f238585d + 1;
        int e2 = m103839e(str);
        String nullAsNil = Util.nullAsNil(d.f245534g);
        if (d.f245533f == 0) {
            d.f245533f = 1000;
        }
        long nowSecond = Util.nowSecond();
        try {
            str3 = C117627q.m165909b(Util.nullAsNil(str2), "UTF-8");
        } catch (UnsupportedEncodingException e3) {
            Log.m105921e("MicroMsg.AppBrandReporterManager", "reportBackHome, encode page path error!, appId = %s", str);
            Log.printErrStackTrace("MicroMsg.AppBrandReporterManager", e3, str3, new Object[0]);
        }
        Log.m105919d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, sceneNote : %s, appid : %s, appState : %d, pagePath : %s, actionTime : %s,  appType : %d", 18189, Integer.valueOf(d.f245533f), nullAsNil, str, Integer.valueOf(i2), str2, Long.valueOf(nowSecond), Integer.valueOf(e2));
        C115669n.INSTANCE.mo160131h(18189, str, Integer.valueOf(i2), Integer.valueOf(e2), Long.valueOf(nowSecond), Integer.valueOf(d.f245533f), nullAsNil, str3, Integer.valueOf(i));
    }

    /* renamed from: h */
    public static void m103842h(int i, String str) {
        Class cls = C68585h1.class;
        List<LocalUsageInfo> pM = ((C68585h1) C86312j.m106911c(cls)).mo94245pM(Integer.MAX_VALUE, C68585h1.C68586a.DESC);
        StringBuilder sb = new StringBuilder();
        if (pM == null) {
            pM = Collections.emptyList();
        }
        List<LocalUsageInfo> subList = pM.subList(0, Math.min(20, pM.size()));
        for (int i2 = 0; i2 < subList.size(); i2++) {
            sb.append(subList.get(i2).f239041e);
            if (i2 != subList.size() - 1) {
                sb.append("#");
            }
        }
        Log.m105924i("MicroMsg.AppBrandReporterManager", "[reportEnterMyWxaList] scene=" + i);
        Log.m105924i("MicroMsg.AppBrandReporterManager", "[reportEnterMyWxaList] appIdStr=" + sb);
        Log.m105924i("MicroMsg.AppBrandReporterManager", "[reportEnterMyWxaList] sceneNote=" + str);
        C115669n.INSTANCE.mo160131h(13800, Integer.valueOf(i), Integer.valueOf(((C68585h1) C86312j.m106911c(cls)).getCount()), sb.toString(), Long.valueOf(System.currentTimeMillis()), str);
    }

    /* renamed from: i */
    public static void m103843i(String str, int i, int i2, int i3, int i4, int i5) {
        m103844j(str, i, i2, (long) i3, (long) i4, (long) i5);
    }

    /* renamed from: j */
    public static void m103844j(String str, int i, int i2, long j, long j2, long j3) {
        C55548a.f158170a.mo77078b(14369, str, Integer.valueOf(i), Integer.valueOf(i2 + 1), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
    }

    /* renamed from: k */
    public static void m103845k(String str, int i, int i2) {
        WeAppTradeCommentReportStruct weAppTradeCommentReportStruct = new WeAppTradeCommentReportStruct();
        weAppTradeCommentReportStruct.f237373g = weAppTradeCommentReportStruct.mo86045b("AppId", str, true);
        weAppTradeCommentReportStruct.f237370d = i;
        weAppTradeCommentReportStruct.f237371e = i2;
        weAppTradeCommentReportStruct.f237372f = 1;
        weAppTradeCommentReportStruct.mo86054n();
    }

    /* renamed from: l */
    public static void m103846l(String str, int i, int i2) {
        int i3;
        int i4;
        int i5;
        String str2;
        int i6;
        String str3 = str;
        if (!"@LibraryAppId".equals(str3)) {
            int i7 = 1000;
            if (!Util.isNullOrNil(str)) {
                AppBrandStatObject d = C81682d.m100224d(str);
                if (d != null) {
                    int i8 = d.f245533f;
                    if (i8 != 0) {
                        i7 = i8;
                    }
                    str2 = Util.nullAsNil(d.f245534g);
                    i6 = d.f245535h;
                } else {
                    str2 = "";
                    i6 = 0;
                }
                AppBrandSysConfigWC e = C81682d.m100225e(str);
                i4 = (e == null || e.f261072r == null) ? 0 : e.f261072r.pkgVersion;
                i5 = (i2 != 0 || e == null || e.f261072r == null) ? i2 : e.f261072r.f238585d + 1;
                i3 = m103839e(str);
            } else {
                i5 = i2;
                str2 = "";
                i6 = 0;
                i4 = 0;
                i3 = 1000;
            }
            Log.m105919d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %s, sceneNote %s, appId %s, appVersion %s, appState %s, usedState %s, pagetype %s, targetAction %s, appType %s", 13541, Integer.valueOf(i7), str2, str3, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i), 3, Integer.valueOf(i3));
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(13541, Integer.valueOf(i7), str2, str3, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i), 3, "", Integer.valueOf(i3));
            if ("wxb6d22f922f37b35a".equals(str3) && i5 <= 1) {
                nVar.mo175911u(C82260t.CTRL_INDEX, i);
            }
        }
    }
}
