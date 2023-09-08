package p1172b5;

import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import p1167z8.C112608f;

/* renamed from: b5.a */
public class C113145a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112608f f338557d;

    /* renamed from: e */
    public final /* synthetic */ ConstraintTrackingWorker f338558e;

    public C113145a(ConstraintTrackingWorker constraintTrackingWorker, C112608f fVar) {
        this.f338558e = constraintTrackingWorker;
        this.f338557d = fVar;
    }

    public void run() {
        synchronized (this.f338558e.f338446j) {
            if (this.f338558e.f338447n) {
                this.f338558e.f338448o.mo183732i(new ListenableWorker.C113032a.C113034b());
            } else {
                this.f338558e.f338448o.mo183734k(this.f338557d);
            }
        }
    }
}
