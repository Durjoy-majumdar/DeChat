package sl0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashMap;
import sp0.C22381b0;

/* renamed from: sl0.a */
public class C22364a extends C82919r2 {
    private static final int CTRL_INDEX = 530;
    private static final String NAME = "onLocalServiceEvent";

    /* renamed from: p */
    public static synchronized void m26047p(C82381f fVar, C22381b0.C22384c cVar, String str, int i) {
        synchronized (C22364a.class) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", str);
            if (TextUtils.equals(str, "found") || TextUtils.equals(str, "lost") || TextUtils.equals(str, "resolveFail")) {
                hashMap.put("serviceType", cVar.f63465c);
                hashMap.put("serviceName", cVar.f63464b);
                if (!TextUtils.equals(str, "resolveFail")) {
                    hashMap.put(TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP, cVar.f63466d);
                    hashMap.put("port", Integer.valueOf(cVar.f63467e));
                    hashMap.put("attributes", cVar.f63463a);
                } else {
                    hashMap.put("errno", 606101);
                    hashMap.put("errnMsg", String.format("fail:mdns resolve system error:%d", new Object[]{Integer.valueOf(i)}));
                }
            }
            C22364a aVar = new C22364a();
            aVar.mo115165o(hashMap);
            aVar.mo115161k(fVar);
            aVar.mo115158h();
        }
    }
}
