package sj0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: sj0.a */
public class C90202a extends C82926s {
    public static final int CTRL_INDEX = 667;
    public static final String NAME = "onGameRecorderStateChange";

    /* renamed from: s */
    public void mo124441s(C81925i2 i2Var, int i, String str) {
        mo115194p(i2Var);
        Log.m105925i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch error: %d, %s", Integer.valueOf(i), str);
        HashMap hashMap = new HashMap(3);
        hashMap.put("state", "error");
        hashMap.put("errCode", Integer.valueOf(i));
        hashMap.put("errMsg", str);
        mo115165o(hashMap);
        mo115158h();
    }

    /* renamed from: t */
    public void mo124442t(C81925i2 i2Var) {
        mo115194p(i2Var);
        Log.m105924i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch pause");
        HashMap hashMap = new HashMap(1);
        hashMap.put("state", "pause");
        mo115165o(hashMap);
        mo115158h();
    }

    /* renamed from: u */
    public void mo124443u(C81925i2 i2Var) {
        mo115194p(i2Var);
        Log.m105924i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch resume");
        HashMap hashMap = new HashMap(1);
        hashMap.put("state", "resume");
        mo115165o(hashMap);
        mo115158h();
    }
}
