package p518fb;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import org.json.JSONObject;

/* renamed from: fb.s */
public class C86797s extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 463;
    private static final String NAME = "updateKeyboard";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        MMHandlerThread.postToMainThread(new C86796r(this, (C81925i2) fVar, jSONObject.optString("value"), i));
    }
}
