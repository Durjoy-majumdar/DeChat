package p284zb;

import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.utils.C84768n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Objects;

/* renamed from: zb.d$$l */
public class d$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f262568d;

    /* renamed from: e */
    public final /* synthetic */ C91633d f262569e;

    public d$$l(C91633d dVar, String str) {
        this.f262569e = dVar;
        this.f262568d = str;
    }

    public void run() {
        if (this.f262569e.f262531h) {
            try {
                C91645l lVar = new C91645l(this.f262568d);
                C91635f fVar = (C91635f) this.f262569e.mo124764Z();
                Objects.requireNonNull(fVar);
                lVar.mo125537a(fVar);
            } catch (Exception unused) {
                Log.m105920e("Luggage.AppBrandMiniProgramServiceLogicImp", "loadModule using isolate context, notify but get exception %s");
            }
        } else if (ModulePkgInfo.MAIN_MODULE_NAME.equals(this.f262568d)) {
            this.f262569e.mo125504K0();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f262568d);
            String str = "/";
            if (this.f262568d.endsWith(str)) {
                str = "";
            }
            sb.append(str);
            sb.append("app-service.js");
            String sb4 = sb.toString();
            C84768n1.m104434j(((C91635f) this.f262569e.mo124764Z()).getRuntime(), ((C91635f) this.f262569e.mo124764Z()).getJsRuntime(), C81247g3.m99555k(((C91635f) this.f262569e.mo124764Z()).getRuntime(), false).mo113498b(sb4).mo63190c(), sb4, "", "", C84768n1.C84773e.USR, new d$$p(sb4, (C91635f) this.f262569e.mo124764Z(), (d$$h) null));
        }
    }
}
