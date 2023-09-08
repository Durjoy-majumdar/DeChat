package cl0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87979e;
import org.json.JSONObject;

/* renamed from: cl0.j */
public class C80060j extends C87979e {
    private static final int CTRL_INDEX = 811;
    public static final String NAME = "removeImagePreviewer";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105919d("MicroMsg.JsApiRemoveImagePreviewer", "insertImagePreviewer(viewId : %s, %s)", Integer.valueOf(i), jSONObject);
        hVar.getCustomViewContainer().mo86861b(i);
        return true;
    }
}
