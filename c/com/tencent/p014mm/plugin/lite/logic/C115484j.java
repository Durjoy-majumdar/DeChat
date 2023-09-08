package com.tencent.p014mm.plugin.lite.logic;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.liteapp.report.WxaLiteAppStartReport;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import com.tencent.p014mm.plugin.lite.C115472a;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import org.json.JSONException;
import org.json.JSONObject;
import p244tt.C14088e;
import q22.C12037c;
import tw0.C90587j;

/* renamed from: com.tencent.mm.plugin.lite.logic.j */
public class C115484j extends IStaticListener<GetA8KeyRedirectEvent> {
    public boolean callback(IEvent iEvent) {
        String str;
        int i;
        String substring;
        int indexOf;
        String optString;
        GetA8KeyRedirectEvent getA8KeyRedirectEvent = (GetA8KeyRedirectEvent) iEvent;
        if (!C86709a0.m107522a()) {
            return false;
        }
        GetA8KeyRedirectEvent.C40113a aVar = getA8KeyRedirectEvent.f107573d;
        int i2 = aVar.f107575a;
        JSONObject jSONObject = null;
        if (i2 == 55) {
            try {
                JSONObject jSONObject2 = new JSONObject(aVar.f107576b);
                Object opt = jSONObject2.opt("extra");
                if (opt != null) {
                    if (opt instanceof String) {
                        jSONObject = new JSONObject((String) opt);
                    } else if (opt instanceof JSONObject) {
                        jSONObject = (JSONObject) opt;
                    }
                    if (!(jSONObject == null || (optString = jSONObject.optString("appid")) == null)) {
                        String optString2 = jSONObject.optString("path", "");
                        JSONObject optJSONObject = jSONObject.optJSONObject(SearchIntents.EXTRA_QUERY);
                        if (optJSONObject == null) {
                            optJSONObject = new JSONObject();
                        }
                        try {
                            String optString3 = jSONObject2.optString("url");
                            if (optString3 != null) {
                                Uri parse = Uri.parse(optString3);
                                for (String next : parse.getQueryParameterNames()) {
                                    optJSONObject.put(next, parse.getQueryParameter(next));
                                }
                            }
                            int optInt = jSONObject2.optInt("ret", 0);
                            if (optInt != 0) {
                                optJSONObject.put("ret", optInt);
                            }
                        } catch (JSONException unused) {
                        }
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("option");
                        boolean optBoolean = optJSONObject2 != null ? optJSONObject2.optBoolean("syncCheckUpdate", true) : true;
                        Bundle bundle = new Bundle();
                        bundle.putString("appId", optString);
                        if (!Util.isNullOrNil(optString2)) {
                            bundle.putString("path", optString2);
                        }
                        bundle.putString(SearchIntents.EXTRA_QUERY, optJSONObject.toString());
                        ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(MMApplicationContext.getContext(), bundle, true, optBoolean, (C14088e.C14090b) null);
                    }
                }
            } catch (Exception unused2) {
            }
        } else if (i2 != 42) {
            return false;
        } else {
            String str2 = aVar.f107576b;
            if (str2 != null && !str2.isEmpty()) {
                Log.m105924i("LiteAppDevQrCodeListener", "liteapp qrcode url:" + str2);
                String[] split = str2.split("\\?");
                if (split != null && split.length >= 1) {
                    String str3 = split[0];
                    String[] strArr = new String[2];
                    if (split.length == 1) {
                        str = "";
                    } else {
                        str = split[1];
                        for (String split2 : str.split("&")) {
                            String[] split3 = split2.split("=");
                            if ("entry".equals(split3[0].trim())) {
                                strArr = C12037c.m11741c(split3[1], true);
                            }
                        }
                    }
                    int lastIndexOf = str3.lastIndexOf("/");
                    if (lastIndexOf >= 0 && (i = lastIndexOf + 1) <= str3.length() && (indexOf = substring.indexOf("_")) >= 0) {
                        C115472a.f346202a.mo175446b(7, new WxaLiteAppStartReport());
                        String substring2 = (substring = str3.substring(i)).substring(0, indexOf);
                        C90587j jVar = new C90587j();
                        jVar.f260269a = substring2;
                        jVar.f260272d = str3;
                        jVar.f260273e = "";
                        jVar.f260275g = "3056301006072a8648ce3d020106052b8104000a03420004d60415d0874b4e66bbbbdb598a2c5269caf1af51b2b23ef23a82f48c74d8bc268ae89b34912dbb5b494b3d44d3bc2f0bfc6619357a6679edb531679544de9987";
                        if (!substring2.equals(LiteAppCenter.LITE_APP_BASE_LIB)) {
                            C115485l.INSTANCE.mo175462a(jVar, "debug", (C115492q.C115496d) null, new C4806h(this, strArr, str));
                        } else {
                            C115485l.INSTANCE.mo175463b(jVar, "debug", new C115483i(this));
                        }
                    }
                }
            }
        }
        return true;
    }
}
