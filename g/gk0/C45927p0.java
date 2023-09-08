package gk0;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gk0.p0 */
public class C45927p0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f123921d;

    public C45927p0(C45931t0 t0Var, C83780d1 d1Var) {
        this.f123921d = d1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do know the auth auto fill data protocol");
        String str = this.f123921d.getContext().getString(C0966R.string.f7612lf) + "" + LocaleUtil.getApplicationLanguage();
        Log.m105924i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do open url:" + str);
        ((C40469j0) this.f123921d.mo109668l(C40469j0.class)).mo56167JF(this.f123921d.getContext(), str, "", (C40469j0.C40470a) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
