package uv3;

import android.text.TextUtils;
import aw3.C113080a;
import ew3.C116795d;
import ov3.C117898a;
import ov3.C117899b;
import rv3.C118245h;
import vv3.C118702d;
import vv3.C118706h;

/* renamed from: uv3.m */
public class C118625m {

    /* renamed from: a */
    public static C118619j f354970a;

    /* renamed from: a */
    public static boolean m167305a(C118616f fVar, C118613c cVar) {
        C118619j jVar;
        C118619j jVar2;
        C117899b bVar;
        Class<C118625m> cls = C118625m.class;
        boolean z = false;
        if (fVar != null && !TextUtils.isEmpty(fVar.f354953a)) {
            synchronized (cls) {
                jVar = f354970a;
            }
            if (jVar != null) {
                synchronized (cls) {
                    jVar2 = f354970a;
                }
                jVar2.getClass();
                C118621k kVar = new C118621k(jVar2, cVar, fVar);
                C118706h hVar = jVar2.f338483a.f355209e;
                C117898a aVar = jVar2.f354963d;
                if (aVar != null) {
                    hVar.f355214a.removeCallbacks(aVar);
                } else {
                    hVar.getClass();
                }
                try {
                    ((C116795d) jVar2.f338484b).mo180768a(fVar, kVar);
                    z = true;
                } catch (Throwable th) {
                    C118702d dVar = jVar2.f338483a;
                    if (!(dVar == null || (bVar = dVar.f355208d) == null)) {
                        ((C113080a) bVar).mo165608b(th, "start_ct");
                    }
                }
                jVar2.f338483a.f355211g.getClass();
                if (z) {
                    C118245h.m166799a("sensor_TuringSMIImpl", "[method: start ] post mTimeOutRunnable");
                    C118706h hVar2 = jVar2.f338483a.f355209e;
                    C117898a aVar2 = jVar2.f354963d;
                    if (aVar2 != null) {
                        hVar2.f355214a.postDelayed(aVar2, 1200000);
                    } else {
                        hVar2.getClass();
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m167306b(C118617g gVar) {
        C118619j jVar;
        C118619j jVar2;
        C117899b bVar;
        C117898a aVar;
        Class<C118625m> cls = C118625m.class;
        synchronized (cls) {
            jVar = f354970a;
        }
        boolean z = false;
        if (jVar == null) {
            return false;
        }
        synchronized (cls) {
            jVar2 = f354970a;
        }
        jVar2.getClass();
        try {
            z = jVar2.mo183358f(gVar);
            C118706h hVar = jVar2.f338483a.f355209e;
            if (!(hVar == null || (aVar = jVar2.f354963d) == null)) {
                hVar.f355214a.removeCallbacks(aVar);
            }
            C118245h.m166799a("sensor_TuringSMIImpl", "[method: stop ] remove mTimeOutRunnable");
        } catch (Throwable th) {
            C118702d dVar = jVar2.f338483a;
            if (!(dVar == null || (bVar = dVar.f355208d) == null)) {
                ((C113080a) bVar).mo165608b(th, "stop");
            }
        }
        return z;
    }
}
