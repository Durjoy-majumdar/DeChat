package ew0;

import android.widget.CompoundButton;
import com.tencent.p014mm.plugin.battery.stats.MMBatteryStatsActivity;

public final /* synthetic */ class a$$b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MMBatteryStatsActivity f350107a;

    public /* synthetic */ a$$b(MMBatteryStatsActivity mMBatteryStatsActivity) {
        this.f350107a = mMBatteryStatsActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        MMBatteryStatsActivity mMBatteryStatsActivity = this.f350107a;
        if (!z) {
            int i = MMBatteryStatsActivity.f345515j;
        } else if (mMBatteryStatsActivity.f345519g.isChecked()) {
            mMBatteryStatsActivity.f345519g.setChecked(false);
        }
        mMBatteryStatsActivity.mo175078H7();
    }
}
