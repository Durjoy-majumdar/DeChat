package ga3;

import com.tencent.p014mm.autogen.events.ScanQrcodeExtDeviceLoginEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C86497v5;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: ga3.k */
public class C32370k implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        String str = XmlParser.parseXml(C48374j0.m53718g(aVar.f94242a.f227631h), "sysmsg", (String) null).get(".sysmsg.pushloginurl.url");
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.SubCoreWebWX.pushloginurl", "pushloginurl is null");
        }
        ScanQrcodeExtDeviceLoginEvent scanQrcodeExtDeviceLoginEvent = new ScanQrcodeExtDeviceLoginEvent();
        ScanQrcodeExtDeviceLoginEvent.C28819a aVar2 = scanQrcodeExtDeviceLoginEvent.f78966d;
        aVar2.f78967a = str;
        aVar2.f78968b = 1;
        scanQrcodeExtDeviceLoginEvent.publish();
        aVar.f94242a.f227637q = null;
    }
}
