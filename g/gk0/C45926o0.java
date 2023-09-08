package gk0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import te3.C52225z7;

/* renamed from: gk0.o0 */
public class C45926o0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52225z7 f123917d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f123918e;

    /* renamed from: f */
    public final /* synthetic */ int f123919f;

    /* renamed from: g */
    public final /* synthetic */ C45931t0 f123920g;

    public C45926o0(C45931t0 t0Var, C52225z7 z7Var, C83780d1 d1Var, int i) {
        this.f123920g = t0Var;
        this.f123917d = z7Var;
        this.f123918e = d1Var;
        this.f123919f = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.JsApiRequestAuthUserAutoFillData", "showAlertImplNew, rejectButton");
        this.f123917d.f145733f = false;
        this.f123918e.mo109647a(this.f123919f, this.f123920g.mo115109j("cancel"));
        C45931t0.m51191w(this.f123920g, this.f123918e, this.f123917d);
        C45931t0 t0Var = this.f123920g;
        C87231a1 a1Var = t0Var.f123930g;
        if (a1Var != null) {
            a1Var.dismiss();
            t0Var.f123930g = null;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
