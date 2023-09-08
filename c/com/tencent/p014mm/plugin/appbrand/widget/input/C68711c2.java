package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.miniapp.MiniAppSecureEditText;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import rt0.C110653f;
import rt0.C77568i;
import sx3.C64186f0;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.c2 */
public final class C68711c2 {

    /* renamed from: a */
    public static final C68711c2 f197387a = new C68711c2();

    static {
        C84949c1 c1Var = C84949c1.f247602a;
    }

    /* renamed from: c */
    public static final void m80983c(JSONObject jSONObject, C77568i iVar) {
        JSONArray optJSONArray;
        int length;
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(iVar, "params");
        if (iVar instanceof C110653f) {
            if (jSONObject.has("viewId")) {
                ((C110653f) iVar).f331024X = Integer.valueOf(jSONObject.optInt("viewId"));
            } else {
                Log.m105920e("MicroMsg.AppBrand.SecureInputLogic", "prepareInvokeParams, viewId is null");
            }
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("safePassword");
        if (optJSONObject == null) {
            Log.m105924i("MicroMsg.AppBrand.SecureInputLogic", "prepareInvokeParams, safePasswordJsonObj is null");
            return;
        }
        if (optJSONObject.has("certPath") && !optJSONObject.isNull("certPath")) {
            iVar.f226134H = optJSONObject.optString("certPath");
        }
        if (optJSONObject.has("passwordLength") && !optJSONObject.isNull("passwordLength")) {
            iVar.f226135I = Integer.valueOf(optJSONObject.optInt("passwordLength"));
        }
        if (optJSONObject.has("salt") && !optJSONObject.isNull("salt")) {
            iVar.f226136J = optJSONObject.optString("salt");
        }
        if (optJSONObject.has(AppMeasurement.Param.TIMESTAMP) && !optJSONObject.isNull(AppMeasurement.Param.TIMESTAMP)) {
            iVar.f226137K = Long.valueOf(optJSONObject.optLong(AppMeasurement.Param.TIMESTAMP));
        }
        if (optJSONObject.has("nonce") && !optJSONObject.isNull("nonce")) {
            iVar.f226138L = Long.valueOf(optJSONObject.optLong("nonce"));
        }
        if (optJSONObject.has("customHash") && (optJSONArray = optJSONObject.optJSONArray("customHash")) != null && (length = optJSONArray.length()) > 0) {
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    C87412m.m108593f(optString, "safePasswordCompat");
                    arrayList.add(optString);
                }
            }
            iVar.f226139M = arrayList;
        }
    }

    /* renamed from: d */
    public static final void m80984d(JSONObject jSONObject, C77568i iVar) {
        JSONArray optJSONArray;
        int length;
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(iVar, "params");
        if (iVar instanceof C110653f) {
            if (jSONObject.has("view-id")) {
                ((C110653f) iVar).f331024X = Integer.valueOf(jSONObject.optInt("view-id"));
            } else {
                Log.m105920e("MicroMsg.AppBrand.SecureInputLogic", "prepareInvokeSameLayerParams, viewId is null");
            }
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("safe-password");
        if (optJSONObject == null) {
            Log.m105924i("MicroMsg.AppBrand.SecureInputLogic", "prepareInvokeSameLayerParams, safePasswordJsonObj is null");
            return;
        }
        if (optJSONObject.has("cert-path") && !optJSONObject.isNull("cert-path")) {
            iVar.f226134H = optJSONObject.optString("cert-path");
        }
        if (optJSONObject.has("password-length") && !optJSONObject.isNull("password-length")) {
            iVar.f226135I = Integer.valueOf(optJSONObject.optInt("password-length"));
        }
        if (optJSONObject.has("salt") && !optJSONObject.isNull("salt")) {
            iVar.f226136J = optJSONObject.optString("salt");
        }
        if (optJSONObject.has(AppMeasurement.Param.TIMESTAMP) && !optJSONObject.isNull(AppMeasurement.Param.TIMESTAMP)) {
            iVar.f226137K = Long.valueOf(optJSONObject.optLong(AppMeasurement.Param.TIMESTAMP));
        }
        if (optJSONObject.has("nonce") && !optJSONObject.isNull("nonce")) {
            iVar.f226138L = Long.valueOf(optJSONObject.optLong("nonce"));
        }
        if (optJSONObject.has("custom-hash") && (optJSONArray = optJSONObject.optJSONArray("custom-hash")) != null && (length = optJSONArray.length()) > 0) {
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    C87412m.m108593f(optString, "safePasswordCompat");
                    arrayList.add(optString);
                }
            }
            iVar.f226139M = arrayList;
        }
    }

    /* renamed from: a */
    public final void mo94511a(C77568i iVar, C77568i iVar2) {
        C87412m.m108594g(iVar, "<this>");
        C87412m.m108594g(iVar2, "newParams");
        Integer num = iVar2.f226135I;
        if (num != null) {
            iVar.f226135I = num;
        }
        String str = iVar2.f226136J;
        if (str != null) {
            iVar.f226136J = str;
        }
        Long l = iVar2.f226137K;
        if (l != null) {
            iVar.f226137K = l;
        }
        Long l2 = iVar2.f226138L;
        if (l2 != null) {
            iVar.f226138L = l2;
        }
        List<String> list = iVar2.f226139M;
        C87412m.m108593f(list, "newParams.safePasswordCompatList");
        if (!list.isEmpty()) {
            iVar.f226139M = iVar2.f226139M;
        }
    }

    /* renamed from: b */
    public final String mo94512b(MiniAppSecureEditText miniAppSecureEditText, List<String> list, long j, long j2) {
        Iterable<C32226l> iterable;
        C87412m.m108594g(miniAppSecureEditText, "secureInput");
        C87412m.m108594g(list, "rawSafePasswordCompatList");
        miniAppSecureEditText.beginCustomHash();
        if (list.isEmpty()) {
            iterable = C64186f0.f181907d;
        } else {
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            int i = 0;
            while (i < size) {
                String str = list.get(i);
                if (C87412m.m108589b("sm3", str)) {
                    arrayList.add(C68723w1.f197396d);
                } else if (C87412m.m108589b("sha256", str)) {
                    arrayList.add(C68726x1.f197398d);
                } else if (C87412m.m108589b("sha1", str)) {
                    arrayList.add(C68728y1.f197402d);
                } else if (C87412m.m108589b("md5", str)) {
                    arrayList.add(C68729z1.f197403d);
                } else if (C87412m.m108589b("addSaltBefore", str)) {
                    i++;
                    arrayList.add(new C68699a2(list.get(i)));
                } else if (C87412m.m108589b("addSaltAfter", str)) {
                    i++;
                    arrayList.add(new C68710b2(list.get(i)));
                }
                i++;
            }
            iterable = arrayList;
        }
        for (C32226l invoke : iterable) {
            invoke.invoke(miniAppSecureEditText);
        }
        return miniAppSecureEditText.endCustomHashAndEncrypt(j, j2);
    }
}
