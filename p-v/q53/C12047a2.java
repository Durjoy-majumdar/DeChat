package q53;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import gy3.C87412m;
import p53.C11851r;

/* renamed from: q53.a2 */
public final class C12047a2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35091d;

    /* renamed from: e */
    public final /* synthetic */ String f35092e;

    public C12047a2(WeCoinIncomeDetailView weCoinIncomeDetailView, String str) {
        this.f35091d = weCoinIncomeDetailView;
        this.f35092e = str;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C11851r rVar = this.f35091d.f21851q;
        if (rVar != null) {
            rVar.mo11732e3(3);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f35092e);
            intent.putExtra("showShare", false);
            intent.putExtra(C74928u.C45093i.f122326r, true);
            C75228t.m90217J(this.f35091d.getContext(), intent);
            return true;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
