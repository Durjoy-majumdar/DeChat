package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.DataApi;

final /* synthetic */ class zzcq implements PendingResultUtil.ResultConverter {
    public static final PendingResultUtil.ResultConverter zzbx = new zzcq();

    private zzcq() {
    }

    public final Object convert(Result result) {
        return Integer.valueOf(((DataApi.DeleteDataItemsResult) result).getNumDeleted());
    }
}
