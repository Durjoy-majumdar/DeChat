package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1177ce.C113287a;
import p1177ce.C113314g;
import p212oe.C117750b;
import p269xe.C91179e;
import p981ie.C87705i;

/* renamed from: xe.d$$j$$n */
public final /* synthetic */ class d$$j$$n implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355636a;

    /* renamed from: b */
    public final /* synthetic */ C114467i f355637b;

    public /* synthetic */ d$$j$$n(C114490k0.C114491a.C114492a aVar, C114467i iVar) {
        this.f355636a = aVar;
        this.f355637b = iVar;
    }

    public final void accept(Object obj) {
        C113314g gVar;
        C114490k0.C114491a.C114492a aVar = this.f355636a;
        C114467i iVar = this.f355637b;
        C113287a aVar2 = (C113287a) obj;
        if (aVar.f343208d >= C117750b.m166046d() && aVar.mo173690b()) {
            Log.m105924i("Matrix.battery.listener", "#onReportInternalJiffies");
            if (((Long) ((C114436a.C114440d) aVar.f343207c).f343110g.f343211a).longValue() / Math.max(1, aVar.f343208d / 60000) > 20000 && (gVar = iVar.f343162k) != null) {
                gVar.f339059f.post(new d$$j$$e(aVar2, aVar));
            }
            C91179e.C91181b.C91182a.m114440a(aVar2, aVar, "");
        }
    }
}
