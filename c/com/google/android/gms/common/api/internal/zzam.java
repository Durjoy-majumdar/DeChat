package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import java.util.ArrayList;
import java.util.Map;

final class zzam extends zzat {
    public final /* synthetic */ zzaj zzhv;
    private final Map<Api.Client, zzal> zzhx;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzam(zzaj zzaj, Map<Api.Client, zzal> map) {
        super(zzaj, (zzak) null);
        this.zzhv = zzaj;
        this.zzhx = map;
    }

    public final void zzaq() {
        GoogleApiAvailabilityCache googleApiAvailabilityCache = new GoogleApiAvailabilityCache(this.zzhv.zzgk);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client next : this.zzhx.keySet()) {
            if (!next.requiresGooglePlayServices() || this.zzhx.get(next).zzfo) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                i = googleApiAvailabilityCache.getClientAvailability(this.zzhv.mContext, (Api.Client) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                i = googleApiAvailabilityCache.getClientAvailability(this.zzhv.mContext, (Api.Client) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.zzhv.zzhf.zza((zzbe) new zzan(this, this.zzhv, new ConnectionResult(i, (PendingIntent) null)));
            return;
        }
        if (this.zzhv.zzhp) {
            this.zzhv.zzhn.connect();
        }
        for (Api.Client next2 : this.zzhx.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = this.zzhx.get(next2);
            if (!next2.requiresGooglePlayServices() || googleApiAvailabilityCache.getClientAvailability(this.zzhv.mContext, next2) == 0) {
                next2.connect(connectionProgressReportCallbacks);
            } else {
                this.zzhv.zzhf.zza((zzbe) new zzao(this, this.zzhv, connectionProgressReportCallbacks));
            }
        }
    }
}
