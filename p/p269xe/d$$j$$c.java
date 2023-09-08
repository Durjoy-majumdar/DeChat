package p269xe;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1177ce.C113287a;
import p212oe.C117750b;
import p212oe.b$$f;
import p269xe.C91179e;
import p981ie.C87705i;

/* renamed from: xe.d$$j$$c */
public final /* synthetic */ class d$$j$$c implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355619a;

    public /* synthetic */ d$$j$$c(C114490k0.C114491a.C114492a aVar) {
        this.f355619a = aVar;
    }

    public final void accept(Object obj) {
        String str;
        C114490k0.C114491a.C114492a aVar;
        C114490k0.C114491a.C114492a aVar2 = this.f355619a;
        C113287a aVar3 = (C113287a) obj;
        if (aVar2.f343208d < C117750b.m166045c() || !aVar2.mo173690b() || !b$$f.m166058c()) {
            return;
        }
        if (((Integer) ((C114519q0.C114523c) aVar2.f343207c).f343272g.f343211a).intValue() > 0 || ((Integer) ((C114519q0.C114523c) aVar2.f343207c).f343270e.f343211a).intValue() > 0) {
            int intValue = ((Integer) ((C114519q0.C114523c) aVar2.f343207c).f343272g.f343211a).intValue();
            long intValue2 = (long) ((Integer) ((C114519q0.C114523c) aVar2.f343207c).f343273h.f343211a).intValue();
            if (((Integer) ((C114519q0.C114523c) aVar2.f343207c).f343270e.f343211a).intValue() > 0) {
                intValue = ((Integer) ((C114519q0.C114523c) aVar2.f343207c).f343270e.f343211a).intValue();
                intValue2 = ((Long) ((C114519q0.C114523c) aVar2.f343207c).f343269d.f343211a).longValue();
                str = "lockTime";
            } else {
                str = "rlsCount";
            }
            String str2 = str;
            long max = Math.max(1, aVar2.f343208d / 60000);
            String f = C118872b.m167609f();
            StringBuilder sb = new StringBuilder();
            String str3 = "";
            long j = ((long) intValue) / max;
            if (j > 1) {
                if (!((C114519q0.C114523c) aVar2.f343207c).f343271f.f343212a.isEmpty()) {
                    int i = 0;
                    while (i < Math.min(3, ((C114519q0.C114523c) aVar2.f343207c).f343271f.f343212a.size())) {
                        C114519q0.C114524d.C114526b bVar = (C114519q0.C114524d.C114526b) ((C114490k0.C114491a.C114494b.C114495a) ((C114519q0.C114523c) aVar2.f343207c).f343271f.f343212a.get(i)).f343210a;
                        long j2 = intValue2;
                        if (bVar != null) {
                            aVar = aVar2;
                            if (!(bVar.f343284f >= bVar.f343283e)) {
                                sb.append(bVar.f343281c);
                                sb.append("-");
                                sb.append(bVar.f343280b);
                                sb.append(bVar.mo173706a());
                                sb.append("|");
                                if (!TextUtils.isEmpty(bVar.f343282d) && TextUtils.isEmpty(str3)) {
                                    str3 = bVar.f343282d;
                                }
                            }
                        } else {
                            aVar = aVar2;
                        }
                        i++;
                        aVar2 = aVar;
                        intValue2 = j2;
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("#statWakeLocks, avgCount = ");
                sb4.append(j);
                sb4.append(", avgDgt2 = ");
                long j3 = intValue2 / max;
                sb4.append(j3);
                Log.m105924i("Matrix.battery.BatteryReporter", sb4.toString());
                SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
                long j4 = j;
                String str4 = f;
                C91179e.C91181b.m114439c(false, 0, 5, str4, sb.toString(), aVar3.mo165839c(), aVar3.mo165840d(), "avgWakeLocks", j4, str2, j3, "duringMin", max, aVar3.f338971i, str3, (long) aVar3.f338964b, (long) aVar3.f338967e, (long) aVar3.f338972j, "");
            }
        }
    }
}
