package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;

public class MetadataValueReader {
    public static final String KEY_METADATA_APP_ID = "com.google.app.id";
    private static Object sLock = new Object();
    private static boolean zzui;
    private static String zzuj;
    private static int zzuk;

    public static String getGoogleAppId(Context context) {
        zze(context);
        return zzuj;
    }

    public static int getGooglePlayServicesVersion(Context context) {
        zze(context);
        return zzuk;
    }

    public static void resetForTesting() {
        synchronized (sLock) {
            zzui = false;
        }
    }

    public static void setValuesForTesting(String str, int i) {
        synchronized (sLock) {
            zzuj = str;
            zzuk = i;
            zzui = true;
        }
    }

    private static void zze(Context context) {
        synchronized (sLock) {
            if (!zzui) {
                zzui = true;
                try {
                    Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        zzuj = bundle.getString(KEY_METADATA_APP_ID);
                        zzuk = bundle.getInt(GooglePlayServicesUtilLight.KEY_METADATA_GOOGLE_PLAY_SERVICES_VERSION);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
