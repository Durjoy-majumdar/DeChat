package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

public class GoogleApiAvailabilityCache {
    private final SparseIntArray zzug;
    private GoogleApiAvailabilityLight zzuh;

    public GoogleApiAvailabilityCache() {
        this(GoogleApiAvailability.getInstance());
    }

    public GoogleApiAvailabilityCache(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zzug = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zzuh = googleApiAvailabilityLight;
    }

    public void flush() {
        this.zzug.clear();
    }

    public int getClientAvailability(Context context, Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int i2 = this.zzug.get(minApkVersion, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.zzug.size()) {
                i = i2;
                break;
            }
            int keyAt = this.zzug.keyAt(i3);
            if (keyAt > minApkVersion && this.zzug.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.zzuh.isGooglePlayServicesAvailable(context, minApkVersion);
        }
        this.zzug.put(minApkVersion, i);
        return i;
    }
}
