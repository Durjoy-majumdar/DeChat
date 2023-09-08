package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.GmsVersion;
import java.io.IOException;
import java.util.List;

public class zzg {
    private static final String[] ACCEPTABLE_ACCOUNT_TYPES = {"com.google", "com.google.work", "cn.google"};
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    public static final String KEY_CALLER_UID = "callerUid";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";
    private static final ComponentName zzp = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    /* access modifiers changed from: private */
    public static final Logger zzq = new Logger("Auth", "GoogleAuthUtil");

    public static void clearToken(Context context, String str) {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context, GmsVersion.VERSION_URDA);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        String str3 = KEY_ANDROID_PACKAGE_NAME;
        if (!bundle.containsKey(str3)) {
            bundle.putString(str3, str2);
        }
        zzd(context, zzp, new zzi(str, bundle));
    }

    private static void ensurePlayServicesAvailable(Context context, int i) {
        try {
            GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i);
        } catch (GooglePlayServicesRepairableException e) {
            throw new GooglePlayServicesAvailabilityException(e.getConnectionStatusCode(), e.getMessage(), e.getIntent());
        } catch (GooglePlayServicesNotAvailableException e2) {
            throw new GoogleAuthException(e2.getMessage());
        }
    }

    public static List<AccountChangeEvent> getAccountChangeEvents(Context context, int i, String str) {
        Preconditions.checkNotEmpty(str, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context, GmsVersion.VERSION_URDA);
        return (List) zzd(context, zzp, new zzj(str, i));
    }

    public static String getAccountId(Context context, String str) {
        Preconditions.checkNotEmpty(str, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context, GmsVersion.VERSION_URDA);
        return getToken(context, str, "^^_account_id_^^", new Bundle());
    }

    public static String getToken(Context context, Account account, String str) {
        return getToken(context, account, str, new Bundle());
    }

    public static String getToken(Context context, Account account, String str, Bundle bundle) {
        zze(account);
        return zze(context, account, str, bundle).zze();
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2) {
        return getToken(context, new Account(str, "com.google"), str2);
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2, Bundle bundle) {
        return getToken(context, new Account(str, "com.google"), str2, bundle);
    }

    @Deprecated
    public static void invalidateToken(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    public static Bundle removeAccount(Context context, Account account) {
        Preconditions.checkNotNull(context);
        zze(account);
        ensurePlayServicesAvailable(context, GmsVersion.VERSION_URDA);
        return (Bundle) zzd(context, zzp, new zzk(account));
    }

    public static Boolean requestGoogleAccountsAccess(Context context) {
        Preconditions.checkNotNull(context);
        ensurePlayServicesAvailable(context, 11400000);
        return (Boolean) zzd(context, zzp, new zzl(context.getApplicationInfo().packageName));
    }

    private static <T> T zzd(Context context, ComponentName componentName, zzm<T> zzm) {
        BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
        GmsClientSupervisor instance = GmsClientSupervisor.getInstance(context);
        if (instance.bindService(componentName, (ServiceConnection) blockingServiceConnection, "GoogleAuthUtil")) {
            try {
                T zze = zzm.zze(blockingServiceConnection.getService());
                instance.unbindService(componentName, (ServiceConnection) blockingServiceConnection, "GoogleAuthUtil");
                return zze;
            } catch (RemoteException | InterruptedException e) {
                zzq.mo167275i("GoogleAuthUtil", "Error on service connection.", e);
                throw new IOException("Error on service connection.", e);
            } catch (Throwable th) {
                instance.unbindService(componentName, (ServiceConnection) blockingServiceConnection, "GoogleAuthUtil");
                throw th;
            }
        } else {
            throw new IOException("Could not bind to service.");
        }
    }

    /* access modifiers changed from: private */
    public static <T> T zzd(T t) {
        if (t != null) {
            return t;
        }
        zzq.mo167281w("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }

    public static TokenData zze(Context context, Account account, String str, Bundle bundle) {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        Preconditions.checkNotEmpty(str, "Scope cannot be empty or null.");
        zze(account);
        ensurePlayServicesAvailable(context, GmsVersion.VERSION_URDA);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        String str3 = KEY_ANDROID_PACKAGE_NAME;
        if (TextUtils.isEmpty(bundle2.getString(str3))) {
            bundle2.putString(str3, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) zzd(context, zzp, new zzh(account, str, bundle2));
    }

    private static void zze(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = ACCEPTABLE_ACCOUNT_TYPES;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        } else {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
    }
}
