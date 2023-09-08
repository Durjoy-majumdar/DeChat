package vf1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveEndUI;

/* renamed from: vf1.r2 */
public final class C14820r2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveEndUI f40815d;

    public C14820r2(FinderLiveEndUI finderLiveEndUI) {
        this.f40815d = finderLiveEndUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f40815d.finish();
        return true;
    }
}
