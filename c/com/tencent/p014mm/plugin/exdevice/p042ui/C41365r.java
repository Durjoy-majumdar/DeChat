package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import v71.C37690e;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.r */
public class C41365r implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceLikeUI f111361d;

    public C41365r(ExdeviceLikeUI exdeviceLikeUI) {
        this.f111361d = exdeviceLikeUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C37690e eVar = (C37690e) this.f111361d.f111131h.getItem(i);
        Intent intent = new Intent(this.f111361d, ExdeviceRankInfoUI.class);
        intent.putExtra("app_username", eVar.field_appusername);
        intent.putExtra("rank_id", eVar.field_rankID);
        intent.putExtra("device_type", 1);
        ExdeviceLikeUI exdeviceLikeUI = this.f111361d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        ExdeviceLikeUI exdeviceLikeUI2 = exdeviceLikeUI;
        C117292a.m165358d(exdeviceLikeUI2, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        exdeviceLikeUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(exdeviceLikeUI2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f111361d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
