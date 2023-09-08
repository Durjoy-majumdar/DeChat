package e22;

import android.view.View;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelSelectUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: e22.v */
public class C75534v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelSelectUI f221926d;

    public C75534v(ContactLabelSelectUI contactLabelSelectUI) {
        this.f221926d = contactLabelSelectUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f221926d.f198577B.mo106122G4();
        C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
