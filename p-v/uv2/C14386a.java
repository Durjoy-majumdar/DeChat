package uv2;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.sport.p107ui.SportBlackListUI;

/* renamed from: uv2.a */
public class C14386a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SportBlackListUI f39960d;

    public C14386a(SportBlackListUI sportBlackListUI) {
        this.f39960d = sportBlackListUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f39960d.finish();
        return false;
    }
}
