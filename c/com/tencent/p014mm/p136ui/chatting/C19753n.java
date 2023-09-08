package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C97625j3;
import i21.C98590g;
import j20.C117292a;
import java.util.ArrayList;
import jd3.C76404b;
import qg2.C77335p;
import qg2.p$$e;

/* renamed from: com.tencent.mm.ui.chatting.n */
public class C19753n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56174d;

    public C19753n(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56174d = appAttachNewDownloadUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppAttachNewDownloadUI appAttachNewDownloadUI = this.f56174d;
        int i = AppAttachNewDownloadUI.f55984e1;
        if (appAttachNewDownloadUI.mo26143l8()) {
            C72683d P7 = this.f56174d.mo26124P7();
            if (P7 != null) {
                P7.field_status = 101;
                P7.field_lastModifyTime = C31543z5.m39453c();
                C72709y1.vx0().update(P7, new String[0]);
            }
            ((C98590g) C86312j.m106911c(C98590g.class)).mo137959Bl(this.f56174d.f56038t.mo108774y2(), this.f56174d.f56038t.mo101010p2(), true, this.f56174d.f56038t.getCreateTime());
            C77335p pVar = this.f56174d.f56033p;
            if (pVar != null) {
                pVar.mo107463o1((p$$e) null);
                C97625j3.m125815e().mo123458d(this.f56174d.f56033p);
            }
            AppAttachNewDownloadUI appAttachNewDownloadUI2 = this.f56174d;
            appAttachNewDownloadUI2.f56033p = new C77335p(appAttachNewDownloadUI2.f56037s, appAttachNewDownloadUI2.f56035q, appAttachNewDownloadUI2.f56040v);
            C97625j3.m125815e().mo123460f(this.f56174d.f56033p);
            C76404b bVar = C76404b.f223715a;
            AppAttachNewDownloadUI appAttachNewDownloadUI3 = this.f56174d;
            bVar.mo106629c(appAttachNewDownloadUI3.f56038t, appAttachNewDownloadUI3.f56044y);
        }
        this.f56174d.mo26139g8(false);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
