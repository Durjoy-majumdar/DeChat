package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p737wf.C38088a;
import p981ie.C117164j;

/* renamed from: oe.s$$e */
public final /* synthetic */ class s$$e implements C117164j {
    public final Object apply(Object obj) {
        C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
        float a = C38088a.m41721a();
        Log.m105924i("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + ", val = " + a);
        return Float.valueOf(a);
    }
}
