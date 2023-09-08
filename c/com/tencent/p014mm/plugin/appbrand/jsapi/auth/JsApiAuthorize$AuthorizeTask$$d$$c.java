package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiAuthorize;
import j20.C117292a;
import java.util.ArrayList;
import yq0.C91566l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$d$$c */
public class JsApiAuthorize$AuthorizeTask$$d$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91566l f240795d;

    /* renamed from: e */
    public final /* synthetic */ JsApiAuthorize$AuthorizeTask$$d f240796e;

    public JsApiAuthorize$AuthorizeTask$$d$$c(JsApiAuthorize$AuthorizeTask$$d jsApiAuthorize$AuthorizeTask$$d, C91566l lVar) {
        this.f240796e = jsApiAuthorize$AuthorizeTask$$d;
        this.f240795d = lVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiAuthorize$AuthorizeTask$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C91566l lVar = this.f240795d;
        JsApiAuthorize.AuthorizeTask authorizeTask = this.f240796e.f240803e;
        C81879g gVar = authorizeTask.f240775g;
        lVar.mo121450n(gVar, authorizeTask.f240760B, (C40469j0) gVar.mo109668l(C40469j0.class)).mo121451o(this.f240796e.f240803e.f240775g);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiAuthorize$AuthorizeTask$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
