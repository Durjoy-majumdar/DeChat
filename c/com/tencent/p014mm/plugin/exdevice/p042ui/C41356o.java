package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceFollowsUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.o */
public final class C41356o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceFollowsUI f111344d;

    /* renamed from: e */
    public final /* synthetic */ ExdeviceFollowsUI.C41259a f111345e;

    public C41356o(ExdeviceFollowsUI exdeviceFollowsUI, ExdeviceFollowsUI.C41259a aVar) {
        this.f111344d = exdeviceFollowsUI;
        this.f111345e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI$FollowItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this.f111344d, ExdeviceProfileUI.class);
        intent.putExtra("username", this.f111345e.f111119e.f143615e);
        ExdeviceFollowsUI exdeviceFollowsUI = this.f111344d;
        exdeviceFollowsUI.startActivityForResult(intent, exdeviceFollowsUI.f111116n);
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI$FollowItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
