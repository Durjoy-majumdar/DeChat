package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p918s2.C90111a;
import wq0.C91085v;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.w0 */
public class C82774w0 implements C90111a.C90113b {

    /* renamed from: d */
    public final /* synthetic */ C82381f f242117d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f242118e;

    /* renamed from: f */
    public final /* synthetic */ int f242119f;

    /* renamed from: g */
    public final /* synthetic */ JsApiChooseMedia.ChooseRequest f242120g;

    /* renamed from: h */
    public final /* synthetic */ JsApiChooseMedia f242121h;

    public C82774w0(JsApiChooseMedia jsApiChooseMedia, C82381f fVar, JSONObject jSONObject, int i, JsApiChooseMedia.ChooseRequest chooseRequest) {
        this.f242121h = jsApiChooseMedia;
        this.f242117d = fVar;
        this.f242118e = jSONObject;
        this.f242119f = i;
        this.f242120g = chooseRequest;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 145) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "requestExternalStoragePermission sys perm denied for choose media");
                this.f242117d.mo109647a(this.f242119f, this.f242121h.mo115109j("fail:system permission denied"));
                C91085v.m114268c(this.f242117d.getAppId());
                this.f242121h.f241847g = false;
                return;
            }
            Log.m105924i("MicroMsg.JsApiChooseMedia", "requestExternalStoragePermission permission is grant for choose media");
            this.f242121h.mo114945w(this.f242117d, this.f242118e, this.f242119f, this.f242120g);
        } else if (i == 119) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "requestCameraPermission sys perm denied for choose media");
                this.f242117d.mo109647a(this.f242119f, this.f242121h.mo115109j("fail:system permission denied"));
                C91085v.m114268c(this.f242117d.getAppId());
                this.f242121h.f241847g = false;
                return;
            }
            Log.m105924i("MicroMsg.JsApiChooseMedia", "requestCameraPermission permission is grant for choose media");
            this.f242121h.mo114945w(this.f242117d, this.f242118e, this.f242119f, this.f242120g);
        } else if (i != 120) {
        } else {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "requestAudioPermission sys perm denied for choose media");
                this.f242117d.mo109647a(this.f242119f, this.f242121h.mo115109j("fail:system permission denied"));
                C91085v.m114268c(this.f242117d.getAppId());
                this.f242121h.f241847g = false;
                return;
            }
            Log.m105924i("MicroMsg.JsApiChooseMedia", "requestAudioPermission permission is grant for choose media");
            this.f242121h.mo114945w(this.f242117d, this.f242118e, this.f242119f, this.f242120g);
        }
    }
}
