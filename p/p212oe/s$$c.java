package p212oe;

import com.tencent.mars.comm.NetworkSignalUtil;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p981ie.C117164j;

/* renamed from: oe.s$$c */
public final /* synthetic */ class s$$c implements C117164j {

    /* renamed from: a */
    public final /* synthetic */ C117776s f352278a;

    public /* synthetic */ s$$c(C117776s sVar) {
        this.f352278a = sVar;
    }

    public final Object apply(Object obj) {
        C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
        if (this.f352278a.f343162k == null) {
            return Integer.MIN_VALUE;
        }
        long wifiSignalStrength = NetworkSignalUtil.getWifiSignalStrength();
        b$$l b__l = new b$$l();
        C114490k0.C114491a.C114494b.C114497b<Long> b = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(wifiSignalStrength));
        b__l.f352157d = b;
        long longValue = ((Long) b.f343211a).longValue();
        Log.m105924i("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + ", val = " + longValue);
        return Long.valueOf(longValue);
    }
}
