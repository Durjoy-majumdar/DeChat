package gk0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import te3.C52225z7;

/* renamed from: gk0.n0 */
public class C45925n0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52225z7 f123913d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f123914e;

    /* renamed from: f */
    public final /* synthetic */ int f123915f;

    /* renamed from: g */
    public final /* synthetic */ C45931t0 f123916g;

    public C45925n0(C45931t0 t0Var, C52225z7 z7Var, C83780d1 d1Var, int i) {
        this.f123916g = t0Var;
        this.f123913d = z7Var;
        this.f123914e = d1Var;
        this.f123915f = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.JsApiRequestAuthUserAutoFillData", "showAlertImplNew, acceptButton");
        this.f123913d.f145733f = true;
        this.f123914e.mo109647a(this.f123915f, this.f123916g.mo115109j("ok"));
        C45931t0.m51191w(this.f123916g, this.f123914e, this.f123913d);
        C45931t0 t0Var = this.f123916g;
        C87231a1 a1Var = t0Var.f123930g;
        if (a1Var != null) {
            a1Var.dismiss();
            t0Var.f123930g = null;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
