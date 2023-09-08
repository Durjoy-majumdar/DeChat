package p269xe;

import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import p1177ce.C113287a;
import p212oe.C117776s;
import p269xe.C91179e;
import p329d3.C58104c;
import p981ie.C87705i;

/* renamed from: xe.e$b$a$$n */
public final /* synthetic */ class e$b$a$$n implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355682a;

    /* renamed from: b */
    public final /* synthetic */ C117776s f355683b;

    public /* synthetic */ e$b$a$$n(C114490k0.C114491a.C114492a aVar, C117776s sVar) {
        this.f355682a = aVar;
        this.f355683b = sVar;
    }

    public final void accept(Object obj) {
        C114490k0.C114491a.C114492a aVar = this.f355682a;
        C117776s sVar = this.f355683b;
        C113287a aVar2 = (C113287a) obj;
        for (ITEM item : ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343063h.f343212a) {
            String str = item.f343067c;
            if (str.startsWith("Thread-") && !C91179e.C91181b.C91182a.f261437a.contains(str)) {
                C58104c<String, String> b = C91178c.m114429b(item.f343066b);
                String f = C118872b.m167609f();
                Log.m105924i("Matrix.battery.BatteryReporter", "#reportBadThreadNames, scope = " + sVar.f343167p);
                SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
                String str2 = str;
                C91179e.C91181b.m114437a(1, 5, f, "", aVar2.mo165839c(), aVar2.mo165840d(), "reportBadThreadName", 0, str, 0, "duringMin", aVar2.mo165841e(), aVar2.f338971i, (String) b.f166179a, (long) aVar2.f338964b, (long) aVar2.f338967e, (long) aVar2.f338972j, (String) b.f166180b);
                if (C91179e.C91181b.C91182a.f261437a.isEmpty()) {
                    C91179e.C91181b.C91182a.f261437a = new LinkedList();
                }
                C91179e.C91181b.C91182a.f261437a.add(str2);
            }
        }
    }
}
