package p1071ae;

import com.tencent.matrix.battery.accumulate.AccPowerStats;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: ae.a$$b */
public final /* synthetic */ class a$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112785a f304859d;

    public /* synthetic */ a$$b(C112785a aVar) {
        this.f304859d = aVar;
    }

    public final void run() {
        C112785a aVar = this.f304859d;
        synchronized (aVar.f337706a) {
            Log.m105924i("MicroMsg.AccPowerMonitor", "#dumping, size=" + ((HashMap) aVar.f337706a).size());
            for (AccPowerStats a : ((HashMap) aVar.f337706a).values()) {
                a.mo173592a();
            }
        }
    }
}
