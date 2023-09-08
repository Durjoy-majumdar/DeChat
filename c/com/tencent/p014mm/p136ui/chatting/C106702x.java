package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.chatting.x */
public class C106702x implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ AppAttachNewDownloadUI f319006a;

    public C106702x(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f319006a = appAttachNewDownloadUI;
    }

    public void onDismiss() {
        Log.m105918d("MicroMsg.AppAttachNewDownloadUI", "showAlert, onDismiss");
        this.f319006a.f56013W0 = null;
    }
}
