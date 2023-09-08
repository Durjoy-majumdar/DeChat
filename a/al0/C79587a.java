package al0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: al0.a */
public class C79587a extends C82919r2 {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onUpdateWXConfig";

    /* renamed from: p */
    public final void mo109702p(AppBrandRuntime appBrandRuntime, String str) {
        try {
            mo115164n("opConfig", new JSONObject(str));
            mo115161k(appBrandRuntime.mo113047b0());
            mo115158h();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsEventOnUpdateWXConfig", "dispatchOpConfig(rt:%s), exception=%s", appBrandRuntime.f238147j, e);
        }
    }
}
