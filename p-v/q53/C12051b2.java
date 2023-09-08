package q53;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p53.C11851r;
import te3.C51310sx;

/* renamed from: q53.b2 */
public final class C12051b2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35113d;

    /* renamed from: e */
    public final /* synthetic */ C51310sx f35114e;

    public C12051b2(WeCoinIncomeDetailView weCoinIncomeDetailView, C51310sx sxVar) {
        this.f35113d = weCoinIncomeDetailView;
        this.f35114e = sxVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateTopBannerView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C11851r rVar = this.f35113d.f21851q;
        if (rVar != null) {
            rVar.mo11732e3(9);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f35114e.f141811e);
            C75228t.m90217J(this.f35113d, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateTopBannerView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
