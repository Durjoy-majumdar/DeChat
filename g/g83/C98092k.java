package g83;

import android.text.TextUtils;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchImageData;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.List;
import java.util.Map;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONObject;
import p196ln.C76706g;
import rx3.C13598b0;
import te3.C49768hy;
import te3.C64569n43;
import te3.y25;
import te3.ye4;
import te3.zo4;
import u73.C101968a0;
import u73.C101976i0;
import u73.C101988w;
import u73.C101989x;
import z73.C53761n;
import zt3.C119157j;

/* renamed from: g83.k */
public abstract class C98092k<T> extends WebSearchImageData<T> {

    /* renamed from: g83.k$a */
    public static final class C59388a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98092k<T> f169730d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f169731e;

        public C59388a(C98092k<T> kVar, JSONObject jSONObject) {
            this.f169730d = kVar;
            this.f169731e = jSONObject;
        }

        public final void run() {
            BaseWebSearchWebView webView;
            C59386f<T> fVar = this.f169730d.f123861d;
            if (fVar != null && (webView = fVar.getWebView()) != null) {
                JSONObject jSONObject = this.f169731e;
                C53761n nVar = C53761n.f150905a;
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "returnObj.toString()");
                nVar.mo74349a(webView, "onTeachSearchDataReady", jSONObject2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98092k(C98091e<T> eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "uiComponent");
        C86709a0.m107524d().mo123455a(719, this);
        C86709a0.m107524d().mo123455a(1161, this);
        C86709a0.m107524d().mo123455a(1048, this);
    }

    /* renamed from: e */
    public void mo126345e() {
        C86709a0.m107524d().mo123470p(2975, this);
        AppForegroundDelegate.INSTANCE.mo174215k(this);
        this.f22020h.dead();
        ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg().remove(this);
        C86709a0.m107524d().mo123470p(719, this);
        C86709a0.m107524d().mo123470p(1161, this);
        C86709a0.m107524d().mo123470p(1048, this);
    }

    /* renamed from: f */
    public final C98091e<T> mo137376f() {
        C59386f<T> fVar = this.f123861d;
        C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.websearch.webview.IWebSearchQueryUIComponent<T of com.tencent.mm.plugin.websearch.webview.WebSearchQueryData>");
        return (C98091e) fVar;
    }

    /* renamed from: g */
    public final C101968a0 mo137377g(Map<String, ? extends Object> map) {
        C87412m.m108594g(map, "params");
        int e = C43471q.m46981e(map, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        C101968a0 a0Var = new C101968a0();
        a0Var.f300187b = C43471q.m46982f(map, SearchIntents.EXTRA_QUERY);
        a0Var.f300188c = C43471q.m46981e(map, "offset", 0);
        a0Var.f300189d = C43471q.m46981e(map, "type", 0);
        a0Var.f300191f = e;
        a0Var.f300194i = C43471q.m46982f(map, "sugId");
        a0Var.f300196k = C43471q.m46981e(map, "sugType", 0);
        a0Var.f300195j = C43471q.m46982f(map, "prefixSug");
        a0Var.f300209x = C43471q.m46982f(map, "poiInfo");
        a0Var.f300186a = C43471q.m46980d(map, "isHomePage", false) ? 1 : 0;
        a0Var.f300192g = C43471q.m46982f(map, "searchId");
        if (map.containsKey("sessionId")) {
            a0Var.f300207v = C43471q.m46982f(map, "sessionId");
        }
        a0Var.f300193h = C43471q.m46981e(map, "sceneActionType", 1);
        C43471q.m46981e(map, "displayPattern", 2);
        a0Var.f300198m = C43471q.m46981e(map, "sugPosition", 0);
        C43471q.m46982f(map, "sugBuffer");
        a0Var.f300210y = C43471q.m46982f(map, "requestId");
        a0Var.f300207v = C43471q.m46982f(map, "sessionId");
        a0Var.f300208w = C43471q.m46982f(map, "subSessionId");
        C43471q.m46982f(map, "tagId");
        a0Var.f300202q = mo71326a();
        String f = C43471q.m46982f(map, "extReqParams");
        if (!Util.isNullOrNil(f)) {
            try {
                JSONArray jSONArray = new JSONArray(f);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C49768hy hyVar = new C49768hy();
                    hyVar.f134951d = jSONObject.optString("key", "");
                    hyVar.f134952e = (long) jSONObject.optInt("uintValue", 0);
                    hyVar.f134953f = jSONObject.optString("textValue", "");
                    a0Var.f300200o.add(hyVar);
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchQueryData", e2, "commKvJSONArray", new Object[0]);
            }
        }
        String f2 = C43471q.m46982f(map, "matchUser");
        if (!Util.isNullOrNil(f2)) {
            try {
                JSONObject jSONObject2 = new JSONObject(f2);
                zo4 zo4 = new zo4();
                zo4.f146154d = jSONObject2.optString("userName");
                zo4.f146155e = jSONObject2.optString("matchWord");
                if (!TextUtils.isEmpty(zo4.f146154d)) {
                    a0Var.f300190e.add(zo4);
                }
            } catch (Exception e3) {
                Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchQueryData", e3, "matchUserJSONArray", new Object[0]);
            }
        }
        String f3 = C43471q.m46982f(map, "prefixQuery");
        if (!Util.isNullOrNil(f3)) {
            try {
                JSONArray jSONArray2 = new JSONArray(f3);
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    a0Var.f300197l.add(jSONArray2.getString(i2));
                }
            } catch (Exception e4) {
                Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchQueryData", e4, "prefixQueryJSONArray", new Object[0]);
            }
        }
        String f4 = C43471q.m46982f(map, "tagInfo");
        if (!Util.isNullOrNil(f4)) {
            try {
                JSONObject jSONObject3 = new JSONObject(f4);
                ye4 ye4 = new ye4();
                a0Var.f300199n = ye4;
                ye4.f186507e = jSONObject3.optString("tagText");
                a0Var.f300199n.f186506d = jSONObject3.optInt("tagType");
                a0Var.f300199n.f186508f = jSONObject3.optString("tagExtValue");
            } catch (Exception e5) {
                Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchQueryData", e5, "tagInfoObj", new Object[0]);
            }
        }
        String f5 = C43471q.m46982f(map, "numConditions");
        if (!Util.isNullOrNil(f5)) {
            try {
                JSONArray jSONArray3 = new JSONArray(f5);
                int length3 = jSONArray3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject optJSONObject = jSONArray3.optJSONObject(i3);
                    C64569n43 n432 = new C64569n43();
                    n432.f184431e = optJSONObject.optLong("from");
                    n432.f184432f = optJSONObject.optLong("to");
                    n432.f184430d = optJSONObject.optInt("field");
                    a0Var.f300201p.add(n432);
                }
            } catch (Exception e6) {
                Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchQueryData", e6, "numConditionsArray", new Object[0]);
            }
        }
        a0Var.f300203r = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        C43471q.m46981e(map, "subType", 0);
        String f6 = C43471q.m46982f(map, "specialSearch");
        if (!Util.isNullOrNil(f6)) {
            try {
                JSONObject jSONObject4 = new JSONObject(f6);
                a0Var.f300179A = jSONObject4.optInt("type", 0);
                a0Var.f300180B = jSONObject4.optJSONObject("params").optString("reqKey");
            } catch (Exception unused) {
            }
        }
        return a0Var;
    }

