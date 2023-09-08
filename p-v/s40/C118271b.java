package s40;

import android.os.Bundle;
import com.tencent.p014mm.lib.riskscanner.RiskScannerReqBufferService;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82540i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kj2.C117407d;
import ts3.C118508c;

/* renamed from: s40.b */
public class C118271b implements C118508c.C118509a {

    /* renamed from: a */
    public final /* synthetic */ Bundle f353489a;

    public C118271b(RiskScannerReqBufferService riskScannerReqBufferService, Bundle bundle) {
        this.f353489a = bundle;
    }

    /* renamed from: a */
    public void mo183054a(int i, byte[] bArr) {
        int i2 = i;
        byte[] bArr2 = bArr;
        ThreadLocal<Long> threadLocal = C118270a.f353488a;
        Log.m105925i("MicroMsg.RiskScannerReportService", "Report scan result, %d", Integer.valueOf(i));
        if (i2 == -10) {
            C117407d.INSTANCE.idkeyStat(590, 2, 1, true);
        } else if (i2 != 0) {
            C117407d.INSTANCE.idkeyStat(590, 3, 1, true);
        } else {
            Long l = C118270a.f353488a.get();
            if (l != null) {
                long currentTicks = Util.currentTicks() - l.longValue();
                Log.m105925i("MicroMsg.RiskScannerReportService", "Scan cost: %d ms", Long.valueOf(currentTicks));
                C117407d.INSTANCE.mo160138m(C82540i0.CTRL_INDEX, 5, 1, (int) currentTicks, true);
            } else {
                C117407d.INSTANCE.idkeyStat(590, 1, 1, true);
            }
        }
        if (i2 == 0 && bArr2 != null) {
            this.f353489a.putInt("errCode", i2);
            this.f353489a.putByteArray("reqBufferBase64", bArr2);
        }
    }
}
