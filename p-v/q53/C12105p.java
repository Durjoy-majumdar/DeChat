package q53;

import android.view.View;
import android.widget.CheckBox;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: q53.p */
public final class C12105p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CheckBox f35195d;

    /* renamed from: e */
    public final /* synthetic */ C12041a f35196e;

    public C12105p(CheckBox checkBox, C12041a aVar) {
        this.f35195d = checkBox;
        this.f35196e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updateCheckBox$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f35195d.isChecked()) {
            this.f35195d.setChecked(false);
            this.f35196e.f35065e.mo11724d3(4);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updateCheckBox$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f35195d.setChecked(true);
        this.f35196e.f35065e.mo11724d3(3);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updateCheckBox$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
