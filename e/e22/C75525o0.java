package e22;

import android.view.View;
import e22.C75516l0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: e22.o0 */
public final class C75525o0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75516l0.C75517a f221904d;

    /* renamed from: e */
    public final /* synthetic */ C75516l0 f221905e;

    public C75525o0(C75516l0.C75517a aVar, C75516l0 l0Var) {
        this.f221904d = aVar;
        this.f221905e = l0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/HeaderLabelDataItem$HeaderLabelViewItem$setHolderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f221904d.mo105836a();
        this.f221904d.mo105836a().setText(" ");
        C75516l0.C75520c cVar = this.f221905e.f221892F;
        if (cVar != null) {
            cVar.mo95165a("");
            this.f221905e.getClass();
            if (this.f221904d.mo105837b().getVisibility() == 0) {
                this.f221904d.mo105837b().setVisibility(8);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/HeaderLabelDataItem$HeaderLabelViewItem$setHolderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("textListener");
        throw null;
    }
}