    /* renamed from: h */
    public void mo126346h(String str) {
        C87412m.m108594g(str, "paramsStr");
    }

    /* renamed from: i */
    public List<C49768hy> mo137378i() {
        return null;
    }

    /* renamed from: j */
    public final void mo137379j(int i, String str, int i2, String str2) {
        Log.m105924i("MicroMsg.WebSearch.WebSearchQueryData", "onTeachSearchDataReady");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestType", i);
        jSONObject.put("json", str);
        jSONObject.put("isCacheData", i2);
        jSONObject.put("requestId", str2);
        ((C119157j) C119157j.f356862d).mo183895z(new C59388a(this, jSONObject));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        super.onSceneEnd(i, i2, str, yVar);
        C13598b0 b0Var = null;
        boolean z = true;
        if (yVar instanceof C101988w) {
            C101988w wVar = (C101988w) yVar;
            if (wVar.f300305h.f300202q == mo71326a()) {
                y25 y25 = wVar.f300304g;
                if (y25 != null) {
                    C98093l g = mo137376f().mo9284g();
                    if (g != null) {
                        boolean z2 = wVar.f300305h.f300188c == 0;
                        String str2 = y25.f145094f;
                        C87412m.m108593f(str2, "it.Json");
                        String str3 = wVar.f300305h.f300210y;
                        C87412m.m108593f(str3, "scene.model.requestId");
                        g.mo137385m(z2, str2, str3);
                        b0Var = C13598b0.f38549a;
                    }
                    if (b0Var != null) {
                        return;
                    }
                }
                C98093l g2 = mo137376f().mo9284g();
                if (g2 != null) {
                    C101968a0 a0Var = wVar.f300305h;
                    if (a0Var.f300188c != 0) {
                        z = false;
                    }
                    String str4 = a0Var.f300210y;
                    C87412m.m108593f(str4, "scene.model.requestId");
                    g2.mo137385m(z, "{\"ret\":-1}", str4);
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    return;
                }
                return;
            }
            C98093l g3 = mo137376f().mo9284g();
            if (g3 != null) {
                C101968a0 a0Var2 = wVar.f300305h;
                if (a0Var2.f300188c != 0) {
                    z = false;
                }
                String str5 = a0Var2.f300210y;
                C87412m.m108593f(str5, "scene.model.requestId");
                g3.mo137385m(z, "{\"ret\":-1}", str5);
            }
        } else if (yVar instanceof C101989x) {
            C101989x xVar = (C101989x) yVar;
            if (xVar.f300310h.f300202q != mo71326a()) {
                return;
            }
            if (i == 0 && i2 == 0) {
                y25 y252 = xVar.f300309g;
                if (y252 != null) {
                    C98093l g4 = mo137376f().mo9284g();
                    if (g4 != null) {
                        String str6 = y252.f145094f;
                        C87412m.m108593f(str6, "it.Json");
                        g4.mo137393q(str6);
                        b0Var = C13598b0.f38549a;
                    }
                    if (b0Var != null) {
                        return;
                    }
                }
                C98093l g5 = mo137376f().mo9284g();
                if (g5 != null) {
                    g5.mo137393q("{\"ret\":-1}");
                    C13598b0 b0Var3 = C13598b0.f38549a;
                    return;
                }
                return;
            }
            C98093l g6 = mo137376f().mo9284g();
            if (g6 != null) {
                g6.mo137393q("{\"ret\":-1}");
            }
        } else if (!(yVar instanceof C101976i0)) {
        } else {
            if (i == 0 && i2 == 0) {
                C101976i0 i0Var = (C101976i0) yVar;
                mo137379j(0, i0Var.f300267f.f133123d, 0, i0Var.f300270i);
                return;
            }
            Log.m105921e("MicroMsg.WebSearch.WebSearchQueryData", "onSceneEnd errType %d,errCode %d", Integer.valueOf(i), Integer.valueOf(i2));
            mo137379j(0, "", 0, ((C101976i0) yVar).f300270i);
        }
    }
}
