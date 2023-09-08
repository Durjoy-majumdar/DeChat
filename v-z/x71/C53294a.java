package x71;

import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import z71.C53753b;
import z71.C53754c;

/* renamed from: x71.a */
public class C53294a {
    /* renamed from: a */
    public static void m59722a(long j, int i) {
        C53754c Bx0 = C41166r1.Bx0();
        C53753b SE = Bx0.mo74331SE(j + "");
        if (SE == null) {
            Log.m105920e("MicroMsg.exdevice.BTDeviceReport", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
            return;
        }
        C115669n.INSTANCE.kvStat(11232, SE.field_deviceType + ',' + SE.field_deviceID + ',' + i);
    }
}
