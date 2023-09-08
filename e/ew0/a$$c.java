package ew0;

import android.widget.CompoundButton;
import com.tencent.p014mm.plugin.battery.stats.MMBatteryStatsActivity;

public final /* synthetic */ class a$$c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MMBatteryStatsActivity f350108a;

    public /* synthetic */ a$$c(MMBatteryStatsActivity mMBatteryStatsActivity) {
        this.f350108a = mMBatteryStatsActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        MMBatteryStatsActivity mMBatteryStatsActivity = this.f350108a;
        if (!z) {
            int i = MMBatteryStatsActivity.f345515j;
        } else if (mMBatteryStatsActivity.f345518f.isChecked()) {
            mMBatteryStatsActivity.f345518f.setChecked(false);
        }
        mMBatteryStatsActivity.mo175078H7();
    }
}
