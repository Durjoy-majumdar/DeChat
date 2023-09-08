package eo2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;

/* renamed from: eo2.a */
public class C31645a {
    /* renamed from: a */
    public static boolean m39486a() {
        SnsMethodCalculate.markStartTimeMs("isReportHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_timeline_ad_harmony_os_info_switch, 1);
            if (Qe == 0) {
                Log.m105924i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportHarmonyOSInfo is false");
            }
            if (Qe == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isReportHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z;
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportHarmonyOSInfo, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isReportHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m39487b() {
        SnsMethodCalculate.markStartTimeMs("isReportIMEIWx", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_timeline_ad_imei_wx_switch, 1);
            if (Qe == 0) {
                Log.m105918d("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportIMEIWx is false");
            }
            if (Qe == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isReportIMEIWx", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z;
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportIMEIWx, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isReportIMEIWx", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m39488c() {
        SnsMethodCalculate.markStartTimeMs("isReportOAID", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_timeline_ad_oaid_switch, 1);
            if (Qe == 0) {
                Log.m105924i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportOAID is false");
            }
            if (Qe == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isReportOAID", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z;
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportOAID, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isReportOAID", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m39489d() {
        SnsMethodCalculate.markStartTimeMs("isReportSysUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_timeline_ad_sys_ua_switch, 1);
            if (Qe == 0) {
                Log.m105924i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportSysUA is false");
            }
            if (Qe == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isReportSysUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z;
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportSysUA, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isReportSysUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m39490e() {
        SnsMethodCalculate.markStartTimeMs("isReportWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_timeline_ad_webview_ua_build_info_switch, 0);
            if (Qe == 0) {
                Log.m105924i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportWebViewUABuildInfo is false");
            }
            if (Qe == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isReportWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z;
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportWebViewUABuildInfo, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isReportWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m39491f() {
        SnsMethodCalculate.markStartTimeMs("isVisitDexOrODexForWebViewUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_timeline_ad_chrome_ver_visit_dex_switch, 1);
            if (Qe == 0) {
                Log.m105924i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isVisitDexOrODexForWebViewUA is false");
            }
            if (Qe == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isVisitDexOrODexForWebViewUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z;
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isVisitDexOrODexForWebViewUA, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isVisitDexOrODexForWebViewUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }
}
