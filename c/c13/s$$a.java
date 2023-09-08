package c13;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.p014mm.plugin.trafficmonitor.C19401a;
import com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.concurrent.ConcurrentHashMap;
import p646pn.C110234e;
import xv0.C112181e;
import zt3.C119157j;

public final /* synthetic */ class s$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C28478s f308542d;

    /* renamed from: e */
    public final /* synthetic */ Context f308543e;

    public /* synthetic */ s$$a(C28478s sVar, Context context) {
        this.f308542d = sVar;
        this.f308543e = context;
    }

    public final void run() {
        C112181e pY;
        C28478s sVar = this.f308542d;
        Context context = this.f308543e;
        sVar.getClass();
        IntentFilter intentFilter = new IntentFilter("com.tencent.mm.Intent.ACTION_NET_STATS");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        context.registerReceiver(new TrafficClickFlowReceiver(), intentFilter);
        for (C16844r rVar : ((ConcurrentHashMap) C16846x.m16494b().f45512a).values()) {
            synchronized (rVar) {
                if (!rVar.f45498i) {
                    rVar.f45498i = true;
                    C19401a aVar = new C19401a(rVar);
                    try {
                        rVar.f45497h = ((C119157j) C119157j.f356862d).mo183872c(aVar, 0, rVar.f45488b);
                    } catch (IllegalArgumentException e) {
                        Log.m105921e("MicroMsg.TrafficInspector", "timer.schedule got an IllegalArgumentException, %s", e.getMessage());
                    }
                }
            }
        }
        context.registerReceiver(new C79919t(sVar), new IntentFilter("com.tencent.mm.Intent.ACTION_START_TRAFFIC_COLLECTOR"));
        C104238k kVar = C104238k.f308536a;
        C110234e eVar = (C110234e) C86312j.m106911c(C110234e.class);
        if (eVar != null && (pY = eVar.mo161399pY()) != null) {
            pY.mo149101T(0, kVar);
        }
    }
}
