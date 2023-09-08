package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import p1167z8.C112608f;
import p283z4.C119060c;

public abstract class Worker extends ListenableWorker {

    /* renamed from: i */
    public C119060c<ListenableWorker.C113032a> f338334i;

    /* renamed from: androidx.work.Worker$a */
    public class C113036a implements Runnable {
        public C113036a() {
        }

        public void run() {
            try {
                Worker.this.f338334i.mo183732i(Worker.this.mo165518h());
            } catch (Throwable th) {
                Worker.this.f338334i.mo183733j(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: e */
    public final C112608f<ListenableWorker.C113032a> mo165505e() {
        this.f338334i = new C119060c<>();
        this.f338327e.f338338c.execute(new C113036a());
        return this.f338334i;
    }

    /* renamed from: h */
    public abstract ListenableWorker.C113032a mo165518h();
}
