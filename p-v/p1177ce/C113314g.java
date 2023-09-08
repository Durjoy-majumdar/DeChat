package p1177ce;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import p1177ce.C113291d;
import p1190de.C116609b;
import p723vf.C118672d;
import p723vf.C90778c;
import p761yd.C91441c;

/* renamed from: ce.g */
public class C113314g implements C114519q0.C114522b, JiffiesMonitorFeature.JiffiesListener, C114451e.C114457g, C116609b.C116613d, Handler.Callback {

    /* renamed from: d */
    public final C113310f f339057d;

    /* renamed from: e */
    public final Handler f339058e;

    /* renamed from: f */
    public final Handler f339059f;

    /* renamed from: g */
    public C113317c f339060g;

    /* renamed from: h */
    public C113316b f339061h;

    /* renamed from: i */
    public Callable<String> f339062i = new C113315a(this);

    /* renamed from: j */
    public volatile boolean f339063j = false;

    /* renamed from: n */
    public boolean f339064n;

    /* renamed from: o */
    public boolean f339065o;

    /* renamed from: p */
    public boolean f339066p;

    /* renamed from: q */
    public final long f339067q;

    /* renamed from: r */
    public final long f339068r;

    /* renamed from: s */
    public final long f339069s;

    /* renamed from: ce.g$a */
    public class C113315a implements Callable<String> {
        public C113315a(C113314g gVar) {
        }

        public /* bridge */ /* synthetic */ Object call() {
            return "unknown";
        }
    }

    /* renamed from: ce.g$b */
    public class C113316b implements Runnable {

        /* renamed from: d */
        public int f339070d = 0;

        public C113316b(C113315a aVar) {
        }

        public void run() {
            this.f339070d++;
            C118672d.m167353c("Matrix.battery.BatteryMonitorCore", "#onBackgroundLoopCheck, round = " + this.f339070d, new Object[0]);
            if (!C113314g.this.f339064n) {
                synchronized (C113314g.class) {
                    Iterator it = ((ArrayList) C113314g.this.f339057d.f339053x).iterator();
                    while (it.hasNext()) {
                        ((C114490k0) it.next()).mo173651c(C113314g.this.f339069s * ((long) this.f339070d));
                    }
                }
            }
            C113314g gVar = C113314g.this;
            if (!gVar.f339064n) {
                gVar.f339058e.postDelayed(this, gVar.f339069s);
            }
        }
    }

    /* renamed from: ce.g$c */
    public class C113317c implements Runnable {

        /* renamed from: d */
        public int f339072d = 1;

        public C113317c(C113315a aVar) {
        }

        public void run() {
            C113314g gVar = C113314g.this;
            if (gVar.f339065o) {
                Message obtain = Message.obtain(gVar.f339058e);
                obtain.what = this.f339072d;
                obtain.arg1 = 3;
                C113314g.this.f339058e.sendMessageAtFrontOfQueue(obtain);
                int i = 2;
                if (this.f339072d == 2) {
                    i = 1;
                }
                this.f339072d = i;
                C113314g gVar2 = C113314g.this;
                gVar2.f339058e.postDelayed(this, gVar2.f339068r);
            }
        }
    }

    /* renamed from: ce.g$d */
    public interface C113318d {
        /* renamed from: a */
        void mo165846a();

        /* renamed from: e */
        void mo165850e(boolean z);
    }

    public C113314g(C113310f fVar) {
        ProcessUILifecycleOwner.f235399x.getClass();
        this.f339064n = ProcessUILifecycleOwner.f235396u;
        this.f339057d = fVar;
        C113291d dVar = fVar.f339031b;
        if (dVar instanceof C113291d.C113292a) {
            ((C113291d.C113292a) dVar).mo165854i(this);
        }
        Callable<String> callable = fVar.f339032c;
        if (callable != null) {
            this.f339062i = callable;
        }
        HandlerThread handlerThread = fVar.f339030a;
        if (handlerThread != null) {
            this.f339058e = new Handler(handlerThread.getLooper(), this);
            this.f339059f = new Handler(handlerThread.getLooper(), this);
        } else {
            Handler handler = new Handler(C90778c.m113844b().getLooper(), this);
            this.f339058e = handler;
            this.f339059f = handler;
        }
        boolean z = fVar.f339041l;
        this.f339065o = z;
        if (z) {
            this.f339060g = new C113317c((C113315a) null);
        }
        this.f339066p = fVar.f339042m;
        this.f339067q = fVar.f339034e;
        this.f339068r = fVar.f339035f;
        this.f339069s = fVar.f339036g;
        Iterator it = ((ArrayList) fVar.f339053x).iterator();
        while (it.hasNext()) {
            ((C114490k0) it.next()).mo173631e(this);
        }
    }

    /* renamed from: a */
    public Context mo165879a() {
        return C91441c.m114730d().f262168b;
    }

    /* renamed from: b */
    public void mo165847b(C114519q0.C114524d.C114526b bVar, long j) {
        this.f339057d.f339031b.mo165847b(bVar, j);
    }

    /* renamed from: d */
    public void mo165849d(int i, C114519q0.C114524d.C114526b bVar) {
        this.f339057d.f339031b.mo165849d(i, bVar);
    }

    /* renamed from: e */
    public <T extends C114490k0> T mo165880e(Class<T> cls) {
        Iterator it = ((ArrayList) this.f339057d.f339053x).iterator();
        while (it.hasNext()) {
            T t = (C114490k0) it.next();
            if (cls.isAssignableFrom(t.getClass())) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: g */
    public void mo165852g(boolean z, int i, int i2, ComponentName componentName, long j) {
        this.f339057d.f339031b.mo165852g(z, i, i2, componentName, j);
    }

    /* renamed from: h */
    public void mo165853h(C116609b.C116612c cVar) {
        this.f339057d.f339031b.mo165853h(cVar);
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C118672d.m167351a("Matrix.battery.BatteryMonitorCore", "#onTraceBegin", new Object[0]);
            this.f339057d.f339031b.mo165846a();
            return true;
        } else if (i != 2) {
            return false;
        } else {
            boolean z = message.arg1 == 3;
            C118672d.m167351a("Matrix.battery.BatteryMonitorCore", "#onTraceEnd", new Object[0]);
            this.f339057d.f339031b.mo165850e(z);
            return true;
        }
    }
}
