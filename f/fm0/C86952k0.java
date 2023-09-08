package fm0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import gy3.C8480h;
import java.util.ArrayList;
import org.json.JSONObject;
import sq0.C90337g;
import sq0.C90338h;
import sq0.C90339i;

/* renamed from: fm0.k0 */
public final class C86952k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83820i0 f252381d;

    /* renamed from: e */
    public final /* synthetic */ C81925i2 f252382e;

    /* renamed from: f */
    public final /* synthetic */ C8477a0 f252383f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList<C90338h> f252384g;

    /* renamed from: h */
    public final /* synthetic */ int f252385h;

    /* renamed from: i */
    public final /* synthetic */ C86956l0 f252386i;

    public C86952k0(C83820i0 i0Var, C81925i2 i2Var, C8477a0 a0Var, ArrayList<C90338h> arrayList, int i, C86956l0 l0Var) {
        this.f252381d = i0Var;
        this.f252382e = i2Var;
        this.f252383f = a0Var;
        this.f252384g = arrayList;
        this.f252385h = i;
        this.f252386i = l0Var;
    }

    public final void run() {
        C83820i0 i0Var = this.f252381d;
        C90337g gVar = null;
        String currentUrl = i0Var != null ? i0Var.getCurrentUrl() : null;
        C83820i0 currentPage = this.f252382e.getRuntime().mo113042Z().getCurrentPage();
        if (TextUtils.equals(currentUrl, currentPage != null ? currentPage.getCurrentUrl() : null)) {
            C83820i0 currentPage2 = this.f252382e.getRuntime().mo113042Z().getCurrentPage();
            if (currentPage2 != null) {
                C90339i iVar = C90339i.SILENT;
                if (this.f252383f.f27482d) {
                    gVar = new C90337g((String) null, this.f252384g, 1, (C8480h) null);
                }
                currentPage2.mo116284H(iVar, gVar);
            }
            C81925i2 i2Var = this.f252382e;
            int i = this.f252385h;
            C86956l0 l0Var = this.f252386i;
            l0Var.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            i2Var.mo109647a(i, l0Var.mo115115p("ok", jSONObject));
        }
    }
}
