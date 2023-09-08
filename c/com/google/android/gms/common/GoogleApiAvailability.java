package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.C104392R;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.GooglePlayServicesUpdatedReceiver;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zzbt;
import com.google.android.gms.common.api.internal.zzh;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import com.google.android.gms.common.internal.DialogRedirect;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p918s2.C90116e;

public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final Object mLock = new Object();
    private static final GoogleApiAvailability zzas = new GoogleApiAvailability();
    private String zzat;

    public class zza extends Handler {
        private final Context zzau;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zza(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.zzau = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                int isGooglePlayServicesAvailable = GoogleApiAvailability.this.isGooglePlayServicesAvailable(this.zzau);
                if (GoogleApiAvailability.this.isUserResolvableError(isGooglePlayServicesAvailable)) {
                    GoogleApiAvailability.this.showErrorNotification(this.zzau, isGooglePlayServicesAvailable);
                }
            }
        }
    }

    public static GoogleApiAvailability getInstance() {
        return zzas;
    }

    public static Dialog zza(Context context, int i, DialogRedirect dialogRedirect, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(ConnectionErrorMessages.getErrorMessage(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String errorDialogButtonMessage = ConnectionErrorMessages.getErrorDialogButtonMessage(context, i);
        if (errorDialogButtonMessage != null) {
            builder.setPositiveButton(errorDialogButtonMessage, dialogRedirect);
        }
        String errorTitle = ConnectionErrorMessages.getErrorTitle(context, i);
        if (errorTitle != null) {
            builder.setTitle(errorTitle);
        }
        return builder.create();
    }

    private final String zza(Context context, NotificationManager notificationManager) {
        Preconditions.checkState(PlatformVersion.isAtLeastO());
        String zzb = zzb();
        if (zzb == null) {
            zzb = "com.google.android.gms.availability";
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(zzb);
            String defaultNotificationChannelName = ConnectionErrorMessages.getDefaultNotificationChannelName(context);
            if (notificationChannel == null) {
                notificationChannel = new NotificationChannel(zzb, defaultNotificationChannelName, 4);
            } else if (!defaultNotificationChannelName.equals(notificationChannel.getName())) {
                notificationChannel.setName(defaultNotificationChannelName);
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return zzb;
    }

    public static void zza(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
            return;
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    private final void zza(Context context, int i, String str, PendingIntent pendingIntent) {
        Notification notification;
        int i2;
        if (i == 18) {
            zza(context);
        } else if (pendingIntent != null) {
            String errorNotificationTitle = ConnectionErrorMessages.getErrorNotificationTitle(context, i);
            String errorNotificationMessage = ConnectionErrorMessages.getErrorNotificationMessage(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (DeviceProperties.isWearable(context)) {
                Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
                Notification.Builder style = new Notification.Builder(context).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(errorNotificationTitle).setStyle(new Notification.BigTextStyle().bigText(errorNotificationMessage));
                if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                    style.addAction(C104392R.C104393drawable.common_full_open_on_phone, resources.getString(C104392R.string.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
                if (PlatformVersion.isAtLeastO() && PlatformVersion.isAtLeastO()) {
                    style.setChannelId(zza(context, notificationManager));
                }
                notification = style.build();
            } else {
                C90116e.C90121c cVar = new C90116e.C90121c(context, (String) null);
                cVar.f258814z.icon = 17301642;
                cVar.mo124390o(resources.getString(C104392R.string.common_google_play_services_notification_ticker));
                cVar.f258814z.when = System.currentTimeMillis();
                cVar.mo124384i(16, true);
                cVar.f258795g = pendingIntent;
                cVar.mo124383h(errorNotificationTitle);
                cVar.mo124382g(errorNotificationMessage);
                cVar.f258805q = true;
                C90116e.C90117b bVar = new C90116e.C90117b();
                bVar.f258770b = C90116e.C90121c.m112748d(errorNotificationMessage);
                cVar.mo124389n(bVar);
                if (PlatformVersion.isAtLeastO() && PlatformVersion.isAtLeastO()) {
                    cVar.f258812x = zza(context, notificationManager);
                }
                notification = cVar.mo124378b();
            }
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                GooglePlayServicesUtilLight.zzbt.set(false);
            } else {
                i2 = 39789;
            }
            if (str == null) {
                notificationManager.notify(i2, notification);
            } else {
                notificationManager.notify(str, i2, notification);
            }
        }
    }

    private final String zzb() {
        String str;
        synchronized (mLock) {
            str = this.zzat;
        }
        return str;
    }

    public Task<Void> checkApiAvailability(GoogleApi<?> googleApi, GoogleApi<?>... googleApiArr) {
        return checkApiAvailabilityAndPackages(googleApi, googleApiArr).continueWith(new zza(this));
    }

    public Task<Map<zzh<?>, String>> checkApiAvailabilityAndPackages(GoogleApi<?> googleApi, GoogleApi<?>... googleApiArr) {
        Preconditions.checkNotNull(googleApi, "Requested API must not be null.");
        for (GoogleApi<?> checkNotNull : googleApiArr) {
            Preconditions.checkNotNull(checkNotNull, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(googleApiArr.length + 1);
        arrayList.add(googleApi);
        arrayList.addAll(Arrays.asList(googleApiArr));
        return GoogleApiManager.zzbf().zza((Iterable<? extends GoogleApi<?>>) arrayList);
    }

    public int getApkVersion(Context context) {
        return super.getApkVersion(context);
    }

    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2) {
        return getErrorDialog(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return zza((Context) activity, i, DialogRedirect.getInstance(activity, getErrorResolutionIntent(activity, i, "d"), i2), onCancelListener);
    }

    @Deprecated
    public Intent getErrorResolutionIntent(int i) {
        return super.getErrorResolutionIntent(i);
    }

    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2, String str) {
        return super.getErrorResolutionPendingIntent(context, i, i2, str);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    public int isGooglePlayServicesAvailable(Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        return super.isPlayServicesPossiblyUpdating(context, i);
    }

    public boolean isPlayStorePossiblyUpdating(Context context, int i) {
        return super.isPlayStorePossiblyUpdating(context, i);
    }

    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    public Task<Void> makeGooglePlayServicesAvailable(Activity activity) {
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity);
        if (isGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zzbt zzd = zzbt.zzd(activity);
        zzd.zzb(new ConnectionResult(isGooglePlayServicesAvailable, (PendingIntent) null), 0);
        return zzd.getTask();
    }

    public GooglePlayServicesUpdatedReceiver registerCallbackOnUpdate(Context context, GooglePlayServicesUpdatedReceiver.Callback callback) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        GooglePlayServicesUpdatedReceiver googlePlayServicesUpdatedReceiver = new GooglePlayServicesUpdatedReceiver(callback);
        context.registerReceiver(googlePlayServicesUpdatedReceiver, intentFilter);
        googlePlayServicesUpdatedReceiver.zzc(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return googlePlayServicesUpdatedReceiver;
        }
        callback.zzv();
        googlePlayServicesUpdatedReceiver.unregister();
        return null;
    }

    public void setDefaultNotificationChannelId(Context context, String str) {
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkNotNull(((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str));
        }
        synchronized (mLock) {
            this.zzat = str;
        }
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zza(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public boolean showErrorDialogFragment(Activity activity, LifecycleFragment lifecycleFragment, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zza2 = zza((Context) activity, i, DialogRedirect.getInstance(lifecycleFragment, getErrorResolutionIntent(activity, i, "d"), i2), onCancelListener);
        if (zza2 == null) {
            return false;
        }
        zza(activity, zza2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public void showErrorNotification(Context context, int i) {
        showErrorNotification(context, i, (String) null);
    }

    public void showErrorNotification(Context context, int i, String str) {
        zza(context, i, str, getErrorResolutionPendingIntent(context, i, 0, "n"));
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        zza(context, connectionResult.getErrorCode(), (String) null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    public Dialog showUpdatingDialog(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(ConnectionErrorMessages.getErrorMessage(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zza(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public boolean showWrappedErrorNotification(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult);
        if (errorResolutionPendingIntent == null) {
            return false;
        }
        zza(context, connectionResult.getErrorCode(), (String) null, GoogleApiActivity.zza(context, errorResolutionPendingIntent, i));
        return true;
    }

    public final void zza(Context context) {
        new zza(context).sendEmptyMessageDelayed(1, 120000);
    }
}
