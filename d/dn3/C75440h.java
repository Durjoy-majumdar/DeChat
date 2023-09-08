package dn3;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import tm3.C78051b;

/* renamed from: dn3.h */
public final class C75440h implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75431g f221744d;

    public C75440h(C75431g gVar) {
        this.f221744d = gVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = this.f221744d.mo14598d3();
        if (d3 == null || (stateCenter = d3.getStateCenter()) == null) {
            return false;
        }
        stateCenter.dispatch(new C78051b());
        return false;
    }
}
