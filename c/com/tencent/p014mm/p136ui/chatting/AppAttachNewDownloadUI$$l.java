package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gq0.C107879e0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$l */
public class AppAttachNewDownloadUI$$l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f318833d;

    public AppAttachNewDownloadUI$$l(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f318833d = appAttachNewDownloadUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.AppAttachNewDownloadUI", "MoreOpenWaysArea#onClick");
        C107879e0 e0Var = this.f318833d.f56009U0;
        if (e0Var != null) {
            e0Var.mo158294x();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
