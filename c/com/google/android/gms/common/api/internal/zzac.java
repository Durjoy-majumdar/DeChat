package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzac implements OnCompleteListener {
    private final /* synthetic */ zzaa zzgz;
    private final /* synthetic */ TaskCompletionSource zzha;

    public zzac(zzaa zzaa, TaskCompletionSource taskCompletionSource) {
        this.zzgz = zzaa;
        this.zzha = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.zzgz.zzgx.remove(this.zzha);
    }
}
