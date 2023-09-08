package sj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import kr0.C88267e;
import xj0.C91237o;

public final /* synthetic */ class f$$e implements C91237o.C91240c {

    /* renamed from: a */
    public final /* synthetic */ C90210f f258993a;

    /* renamed from: b */
    public final /* synthetic */ C88267e f258994b;

    public /* synthetic */ f$$e(C90210f fVar, C88267e eVar) {
        this.f258993a = fVar;
        this.f258994b = eVar;
    }

    /* renamed from: a */
    public final void mo124451a(long j) {
        C90210f fVar = this.f258993a;
        C88267e eVar = this.f258994b;
        fVar.getClass();
        Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: relative ticks in ms: %d", Long.valueOf(j));
        C90202a aVar = fVar.f258980g;
        aVar.mo115194p(eVar);
        Log.m105925i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch stamp change: %d", Long.valueOf(j));
        HashMap hashMap = new HashMap(2);
        hashMap.put("state", "timeUpdate");
        hashMap.put("currentTime", Long.valueOf(j));
        aVar.mo115165o(hashMap);
        aVar.mo115158h();
    }
}
