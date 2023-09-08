package fm0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import org.json.JSONObject;

/* renamed from: fm0.a1 */
public class C86926a1 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 418;
    public static final String NAME = "setTabBarItem";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        try {
            int i2 = jSONObject.getInt(FirebaseAnalytics.C113379b.INDEX);
            C81925i2 i2Var2 = i2Var;
            int i3 = i;
            C86993z0 z0Var = new C86993z0(this, i2Var2, i3, jSONObject.optString("iconPath", ""), i2, jSONObject.optString(MimeTypes.BASE_TYPE_TEXT, (String) null), jSONObject.optString("selectedIconPath", ""));
            if (!i2Var.getRuntime().mo113039X0()) {
                z0Var.run();
            } else {
                i2Var.getRuntime().mo113020N0(z0Var);
            }
        } catch (Exception unused) {
            i2Var.mo109647a(i, mo115109j("fail:invalid data"));
        }
    }
}
