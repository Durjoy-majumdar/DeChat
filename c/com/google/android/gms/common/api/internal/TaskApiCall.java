package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {
    private final Feature[] zzlz;
    private final boolean zzma;

    public static class Builder<A extends Api.AnyClient, ResultT> {
        private Feature[] zzlz;
        private boolean zzma;
        /* access modifiers changed from: private */
        public BiConsumer<A, TaskCompletionSource<ResultT>> zzmb;

        private Builder() {
            this.zzma = true;
        }

        public TaskApiCall<A, ResultT> build() {
            if (this.zzmb != null) {
                return new zzcf(this, this.zzlz, this.zzma);
            }
            throw new IllegalArgumentException("execute parameter required");
        }

        public Builder<A, ResultT> execute(BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            this.zzmb = biConsumer;
            return this;
        }

        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.zzma = z;
            return this;
        }

        public Builder<A, ResultT> setFeatures(Feature[] featureArr) {
            this.zzlz = featureArr;
            return this;
        }
    }

    @Deprecated
    public TaskApiCall() {
        this.zzlz = null;
        this.zzma = false;
    }

    private TaskApiCall(Feature[] featureArr, boolean z) {
        this.zzlz = featureArr;
        this.zzma = z;
    }

    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder<>();
    }

    public abstract void doExecute(A a, TaskCompletionSource<ResultT> taskCompletionSource);

    public boolean shouldAutoResolveMissingFeatures() {
        return this.zzma;
    }

    public final Feature[] zzca() {
        return this.zzlz;
    }
}
