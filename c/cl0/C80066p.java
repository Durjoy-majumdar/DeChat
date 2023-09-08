package cl0;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.WxaScrollView;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;
import java.util.HashMap;
import jk0.C87981f;
import js0.C88020k;
import org.json.JSONException;
import org.json.JSONObject;
import sn0.C90266f;

/* renamed from: cl0.p */
public class C80066p extends C87981f {
    private static final int CTRL_INDEX = 447;
    public static final String NAME = "updateScrollView";

    /* renamed from: cl0.p$a */
    public class C80067a implements C80070s {

        /* renamed from: a */
        public final /* synthetic */ C82520h f234504a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f234505b;

        /* renamed from: c */
        public final /* synthetic */ int f234506c;

        public C80067a(C82520h hVar, JSONObject jSONObject, int i) {
            this.f234504a = hVar;
            this.f234505b = jSONObject;
            this.f234506c = i;
        }

        /* renamed from: a */
        public void mo110321a(View view, int i, int i2, int i3, int i4) {
            String f;
            if (view instanceof WxaScrollView) {
                C82520h hVar = this.f234504a;
                C80066p pVar = C80066p.this;
                JSONObject jSONObject = this.f234505b;
                pVar.getClass();
                C86493v0.C86495c a = hVar.mo109649c(jSONObject.optBoolean("independent", false)).mo86860a(this.f234506c, false);
                if (a != null && (f = a.mo120959f("data", (String) null)) != null) {
                    ViewGroup targetView = ((WxaScrollView) view).getTargetView();
                    HashMap hashMap = new HashMap();
                    hashMap.put("data", f);
                    hashMap.put("scrollLeft", Integer.valueOf(C88020k.m109554e(i)));
                    hashMap.put("scrollTop", Integer.valueOf(C88020k.m109554e(i2)));
                    hashMap.put("scrollWidth", Integer.valueOf(C88020k.m109554e(targetView.getWidth())));
                    hashMap.put("scrollHeight", Integer.valueOf(C88020k.m109554e(targetView.getHeight())));
                    C80069r rVar = new C80069r();
                    rVar.mo115165o(hashMap);
                    this.f234504a.mo109669n(rVar, (int[]) null);
                }
            }
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105919d("MicroMsg.JsApiUpdateScrollView", "onUpdateView(viewId : %s, %s)", Integer.valueOf(i), jSONObject);
        if (!(view instanceof WxaScrollView)) {
            Log.m105929w("MicroMsg.JsApiUpdateScrollView", "the view(%s) is not a instance of WxaScrollView", Integer.valueOf(i));
            return false;
        }
        WxaScrollView wxaScrollView = (WxaScrollView) view;
        C90266f.m112997a(view, jSONObject.optJSONObject("style"));
        try {
            if (jSONObject.getBoolean("needScrollEvent")) {
                wxaScrollView.setOnScrollChangedListener(new C80067a(hVar, jSONObject, i));
            } else {
                wxaScrollView.setOnScrollChangedListener((C80070s) null);
            }
        } catch (JSONException unused) {
        }
        jSONObject.optInt("scrollLeft", 0);
        if (jSONObject.has("scrollX")) {
            boolean optBoolean = jSONObject.optBoolean("scrollX", true);
            Log.m105925i("MicroMsg.JsApiUpdateScrollView", "scrollHorizontal:%b", Boolean.valueOf(optBoolean));
            wxaScrollView.setScrollHorizontal(optBoolean);
        }
        if (jSONObject.has("scrollY")) {
            boolean optBoolean2 = jSONObject.optBoolean("scrollY", true);
            Log.m105925i("MicroMsg.JsApiUpdateScrollView", "scrollVertical:%b", Boolean.valueOf(optBoolean2));
            wxaScrollView.setScrollVertical(optBoolean2);
        }
        if (jSONObject.has("scrollTop")) {
            int k = C88020k.m109560k(jSONObject, "scrollTop", wxaScrollView.getScrollY());
            Log.m105925i("MicroMsg.JsApiUpdateScrollView", "scrollTop:%d", Integer.valueOf(k));
            wxaScrollView.scrollTo(wxaScrollView.getScrollX(), k);
        }
        return true;
    }
}
