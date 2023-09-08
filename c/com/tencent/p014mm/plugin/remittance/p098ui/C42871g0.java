package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.View;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;
import te3.C52127yk;

/* renamed from: com.tencent.mm.plugin.remittance.ui.g0 */
public class C42871g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52127yk f116088d;

    /* renamed from: e */
    public final /* synthetic */ RemittanceBusiResultUI f116089e;

    public C42871g0(RemittanceBusiResultUI remittanceBusiResultUI, C52127yk ykVar) {
        this.f116089e = remittanceBusiResultUI;
        this.f116088d = ykVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.RemittanceBusiResultUI", "app type: %s", Integer.valueOf(this.f116088d.f145330d));
        int i = this.f116088d.f145330d;
        if (i == 1) {
            this.f116089e.f204450J = true;
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            C52127yk ykVar = this.f116088d;
            aVar.f9526a = ykVar.f145336j;
            aVar.f9527b = Util.nullAs(ykVar.f145337n, "");
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9529d = 1034;
            aVar2.f9528c = 0;
            startAppBrandUIFromOuterEvent.publish();
        } else if (i == 2) {
            RemittanceBusiResultUI remittanceBusiResultUI = this.f116089e;
            remittanceBusiResultUI.f204450J = true;
            C75228t.m90219L(remittanceBusiResultUI.getContext(), this.f116088d.f145335i, true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
