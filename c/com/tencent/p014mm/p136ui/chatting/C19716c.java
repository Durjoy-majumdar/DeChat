package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import qg2.C77335p;

/* renamed from: com.tencent.mm.ui.chatting.c */
public class C19716c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachDownloadUI f56068d;

    public C19716c(AppAttachDownloadUI appAttachDownloadUI) {
        this.f56068d = appAttachDownloadUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachDownloadUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppAttachDownloadUI appAttachDownloadUI = this.f56068d;
        int i = AppAttachDownloadUI.f55901U0;
        appAttachDownloadUI.mo26096S7(0);
        this.f56068d.f55934g.mo26104a(8);
        if (this.f56068d.mo26098U7()) {
            C72683d I7 = this.f56068d.mo26086I7();
            if (I7 != null) {
                I7.field_status = 101;
                I7.field_lastModifyTime = Util.nowSecond();
                C72709y1.vx0().update(I7, new String[0]);
            }
            if (this.f56068d.f55942q != null) {
                C97625j3.m125815e().mo123458d(this.f56068d.f55942q);
            }
            AppAttachDownloadUI appAttachDownloadUI2 = this.f56068d;
            appAttachDownloadUI2.f55942q = new C77335p(appAttachDownloadUI2.f55945t, appAttachDownloadUI2.f55943r, appAttachDownloadUI2.f55947v);
            C97625j3.m125815e().mo123460f(this.f56068d.f55942q);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachDownloadUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
