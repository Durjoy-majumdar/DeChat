package com.tencent.p014mm.plugin.appbrand.launching;

import android.text.TextUtils;
import fy3.C32226l;
import java.util.Set;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.s3 */
public class C55535s3 implements C32226l<Object, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Set f158142d;

    public C55535s3(C83471t3 t3Var, Set set) {
        this.f158142d = set;
    }

    public Object invoke(Object obj) {
        if (obj instanceof JSONObject) {
            String optString = ((JSONObject) obj).optString("plugin_id");
            if (!TextUtils.isEmpty(optString)) {
                this.f158142d.add(optString);
            }
        }
        return C13598b0.f38549a;
    }
}
