package yz1;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import j20.C117292a;
import java.util.ArrayList;
import yz1.C79188f;
import yz1.C79199s;

/* renamed from: yz1.e */
public class C79187e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79188f f232491d;

    public C79187e(C79188f fVar) {
        this.f232491d = fVar;
    }

    public void onClick(View view) {
        C104428a aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireContactsPhoneNumPicker$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79188f.C79189a aVar2 = this.f232491d.f232498g;
        if (!(aVar2 == null || (aVar = ((C79199s.C79200a) aVar2).f232511a.f232492a) == null)) {
            aVar.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireContactsPhoneNumPicker$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
