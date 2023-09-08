package vf1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveDelManagerUI;

/* renamed from: vf1.j2 */
public final class C65708j2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveDelManagerUI f189054d;

    public C65708j2(FinderLiveDelManagerUI finderLiveDelManagerUI) {
        this.f189054d = finderLiveDelManagerUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f189054d.finish();
        return true;
    }
}
