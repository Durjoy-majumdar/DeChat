package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import org.json.JSONObject;
import p918s2.C90111a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.z */
public class C82105z implements C90111a.C90113b {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f240755d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f240756e;

    /* renamed from: f */
    public final /* synthetic */ int f240757f;

    /* renamed from: g */
    public final /* synthetic */ JsApiStartRecordVoice f240758g;

    public C82105z(JsApiStartRecordVoice jsApiStartRecordVoice, C81925i2 i2Var, JSONObject jSONObject, int i) {
        this.f240758g = jsApiStartRecordVoice;
        this.f240755d = i2Var;
        this.f240756e = jSONObject;
        this.f240757f = i;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 116) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                this.f240755d.mo109647a(this.f240757f, this.f240758g.mo115109j("fail:system permission denied"));
            } else {
                this.f240758g.mo1505u(this.f240755d, this.f240756e, this.f240757f);
            }
        }
    }
}
