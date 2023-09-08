package st3;

import android.os.Build;
import android.os.CancellationSignal;
import ot3.C21881e;
import yt3.C23319f;
import yt3.C23324g;

/* renamed from: st3.a */
public class C22395a {

    /* renamed from: a */
    public CancellationSignal f63495a;

    /* renamed from: st3.a$a */
    public class C22396a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f63496d;

        public C22396a(boolean z) {
            this.f63496d = z;
        }

        public void run() {
            C21881e.m25086e("Soter.SoterBiometricCanceller", "soter: enter worker thread. perform cancel", new Object[0]);
            C22395a.this.f63495a.cancel();
            if (this.f63496d) {
                C22395a.this.getClass();
                C23319f.m27817c().mo36812d();
            }
        }
    }

    /* renamed from: st3.a$c */
    public class C22397c implements Runnable {
        public C22397c() {
        }

        public void run() {
            C21881e.m25087f("Soter.SoterBiometricCanceller", "hy: waiting for %s ms not callback to system callback. cancel manually", 350L);
            C22395a.this.getClass();
            C23319f.m27817c().mo36812d();
        }
    }

    /* renamed from: st3.a$b */
    public class C22398b implements Runnable {
        public C22398b() {
        }

        public void run() {
            C22395a.this.f63495a.cancel();
        }
    }

    public C22395a() {
        this.f63495a = null;
        this.f63495a = new CancellationSignal();
    }

    /* renamed from: a */
    public boolean mo35544a(boolean z) {
        C21881e.m25086e("Soter.SoterBiometricCanceller", "soter: publishing cancellation. should publish: %b", Boolean.valueOf(z));
        if (!this.f63495a.isCanceled()) {
            if (Build.VERSION.SDK_INT < 23) {
                C23324g.m27822a().mo36819c(new C22396a(z));
            } else {
                C23324g.m27822a().mo36819c(new C22398b());
                C23324g a = C23324g.m27822a();
                a.f67046b.postDelayed(new C22397c(), 350);
            }
            return true;
        }
        C21881e.m25084c("Soter.SoterBiometricCanceller", "soter: cancellation signal already expired.", new Object[0]);
        return false;
    }
}
