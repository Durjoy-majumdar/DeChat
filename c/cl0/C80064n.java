package cl0;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import jk0.C87981f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sn0.C90266f;

/* renamed from: cl0.n */
public class C80064n extends C87981f {
    private static final int CTRL_INDEX = 810;
    public static final String NAME = "updateImagePreviewer";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        float[] z;
        Log.m105919d("MicroMsg.JsApiUpdateImagePreviewer", "onUpdateView(viewId : %s, %s)", Integer.valueOf(i), jSONObject);
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiUpdateImagePreviewer", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        ZoomImagePreviewer zoomImagePreviewer = (ZoomImagePreviewer) ((CoverViewContainer) view).mo114736d(ZoomImagePreviewer.class);
        if (zoomImagePreviewer == null) {
            Log.m105929w("MicroMsg.JsApiUpdateImagePreviewer", "the target view(%s) is null", Integer.valueOf(i));
            return false;
        }
        C90266f.m112997a(view, jSONObject.optJSONObject("style"));
        try {
            if (jSONObject.has("position") && (z = mo122434z(jSONObject)) != null) {
                zoomImagePreviewer.f345344S0 = (int) z[2];
                zoomImagePreviewer.f345345T0 = (int) z[3];
            }
            if (jSONObject.has("scale")) {
                zoomImagePreviewer.setScale((float) jSONObject.optDouble("scale"));
            }
            if (jSONObject.has("urls")) {
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("urls");
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String obj = optJSONArray.get(i2).toString();
                        if (!TextUtils.isEmpty(obj)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    Log.m105920e("MicroMsg.JsApiUpdateImagePreviewer", "urls is empty");
                }
                if (!arrayList.isEmpty()) {
                    zoomImagePreviewer.mo175007f(arrayList);
                }
            }
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.JsApiUpdateImagePreviewer", e, "", new Object[0]);
        }
        return true;
    }
}
