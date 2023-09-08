package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.p0 */
public class C82746p0 implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ DialogInterface.OnCancelListener f242068a;

    public C82746p0(JsApiChooseImage jsApiChooseImage, DialogInterface.OnCancelListener onCancelListener) {
        this.f242068a = onCancelListener;
    }

    public void onDismiss() {
        DialogInterface.OnCancelListener onCancelListener = this.f242068a;
        if (onCancelListener != null) {
            onCancelListener.onCancel((DialogInterface) null);
        }
    }
}
