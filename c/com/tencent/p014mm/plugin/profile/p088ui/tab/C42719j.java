package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C19636w0;
import ex0.C45696d;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.j */
public class C42719j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f115686d;

    /* renamed from: e */
    public final /* synthetic */ ContactWidgetTabBizHeaderController f115687e;

    public C42719j(ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController, String str) {
        this.f115687e = contactWidgetTabBizHeaderController;
        this.f115686d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = this.f115687e;
        String str = this.f115686d;
        contactWidgetTabBizHeaderController.getClass();
        Class cls = C45696d.class;
        int i = C19636w0.f55626c;
        int gg02 = ((C45696d) C86709a0.m107533q(cls)).gg0(contactWidgetTabBizHeaderController.f115563q);
        ((C45696d) C86709a0.m107533q(cls)).mo70995gj(contactWidgetTabBizHeaderController.f115556g, contactWidgetTabBizHeaderController.f115563q, str, 8, gg02);
        C115669n.INSTANCE.mo160131h(23044, 2, contactWidgetTabBizHeaderController.f115563q, Integer.valueOf(contactWidgetTabBizHeaderController.f115568v), Integer.valueOf(i), str, Integer.valueOf(gg02), 1, "");
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
