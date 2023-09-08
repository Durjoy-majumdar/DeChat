package com.google.android.gms.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.stats.LoggingConstants;
import com.google.android.gms.common.stats.StatsUtils;
import com.google.android.gms.common.stats.WakeLockTracker;

public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver {
    private static String TAG = "GCoreWakefulBroadcastReceiver";

    public static boolean completeWakefulIntent(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        if (context != null) {
            WakeLockTracker.getInstance().registerReleaseEvent(context, intent);
        } else {
            String valueOf = String.valueOf(intent.toUri(0));
            if (valueOf.length() != 0) {
                "context shouldn't be null. intent: ".concat(valueOf);
            }
        }
        return WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        ComponentName zza = zza(context, intent);
        if (zza == null) {
            return null;
        }
        WakeLockTracker instance = WakeLockTracker.getInstance();
        String valueOf = String.valueOf(zza.flattenToShortString());
        instance.registerAcquireEvent(context, intent, valueOf.length() != 0 ? "wake:".concat(valueOf) : new String("wake:"), TAG, (String) null, 1, "com.google.android.gms");
        return zza;
    }

    public static ComponentName startWakefulService(Context context, Intent intent, String str) {
        return startWakefulService(context, intent, str, context.getPackageName());
    }

    public static ComponentName startWakefulService(Context context, Intent intent, String str, String str2) {
        ComponentName zza = zza(context, intent);
        if (zza == null) {
            return null;
        }
        WakeLockTracker.getInstance().registerAcquireEvent(context, intent, str, TAG, (String) null, 1, str2);
        return zza;
    }

    private static ComponentName zza(Context context, Intent intent) {
        intent.putExtra(LoggingConstants.EXTRA_WAKE_LOCK_KEY, StatsUtils.getEventKey(context, intent));
        return WakefulBroadcastReceiver.startWakefulService(context, intent);
    }
}
