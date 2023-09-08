package c83;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.JavascriptInterface;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d83.C97446b;
import f40.C86709a0;
import g83.C98093l;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import kg3.C76577a;
import org.json.JSONObject;
import te3.C101806l82;
import te3.xe4;
import u73.C101986v;
import u73.C101987v0;
import z73.C53759a;

/* renamed from: c83.a */
public final class C92382a extends C98093l<xe4> {

    /* renamed from: f */
    public final String f264358f = "MicroMsg.WebSearch.TagSearchJSApi";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92382a(C97446b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "uiComponent");
    }

    @JavascriptInterface
    public String appendSearchTag(String str) {
        String str2 = this.f264358f;
        Log.m105924i(str2, "appendSearchTag " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(SearchIntents.EXTRA_QUERY, "");
            String optString2 = jSONObject.optString("searchId", "");
            String optString3 = jSONObject.optString("sessionId", "");
            String optString4 = jSONObject.optString("requestId", "");
            C53759a aVar = this.f150904a;
            C97446b bVar = aVar instanceof C97446b ? (C97446b) aVar : null;
            if (bVar != null) {
                C87412m.m108593f(optString, "tag");
                C87412m.m108593f(optString3, "sessionId");
                C87412m.m108593f(optString2, "searchId");
                C87412m.m108593f(optString4, "requestId");
                bVar.mo136713q3(optString, optString3, optString2, optString4);
            }
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    /* renamed from: i */
    public int mo25052i() {
        return 1;
    }

    @JavascriptInterface
    public String openSearchWebView(String str) {
        xe4 xe4;
        String str2 = str;
        String str3 = "";
        String str4 = this.f264358f;
        Log.m105924i(str4, "openSearchWebView " + str2);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString(SearchIntents.EXTRA_QUERY);
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            int optInt2 = jSONObject.optInt("type", 0);
            int optInt3 = jSONObject.optInt("subType", 0);
            String optString2 = jSONObject.optString("searchId", str3);
            String optString3 = jSONObject.optString("sessionId", str3);
            int optInt4 = jSONObject.optInt("actionType", 0);
            String optString4 = jSONObject.optString("extParams", str3);
            JSONObject optJSONObject = jSONObject.optJSONObject("nativeConfig");
            String optString5 = optJSONObject != null ? optJSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE) : null;
            if (optString5 == null) {
                optString5 = str3;
            }
            if (optInt4 == 3) {
                Map<String, String> b = C101987v0.m134268b(optInt, false, optInt2, optString4);
                HashMap hashMap = (HashMap) b;
                hashMap.put(SearchIntents.EXTRA_QUERY, optString);
                hashMap.put("searchId", optString2);
                hashMap.put("subType", String.valueOf(optInt3));
                hashMap.put("sessionId", optString3);
                hashMap.put("subSessionId", C101987v0.m134271e(optInt));
                xe4 xe42 = new xe4();
                C53759a aVar = this.f150904a;
                C97446b bVar = aVar instanceof C97446b ? (C97446b) aVar : null;
                if (!(bVar == null || (xe4 = (xe4) bVar.mo84508x6()) == null)) {
                    String str5 = xe4.f228424o;
                    if (str5 != null) {
                        str3 = str5;
                    }
                }
                xe42.f228424o = str3;
                xe42.f228419g = C0437d.f1061a.mo476a(b);
                xe42.f228421i = optString;
                xe42.f228418f = optInt;
                xe42.f228416d = optString2;
                xe42.f228417e = optString3;
                xe42.f228420h = C101987v0.m134271e(optInt);
                xe42.f228423n = optString5;
                C53759a aVar2 = this.f150904a;
                C97446b bVar2 = aVar2 instanceof C97446b ? (C97446b) aVar2 : null;
                if (bVar2 != null) {
                    bVar2.mo136711X5(xe42);
                }
            }
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String setSearchTagResult(String str) {
        C92383e c;
        String str2 = this.f264358f;
        Log.m105924i(str2, "setSearchTagResult " + str);
        if (str == null) {
            return mo74340d().toString();
        }
        C53759a aVar = this.f150904a;
        Context context = null;
        C97446b bVar = aVar instanceof C97446b ? (C97446b) aVar : null;
        if (!(bVar == null || (c = bVar.mo9283c()) == null)) {
            try {
                C101986v vVar = c.f264360j;
                if (vVar != null) {
                    C86709a0.m107524d().mo123458d(vVar);
                    c.f264360j = null;
                }
                JSONObject jSONObject = new JSONObject(str);
                C101806l82 l822 = new C101806l82();
                l822.f298714d = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
                l822.f298715e = jSONObject.optString("sessionId", "");
                l822.f298716f = jSONObject.optString("requestId", "");
                l822.f298717g = jSONObject.optString("searchId", "");
                l822.f298719i = jSONObject.optString(SearchIntents.EXTRA_QUERY, "");
                l822.f298720j = jSONObject.optString("content", "");
                l822.f298718h = jSONObject.optInt("h5Version", 0);
                C101986v vVar2 = new C101986v(l822, c.mo71326a());
                C86709a0.m107524d().mo123460f(vVar2);
                c.f264360j = vVar2;
                JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
                C97446b k = c.mo126347k();
                BaseWebSearchWebView webView = k != null ? k.getWebView() : null;
                if (!(optJSONObject == null || webView == null)) {
                    C97446b k2 = c.mo126347k();
                    int b = C76577a.m92151b(k2 != null ? k2.mo24908k0() : null, optJSONObject.optInt("x", 0));
                    C97446b k3 = c.mo126347k();
                    int b2 = C76577a.m92151b(k3 != null ? k3.mo24908k0() : null, optJSONObject.optInt("y", 0));
                    C97446b k4 = c.mo126347k();
                    int b3 = C76577a.m92151b(k4 != null ? k4.mo24908k0() : null, optJSONObject.optInt("w", 0));
                    C97446b k5 = c.mo126347k();
                    if (k5 != null) {
                        context = k5.mo24908k0();
                    }
                    Bitmap cropBitmap = BitmapUtil.cropBitmap(webView.getBitmap(), b, b2, b3, C76577a.m92151b(context, optJSONObject.optInt("h", 0)), true);
                    C101986v vVar3 = c.f264360j;
                    if (vVar3 != null) {
                        vVar3.f300300i = cropBitmap;
                    }
                }
                C97446b k6 = c.mo126347k();
                if (k6 != null) {
                    String str3 = l822.f298716f;
                    C87412m.m108593f(str3, "request.RequestId");
                    k6.mo136712j0(str3);
                }
            } catch (Exception unused) {
            }
        }
        return mo74341e().toString();
    }
}
