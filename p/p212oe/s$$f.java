package p212oe;

import android.os.BatteryManager;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p981ie.C117164j;

/* renamed from: oe.s$$f */
public final /* synthetic */ class s$$f implements C117164j {

    /* renamed from: a */
    public final /* synthetic */ C117776s f352279a;

    public /* synthetic */ s$$f(C117776s sVar) {
        this.f352279a = sVar;
    }

    public final Object apply(Object obj) {
        long j;
        C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
        try {
            j = ((BatteryManager) this.f352279a.f343162k.mo165879a().getSystemService("batterymanager")).getLongProperty(3);
        } catch (Exception unused) {
            j = -1;
        }
        b$$e b__e = new b$$e();
        C114490k0.C114491a.C114494b.C114497b<Long> b = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(j));
        b__e.f352148d = b;
        long longValue = ((Long) b.f343211a).longValue();
        Log.m105924i("MicroMsg.battery.MMCompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + ", val = " + longValue);
        return Long.valueOf(longValue);
    }
}
