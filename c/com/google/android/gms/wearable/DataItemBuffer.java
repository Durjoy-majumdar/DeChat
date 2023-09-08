package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;
import com.google.android.gms.wearable.internal.zzdf;

public class DataItemBuffer extends EntityBuffer<DataItem> implements Result {
    private final Status zzp;

    public DataItemBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zzp = new Status(dataHolder.getStatusCode());
    }

    public /* synthetic */ Object getEntry(int i, int i2) {
        return new zzdf(this.mDataHolder, i, i2);
    }

    public String getPrimaryDataMarkerColumn() {
        return "path";
    }

    public Status getStatus() {
        return this.zzp;
    }
}
