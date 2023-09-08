package com.google.android.gms.common.config;

import android.content.Context;

final class zza extends GservicesValue<Boolean> {
    public zza(String str, Boolean bool) {
        super(str, bool);
    }

    private static Boolean zza(Context context, String str, Boolean bool) {
        String string = context.getSharedPreferences("gservices-direboot-cache", 0).getString(str, (String) null);
        if (string != null) {
            try {
                return Boolean.valueOf(Boolean.parseBoolean(string));
            } catch (NumberFormatException unused) {
            }
        }
        return bool;
    }

    public final /* synthetic */ Object retrieve(String str) {
        return GservicesValue.zzmu.zza(this.mKey, (Boolean) this.mDefaultValue);
    }

    public final /* synthetic */ Object retrieveFromDirectBootCache(Context context, String str, Object obj) {
        return zza(context, str, (Boolean) obj);
    }
}
