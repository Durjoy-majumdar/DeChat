package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.a1 */
public class C4672a1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponCardUI f19643d;

    public C4672a1(IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f19643d = iPCallShareCouponCardUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        IPCallShareCouponCardUI iPCallShareCouponCardUI = this.f19643d;
        iPCallShareCouponCardUI.f19571t.mo11893d();
        iPCallShareCouponCardUI.f19571t.f35025b = (long) iPCallShareCouponCardUI.f19556D;
        C115669n.INSTANCE.idkeyStat(257, 19, 1, true);
        if (iPCallShareCouponCardUI.f19554B != null) {
            C77407n nVar = new C77407n((Context) iPCallShareCouponCardUI.getContext(), 0, true);
            nVar.mo107568m(iPCallShareCouponCardUI.getString(C0966R.string.fxa), 17, 0);
            nVar.f225771i = new C4674b1(iPCallShareCouponCardUI);
            nVar.f225782p = new C4676c1(iPCallShareCouponCardUI);
            nVar.mo107573q();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
