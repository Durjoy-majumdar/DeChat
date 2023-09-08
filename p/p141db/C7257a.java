package p141db;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.File;
import oa1.C117731d;
import org.json.JSONArray;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: db.a */
public class C7257a extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 1207;
    public static final String NAME = "getWxCommFont";

    /* renamed from: w */
    public static boolean m7437w(File file) {
        String absolutePath = file.getAbsolutePath();
        Log.m105925i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath input: [%s]", absolutePath);
        String f = C117731d.m166007c().mo182444f("clicfg_android_wxcommfont_paths", "[\"/system/fonts\", \"/system/etc/fonts\"]", true, true);
        Log.m105925i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath whiteList: [%s]", f);
        JSONArray jSONArray = new JSONArray(f);
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if (absolutePath.startsWith(string)) {
                Log.m105925i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath isWhite?yes[%s]", string);
                return true;
            }
            Log.m105925i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath isWhite?skip[%s]", string);
        }
        Log.m105924i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath no white accept");
        return false;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1001, "fail:invalid request parameter");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 1001);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            i2Var.mo109647a(i, mo115115p("fail:invalid request parameter", jSONObject2));
            return;
        }
        Log.m105925i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont start [%s] ", optString);
        ((C119157j) C119157j.f356862d).mo183884o(new a$$a(this, optString, i2Var, i));
    }
}
