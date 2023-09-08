package ml0;

import android.view.View;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import jk0.C87981f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ml0.t */
public class C88780t extends C87981f {
    private static final int CTRL_INDEX = 361;
    public static final String NAME = "updateLivePusher";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("livePusherId");
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView : livePusherId=%d", Integer.valueOf(i));
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiUpdateLivePusher", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        View view2 = (View) ((CoverViewContainer) view).mo114736d(View.class);
        if (!(view2 instanceof AppBrandLivePusherView)) {
            Log.m105920e("MicroMsg.JsApiUpdateLivePusher", "targetView not AppBrandLivePusherView");
            return false;
        }
        AppBrandLivePusherView appBrandLivePusherView = (AppBrandLivePusherView) view2;
        if (jSONObject.has(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE)) {
            appBrandLivePusherView.f241759h = jSONObject.optString(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, appBrandLivePusherView.f241759h);
            jSONObject.optString("filterImageMd5", (String) null);
            if (Util.isNullOrNil(appBrandLivePusherView.f241759h)) {
                try {
                    jSONObject.put(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, "");
                } catch (JSONException e) {
                    Log.m105929w("MicroMsg.JsApiUpdateLivePusher", "parseFilterImage, ignore exception:%s", e);
                }
            } else if (appBrandLivePusherView.f241759h.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || appBrandLivePusherView.f241759h.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                jSONObject.remove(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE);
            }
        }
        appBrandLivePusherView.mo114911g(C88781x.m110846b(jSONObject));
        try {
            if (jSONObject.has(V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE)) {
                String string = jSONObject.getString(V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE);
                String optString = jSONObject.optString("backgroundMD5");
                if (Util.isNullOrNil(string)) {
                    Log.m105924i("MicroMsg.JsApiUpdateLivePusher", "convertBackgroundImageToLocalPath, url is null");
                } else {
                    C84795y.m104477c(hVar, string, optString, new C88777q(this, appBrandLivePusherView, string));
                }
            }
        } catch (JSONException e2) {
            Log.m105925i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE, e2.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE)) {
                String string2 = jSONObject.getString(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE);
                if (Util.isNullOrNil(string2)) {
                    Log.m105924i("MicroMsg.JsApiUpdateLivePusher", "convertFilterImageToLocalPath, url is null");
                } else {
                    C84795y.m104477c(hVar, string2, (String) null, new C88778r(this, appBrandLivePusherView, string2));
                }
            }
        } catch (JSONException e3) {
            Log.m105925i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, e3.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE)) {
                String string3 = jSONObject.getString(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE);
                String optString2 = jSONObject.optString("watermarkMD5");
                if (Util.isNullOrNil(string3)) {
                    Log.m105924i("MicroMsg.JsApiUpdateLivePusher", "convertWatermarkImageToLocalPath, url is null");
                } else {
                    C84795y.m104477c(hVar, string3, optString2, new C88779s(this, appBrandLivePusherView));
                }
            }
        } catch (JSONException e4) {
            Log.m105925i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE, e4.getLocalizedMessage());
        }
        return true;
    }
}
