package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.wrappers.Wrappers;

public final class UidVerifier {
    private UidVerifier() {
    }

    public static boolean isGooglePlayServicesUid(Context context, int i) {
        if (!uidHasPackageName(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return GoogleSignatureVerifier.getInstance(context).isGooglePublicSignedPackage(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    public static boolean uidHasPackageName(Context context, int i, String str) {
        return Wrappers.packageManager(context).uidHasPackageName(i, str);
    }
}
