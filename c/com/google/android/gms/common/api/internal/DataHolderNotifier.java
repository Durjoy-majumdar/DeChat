package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.DataHolder;

public abstract class DataHolderNotifier<L> implements ListenerHolder.Notifier<L> {
    private final DataHolder mDataHolder;

    public DataHolderNotifier(DataHolder dataHolder) {
        this.mDataHolder = dataHolder;
    }

    public final void notifyListener(L l) {
        notifyListener(l, this.mDataHolder);
    }

    public abstract void notifyListener(L l, DataHolder dataHolder);

    public void onNotifyListenerFailed() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
