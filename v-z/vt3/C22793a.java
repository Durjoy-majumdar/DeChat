package vt3;

import android.os.Build;
import android.os.CancellationSignal;
import ot3.C21881e;
import yt3.C23319f;
import yt3.C23324g;

@Deprecated
/* renamed from: vt3.a */
public class C22793a {

    /* renamed from: a */
    public CancellationSignal f65530a;

    /* renamed from: vt3.a$a */
    public class C22794a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f65531d;

        public C22794a(boolean z) {
            this.f65531d = z;
        }

        public void run() {
            C21881e.m25086e("Soter.SoterFingerprintCanceller", "soter: enter worker thread. perform cancel", new Object[0]);
            C22793a.this.f65530a.cancel();
            if (this.f65531d) {
                C22793a.this.getClass();
                C23319f.m27817c().mo36812d();
            }
        }
    }

    /* renamed from: vt3.a$b */
    public class C22795b implements Runnable {
        public C22795b() {
        }

        public void run() {
            C22793a.this.f65530a.cancel();
        }
    }

    /* renamed from: vt3.a$c */
    public class C22796c implements Runnable {
        public C22796c() {
        }

        public void run() {
            C21881e.m25087f("Soter.SoterFingerprintCanceller", "hy: waiting for %s ms not callback to system callback. cancel manually", 350L);
            C22793a.this.getClass();
            C23319f.m27817c().mo36812d();
        }
    }

    public C22793a() {
        this.f65530a = null;
        this.f65530a = new CancellationSignal();
    }

    /* renamed from: a */
    public boolean mo35943a(boolean z) {
        C21881e.m25086e("Soter.SoterFingerprintCanceller", "soter: publishing cancellation. should publish: %b", Boolean.valueOf(z));
        if (!this.f65530a.isCanceled()) {
            if (Build.VERSION.SDK_INT < 23) {
                C23324g.m27822a().mo36819c(new C22794a(z));
            } else {
                C23324g.m27822a().mo36819c(new C22795b());
                C23324g a = C23324g.m27822a();
                a.f67046b.postDelayed(new C22796c(), 350);
            }
            return true;
        }
        C21881e.m25084c("Soter.SoterFingerprintCanceller", "soter: cancellation signal already expired.", new Object[0]);
        return false;
    }
}
