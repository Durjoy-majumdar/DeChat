package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.n0 */
public class C82743n0 implements C77407n.C12924o {

    /* renamed from: a */
    public final /* synthetic */ DialogInterface.OnCancelListener f242064a;

    public C82743n0(JsApiChooseImage jsApiChooseImage, DialogInterface.OnCancelListener onCancelListener) {
        this.f242064a = onCancelListener;
    }

    /* renamed from: a */
    public void mo2362a() {
        DialogInterface.OnCancelListener onCancelListener = this.f242064a;
        if (onCancelListener != null) {
            onCancelListener.onCancel((DialogInterface) null);
        }
    }
}
