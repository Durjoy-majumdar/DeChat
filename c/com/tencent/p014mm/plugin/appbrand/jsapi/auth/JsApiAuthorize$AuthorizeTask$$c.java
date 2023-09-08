package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.C1620p;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiAuthorize;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$c */
public class JsApiAuthorize$AuthorizeTask$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JsApiAuthorize.AuthorizeTask f240800d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$c$a */
    public class C82106a implements DialogInterface.OnDismissListener {
        public C82106a() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            JsApiAuthorize.AuthorizeTask authorizeTask = JsApiAuthorize$AuthorizeTask$$c.this.f240800d;
            authorizeTask.f240774f.mo114601x(authorizeTask.f240775g, authorizeTask.f240777i, "fail:risk intercepted");
        }
    }

    public JsApiAuthorize$AuthorizeTask$$c(JsApiAuthorize.AuthorizeTask authorizeTask) {
        this.f240800d = authorizeTask;
    }

    public void run() {
        Context context = this.f240800d.f240775g.getContext();
        JsApiAuthorize.AuthorizeTask authorizeTask = this.f240800d;
        MMAuthScopeRiskInfo mMAuthScopeRiskInfo = authorizeTask.f240766H;
        String str = mMAuthScopeRiskInfo.f11220f;
        String str2 = mMAuthScopeRiskInfo.f11222h;
        String str3 = mMAuthScopeRiskInfo.f11221g;
        C1620p.m1656a(context, str, str2, str3, C1620p.C1621a.m1657a(authorizeTask.f240775g.getContext(), this.f240800d.f240766H), new C82106a());
    }
}
