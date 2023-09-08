package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1177ce.C113287a;
import p212oe.C117750b;
import p269xe.C91179e;
import p981ie.C87705i;

/* renamed from: xe.d$$j$$a */
public final /* synthetic */ class d$$j$$a implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355618a;

    public /* synthetic */ d$$j$$a(C114490k0.C114491a.C114492a aVar) {
        this.f355618a = aVar;
    }

    public final void accept(Object obj) {
        C114490k0.C114491a.C114492a aVar = this.f355618a;
        C113287a aVar2 = (C113287a) obj;
        Log.m105924i("Matrix.battery.listener", "#onReportTraffics");
        if (aVar2.f338975m && aVar.f343208d >= C117750b.m166046d()) {
            long max = Math.max(1, aVar.f343208d / 60000);
            long longValue = (((Long) ((C114513o0.C114515b) aVar.f343207c).f343246d.f343211a).longValue() / max) + (((Long) ((C114513o0.C114515b) aVar.f343207c).f343247e.f343211a).longValue() / max);
            long longValue2 = (((Long) ((C114513o0.C114515b) aVar.f343207c).f343250h.f343211a).longValue() / max) + (((Long) ((C114513o0.C114515b) aVar.f343207c).f343251i.f343211a).longValue() / max);
            if (longValue >= Math.max(C117750b.f352132k, 1048576)) {
                C91179e.C91181b.C91182a.m114443d(aVar2, true, longValue, longValue2);
            }
            if (longValue2 >= Math.max(C117750b.f352132k, 1048576)) {
                C91179e.C91181b.C91182a.m114443d(aVar2, false, longValue, longValue2);
            }
        }
    }
}
