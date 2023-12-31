package com.google.android.gms.common.wrappers;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.PlatformVersion;
import p329d3.C58104c;
import p385u2.C118562b;

public class PackageManagerWrapper {
    private final Context zzjp;

    public PackageManagerWrapper(Context context) {
        this.zzjp = context;
    }

    public boolean allowApiAccess(String str, int i) {
        return true;
    }

    public void checkCallerIsNotInstantApp() {
        if (isCallerInstantApp()) {
            throw new SecurityException("This operation is not supported for instant apps.");
        }
    }

    public int checkCallingOrSelfPermission(String str) {
        return this.zzjp.checkCallingOrSelfPermission(str);
    }

    public int checkCallingOrSelfPermissionAndAppOps(String str) {
        return C118562b.m167229a(this.zzjp, str);
    }

    public int checkCallingPermission(String str) {
        return this.zzjp.checkCallingPermission(str);
    }

    @Deprecated
    public int checkCallingPermission(String str, String str2) {
        return checkPermission(str, str2);
    }

    public int checkCallingPermissionAndAppOps(String str, String str2) {
        Context context = this.zzjp;
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return C118562b.m167230b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public void checkPackage(int i, String str) {
        if (!uidHasPackageName(i, str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
            sb.append("Package ");
            sb.append(str);
            sb.append(" does not belong to ");
            sb.append(i);
            throw new SecurityException(sb.toString());
        }
    }

    public int checkPermission(String str, int i, int i2) {
        return this.zzjp.checkPermission(str, i, i2);
    }

    @Deprecated
    public int checkPermission(String str, int i, int i2, String str2) {
        return checkPermission(str, i, i2);
    }

    public int checkPermission(String str, String str2) {
        return this.zzjp.getPackageManager().checkPermission(str, str2);
    }

    public int checkPermissionAndAppOps(String str, int i, int i2, String str2) {
        return C118562b.m167230b(this.zzjp, str, i, i2, str2);
    }

    public ApplicationInfo getApplicationInfo(String str, int i) {
        return this.zzjp.getPackageManager().getApplicationInfo(str, i);
    }

    public CharSequence getApplicationLabel(String str) {
        return this.zzjp.getPackageManager().getApplicationLabel(this.zzjp.getPackageManager().getApplicationInfo(str, 0));
    }

    public C58104c<CharSequence, Drawable> getApplicationLabelAndIcon(String str) {
        ApplicationInfo applicationInfo = this.zzjp.getPackageManager().getApplicationInfo(str, 0);
        return new C58104c<>(this.zzjp.getPackageManager().getApplicationLabel(applicationInfo), this.zzjp.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public ComponentName getCallingActivity(Activity activity) {
        return activity.getCallingActivity();
    }

    public String getCallingPackage(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return null;
        }
        String packageName = callingActivity.getPackageName();
        if (packageName != null) {
            return packageName;
        }
        new StringBuilder(String.valueOf(callingActivity).length() + 54);
        return null;
    }

    public Context getContext() {
        return this.zzjp;
    }

    public PackageInfo getPackageInfo(String str, int i) {
        return this.zzjp.getPackageManager().getPackageInfo(str, i);
    }

    public String[] getPackagesForUid(int i) {
        return this.zzjp.getPackageManager().getPackagesForUid(i);
    }

    public boolean isCallerInstantApp() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zzjp);
        }
        if (!PlatformVersion.isAtLeastO() || (nameForUid = this.zzjp.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.zzjp.getPackageManager().isInstantApp(nameForUid);
    }

    public boolean isInstantAppUid(int i) {
        return false;
    }

    public boolean uidHasPackageName(int i, String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            try {
                ((AppOpsManager) this.zzjp.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.zzjp.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
