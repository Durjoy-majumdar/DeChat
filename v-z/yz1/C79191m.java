package yz1;

import android.view.View;
import com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz1.m */
public class C79191m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GroupSolitatireEditUI f232501d;

    public C79191m(GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f232501d = groupSolitatireEditUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        GroupSolitatireEditUI groupSolitatireEditUI = this.f232501d;
        int i = GroupSolitatireEditUI.f198377U;
        groupSolitatireEditUI.mo95041K7(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
