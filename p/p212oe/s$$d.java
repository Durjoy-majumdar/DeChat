package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p737wf.C38088a;
import p981ie.C117164j;

/* renamed from: oe.s$$d */
public final /* synthetic */ class s$$d implements C117164j {
    public final Object apply(Object obj) {
        C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
        int i = -1;
        if (C38088a.f100678a) {
            try {
                Class<?> cls = Class.forName("com.oplus.util.OplusHoraeThermalHelper");
                i = ((Integer) cls.getDeclaredMethod("getThermalStatus", new Class[0]).invoke(cls.getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]), new Object[0])).intValue();
            } catch (Throwable th) {
                Log.m105928w("", "getThermalStatus failed: " + th.getMessage());
            }
        }
        Log.m105924i("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + ", val = " + i);
        return Integer.valueOf(i);
    }
}
