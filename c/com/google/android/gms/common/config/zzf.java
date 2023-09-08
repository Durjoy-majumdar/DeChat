package com.google.android.gms.common.config;

import android.content.Context;

final class zzf extends GservicesValue<String> {
    public zzf(String str, String str2) {
        super(str, str2);
    }

    public final /* synthetic */ Object retrieve(String str) {
        return GservicesValue.zzmu.getString(this.mKey, (String) this.mDefaultValue);
    }

    public final /* synthetic */ Object retrieveFromDirectBootCache(Context context, String str, Object obj) {
        return context.getSharedPreferences("gservices-direboot-cache", 0).getString(str, (String) obj);
    }
}
