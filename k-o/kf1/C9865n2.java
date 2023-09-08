package kf1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: kf1.n2 */
public final class C9865n2 extends C9854m5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9865n2(MMActivity mMActivity, C9849m2 m2Var, int i, int i2) {
        super(mMActivity, m2Var, i, i2);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(m2Var, "presenter");
    }

    /* renamed from: k0 */
    public void mo9301k0(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        super.mo9301k0(arrayList);
        RefreshLoadMoreLayout D = mo10308D();
        View inflate = C85868k2.m106137b(this.f30122d).inflate(C0966R.C0971layout.b7u, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(context).inf…d_more_footer_dark, null)");
        D.setLoadMoreFooter(inflate);
        RecyclerView.LayoutManager layoutManager = mo10308D().getRecyclerView().getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        ((FinderLinearLayoutManager) layoutManager).f162357A = false;
    }

    /* renamed from: x */
    public View mo5184x() {
        return null;
    }
}
