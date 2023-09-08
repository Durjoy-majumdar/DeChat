package vf1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;

/* renamed from: vf1.f3 */
public final class C14761f3 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveOrderUI f40735d;

    public C14761f3(FinderLiveOrderUI finderLiveOrderUI) {
        this.f40735d = finderLiveOrderUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f40735d.finish();
        return true;
    }
}
