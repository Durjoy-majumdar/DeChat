package yz1;

import android.view.View;
import com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz1.r */
public class C79198r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GroupSolitatireEditUI f232509d;

    public C79198r(GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f232509d = groupSolitatireEditUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        GroupSolitatireEditUI groupSolitatireEditUI = this.f232509d;
        int i = GroupSolitatireEditUI.f198377U;
        groupSolitatireEditUI.mo95047Q7();
        this.f232509d.mo95048R7();
        this.f232509d.mo95042L7(2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
