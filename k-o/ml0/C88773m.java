package ml0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import jk0.C87981f;
import jk0.C87987k;
import org.json.JSONObject;

/* renamed from: ml0.m */
public class C88773m extends C87981f {
    private static final int CTRL_INDEX = 363;
    public static final String NAME = "operateLivePusher";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("livePusherId");
    }

    /* renamed from: D */
    public boolean mo110315D() {
        return true;
    }

    /* renamed from: F */
    public boolean mo110316F(C82520h hVar, int i, View view, JSONObject jSONObject, C87987k kVar) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        C82520h hVar2 = hVar;
        View view2 = view;
        JSONObject jSONObject2 = jSONObject;
        C87987k kVar2 = kVar;
        Log.m105925i("MicroMsg.JsApiOperateLivePusher", "onOperateView : livePusherId=%d", Integer.valueOf(i));
        if (!(view2 instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiOperateLivePusher", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        View view3 = (View) ((CoverViewContainer) view2).mo114736d(View.class);
        if (!(view3 instanceof AppBrandLivePusherView)) {
            Log.m105920e("MicroMsg.JsApiOperateLivePusher", "targetView not AppBrandLivePusherView");
            return false;
        }
        AppBrandLivePusherView appBrandLivePusherView = (AppBrandLivePusherView) view3;
        String optString = jSONObject2.optString("type");
        Log.m105925i("MicroMsg.JsApiOperateLivePusher", "onOperateView operateType=%s", optString);
        if (optString.equalsIgnoreCase(AppBrandFileCleaner.f238098c)) {
            appBrandLivePusherView.setSnapshotListener(new C88772l(this, kVar2, hVar2));
            if (!appBrandLivePusherView.mo114910f(AppBrandFileCleaner.f238098c, jSONObject2)) {
                if (BuildInfo.DEBUG) {
                    i5 = 4;
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                } else {
                    i5 = 4;
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", i5);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                kVar2.mo122438a(mo115115p("fail:internal error", jSONObject3));
            }
        } else if (optString.equalsIgnoreCase("playBGM")) {
            String optString2 = jSONObject2.optString("url");
            if (Util.isNullOrNil(optString2)) {
                Log.m105928w("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, url is nil");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:url is nil");
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("errno", 101);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                kVar2.mo122438a(mo115115p("fail:url is nil", jSONObject4));
            } else {
                C84795y.m104477c(hVar2, optString2, (String) null, new C88771k(this, jSONObject2, appBrandLivePusherView, optString2));
                if (BuildInfo.DEBUG) {
                    i4 = 0;
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                } else {
                    i4 = 0;
                }
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("errno", i4);
                } catch (Exception e3) {
                    Exception exc = e3;
                    Object[] objArr = new Object[1];
                    objArr[i4] = exc;
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", objArr);
                }
                kVar2.mo122438a(mo115115p("ok", jSONObject5));
            }
        } else if (appBrandLivePusherView.mo114910f(optString, jSONObject2)) {
            if (BuildInfo.DEBUG) {
                i3 = 0;
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            } else {
                i3 = 0;
            }
            JSONObject jSONObject6 = new JSONObject();
            try {
                jSONObject6.put("errno", i3);
            } catch (Exception e4) {
                Exception exc2 = e4;
                Object[] objArr2 = new Object[1];
                objArr2[i3] = exc2;
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", objArr2);
            }
            kVar2.mo122438a(mo115115p("ok", jSONObject6));
        } else {
            if (BuildInfo.DEBUG) {
                i2 = 4;
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            } else {
                i2 = 4;
            }
            JSONObject jSONObject7 = new JSONObject();
            try {
                jSONObject7.put("errno", i2);
                z = true;
            } catch (Exception e5) {
                z = true;
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e5);
            }
            kVar2.mo122438a(mo115115p("fail:internal error", jSONObject7));
            return z;
        }
        return true;
    }
}
