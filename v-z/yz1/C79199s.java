package yz1;

import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI;
import j20.C117292a;
import java.util.ArrayList;
import yz1.C79188f;

/* renamed from: yz1.s */
public class C79199s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GroupSolitatireEditUI f232510d;

    /* renamed from: yz1.s$a */
    public class C79200a implements C79188f.C79189a {

        /* renamed from: a */
        public final /* synthetic */ C79188f f232511a;

        public C79200a(C79188f fVar) {
            this.f232511a = fVar;
        }
    }

    public C79199s(GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f232510d = groupSolitatireEditUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        GroupSolitatireEditUI groupSolitatireEditUI = this.f232510d;
        int i = GroupSolitatireEditUI.f198377U;
        groupSolitatireEditUI.mo95047Q7();
        View view2 = this.f232510d.f198412v;
        if ((view2 instanceof MMEditText) && (view2.getParent() instanceof RelativeLayout)) {
            ((RelativeLayout) this.f232510d.f198412v.getParent()).setTag(1);
        }
        C79188f fVar = new C79188f(this.f232510d);
        fVar.f232498g = new C79200a(fVar);
        this.f232510d.f198394R = fVar;
        fVar.mo109202a();
        this.f232510d.mo95042L7(4);
        C117292a.m165361g(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
