package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

final class zzau extends zzam {
    private BaseImplementation.ResultHolder<Status> zzdu;

    public zzau(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zzdu = resultHolder;
    }

    public final void zze(Status status) {
        this.zzdu.setResult(status);
    }
}
