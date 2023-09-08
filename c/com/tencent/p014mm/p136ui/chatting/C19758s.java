package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p262wm.C22921c;
import p262wm.C22923f;
import p407zo.C23547h;

/* renamed from: com.tencent.mm.ui.chatting.s */
public class C19758s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56179d;

    public C19758s(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56179d = appAttachNewDownloadUI;
    }

    public void onClick(View view) {
        Class cls = C22921c.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!((C22923f) C86312j.m106911c(C22923f.class)).Ot0(this.f56179d.f55987C) || !((C22921c) C86312j.m106911c(cls)).Xa0(((C22921c) C86312j.m106911c(cls)).mo35892nR(this.f56179d.f55987C), 0).isEmpty() || ((C22921c) C86312j.m106911c(cls)).mo35890lJ(this.f56179d.f56046z)) {
            String num = Integer.toString(hashCode());
            AppAttachNewDownloadUI appAttachNewDownloadUI = this.f56179d;
            ((C23547h) C86312j.m106911c(C23547h.class)).mo36799xH(num, appAttachNewDownloadUI.f55987C, MD5Util.getMD5String(appAttachNewDownloadUI.f55985A), 7, this.f56179d.mo26126S7(), this.f56179d.mo25335P6());
            this.f56179d.f55998N = true;
            AppAttachNewDownloadUI appAttachNewDownloadUI2 = this.f56179d;
            ((C22921c) C86312j.m106911c(cls)).Om0(appAttachNewDownloadUI2, appAttachNewDownloadUI2.f56046z, appAttachNewDownloadUI2.f55987C, 1);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f56179d.mo26134b8(true);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
