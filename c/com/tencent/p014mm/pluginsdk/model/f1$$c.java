package com.tencent.p014mm.pluginsdk.model;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.chatting.AppAttachNewDownloadUI;
import com.tencent.p014mm.p136ui.chatting.AppAttachNewDownloadUI$$c;
import p262wm.C22923f;

/* renamed from: com.tencent.mm.pluginsdk.model.f1$$c */
public final /* synthetic */ class f1$$c implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C22923f.C22924a f54929d;

    public /* synthetic */ f1$$c(C22923f.C22924a aVar) {
        this.f54929d = aVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C22923f.C22924a aVar = this.f54929d;
        if (aVar != null) {
            AppAttachNewDownloadUI appAttachNewDownloadUI = ((AppAttachNewDownloadUI$$c) aVar).f56049a;
            appAttachNewDownloadUI.f56028h.setEnabled(true);
            appAttachNewDownloadUI.f56029i.setEnabled(true);
        }
    }
}
