package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.z1 */
public class C83135z1 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 747;
    public static final String NAME = "batchPreloadMiniProgram";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105919d("MicroMsg.Predownload.JsApiBatchPreloadMiniProgram", "JsApiBatchPreloadMiniProgram data:%s", jSONObject);
        if (jSONObject == null) {
            i2Var.mo109647a(i, mo115109j("fail:data is null or nil"));
            return;
        }
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) i2Var.getRuntime();
        if (appBrandRuntimeWC == null) {
            i2Var.mo109647a(i, mo115109j("fail:runtime error"));
        } else {
            i2Var.mo109647a(i, mo115109j(new AppBrandBatchPreloadController().preload(jSONObject, appBrandRuntimeWC.mo121254q1())));
        }
    }
}
