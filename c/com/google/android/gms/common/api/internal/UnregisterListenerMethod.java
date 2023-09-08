package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder.ListenerKey<L> zzlj;

    public UnregisterListenerMethod(ListenerHolder.ListenerKey<L> listenerKey) {
        this.zzlj = listenerKey;
    }

    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zzlj;
    }

    public abstract void unregisterListener(A a, TaskCompletionSource<Boolean> taskCompletionSource);
}
