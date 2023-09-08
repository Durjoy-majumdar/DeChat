package e22;

import android.view.View;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelSelectUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: e22.w */
public class C75535w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelSelectUI f221927d;

    public C75535w(ContactLabelSelectUI contactLabelSelectUI) {
        this.f221927d = contactLabelSelectUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f221927d.f198577B.mo106122G4();
        C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
