package r42;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.magicbrush.MBAppBrandAdaptor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: r42.a */
public class C89869a extends C82268c<MBAppBrandAdaptor> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "finishLoading";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        MBAppBrandAdaptor mBAppBrandAdaptor = (MBAppBrandAdaptor) fVar;
        Log.m105924i("MicroMsg.JsApiFinishLoading", "[mb] finish loading.");
        mBAppBrandAdaptor.getFileSystem().release();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        mBAppBrandAdaptor.mo109647a(i, mo115115p("ok", jSONObject2));
    }
}
