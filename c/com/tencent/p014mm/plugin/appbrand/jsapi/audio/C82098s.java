package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p918s2.C90111a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.s */
public class C82098s implements C90111a.C90113b {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f240745d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f240746e;

    /* renamed from: f */
    public final /* synthetic */ int f240747f;

    /* renamed from: g */
    public final /* synthetic */ JsApiOperateRecorder f240748g;

    public C82098s(JsApiOperateRecorder jsApiOperateRecorder, C81925i2 i2Var, JSONObject jSONObject, int i) {
        this.f240748g = jsApiOperateRecorder;
        this.f240745d = i2Var;
        this.f240746e = jSONObject;
        this.f240747f = i;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 116) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                Log.m105920e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, SYS_PERM_DENIED");
                this.f240745d.mo109647a(this.f240747f, this.f240748g.mo115109j("fail:system permission denied"));
                return;
            }
            Log.m105924i("MicroMsg.Record.JsApiOperateRecorder", "PERMISSION_GRANTED, do invoke again");
            this.f240748g.mo1505u(this.f240745d, this.f240746e, this.f240747f);
        }
    }
}
