package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.game.luggage.model.H5CgiPreloadModel;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameWebTabUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.o */
public class C42303o implements C1256g<H5CgiPreloadModel> {

    /* renamed from: d */
    public final /* synthetic */ GameWebTabUI.C42277c f114382d;

    public C42303o(GameWebTabUI.C42277c cVar) {
        this.f114382d = cVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        H5CgiPreloadModel h5CgiPreloadModel = (H5CgiPreloadModel) obj;
        if (h5CgiPreloadModel != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("timeStamp", h5CgiPreloadModel.f112942d);
                jSONObject.put("cgiReponseStr", h5CgiPreloadModel.f112945g);
                jSONObject.put("cgiCostTimeMs", h5CgiPreloadModel.f112943e);
                jSONObject.put("isRequestFail", h5CgiPreloadModel.f112944f);
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.GameWebTabUI", e.getMessage());
            }
            String format = String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameIndexPreloadData__= %s; })()", new Object[]{jSONObject});
            GameWebTabUI gameWebTabUI = GameWebTabUI.this;
            C1256g<Bundle> gVar = GameWebTabUI.f114316u;
            gameWebTabUI.f112863g.mo67937p(format, (ValueCallback<String>) null);
            Log.m105924i("MicroMsg.GameWebTabUI", "gamelog.setInjectJsPreloadDataCallback.onCallback preloadJsonObj = " + jSONObject);
        }
    }
}
