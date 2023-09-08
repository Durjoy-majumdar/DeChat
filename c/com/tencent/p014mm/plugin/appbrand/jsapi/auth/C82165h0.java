package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.h0 */
public class C82165h0 implements C82164h {

    /* renamed from: d */
    public final /* synthetic */ C82164h f240994d;

    /* renamed from: e */
    public final /* synthetic */ JsApiOperateWXData.OperateWXDataTask f240995e;

    public C82165h0(JsApiOperateWXData.OperateWXDataTask operateWXDataTask, C82164h hVar) {
        this.f240995e = operateWXDataTask;
        this.f240994d = hVar;
    }

    /* renamed from: d */
    public void mo56741d() {
        this.f240994d.mo56741d();
        C81879g gVar = this.f240995e.f240858g;
        if (!(gVar == null || gVar.getRuntime() == null)) {
            this.f240995e.f240858g.getRuntime().mo1963B7(this.f240995e);
        }
        this.f240995e.mo114397h();
    }
}
