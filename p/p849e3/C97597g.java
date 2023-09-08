package p849e3;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.fav.p047ui.FavSearchUI;
import p849e3.C107197h;

/* renamed from: e3.g */
public class C97597g implements MenuItem.OnActionExpandListener {

    /* renamed from: d */
    public final /* synthetic */ C107197h.C97599a f286329d;

    public C97597g(C107197h.C97599a aVar) {
        this.f286329d = aVar;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        FavSearchUI.C93446f fVar = (FavSearchUI.C93446f) this.f286329d;
        FavSearchUI favSearchUI = FavSearchUI.this;
        int i = FavSearchUI.f269788N;
        if (favSearchUI.mo128298N7()) {
            return false;
        }
        FavSearchUI.this.finish();
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        this.f286329d.getClass();
        return true;
    }
}
