package sb3;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditChangeAmountUI;
import j20.C117292a;
import java.util.ArrayList;
import rb3.C77509l;

/* renamed from: sb3.a */
public class C77638a implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletWXCreditChangeAmountUI f226357d;

    public C77638a(WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        this.f226357d = walletWXCreditChangeAmountUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f226357d.dismissDialog(1);
        WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = this.f226357d;
        if (walletWXCreditChangeAmountUI.f211380i) {
            walletWXCreditChangeAmountUI.f211377f.f226005a = 0;
            walletWXCreditChangeAmountUI.f211377f = (C77509l) ((ArrayList) walletWXCreditChangeAmountUI.f211376e).get(i);
            this.f226357d.f211377f.f226005a = 1;
        } else {
            walletWXCreditChangeAmountUI.f211378g.f226005a = 0;
            walletWXCreditChangeAmountUI.f211378g = (C77509l) ((ArrayList) walletWXCreditChangeAmountUI.f211376e).get(i);
            this.f226357d.f211378g.f226005a = 2;
        }
        this.f226357d.mo100094I7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
