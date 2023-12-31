package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

final class zzm implements PendingResultUtil.ResultConverter {
    private final /* synthetic */ Response zzus;

    public zzm(Response response) {
        this.zzus = response;
    }

    public final /* synthetic */ Object convert(Result result) {
        this.zzus.setResult(result);
        return this.zzus;
    }
}
