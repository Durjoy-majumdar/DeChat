package xb3;

import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1643f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import sx3.C110826x0;
import u83.C52477a;
import z04.C112550d0;

/* renamed from: xb3.m */
public final class C15640m implements C52477a {

    /* renamed from: a */
    public final HashSet<String> f42277a = C110826x0.m151014b("getBrandWCPayRequest", "getBrandWCPayBindCardRequest", "openWCPaySpecificView", "verifyWCPayPassword", "getH5TransactionRequest", "getH5PrepayRequest", "getWCPayRealnameVerify", "selectWalletCurrency", "changePayActivityView", "unbindBankCard", "uploadIdCardSuccess", "idCardRealnameVerify", "setWCPayPassword", "handleWCPayWalletBuffer", C1643f.NAME);

    /* renamed from: b */
    public final HashSet<String> f42278b = C110826x0.m151014b(JsApiChooseImage.NAME, "uploadImage", "chooseIdCard");

    /* renamed from: c */
    public final HashMap<String, String> f42279c = new HashMap<>();

    /* renamed from: a */
    public void mo14385a(String str, String str2, Map<String, Object> map) {
        C87412m.m108594g(str, "function");
        C87412m.m108594g(str2, "callbackId");
        Log.m105918d("MicroMsg.WcPayReport|WcPayWebJsapiMonitor", "beforeDealJsapi: " + str + ", " + str2);
        this.f42279c.put(str2, str);
    }

    /* renamed from: b */
    public void mo14386b(String str, String str2, Map<String, Object> map) {
        String str3;
        Log.m105918d("MicroMsg.WcPayReport|WcPayWebJsapiMonitor", "onJsapiCallback: " + str + ", " + str2);
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode == 159435972 ? str2.equals("system:too_frequent") : hashCode == 1484725775 ? str2.equals("system:function_not_exist") : hashCode == 1886702795 && str2.equals("system:access_denied")) {
                String str4 = this.f42279c.get(str);
                if (str4 == null) {
                    return;
                }
                if (this.f42277a.contains(str4) || this.f42278b.contains(str4)) {
                    Log.m105928w("MicroMsg.WcPayReport|WcPayWebJsapiMonitor", "report jsapi system error: " + str4 + ", " + str2);
                    C15635h hVar = C15635h.f42265a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("H5Jsapi-");
                    sb.append(str4);
                    hVar.mo14381b(sb.toString(), "1", str2);
                }
            } else if (C112550d0.m153801u(str2, "fail", false) && (str3 = this.f42279c.get(str)) != null && this.f42278b.contains(str3)) {
                Log.m105928w("MicroMsg.WcPayReport|WcPayWebJsapiMonitor", "report jsapi biz error: " + str3 + ", " + str2);
                C15635h hVar2 = C15635h.f42265a;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("H5Jsapi-");
                sb4.append(str3);
                hVar2.mo14381b(sb4.toString(), "3", str2);
            }
        }
    }

    /* renamed from: c */
    public void mo14387c(String str, String str2, Map<String, Object> map) {
        C87412m.m108594g(str, "function");
        C87412m.m108594g(str2, "callbackId");
        if (this.f42277a.contains(str)) {
            Object obj = map != null ? map.get("jsapiHandleResult") : null;
            C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (intValue != 1) {
                String str3 = intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? intValue != 6 ? "maybe not invoked" : "happen exception" : "limited jsapi" : "null pointer" : "is floating" : "check not available";
                C15635h hVar = C15635h.f42265a;
                hVar.mo14381b("H5Jsapi-" + str, "2", str3);
            }
        }
    }
}
