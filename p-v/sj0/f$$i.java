package sj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import kr0.C88267e;
import li0.C88508b;
import li0.C88509c;
import xj0.C91237o;
import xj0.C91251u;
import xj0.C91252v;
import xj0.C91255x;

public final /* synthetic */ class f$$i implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ C90210f f259006d;

    /* renamed from: e */
    public final /* synthetic */ C88267e f259007e;

    public /* synthetic */ f$$i(C90210f fVar, C88267e eVar) {
        this.f259006d = fVar;
        this.f259007e = eVar;
    }

    /* renamed from: b */
    public final void mo113102b(String str, C88508b bVar) {
        C90210f fVar = this.f259006d;
        C88267e eVar = this.f259007e;
        fVar.getClass();
        if (bVar == C88508b.BACKGROUND && !Util.isNullOrNil(str) && str.equals(fVar.f258982i)) {
            Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: %s trigger background, pause recording", str);
            C91237o b = C91237o.m114472b(eVar.getAppId(), eVar);
            f$$j f__j = new f$$j(fVar, eVar);
            b.getClass();
            Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger pause");
            b.f261806a.postToWorker(new C91251u(b, f__j));
        } else if (bVar == C88508b.FOREGROUND && !Util.isNullOrNil(str) && str.equals(fVar.f258982i)) {
            Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: %s trigger foreground, resume recording", str);
            C91237o b2 = C91237o.m114472b(eVar.getAppId(), eVar);
            f$$k f__k = new f$$k(fVar, eVar);
            b2.getClass();
            Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger resume");
            b2.f261806a.postToWorker(new C91252v(b2, f__k));
        } else if (bVar == C88508b.DESTROYED) {
            Map<String, C91237o> map = C91237o.f261804g;
            synchronized (C91237o.class) {
                ((HashMap) C91237o.f261804g).remove(str);
            }
            if (!Util.isNullOrNil(str) && str.equals(fVar.f258982i)) {
                C91237o b3 = C91237o.m114472b(eVar.getAppId(), eVar);
                f$$b f__b = new f$$b();
                b3.getClass();
                Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger abort");
                b3.f261806a.postToWorker(new C91255x(b3, f__b));
            }
            fVar.f258982i = null;
            if (eVar.getRuntime() != null && eVar.getRuntime().f238113K != null) {
                eVar.getRuntime().f238113K.mo122982e(fVar.f258981h);
            }
        }
    }
}
