package e22;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.label.p067ui.ContactEditLabel;

/* renamed from: e22.g */
public final class C75505g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactEditLabel f221876d;

    public C75505g(ContactEditLabel contactEditLabel) {
        this.f221876d = contactEditLabel;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f221876d.hideVKB();
        this.f221876d.onBackPressed();
        return false;
    }
}
