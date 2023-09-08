package p1177ce;

import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import p1177ce.C113291d;
import p723vf.C118672d;
import p981ie.C87705i;

/* renamed from: ce.b */
public class C113289b implements C87705i<JiffiesMonitorFeature> {

    /* renamed from: a */
    public final /* synthetic */ JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry f338979a;

    /* renamed from: b */
    public final /* synthetic */ long f338980b;

    /* renamed from: c */
    public final /* synthetic */ C113287a f338981c;

    /* renamed from: d */
    public final /* synthetic */ C113290c f338982d;

    public C113289b(C113290c cVar, JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry, long j, C113287a aVar) {
        this.f338982d = cVar;
        this.f338979a = threadJiffiesEntry;
        this.f338980b = j;
        this.f338981c = aVar;
    }

    public void accept(Object obj) {
        JiffiesMonitorFeature jiffiesMonitorFeature = (JiffiesMonitorFeature) obj;
        long longValue = ((Long) this.f338979a.f343211a).longValue() / this.f338980b;
        if (this.f338981c.mo165844h()) {
            if (this.f338980b > 10 && longValue > ((long) C113291d.C113292a.this.f338985d.f339057d.f339039j)) {
                C118672d.m167353c("Matrix.battery.BatteryPrinter", "threadWatchDog fg set, name = " + ((JiffiesMonitorFeature.JiffiesSnapshot) this.f338982d.f338983a.f343207c).f343061f + ", pid = " + ((JiffiesMonitorFeature.JiffiesSnapshot) this.f338982d.f338983a.f343207c).f343059d + ", tid = " + this.f338979a.f343066b, new Object[0]);
                jiffiesMonitorFeature.mo173611j(true, ((JiffiesMonitorFeature.JiffiesSnapshot) this.f338982d.f338983a.f343207c).f343059d, this.f338979a.f343066b);
            }
        } else if (this.f338980b > 10 && longValue > ((long) C113291d.C113292a.this.f338985d.f339057d.f339040k)) {
            C118672d.m167353c("Matrix.battery.BatteryPrinter", "threadWatchDog bg set, name = " + ((JiffiesMonitorFeature.JiffiesSnapshot) this.f338982d.f338983a.f343207c).f343061f + ", pid = " + ((JiffiesMonitorFeature.JiffiesSnapshot) this.f338982d.f338983a.f343207c).f343059d + ", tid = " + this.f338979a.f343066b, new Object[0]);
            jiffiesMonitorFeature.mo173611j(false, ((JiffiesMonitorFeature.JiffiesSnapshot) this.f338982d.f338983a.f343207c).f343059d, this.f338979a.f343066b);
        }
    }
}
