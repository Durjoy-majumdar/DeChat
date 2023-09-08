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

/* renamed from: q53.z1 */
public final class C12138z1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35242d;

    /* renamed from: e */
    public final /* synthetic */ String f35243e;

    public C12138z1(WeCoinIncomeDetailView weCoinIncomeDetailView, String str) {
        this.f35242d = weCoinIncomeDetailView;
        this.f35243e = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateFaqView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C11851r rVar = this.f35242d.f21851q;
        if (rVar != null) {
            rVar.mo11732e3(7);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f35243e);
            intent.putExtra("showShare", false);
            intent.putExtra(C74928u.C45093i.f122326r, true);
            C75228t.m90217J(this.f35242d.getContext(), intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateFaqView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
