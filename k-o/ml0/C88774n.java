package ml0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87979e;
import org.json.JSONObject;

/* renamed from: ml0.n */
public class C88774n extends C87979e {
    private static final int CTRL_INDEX = 366;
    public static final String NAME = "removeLivePlayer";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("livePlayerId");
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.JsApiRemoveLivePlayer", "onRemoveView livePlayerId=%d", Integer.valueOf(i));
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiRemoveLivePlayer", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        View view2 = (View) ((CoverViewContainer) view).mo114736d(View.class);
        if (!(view2 instanceof C88746b)) {
            Log.m105920e("MicroMsg.JsApiRemoveLivePlayer", "targetView not AppBrandLivePlayerView");
            return false;
        }
        ((C88746b) view2).mo123188a();
        return true;
    }
}
