package xk0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.canvas.widget.C81602a;
import com.tencent.p014mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87981f;
import jk0.C87987k;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: xk0.g */
public class C91268g extends C87981f<C82520h> {
    public static final int CTRL_INDEX = 69;
    public static final String NAME = "drawCanvas";

    /* renamed from: xk0.g$a */
    public class C91269a implements C81602a.C81603a {

        /* renamed from: a */
        public final /* synthetic */ C87987k f261863a;

        public C91269a(C87987k kVar) {
            this.f261863a = kVar;
        }

        /* renamed from: a */
        public void mo113886a(DrawCanvasArg drawCanvasArg) {
            this.f261863a.mo122438a(C91268g.this.mo115109j("ok"));
        }
    }

    /* renamed from: xk0.g$b */
    public class C91270b implements C81602a.C81603a {

        /* renamed from: a */
        public final /* synthetic */ C87987k f261865a;

        public C91270b(C87987k kVar) {
            this.f261865a = kVar;
        }

        /* renamed from: a */
        public void mo113886a(DrawCanvasArg drawCanvasArg) {
            this.f261865a.mo122438a(C91268g.this.mo115109j("ok"));
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("canvasId");
    }

    /* renamed from: F */
    public boolean mo110316F(C82520h hVar, int i, View view, JSONObject jSONObject, C87987k kVar) {
        if (!(view instanceof CoverViewContainer)) {
            Log.m105925i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of CoverViewContainer.(%s)", Integer.valueOf(i));
            return false;
        }
        View view2 = (View) ((CoverViewContainer) view).mo114736d(View.class);
        Log.m105919d("MicroMsg.JsApiDrawCanvas", "drawCanvas(id : %s)", Integer.valueOf(i));
        if (!(view2 instanceof C81602a)) {
            Log.m105925i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of AppBrandDrawableView.(%s)", Integer.valueOf(i));
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        C81602a aVar = (C81602a) view2;
        if (jSONObject.optBoolean("reserve")) {
            aVar.mo113881a(optJSONArray, new C91269a(kVar));
        } else {
            aVar.mo113882b(optJSONArray, new C91270b(kVar));
        }
        aVar.mo113883c();
        Log.m105927v("MicroMsg.JsApiDrawCanvas", "post drawCanvas cost : %sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return true;
    }
}
