package wm3;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import tm3.C78055d;

/* renamed from: wm3.b */
public final class C78628b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78631f f230309d;

    public C78628b(C78631f fVar) {
        this.f230309d = fVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        UIStateCenter stateCenter;
        C78631f fVar = this.f230309d;
        fVar.mo108608g3(4);
        BaseMvvmActivity d3 = fVar.mo14598d3();
        if (d3 == null || (stateCenter = d3.getStateCenter()) == null) {
            return false;
        }
        stateCenter.dispatch(new C78055d());
        return false;
    }
}
