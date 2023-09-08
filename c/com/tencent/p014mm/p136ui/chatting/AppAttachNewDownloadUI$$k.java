package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p262wm.C22921c;
import p407zo.C23547h;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$k */
public class AppAttachNewDownloadUI$$k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56058d;

    public AppAttachNewDownloadUI$$k(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56058d = appAttachNewDownloadUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String num = Integer.toString(hashCode());
        AppAttachNewDownloadUI appAttachNewDownloadUI = this.f56058d;
        ((C23547h) C86312j.m106911c(C23547h.class)).mo36799xH(num, appAttachNewDownloadUI.f55987C, MD5Util.getMD5String(appAttachNewDownloadUI.f55985A), 7, this.f56058d.mo26126S7(), this.f56058d.mo25335P6());
        this.f56058d.f55998N = true;
        AppAttachNewDownloadUI appAttachNewDownloadUI2 = this.f56058d;
        ((C22921c) C86312j.m106911c(C22921c.class)).O80(appAttachNewDownloadUI2, appAttachNewDownloadUI2.f56046z, appAttachNewDownloadUI2.f55987C, 1, 1);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
