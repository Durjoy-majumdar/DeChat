package yz1;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz1.g */
public class C23381g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C23385k f67136d;

    public C23381g(C23385k kVar) {
        this.f67136d = kVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireDatePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C23385k kVar = this.f67136d;
        C23385k.m27905a(kVar, true, kVar.f67145i.getYear(), this.f67136d.f67145i.getMonth(), this.f67136d.f67145i.getDayOfMonth());
        C104428a aVar = this.f67136d.f67140d;
        if (aVar != null) {
            aVar.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireDatePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
