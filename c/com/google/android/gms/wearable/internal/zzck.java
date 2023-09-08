package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.DataApi;

final /* synthetic */ class zzck implements PendingResultUtil.ResultConverter {
    public static final PendingResultUtil.ResultConverter zzbx = new zzck();

    private zzck() {
    }

    public final Object convert(Result result) {
        return ((DataApi.DataItemResult) result).getDataItem();
    }
}
