package p212oe;

import android.provider.Settings;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1177ce.C113314g;
import p981ie.C117164j;

/* renamed from: oe.s$$a */
public final /* synthetic */ class s$$a implements C117164j {

    /* renamed from: a */
    public final /* synthetic */ C117776s f352276a;

    public /* synthetic */ s$$a(C117776s sVar) {
        this.f352276a = sVar;
    }

    public final Object apply(Object obj) {
        C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
        C113314g gVar = this.f352276a.f343162k;
        if (gVar == null) {
            return Integer.MIN_VALUE;
        }
        int i = Settings.System.getInt(gVar.mo165879a().getContentResolver(), "screen_brightness", Integer.MIN_VALUE);
        b$$h b__h = new b$$h();
        C114490k0.C114491a.C114494b.C114497b<Integer> b = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(i));
        b__h.f352153d = b;
        int intValue = ((Integer) b.f343211a).intValue();
        Log.m105924i("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + ", val = " + intValue);
        return Integer.valueOf(intValue);
    }
}
