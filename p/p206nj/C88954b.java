package p206nj;

import android.content.Context;
import android.os.Build;
import com.tencent.map.geolocation.sapp.TencentLocationListener;
import com.tencent.p014mm.sdk.platformtools.EasyXml;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p156gj.C87201q;
import p156gj.C87203t;

/* renamed from: nj.b */
public class C88954b {
    /* renamed from: a */
    public static final String m111056a(Context context) {
        EasyXml easyXml = new EasyXml("softtype");
        String nullAs = Util.nullAs(C87201q.m108259c().get("Processor"), "");
        Log.m105919d("MicroMsg.AndroidDevicesReport", "cpu %s", nullAs);
        easyXml.addTag("cpu", nullAs);
        easyXml.addTag(TencentLocationListener.RADIO, Util.nullAsNil(C87203t.f252884i.mo121645a()));
        easyXml.addTag("osversion", Build.VERSION.RELEASE);
        String f = C87203t.m108270f(true);
        String g = C87203t.m108271g();
        easyXml.addTag("deviceId", f);
        easyXml.addTag("imsi", g);
        easyXml.addTag("iccid", "");
        easyXml.addTag("androidid", C87203t.m108266b());
        easyXml.addTag("serial", Util.nullAsNil(C87203t.f252878c.mo121645a()));
        easyXml.addTag("model", C87203t.m108275k());
        easyXml.addTag("core_count", C87201q.m108260d() + "");
        easyXml.addTag("cpuhardware", Util.nullAs(C87201q.m108257a().get("Hardware"), ""));
        easyXml.addTag("cpureversion", Util.nullAs(C87201q.m108257a().get("CPU revision"), ""));
        easyXml.addTag("cpuserial", Util.nullAs(C87201q.m108257a().get("Serial"), ""));
        easyXml.addTag("Features", Util.nullAs(C87201q.m108257a().get("Features"), ""));
        easyXml.addTag("wifi-mac", Util.nullAs(Util.nullAsNil(C87203t.f252879d.mo121645a()), ""));
        easyXml.addTag("bluetooth", Util.nullAs("", ""));
        String xml = easyXml.getXml();
        Log.m105919d("MicroMsg.AndroidDevicesReport", "xmlStr %s", xml);
        return xml;
    }
}
