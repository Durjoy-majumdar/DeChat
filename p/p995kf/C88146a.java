package p995kf;

import android.app.Application;
import android.os.Build;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.tracer.TouchEventLagTracer;
import p1002lf.C88491b;
import p1013nf.C88938b;
import p1029rf.C89938b;
import p1029rf.C89940c;
import p1029rf.C89949d;
import p1029rf.C89953e;
import p1029rf.C89957f;
import p1060we.C90970b;
import p1060we.C90971c;
import p723vf.C118672d;
import p723vf.C90778c;

/* renamed from: kf.a */
public class C88146a extends C90970b {

    /* renamed from: h */
    public final C88491b f254915h;

    /* renamed from: i */
    public C89938b f254916i;

    /* renamed from: j */
    public C89957f f254917j;

    /* renamed from: n */
    public C89940c f254918n;

    /* renamed from: o */
    public C89953e f254919o;

    /* renamed from: p */
    public C89949d f254920p;

    /* renamed from: q */
    public TouchEventLagTracer f254921q;

    /* renamed from: r */
    public final int f254922r = Build.VERSION.SDK_INT;

    /* renamed from: kf.a$a */
    public class C88147a implements Runnable {
        public C88147a() {
        }

        public void run() {
            C88146a aVar = C88146a.this;
            boolean z = false;
            if (aVar.f254922r < 24) {
                C88491b bVar = aVar.f254915h;
                if (bVar.f255598c || bVar.f255600e || bVar.f255597b) {
                    C88938b bVar2 = C88938b.f256497y;
                    if (!bVar2.f256515x) {
                        try {
                            bVar2.mo123324e(bVar);
                        } catch (RuntimeException e) {
                            C118672d.m167352b("Matrix.TracePlugin", "[start] RuntimeException:%s", e);
                            return;
                        }
                    }
                }
            }
            C88491b bVar3 = C88146a.this.f254915h;
            if (bVar3.f255598c || bVar3.f255599d) {
                z = true;
            }
            if (z) {
                AppMethodBeat.getInstance().onStart();
            } else {
                AppMethodBeat.getInstance().forceStop();
            }
            C88938b.f256497y.mo123325f();
            C88146a aVar2 = C88146a.this;
            if (aVar2.f254915h.f255600e) {
                aVar2.f254919o.mo124297i();
            }
            C88146a aVar3 = C88146a.this;
            C88491b bVar4 = aVar3.f254915h;
            if (bVar4.f255601f) {
                aVar3.f254920p = new C89949d(bVar4);
                C88146a.this.f254920p.mo124297i();
            }
            C88146a aVar4 = C88146a.this;
            if (aVar4.f254915h.f255602g) {
                aVar4.f254921q = new TouchEventLagTracer(C88146a.this.f254915h);
                C88146a.this.f254921q.mo124297i();
            }
            C88146a.this.f254915h.getClass();
            C88146a aVar5 = C88146a.this;
            if (aVar5.f254915h.f255597b) {
                aVar5.f254918n.mo124297i();
            }
            C88146a aVar6 = C88146a.this;
            if (aVar6.f254915h.f255598c) {
                aVar6.f254916i.mo124297i();
            }
            C88146a aVar7 = C88146a.this;
            if (aVar7.f254915h.f255599d) {
                aVar7.f254917j.mo124297i();
            }
        }
    }

    public C88146a(C88491b bVar) {
        this.f254915h = bVar;
    }

    /* renamed from: a */
    public void mo112097a(boolean z) {
        if (this.f261038f) {
            C89940c cVar = this.f254918n;
            if (cVar != null) {
                cVar.getClass();
            }
            C89953e eVar = this.f254919o;
            if (eVar != null) {
                eVar.getClass();
            }
            C89938b bVar = this.f254916i;
            if (bVar != null) {
                bVar.getClass();
            }
            C89957f fVar = this.f254917j;
            if (fVar != null) {
                fVar.mo112097a(z);
            }
        }
    }

    /* renamed from: b */
    public String mo112098b() {
        return "Trace";
    }

    /* renamed from: c */
    public void mo112099c(Application application, C90971c cVar) {
        super.mo112099c(application, cVar);
        C118672d.m167353c("Matrix.TracePlugin", "trace plugin init, trace config: %s", this.f254915h.toString());
        if (this.f254922r < 16) {
            C118672d.m167352b("Matrix.TracePlugin", "[FrameBeat] API is low Build.VERSION_CODES.JELLY_BEAN(16), TracePlugin is not supported", new Object[0]);
            this.f261038f = false;
            return;
        }
        this.f254919o = new C89953e(this.f254915h);
        this.f254918n = new C89940c(this.f254915h);
        this.f254916i = new C89938b(this.f254915h);
        this.f254917j = new C89957f(this.f254915h);
    }

    /* renamed from: d */
    public void mo112100d() {
        super.mo112100d();
        if (!this.f261038f) {
            C118672d.m167356f("Matrix.TracePlugin", "[start] Plugin is unSupported!", new Object[0]);
            return;
        }
        C118672d.m167356f("Matrix.TracePlugin", "start!", new Object[0]);
        C88147a aVar = new C88147a();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            aVar.run();
            return;
        }
        C118672d.m167356f("Matrix.TracePlugin", "start TracePlugin in Thread[%s] but not in mainThread!", Long.valueOf(Thread.currentThread().getId()));
        C90778c.f260687c.post(aVar);
    }
}
