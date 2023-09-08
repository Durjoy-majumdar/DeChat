package p160gy;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import java.util.ArrayList;
import lo2.C99552l;
import org.json.JSONObject;
import p166hy.C46134x;
import rq2.C63505q;
import vr2.C102238b;
import vr2.C102240d;
import wr2.C102485d;
import wr2.C102489e;

@C86522b
/* renamed from: gy.c */
public class C98281c extends C86301e implements C46134x {
    /* renamed from: Ac */
    public void mo71580Ac(String str) {
        SnsMethodCalculate.markStartTimeMs("reportAddDownloadTaskStraightFail", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        C99552l.m129926b(4001006, str);
        SnsMethodCalculate.markEndTimeMs("reportAddDownloadTaskStraightFail", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }

    public void Fg0(String str) {
        SnsMethodCalculate.markStartTimeMs("reportAddDownloadTaskStraightComplete", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        C99552l.m129926b(4001009, str);
        SnsMethodCalculate.markEndTimeMs("reportAddDownloadTaskStraightComplete", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }

    /* renamed from: GV */
    public void mo71582GV(String str) {
        SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        ArrayList<Integer> arrayList = C99552l.f291829a;
        SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationConfirmDialogOk: adReportParams is " + str);
            C102238b a = C99552l.m129925a("reportLaunchApplicationConfirmDialogOk", str);
            if (a == null) {
                Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationConfirmDialogOk: adCommonData is null");
                SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            } else {
                JSONObject jSONObject = a.f301044b;
                JSONObject jSONObject2 = a.f301045c;
                if (jSONObject != null) {
                    if (jSONObject2 != null) {
                        C102240d.C102242b bVar = new C102240d.C102242b();
                        bVar.mo141805m(a.f301043a);
                        bVar.mo141806n(a.f301046d);
                        bVar.mo141804l(a.f301047e);
                        bVar.mo141807o(a.f301048f);
                        if (jSONObject.has("wxad")) {
                            if (jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 1) {
                                bVar.mo141803k(4002009);
                                bVar.mo141799g(1);
                                bVar.mo141800h(1);
                                C63505q.m74843b(bVar.mo141793a());
                            } else if (jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 4) {
                                bVar.mo141803k(4001002);
                                bVar.mo141801i(1);
                                C63505q.m74843b(bVar.mo141793a());
                            }
                        } else if (jSONObject.has("xjad") && jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 1) {
                            bVar.mo141803k(4002009);
                            bVar.mo141799g(3);
                            bVar.mo141800h(1);
                            C63505q.m74843b(bVar.mo141793a());
                        }
                        SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    }
                }
                Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationConfirmDialogOk: sourceParams or sourceJsonObj is null");
                SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            }
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportLaunchApplicationConfirmDialogOk: exp is " + th);
        }
        SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }

    public void H50(String str) {
        SnsMethodCalculate.markStartTimeMs("reportAddDownloadTaskStraightStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        C99552l.m129926b(4001001, str);
        SnsMethodCalculate.markEndTimeMs("reportAddDownloadTaskStraightStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }

    /* renamed from: PQ */
    public void mo71584PQ(String str) {
        SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationShowDialog", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        ArrayList<Integer> arrayList = C99552l.f291829a;
        SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationShowDialog", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationShowDialog: adReportParams is " + str);
            C102238b a = C99552l.m129925a("reportLaunchApplicationShowDialog", str);
            if (a == null) {
                Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationShowDialog: adCommonData is null");
                SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationShowDialog", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            } else {
                JSONObject jSONObject = a.f301044b;
                JSONObject jSONObject2 = a.f301045c;
                if (jSONObject != null) {
                    if (jSONObject2 != null) {
                        C102240d.C102242b bVar = new C102240d.C102242b();
                        bVar.mo141805m(a.f301043a);
                        bVar.mo141806n(a.f301046d);
                        bVar.mo141804l(a.f301047e);
                        bVar.mo141807o(a.f301048f);
                        if (jSONObject.has("wxad")) {
                            if (jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 1) {
                                bVar.mo141803k(4002007);
                                bVar.mo141799g(1);
                                bVar.mo141800h(1);
                                C63505q.m74843b(bVar.mo141793a());
                            } else if (jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 4) {
                                bVar.mo141803k(4001018);
                                bVar.mo141801i(1);
                                C63505q.m74843b(bVar.mo141793a());
                            }
                        } else if (jSONObject.has("xjad") && jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 1) {
                            bVar.mo141803k(4002007);
                            bVar.mo141799g(3);
                            bVar.mo141800h(1);
                            C63505q.m74843b(bVar.mo141793a());
                        }
                        SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationShowDialog", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    }
                }
                Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationShowDialog: sourceParams or sourceJsonObj is null");
                SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationShowDialog", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            }
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportLaunchApplicationShowDialog: exp is " + th);
        }
        SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationShowDialog", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }

    /* renamed from: fV */
    public void mo71585fV(String str) {
        SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationAppInstalled", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        C99552l.m129934j(true, str);
        SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationAppInstalled", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }

    public void g70(String str) {
        SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationAppNotInstalled", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        C99552l.m129934j(false, str);
        SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationAppNotInstalled", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }

    /* renamed from: pQ */
    public void mo71587pQ(String str) {
        SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationSuccess", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        ArrayList<Integer> arrayList = C99552l.f291829a;
        SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationSuccess", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationSuccess: adReportParams is " + str);
            C102238b a = C99552l.m129925a("reportLaunchApplicationSuccess", str);
            if (a == null) {
                Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationSuccess: adCommonData is null");
                SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationSuccess", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            } else {
                JSONObject jSONObject = a.f301044b;
                JSONObject jSONObject2 = a.f301045c;
                if (jSONObject != null) {
                    if (jSONObject2 != null) {
                        C102240d.C102242b bVar = new C102240d.C102242b();
                        bVar.mo141805m(a.f301043a);
                        bVar.mo141806n(a.f301046d);
                        bVar.mo141804l(a.f301047e);
                        bVar.mo141807o(a.f301048f);
                        if (jSONObject.has("wxad")) {
                            if (jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 1) {
                                bVar.mo141803k(4002011);
                                bVar.mo141799g(1);
                                bVar.mo141800h(1);
                                C63505q.m74843b(bVar.mo141793a());
                            } else if (jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 4) {
                                bVar.mo141803k(4001016);
                                bVar.mo141801i(1);
                                C63505q.m74843b(bVar.mo141793a());
                                C102489e a2 = C102489e.m135289a(jSONObject2.optString("packageName"), 1, 0, "", a.f301043a, "", (SnsInfo) null, false);
                                if (a2 != null) {
                                    C102485d.m135281i(a2);
                                }
                            }
                        } else if (jSONObject.has("xjad") && jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 1) {
                            bVar.mo141803k(4002011);
                            bVar.mo141799g(3);
                            bVar.mo141800h(1);
                            C63505q.m74843b(bVar.mo141793a());
                        }
                        SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationSuccess", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    }
                }
                Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationSuccess: sourceParams or sourceJsonObj is null");
                SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationSuccess", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            }
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportLaunchApplicationSuccess: exp is " + th);
        }
        SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationSuccess", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }

    public void rw0(String str) {
        SnsMethodCalculate.markStartTimeMs("reportAddDownloadTaskStraightInstallStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        C99552l.m129926b(4001010, str);
        SnsMethodCalculate.markEndTimeMs("reportAddDownloadTaskStraightInstallStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }

    public void v80(String str) {
        SnsMethodCalculate.markStartTimeMs("reportAddDownloadTaskStraightResume", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        C99552l.m129926b(4001005, str);
        SnsMethodCalculate.markEndTimeMs("reportAddDownloadTaskStraightResume", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }

    /* renamed from: xM */
    public void mo71590xM(String str) {
        SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        ArrayList<Integer> arrayList = C99552l.f291829a;
        SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationStart: adReportParams is " + str);
            C102238b a = C99552l.m129925a("reportLaunchApplicationStart", str);
            if (a == null) {
                Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationStart: adCommonData is null");
                SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            } else {
                JSONObject jSONObject = a.f301044b;
                JSONObject jSONObject2 = a.f301045c;
                if (jSONObject != null) {
                    if (jSONObject2 != null) {
                        C102240d.C102242b bVar = new C102240d.C102242b();
                        bVar.mo141805m(a.f301043a);
                        bVar.mo141806n(a.f301046d);
                        bVar.mo141804l(a.f301047e);
                        bVar.mo141807o(a.f301048f);
                        if (jSONObject.has("wxad")) {
                            if (jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 1) {
                                bVar.mo141803k(4002001);
                                bVar.mo141799g(1);
                                bVar.mo141800h(1);
                                C63505q.m74843b(bVar.mo141793a());
                            } else if (jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 4) {
                                bVar.mo141803k(4001014);
                                bVar.mo141801i(1);
                                C63505q.m74843b(bVar.mo141793a());
                            }
                        } else if (jSONObject.has("xjad") && jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE) == 1) {
                            bVar.mo141803k(4002001);
                            bVar.mo141799g(3);
                            bVar.mo141800h(1);
                            C63505q.m74843b(bVar.mo141793a());
                        }
                        SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    }
                }
                Log.m105924i("AdConversionOnlineReportHelper", "reportLaunchApplicationStart: sourceParams or sourceJsonObj is null");
                SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            }
        } catch (Throwable th) {
            Log.m105920e("AdConversionOnlineReportHelper", "reportLaunchApplicationStart: exp is " + th);
        }
        SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }

    /* renamed from: yQ */
    public void mo71591yQ(String str) {
        SnsMethodCalculate.markStartTimeMs("reportAddDownloadTaskStraightPause", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        C99552l.m129926b(4001004, str);
        SnsMethodCalculate.markEndTimeMs("reportAddDownloadTaskStraightPause", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }
}
