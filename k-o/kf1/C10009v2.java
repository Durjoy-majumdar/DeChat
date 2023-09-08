package kf1;

import android.view.View;
import android.view.ViewGroup;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: kf1.v2 */
public final class C10009v2 extends C9854m5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10009v2(MMActivity mMActivity, C9994u2 u2Var, int i, int i2) {
        super(mMActivity, u2Var, i, i2);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(u2Var, "presenter");
    }

    /* renamed from: k0 */
    public void mo9301k0(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        super.mo9301k0(arrayList);
        RefreshLoadMoreLayout D = mo10308D();
        View inflate = C85868k2.m106137b(this.f30122d).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(context).inf…t.load_more_footer, null)");
        D.setLoadMoreFooter(inflate);
    }

    /* renamed from: x */
    public View mo5184x() {
        return null;
    }
}
