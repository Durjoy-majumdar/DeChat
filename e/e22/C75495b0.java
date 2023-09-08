package e22;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI;
import com.tencent.p014mm.plugin.label.p067ui.widget.MMLabelPanel;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: e22.b0 */
public class C75495b0 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelUI f221865d;

    public C75495b0(ContactLabelUI contactLabelUI) {
        this.f221865d = contactLabelUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MMLabelPanel mMLabelPanel;
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelUI$12", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C75533t tVar = this.f221865d.f198664u;
        if (tVar == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelUI$12", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        String a = tVar.getItem(i);
        if (!Util.isNullOrNil(a) && (mMLabelPanel = this.f221865d.f198656j) != null) {
            mMLabelPanel.mo101801g();
            this.f221865d.f198656j.mo95185d(a, true);
            this.f221865d.f198661r.mo101814r(a, true);
            this.f221865d.f198645F.add(a);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelUI$12", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
