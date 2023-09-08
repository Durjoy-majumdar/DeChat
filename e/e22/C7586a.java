package e22;

import android.view.View;
import android.widget.ListView;
import com.tencent.p014mm.plugin.label.p067ui.ContactEditLabel;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: e22.a */
public final class C7586a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactEditLabel f25855d;

    public C7586a(ContactEditLabel contactEditLabel) {
        this.f25855d = contactEditLabel;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ListView listView = this.f25855d.f198471z;
        if (listView != null) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$1", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$1", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("listView");
        throw null;
    }
}
