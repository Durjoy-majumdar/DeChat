package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.DataItemBuffer;

final /* synthetic */ class zzco implements PendingResultUtil.ResultConverter {
    public static final PendingResultUtil.ResultConverter zzbx = new zzco();

    private zzco() {
    }

    public final Object convert(Result result) {
        return (DataItemBuffer) result;
    }
}
