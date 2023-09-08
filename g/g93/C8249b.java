package g93;

import com.tencent.p014mm.plugin.appbrand.jsapi.C83135z1;
import com.tencent.p014mm.plugin.appbrand.preload.IAppBrandBatchPreloadController;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import java.util.Map;
import org.json.JSONObject;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: g93.b */
public class C8249b extends C15053a {
    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        JSONObject jSONObject = h1Var.f38991d;
        if (jSONObject == null) {
            return false;
        }
        String preload = ((IAppBrandBatchPreloadController) C86312j.m106911c(IAppBrandBatchPreloadController.class)).preload(jSONObject, true);
        if (!Util.isNullOrNil(preload)) {
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, h1Var.f38996i + XVFSFile.PATH_SEPARATOR + preload, (Map<String, Object>) null);
        } else {
            C13849g gVar2 = jVar.f39001d;
            String str2 = h1Var.f38990c;
            gVar2.mo10774a(str2, h1Var.f38996i + ":error", (Map<String, Object>) null);
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 366;
    }

    /* renamed from: c */
    public String mo7288c() {
        return C83135z1.NAME;
    }
}
