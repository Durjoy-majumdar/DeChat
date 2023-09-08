package p212oe;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import kj2.C117407d;
import p757xv.C91346k;
import p933be.C113173i;

/* renamed from: oe.j$$h */
public final class j$$h implements Runnable {

    /* renamed from: d */
    public final boolean f352206d;

    public j$$h(boolean z, j$$c j__c) {
        this.f352206d = z;
    }

    public void run() {
        List<C91346k.C91347a> list = C117762j.f352163a;
        synchronized (list) {
            if (this.f352206d) {
                if (!C117762j.f352167e) {
                    Log.m105924i("Matrix.battery.LifeCycle", "#onAppLowEnergy, AppDoze ON");
                    C117407d.INSTANCE.idkeyStat(1540, 63, 1, false);
                    for (C91346k.C91347a a : list) {
                        a.mo119160a(true);
                    }
                    C117762j.f352167e = true;
                    C117772o oVar = new C117772o("DozeOn");
                    C113173i e = C117750b.m166047e();
                    if (e != null) {
                        e.f338613h.f339059f.post(new o$$a(oVar, e));
                    }
                }
            } else if (C117762j.f352167e) {
                Log.m105924i("Matrix.battery.LifeCycle", "#onAppLowEnergy, AppDoze OFF");
                C117407d.INSTANCE.idkeyStat(1540, 64, 1, false);
                for (C91346k.C91347a a2 : list) {
                    a2.mo119160a(false);
                }
                C117762j.f352167e = false;
            }
        }
    }
}
