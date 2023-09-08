package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzf implements Runnable {
    private final /* synthetic */ Task zzafn;
    private final /* synthetic */ zze zzafp;

    public zzf(zze zze, Task task) {
        this.zzafp = zze;
        this.zzafn = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.zzafp.zzafl.then(this.zzafn);
            if (task == null) {
                this.zzafp.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.zzagd;
            task.addOnSuccessListener(executor, this.zzafp);
            task.addOnFailureListener(executor, (OnFailureListener) this.zzafp);
            task.addOnCanceledListener(executor, (OnCanceledListener) this.zzafp);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.zzafp.zzafm.setException((Exception) e.getCause());
            } else {
                this.zzafp.zzafm.setException(e);
            }
        } catch (Exception e2) {
            this.zzafp.zzafm.setException(e2);
        }
    }
}
