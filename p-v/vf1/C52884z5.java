package vf1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI39;

/* renamed from: vf1.z5 */
public final class C52884z5 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ OccupyFinderUI39 f147686d;

    public C52884z5(OccupyFinderUI39 occupyFinderUI39) {
        this.f147686d = occupyFinderUI39;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f147686d.finish();
        return true;
    }
}
