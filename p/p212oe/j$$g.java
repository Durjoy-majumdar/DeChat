package p212oe;

import android.util.Pair;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114486j0;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import p1071ae.C112785a;
import p269xe.C91177a;
import p761yd.C91441c;
import p933be.C113173i;

/* renamed from: oe.j$$g */
public class j$$g extends C80401d {

    /* renamed from: b */
    public final byte[] f352183b = new byte[0];

    /* renamed from: c */
    public boolean f352184c = false;

    /* renamed from: d */
    public C117770m f352185d;

    /* renamed from: e */
    public C117770m f352186e;

    /* renamed from: f */
    public C117770m f352187f;

    /* renamed from: g */
    public C117770m f352188g;

    /* renamed from: h */
    public C117770m f352189h;

    /* renamed from: i */
    public final Runnable f352190i = new C117763a();

    /* renamed from: j */
    public final Runnable f352191j = new C117764b();

    /* renamed from: k */
    public final Runnable f352192k = new C117765c();

    /* renamed from: l */
    public final Runnable f352193l = new C117766d();

    /* renamed from: m */
    public final Runnable f352194m = new C117767e();

    /* renamed from: n */
    public final Runnable f352195n = new C117768f();

    /* renamed from: o */
    public final /* synthetic */ C113173i f352196o;

    /* renamed from: p */
    public final /* synthetic */ boolean f352197p;

    /* renamed from: oe.j$$g$a */
    public class C117763a implements Runnable {
        public C117763a() {
        }

        public void run() {
            synchronized (j$$g.this.f352183b) {
                j$$g j__g = j$$g.this;
                if (!j__g.f352184c) {
                    j__g.f352185d = new C117770m("ExplicitFg");
                    j$$g.this.f352185d.mo182519b();
                }
            }
        }
    }

    /* renamed from: oe.j$$g$b */
    public class C117764b implements Runnable {

        /* renamed from: d */
        public int f352199d = 0;

        public C117764b() {
        }

        /* renamed from: a */
        public final void mo182510a() {
            j$$g j__g = j$$g.this;
            if (!j__g.f352184c && C117750b.f352139r) {
                this.f352199d++;
                j__g.f352187f = new C117770m("ExplicitFgPoll");
                j$$g.this.f352187f.mo182519b();
                j$$g.this.f352196o.f338613h.f339059f.postDelayed(this, 600000);
            }
        }

        public void run() {
            synchronized (j$$g.this.f352183b) {
                j$$g j__g = j$$g.this;
                if (!j__g.f352184c) {
                    C117770m mVar = j__g.f352187f;
                    if (mVar == null) {
                        this.f352199d = 0;
                    } else {
                        C114467i iVar = mVar.f352209c;
                        if (iVar != null) {
                            iVar.f343160i.putInt("poll_count", this.f352199d);
                        }
                        j$$g.this.f352187f.mo182518a();
                        j$$g.this.f352187f = null;
                        C112785a.f337705f.mo164539b();
                    }
                    mo182510a();
                }
            }
        }
    }

    /* renamed from: oe.j$$g$c */
    public class C117765c implements Runnable {
        public C117765c() {
        }

        public void run() {
            synchronized (j$$g.this.f352183b) {
                j$$g j__g = j$$g.this;
                if (j__g.f352184c) {
                    j__g.f352186e = new C117770m("ExplicitBg");
                    j$$g.this.f352186e.mo182519b();
                }
            }
        }
    }

    /* renamed from: oe.j$$g$d */
    public class C117766d implements Runnable {

        /* renamed from: d */
        public int f352202d = 0;

        public C117766d() {
        }

        /* renamed from: a */
        public final void mo182513a() {
            j$$g j__g = j$$g.this;
            if (j__g.f352184c && C117750b.f352140s) {
                this.f352202d++;
                j__g.f352188g = new C117770m("ExplicitBgPoll");
                j$$g.this.f352188g.mo182519b();
                j$$g.this.f352196o.f338613h.f339059f.postDelayed(this, 1800000);
            }
        }

        public void run() {
            synchronized (j$$g.this.f352183b) {
                j$$g j__g = j$$g.this;
                if (j__g.f352184c) {
                    C117770m mVar = j__g.f352188g;
                    if (mVar == null) {
                        this.f352202d = 0;
                    } else {
                        C114467i iVar = mVar.f352209c;
                        if (iVar != null) {
                            iVar.f343160i.putInt("poll_count", this.f352202d);
                        }
                        j$$g.this.f352188g.mo182518a();
                        j$$g.this.f352188g = null;
                        C112785a.f337705f.mo164539b();
                    }
                    mo182513a();
                }
            }
        }
    }

    /* renamed from: oe.j$$g$e */
    public class C117767e implements Runnable {
        public C117767e() {
        }

