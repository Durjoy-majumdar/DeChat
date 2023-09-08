package sj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import java.util.HashMap;
import java.util.Map;
import kr0.C88267e;
import xj0.C91216b0;

public final /* synthetic */ class f$$d implements C91216b0 {

    /* renamed from: a */
    public final /* synthetic */ C90210f f258989a;

    /* renamed from: b */
    public final /* synthetic */ long f258990b;

    /* renamed from: c */
    public final /* synthetic */ C88267e f258991c;

    /* renamed from: d */
    public final /* synthetic */ int f258992d;

    public /* synthetic */ f$$d(C90210f fVar, long j, C88267e eVar, int i) {
        this.f258989a = fVar;
        this.f258990b = j;
        this.f258991c = eVar;
        this.f258992d = i;
    }

    /* renamed from: a */
    public final void mo123718a(int i, int i2, String str, Object obj) {
        C90210f fVar = this.f258989a;
        long j = this.f258990b;
        C88267e eVar = this.f258991c;
        int i3 = this.f258992d;
        String str2 = (String) obj;
        fVar.getClass();
        Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: request start done! using: %d ms, %d, %d, %s", Long.valueOf(Util.ticksToNow(j)), Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            fVar.f258982i = eVar.getAppId();
            fVar.f258981h = new f$$i(fVar, eVar);
            if (!(eVar.getRuntime() == null || eVar.getRuntime().f238113K == null)) {
                eVar.getRuntime().f238113K.mo122978a(fVar.f258981h);
            }
            fVar.mo124449A(eVar, i3, (Map<String, Object>) null);
            C90202a aVar = fVar.f258980g;
            aVar.mo115194p(eVar);
            Log.m105924i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch start");
            HashMap hashMap = new HashMap(1);
            hashMap.put("state", IXWebBroadcastListener.STAGE_START);
            aVar.mo115165o(hashMap);
            aVar.mo115158h();
            return;
        }
        fVar.mo124450z(eVar, i3, i, i2, str);
    }
}
