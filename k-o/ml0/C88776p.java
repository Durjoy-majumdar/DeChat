package ml0;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87981f;
import org.json.JSONObject;

/* renamed from: ml0.p */
public class C88776p extends C87981f {
    private static final int CTRL_INDEX = 365;
    public static final String NAME = "updateLivePlayer";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("livePlayerId");
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView : livePlayerId=%d", Integer.valueOf(i));
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiUpdateLivePlayer", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        View view2 = (View) ((CoverViewContainer) view).mo114736d(View.class);
        if (!(view2 instanceof C88746b)) {
            Log.m105920e("MicroMsg.JsApiUpdateLivePlayer", "targetView not AppBrandLivePlayerView");
            return false;
        }
        C88746b bVar = (C88746b) view2;
        Bundle a = C88781x.m110845a(jSONObject);
        bVar.f256160i = a.getBoolean("needEvent", bVar.f256160i);
        C21511u e = ((C88782y) bVar.f256156e).mo14925e(a);
        Log.m105925i("MicroMsg.AppBrandLivePlayerView", "onUpdate code:%d info:%s", Integer.valueOf(e.f60905a), e.f60906b);
        return true;
    }
}
