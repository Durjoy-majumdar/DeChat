package sb3;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditChangeAmountUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: sb3.b */
public class C77639b implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletWXCreditChangeAmountUI f226358d;

    public C77639b(WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        this.f226358d = walletWXCreditChangeAmountUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f226358d.dismissDialog(2);
        WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = this.f226358d;
        if (walletWXCreditChangeAmountUI.f211381j) {
            if (i == 0) {
                walletWXCreditChangeAmountUI.f211377f.f226007c = "Y";
            } else {
                walletWXCreditChangeAmountUI.f211377f.f226007c = "N";
            }
        } else if (i == 0) {
            walletWXCreditChangeAmountUI.f211378g.f226007c = "Y";
        } else {
            walletWXCreditChangeAmountUI.f211378g.f226007c = "N";
        }
        walletWXCreditChangeAmountUI.mo100094I7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
