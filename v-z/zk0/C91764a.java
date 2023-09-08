package zk0;

import com.tencent.p014mm.plugin.appbrand.extendplugin.C81825d;
import org.json.JSONObject;

/* renamed from: zk0.a */
public class C91764a extends C81825d {
    /* renamed from: w */
    public String mo114214w() {
        return "webgl";
    }

    /* renamed from: x */
    public int mo114215x(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("canvasId", -1);
        }
        return -1;
    }
}
