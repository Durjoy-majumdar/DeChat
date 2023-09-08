package rm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.utils.C84800z1;
import java.util.HashMap;

/* renamed from: rm0.g */
public class C90034g extends C82919r2 {
    public static final int CTRL_INDEX = 473;
    public static final String NAME = "onDeviceOrientationChange";

    /* renamed from: p */
    public void mo124342p(C84800z1.C84801a aVar) {
        String replace = aVar.name().replace("_", "");
        HashMap hashMap = new HashMap(2);
        hashMap.put("errMsg", "ok");
        hashMap.put("value", replace);
        try {
            mo115165o(hashMap);
            mo115158h();
        } catch (NullPointerException unused) {
        }
    }
}
