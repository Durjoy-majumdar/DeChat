package p518fb;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import java.util.HashMap;

/* renamed from: fb.d */
public class C86782d extends C82926s {
    public static final int CTRL_INDEX = 78;
    public static final String NAME = "onKeyboardInput";

    /* renamed from: s */
    public void mo121217s(String str, C81925i2 i2Var) {
        if (i2Var.isRunning()) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("errMsg", "ok");
            hashMap.put("value", str);
            mo115165o(hashMap);
            mo115194p(i2Var);
            mo115158h();
        }
    }
}
