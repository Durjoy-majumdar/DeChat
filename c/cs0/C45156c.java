package cs0;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.revoke.AppBrandUserInfoRevokePage;

/* renamed from: cs0.c */
public final class C45156c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandUserInfoRevokePage f122438d;

    public C45156c(AppBrandUserInfoRevokePage appBrandUserInfoRevokePage) {
        this.f122438d = appBrandUserInfoRevokePage;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f122438d.finish();
        return true;
    }
}
