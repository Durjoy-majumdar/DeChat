package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Method;

public class ProviderInstaller {
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final Object sLock = new Object();
    /* access modifiers changed from: private */
    public static final GoogleApiAvailabilityLight zzacw = GoogleApiAvailabilityLight.getInstance();
    private static Method zzacx = null;

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, Intent intent);

        void onProviderInstalled();
    }

    public static void installIfNeeded(Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        zzacw.verifyGooglePlayServicesIsAvailable(context, 11925000);
        try {
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                synchronized (sLock) {
                    try {
                        if (zzacx == null) {
                            zzacx = remoteContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
                        }
                        zzacx.invoke((Object) null, new Object[]{remoteContext});
                    } catch (Exception e) {
                        Throwable cause = e.getCause();
                        if (Log.isLoggable("ProviderInstaller", 6)) {
                            String valueOf = String.valueOf(cause == null ? e.getMessage() : cause.getMessage());
                            if (valueOf.length() != 0) {
                                "Failed to install provider: ".concat(valueOf);
                            }
                        }
                        throw new GooglePlayServicesNotAvailableException(8);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            Log.isLoggable("ProviderInstaller", 6);
            throw new GooglePlayServicesNotAvailableException(8);
        } catch (Resources.NotFoundException unused) {
            Log.isLoggable("ProviderInstaller", 6);
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }

    public static void installIfNeededAsync(Context context, ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new zza(context, providerInstallListener).execute(new Void[0]);
    }
}
