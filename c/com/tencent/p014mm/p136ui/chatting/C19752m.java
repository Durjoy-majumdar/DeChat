package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import jd3.C76404b;
import qg2.C77335p;

/* renamed from: com.tencent.mm.ui.chatting.m */
public class C19752m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56173d;

    public C19752m(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56173d = appAttachNewDownloadUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "summerapp roundProgressBar downloadAppAttachScene[%s]", this.f56173d.f56033p);
        AppAttachNewDownloadUI appAttachNewDownloadUI = this.f56173d;
        C77335p pVar = appAttachNewDownloadUI.f56033p;
        if (pVar != null) {
            pVar.mo107463o1(appAttachNewDownloadUI);
            C86709a0.m107524d().mo123458d(this.f56173d.f56033p);
            this.f56173d.mo26136d8(15, -1);
        } else {
            C72683d P7 = appAttachNewDownloadUI.mo26124P7();
            if (P7 != null) {
                long j = P7.field_status;
                if (j != 199) {
                    Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "summerapp roundProgressBar onClick but scene is null and set status[%d] paused", Long.valueOf(j));
                    P7.field_status = 102;
                    P7.field_lastModifyTime = C31543z5.m39453c();
                    C72709y1.vx0().update(P7, new String[0]);
                    this.f56173d.mo26136d8(15, -1);
                }
            }
            C76404b.f223715a.mo106627a(this.f56173d.f56038t);
        }
        this.f56173d.mo26139g8(false);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
