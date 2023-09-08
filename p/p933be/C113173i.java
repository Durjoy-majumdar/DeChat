package p933be;

import android.app.Application;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p1012ne.C88932a;
import p1060we.C90970b;
import p1060we.C90971c;
import p1177ce.C113310f;
import p1177ce.C113314g;
import p723vf.C118672d;
import p761yd.C91441c;
import p933be.C113159b;

/* renamed from: be.i */
public class C113173i extends C90970b {

    /* renamed from: i */
    public static String f338611i;

    /* renamed from: j */
    public static String f338612j;

    /* renamed from: h */
    public final C113314g f338613h;

    public C113173i(C113310f fVar) {
        this.f338613h = new C113314g(fVar);
        C118672d.m167353c("Matrix.battery.BatteryMonitorPlugin", "setUp battery monitor plugin with configs: " + fVar, new Object[0]);
    }

    /* renamed from: a */
    public void mo112097a(boolean z) {
        C113314g.C113317c cVar;
        C113314g gVar = this.f338613h;
        if (!C91441c.m114729c()) {
            gVar.getClass();
            C118672d.m167352b("Matrix.battery.BatteryMonitorCore", "Matrix was not installed yet, just ignore the event", new Object[0]);
            return;
        }
        gVar.f339064n = z;
        if (C113159b.m154843i()) {
            C113159b h = C113159b.m154842h();
            h.f338587e = z;
            if (z) {
                C113159b.f338582j = 0;
                h.f338585c.removeCallbacks(h.f338586d);
            } else {
                C113159b.f338582j = SystemClock.uptimeMillis();
                Handler handler = h.f338585c;
                C113159b.C113162b bVar = h.f338586d;
                long j = 0 + 300000;
                bVar.f338595d = j;
                handler.postDelayed(bVar, j);
            }
        }
        if (!z) {
            gVar.f339058e.removeCallbacksAndMessages((Object) null);
            Message obtain = Message.obtain(gVar.f339058e);
            obtain.what = 1;
            gVar.f339058e.sendMessageDelayed(obtain, gVar.f339067q);
            if (gVar.f339066p) {
                C113314g.C113316b bVar2 = gVar.f339061h;
                if (bVar2 != null) {
                    gVar.f339058e.removeCallbacks(bVar2);
                    gVar.f339061h = null;
                }
                C113314g.C113316b bVar3 = new C113314g.C113316b((C113314g.C113315a) null);
                gVar.f339061h = bVar3;
                gVar.f339058e.postDelayed(bVar3, gVar.f339069s);
            }
        } else if (!gVar.f339058e.hasMessages(1)) {
            C113314g.C113316b bVar4 = gVar.f339061h;
            if (bVar4 != null) {
                gVar.f339058e.removeCallbacks(bVar4);
                gVar.f339061h = null;
            }
            Message obtain2 = Message.obtain(gVar.f339058e);
            obtain2.what = 2;
            gVar.f339058e.sendMessageAtFrontOfQueue(obtain2);
            if (gVar.f339065o && (cVar = gVar.f339060g) != null) {
                gVar.f339058e.removeCallbacks(cVar);
                C113314g.C113317c cVar2 = gVar.f339060g;
                cVar2.f339072d = 1;
                gVar.f339058e.post(cVar2);
            }
        }
        Iterator it = ((ArrayList) gVar.f339057d.f339053x).iterator();
        while (it.hasNext()) {
            ((C114490k0) it.next()).mo173597a(z);
        }
    }

    /* renamed from: b */
    public String mo112098b() {
        return "BatteryMonitorPlugin";
    }

    /* renamed from: c */
    public void mo112099c(Application application, C90971c cVar) {
        super.mo112099c(application, cVar);
        if (!this.f338613h.f339057d.f339043n) {
            ProcessUILifecycleOwner.f235399x.getClass();
            HashSet<C88932a> hashSet = ProcessUILifecycleOwner.f235395t;
            synchronized (hashSet) {
                hashSet.remove(this);
            }
        }
    }

    /* renamed from: d */
    public void mo112100d() {
        super.mo112100d();
        C113314g gVar = this.f338613h;
        gVar.getClass();
        synchronized (C113314g.class) {
            if (!gVar.f339063j) {
                Iterator it = ((ArrayList) gVar.f339057d.f339053x).iterator();
                while (it.hasNext()) {
                    ((C114490k0) it.next()).mo111817b();
                }
                gVar.f339063j = true;
            }
            if (C113159b.m154843i()) {
                C113159b h = C113159b.m154842h();
                h.f338590h = gVar;
                h.mo165672k();
            }
        }
    }
}
