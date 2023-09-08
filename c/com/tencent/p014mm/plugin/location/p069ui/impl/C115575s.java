package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.xweb.WCWebUpdater;
import j20.C117292a;
import java.util.ArrayList;
import x22.C118812s;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s */
public class C115575s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RealTimeLocationUI f346633d;

    public C115575s(RealTimeLocationUI realTimeLocationUI) {
        this.f346633d = realTimeLocationUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f346633d.f346455S.setSelected(true);
        RealTimeLocationUI realTimeLocationUI = this.f346633d;
        C118812s sVar = realTimeLocationUI.f346463W;
        sVar.f355474n = true;
        sVar.mo183518a(realTimeLocationUI.f271953i.f271972f);
        this.f346633d.f346463W.mo183520c(false);
        C115669n.INSTANCE.mo160131h(10997, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, "", 0, 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
