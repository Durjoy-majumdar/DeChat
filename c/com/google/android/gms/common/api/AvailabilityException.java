package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zzh;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import p1042u.C111055b;
import p1042u.C118556h;

public class AvailabilityException extends Exception {
    private final C111055b<zzh<?>, ConnectionResult> zzcc;

    public AvailabilityException(C111055b<zzh<?>, ConnectionResult> bVar) {
        this.zzcc = bVar;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        zzh<? extends Api.ApiOptions> zzm = googleApi.zzm();
        Preconditions.checkArgument(this.zzcc.getOrDefault(zzm, null) != null, "The given API was not part of the availability request.");
        return this.zzcc.getOrDefault(zzm, null);
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C118556h.C118559c) this.zzcc.keySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            zzh zzh = (zzh) it.next();
            ConnectionResult orDefault = this.zzcc.getOrDefault(zzh, null);
            if (orDefault.isSuccess()) {
                z = false;
            }
            String zzq = zzh.zzq();
            String valueOf = String.valueOf(orDefault);
            StringBuilder sb = new StringBuilder(String.valueOf(zzq).length() + 2 + valueOf.length());
            sb.append(zzq);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb4.append(TextUtils.join("; ", arrayList));
        return sb4.toString();
    }

    public final C111055b<zzh<?>, ConnectionResult> zzl() {
        return this.zzcc;
    }
}
