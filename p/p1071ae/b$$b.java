package p1071ae;

import com.tencent.matrix.battery.accumulate.AccPowerStats;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import p1177ce.C113287a;
import p1195ge.C116947b;
import p212oe.C117776s;
import p981ie.C117173p;
import p981ie.C87705i;

/* renamed from: ae.b$$b */
public final /* synthetic */ class b$$b implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ AccPowerStats f337713a;

    /* renamed from: b */
    public final /* synthetic */ C117776s f337714b;

    /* renamed from: c */
    public final /* synthetic */ C113287a f337715c;

    public /* synthetic */ b$$b(AccPowerStats accPowerStats, C117776s sVar, C113287a aVar) {
        this.f337713a = accPowerStats;
        this.f337714b = sVar;
        this.f337715c = aVar;
    }

    public final void accept(Object obj) {
        AccPowerStats accPowerStats = this.f337713a;
        C117776s sVar = this.f337714b;
        C113287a aVar = this.f337715c;
        accPowerStats.getClass();
        C117173p pVar = ((CpuStatFeature) obj).f343048k;
        if (pVar != null && pVar.mo181094l()) {
            sVar.mo173668l(C116947b.C116948a.class, new b$$c(accPowerStats, aVar, sVar, pVar));
        }
    }
}
