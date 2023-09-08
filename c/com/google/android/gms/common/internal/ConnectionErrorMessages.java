package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.base.C104392R;
import com.google.android.gms.common.C104395R;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import p1042u.C111059i;

public final class ConnectionErrorMessages {
    private static final C111059i<String, String> zzse = new C111059i<>();

    private ConnectionErrorMessages() {
    }

    public static String getAppName(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String getDefaultNotificationChannelName(Context context) {
        return context.getResources().getString(C104392R.string.common_google_play_services_notification_channel_name);
    }

    public static String getErrorDialogButtonMessage(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : C104392R.string.common_google_play_services_enable_button : C104392R.string.common_google_play_services_update_button : C104392R.string.common_google_play_services_install_button);
    }

    public static String getErrorMessage(Context context, int i) {
        Resources resources = context.getResources();
        String appName = getAppName(context);
        if (i == 1) {
            return resources.getString(C104392R.string.common_google_play_services_install_text, new Object[]{appName});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C104392R.string.common_google_play_services_enable_text, new Object[]{appName});
            } else if (i == 5) {
                return zza(context, "common_google_play_services_invalid_account_text", appName);
            } else {
                if (i == 7) {
                    return zza(context, "common_google_play_services_network_error_text", appName);
                }
                if (i == 9) {
                    return resources.getString(C104392R.string.common_google_play_services_unsupported_text, new Object[]{appName});
                } else if (i == 20) {
                    return zza(context, "common_google_play_services_restricted_profile_text", appName);
                } else {
                    switch (i) {
                        case 16:
                            return zza(context, "common_google_play_services_api_unavailable_text", appName);
                        case 17:
                            return zza(context, "common_google_play_services_sign_in_failed_text", appName);
                        case 18:
                            return resources.getString(C104392R.string.common_google_play_services_updating_text, new Object[]{appName});
                        default:
                            return resources.getString(C104395R.string.common_google_play_services_unknown_issue, new Object[]{appName});
                    }
                }
            }
        } else if (DeviceProperties.isWearableWithoutPlayStore(context)) {
            return resources.getString(C104392R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C104392R.string.common_google_play_services_update_text, new Object[]{appName});
        }
    }

    public static String getErrorNotificationMessage(Context context, int i) {
        return i == 6 ? zza(context, "common_google_play_services_resolution_required_text", getAppName(context)) : getErrorMessage(context, i);
    }

    public static String getErrorNotificationTitle(Context context, int i) {
        String zzb = i == 6 ? zzb(context, "common_google_play_services_resolution_required_title") : getErrorTitle(context, i);
        return zzb == null ? context.getResources().getString(C104392R.string.common_google_play_services_notification_ticker) : zzb;
    }

    public static String getErrorTitle(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C104392R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C104392R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C104392R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return zzb(context, "common_google_play_services_invalid_account_title");
            case 7:
                return zzb(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 17:
                return zzb(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return zzb(context, "common_google_play_services_restricted_profile_title");
            default:
                return null;
        }
    }

    private static String zza(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zzb = zzb(context, str);
        if (zzb == null) {
            zzb = resources.getString(C104395R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zzb, new Object[]{str2});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String zzb(android.content.Context r4, java.lang.String r5) {
        /*
            u.i<java.lang.String, java.lang.String> r0 = zzse
            monitor-enter(r0)
            r1 = 0
            java.lang.Object r2 = r0.getOrDefault(r5, r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return r2
        L_0x000e:
            android.content.res.Resources r4 = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(r4)     // Catch:{ all -> 0x0053 }
            if (r4 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return r1
        L_0x0016:
            java.lang.String r2 = "string"
            java.lang.String r3 = "com.google.android.gms"
            int r2 = r4.getIdentifier(r5, r2, r3)     // Catch:{ all -> 0x0053 }
            if (r2 != 0) goto L_0x0031
            java.lang.String r4 = "Missing resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0053 }
            int r2 = r5.length()     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x002f
            r4.concat(r5)     // Catch:{ all -> 0x0053 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return r1
        L_0x0031:
            java.lang.String r4 = r4.getString(r2)     // Catch:{ all -> 0x0053 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x004c
            java.lang.String r4 = "Got empty resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0053 }
            int r2 = r5.length()     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x004a
            r4.concat(r5)     // Catch:{ all -> 0x0053 }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return r1
        L_0x004c:
            r0.put(r5, r4)     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return r4
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            throw r4
        L_0x0053:
            r4 = move-exception
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.ConnectionErrorMessages.zzb(android.content.Context, java.lang.String):java.lang.String");
    }
}
