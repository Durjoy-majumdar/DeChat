package ml0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87979e;
import org.json.JSONObject;

/* renamed from: ml0.o */
public class C88775o extends C87979e {
    private static final int CTRL_INDEX = 362;
    public static final String NAME = "removeLivePusher";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("livePusherId");
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.JsApiRemoveLivePusher", "onRemoveView livePusherId=%d", Integer.valueOf(i));
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiRemoveLivePusher", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        View view2 = (View) ((CoverViewContainer) view).mo114736d(View.class);
        if (!(view2 instanceof AppBrandLivePusherView)) {
            Log.m105920e("MicroMsg.JsApiRemoveLivePusher", "targetView not AppBrandLivePusherView");
            return false;
        }
        ((AppBrandLivePusherView) view2).mo114909e();
        return true;
    }
}
