package cl0;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.WxaScrollView;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;
import java.util.HashMap;
import jk0.C87978d;
import js0.C88020k;
import org.json.JSONObject;
import sn0.C90266f;

/* renamed from: cl0.h */
public class C80055h extends C87978d {
    private static final int CTRL_INDEX = 446;
    public static final String NAME = "insertScrollView";

    /* renamed from: cl0.h$a */
    public class C80056a implements C80070s {

        /* renamed from: a */
        public final /* synthetic */ C82520h f234499a;

        /* renamed from: b */
        public final /* synthetic */ boolean f234500b;

        /* renamed from: c */
        public final /* synthetic */ int f234501c;

        public C80056a(C80055h hVar, C82520h hVar2, boolean z, int i) {
            this.f234499a = hVar2;
            this.f234500b = z;
            this.f234501c = i;
        }

        /* renamed from: a */
        public void mo110321a(View view, int i, int i2, int i3, int i4) {
            C86493v0.C86495c a;
            String f;
            if ((view instanceof WxaScrollView) && (a = this.f234499a.mo109649c(this.f234500b).mo86860a(this.f234501c, false)) != null && (f = a.mo120959f("data", (String) null)) != null) {
                ViewGroup targetView = ((WxaScrollView) view).getTargetView();
                HashMap hashMap = new HashMap();
                hashMap.put("data", f);
                hashMap.put("scrollLeft", Integer.valueOf(C88020k.m109554e(i)));
                hashMap.put("scrollTop", Integer.valueOf(C88020k.m109554e(i2)));
                hashMap.put("scrollWidth", Integer.valueOf(C88020k.m109554e(targetView.getWidth())));
                hashMap.put("scrollHeight", Integer.valueOf(C88020k.m109554e(targetView.getHeight())));
                C80069r rVar = new C80069r();
                rVar.mo115165o(hashMap);
                this.f234499a.mo109669n(rVar, (int[]) null);
            }
        }
    }

    /* renamed from: cl0.h$b */
    public class C80057b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WxaScrollView f234502d;

        /* renamed from: e */
        public final /* synthetic */ int f234503e;

        public C80057b(C80055h hVar, WxaScrollView wxaScrollView, int i) {
            this.f234502d = wxaScrollView;
            this.f234503e = i;
        }

        public void run() {
            WxaScrollView wxaScrollView = this.f234502d;
            wxaScrollView.scrollTo(wxaScrollView.getScrollX(), this.f234503e);
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        return new WxaScrollView(hVar.getContext());
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105919d("MicroMsg.JsApiInsertScrollView", "onInsertView(viewId : %s, %s)", Integer.valueOf(i), jSONObject);
        WxaScrollView wxaScrollView = (WxaScrollView) view;
        boolean optBoolean = jSONObject.optBoolean("needScrollEvent");
        String optString = jSONObject.optString("data", "");
        C90266f.m112997a(view, jSONObject.optJSONObject("style"));
        boolean optBoolean2 = jSONObject.optBoolean("independent", false);
        hVar.mo109649c(optBoolean2).mo86860a(i, true).mo120962i("data", optString);
        if (optBoolean) {
            wxaScrollView.setOnScrollChangedListener(new C80056a(this, hVar, optBoolean2, i));
        }
        jSONObject.optInt("scrollLeft", 0);
        if (jSONObject.has("scrollX")) {
            boolean optBoolean3 = jSONObject.optBoolean("scrollX", true);
            Log.m105925i("MicroMsg.JsApiInsertScrollView", "scrollHorizontal:%b", Boolean.valueOf(optBoolean3));
            wxaScrollView.setScrollHorizontal(optBoolean3);
        }
        if (jSONObject.has("scrollY")) {
            boolean optBoolean4 = jSONObject.optBoolean("scrollY", true);
            Log.m105925i("MicroMsg.JsApiInsertScrollView", "scrollVertical:%b", Boolean.valueOf(optBoolean4));
            wxaScrollView.setScrollVertical(optBoolean4);
        }
        if (jSONObject.has("scrollTop")) {
            int k = C88020k.m109560k(jSONObject, "scrollTop", wxaScrollView.getScrollY());
            Log.m105925i("MicroMsg.JsApiInsertScrollView", "scrollTop:%d", Integer.valueOf(k));
            wxaScrollView.postDelayed(new C80057b(this, wxaScrollView, k), 100);
        }
    }
}
