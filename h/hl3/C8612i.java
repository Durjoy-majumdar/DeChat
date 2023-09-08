package hl3;

import android.view.MenuItem;
import com.tencent.p014mm.p136ui.contact.privacy.SportBlackListUI;

/* renamed from: hl3.i */
public class C8612i implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SportBlackListUI f27714d;

    public C8612i(SportBlackListUI sportBlackListUI) {
        this.f27714d = sportBlackListUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f27714d.finish();
        return false;
    }
}
