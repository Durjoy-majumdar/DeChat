package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$p */
public class AppAttachNewDownloadUI$$p implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f215151d;

    public AppAttachNewDownloadUI$$p(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f215151d = appAttachNewDownloadUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$23", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        Log.m105918d("MicroMsg.AppAttachNewDownloadUI", "onLongClick");
        AppAttachNewDownloadUI appAttachNewDownloadUI = this.f215151d;
        if (appAttachNewDownloadUI.f56017Y0 == null) {
            appAttachNewDownloadUI.f56017Y0 = new C78253a(appAttachNewDownloadUI.getContext());
        }
        AppAttachNewDownloadUI appAttachNewDownloadUI2 = this.f215151d;
        appAttachNewDownloadUI2.f56017Y0.mo108273h(view, appAttachNewDownloadUI2, appAttachNewDownloadUI2.f56021b1, appAttachNewDownloadUI2.f56019Z0, appAttachNewDownloadUI2.f56020a1);
        C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$23", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
