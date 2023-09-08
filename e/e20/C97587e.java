package e20;

import com.tencent.p014mm.sdk.platformtools.Log;
import lu3.C88654b;

/* renamed from: e20.e */
public class C97587e extends C88654b {

    /* renamed from: e */
    public final /* synthetic */ C97588f f286311e;

    public C97587e(C97588f fVar) {
        this.f286311e = fVar;
    }

    public String getKey() {
        return "Handle_Monitor_mem_cpu";
    }

    public void run() {
        synchronized (this.f286311e.f286318h) {
            C97588f fVar = this.f286311e;
            if (fVar.f286316f) {
                for (C97586b a : fVar.f286315e.values()) {
                    a.mo120827a();
                }
            } else {
                Log.m105928w("MicroMsg.PerformanceMonitor", "hy: already stopped");
                mo97819a();
            }
        }
    }
}
