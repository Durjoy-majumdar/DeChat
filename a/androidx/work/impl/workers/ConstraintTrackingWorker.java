package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p1014o4.C117693m;
import p1167z8.C112608f;
import p1172b5.C113145a;
import p1206p4.C117979k;
import p1214t4.C118384c;
import p1214t4.C118385d;
import p1221x4.C118847o;
import p1221x4.C118850q;
import p283z4.C119060c;

public class ConstraintTrackingWorker extends ListenableWorker implements C118384c {

    /* renamed from: q */
    public static final String f338444q = C117693m.m165967e("ConstraintTrkngWrkr");

    /* renamed from: i */
    public WorkerParameters f338445i;

    /* renamed from: j */
    public final Object f338446j = new Object();

    /* renamed from: n */
    public volatile boolean f338447n = false;

    /* renamed from: o */
    public C119060c<ListenableWorker.C113032a> f338448o = new C119060c<>();

    /* renamed from: p */
    public ListenableWorker f338449p;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    public class C113065a implements Runnable {
        public C113065a() {
        }

        public void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            Object obj = ((HashMap) constraintTrackingWorker.f338327e.f338337b.f338353a).get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            String str = obj instanceof String ? (String) obj : null;
            if (TextUtils.isEmpty(str)) {
                C117693m.m165966c().mo182390b(ConstraintTrackingWorker.f338444q, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.f338448o.mo183732i(new ListenableWorker.C113032a.C113033a());
                return;
            }
            ListenableWorker a = constraintTrackingWorker.f338327e.f338340e.mo182398a(constraintTrackingWorker.f338326d, str, constraintTrackingWorker.f338445i);
            constraintTrackingWorker.f338449p = a;
            if (a == null) {
                C117693m.m165966c().mo182389a(ConstraintTrackingWorker.f338444q, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.f338448o.mo183732i(new ListenableWorker.C113032a.C113033a());
                return;
            }
            C118847o i = ((C118850q) C117979k.m166386b(constraintTrackingWorker.f338326d).f352606c.mo165532n()).mo183560i(constraintTrackingWorker.f338327e.f338336a.toString());
            if (i == null) {
                constraintTrackingWorker.f338448o.mo183732i(new ListenableWorker.C113032a.C113033a());
                return;
            }
            Context context = constraintTrackingWorker.f338326d;
            C118385d dVar = new C118385d(context, C117979k.m166386b(context).f352607d, constraintTrackingWorker);
            dVar.mo183175b(Collections.singletonList(i));
            if (dVar.mo183174a(constraintTrackingWorker.f338327e.f338336a.toString())) {
                C117693m.m165966c().mo182389a(ConstraintTrackingWorker.f338444q, String.format("Constraints met for delegate %s", new Object[]{str}), new Throwable[0]);
                try {
                    C112608f<ListenableWorker.C113032a> e = constraintTrackingWorker.f338449p.mo165505e();
                    e.addListener(new C113145a(constraintTrackingWorker, e), constraintTrackingWorker.f338327e.f338338c);
                } catch (Throwable th) {
                    C117693m c = C117693m.m165966c();
                    String str2 = ConstraintTrackingWorker.f338444q;
                    c.mo182389a(str2, String.format("Delegated worker %s threw exception in startWork.", new Object[]{str}), th);
                    synchronized (constraintTrackingWorker.f338446j) {
                        if (constraintTrackingWorker.f338447n) {
                            C117693m.m165966c().mo182389a(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                            constraintTrackingWorker.f338448o.mo183732i(new ListenableWorker.C113032a.C113034b());
                        } else {
                            constraintTrackingWorker.f338448o.mo183732i(new ListenableWorker.C113032a.C113033a());
                        }
                    }
                }
            } else {
                C117693m.m165966c().mo182389a(ConstraintTrackingWorker.f338444q, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{str}), new Throwable[0]);
                constraintTrackingWorker.f338448o.mo183732i(new ListenableWorker.C113032a.C113034b());
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f338445i = workerParameters;
    }

    /* renamed from: b */
    public boolean mo165507b() {
        ListenableWorker listenableWorker = this.f338449p;
        return listenableWorker != null && listenableWorker.mo165507b();
    }

    /* renamed from: c */
    public void mo165504c() {
        ListenableWorker listenableWorker = this.f338449p;
        if (listenableWorker != null && !listenableWorker.f338328f) {
            this.f338449p.mo165508g();
        }
    }

    /* renamed from: d */
    public void mo165549d(List<String> list) {
        C117693m.m165966c().mo182389a(f338444q, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f338446j) {
            this.f338447n = true;
        }
    }

    /* renamed from: e */
    public C112608f<ListenableWorker.C113032a> mo165505e() {
        this.f338327e.f338338c.execute(new C113065a());
        return this.f338448o;
    }

    /* renamed from: f */
    public void mo165550f(List<String> list) {
    }
}
