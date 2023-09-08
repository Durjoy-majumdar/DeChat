package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(Status status);

    public final void onResult(R r) {
        Status status = r.getStatus();
        if (status.isSuccess()) {
            onSuccess(r);
            return;
        }
        onFailure(status);
        if (r instanceof Releasable) {
            try {
                ((Releasable) r).release();
            } catch (RuntimeException unused) {
                new StringBuilder(String.valueOf(r).length() + 18);
            }
        }
    }

    public abstract void onSuccess(R r);
}
