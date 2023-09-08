package wm3;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import tm3.C78051b;

/* renamed from: wm3.a */
public final class C78627a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78631f f230308d;

    public C78627a(C78631f fVar) {
        this.f230308d = fVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        UIStateCenter stateCenter;
        C78631f fVar = this.f230308d;
        fVar.mo108608g3(5);
        BaseMvvmActivity d3 = fVar.mo14598d3();
        if (d3 == null || (stateCenter = d3.getStateCenter()) == null) {
            return false;
        }
        stateCenter.dispatch(new C78051b());
        return false;
    }
}
