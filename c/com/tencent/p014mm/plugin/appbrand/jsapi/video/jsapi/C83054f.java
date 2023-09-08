package com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import jk0.C87979e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f */
public class C83054f extends C87979e {
    private static final int CTRL_INDEX = 7;
    public static final String NAME = "removeVideoPlayer";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f$a */
    public class C83055a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandVideoView f242795d;

        public C83055a(C83054f fVar, AppBrandVideoView appBrandVideoView) {
            this.f242795d = appBrandVideoView;
        }

        public void run() {
            this.f242795d.mo22219f();
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("videoPlayerId", 0);
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.JsApiRemoveVideoPlayer", "onRemoveView videoPlayerId=%d", Integer.valueOf(i));
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiRemoveVideoPlayer", "view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        AppBrandVideoView appBrandVideoView = (AppBrandVideoView) ((CoverViewContainer) view).mo114736d(AppBrandVideoView.class);
        if (appBrandVideoView == null) {
            Log.m105928w("MicroMsg.JsApiRemoveVideoPlayer", "view not AppBrandVideoView");
            return false;
        }
        MMHandlerThread.postToMainThread(new C83055a(this, appBrandVideoView));
        return true;
    }
}
