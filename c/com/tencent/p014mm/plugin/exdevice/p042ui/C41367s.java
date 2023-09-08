package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import d62.C75339i;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import v71.C37690e;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.s */
public class C41367s implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceLikeUI f111363d;

    public C41367s(ExdeviceLikeUI exdeviceLikeUI) {
        this.f111363d = exdeviceLikeUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C37690e eVar = this.f111363d.f111127d.get(i);
        Intent intent = new Intent();
        intent.putExtra("rank_id", eVar.field_rankID);
        intent.putExtra("device_type", 1);
        intent.putExtra("locate_to_username", eVar.field_username);
        intent.putExtra("app_username", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName("gh_43f2581f6fd6"));
        C88144b.m109791i(this.f111363d, "exdevice", ".ui.ExdeviceRankInfoUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
