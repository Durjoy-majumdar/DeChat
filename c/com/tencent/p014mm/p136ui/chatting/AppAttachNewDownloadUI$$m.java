package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p262wm.C22921c;
import p262wm.C22923f;
import p407zo.C23547h;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$m */
public class AppAttachNewDownloadUI$$m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56059d;

    public AppAttachNewDownloadUI$$m(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56059d = appAttachNewDownloadUI;
    }

    public void onClick(View view) {
        Class cls = C23547h.class;
        Class cls2 = C22923f.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((C22923f) C86312j.m106911c(cls2)).Ot0(this.f56059d.f55987C)) {
            String num = Integer.toString(hashCode());
            AppAttachNewDownloadUI appAttachNewDownloadUI = this.f56059d;
            ((C23547h) C86312j.m106911c(cls)).mo36799xH(num, appAttachNewDownloadUI.f55987C, MD5Util.getMD5String(appAttachNewDownloadUI.f55985A), 13, this.f56059d.mo26126S7(), this.f56059d.mo25335P6());
            this.f56059d.mo26134b8(true);
        } else if (((C22923f) C86312j.m106911c(cls2)).mo35898Db(this.f56059d.getContext()) && ((C22923f) C86312j.m106911c(cls2)).mo35905dQ(this.f56059d.mo26126S7(), this.f56059d.f55987C)) {
            MMActivity R7 = this.f56059d.getContext();
            AppAttachNewDownloadUI appAttachNewDownloadUI2 = this.f56059d;
            String str = appAttachNewDownloadUI2.f56046z;
            String str2 = appAttachNewDownloadUI2.f55985A;
            String str3 = appAttachNewDownloadUI2.f55987C;
            String num2 = Integer.toString(hashCode());
            C22923f fVar = (C22923f) C86312j.m106911c(cls2);
            ((C22923f) C86312j.m106911c(cls2)).mo35896AT(R7, str, str2, str3, num2, "FROM_SCENE_OPEN_NO_OFFICE_FILE", MD5Util.getMD5String(this.f56059d.f55985A));
        } else if (((C22923f) C86312j.m106911c(cls2)).mo35905dQ(this.f56059d.mo26126S7(), this.f56059d.f55987C)) {
            MMActivity R72 = this.f56059d.getContext();
            AppAttachNewDownloadUI appAttachNewDownloadUI3 = this.f56059d;
            String str4 = appAttachNewDownloadUI3.f56046z;
            String str5 = appAttachNewDownloadUI3.f55985A;
            String str6 = appAttachNewDownloadUI3.f55987C;
            String num3 = Integer.toString(hashCode());
            C22923f fVar2 = (C22923f) C86312j.m106911c(cls2);
            ((C22923f) C86312j.m106911c(cls2)).mo35896AT(R72, str4, str5, str6, num3, "FROM_SCENE_OPEN_NO_OFFICE_FILE", MD5Util.getMD5String(this.f56059d.f55985A));
        } else {
            String num4 = Integer.toString(hashCode());
            AppAttachNewDownloadUI appAttachNewDownloadUI4 = this.f56059d;
            ((C23547h) C86312j.m106911c(cls)).mo36799xH(num4, appAttachNewDownloadUI4.f55987C, MD5Util.getMD5String(appAttachNewDownloadUI4.f55985A), 7, this.f56059d.mo26126S7(), this.f56059d.mo25335P6());
            this.f56059d.f55998N = true;
            AppAttachNewDownloadUI appAttachNewDownloadUI5 = this.f56059d;
            ((C22921c) C86312j.m106911c(C22921c.class)).Om0(appAttachNewDownloadUI5, appAttachNewDownloadUI5.f56046z, appAttachNewDownloadUI5.f55987C, appAttachNewDownloadUI5.f56036r);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
