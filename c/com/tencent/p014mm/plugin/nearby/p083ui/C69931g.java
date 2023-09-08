package com.tencent.p014mm.plugin.nearby.p083ui;

import android.view.View;
import cc2.C67352d;
import cc2.C67354f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.nearby.p083ui.NearbyFriendsUI;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.nearby.ui.g */
public class C69931g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NearbyFriendsUI f201739d;

    public C69931g(NearbyFriendsUI nearbyFriendsUI) {
        this.f201739d = nearbyFriendsUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        NearbyFriendsUI nearbyFriendsUI = this.f201739d;
        NearbyFriendsUI.C69893l lVar = nearbyFriendsUI.f201627y;
        if (lVar != null) {
            nearbyFriendsUI.f201614i = new C67354f(1, lVar.f201655b, lVar.f201654a, lVar.f201656c, 0, "", "");
            nearbyFriendsUI.f201609d = C76879j.m92723Q(nearbyFriendsUI.getContext(), nearbyFriendsUI.getString(C0966R.string.a3h), nearbyFriendsUI.getString(C0966R.string.h66), true, true, new C69932h(nearbyFriendsUI));
            C67352d.m79716a(3);
            C86709a0.m107524d().mo123460f(nearbyFriendsUI.f201614i);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
