package kf1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: kf1.j3 */
public final class C9806j3 extends C9854m5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9806j3(MMActivity mMActivity, C9788i3 i3Var, int i, int i2) {
        super(mMActivity, i3Var, i, i2);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(i3Var, "presenter");
    }

    /* renamed from: k0 */
    public void mo9301k0(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        super.mo9301k0(arrayList);
        RecyclerView.LayoutManager layoutManager = mo10308D().getRecyclerView().getLayoutManager();
        FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof FinderLinearLayoutManager ? (FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager != null) {
            finderLinearLayoutManager.f162357A = false;
        }
    }

    /* renamed from: x */
    public View mo5184x() {
        return null;
    }
}
