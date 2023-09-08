package com.tencent.p014mm.plugin.shake.p103ui;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.ShakeActionReportStruct;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jn2.C21268a;
import sn2.C48438k;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakeReportUI$$d */
public final /* synthetic */ class ShakeReportUI$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ShakeReportUI f54195d;

    public /* synthetic */ ShakeReportUI$$d(ShakeReportUI shakeReportUI) {
        this.f54195d = shakeReportUI;
    }

    public final void onClick(View view) {
        ShakeReportUI shakeReportUI = this.f54195d;
        List<C48438k.C48443e> list = ShakeReportUI.f54068I1;
        shakeReportUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeReportUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", shakeReportUI, array);
        if (shakeReportUI.f54121g) {
            ShakeActionReportStruct shakeActionReportStruct = new ShakeActionReportStruct();
            shakeActionReportStruct.f48573n = shakeReportUI.f54136p.mo33949a();
            C119179t tVar = C119157j.f356862d;
            C21268a aVar = new C21268a(shakeActionReportStruct, 15);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183889t(aVar, 100, (String) null);
        }
        shakeReportUI.f54121g = false;
        shakeReportUI.finish();
        C117292a.m165361g(shakeReportUI, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
