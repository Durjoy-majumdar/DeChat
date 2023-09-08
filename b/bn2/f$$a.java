package bn2;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.setting.p102ui.fixtools.FixToolsUI;

public final /* synthetic */ class f$$a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FixToolsUI f193133d;

    public /* synthetic */ f$$a(FixToolsUI fixToolsUI) {
        this.f193133d = fixToolsUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        FixToolsUI fixToolsUI = this.f193133d;
        int i = FixToolsUI.f205592e;
        fixToolsUI.finish();
        return true;
    }
}
