package ew0;

import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.battery.stats.MMBatteryStatsActivity;
import com.tencent.xweb.file.XVFSFile;
import nj3.C11184p0;
import p1196he.C117080b;

public final /* synthetic */ class a$$h implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ MMBatteryStatsActivity f350111d;

    public /* synthetic */ a$$h(MMBatteryStatsActivity mMBatteryStatsActivity) {
        this.f350111d = mMBatteryStatsActivity;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        MMBatteryStatsActivity mMBatteryStatsActivity = this.f350111d;
        int i2 = MMBatteryStatsActivity.f345515j;
        mMBatteryStatsActivity.getClass();
        String charSequence = menuItem.getTitle().toString();
        if (charSequence.contains(XVFSFile.PATH_SEPARATOR)) {
            String substring = charSequence.substring(charSequence.lastIndexOf(XVFSFile.PATH_SEPARATOR) + 1);
            mMBatteryStatsActivity.removeAllOptionMenu();
            mMBatteryStatsActivity.addTextOptionMenu(1, XVFSFile.PATH_SEPARATOR + substring, new a$$a(mMBatteryStatsActivity), (View.OnLongClickListener) null, MMActivityController.C73075r.NORMAL);
            C116790e eVar = mMBatteryStatsActivity.f345516d;
            eVar.f343432e = substring;
            eVar.f343431d = 0;
            eVar.f343430c.post(new C117080b(eVar));
            mMBatteryStatsActivity.f345516d.mo173755b();
            mMBatteryStatsActivity.mo175079I7(0);
        }
    }
}
