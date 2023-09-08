package p212oe;

import android.os.Looper;
import android.os.Process;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114442b;
import com.tencent.matrix.batterycanary.monitor.feature.C114462g0;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.concurrent.Callable;
import p723vf.C118672d;
import p981ie.C117159b;
import p981ie.C117178r;
import p981ie.C87705i;

/* renamed from: oe.j$$b */
public final /* synthetic */ class j$$b implements C87705i {
    public final void accept(Object obj) {
        C114462g0 g0Var = (C114462g0) obj;
        g0Var.getClass();
        if (Looper.myLooper() == Looper.getMainLooper() || Looper.myLooper() == g0Var.f349668a.f339059f.getLooper()) {
            throw new IllegalStateException("'#configureMonitorConsuming' should work within worker thread except matrix thread!");
        }
        C114462g0.C114465c cVar = null;
        if (g0Var.f343149b > 0) {
            C118672d.m167353c("Matrix.battery.InternalMonitorFeature", "#configureMonitorConsuming, tid = " + g0Var.f343149b, new Object[0]);
            int i = g0Var.f343149b;
            C114462g0.C114465c cVar2 = new C114462g0.C114465c();
            cVar2.f343107d = i;
            cVar2.f343111h = C117159b.m165201b(g0Var.f349668a.mo165879a(), g0Var.f349668a.f339064n);
            cVar2.f343112i = C117159b.m165213n(g0Var.f349668a.mo165879a());
            try {
                Callable<String> callable = g0Var.f349668a.f339057d.f339032c;
                cVar2.f343113j = callable == null ? "" : callable.call();
            } catch (Exception unused) {
                cVar2.f343113j = "";
            }
            C117178r.C117182d c = C117178r.m165260c(Process.myPid(), i);
            if (c != null) {
                cVar2.f343110g = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(c.mo181109a()));
                cVar2.f343108e = c.f351050a;
                cVar = cVar2;
            }
            if (cVar != null) {
                C114436a.C114440d dVar = g0Var.f343150c;
                if (dVar != null) {
                    g0Var.f349668a.f339057d.f339031b.mo165851f(new C114442b(cVar, dVar, cVar));
                }
                g0Var.f343150c = cVar;
            }
        }
    }
}
