package hf2;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoSettingUI;

/* renamed from: hf2.i */
public class C46047i implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewBizInfoSettingUI f124168d;

    public C46047i(NewBizInfoSettingUI newBizInfoSettingUI) {
        this.f124168d = newBizInfoSettingUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f124168d.finish();
        return true;
    }
}
