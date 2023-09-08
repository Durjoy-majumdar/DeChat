package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public class DataHolderResult implements Releasable, Result {
    public final DataHolder mDataHolder;
    public final Status mStatus;

    public DataHolderResult(DataHolder dataHolder) {
        this(dataHolder, new Status(dataHolder.getStatusCode()));
    }

    public DataHolderResult(DataHolder dataHolder, Status status) {
        this.mStatus = status;
        this.mDataHolder = dataHolder;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public void release() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
