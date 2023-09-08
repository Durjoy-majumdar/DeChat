package hl3;

import android.view.MenuItem;
import com.tencent.p014mm.p136ui.contact.privacy.FinderBlockListUI;

/* renamed from: hl3.d */
public class C8605d implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderBlockListUI f27708d;

    public C8605d(FinderBlockListUI finderBlockListUI) {
        this.f27708d = finderBlockListUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f27708d.finish();
        return false;
    }
}
