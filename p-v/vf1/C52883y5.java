package vf1;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI39;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI40;
import j20.C117292a;
import k20.C9556a;

/* renamed from: vf1.y5 */
public final class C52883y5 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ OccupyFinderUI39 f147685d;

    public C52883y5(OccupyFinderUI39 occupyFinderUI39) {
        this.f147685d = occupyFinderUI39;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent(this.f147685d, OccupyFinderUI40.class);
        OccupyFinderUI39 occupyFinderUI39 = this.f147685d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        OccupyFinderUI39 occupyFinderUI392 = occupyFinderUI39;
        C117292a.m165358d(occupyFinderUI392, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI39$initSearch$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        occupyFinderUI39.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(occupyFinderUI392, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI39$initSearch$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
