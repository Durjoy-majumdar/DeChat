package lo2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Collections;
import jp2.C98952a;
import org.json.JSONObject;
import rq2.C63505q;
import vr2.C102238b;
import vr2.C102239c;
import vr2.C102240d;
import wr2.C102485d;
import wr2.C102489e;

/* renamed from: lo2.l */
public class C99552l {

    /* renamed from: a */
    public static ArrayList<Integer> f291829a;

    static {
        ArrayList<Integer> arrayList = new ArrayList<>();
        f291829a = arrayList;
        Collections.addAll(arrayList, new Integer[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 24});
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:47:0x00f2=Splitter:B:47:0x00f2, B:31:0x00b3=Splitter:B:31:0x00b3} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vr2.C102238b m129925a(java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "sourceInfo"
            java.lang.String r1 = "bizInfo"
            java.lang.String r2 = "wxad"
            java.lang.String r3 = "getAdCommonData"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            java.lang.String r6 = "AdConversionOnlineReportHelper"
            r7 = 0
            if (r5 == 0) goto L_0x0030
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = ": adReportParams is null"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r7
        L_0x0030:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x010a }
            r5.<init>(r9)     // Catch:{ all -> 0x010a }
            boolean r9 = r5.has(r1)     // Catch:{ all -> 0x010a }
            if (r9 == 0) goto L_0x00f2
            boolean r9 = r5.has(r0)     // Catch:{ all -> 0x010a }
            if (r9 != 0) goto L_0x0043
            goto L_0x00f2
        L_0x0043:
            java.lang.String r9 = r5.optString(r1)     // Catch:{ all -> 0x010a }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ all -> 0x010a }
            if (r1 == 0) goto L_0x0065
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
            r9.<init>()     // Catch:{ all -> 0x010a }
            r9.append(r8)     // Catch:{ all -> 0x010a }
            java.lang.String r0 = ": uxInfo is isNullOrNil"
            r9.append(r0)     // Catch:{ all -> 0x010a }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r7
        L_0x0065:
            java.lang.String r0 = r5.optString(r0)     // Catch:{ all -> 0x010a }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x010a }
            if (r1 == 0) goto L_0x0087
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
            r9.<init>()     // Catch:{ all -> 0x010a }
            r9.append(r8)     // Catch:{ all -> 0x010a }
            java.lang.String r0 = ": sourceInfo is isNullOrNil"
            r9.append(r0)     // Catch:{ all -> 0x010a }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r7
        L_0x0087:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x010a }
            r1.<init>(r0)     // Catch:{ all -> 0x010a }
            boolean r0 = r1.has(r2)     // Catch:{ all -> 0x010a }
            java.lang.String r5 = "xjad"
            if (r0 != 0) goto L_0x00b3
            boolean r0 = r1.has(r5)     // Catch:{ all -> 0x010a }
            if (r0 != 0) goto L_0x00b3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
            r9.<init>()     // Catch:{ all -> 0x010a }
            r9.append(r8)     // Catch:{ all -> 0x010a }
            java.lang.String r0 = ": sourceParams not has wxad or xjad"
            r9.append(r0)     // Catch:{ all -> 0x010a }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r7
        L_0x00b3:
            boolean r0 = r1.has(r2)     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x00be
            org.json.JSONObject r0 = r1.optJSONObject(r2)     // Catch:{ all -> 0x010a }
            goto L_0x00ca
        L_0x00be:
            boolean r0 = r1.has(r5)     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x00c9
            org.json.JSONObject r0 = r1.optJSONObject(r5)     // Catch:{ all -> 0x010a }
            goto L_0x00ca
        L_0x00c9:
            r0 = r7
        L_0x00ca:
            if (r0 != 0) goto L_0x00e4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
            r9.<init>()     // Catch:{ all -> 0x010a }
            r9.append(r8)     // Catch:{ all -> 0x010a }
            java.lang.String r0 = ": sourceJsonObj is null"
            r9.append(r0)     // Catch:{ all -> 0x010a }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r7
        L_0x00e4:
            vr2.b r2 = vr2.C102260r.m134876p(r9)     // Catch:{ all -> 0x010a }
            r2.f301043a = r9     // Catch:{ all -> 0x010a }
            r2.f301044b = r1     // Catch:{ all -> 0x010a }
            r2.f301045c = r0     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r2
        L_0x00f2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
            r9.<init>()     // Catch:{ all -> 0x010a }
            r9.append(r8)     // Catch:{ all -> 0x010a }
            java.lang.String r0 = ": adReportJsonParams not has bizInfo or sourceInfo"
            r9.append(r0)     // Catch:{ all -> 0x010a }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r7
        L_0x010a:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = ": exp is "
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.C99552l.m129925a(java.lang.String, java.lang.String):vr2.b");
    }

    /* renamed from: b */
    public static void m129926b(int i, String str) {
        C102489e a;
        SnsMethodCalculate.markStartTimeMs("reportAdDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            Log.m105924i("AdConversionOnlineReportHelper", "reportAdDownload: adReportParams is " + str);
            C102238b a2 = m129925a("reportAdDownload", str);
            if (a2 == null) {
                Log.m105924i("AdConversionOnlineReportHelper", "reportAdDownload: adCommonData is null");
                SnsMethodCalculate.markEndTimeMs("reportAdDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                return;
            }
            JSONObject jSONObject = a2.f301044b;
            JSONObject jSONObject2 = a2.f301045c;
            if (jSONObject != null) {
                if (jSONObject2 != null) {
                    if (jSONObject.has("xjad") && jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 1) {
                        C102240d.C102242b bVar = new C102240d.C102242b();
                        bVar.mo141803k(i);
                        bVar.mo141805m(a2.f301043a);
                        bVar.mo141806n(a2.f301046d);
                        bVar.mo141804l(a2.f301047e);
                        bVar.mo141807o(a2.f301048f);
                        bVar.mo141801i(4);
                        C63505q.m74843b(bVar.mo141793a());
                        if (i == 4001010 && (a = C102489e.m135289a(jSONObject2.optString("packageName"), 1, 1, "", a2.f301043a, "", (SnsInfo) null, false)) != null) {
                            C102485d.m135281i(a);
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("reportAdDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    return;
                }
            }
            Log.m105924i("AdConversionOnlineReportHelper", "reportAdDownload: sourceParams or sourceJsonObj is null");
            SnsMethodCalculate.markEndTimeMs("reportAdDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportAdDownload: exp is " + th);
        }
    }

    /* renamed from: c */
    public static void m129927c(C102239c cVar) {
        SnsMethodCalculate.markStartTimeMs("reportAppMarketDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            C102240d.C102242b bVar = new C102240d.C102242b();
            bVar.mo141803k(4001018);
            bVar.mo141805m(cVar.f301049a);
            bVar.mo141795c(cVar.f301052d);
            bVar.mo141806n(cVar.f301053e);
            bVar.mo141804l(cVar.f301054f);
            bVar.mo141807o(cVar.f301055g);
            bVar.mo141801i(1);
            C63505q.m74843b(bVar.mo141793a());
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportAppMarketDialogShow, exp is " + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportAppMarketDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    /* renamed from: d */
    public static void m129928d(C102239c cVar, int i) {
        SnsMethodCalculate.markStartTimeMs("reportAppMarketInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            C102240d.C102242b bVar = new C102240d.C102242b();
            bVar.mo141803k(4001017);
            bVar.mo141801i(i);
            bVar.mo141805m(cVar.f301049a);
            bVar.mo141795c(cVar.f301052d);
            bVar.mo141806n(cVar.f301053e);
            bVar.mo141804l(cVar.f301054f);
            bVar.mo141807o(cVar.f301055g);
            bVar.mo141798f(cVar.f301056h);
            if (i == 3) {
                bVar.mo141797e(cVar.f301050b);
                bVar.mo141802j(cVar.f301051c);
            }
            C63505q.m74843b(bVar.mo141793a());
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportAppMarketInstallComplete, exp is " + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportAppMarketInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    /* renamed from: e */
    public static void m129929e(C102239c cVar, int i) {
        SnsMethodCalculate.markStartTimeMs("reportAppMarketOpen", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            C102240d.C102242b bVar = new C102240d.C102242b();
            bVar.mo141803k(4001016);
            bVar.mo141801i(i);
            bVar.mo141805m(cVar.f301049a);
            bVar.mo141795c(cVar.f301052d);
            bVar.mo141806n(cVar.f301053e);
            bVar.mo141804l(cVar.f301054f);
            bVar.mo141807o(cVar.f301055g);
            if (i == 3) {
                bVar.mo141797e(cVar.f301050b);
                bVar.mo141802j(cVar.f301051c);
            }
            C63505q.m74843b(bVar.mo141793a());
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportAppMarketOpen, exp is " + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportAppMarketOpen", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    /* renamed from: f */
    public static void m129930f(C102239c cVar, int i) {
        SnsMethodCalculate.markStartTimeMs("reportAppMarketStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            C102240d.C102242b bVar = new C102240d.C102242b();
            bVar.mo141803k(4001014);
            bVar.mo141801i(i);
            bVar.mo141805m(cVar.f301049a);
            bVar.mo141795c(cVar.f301052d);
            bVar.mo141806n(cVar.f301053e);
            bVar.mo141804l(cVar.f301054f);
            bVar.mo141807o(cVar.f301055g);
            if (i == 3) {
                bVar.mo141797e(cVar.f301050b);
                bVar.mo141802j(cVar.f301051c);
            }
            C63505q.m74843b(bVar.mo141793a());
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportAppMarketStart, exp is " + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportAppMarketStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    /* renamed from: g */
    public static void m129931g(C102239c cVar) {
        SnsMethodCalculate.markStartTimeMs("reportDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            C102240d.C102242b bVar = new C102240d.C102242b();
            bVar.mo141803k(4001002);
            bVar.mo141805m(cVar.f301049a);
            bVar.mo141797e(cVar.f301050b);
            bVar.mo141802j(cVar.f301051c);
            bVar.mo141795c(cVar.f301052d);
            bVar.mo141806n(cVar.f301053e);
            bVar.mo141804l(cVar.f301054f);
            bVar.mo141807o(cVar.f301055g);
            bVar.mo141801i(4);
            bVar.mo141796d(cVar.f301058j);
            int i = cVar.f301059k;
            SnsMethodCalculate.markStartTimeMs("setDialogType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            bVar.f301100n = i;
            SnsMethodCalculate.markEndTimeMs("setDialogType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            C63505q.m74843b(bVar.mo141793a());
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportDialogConfirm, exp is " + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    /* renamed from: h */
    public static void m129932h(C102239c cVar) {
        SnsMethodCalculate.markStartTimeMs("reportDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            C102240d.C102242b bVar = new C102240d.C102242b();
            bVar.mo141803k(4001018);
            bVar.mo141805m(cVar.f301049a);
            bVar.mo141797e(cVar.f301050b);
            bVar.mo141802j(cVar.f301051c);
            bVar.mo141795c(cVar.f301052d);
            bVar.mo141806n(cVar.f301053e);
            bVar.mo141804l(cVar.f301054f);
            bVar.mo141807o(cVar.f301055g);
            bVar.mo141801i(4);
            bVar.mo141796d(cVar.f301058j);
            int i = cVar.f301059k;
            SnsMethodCalculate.markStartTimeMs("setDialogType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            bVar.f301100n = i;
            SnsMethodCalculate.markEndTimeMs("setDialogType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            C63505q.m74843b(bVar.mo141793a());
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportDialogShow, exp is " + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    /* renamed from: i */
    public static void m129933i(boolean z, SnsInfo snsInfo, int i) {
        C102240d.C102242b bVar;
        SnsMethodCalculate.markStartTimeMs("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        if (snsInfo == null) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, snsInfo is null");
            SnsMethodCalculate.markEndTimeMs("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        ADXml adXml = snsInfo.getAdXml();
        if (adXml == null) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, adXml is null");
            SnsMethodCalculate.markEndTimeMs("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        try {
            ADInfo adInfo = snsInfo.getAdInfo(i);
            if (z) {
                bVar = new C102240d.C102242b();
                bVar.mo141803k(4001019);
            } else {
                bVar = new C102240d.C102242b();
                bVar.mo141803k(4001020);
            }
            bVar.mo141805m(adInfo.uxInfo);
            bVar.mo141795c(adXml.adExtInfo);
            bVar.mo141806n(adInfo.aid);
            bVar.mo141804l(adInfo.traceid);
            bVar.mo141807o(adInfo.pId);
            C63505q.m74843b(bVar.mo141793a());
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, exp is " + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    /* renamed from: j */
    public static void m129934j(boolean z, String str) {
        SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationAppInstallStatus: adReportParams is " + str);
            C102238b a = m129925a("reportLaunchApplicationAppInstallStatus", str);
            if (a == null) {
                Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationAppInstallStatus: adCommonData is null");
                SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                return;
            }
            JSONObject jSONObject = a.f301044b;
            JSONObject jSONObject2 = a.f301045c;
            if (jSONObject != null) {
                if (jSONObject2 != null) {
                    C102240d.C102242b bVar = new C102240d.C102242b();
                    bVar.mo141805m(a.f301043a);
                    bVar.mo141806n(a.f301046d);
                    bVar.mo141804l(a.f301047e);
                    bVar.mo141807o(a.f301048f);
                    if (z) {
                        bVar.mo141803k(4001019);
                    } else {
                        bVar.mo141803k(4001020);
                    }
                    if (jSONObject.has("wxad")) {
                        if (jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 1) {
                            bVar.mo141799g(1);
                            bVar.mo141800h(1);
                            C63505q.m74843b(bVar.mo141793a());
                        }
                    } else if (jSONObject.has("xjad") && jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 1) {
                        bVar.mo141799g(3);
                        bVar.mo141800h(1);
                        C63505q.m74843b(bVar.mo141793a());
                    }
                    SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    return;
                }
            }
            Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationAppInstallStatus: sourceParams or sourceJsonObj is null");
            SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportLaunchApplicationAppInstallStatus: exp is " + th);
        }
    }

    /* renamed from: k */
    public static void m129935k(C98952a aVar, int i) {
        SnsMethodCalculate.markStartTimeMs("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        if (aVar == null) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportTimelineAdClick, params is null");
            SnsMethodCalculate.markEndTimeMs("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        SnsAdClick snsAdClick = aVar.f290057j;
        if (snsAdClick == null) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportTimelineAdClick, snsAdClick is null");
            SnsMethodCalculate.markEndTimeMs("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        try {
            if (f291829a.contains(Integer.valueOf(snsAdClick.f267472g))) {
                Log.m105924i("AdConversionOnlineReportHelper", "reportTimelineAdClick, except current click pos, the pos is " + snsAdClick.f267472g);
                SnsMethodCalculate.markEndTimeMs("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                return;
            }
            C102240d.C102242b bVar = new C102240d.C102242b();
            bVar.mo141803k(i);
            bVar.mo141805m(aVar.f290058k);
            bVar.mo141795c(aVar.f290059l);
            bVar.mo141806n(aVar.f290060m);
            bVar.mo141804l(aVar.f290061n);
            bVar.mo141807o(aVar.f290062o);
            C63505q.m74843b(bVar.mo141793a());
            SnsMethodCalculate.markEndTimeMs("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportTimelineAdClick, eventId is " + i + ", exp is " + th.toString());
        }
    }
}
