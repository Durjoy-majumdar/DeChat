package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p262wm.C22921c;

/* renamed from: com.tencent.mm.ui.chatting.d */
public class C19746d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachDownloadUI f56167d;

    public C19746d(AppAttachDownloadUI appAttachDownloadUI) {
        this.f56167d = appAttachDownloadUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachDownloadUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppAttachDownloadUI appAttachDownloadUI = this.f56167d;
        appAttachDownloadUI.f55914M = true;
        Class cls = C22921c.class;
        C72683d I7 = appAttachDownloadUI.mo26086I7();
        if (I7 == null) {
            Log.m105920e("MicroMsg.AppAttachDownloadUI", "open fail, info is null");
        } else {
            String str = I7.field_fileFullPath;
            if (str == null || str.length() == 0) {
                Log.m105920e("MicroMsg.AppAttachDownloadUI", "open fail, field fileFullPath is null");
            } else {
                String str2 = I7.field_fileFullPath;
                if (appAttachDownloadUI.f55944s == 1) {
                    ((C22921c) C86312j.m106911c(cls)).hr0(appAttachDownloadUI, appAttachDownloadUI.f55945t, str2, appAttachDownloadUI.f55904C, appAttachDownloadUI.f55902A, 7);
                } else {
                    ((C22921c) C86312j.m106911c(cls)).hr0(appAttachDownloadUI, appAttachDownloadUI.f55945t, str2, appAttachDownloadUI.f55904C, appAttachDownloadUI.f55902A, 1);
                }
                appAttachDownloadUI.f55935h.setEnabled(false);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachDownloadUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
