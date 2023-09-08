package sj0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import xj0.C91216b0;

public final /* synthetic */ class f$$g implements C91216b0 {

    /* renamed from: a */
    public final /* synthetic */ C90210f f258998a;

    /* renamed from: b */
    public final /* synthetic */ C81925i2 f258999b;

    /* renamed from: c */
    public final /* synthetic */ int f259000c;

    public /* synthetic */ f$$g(C90210f fVar, C81925i2 i2Var, int i) {
        this.f258998a = fVar;
        this.f258999b = i2Var;
        this.f259000c = i;
    }

    /* renamed from: a */
    public final void mo123718a(int i, int i2, String str, Object obj) {
        C90210f fVar = this.f258998a;
        C81925i2 i2Var = this.f258999b;
        int i3 = this.f259000c;
        String str2 = (String) obj;
        fVar.getClass();
        Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: abort result %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            fVar.mo124449A(i2Var, i3, (Map<String, Object>) null);
            C90202a aVar = fVar.f258980g;
            aVar.mo115194p(i2Var);
            Log.m105924i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch abort");
            HashMap hashMap = new HashMap(1);
            hashMap.put("state", "abort");
            aVar.mo115165o(hashMap);
            aVar.mo115158h();
            return;
        }
        fVar.mo124450z(i2Var, i3, i, i2, str);
    }
}
