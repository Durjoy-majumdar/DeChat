package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachDownloadUI$$d */
public class AppAttachDownloadUI$$d implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachDownloadUI f121495d;

    public AppAttachDownloadUI$$d(AppAttachDownloadUI appAttachDownloadUI) {
        this.f121495d = appAttachDownloadUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachDownloadUI$14", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        Log.m105918d("MicroMsg.AppAttachDownloadUI", "onLongClick");
        AppAttachDownloadUI appAttachDownloadUI = this.f121495d;
        if (appAttachDownloadUI.f55950x0 == null) {
            appAttachDownloadUI.f55950x0 = new C78253a(appAttachDownloadUI.getContext());
        }
        AppAttachDownloadUI appAttachDownloadUI2 = this.f121495d;
        appAttachDownloadUI2.f55950x0.mo108273h(view, appAttachDownloadUI2, appAttachDownloadUI2.f55920R0, appAttachDownloadUI2.f55952y0, appAttachDownloadUI2.f55918Q0);
        C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/AppAttachDownloadUI$14", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
