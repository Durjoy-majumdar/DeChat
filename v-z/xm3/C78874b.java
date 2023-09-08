package xm3;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import tm3.C78051b;

/* renamed from: xm3.b */
public final class C78874b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78881e f231723d;

    public C78874b(C78881e eVar) {
        this.f231723d = eVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = this.f231723d.mo14598d3();
        if (d3 == null || (stateCenter = d3.getStateCenter()) == null) {
            return false;
        }
        stateCenter.dispatch(new C78051b());
        return false;
    }
}
