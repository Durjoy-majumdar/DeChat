package com.tencent.p014mm.game.report;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.tencent.p014mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import f40.C86709a0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import js0.C9512b;
import p763ym.C79138l;
import q20.C89449a;
import u10.C52415a;
import u10.C52416b;
import y10.C15928a;

/* renamed from: com.tencent.mm.game.report.b */
public class C40304b extends C52415a {

    @C89449a
    /* renamed from: com.tencent.mm.game.report.b$a */
    public static class C40305a implements C80883e<GameWebPerformanceInfo, Bundle> {
        private C40305a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C40304b.m43447f((GameWebPerformanceInfo) obj);
            if (gVar != null) {
                gVar.mo894a(null);
            }
        }
    }

    /* renamed from: f */
    public static void m43447f(GameWebPerformanceInfo gameWebPerformanceInfo) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        String str;
        GameWebPerformanceInfo gameWebPerformanceInfo2 = gameWebPerformanceInfo;
        Log.m105925i("MicroMsg.GameReportImpl", "reportWebPerformanceInMM, %s", gameWebPerformanceInfo.toString());
        long j8 = gameWebPerformanceInfo2.f108366s;
        long j9 = gameWebPerformanceInfo2.f108365r;
        long j15 = j8 - j9 > 0 ? j8 - j9 : 0;
        long j16 = gameWebPerformanceInfo2.f108367t - j9;
        long j17 = gameWebPerformanceInfo2.f108368u;
        int i = j17 > 0 ? 1 : 0;
        if (i == 1) {
            j2 = j17 - j9;
            j = j15;
            j3 = gameWebPerformanceInfo2.f108369v - j9;
        } else {
            j = j15;
            j3 = 0;
            j2 = 0;
        }
        int i2 = gameWebPerformanceInfo2.f108358h;
        int i3 = i;
        if (i2 == 1) {
            j5 = gameWebPerformanceInfo2.f108370w - j9;
            j4 = gameWebPerformanceInfo2.f108371x - j9;
        } else {
            j5 = 0;
            j4 = 0;
        }
        long j18 = gameWebPerformanceInfo2.f108372y - j9;
        long j19 = gameWebPerformanceInfo2.f108373z - j9;
        long j25 = gameWebPerformanceInfo2.f108339A - j9;
        long j26 = gameWebPerformanceInfo2.f108340B - j9;
        long j27 = gameWebPerformanceInfo2.f108341C;
        if (j27 != 0) {
            long j28 = j27 - j9;
            if (i2 == 0 && j28 < 0) {
                j28 = -1;
            }
            j6 = j28;
        } else {
            j6 = 0;
        }
        long j29 = gameWebPerformanceInfo2.f108342D - j9;
        long j35 = gameWebPerformanceInfo2.f108343E - j9;
        long j36 = 0;
        if (i2 == 0 && j35 <= 0) {
            j35 = -1;
        }
        long j37 = j35;
        long j38 = gameWebPerformanceInfo2.f108344F;
        int i4 = j38 > 0 ? 1 : 0;
        long j39 = j38 - j9;
        if (i4 == 0 || (i2 == 0 && j39 <= 0)) {
            j39 = -1;
        }
        long j44 = j39;
        if (gameWebPerformanceInfo2.f108360j == 0) {
            long j45 = gameWebPerformanceInfo2.f108345G - j9;
            j7 = j45 <= 0 ? -1 : j45;
            long j46 = gameWebPerformanceInfo2.f108346H - j9;
            if (j46 <= 0) {
                j46 = -1;
            }
            j36 = j46;
        } else {
            j7 = 0;
        }
        long j47 = gameWebPerformanceInfo2.f108348J - j9;
        long j48 = j5;
        Log.m105925i("MicroMsg.GameReportImpl", "url : %s, pkgId: %s, isLuggage : %d, isWePkg: %d, isPreloadWePkg: %d, isPreloadWebCore: %d, hasLoadFinished: %d, gameCenterUICreate: %d, startWebUI: %d,preloadWePkgBgn: %d, preloadWePkgEnd: %d, preloadWebCoreBgn: %d, preloadWebCoreEnd: %d,webUICreate: %d, webUIOnshowBgn: %d, createViewBgn: %d, createViewEnd: %d, jsbridgeInject: %d, loadUrlBgn: %d, onPageStarted: %d, onPageFinished: %d, getA8keyBgn: %d, getA8keyEnd: %d, webUIInfront: %d,webUIDestroy: %d", gameWebPerformanceInfo2.f108354d, gameWebPerformanceInfo2.f108364q, Integer.valueOf(gameWebPerformanceInfo2.f108356f), Integer.valueOf(gameWebPerformanceInfo2.f108357g), Integer.valueOf(i3), Integer.valueOf(gameWebPerformanceInfo2.f108358h), Integer.valueOf(i4), Long.valueOf(j), Long.valueOf(j16), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j18), Long.valueOf(j19), Long.valueOf(j25), Long.valueOf(j26), Long.valueOf(j6), Long.valueOf(j29), Long.valueOf(j37), Long.valueOf(j44), Long.valueOf(j7), Long.valueOf(j36), Long.valueOf(gameWebPerformanceInfo2.f108347I), Long.valueOf(j47));
        try {
            str = URLEncoder.encode(gameWebPerformanceInfo2.f108354d, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(16141, str, Integer.valueOf(gameWebPerformanceInfo2.f108356f), Integer.valueOf(gameWebPerformanceInfo2.f108357g), Integer.valueOf(i3), Integer.valueOf(gameWebPerformanceInfo2.f108358h), Long.valueOf(j), Long.valueOf(j16), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j48), Long.valueOf(j4), Long.valueOf(j18), Long.valueOf(j19), Long.valueOf(j25), Long.valueOf(j26), Long.valueOf(j6), Long.valueOf(j29), Long.valueOf(j37), Long.valueOf(j44), Long.valueOf(j7), Long.valueOf(j36), Long.valueOf(gameWebPerformanceInfo2.f108347I), Long.valueOf(j47), Integer.valueOf(i4), gameWebPerformanceInfo2.f108364q, Integer.valueOf(gameWebPerformanceInfo2.f108359i), gameWebPerformanceInfo2.f108355e, NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext()), Integer.valueOf(gameWebPerformanceInfo2.f108362o), Integer.valueOf(gameWebPerformanceInfo2.f108360j), Integer.valueOf(gameWebPerformanceInfo2.f108363p), gameWebPerformanceInfo2.f108351M, gameWebPerformanceInfo2.f108352N, gameWebPerformanceInfo2.f108353P);
        if (i4 == 1) {
            if (gameWebPerformanceInfo2.f108362o == 0) {
                nVar.mo175913w(949, 4, 1);
            }
            if (gameWebPerformanceInfo2.f108346H == -1) {
                nVar.mo175913w(949, 7, 1);
            }
        } else if (gameWebPerformanceInfo2.f108357g == 1) {
            nVar.mo175913w(949, 5, 1);
        } else {
            nVar.mo175913w(949, 6, 1);
        }
    }

    /* renamed from: b */
    public void mo62980b(int i, String str, String str2, long j) {
        Log.m105919d("MicroMsg.GameReportImpl", "reportGameCommEvent, opId:%d, params:%s, result:%s, costTime:%d", Integer.valueOf(i), str, str2, Long.valueOf(j));
        C115669n.INSTANCE.mo160131h(16171, 0, Integer.valueOf(i), str, str2, Long.valueOf(j));
    }

    /* renamed from: c */
    public void mo62981c(String str, int i, int i2, String str2, String str3) {
        if (C1253a.f10311d == null) {
            synchronized (C1253a.class) {
                if (C1253a.f10311d == null) {
                    C1253a.f10311d = new C1253a();
                }
            }
        }
        C1253a.f10311d.getClass();
        Log.m105925i("MicroMsg.GameMsgReportService", "appId = %s, opType = %d, opStatus = %d, extInfo = %s", str, Integer.valueOf(i), Integer.valueOf(i2), str3);
        C86709a0.m107524d().mo123460f(new C40310e(str, i, i2, str2, str3));
    }

    /* renamed from: d */
    public void mo62982d(Context context, String str, String str2, String str3, int i, int i2, int i3, String str4, long j, String str5, String str6, int i4) {
        String str7 = str;
        int i5 = 0;
        Log.m105919d("MicroMsg.GameReportImpl", "reportMsgClick 10531, appId = %s, pkgName = %s, msgSvrId:%d, snsOgjId:%s", str7, str2, Long.valueOf(j), str5);
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.GameReportImpl", "reportMsgClick fail, appId is null");
            return;
        }
        Context context2 = context == null ? MMApplicationContext.getContext() : context;
        C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(str, false);
        if (GW == null) {
            Log.m105920e("MicroMsg.GameReportImpl", "reportMsgClick fail, appinfo is null");
            return;
        }
        Object[] objArr = new Object[19];
        objArr[0] = str7;
        PackageInfo a = C9512b.m9207a(context2, str2);
        if (a != null) {
            i5 = a.versionCode;
        }
        objArr[1] = Integer.valueOf(i5);
        objArr[2] = C15928a.m14855b();
        objArr[3] = str3;
        objArr[4] = Integer.valueOf(i);
        objArr[5] = str4;
        objArr[6] = Integer.valueOf(i2);
        objArr[7] = Integer.valueOf(i3);
        objArr[8] = Integer.valueOf(C15928a.m14854a(context2));
        objArr[9] = Util.nullAsNil(GW.field_packageName);
        objArr[10] = Util.nullAsNil(GW.field_signature);
        objArr[11] = Long.toString(j);
        objArr[12] = "";
        objArr[13] = str5;
        objArr[14] = "";
        objArr[15] = Integer.valueOf(GW.mo69359k() ? 1 : 0);
        objArr[16] = str6;
        objArr[17] = "";
        objArr[18] = Integer.valueOf(i4);
        C52416b a2 = C52416b.m58673a(10531, objArr);
        Log.m105924i("MicroMsg.reportMsgClick", a2.f146498b);
        C40311f.m43479a(a2);
    }

    /* renamed from: e */
    public void mo62983e(GameWebPerformanceInfo gameWebPerformanceInfo) {
        if (gameWebPerformanceInfo == null || Util.isNullOrNil(gameWebPerformanceInfo.f108354d)) {
            Log.m105920e("MicroMsg.GameReportImpl", "info is null");
        } else if (MMApplicationContext.isMMProcess()) {
            m43447f(gameWebPerformanceInfo);
        } else {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, gameWebPerformanceInfo, C40305a.class, (C1256g) null);
        }
    }
}
