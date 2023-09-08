package fm0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.ArrayList;
import sq0.C90337g;
import sq0.C90338h;
import sq0.C90339i;
import sx3.C64197v;

/* renamed from: fm0.i0 */
public final class C86946i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83820i0 f252368d;

    /* renamed from: e */
    public final /* synthetic */ C81925i2 f252369e;

    /* renamed from: f */
    public final /* synthetic */ boolean f252370f;

    /* renamed from: g */
    public final /* synthetic */ int f252371g;

    /* renamed from: h */
    public final /* synthetic */ C86949j0 f252372h;

    /* renamed from: i */
    public final /* synthetic */ C8479f0<String> f252373i;

    public C86946i0(C83820i0 i0Var, C81925i2 i2Var, boolean z, int i, C86949j0 j0Var, C8479f0<String> f0Var) {
        this.f252368d = i0Var;
        this.f252369e = i2Var;
        this.f252370f = z;
        this.f252371g = i;
        this.f252372h = j0Var;
        this.f252373i = f0Var;
    }

    public final void run() {
        ArrayList arrayList;
        C83820i0 i0Var = this.f252368d;
        C90337g gVar = null;
        String currentUrl = i0Var != null ? i0Var.getCurrentUrl() : null;
        C83820i0 currentPage = this.f252369e.getRuntime().mo113042Z().getCurrentPage();
        if (TextUtils.equals(currentUrl, currentPage != null ? currentPage.getCurrentUrl() : null)) {
            if (this.f252370f) {
                arrayList = new ArrayList();
                boolean z = this.f252370f;
                for (String hVar : C64197v.m75537f("scene_actionbar_back", "scene_back_key_pressed", "scene_jsapi_navigate_back")) {
                    arrayList.add(new C90338h(z, hVar));
                }
            } else {
                arrayList = null;
            }
            C81925i2 i2Var = this.f252369e;
            C8479f0<String> f0Var = this.f252373i;
            C83820i0 currentPage2 = i2Var.getRuntime().mo113042Z().getCurrentPage();
            if (currentPage2 != null) {
                C90339i iVar = C90339i.WITH_CONFIRM_DIALOG;
                if (arrayList != null) {
                    T t = f0Var.f27484d;
                    C87412m.m108593f(t, "content");
                    gVar = new C90337g((String) t, arrayList);
                }
                currentPage2.mo116284H(iVar, gVar);
            }
            this.f252369e.mo109647a(this.f252371g, this.f252372h.mo115109j("ok"));
        }
    }
}
