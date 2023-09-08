package ll0;

import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import org.json.JSONObject;

/* renamed from: ll0.i */
public class C88578i extends C82016a0<C83780d1> {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "restoreWebviewFocus";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        new C88577h(this, (C83780d1) fVar, jSONObject.optBoolean("focus", false)).exec(new MMHandler(Looper.getMainLooper()));
        return mo115109j("ok");
    }
}
