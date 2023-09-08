package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import java.net.URISyntaxException;
import java.util.List;

public final class GoogleAuthUtil extends zzg {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    private static final String KEY_ANDROID_PACKAGE_NAME = zzg.KEY_ANDROID_PACKAGE_NAME;
    private static final String KEY_CALLER_UID = zzg.KEY_CALLER_UID;
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";

    private GoogleAuthUtil() {
    }

    public static void clearToken(Context context, String str) {
        zzg.clearToken(context, str);
    }

    public static List<AccountChangeEvent> getAccountChangeEvents(Context context, int i, String str) {
        return zzg.getAccountChangeEvents(context, i, str);
    }

    public static String getAccountId(Context context, String str) {
        return zzg.getAccountId(context, str);
    }

    public static String getToken(Context context, Account account, String str) {
        return zzg.getToken(context, account, str);
    }

    public static String getToken(Context context, Account account, String str, Bundle bundle) {
        return zzg.getToken(context, account, str, bundle);
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2) {
        return zzg.getToken(context, str, str2);
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2, Bundle bundle) {
        return zzg.getToken(context, str, str2, bundle);
    }

    public static String getTokenWithNotification(Context context, Account account, String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        return zzd(context, account, str, bundle).zze();
    }

    public static String getTokenWithNotification(Context context, Account account, String str, Bundle bundle, Intent intent) {
        if (intent != null) {
            try {
                Intent.parseUri(intent.toUri(1), 1);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putParcelable("callback_intent", intent);
                bundle.putBoolean("handle_notification", true);
                return zzd(context, account, str, bundle).zze();
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
            }
        } else {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
    }

    public static String getTokenWithNotification(Context context, Account account, String str, Bundle bundle, String str2, Bundle bundle2) {
        Preconditions.checkNotEmpty(str2, "Authority cannot be empty or null.");
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle(bundle2);
        bundle.putString("authority", str2);
        bundle.putBundle("sync_extras", bundle2);
        bundle.putBoolean("handle_notification", true);
        return zzd(context, account, str, bundle).zze();
    }

    @Deprecated
    public static String getTokenWithNotification(Context context, String str, String str2, Bundle bundle) {
        return getTokenWithNotification(context, new Account(str, "com.google"), str2, bundle);
    }

    @Deprecated
    public static String getTokenWithNotification(Context context, String str, String str2, Bundle bundle, Intent intent) {
        return getTokenWithNotification(context, new Account(str, "com.google"), str2, bundle, intent);
    }

    @Deprecated
    public static String getTokenWithNotification(Context context, String str, String str2, Bundle bundle, String str3, Bundle bundle2) {
        return getTokenWithNotification(context, new Account(str, "com.google"), str2, bundle, str3, bundle2);
    }

    @Deprecated
    public static void invalidateToken(Context context, String str) {
        zzg.invalidateToken(context, str);
    }

    public static Bundle removeAccount(Context context, Account account) {
        return zzg.removeAccount(context, account);
    }

    public static Boolean requestGoogleAccountsAccess(Context context) {
        return zzg.requestGoogleAccountsAccess(context);
    }

    private static TokenData zzd(Context context, Account account, String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            TokenData zze = zzg.zze(context, account, str, bundle);
            GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
            return zze;
        } catch (GooglePlayServicesAvailabilityException e) {
            GooglePlayServicesUtil.showErrorNotification(e.getConnectionStatusCode(), context);
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        } catch (UserRecoverableAuthException unused) {
            GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
    }
}
