package xm3;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import tm3.C78051b;

/* renamed from: xm3.n0 */
public final class C78922n0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78924o0 f231792d;

    public C78922n0(C78924o0 o0Var) {
        this.f231792d = o0Var;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = this.f231792d.mo14598d3();
        if (d3 == null || (stateCenter = d3.getStateCenter()) == null) {
            return false;
        }
        stateCenter.dispatch(new C78051b());
        return false;
    }
}
