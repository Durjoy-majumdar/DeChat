package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.ndk.WxSmCryptoUtil;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import rt0.C77568i;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.b1 */
public final class C68709b1 {

    /* renamed from: a */
    public static final /* synthetic */ int f197385a = 0;

    static {
        C84949c1 c1Var = C84949c1.f247602a;
    }

    /* renamed from: a */
    public static final void m80979a(C77568i iVar, C77568i iVar2) {
        C87412m.m108594g(iVar, "<this>");
        C87412m.m108594g(iVar2, "newParams");
        String str = iVar2.f226140N;
        if (str != null) {
            iVar.f226140N = str;
        }
        String str2 = iVar2.f226141O;
        if (str2 != null) {
            iVar.f226141O = str2;
        }
    }

    /* renamed from: b */
    public static final String m80980b(C68717h1 h1Var, C82381f fVar, C77568i iVar) {
        String str;
        if (h1Var == null) {
            Log.m105920e("MicroMsg.AppBrand.EncryptInputLogic", "encrypt, encryptException is null");
            throw new C68698a1("env error");
        } else if (fVar == null) {
            Log.m105920e("MicroMsg.AppBrand.EncryptInputLogic", "encrypt, env is null");
            throw new C68698a1("env error");
        } else if (iVar != null) {
            String str2 = iVar.f226140N;
            if (str2 != null) {
                String a = h1Var.mo94514a(fVar, str2);
                String inputType = h1Var.getInputType();
                Map<String, Integer> map = C84947c0.f247596d;
                String str3 = "";
                boolean z = false;
                if ("encrypt-bankcard".equalsIgnoreCase(inputType)) {
                    String b = h1Var.mo94515b();
                    str = b != null ? C112551y.m153814n(b, " ", str3, false) : null;
                } else {
                    str = h1Var.mo94515b();
                }
                String str4 = iVar.f226141O;
                if (str4 != null) {
                    str3 = str4;
                }
                if (str == null || str.length() == 0) {
                    Log.m105924i("MicroMsg.AppBrand.EncryptInputLogic", "encrypt, inputValue is empty, not need");
                    return null;
                }
                String encryptGenericDataWithCert = WxSmCryptoUtil.getInstance().encryptGenericDataWithCert(a, str, str3);
                if (encryptGenericDataWithCert == null || encryptGenericDataWithCert.length() == 0) {
                    z = true;
                }
                if (!z) {
                    return encryptGenericDataWithCert;
                }
                throw new C68698a1("sdk error:" + WxSmCryptoUtil.getInstance().getLastError());
            }
            throw new C68698a1("need certPath");
        } else {
            Log.m105920e("MicroMsg.AppBrand.EncryptInputLogic", "encrypt, params is null");
            throw new C68698a1("env error");
        }
    }

    /* renamed from: c */
    public static final void m80981c(JSONObject jSONObject, C77568i iVar) {
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(iVar, "params");
        JSONObject optJSONObject = jSONObject.optJSONObject("encrypt");
        if (optJSONObject == null) {
            Log.m105924i("MicroMsg.AppBrand.EncryptInputLogic", "prepareInvokeParams, encryptJsonObj is null");
            return;
        }
        if (optJSONObject.has("certPath") && !optJSONObject.isNull("certPath")) {
            iVar.f226140N = optJSONObject.optString("certPath");
        }
        if (optJSONObject.has("extra") && !optJSONObject.isNull("extra")) {
            iVar.f226141O = optJSONObject.optString("extra");
        }
    }

    /* renamed from: d */
    public static final void m80982d(JSONObject jSONObject, C77568i iVar) {
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(iVar, "params");
        JSONObject optJSONObject = jSONObject.optJSONObject("encrypt");
        if (optJSONObject == null) {
            Log.m105924i("MicroMsg.AppBrand.EncryptInputLogic", "prepareSameLayerInvokeParams, encryptJsonObj is null");
            return;
        }
        if (optJSONObject.has("cert-path") && !optJSONObject.isNull("cert-path")) {
            iVar.f226140N = optJSONObject.optString("cert-path");
        }
        if (optJSONObject.has("extra") && !optJSONObject.isNull("extra")) {
            iVar.f226141O = optJSONObject.optString("extra");
        }
    }
}
