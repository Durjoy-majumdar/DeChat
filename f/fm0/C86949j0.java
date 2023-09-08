package fm0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8479f0;
import org.json.JSONObject;

/* renamed from: fm0.j0 */
public final class C86949j0 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 772;
    public static final String NAME = "setNavigateBackConfirmDialog";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var != null && jSONObject != null) {
            boolean optBoolean = jSONObject.optBoolean("enable", false);
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = jSONObject.optString("content");
            Log.m105924i("JsApiSetNavigateBackConfirmDialog", "[invoke] enable=" + optBoolean + "  content=" + ((String) f0Var.f27484d));
            if (Util.isNullOrNil((String) f0Var.f27484d)) {
                f0Var.f27484d = i2Var.getContext().getResources().getString(C0966R.string.gkx);
            }
            MMHandlerThread.postToMainThread(new C86946i0(i2Var.getRuntime().mo113042Z().getCurrentPage(), i2Var, optBoolean, i, this, f0Var));
        }
    }
}
