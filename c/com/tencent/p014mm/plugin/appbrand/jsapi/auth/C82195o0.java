package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import j20.C117292a;
import java.util.ArrayList;
import te3.C90429p4;
import yq0.C91566l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.o0 */
public final class C82195o0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91566l f241062d;

    /* renamed from: e */
    public final /* synthetic */ C81879g f241063e;

    /* renamed from: f */
    public final /* synthetic */ C90429p4 f241064f;

    public C82195o0(C91566l lVar, C81879g gVar, C90429p4 p4Var) {
        this.f241062d = lVar;
        this.f241063e = gVar;
        this.f241064f = p4Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/auth/WxaCarLicensePlateChooserViewController$initHalfScreenDialog$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C91566l lVar = this.f241062d;
        C81879g gVar = this.f241063e;
        lVar.mo121450n(gVar, this.f241064f.f259730e, (C40469j0) gVar.mo109668l(C40469j0.class)).mo121451o(this.f241063e);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/WxaCarLicensePlateChooserViewController$initHalfScreenDialog$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
