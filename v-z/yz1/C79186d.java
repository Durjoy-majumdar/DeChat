package yz1;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import yz1.C79188f;
import yz1.C79199s;

/* renamed from: yz1.d */
public class C79186d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79188f f232490d;

    public C79186d(C79188f fVar) {
        this.f232490d = fVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireContactsPhoneNumPicker$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79188f fVar = this.f232490d;
        C79188f.C79189a aVar = fVar.f232498g;
        if (aVar != null) {
            Log.m105925i("MicroMsg.TiemDatePicker", "[getPhoneNum] :%s", fVar.f232499h);
            String str = fVar.f232499h;
            C79199s.C79200a aVar2 = (C79199s.C79200a) aVar;
            C104428a aVar3 = aVar2.f232511a.f232492a;
            if (aVar3 != null) {
                aVar3.dismiss();
            }
            GroupSolitatireEditUI groupSolitatireEditUI = C79199s.this.f232510d;
            int i = GroupSolitatireEditUI.f198377U;
            groupSolitatireEditUI.mo95040H7(str);
            C79199s.this.f232510d.mo95042L7(5);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireContactsPhoneNumPicker$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
