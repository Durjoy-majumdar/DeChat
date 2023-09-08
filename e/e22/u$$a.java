package e22;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelSelectUI;

public final /* synthetic */ class u$$a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelSelectUI f221924d;

    public /* synthetic */ u$$a(ContactLabelSelectUI contactLabelSelectUI) {
        this.f221924d = contactLabelSelectUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        ContactLabelSelectUI contactLabelSelectUI = this.f221924d;
        int i = ContactLabelSelectUI.f198575X;
        contactLabelSelectUI.setResult(0);
        contactLabelSelectUI.finish();
        return true;
    }
}
