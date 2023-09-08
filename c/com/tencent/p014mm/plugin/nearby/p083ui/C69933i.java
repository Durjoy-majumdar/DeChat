package com.tencent.p014mm.plugin.nearby.p083ui;

import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.nearby.ui.i */
public class C69933i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NearbyFriendsUI f201741d;

    public C69933i(NearbyFriendsUI nearbyFriendsUI) {
        this.f201741d = nearbyFriendsUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        NearbyFriendsUI nearbyFriendsUI = this.f201741d;
        nearbyFriendsUI.f201611f.removeHeaderView(nearbyFriendsUI.f201626x);
        this.f201741d.f201626x = null;
        Intent intent = new Intent(this.f201741d, NearbySayHiListUI.class);
        intent.putExtra("k_say_hi_type", 2);
        intent.putExtra("show_clear_header", true);
        this.f201741d.startActivityForResult(intent, 2009);
        C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
