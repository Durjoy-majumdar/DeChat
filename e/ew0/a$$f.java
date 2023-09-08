package ew0;

import android.content.Context;
import com.tencent.matrix.batterycanary.stats.C114572i;
import com.tencent.p014mm.plugin.battery.stats.MMBatteryStatsActivity;
import p981ie.C87705i;
import qo3.C77407n;

public final /* synthetic */ class a$$f implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ MMBatteryStatsActivity f350109a;

    public /* synthetic */ a$$f(MMBatteryStatsActivity mMBatteryStatsActivity) {
        this.f350109a = mMBatteryStatsActivity;
    }

    public final void accept(Object obj) {
        MMBatteryStatsActivity mMBatteryStatsActivity = this.f350109a;
        int i = MMBatteryStatsActivity.f345515j;
        C77407n nVar = new C77407n((Context) mMBatteryStatsActivity.getContext(), 1, true);
        nVar.f225771i = new a$$g((C114572i) obj);
        nVar.f225782p = new a$$h(mMBatteryStatsActivity);
        nVar.mo107570o(true);
        nVar.mo107568m("选择进程", 17, 0);
        nVar.mo107559d(true);
        nVar.mo107573q();
    }
}