        public void run() {
            Log.m105924i("Matrix.battery.LifeCycle", "excessive cpu start");
            synchronized (j$$g.this.f352183b) {
                j$$g j__g = j$$g.this;
                if (j__g.f352184c) {
                    j__g.f352189h = new C117770m("ExcessiveCpu");
                    j$$g.this.f352189h.mo182519b();
                    j$$g j__g2 = j$$g.this;
                    j__g2.f352196o.f338613h.f339059f.postDelayed(j__g2.f352195n, 900000);
                }
            }
        }
    }

    /* renamed from: oe.j$$g$f */
    public class C117768f implements Runnable {
        public C117768f() {
        }

        public void run() {
            C117770m mVar;
            Log.m105924i("Matrix.battery.LifeCycle", "excessive cpu inspect");
            synchronized (j$$g.this.f352183b) {
                j$$g j__g = j$$g.this;
                if (j__g.f352184c && (mVar = j__g.f352189h) != null) {
                    mVar.mo182518a();
                }
                j$$g.this.f352189h = null;
            }
        }
    }

    public j$$g(C113173i iVar, boolean z) {
        this.f352196o = iVar;
        this.f352197p = z;
    }

    /* renamed from: a */
    public void mo17850a() {
        this.f352184c = true;
        Log.m105924i("Matrix.battery.LifeCycle", "AppExplicitBg = true");
        Map<Integer, Pair<String, Long>> map = C91177a.f261418d;
        synchronized (map) {
            C113173i e = C117750b.m166047e();
            if (e != null) {
                e.f338613h.f339059f.removeCallbacks(C91177a.f261415a);
            }
            ((HashMap) map).clear();
        }
        if (this.f352197p) {
            synchronized (this.f352183b) {
                this.f352196o.f338613h.f339059f.removeCallbacks(this.f352191j);
                this.f352187f = null;
                this.f352196o.f338613h.f339059f.removeCallbacks(this.f352190i);
                this.f352196o.f338613h.f339059f.postDelayed(this.f352192k, 600000);
                this.f352196o.f338613h.f339059f.postDelayed(this.f352193l, 600000);
                this.f352196o.f338613h.f339059f.postDelayed(this.f352194m, 30000);
                C117770m mVar = this.f352185d;
                if (mVar != null) {
                    mVar.mo182518a();
                    this.f352185d = null;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo17851b() {
        C113173i iVar;
        C114490k0 e;
        C113173i iVar2;
        C114490k0 e2;
        C113173i iVar3;
        C114490k0 e3;
        C113173i iVar4;
        C114490k0 e4;
        Class cls = C113173i.class;
        this.f352184c = false;
        Log.m105924i("Matrix.battery.LifeCycle", "AppExplicitBg = false");
        synchronized (C91177a.f261418d) {
            C113173i e5 = C117750b.m166047e();
            if (e5 != null) {
                e5.f338613h.f339059f.postDelayed(C91177a.f261415a, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
        }
        if (this.f352197p) {
            synchronized (this.f352183b) {
                this.f352196o.f338613h.f339059f.removeCallbacks(this.f352194m);
                this.f352196o.f338613h.f339059f.removeCallbacks(this.f352195n);
                this.f352196o.f338613h.f339059f.removeCallbacks(this.f352193l);
                this.f352188g = null;
                this.f352196o.f338613h.f339059f.removeCallbacks(this.f352192k);
                this.f352196o.f338613h.f339059f.postDelayed(this.f352190i, 30000);
                this.f352196o.f338613h.f339059f.postDelayed(this.f352191j, 30000);
                C117770m mVar = this.f352186e;
                if (mVar != null) {
                    mVar.mo182518a();
                    this.f352186e = null;
                }
                Class cls2 = C117754c0.class;
                if (!(!C91441c.m114729c() || (iVar4 = (C113173i) C91441c.m114730d().mo125377a(cls)) == null || (e4 = iVar4.f338613h.mo165880e(cls2)) == null)) {
                    ((C117754c0) e4).mo173632i();
                }
                Class cls3 = C117778u.class;
                if (!(!C91441c.m114729c() || (iVar3 = (C113173i) C91441c.m114730d().mo125377a(cls)) == null || (e3 = iVar3.f338613h.mo165880e(cls3)) == null)) {
                    ((C117778u) e3).mo173632i();
                }
                Class cls4 = C117775r.class;
                if (!(!C91441c.m114729c() || (iVar2 = (C113173i) C91441c.m114730d().mo125377a(cls)) == null || (e2 = iVar2.f338613h.mo165880e(cls4)) == null)) {
                    ((C117775r) e2).mo173632i();
                }
                Class cls5 = C114486j0.class;
                if (!(!C91441c.m114729c() || (iVar = (C113173i) C91441c.m114730d().mo125377a(cls)) == null || (e = iVar.f338613h.mo165880e(cls5)) == null)) {
                    ((C114486j0) e).mo173632i();
                }
            }
        }
    }
}
