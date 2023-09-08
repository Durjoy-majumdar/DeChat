package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;

public final class zzef extends zzhg {
    private zzeh zzaet = zzeg.zzaeu;
    private Boolean zzxz;

    public zzef(zzgl zzgl) {
        super(zzgl);
    }

    public static long zzhh() {
        return zzew.zzahl.get().longValue();
    }

    public static long zzhi() {
        return zzew.zzagl.get().longValue();
    }

    public static boolean zzhk() {
        return zzew.zzagh.get().booleanValue();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final long zza(String str, zzex<Long> zzex) {
        if (str != null) {
            String zze = this.zzaet.zze(str, zzex.getKey());
            if (!TextUtils.isEmpty(zze)) {
                try {
                    return zzex.get(Long.valueOf(Long.parseLong(zze))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return zzex.get().longValue();
    }

    public final void zza(zzeh zzeh) {
        this.zzaet = zzeh;
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final int zzar(String str) {
        return zzb(str, zzew.zzagw);
    }

    public final Boolean zzas(String str) {
        Preconditions.checkNotEmpty(str);
        try {
            if (getContext().getPackageManager() == null) {
                zzge().zzim().log("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(getContext()).getApplicationInfo(getContext().getPackageName(), 128);
            if (applicationInfo == null) {
                zzge().zzim().log("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                zzge().zzim().log("Failed to load metadata: Metadata bundle is null");
                return null;
            } else if (!bundle.containsKey(str)) {
                return null;
            } else {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
            }
        } catch (PackageManager.NameNotFoundException e) {
            zzge().zzim().zzg("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final boolean zzat(String str) {
        return "1".equals(this.zzaet.zze(str, "gaia_collection_enabled"));
    }

    public final boolean zzau(String str) {
        return "1".equals(this.zzaet.zze(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzav(String str) {
        return zzd(str, zzew.zzahu);
    }

    public final boolean zzaw(String str) {
        return zzd(str, zzew.zzahw);
    }

    public final boolean zzax(String str) {
        return zzd(str, zzew.zzahx);
    }

    public final boolean zzay(String str) {
        return zzd(str, zzew.zzahy);
    }

    public final boolean zzaz(String str) {
        return zzd(str, zzew.zzahz);
    }

    public final int zzb(String str, zzex<Integer> zzex) {
        if (str != null) {
            String zze = this.zzaet.zze(str, zzex.getKey());
            if (!TextUtils.isEmpty(zze)) {
                try {
                    return zzex.get(Integer.valueOf(Integer.parseInt(zze))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return zzex.get().intValue();
    }

    public final boolean zzba(String str) {
        return zzd(str, zzew.zzaic);
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    public final double zzc(String str, zzex<Double> zzex) {
        if (str != null) {
            String zze = this.zzaet.zze(str, zzex.getKey());
            if (!TextUtils.isEmpty(zze)) {
                try {
                    return zzex.get(Double.valueOf(Double.parseDouble(zze))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return zzex.get().doubleValue();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.measurement.zzex, com.google.android.gms.internal.measurement.zzex<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzd(java.lang.String r3, com.google.android.gms.internal.measurement.zzex<java.lang.Boolean> r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000d
        L_0x0002:
            java.lang.Object r3 = r4.get()
        L_0x0006:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L_0x000d:
            com.google.android.gms.internal.measurement.zzeh r0 = r2.zzaet
            java.lang.String r1 = r4.getKey()
            java.lang.String r3 = r0.zze(r3, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x001e
            goto L_0x0002
        L_0x001e:
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r3 = r4.get(r3)
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzef.zzd(java.lang.String, com.google.android.gms.internal.measurement.zzex):boolean");
    }

    public final boolean zzds() {
        if (this.zzxz == null) {
            synchronized (this) {
                if (this.zzxz == null) {
                    ApplicationInfo applicationInfo = getContext().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.zzxz = Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if (this.zzxz == null) {
                        this.zzxz = Boolean.TRUE;
                        zzge().zzim().log("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzxz.booleanValue();
    }

    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    public final /* bridge */ /* synthetic */ void zzfs() {
        super.zzfs();
    }

    public final /* bridge */ /* synthetic */ zzdu zzft() {
        return super.zzft();
    }

    public final /* bridge */ /* synthetic */ zzhk zzfu() {
        return super.zzfu();
    }

    public final /* bridge */ /* synthetic */ zzfb zzfv() {
        return super.zzfv();
    }

    public final /* bridge */ /* synthetic */ zzeo zzfw() {
        return super.zzfw();
    }

    public final /* bridge */ /* synthetic */ zzii zzfx() {
        return super.zzfx();
    }

    public final /* bridge */ /* synthetic */ zzif zzfy() {
        return super.zzfy();
    }

    public final /* bridge */ /* synthetic */ zzfc zzfz() {
        return super.zzfz();
    }

    public final /* bridge */ /* synthetic */ zzfe zzga() {
        return super.zzga();
    }

    public final /* bridge */ /* synthetic */ zzka zzgb() {
        return super.zzgb();
    }

    public final /* bridge */ /* synthetic */ zzjh zzgc() {
        return super.zzgc();
    }

    public final /* bridge */ /* synthetic */ zzgg zzgd() {
        return super.zzgd();
    }

    public final /* bridge */ /* synthetic */ zzfg zzge() {
        return super.zzge();
    }

    public final /* bridge */ /* synthetic */ zzfr zzgf() {
        return super.zzgf();
    }

    public final /* bridge */ /* synthetic */ zzef zzgg() {
        return super.zzgg();
    }

    public final boolean zzhg() {
        Boolean zzas = zzas("firebase_analytics_collection_deactivated");
        return zzas != null && zzas.booleanValue();
    }

    public final String zzhj() {
        String str;
        zzfi zzfi;
        Class<String> cls = String.class;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{"debug.firebase.analytics.app", ""});
        } catch (ClassNotFoundException e) {
            e = e;
            zzfi = zzge().zzim();
            str = "Could not find SystemProperties class";
            zzfi.zzg(str, e);
            return "";
        } catch (NoSuchMethodException e2) {
            e = e2;
            zzfi = zzge().zzim();
            str = "Could not find SystemProperties.get() method";
            zzfi.zzg(str, e);
            return "";
        } catch (IllegalAccessException e3) {
            e = e3;
            zzfi = zzge().zzim();
            str = "Could not access SystemProperties.get()";
            zzfi.zzg(str, e);
            return "";
        } catch (InvocationTargetException e4) {
            e = e4;
            zzfi = zzge().zzim();
            str = "SystemProperties.get() threw an exception";
            zzfi.zzg(str, e);
            return "";
        }
    }

    public final boolean zzhl() {
        return zzd(zzfv().zzah(), zzew.zzahp);
    }

    public final String zzhm() {
        String zzah = zzfv().zzah();
        zzex zzex = zzew.zzahq;
        return (String) (zzah == null ? zzex.get() : zzex.get(this.zzaet.zze(zzah, zzex.getKey())));
    }
}
