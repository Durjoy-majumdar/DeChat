package rk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rk0.b */
public final class C89982b implements C89997j {

    /* renamed from: d */
    public static final boolean f258541d;

    /* renamed from: a */
    public final String f258542a;

    /* renamed from: b */
    public Map<C89981a, Integer> f258543b;

    /* renamed from: c */
    public int f258544c;

    static {
        boolean z = true;
        if (Log.getLogLevel() > 1) {
            z = false;
        }
        f258541d = z;
    }

    public C89982b(String str) {
        C87412m.m108594g(str, "tag");
        this.f258542a = str;
    }

    /* renamed from: a */
    public void mo124307a(int i, ScanResultCompat scanResultCompat) {
        C87412m.m108594g(scanResultCompat, "resultCompat");
        if (f258541d) {
            String str = this.f258542a;
            Log.m105918d(str, "callbackType:" + i + ", result:" + scanResultCompat);
            return;
        }
        Map map = this.f258543b;
        if (map == null) {
            map = new HashMap();
            this.f258543b = map;
        }
        C89981a aVar = new C89981a(scanResultCompat);
        Integer num = (Integer) map.get(aVar);
        if (num == null) {
            int i2 = this.f258544c;
            this.f258544c = i2 + 1;
            Integer valueOf = Integer.valueOf(i2);
            map.put(aVar, valueOf);
            String str2 = this.f258542a;
            StringBuilder sb = new StringBuilder();
            sb.append("onScanResult, id: ");
            sb.append(valueOf);
            sb.append(", result: ");
            String scanResultCompat2 = aVar.f258540a.toString();
            C87412m.m108593f(scanResultCompat2, "theResult.toString()");
            sb.append(scanResultCompat2);
            Log.m105924i(str2, sb.toString());
            return;
        }
        String str3 = this.f258542a;
        Log.m105924i(str3, "onScanResult, id: " + num + ", result: " + aVar);
    }
}
