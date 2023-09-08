package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

public final class zzb {
    private SharedPreferences zzs;

    public zzb(Context context) {
        try {
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            this.zzs = remoteContext == null ? null : remoteContext.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable unused) {
            this.zzs = null;
        }
    }

    public final boolean getBoolean(String str, boolean z) {
        try {
            SharedPreferences sharedPreferences = this.zzs;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final float getFloat(String str, float f) {
        try {
            SharedPreferences sharedPreferences = this.zzs;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final String getString(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.zzs;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
