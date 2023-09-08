package q53;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;
import te3.C50508n81;

/* renamed from: q53.v1 */
public final class C12128v1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C50508n81 f35228d;

    /* renamed from: e */
    public final /* synthetic */ WeCoinIncomeDetailView f35229e;

    public C12128v1(C50508n81 n812, WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f35228d = n812;
        this.f35229e = weCoinIncomeDetailView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$initLiveSettlement$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f35228d.f138476e);
        C75228t.m90217J(this.f35229e, intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$initLiveSettlement$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
