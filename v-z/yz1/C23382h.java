package yz1;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz1.h */
public class C23382h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C23385k f67137d;

    public C23382h(C23385k kVar) {
        this.f67137d = kVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireDatePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C23385k.m27905a(this.f67137d, false, 0, 0, 0);
        C104428a aVar = this.f67137d.f67140d;
        if (aVar != null) {
            aVar.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireDatePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
