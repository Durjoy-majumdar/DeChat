package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Arrays;
import kr0.C88267e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.k2 */
public class C1706k2 extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 627;
    public static final String NAME = "chooseShareGroup";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        String[] strArr;
        String[] strArr2;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C88267e eVar = (C88267e) fVar;
        if (jSONObject2 == null) {
            eVar.mo109647a(i2, mo115109j("fail:invalid data"));
            return;
        }
        Activity R = eVar.getRuntime().mo113026R();
        if (R == null) {
            eVar.mo109647a(i2, mo115109j("fail:internal error invalid android context"));
            return;
        }
        try {
            String string = jSONObject2.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            boolean optBoolean = jSONObject2.has("public") ? jSONObject2.optBoolean("public") : true;
            boolean optBoolean2 = jSONObject2.has("private") ? jSONObject2.optBoolean("private") : true;
            boolean optBoolean3 = jSONObject2.has("visible") ? jSONObject2.optBoolean("visible") : true;
            boolean optBoolean4 = jSONObject2.has("invisible") ? jSONObject2.optBoolean("invisible") : true;
            JSONArray optJSONArray = jSONObject2.optJSONArray("labelList");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                strArr = null;
            } else {
                strArr = new String[optJSONArray.length()];
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    strArr[i3] = optJSONArray.getString(i3);
                }
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("userList");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                str = "fail:invalid data";
                strArr2 = null;
            } else {
                strArr2 = new String[optJSONArray2.length()];
                str = "fail:invalid data";
                int i4 = 0;
                while (i4 < optJSONArray2.length()) {
                    try {
                        strArr2[i4] = optJSONArray2.getString(i4);
                        i4++;
                    } catch (JSONException e) {
                        e = e;
                    }
                }
            }
            String optString = jSONObject2.optString("group");
            Intent intent = new Intent();
            intent.putExtra("k_select_group", optString);
            intent.putExtra("k_title", string);
            intent.putExtra("k_show_public", optBoolean);
            intent.putExtra("k_show_private", optBoolean2);
            intent.putExtra("k_show_include", optBoolean3);
            intent.putExtra("k_show_exclude", optBoolean4);
            if (strArr != null) {
                intent.putExtra("Klabel_name_list", Util.listToString(Arrays.asList(strArr), ","));
            }
            if (strArr2 != null) {
                intent.putExtra("Kother_user_name_list", Util.listToString(Arrays.asList(strArr2), ","));
            }
            intent.setClassName(MMApplicationContext.getPackageName(), MMApplicationContext.getSourcePackageName() + ".plugin." + "sns" + ".ui.jsapi.JsapiSnsLabelUI");
            try {
                C89916g.m112446a(R).mo124236j(intent, new C1703j2(this, eVar, i2));
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.JsApiChooseShareGroup", e2, "", new Object[0]);
                eVar.mo109647a(i2, mo115109j("fail"));
            }
        } catch (JSONException e3) {
            e = e3;
            str = "fail:invalid data";
            Log.m105921e("MicroMsg.JsApiChooseShareGroup", "parse data failed by %s, appId:%s, callbackId:%d", e, eVar.getAppId(), Integer.valueOf(i));
            eVar.mo109647a(i2, mo115109j(str));
        }
    }
}
