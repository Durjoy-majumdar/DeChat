package q53;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import q53.C12041a;
import te3.C51526uc2;
import te3.e35;

/* renamed from: q53.r */
public final class C12113r implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12041a f35207d;

    /* renamed from: e */
    public final /* synthetic */ C51526uc2 f35208e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<e35> f35209f;

    public C12113r(C12041a aVar, C51526uc2 uc22, ArrayList<e35> arrayList) {
        this.f35207d = aVar;
        this.f35208e = uc22;
        this.f35209f = arrayList;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updatePriceItem$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C12041a aVar = this.f35207d;
        C12041a.C12042a aVar2 = aVar.f35068h;
        if (aVar2 != null) {
            if (!aVar2.f35077f || i != 2) {
                e35 e35 = this.f35209f.get(i);
                C87412m.m108593f(e35, "secondMenuArray[position]");
                C12041a.m11742d(aVar, e35);
            } else {
                C51526uc2 uc22 = this.f35208e;
                View view2 = aVar.f35069i;
                if (view2 == null) {
                    C87412m.m108603p("mCustomView");
                    throw null;
                } else if (((CheckBox) view2.findViewById(C0966R.C0970id.ifq)).isChecked()) {
                    C12062e0 e0Var = new C12062e0(aVar.f35061a, new C12102o0(uc22.f142743h.f131487f, aVar.f35066f, new C12081j(aVar)));
                    e0Var.f35145h.mo104022e();
                    e0Var.f35140c.mo140655A();
                    WalletFormView walletFormView = e0Var.f35143f;
                    if (walletFormView != null) {
                        walletFormView.post(new C12094m0(e0Var));
                    } else {
                        C87412m.m108603p("inputArea");
                        throw null;
                    }
                } else {
                    aVar.mo11895e();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updatePriceItem$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        C87412m.m108603p("mSecondAdapter");
        throw null;
    }
}
