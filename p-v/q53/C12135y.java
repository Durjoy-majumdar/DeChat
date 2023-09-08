package q53;

import android.view.View;
import android.widget.CheckBox;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: q53.y */
public final class C12135y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12049b0 f35238d;

    public C12135y(C12049b0 b0Var) {
        this.f35238d = b0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$updateCheckBox$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CheckBox checkBox = this.f35238d.f35104k;
        if (checkBox == null) {
            C87412m.m108603p("recharge_agreement_link_checkbox");
            throw null;
        } else if (checkBox != null) {
            checkBox.setChecked(!checkBox.isChecked());
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$updateCheckBox$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            C87412m.m108603p("recharge_agreement_link_checkbox");
            throw null;
        }
    }
}
