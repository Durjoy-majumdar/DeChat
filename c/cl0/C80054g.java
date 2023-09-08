package cl0;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import jk0.C87978d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sn0.C90249b;
import sn0.C90266f;

/* renamed from: cl0.g */
public class C80054g extends C87978d<C83780d1> {
    private static final int CTRL_INDEX = 809;
    public static final String NAME = "insertImagePreviewer";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* renamed from: F */
    public View mo110320F(C82520h hVar, JSONObject jSONObject, int i) {
        C83780d1 d1Var = (C83780d1) hVar;
        Context context = d1Var.getContext();
        ZoomImagePreviewer zoomImagePreviewer = new ZoomImagePreviewer(context, (AttributeSet) null);
        zoomImagePreviewer.setComponent(d1Var);
        zoomImagePreviewer.setViewId(jSONObject.optInt("viewId", 0));
        return new CoverViewContainer(context, (View) zoomImagePreviewer);
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        float[] z;
        C83780d1 d1Var = (C83780d1) hVar;
        Log.m105919d("MicroMsg.JsApiInsertImagePreviewer", "insertImagePreviewer(viewId : %s, %s)", Integer.valueOf(i), jSONObject);
        Log.m105919d("MicroMsg.JsApiInsertImagePreviewer", "onInsertView(viewId : %s, %s)", Integer.valueOf(i), jSONObject);
        ZoomImagePreviewer zoomImagePreviewer = (ZoomImagePreviewer) ((CoverViewContainer) view).mo114736d(ZoomImagePreviewer.class);
        if (zoomImagePreviewer == null) {
            Log.m105929w("MicroMsg.JsApiInsertImagePreviewer", "onInsertView(viewId : %d) failed, targetView is null", Integer.valueOf(i));
            return;
        }
        C90266f.m112997a(view, jSONObject.optJSONObject("style"));
        C90249b.m112984a(zoomImagePreviewer, jSONObject);
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
                    Log.m105920e("MicroMsg.JsApiInsertImagePreviewer", "urls is empty");
                }
                if (!arrayList.isEmpty()) {
                    zoomImagePreviewer.setData(arrayList);
                }
            }
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.JsApiInsertImagePreviewer", e, "", new Object[0]);
        }
    }
}
