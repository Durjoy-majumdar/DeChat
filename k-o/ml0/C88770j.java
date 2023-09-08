package ml0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import jk0.C87981f;
import jk0.C87987k;
import ml0.C88746b;
import ml0.C88752e;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ml0.j */
public class C88770j extends C87981f {
    private static final int CTRL_INDEX = 367;
    public static final String NAME = "operateLivePlayer";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("livePlayerId");
    }

    /* renamed from: D */
    public boolean mo110315D() {
        return true;
    }

    /* renamed from: F */
    public boolean mo110316F(C82520h hVar, int i, View view, JSONObject jSONObject, C87987k kVar) {
        int i2;
        boolean z = false;
        Log.m105925i("MicroMsg.JsApiOperateLivePlayer", "onOperateView : livePlayerId=%d", Integer.valueOf(i));
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiOperateLivePlayer", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        View view2 = (View) ((CoverViewContainer) view).mo114736d(View.class);
        if (!(view2 instanceof C88746b)) {
            Log.m105920e("MicroMsg.JsApiOperateLivePlayer", "targetView not AppBrandLivePlayerView");
            return false;
        }
        C88746b bVar = (C88746b) view2;
        String optString = jSONObject.optString("type");
        Log.m105925i("MicroMsg.JsApiOperateLivePlayer", "onOperateView operateType=%s", optString);
        if (optString.equalsIgnoreCase(AppBrandFileCleaner.f238098c)) {
            bVar.setSnapshotListener(new C88769i(this, kVar, hVar));
            if (!bVar.mo123190c(AppBrandFileCleaner.f238098c, jSONObject)) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 4);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                kVar.mo122438a(mo115115p("fail:internal error", jSONObject2));
            }
        } else if (optString.equalsIgnoreCase("requestFullScreen")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                Log.m105928w("MicroMsg.JsApiOperateLivePlayer", "onOperateView directionArr nil");
                i2 = 0;
            } else {
                i2 = optJSONArray.optInt(0, 0);
            }
            bVar.getClass();
            Log.m105925i("MicroMsg.AppBrandLivePlayerView", "enterFullScreen direction:%s", Integer.valueOf(i2));
            C88746b.C88747a aVar = bVar.f256157f;
            if (aVar == null) {
                Log.m105928w("MicroMsg.AppBrandLivePlayerView", "enterFullScreen mFullScreenDelegate null");
            } else {
                C88752e.C88757e eVar = (C88752e.C88757e) aVar;
                C82520h.C82521a c = eVar.f256168a.mo109649c(eVar.f256169b);
                int i3 = eVar.f256170c;
                C83873p2 p2Var = (C83873p2) c;
                if (p2Var.f244875i == i3 || p2Var.f244870d == i3) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("MicroMsg.AppBrandLivePlayerView", "enterFullScreen already full screen");
                } else {
                    C88752e.C88757e eVar2 = (C88752e.C88757e) bVar.f256157f;
                    ((C83873p2) eVar2.f256168a.mo109649c(eVar2.f256169b)).mo116432j(eVar2.f256170c, eVar2.f256171d, i2);
                    bVar.f256159h = i2;
                    bVar.mo123189b(true);
                }
                z = true;
            }
            kVar.mo122438a(mo115111l((String) null, z ? C86920e.f252311a : C86920e.f252314d, (JSONObject) null));
        } else if (optString.equalsIgnoreCase("exitFullScreen")) {
            bVar.getClass();
            Log.m105924i("MicroMsg.AppBrandLivePlayerView", "quitFullScreen");
            C88746b.C88747a aVar2 = bVar.f256157f;
            if (aVar2 == null) {
                Log.m105928w("MicroMsg.AppBrandLivePlayerView", "quitFullScreen mFullScreenDelegate null");
            } else {
                C88752e.C88757e eVar3 = (C88752e.C88757e) aVar2;
                C82520h.C82521a c2 = eVar3.f256168a.mo109649c(eVar3.f256169b);
                int i4 = eVar3.f256170c;
                C83873p2 p2Var2 = (C83873p2) c2;
                if (p2Var2.f244875i == i4 || p2Var2.f244870d == i4) {
                    z = true;
                }
                if (!z) {
                    Log.m105924i("MicroMsg.AppBrandLivePlayerView", "quitFullScreen already quit full screen");
                } else {
                    C88752e.C88757e eVar4 = (C88752e.C88757e) bVar.f256157f;
                    ((C83873p2) eVar4.f256168a.mo109649c(eVar4.f256169b)).mo116433k(eVar4.f256170c);
                }
                z = true;
            }
            kVar.mo122438a(mo115111l((String) null, z ? C86920e.f252311a : C86920e.f252314d, (JSONObject) null));
        } else {
            kVar.mo122438a(mo115111l((String) null, bVar.mo123190c(optString, jSONObject) ? C86920e.f252311a : C86920e.f252314d, (JSONObject) null));
        }
        return true;
    }
}
