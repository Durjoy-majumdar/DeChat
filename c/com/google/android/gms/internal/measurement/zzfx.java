package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

public final class zzfx {
    /* access modifiers changed from: private */
    public final zzgl zzacw;
    public volatile zzr zzakw;
    private ServiceConnection zzakx;

    public zzfx(zzgl zzgl) {
        this.zzacw = zzgl;
    }

    private final boolean zzji() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.zzacw.getContext());
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.zzacw.zzge().zzir().log("Failed to retrieve Package Manager to check Play Store compatibility");
            return false;
        } catch (Exception e) {
            this.zzacw.zzge().zzir().zzg("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    public final void zzc(Bundle bundle) {
        zzfi zzim;
        String str;
        this.zzacw.zzab();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                zzim = this.zzacw.zzge().zzim();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzim = this.zzacw.zzge().zzim();
                    str = "No referrer defined in install referrer response";
                } else {
                    this.zzacw.zzge().zzit().zzg("InstallReferrer API result", string);
                    Bundle zza = this.zzacw.zzgb().zza(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (zza == null) {
                        zzim = this.zzacw.zzge().zzim();
                        str = "No campaign params defined in install referrer result";
                    } else {
                        String string2 = zza.getString(FirebaseAnalytics.C113379b.MEDIUM);
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                zzim = this.zzacw.zzge().zzim();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                zza.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == this.zzacw.zzgf().zzaka.get()) {
                            zzim = this.zzacw.zzge().zzit();
                            str = "Campaign has already been logged";
                        } else {
                            zza.putString("_cis", "referrer API");
                            this.zzacw.zzgf().zzaka.set(j);
                            this.zzacw.zzfu().logEvent("auto", "_cmp", zza);
                            if (this.zzakx != null) {
                                ConnectionTracker.getInstance().unbindService(this.zzacw.getContext(), this.zzakx);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            zzim.log(str);
        }
    }

    public final void zzjh() {
        this.zzacw.zzab();
        if (!zzji()) {
            this.zzacw.zzge().zzir().log("Install Referrer Reporter is not available");
            this.zzakx = null;
            return;
        }
        this.zzakx = new zzfz(this);
        this.zzacw.zzge().zzir().log("Install Referrer Reporter is initializing");
        this.zzacw.zzab();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.zzacw.getContext().getPackageManager();
        if (packageManager == null) {
            this.zzacw.zzge().zzip().log("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.zzacw.zzge().zzir().log("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str = serviceInfo.packageName;
            if (serviceInfo.name == null || this.zzakx == null || !"com.android.vending".equals(str) || !zzji()) {
                this.zzacw.zzge().zzir().log("Play Store missing or incompatible. Version 8.3.73 or later required");
                return;
            }
            try {
                this.zzacw.zzge().zzir().zzg("Install Referrer Service is", ConnectionTracker.getInstance().bindService(this.zzacw.getContext(), new Intent(intent), this.zzakx, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.zzacw.zzge().zzim().zzg("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }

    public final Bundle zzjj() {
        this.zzacw.zzab();
        if (this.zzakw == null) {
            this.zzacw.zzge().zzip().log("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.zzacw.getContext().getPackageName());
        try {
            Bundle zza = this.zzakw.zza(bundle);
            if (zza != null) {
                return zza;
            }
            this.zzacw.zzge().zzim().log("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.zzacw.zzge().zzim().zzg("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
