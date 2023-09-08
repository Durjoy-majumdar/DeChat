package p269xe;

import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import kj2.C117407d;
import p1177ce.C113287a;
import p212oe.C117750b;
import p212oe.b$$f;
import p212oe.b$$g;
import p269xe.C91179e;
import p981ie.C87705i;

/* renamed from: xe.d$$j$$f */
public final /* synthetic */ class d$$j$$f implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355625a;

    public /* synthetic */ d$$j$$f(C114490k0.C114491a.C114492a aVar) {
        this.f355625a = aVar;
    }

    public final void accept(Object obj) {
        C114490k0.C114491a.C114492a aVar = this.f355625a;
        C113287a aVar2 = (C113287a) obj;
        C117407d.INSTANCE.idkeyStat(1013, 200, (long) ((Integer) ((b$$g) aVar.f343207c).f352151e.f343211a).intValue(), false);
        if (aVar.f343208d >= C117750b.m166046d() && b$$f.m166058c() && ((Integer) ((b$$g) aVar.f343207c).f352151e.f343211a).intValue() > 0) {
            long max = Math.max(1, aVar.f343208d / 60000);
            String f = C118872b.m167609f();
            int intValue = ((Integer) ((b$$g) aVar.f343207c).f352151e.f343211a).intValue();
            Log.m105924i("Matrix.battery.BatteryReporter", "#statAlarm, count = " + intValue);
            SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
            long j = (long) intValue;
            long j2 = j / max;
            C91179e.C91181b.m114437a(0, 5, f, "", aVar2.mo165839c(), aVar2.mo165840d(), "avgAlarmOld", j2, "ttlAlarm", j, "duringMin", max, aVar2.f338971i, "", (long) aVar2.f338964b, (long) aVar2.f338967e, (long) aVar2.f338972j, "");
        }
    }
}
