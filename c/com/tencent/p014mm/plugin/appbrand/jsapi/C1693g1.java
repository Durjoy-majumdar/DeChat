package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g1 */
public class C1693g1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JsApiAddNativeDownloadTask.AddNativeDownloadTaskTask f11383d;

    /* renamed from: e */
    public final /* synthetic */ C81925i2 f11384e;

    /* renamed from: f */
    public final /* synthetic */ int f11385f;

    /* renamed from: g */
    public final /* synthetic */ JsApiAddNativeDownloadTask f11386g;

    public C1693g1(JsApiAddNativeDownloadTask jsApiAddNativeDownloadTask, JsApiAddNativeDownloadTask.AddNativeDownloadTaskTask addNativeDownloadTaskTask, C81925i2 i2Var, int i) {
        this.f11386g = jsApiAddNativeDownloadTask;
        this.f11383d = addNativeDownloadTaskTask;
        this.f11384e = i2Var;
        this.f11385f = i;
    }

    public void run() {
        this.f11383d.mo114397h();
        HashMap hashMap = new HashMap();
        JsApiAddNativeDownloadTask.AddNativeDownloadTaskTask addNativeDownloadTaskTask = this.f11383d;
        int i = addNativeDownloadTaskTask.f10921f;
        if (i == 0) {
            this.f11384e.mo109647a(this.f11385f, this.f11386g.mo115109j("fail:cancel"));
        } else if (i == 1) {
            this.f11384e.mo109647a(this.f11385f, this.f11386g.mo115109j("fail:download fail"));
        } else if (i == 2) {
            hashMap.put("download_id", Long.valueOf(addNativeDownloadTaskTask.f10922g));
            this.f11384e.mo109647a(this.f11385f, this.f11386g.mo115112m("ok", hashMap));
        }
    }
}
