package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class zzp implements Runnable {
    private final /* synthetic */ Task zzafn;
    private final /* synthetic */ zzo zzafz;

    public zzp(zzo zzo, Task task) {
        this.zzafz = zzo;
        this.zzafn = task;
    }

    public final void run() {
        try {
            Task then = this.zzafz.zzafy.then(this.zzafn.getResult());
            if (then == null) {
                this.zzafz.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.zzagd;
            then.addOnSuccessListener(executor, this.zzafz);
            then.addOnFailureListener(executor, (OnFailureListener) this.zzafz);
            then.addOnCanceledListener(executor, (OnCanceledListener) this.zzafz);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.zzafz.onFailure((Exception) e.getCause());
            } else {
                this.zzafz.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.zzafz.onCanceled();
        } catch (Exception e2) {
            this.zzafz.onFailure(e2);
        }
    }
}
