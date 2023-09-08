package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import p918s2.C90111a;
import wq0.C91085v;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.m0 */
public class C82737m0 implements C90111a.C90113b {

    /* renamed from: d */
    public final /* synthetic */ C82381f f242056d;

    /* renamed from: e */
    public final /* synthetic */ int f242057e;

    /* renamed from: f */
    public final /* synthetic */ JsApiChooseImage f242058f;

    public C82737m0(JsApiChooseImage jsApiChooseImage, C82381f fVar, int i) {
        this.f242058f = jsApiChooseImage;
        this.f242056d = fVar;
        this.f242057e = i;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 145) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                Log.m105920e("MicroMsg.JsApiChooseImage", "requestExternalStoragePermission sys perm denied for choose image");
                C84072q1.m103586a(this.f242056d.getAppId()).f245462f = false;
                this.f242056d.mo109647a(this.f242057e, this.f242058f.mo115109j("fail:system permission denied"));
            } else {
                Log.m105924i("MicroMsg.JsApiChooseImage", "requestExternalStoragePermission permission is grant for choose image");
                Context context = this.f242056d.getContext();
                JsApiChooseImage jsApiChooseImage = this.f242058f;
                C81956c.m100674b(context, jsApiChooseImage.f241809h, jsApiChooseImage.f241810i);
            }
            C91085v.m114268c(this.f242056d.getAppId());
            this.f242058f.f241808g = false;
        } else if (i == 113) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                Log.m105920e("MicroMsg.JsApiChooseImage", "requestCameraPermission sys perm denied for choose image");
                C84072q1.m103586a(this.f242056d.getAppId()).f245462f = false;
                this.f242056d.mo109647a(this.f242057e, this.f242058f.mo115109j("fail:system permission denied"));
            } else {
                Log.m105924i("MicroMsg.JsApiChooseImage", "requestCameraPermission permission is grant for choose image");
                Context context2 = this.f242056d.getContext();
                JsApiChooseImage jsApiChooseImage2 = this.f242058f;
                C81956c.m100674b(context2, jsApiChooseImage2.f241809h, jsApiChooseImage2.f241810i);
            }
            C91085v.m114268c(this.f242056d.getAppId());
            this.f242058f.f241808g = false;
        }
    }
}
