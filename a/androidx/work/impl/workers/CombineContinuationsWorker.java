package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: h */
    public ListenableWorker.C113032a mo165518h() {
        return new ListenableWorker.C113032a.C113035c(this.f338327e.f338337b);
    }
}
