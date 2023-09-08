package p269xe;

import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1177ce.C113287a;
import p212oe.C117750b;
import p212oe.C117776s;
import p212oe.b$$f;
import p269xe.C91179e;
import p981ie.C87705i;

/* renamed from: xe.d$$j$$j */
public final /* synthetic */ class d$$j$$j implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ d$$j f355630a;

    /* renamed from: b */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355631b;

    /* renamed from: c */
    public final /* synthetic */ C114467i f355632c;

    public /* synthetic */ d$$j$$j(d$$j d__j, C114490k0.C114491a.C114492a aVar, C114467i iVar) {
        this.f355630a = d__j;
        this.f355631b = aVar;
        this.f355632c = iVar;
    }

    public final void accept(Object obj) {
        d$$j d__j = this.f355630a;
        C114490k0.C114491a.C114492a aVar = this.f355631b;
        C114467i iVar = this.f355632c;
        C113287a aVar2 = (C113287a) obj;
        d__j.getClass();
        if (aVar.f343208d >= C117750b.m166045c() && aVar.mo173690b()) {
            Log.m105924i("Matrix.battery.listener", "#onReportTemperature");
            long max = Math.max(1, aVar.f343208d / 60000);
            int intValue = ((Integer) ((C114536x.C114541e) aVar.f343207c).f343310d.f343211a).intValue();
            int intValue2 = ((Integer) ((C114536x.C114541e) aVar.f343206b).f343310d.f343211a).intValue();
            ((C117776s) iVar).mo182526y();
            if (b$$f.m166058c() && intValue > 0) {
                String f = C118872b.m167609f();
                Log.m105924i("Matrix.battery.BatteryReporter", "#statTemperature, curr = " + intValue2);
                SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
                C91179e.C91181b.m114437a(0, 5, f, "", aVar2.mo165839c(), aVar2.mo165840d(), "diffBatTemp", (long) intValue, "currBatTemp", (long) intValue2, "duringMin", max, aVar2.f338971i, "", (long) aVar2.f338964b, (long) aVar2.f338967e, (long) aVar2.f338972j, "");
            }
        }
    }
}
