package ds0;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.use_record.AppBrandPrivacyUseRecordPage;

/* renamed from: ds0.a */
public final class C45441a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandPrivacyUseRecordPage f122977d;

    public C45441a(AppBrandPrivacyUseRecordPage appBrandPrivacyUseRecordPage) {
        this.f122977d = appBrandPrivacyUseRecordPage;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f122977d.finish();
        return true;
    }
}
