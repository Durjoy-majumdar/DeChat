package p1222y4;

import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import p1014o4.C117693m;
import p1014o4.C117705u;
import p1206p4.C117971d;
import p1206p4.C117979k;
import p1221x4.C118849p;
import p1221x4.C118850q;

/* renamed from: y4.l */
public class C118928l implements Runnable {

    /* renamed from: g */
    public static final String f356213g = C117693m.m165967e("StopWorkRunnable");

    /* renamed from: d */
    public final C117979k f356214d;

    /* renamed from: e */
    public final String f356215e;

    /* renamed from: f */
    public final boolean f356216f;

    public C118928l(C117979k kVar, String str, boolean z) {
        this.f356214d = kVar;
        this.f356215e = str;
        this.f356216f = z;
    }

    public void run() {
        boolean containsKey;
        boolean z;
        C117979k kVar = this.f356214d;
        WorkDatabase workDatabase = kVar.f352606c;
        C117971d dVar = kVar.f352609f;
        C118849p n = workDatabase.mo165532n();
        workDatabase.mo183703c();
        try {
            String str = this.f356215e;
            synchronized (dVar.f352583q) {
                containsKey = ((HashMap) dVar.f352578i).containsKey(str);
            }
            if (this.f356216f) {
                z = this.f356214d.f352609f.mo182727h(this.f356215e);
            } else {
                if (!containsKey) {
                    C118850q qVar = (C118850q) n;
                    if (qVar.mo183557f(this.f356215e) == C117705u.RUNNING) {
                        qVar.mo183567p(C117705u.ENQUEUED, this.f356215e);
                    }
                }
                z = this.f356214d.f352609f.mo182728i(this.f356215e);
            }
            C117693m.m165966c().mo182389a(f356213g, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f356215e, Boolean.valueOf(z)}), new Throwable[0]);
            workDatabase.mo183706h();
            workDatabase.mo183704f();
        } catch (Throwable th) {
            workDatabase.mo183704f();
            throw th;
        }
    }
}
