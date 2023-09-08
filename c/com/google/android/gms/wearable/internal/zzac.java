package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.CapabilityApi;

final /* synthetic */ class zzac implements PendingResultUtil.ResultConverter {
    public static final PendingResultUtil.ResultConverter zzbx = new zzac();

    private zzac() {
    }

    public final Object convert(Result result) {
        return ((CapabilityApi.GetAllCapabilitiesResult) result).getAllCapabilities();
    }
}
