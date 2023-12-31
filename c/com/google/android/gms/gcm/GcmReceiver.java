package com.google.android.gms.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.iid.zzk;

@Deprecated
public class GcmReceiver extends WakefulBroadcastReceiver {
    private static boolean zzq;
    private static zzk zzr;
    private static zzk zzs;

    private final synchronized zzk zzd(Context context, String str) {
        if ("com.google.android.c2dm.intent.RECEIVE".equals(str)) {
            if (zzs == null) {
                zzs = new zzk(context, str);
            }
            return zzs;
        }
        if (zzr == null) {
            zzr = new zzk(context, str);
        }
        return zzr;
    }

    private final void zzd(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        if (isOrderedBroadcast()) {
            setResultCode(500);
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (!(resolveService == null || (serviceInfo = resolveService.serviceInfo) == null)) {
            if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                new StringBuilder(String.valueOf(serviceInfo.packageName).length() + 94 + String.valueOf(serviceInfo.name).length());
            } else {
                if (str.startsWith(".")) {
                    String valueOf = String.valueOf(context.getPackageName());
                    str = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
                }
                if (Log.isLoggable("GcmReceiver", 3)) {
                    String valueOf2 = String.valueOf(str);
                    if (valueOf2.length() != 0) {
                        "Restricting intent to a specific service: ".concat(valueOf2);
                    }
                }
                intent.setClassName(context.getPackageName(), str);
            }
        }
        try {
            if ((context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 ? WakefulBroadcastReceiver.startWakefulService(context, intent) : context.startService(intent)) == null) {
                if (isOrderedBroadcast()) {
                    setResultCode(404);
                }
            } else if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
        } catch (SecurityException unused) {
            if (isOrderedBroadcast()) {
                setResultCode(401);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        Log.isLoggable("GcmReceiver", 3);
        intent.setComponent((ComponentName) null);
        intent.setPackage(context.getPackageName());
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        if (z) {
            if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
            zzd(context, intent.getAction()).zzd(intent, goAsync());
            return;
        }
        boolean equals = "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction());
        zzd(context, intent);
        if (isOrderedBroadcast() && getResultCode() == 0) {
            setResultCode(-1);
        }
    }
}
