package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.chatting.i */
public class C106689i implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ AppAttachDownloadUI f318942a;

    public C106689i(AppAttachDownloadUI appAttachDownloadUI) {
        this.f318942a = appAttachDownloadUI;
    }

    public void onDismiss() {
        Log.m105918d("MicroMsg.AppAttachDownloadUI", "showAlert, onDismiss");
        this.f318942a.f55941p0 = null;
    }
}
