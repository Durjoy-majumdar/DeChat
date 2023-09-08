package ew0;

import com.tencent.matrix.batterycanary.stats.BatteryRecord;
import com.tencent.matrix.batterycanary.stats.p1183ui.C114595c;
import com.tencent.p014mm.plugin.battery.stats.MMBatteryStatsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class a$$d implements C114595c.C114596a {
    /* renamed from: a */
    public final List mo173757a(List list) {
        int i = MMBatteryStatsActivity.f345515j;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BatteryRecord batteryRecord = (BatteryRecord) it.next();
            if (batteryRecord instanceof BatteryRecord.EventStatRecord) {
                BatteryRecord.EventStatRecord eventStatRecord = (BatteryRecord.EventStatRecord) batteryRecord;
                if ("BATTERY_STAT".equals(eventStatRecord.f343329g) && (eventStatRecord.f343330h.containsKey("battery-change") || eventStatRecord.f343330h.containsKey("battery-low"))) {
                    arrayList.add(batteryRecord);
                }
            }
        }
        return arrayList;
    }
}
