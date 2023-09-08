package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.game.luggage.LuggageGameHalfWebViewUI;
import com.tencent.p014mm.plugin.game.luggage.MMLuggageGameHalfWebViewUI;
import com.tencent.p014mm.plugin.webview.luggage.C43626k0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import java.util.NoSuchElementException;
import ke3.C88144b;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;
import p828wa.C53138x;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView */
public class JsApiOpenGameUrlWithExtraWebView extends C43620m2 {
    /* renamed from: b */
    public String mo5382b() {
        return "openGameUrlWithExtraWebView";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
        JSONObject optJSONObject = aVar.f148190b.f129368c.optJSONObject("liteAppInfo");
        JSONObject jSONObject = null;
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("appId");
            if (Util.isNullOrNil(optString)) {
                Log.m105920e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openInLiteApp appId is null");
                mo5386f(aVar);
                return;
            }
            String optString2 = optJSONObject.optString("path");
            String optString3 = optJSONObject.optString(SearchIntents.EXTRA_QUERY);
            Log.m105925i("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openInLiteApp, appId : %s, path : %s, query : %s", optString, optString2, optString3);
            Bundle bundle = new Bundle();
            bundle.putString("appId", optString);
            bundle.putString("path", optString2);
            bundle.putString(SearchIntents.EXTRA_QUERY, optString3);
            JSONObject optJSONObject2 = aVar.f148190b.f129368c.optJSONObject("jumpInfo");
            if (optJSONObject2 != null) {
                jSONObject = optJSONObject2.optJSONObject("halfScreen");
            }
            if (jSONObject != null) {
                bundle.putBoolean("isHalfScreen", true);
                bundle.putBoolean("transparent", true);
                try {
                    bundle.putDouble("heightPercent", jSONObject.getDouble("screenHeightPercent"));
                } catch (JSONException unused) {
                }
            }
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new OpenLiteAppData(bundle), JsApiOpenGameUrlWithExtraWebView$$f.class, new JsApiOpenGameUrlWithExtraWebView$$a(this, aVar));
        } else if (aVar.f148190b.f129368c.optBoolean("openLiteIfMatchUrlLiteConf", false)) {
            String optString4 = aVar.f148190b.f129368c.optString("url");
            if (!Util.isNullOrNil(optString4)) {
                Uri parse = Uri.parse(optString4);
                Bundle bundle2 = new Bundle();
                bundle2.putString("url", optString4);
                XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, bundle2, JsApiOpenGameUrlWithExtraWebView$$e.class, new JsApiOpenGameUrlWithExtraWebView$$b(this, aVar, parse));
                return;
            }
            Log.m105920e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "url is null");
            aVar.mo73778c("fail", (JSONObject) null);
        } else {
            mo5386f(aVar);
        }
    }

    /* renamed from: f */
    public final void mo5386f(C53096b.C53097a aVar) {
        int i;
        C53096b.C53097a aVar2 = aVar;
        String optString = aVar2.f148190b.f129368c.optString("url");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "url is null");
            aVar2.mo73778c("fail", (JSONObject) null);
            return;
        }
        boolean z = true;
        Log.m105925i("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "url: %s", optString);
        try {
            C53138x last = C43626k0.m47360b().getLast();
            if (last != null) {
                String optString2 = aVar2.f148190b.f129368c.optString("html");
                Uri parse = Uri.parse(optString);
                String queryParameter = parse.getQueryParameter("not_in_game_luggage");
                Bundle bundle = new Bundle();
                if (Util.nullAsNil(queryParameter).equals("1") || (parse.getHost() != null && !parse.getHost().equals(WeChatHosts.domainString(C0966R.string.flk)))) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", optString);
                    C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    aVar.mo73776a();
                    return;
                }
                String optString3 = aVar2.f148190b.f129368c.optString("statusBarColor");
                if (!Util.isNullOrNil(optString3)) {
                    try {
                        i = Color.parseColor(optString3);
                    } catch (IllegalArgumentException e) {
                        Log.m105920e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", e.getMessage());
                        aVar2.mo73778c("invalid_color", (JSONObject) null);
                        return;
                    }
                } else {
                    i = 0;
                }
                String optString4 = aVar2.f148190b.f129368c.optString("statusBarStyle");
                String optString5 = aVar2.f148190b.f129368c.optString("halfScreenBackGroundColor");
                String optString6 = aVar2.f148190b.f129368c.optString("preInjectData");
                bundle.putString("rawUrl", optString);
                bundle.putInt("customize_status_bar_color", i);
                bundle.putString("status_bar_style", optString4);
                bundle.putString("game_pre_inject_data", optString6);
                bundle.putString("KHalfScreenBackGroundColor", optString5);
                bundle.putBoolean("from_find_more_friend", last.f148261n.getBoolean("from_find_more_friend", false));
                try {
                    JSONObject jSONObject = aVar2.f148190b.f129368c.getJSONObject("jumpInfo");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("halfScreen");
                    int i2 = jSONObject2.getInt("type");
                    if (i2 == 1) {
                        bundle.putString("rawUrl", jSONObject.getString("jumpUrl"));
                        bundle.putInt("KHalfScreenHeight", jSONObject2.getInt("screenHeightDp"));
                        bundle.putFloat("KHalfScreenHeightPercent", -1.0f);
                    } else if (i2 == 2) {
                        bundle.putString("rawUrl", jSONObject.getString("jumpUrl"));
                        bundle.putInt("KHalfScreenHeight", 0);
                        bundle.putFloat("KHalfScreenHeightPercent", (float) jSONObject2.getDouble("screenHeightPercent"));
                    }
                } catch (JSONException unused) {
                }
                if (!Util.isNullOrNil(optString2)) {
                    bundle.putString("game_open_html", optString2);
                }
                Context context = last.f148196d;
                boolean z2 = (context instanceof LuggageGameHalfWebViewUI) || (context instanceof MMLuggageGameHalfWebViewUI);
                if (bundle.getFloat("KHalfScreenHeightPercent") == 0.0f) {
                    z = false;
                }
                if (z2 ^ z) {
                    Intent intent2 = new Intent();
                    intent2.putExtras(bundle);
                    C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                } else {
                    MMHandlerThread.postToMainThread(new JsApiOpenGameUrlWithExtraWebView$$d(this, last, bundle));
                }
                aVar.mo73776a();
            }
        } catch (NoSuchElementException unused2) {
            Log.m105921e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "LuggagePageStackList size:%s", Integer.valueOf(C43626k0.m47360b().size()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$OpenLiteAppData */
    public static class OpenLiteAppData implements Parcelable {
        public static final Parcelable.Creator<OpenLiteAppData> CREATOR = new C4452a();

        /* renamed from: d */
        public Bundle f19210d;

        /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$OpenLiteAppData$a */
        public class C4452a implements Parcelable.Creator<OpenLiteAppData> {
            public Object createFromParcel(Parcel parcel) {
                return new OpenLiteAppData(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenLiteAppData[i];
            }
        }

        public OpenLiteAppData(Bundle bundle) {
            new Bundle();
            this.f19210d = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f19210d);
        }

        public OpenLiteAppData(Parcel parcel) {
            this.f19210d = new Bundle();
            this.f19210d = parcel.readBundle();
        }
    }
}
