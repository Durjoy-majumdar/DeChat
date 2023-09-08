package hf2;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoMoreInofUI;

/* renamed from: hf2.a */
public class C8515a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewBizInfoMoreInofUI f27551d;

    public C8515a(NewBizInfoMoreInofUI newBizInfoMoreInofUI) {
        this.f27551d = newBizInfoMoreInofUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f27551d.finish();
        return true;
    }
}
