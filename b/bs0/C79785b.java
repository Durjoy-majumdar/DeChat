package bs0;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage.AppBrandPrivacyManagePage;

/* renamed from: bs0.b */
public final class C79785b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandPrivacyManagePage f233810d;

    public C79785b(AppBrandPrivacyManagePage appBrandPrivacyManagePage) {
        this.f233810d = appBrandPrivacyManagePage;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f233810d.finish();
        return true;
    }
}
