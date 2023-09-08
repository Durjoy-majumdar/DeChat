package ew0;

import android.view.MenuItem;
import com.tencent.matrix.batterycanary.stats.C114572i;
import com.tencent.p014mm.plugin.battery.stats.MMBatteryStatsActivity;
import p933be.C79691a;

public final /* synthetic */ class a$$a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMBatteryStatsActivity f350106d;

    public /* synthetic */ a$$a(MMBatteryStatsActivity mMBatteryStatsActivity) {
        this.f350106d = mMBatteryStatsActivity;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        MMBatteryStatsActivity mMBatteryStatsActivity = this.f350106d;
        int i = MMBatteryStatsActivity.f345515j;
        mMBatteryStatsActivity.getClass();
        C79691a.m96805b(C114572i.class, new a$$f(mMBatteryStatsActivity));
        return false;
    }
}
