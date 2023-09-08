package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;
import p918s2.C90111a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.b1 */
public class C82697b1 implements C90111a.C90113b {

    /* renamed from: d */
    public final /* synthetic */ C82381f f241983d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f241984e;

    /* renamed from: f */
    public final /* synthetic */ int f241985f;

    /* renamed from: g */
    public final /* synthetic */ JsApiChooseVideo f241986g;

    public C82697b1(JsApiChooseVideo jsApiChooseVideo, C82381f fVar, JSONObject jSONObject, int i) {
        this.f241986g = jsApiChooseVideo;
        this.f241983d = fVar;
        this.f241984e = jSONObject;
        this.f241985f = i;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 115) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                this.f241983d.mo109647a(this.f241985f, this.f241986g.mo115109j("fail:system permission denied"));
            } else {
                this.f241986g.mo1505u(this.f241983d, this.f241984e, this.f241985f);
            }
        }
    }
}
