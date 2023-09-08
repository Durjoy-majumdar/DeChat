package q53;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p53.C11851r;

/* renamed from: q53.n1 */
public final class C12099n1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35186d;

    public C12099n1(WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f35186d = weCoinIncomeDetailView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C11851r rVar = this.f35186d.f21851q;
        if (rVar != null) {
            String value = rVar.f34656e.getValue();
            if (!(value == null || value.length() == 0)) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", value);
                intent.putExtra("showShare", false);
                intent.putExtra(C74928u.C45093i.f122326r, true);
                C75228t.m90217J(this.f35186d.getContext(), intent);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
