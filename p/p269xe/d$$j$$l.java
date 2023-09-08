package p269xe;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C80373t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import p1177ce.C113287a;
import p212oe.C117750b;
import p269xe.C91179e;
import p981ie.C87705i;

/* renamed from: xe.d$$j$$l */
public final /* synthetic */ class d$$j$$l implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355634a;

    public /* synthetic */ d$$j$$l(C114490k0.C114491a.C114492a aVar) {
        this.f355634a = aVar;
    }

    public final void accept(Object obj) {
        C114490k0.C114491a.C114492a aVar = this.f355634a;
        C113287a aVar2 = (C113287a) obj;
        if (aVar.f343208d >= C117750b.m166046d() && aVar.mo173690b()) {
            Log.m105924i("Matrix.battery.listener", "#onReportWifi");
            int intValue = ((Integer) ((C80373t0.C80376b) aVar.f343207c).f235264d.f343211a).intValue();
            int intValue2 = ((Integer) ((C80373t0.C80376b) aVar.f343207c).f235265e.f343211a).intValue();
            String str = ((C80373t0.C80376b) aVar.f343207c).f235266f;
            long j = aVar.f343208d;
            List<String> list = C91179e.C91181b.C91182a.f261437a;
            if (intValue > 0 || intValue2 > 0) {
                long max = Math.max(1, j / 60000);
                int c = aVar2.mo165839c();
                int d = aVar2.mo165840d();
                long j2 = ((long) intValue) / max;
                long j3 = ((long) intValue2) / max;
                if (j2 > 10 || j3 > 10) {
                    String f = C118872b.m167609f();
                    String str2 = aVar2.f338971i;
                    String c2 = C91178c.m114430c(str);
                    if (!TextUtils.isEmpty(aVar2.f338973k) && ("background".equals(aVar2.f338971i) || "bg".equals(aVar2.f338971i))) {
                        str2 = "bg-" + aVar2.f338973k;
                    }
                    String str3 = str2;
                    Log.m105924i("Matrix.battery.BatteryReporter", "#reportWifiException");
                    SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
                    C91179e.C91181b.m114437a(1, 5, f, "", c, d, "avgWifiErr", j2, "queryCount", j3, "duringMin", max, str3, str, (long) aVar2.f338964b, (long) aVar2.f338967e, (long) aVar2.f338972j, c2);
                }
            }
        }
    }
}
