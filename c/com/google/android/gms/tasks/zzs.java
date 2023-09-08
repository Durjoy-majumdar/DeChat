package com.google.android.gms.tasks;

final class zzs implements OnTokenCanceledListener {
    private final /* synthetic */ TaskCompletionSource zzagc;

    public zzs(TaskCompletionSource taskCompletionSource) {
        this.zzagc = taskCompletionSource;
    }

    public final void onCanceled() {
        this.zzagc.zzafh.zzdp();
    }
}
