package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.q3 */
public class C1842q3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f11648d;

    /* renamed from: e */
    public final /* synthetic */ int f11649e;

    /* renamed from: f */
    public final /* synthetic */ JsApiLaunchApplicationDirectly f11650f;

    public C1842q3(JsApiLaunchApplicationDirectly jsApiLaunchApplicationDirectly, C81925i2 i2Var, int i) {
        this.f11650f = jsApiLaunchApplicationDirectly;
        this.f11648d = i2Var;
        this.f11649e = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.JsApiLaunchApplicationDirectly", "fail:user canceled install");
        JsApiLaunchApplicationDirectly jsApiLaunchApplicationDirectly = this.f11650f;
        C81925i2 i2Var = this.f11648d;
        jsApiLaunchApplicationDirectly.getClass();
        MMHandlerThread.postToMainThread(new C82866o3(jsApiLaunchApplicationDirectly, i2Var));
        this.f11648d.mo109647a(this.f11649e, this.f11650f.mo115109j("fail:user canceled install"));
    }
}
