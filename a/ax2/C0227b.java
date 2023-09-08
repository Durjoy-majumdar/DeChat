package ax2;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.AddMoreFriendsUI;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p255vr.C65873e;

/* renamed from: ax2.b */
public class C0227b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AddMoreFriendsUI f761d;

    public C0227b(AddMoreFriendsUI addMoreFriendsUI) {
        this.f761d = addMoreFriendsUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent putExtra = new Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
        Bundle bundle = null;
        if (!C85875k4.m106211z() && !this.f761d.isVASValid()) {
            bundle = ActivityOptions.makeSceneTransitionAnimation(this.f761d, new Pair[0]).toBundle();
        }
        ((C65873e) C86312j.m106911c(C65873e.class)).mo89919mw(this.f761d.getContext(), ".ui.FTSAddFriendUI", putExtra, bundle);
        C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
