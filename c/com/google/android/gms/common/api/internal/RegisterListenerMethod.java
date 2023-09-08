package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder<L> zzls;

    public RegisterListenerMethod(ListenerHolder<L> listenerHolder) {
        this.zzls = listenerHolder;
    }

    public void clearListener() {
        this.zzls.clear();
    }

    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zzls.getListenerKey();
    }

    public abstract void registerListener(A a, TaskCompletionSource<Void> taskCompletionSource);
}
