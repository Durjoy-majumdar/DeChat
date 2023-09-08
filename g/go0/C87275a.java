package go0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import fo0.C87017e;
import fo0.C87027l;
import jk0.C87978d;
import jk0.C87987k;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: go0.a */
public class C87275a extends C87978d {
    private static final int CTRL_INDEX = 672;
    public static final String NAME = "insertXWebCanvas";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* renamed from: C */
    public boolean mo121671C() {
        return true;
    }

    /* renamed from: D */
    public boolean mo121672D() {
        return true;
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        Context context = hVar.getContext();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("position");
            optJSONObject.optInt("width", 300);
            optJSONObject.optInt("height", 150);
            C87278d dVar = new C87278d(context, C87027l.m108053a(hVar), jSONObject.getInt("viewId"), hVar.getAppId());
            hVar.mo114864j(new a$$b(this, dVar));
            hVar.mo114868y(new a$$c(this, dVar));
            hVar.mo114865m(new a$$d(this, dVar));
            return new CoverViewContainer(context, (View) dVar);
        } catch (JSONException e) {
            Log.printInfoStack("Luggage.JsApiInsertXWebCanvasTextureView", "insertXWebCanvas fail: %s", e);
            return null;
        }
    }

    /* renamed from: G */
    public boolean mo114664G() {
        return true;
    }

    /* renamed from: I */
    public void mo114665I(C82520h hVar, int i, View view, JSONObject jSONObject, C87987k kVar) {
        C87278d dVar = (C87278d) ((CoverViewContainer) view).mo114736d(C87278d.class);
        if (dVar.getAttachedApp() == null) {
            C87017e eVar = (C87017e) hVar.mo109668l(C87017e.class);
            if (!(eVar == null ? false : eVar.mo121427kG(new a$$a(dVar, hVar)))) {
                kVar.mo122438a(mo115109j("fail skia canvas unavailable"));
            }
        }
        dVar.setOnReadyListener(new a$$e(this, kVar));
    }
}
