package fm0;

import com.google.android.gms.common.internal.Constants;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C8477a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import my3.C34690i;
import my3.C61595o;
import org.json.JSONArray;
import org.json.JSONObject;
import sq0.C90338h;
import sx3.C36904l0;

/* renamed from: fm0.l0 */
public final class C86956l0 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 880;
    public static final String NAME = "setNavigateBackInterception";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var != null && jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray(Constants.KEY_SCOPES);
            if (optJSONArray == null || optJSONArray.length() == 0) {
                i2Var.mo109647a(i, mo115109j("fail:scopes is empty"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            C8477a0 a0Var = new C8477a0();
            Iterator it = C61595o.m72301i(0, optJSONArray.length()).iterator();
            while (((C34690i) it).hasNext()) {
                Object obj = optJSONArray.get(((C36904l0) it).mo59695a());
                C87412m.m108592e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj;
                boolean optBoolean = jSONObject2.optBoolean("interception", false);
                a0Var.f27482d |= optBoolean;
                try {
                    int optInt = jSONObject2.optInt("type", 0);
                    if (optInt == 1) {
                        str = "scene_swipe_back";
                    } else if (optInt == 2) {
                        str = "scene_back_key_pressed";
                    } else if (optInt == 3) {
                        str = "scene_actionbar_back";
                    } else if (optInt == 4) {
                        str = "scene_jsapi_navigate_back";
                    } else {
                        throw new IllegalArgumentException("illegal type!");
                    }
                    arrayList.add(new C90338h(optBoolean, str));
                } catch (IllegalArgumentException unused) {
                    i2Var.mo109647a(i, mo115109j("fail:illegal type"));
                    return;
                }
            }
            i2Var.mo109673t(new C86952k0(i2Var.getRuntime().mo113042Z().getCurrentPage(), i2Var, a0Var, arrayList, i, this));
        }
    }
}
