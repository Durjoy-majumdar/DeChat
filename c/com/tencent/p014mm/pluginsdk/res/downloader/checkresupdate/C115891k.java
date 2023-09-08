package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.autogen.mmdata.rpt.ResouceDownloadIdKeyReportSyncStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.k */
public final class C115891k {

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.k$a */
    public enum C115892a {
        SUCC,
        FAIL,
        RETRY_SUCC,
        FILE_LATEST,
        FILE_EXPIRED
    }

    /* renamed from: a */
    public static void m163010a(long j, long j2) {
        if (j > 0 && 197 != j) {
            C115669n.INSTANCE.idkeyStat(j, j2, 1, false);
        }
        C115669n.INSTANCE.idkeyStat(197, j2, 1, false);
    }

    /* renamed from: b */
    public static void m163011b(int i, int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str2) {
        String str3 = str2;
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(11906, Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
        if (!Util.isNullOrNil(str2) && !str3.equals("0")) {
            nVar.mo160131h(11907, Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), str3);
        }
    }

    /* renamed from: c */
    public static void m163012c(int i, int i2, String str, int i3, C115892a aVar, boolean z, boolean z2, boolean z3, String str2) {
        m163011b(i, i2, str, i3, 1, z2 ^ true ? 1 : 0, aVar.ordinal(), z3 ^ true ? 1 : 0, 1, z ^ true ? 1 : 0, str2);
    }

    /* renamed from: d */
    public static void m163013d(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        m163011b(i, i2, "", i3, 2, z ^ true ? 1 : 0, 1, z3 ^ true ? 1 : 0, z2 ^ true ? 1 : 0, z4 ^ true ? 1 : 0, str);
    }

    /* renamed from: e */
    public static void m163014e(int i, int i2, int i3, int i4, int i5) {
        ResouceDownloadIdKeyReportSyncStruct resouceDownloadIdKeyReportSyncStruct = new ResouceDownloadIdKeyReportSyncStruct();
        resouceDownloadIdKeyReportSyncStruct.f343811g = resouceDownloadIdKeyReportSyncStruct.mo86045b("Network", NetStatusUtil.isConnected(MMApplicationContext.getContext()) ? NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? "wifi" : "4g" : "none", true);
        resouceDownloadIdKeyReportSyncStruct.f343808d = (long) i;
        resouceDownloadIdKeyReportSyncStruct.f343809e = (long) i2;
        resouceDownloadIdKeyReportSyncStruct.f343810f = (long) i3;
        resouceDownloadIdKeyReportSyncStruct.f343812h = (long) i4;
        resouceDownloadIdKeyReportSyncStruct.f343813i = (long) i5;
        resouceDownloadIdKeyReportSyncStruct.f343814j = 1;
        resouceDownloadIdKeyReportSyncStruct.mo86054n();
        Log.m105925i("MicroMsg.ConstantsCheckResUpdate", "kvStatDownload: %s, %s, %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i5));
    }
}
