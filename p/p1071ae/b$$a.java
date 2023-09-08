package p1071ae;

import com.tencent.matrix.battery.accumulate.AccPowerStats;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import p1177ce.C113287a;
import p212oe.C117776s;
import p981ie.C87705i;

/* renamed from: ae.b$$a */
public final /* synthetic */ class b$$a implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ AccPowerStats f337711a;

    /* renamed from: b */
    public final /* synthetic */ C117776s f337712b;

    public /* synthetic */ b$$a(AccPowerStats accPowerStats, C117776s sVar) {
        this.f337711a = accPowerStats;
        this.f337712b = sVar;
    }

    public final void accept(Object obj) {
        AccPowerStats accPowerStats = this.f337711a;
        C117776s sVar = this.f337712b;
        C113287a aVar = (C113287a) obj;
        accPowerStats.getClass();
        if (aVar.f338975m) {
            sVar.mo173671o(CpuStatFeature.class, new b$$b(accPowerStats, sVar, aVar));
        }
    }
}
