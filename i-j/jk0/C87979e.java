package jk0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fl0.C86920e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jk0.e */
public abstract class C87979e<CONTEXT extends C82520h> extends C87983g<C82381f> {

    /* renamed from: jk0.e$a */
    public class C87980a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f254578d;

        /* renamed from: e */
        public final /* synthetic */ C40482o f254579e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f254580f;

        /* renamed from: g */
        public final /* synthetic */ int f254581g;

        public C87980a(C82381f fVar, C40482o oVar, JSONObject jSONObject, int i) {
            this.f254578d = fVar;
            this.f254579e = oVar;
            this.f254580f = jSONObject;
            this.f254581g = i;
        }

        public void run() {
            C87979e.this.mo122429C(this.f254578d, this.f254579e, this.f254580f, this.f254581g);
        }
    }

    /* renamed from: C */
    public final void mo122429C(C82381f fVar, C40482o oVar, JSONObject jSONObject, int i) {
        boolean z;
        if (!fVar.mo109648b(mo114779e(), oVar)) {
            fVar.mo109647a(i, "fail:interrupted");
            return;
        }
        C82520h y = mo122433y(fVar, jSONObject);
        if (y == null) {
            Log.m105929w("MicroMsg.BaseRemoveViewJsApi", "invoke JsApi(%s) failed, component view is null", mo114779e());
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:ComponentView is null.");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i, mo115115p("fail:ComponentView is null.", jSONObject2));
        } else if (y.getCustomViewContainer() == null) {
            Log.m105928w("MicroMsg.BaseRemoveViewJsApi", "fail, component custom view container is null");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:remove view failed");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            fVar.mo109647a(i, mo115115p("fail:remove view failed", jSONObject3));
        } else {
            try {
                int B = mo22376B(jSONObject);
                boolean optBoolean = jSONObject.optBoolean("independent", false);
                View p = ((C83873p2) y.mo109649c(optBoolean)).mo116438p(B);
                if ((p instanceof CoverViewContainer) && jSONObject.has("draggable") && jSONObject.optBoolean("draggable", false)) {
                    ((CoverViewContainer) p).getClass();
                    CoverViewContainer.f241363C.remove(Integer.valueOf(B));
                }
                if (((C83873p2) y.mo109649c(optBoolean)).mo116439q(B) != null) {
                    z = ((C83873p2) y.mo109649c(optBoolean)).mo116441s(B);
                    if (z) {
                        z = mo110323D(y, B, p, jSONObject);
                    }
                } else {
                    z = false;
                }
                if (z) {
                    y.mo109649c(optBoolean).mo86861b(B);
                }
                Log.m105925i("MicroMsg.BaseRemoveViewJsApi", "remove view(parentId : %s, viewId : %s, r : %s)", Integer.valueOf(jSONObject.optInt("parentId", 0)), Integer.valueOf(B), Boolean.valueOf(z));
                fVar.mo109647a(i, mo115111l((String) null, z ? C86920e.f252311a : C86920e.f252314d, (JSONObject) null));
            } catch (JSONException e3) {
                Log.m105921e("MicroMsg.BaseRemoveViewJsApi", "get viewId error. exception : %s", e3);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:view id do not exist");
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("errno", 4);
                } catch (Exception e4) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
                }
                fVar.mo109647a(i, mo115115p("fail:view id do not exist", jSONObject4));
            }
        }
    }

    /* renamed from: D */
    public boolean mo110323D(CONTEXT context, int i, View view, JSONObject jSONObject) {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
    }

    /* renamed from: v */
    public void mo114531v(C82381f fVar, JSONObject jSONObject, int i, C40482o oVar) {
        if (MMHandlerThread.isMainThread()) {
            mo122429C(fVar, oVar, jSONObject, i);
        } else {
            MMHandlerThread.postToMainThread(new C87980a(fVar, oVar, jSONObject, i));
        }
    }
}
