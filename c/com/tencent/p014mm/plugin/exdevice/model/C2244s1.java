package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.exdevice.model.s1 */
public class C2244s1 implements Runnable {
    public C2244s1(C41166r1 r1Var) {
    }

    public void run() {
        boolean hasSystemFeature = MMApplicationContext.getContext().getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter");
        boolean hasSystemFeature2 = MMApplicationContext.getContext().getPackageManager().hasSystemFeature("android.hardware.sensor.stepdetector");
        if (hasSystemFeature && hasSystemFeature2) {
            C115669n.INSTANCE.mo160126c(11891, "3", true, true);
        } else if (hasSystemFeature) {
            C115669n.INSTANCE.mo160126c(11891, "1", true, true);
        } else if (hasSystemFeature2) {
            C115669n.INSTANCE.mo160126c(11891, "2", true, true);
        }
        Log.m105925i("MicroMsg.exdevice.SubCoreExDevice", "[hakon][step] deviceFeatures stepCounter %s, stepDetector %s", Boolean.valueOf(hasSystemFeature), Boolean.valueOf(hasSystemFeature2));
    }
}
