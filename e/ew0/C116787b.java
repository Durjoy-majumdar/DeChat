package ew0;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.battery.stats.MMBatteryStatsActivity;

/* renamed from: ew0.b */
public class C116787b extends RecyclerView.C16615g {

    /* renamed from: a */
    public final /* synthetic */ LinearLayoutManager f350112a;

    /* renamed from: b */
    public final /* synthetic */ MMBatteryStatsActivity f350113b;

    public C116787b(MMBatteryStatsActivity mMBatteryStatsActivity, LinearLayoutManager linearLayoutManager) {
        this.f350113b = mMBatteryStatsActivity;
        this.f350112a = linearLayoutManager;
    }

    /* renamed from: b */
    public void mo2556b() {
        int C = this.f350112a.mo16957C();
        MMBatteryStatsActivity mMBatteryStatsActivity = this.f350113b;
        int i = MMBatteryStatsActivity.f345515j;
        mMBatteryStatsActivity.mo175079I7(C);
    }
}
