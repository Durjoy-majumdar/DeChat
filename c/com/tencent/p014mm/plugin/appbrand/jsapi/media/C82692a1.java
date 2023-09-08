package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;
import p918s2.C90111a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.a1 */
public class C82692a1 implements C90111a.C90113b {

    /* renamed from: d */
    public final /* synthetic */ C82381f f241974d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f241975e;

    /* renamed from: f */
    public final /* synthetic */ int f241976f;

    /* renamed from: g */
    public final /* synthetic */ JsApiChooseMultiMedia f241977g;

    public C82692a1(JsApiChooseMultiMedia jsApiChooseMultiMedia, C82381f fVar, JSONObject jSONObject, int i) {
        this.f241977g = jsApiChooseMultiMedia;
        this.f241974d = fVar;
        this.f241975e = jSONObject;
        this.f241976f = i;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 113) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                this.f241974d.mo109647a(this.f241976f, this.f241977g.mo115109j("fail:system permission denied"));
            } else {
                this.f241977g.mo1505u(this.f241974d, this.f241975e, this.f241976f);
            }
        }
    }
}
