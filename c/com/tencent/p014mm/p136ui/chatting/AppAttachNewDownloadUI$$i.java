package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p262wm.C22923f;
import p407zo.C23547h;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$i */
public class AppAttachNewDownloadUI$$i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56056d;

    public AppAttachNewDownloadUI$$i(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56056d = appAttachNewDownloadUI;
    }

    public void onClick(View view) {
        Class cls = C22923f.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppAttachNewDownloadUI appAttachNewDownloadUI = this.f56056d;
        int i = AppAttachNewDownloadUI.f55984e1;
        if (((C22923f) C86312j.m106911c(cls)).mo35905dQ(appAttachNewDownloadUI.mo26126S7(), this.f56056d.f55987C) || ((C22923f) C86312j.m106911c(cls)).Ot0(this.f56056d.f55987C)) {
            String num = Integer.toString(hashCode());
            AppAttachNewDownloadUI appAttachNewDownloadUI2 = this.f56056d;
            ((C23547h) C86312j.m106911c(C23547h.class)).mo36799xH(num, appAttachNewDownloadUI2.f55987C, MD5Util.getMD5String(appAttachNewDownloadUI2.f55985A), 13, this.f56056d.mo26126S7(), this.f56056d.mo25335P6());
            this.f56056d.mo26134b8(true);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
