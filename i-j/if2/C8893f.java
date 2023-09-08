package if2;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.auth.NewBizInfoAuthMainUI;

/* renamed from: if2.f */
public final class C8893f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewBizInfoAuthMainUI f28164d;

    public C8893f(NewBizInfoAuthMainUI newBizInfoAuthMainUI) {
        this.f28164d = newBizInfoAuthMainUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f28164d.finish();
        return true;
    }
}
