package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.p0 */
public final class C82196p0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C82185m0 f241065d;

    public C82196p0(C82185m0 m0Var) {
        this.f241065d = m0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/auth/WxaCarLicensePlateChooserViewController$initHalfScreenDialog$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C82185m0 m0Var = this.f241065d;
        m0Var.f241043h.f236460j = 2;
        m0Var.mo114596i(m0Var.mo114595h(), new C82200r0(m0Var));
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/WxaCarLicensePlateChooserViewController$initHalfScreenDialog$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
