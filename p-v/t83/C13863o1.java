package t83;

import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1574a3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1701i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1774p4;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiResumeDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1643f;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.C82398i;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C1715u;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82801g;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C82876d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import gk0.C8330j0;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: t83.o1 */
public class C13863o1 {

    /* renamed from: a */
    public static Set<String> f39022a = new HashSet();

    /* renamed from: b */
    public static String f39023b = "";

    /* renamed from: c */
    public static String f39024c = "";

    /* renamed from: d */
    public static String f39025d = "";

    /* renamed from: a */
    public static void m13165a(Map<String, Object> map, boolean z, String str, String str2) {
        if (map != null) {
            map.put("fromMenu", Boolean.valueOf(z));
            map.put("keyParam", str);
            if (Util.isNullOrNil((String) map.get("appId"))) {
                map.put("appId", str2);
            }
        }
    }

    /* renamed from: b */
    public static void m13166b(String str, String str2, String str3) {
        f39023b = str;
        f39024c = str2;
        f39025d = str3;
    }

    /* renamed from: c */
    public static void m13167c(String str, Map<String, Object> map) {
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        boolean z;
        String str4;
        String str5;
        boolean z2;
        String str6 = str;
        Map<String, Object> map2 = map;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WebViewSecurityUtil", "function name is null or nil.");
            return;
        }
        if (map2 != null) {
            z2 = Util.nullAsFalse((Boolean) map2.get("fromMenu"));
            str5 = Util.nullAsNil((String) map2.get("keyParam"));
            str4 = Util.nullAs((String) map2.get("appId"), "");
            z = Util.nullAsFalse((Boolean) map2.get("isSuccess"));
            i3 = Util.nullAsNil((Integer) map2.get("permissionValue"));
            i2 = Util.nullAsNil((Integer) map2.get("baseErrorCode"));
            i = Util.nullAsNil((Integer) map2.get("jsapiErrorCode"));
            str3 = Util.nullAs((String) map2.get("containerEnv"), "");
            str2 = Util.nullAs((String) map2.get("miniProgramPath"), "");
        } else {
            str5 = null;
            str4 = "";
            str3 = str4;
            str2 = str3;
            z2 = false;
            z = false;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        String nullAsNil = Util.nullAsNil(f39023b);
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        String doUrlEncode = WebViewUtilities.doUrlEncode(nullAsNil);
        if (Util.isNullOrNil(doUrlEncode) && map2 != null) {
            doUrlEncode = WebViewUtilities.doUrlEncode(Util.nullAs((String) map2.get("report_initUrl"), ""));
        }
        String doUrlEncode2 = WebViewUtilities.doUrlEncode(Util.nullAsNil(f39024c));
        boolean z3 = !Util.isNullOrNil(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(doUrlEncode);
        String str7 = "";
        sb.append(",");
        sb.append(doUrlEncode2);
        sb.append(",");
        String str8 = f39025d;
        String str9 = doUrlEncode2;
        sb.append(str8 == null ? str7 : str8);
        sb.append(",");
        sb.append(str6 == null ? str7 : str6);
        sb.append(",");
        String str10 = "1";
        sb.append(z2 ? str10 : "0");
        sb.append(",");
        if (str5 == null) {
            str5 = str7;
        }
        sb.append(str5);
        sb.append(",");
        sb.append(str4);
        sb.append(",");
        sb.append(z ? str10 : "0");
        sb.append(",");
        sb.append(i3);
        if (!z) {
            sb.append(",");
            sb.append(0);
            sb.append(",");
            sb.append(i2);
            sb.append(",");
            sb.append(i);
        } else {
            sb.append(",");
            sb.append(0);
            sb.append(",");
            sb.append(0);
            sb.append(",");
            sb.append(0);
        }
        String sb4 = sb.toString();
        if (z3) {
            boolean z4 = System.currentTimeMillis() % 20 == 0;
            Log.m105927v("MicroMsg.WebViewSecurityUtil", "canReportForMiniProgramBySample %s", Boolean.valueOf(z4));
            if (z4) {
                sb.append(",");
                sb.append(str3);
                sb.append(",");
                sb.append(str2);
                Log.m105919d("MicroMsg.WebViewSecurityUtil", "reportForMiniProgram: %s", sb.toString());
                C115669n.INSTANCE.kvStat(18816, sb.toString());
            }
        } else {
            if (System.currentTimeMillis() % 20 == 0) {
                Log.m105919d("MicroMsg.WebViewSecurityUtil", "reportForWebView: %s", sb4);
                C115669n.INSTANCE.kvStat(10417, sb4);
            }
        }
        if (((HashSet) f39022a).size() <= 0) {
            ((HashSet) f39022a).add("openUrlByExtBrowser");
            ((HashSet) f39022a).add("startVoipCall");
            ((HashSet) f39022a).add("getCurrentSSID");
            ((HashSet) f39022a).add(JsApiChooseImage.NAME);
            ((HashSet) f39022a).add("uploadImage");
            ((HashSet) f39022a).add("chooseVideo");
            ((HashSet) f39022a).add("uploadVideo");
            ((HashSet) f39022a).add("getOpenDeviceId");
            ((HashSet) f39022a).add("chooseIdCard");
            ((HashSet) f39022a).add("recordVideo");
            ((HashSet) f39022a).add(JsApiChooseMedia.NAME);
            ((HashSet) f39022a).add("requestWxFacePictureVerify");
            ((HashSet) f39022a).add("requestWxFacePictureVerifyUnionVideo");
            ((HashSet) f39022a).add(C8330j0.NAME);
            ((HashSet) f39022a).add(JsApiGetInstallState.NAME);
            ((HashSet) f39022a).add(JsApiAddDownloadTask.NAME);
            ((HashSet) f39022a).add(JsApiCancelDownloadTask.NAME);
            ((HashSet) f39022a).add(JsApiQueryDownloadTask.NAME);
            ((HashSet) f39022a).add(JsApiInstallDownloadTask.NAME);
            ((HashSet) f39022a).add("launch3rdApp");
            ((HashSet) f39022a).add(JsApiPauseDownloadTask.NAME);
            ((HashSet) f39022a).add(JsApiResumeDownloadTask.NAME);
            ((HashSet) f39022a).add("launchApplication");
            ((HashSet) f39022a).add(JsApiAddDownloadTaskStraight.NAME);
            ((HashSet) f39022a).add(Scopes.PROFILE);
            ((HashSet) f39022a).add("addContact");
            ((HashSet) f39022a).add("jumpToBizProfile");
            ((HashSet) f39022a).add("startTempSession");
            ((HashSet) f39022a).add("quicklyAddBrandContact");
            ((HashSet) f39022a).add("openBizChat");
            ((HashSet) f39022a).add(C82980n.NAME);
            ((HashSet) f39022a).add("sendAppMessage");
            ((HashSet) f39022a).add("sendServiceAppMessage");
            ((HashSet) f39022a).add("getSendC2CMessageRequest");
            ((HashSet) f39022a).add("shareQQ");
            ((HashSet) f39022a).add("selectSingleContact");
            ((HashSet) f39022a).add("sendAppMessageToSpecifiedContact");
            ((HashSet) f39022a).add("sendSingleAppMessage");
            ((HashSet) f39022a).add("openWeApp");
            ((HashSet) f39022a).add(C82801g.NAME);
            ((HashSet) f39022a).add("addCustomMenuItems");
            ((HashSet) f39022a).add("openUrlWithExtraWebview");
            ((HashSet) f39022a).add("enableFullScreen");
            ((HashSet) f39022a).add("openCustomWebview");
            ((HashSet) f39022a).add("openSpecificView");
            ((HashSet) f39022a).add("getBrandWCPayBindCardRequest");
            ((HashSet) f39022a).add("getTransferMoneyRequest");
            ((HashSet) f39022a).add("verifyWCPayPassword");
            ((HashSet) f39022a).add("getRecevieBizHongBaoRequest");
            ((HashSet) f39022a).add("getH5PrepayRequest");
            ((HashSet) f39022a).add("getH5TransactionRequest");
            ((HashSet) f39022a).add("getWebPayCheckoutCounterRequst");
            ((HashSet) f39022a).add("getWCPayRealnameVerify");
            ((HashSet) f39022a).add("unbindBankCard");
            ((HashSet) f39022a).add("idCardRealnameVerify");
            ((HashSet) f39022a).add("openLuckyMoneyDetailView");
            ((HashSet) f39022a).add("setWCPayPassword");
            ((HashSet) f39022a).add(C1774p4.NAME);
            ((HashSet) f39022a).add(C1643f.NAME);
            ((HashSet) f39022a).add("scanLicence");
            ((HashSet) f39022a).add(C82398i.NAME);
            ((HashSet) f39022a).add("getBrandWCPayRequest");
            ((HashSet) f39022a).add(C82876d0.NAME);
            ((HashSet) f39022a).add("editAddress");
            ((HashSet) f39022a).add("getLatestAddress");
            ((HashSet) f39022a).add(C1715u.NAME);
            ((HashSet) f39022a).add(C1701i2.NAME);
            ((HashSet) f39022a).add("requireSoterBiometricAuthentication");
            ((HashSet) f39022a).add(C1574a3.NAME);
        }
        if (((HashSet) f39022a).contains(str6)) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(doUrlEncode);
            sb5.append(",");
            sb5.append(str9);
            sb5.append(",");
            if (str6 == null) {
                str6 = str7;
            }
            sb5.append(str6);
            sb5.append(",");
            sb5.append(str4);
            sb5.append(",");
            if (!z) {
                str10 = "0";
            }
            sb5.append(str10);
            String sb6 = sb5.toString();
            if (z3) {
                sb5.append(",");
                sb5.append(str3);
                sb5.append(",");
                sb5.append(str2);
                Log.m105927v("MicroMsg.WebViewSecurityUtil", "reportImportantJsApiForMiniProgram: %s", sb5.toString());
                C115669n.INSTANCE.kvStat(18817, sb5.toString());
                return;
            }
            Log.m105927v("MicroMsg.WebViewSecurityUtil", "reportImportantJsApiForWebView: %s", sb6);
            C115669n.INSTANCE.kvStat(17048, sb6);
        }
    }
}
