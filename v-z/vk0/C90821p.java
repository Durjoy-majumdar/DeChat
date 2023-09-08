package vk0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87979e;
import org.json.JSONObject;
import vk0.C90809a;

/* renamed from: vk0.p */
public class C90821p extends C87979e {
    private static final int CTRL_INDEX = 330;
    public static final String NAME = "removeCamera";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("cameraId", 0);
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.JsApiRemoveCamera", "onRemoveView cameraId=%d", Integer.valueOf(i));
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiRemoveCamera", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        View view2 = (View) ((CoverViewContainer) view).mo114736d(View.class);
        if (view2 == null || !(view2 instanceof C90815g)) {
            Log.m105929w("MicroMsg.JsApiRemoveCamera", "the camera view(%s) is null", Integer.valueOf(i));
            return false;
        }
        C90815g gVar = (C90815g) view2;
        hVar.mo114866q(gVar);
        hVar.mo114863i(gVar);
        hVar.mo114867r(gVar);
        C90809a.C90811b.f260763a.mo124932b(gVar.getCameraId(), true);
        gVar.release();
        return true;
    }
}
