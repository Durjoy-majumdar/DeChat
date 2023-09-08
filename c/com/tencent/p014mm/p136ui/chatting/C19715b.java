package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import qg2.C77335p;

/* renamed from: com.tencent.mm.ui.chatting.b */
public class C19715b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachDownloadUI f56067d;

    public C19715b(AppAttachDownloadUI appAttachDownloadUI) {
        this.f56067d = appAttachDownloadUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachDownloadUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppAttachDownloadUI appAttachDownloadUI = this.f56067d;
        int i = AppAttachDownloadUI.f55901U0;
        appAttachDownloadUI.mo26096S7(8);
        this.f56067d.f55934g.mo26104a(0);
        View view2 = this.f56067d.f55936i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachDownloadUI$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/AppAttachDownloadUI$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Log.m105925i("MicroMsg.AppAttachDownloadUI", "summerapp roundProgressBar downloadAppAttachScene[%s]", this.f56067d.f55942q);
        AppAttachDownloadUI appAttachDownloadUI2 = this.f56067d;
        C77335p pVar = appAttachDownloadUI2.f55942q;
        if (pVar != null) {
            pVar.mo107463o1(appAttachDownloadUI2);
            C86709a0.m107524d().mo123458d(this.f56067d.f55942q);
        } else {
            C72683d I7 = appAttachDownloadUI2.mo26086I7();
            if (I7 != null) {
                long j = I7.field_status;
                if (j != 199) {
                    Log.m105925i("MicroMsg.AppAttachDownloadUI", "summerapp roundProgressBar onClick but scene is null and set status[%d] paused", Long.valueOf(j));
                    I7.field_status = 102;
                    C72709y1.vx0().update(I7, new String[0]);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachDownloadUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
