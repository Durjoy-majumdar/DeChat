package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.p */
public class C19755p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56176d;

    public C19755p(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56176d = appAttachNewDownloadUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "cancel receive file");
        AppAttachNewDownloadUI appAttachNewDownloadUI = this.f56176d;
        int i = AppAttachNewDownloadUI.f55984e1;
        appAttachNewDownloadUI.mo26136d8(14, -1);
        this.f56176d.f56038t.mo108734N2(0);
        C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
        AppAttachNewDownloadUI appAttachNewDownloadUI2 = this.f56176d;
        ((C72972g4) LE).xy0(appAttachNewDownloadUI2.f56037s, appAttachNewDownloadUI2.f56038t);
        this.f56176d.mo26139g8(false);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
