package g83;

import android.webkit.JavascriptInterface;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchImageData;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import z73.C53759a;
import z73.C53761n;

/* renamed from: g83.j */
public class C59387j<T> extends C59379b<T> {

    /* renamed from: c */
    public final String f169729c = "MicroMsg.WebSearch.WebSearchImageJSApi";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59387j(C8248d<T> dVar) {
        super(dVar);
        C87412m.m108594g(dVar, "imageUIComponent");
    }

    @JavascriptInterface
    public String getSearchAvatarList(String str) {
        WebSearchImageData c;
        try {
            String optString = new JSONObject(str).optString("data", "");
            C53759a aVar = this.f150904a;
            C8248d dVar = aVar instanceof C8248d ? (C8248d) aVar : null;
            if (!(dVar == null || (c = dVar.mo9283c()) == null)) {
                C87412m.m108593f(optString, "data");
                c.mo6890c(optString);
            }
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String getSearchImageList(String str) {
        WebSearchImageData c;
        String str2 = this.f169729c;
        Log.m105924i(str2, "getSearchImageList " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("requestType", 0);
            String optString = jSONObject.optString("data", "");
            C53759a aVar = this.f150904a;
            C8248d dVar = aVar instanceof C8248d ? (C8248d) aVar : null;
            if (!(dVar == null || (c = dVar.mo9283c()) == null)) {
                C87412m.m108593f(optString, "data");
                c.mo6891d(optInt, optString);
            }
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    /* renamed from: k */
    public final void mo84511k(int i, String str) {
        BaseWebSearchWebView webView;
        C87412m.m108594g(str, "data");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ret", i);
            jSONObject.put("data", str);
        } catch (Exception unused) {
        }
        C53759a aVar = this.f150904a;
        if (aVar != null && (webView = aVar.getWebView()) != null) {
            C53761n nVar = C53761n.f150905a;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "requestObj.toString()");
            nVar.mo74349a(webView, "onSearchImageListReady", jSONObject2);
        }
    }
}
