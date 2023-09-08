package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import j20.C117292a;
import java.util.ArrayList;
import jd3.C76404b;

/* renamed from: com.tencent.mm.ui.chatting.o */
public class C19754o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56175d;

    public C19754o(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56175d = appAttachNewDownloadUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "start receive file");
        AppAttachNewDownloadUI appAttachNewDownloadUI = this.f56175d;
        if (appAttachNewDownloadUI.f56023d == 74) {
            appAttachNewDownloadUI.mo26136d8(12, -1);
            this.f56175d.f56038t.mo108734N2(1);
        } else {
            appAttachNewDownloadUI.mo26136d8(13, -1);
            this.f56175d.f56038t.mo108734N2(0);
        }
        C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
        AppAttachNewDownloadUI appAttachNewDownloadUI2 = this.f56175d;
        ((C72972g4) LE).xy0(appAttachNewDownloadUI2.f56037s, appAttachNewDownloadUI2.f56038t);
        AppAttachNewDownloadUI appAttachNewDownloadUI3 = this.f56175d;
        if (appAttachNewDownloadUI3.f56023d == 74) {
            appAttachNewDownloadUI3.mo26139g8(true);
        } else {
            appAttachNewDownloadUI3.mo26142k8();
        }
        C76404b bVar = C76404b.f223715a;
        AppAttachNewDownloadUI appAttachNewDownloadUI4 = this.f56175d;
        bVar.mo106629c(appAttachNewDownloadUI4.f56038t, appAttachNewDownloadUI4.f56044y);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
