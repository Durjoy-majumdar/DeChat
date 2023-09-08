package p212oe;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.List;
import p1177ce.C113287a;
import p269xe.C118872b;
import p269xe.C91179e;
import p981ie.C117159b;

/* renamed from: oe.v$$f */
public final /* synthetic */ class v$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C89205v f352293d;

    /* renamed from: e */
    public final /* synthetic */ int f352294e;

    public /* synthetic */ v$$f(C89205v vVar, int i) {
        this.f352293d = vVar;
        this.f352294e = i;
    }

    public final void run() {
        C89205v vVar = this.f352293d;
        int i = this.f352294e;
        vVar.getClass();
        Log.m105924i("Matrix.battery.ModuleJiffiesMonitor", "ThermalStatus = " + i);
        if (b$$f.m166058c()) {
            List<String> list = C91179e.C91181b.C91182a.f261437a;
            C113287a a = C113287a.m155093a();
            String f = C118872b.m167609f();
            String a2 = C91179e.m114432a();
            int i2 = C91179e.C91181b.C91182a.f261438b;
            C91179e.C91181b.C91182a.f261438b = i;
            int d = C117159b.m165203d(MMApplicationContext.getContext());
            Log.m105924i("Matrix.battery.BatteryReporter", "#reportThermalStatus");
            SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
            C91179e.C91181b.m114437a(1, 5, f, "", a.mo165839c(), a.mo165840d(), "thermalStatusException", (long) i, "", (long) i2, "", (long) d, a2, "", 0, 0, 0, "");
        }
    }
}
