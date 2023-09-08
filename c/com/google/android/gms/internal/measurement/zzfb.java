package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.iid.FirebaseInstanceId;
import java.math.BigInteger;
import java.util.Locale;

public final class zzfb extends zzhh {
    private String zzadm;
    private String zzadt;
    private long zzadx;
    private int zzaen;
    private int zzaie;
    private long zzaif;
    private String zztg;
    private String zzth;
    private String zzti;

    public zzfb(zzgl zzgl) {
        super(zzgl);
    }

    private final String zzgj() {
        zzab();
        if (zzgg().zzay(this.zzti) && !this.zzacw.isEnabled()) {
            return null;
        }
        try {
            FirebaseInstanceId.m155204a().mo169416h();
            return FirebaseInstanceId.m155205i();
        } catch (IllegalStateException unused) {
            zzge().zzip().log("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final String getGmpAppId() {
        zzch();
        return this.zzadm;
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final String zzah() {
        zzch();
        return this.zzti;
    }

    public final zzdz zzbi(String str) {
        zzab();
        String zzah = zzah();
        String gmpAppId = getGmpAppId();
        zzch();
        String str2 = this.zzth;
        long zzij = (long) zzij();
        zzch();
        String str3 = this.zzadt;
        zzch();
        zzab();
        if (this.zzaif == 0) {
            this.zzaif = this.zzacw.zzgb().zzd(getContext(), getContext().getPackageName());
        }
        long j = this.zzaif;
        boolean isEnabled = this.zzacw.isEnabled();
        boolean z = true;
        boolean z2 = !zzgf().zzakn;
        String zzgj = zzgj();
        zzch();
        long zzjt = this.zzacw.zzjt();
        int zzik = zzik();
        Boolean zzas = zzgg().zzas("google_analytics_adid_collection_enabled");
        boolean booleanValue = Boolean.valueOf(zzas == null || zzas.booleanValue()).booleanValue();
        Boolean zzas2 = zzgg().zzas("google_analytics_ssaid_collection_enabled");
        if (zzas2 != null && !zzas2.booleanValue()) {
            z = false;
        }
        return new zzdz(zzah, gmpAppId, str2, zzij, str3, 12451, j, str, isEnabled, z2, zzgj, 0, zzjt, zzik, booleanValue, Boolean.valueOf(z).booleanValue(), zzgf().zzje());
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
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

    public final boolean zzhf() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0144 A[Catch:{ IllegalStateException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0145 A[Catch:{ IllegalStateException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014a A[Catch:{ IllegalStateException -> 0x015c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzih() {
        /*
            r12 = this;
            android.content.Context r0 = r12.getContext()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r12.getContext()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002f
            com.google.android.gms.internal.measurement.zzfg r1 = r12.zzge()
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()
            java.lang.Object r7 = com.google.android.gms.internal.measurement.zzfg.zzbm(r0)
            java.lang.String r8 = "PackageManager is null, app identity information might be inaccurate. appId"
            r1.zzg(r8, r7)
        L_0x002c:
            r1 = r2
            goto L_0x0091
        L_0x002f:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0034 }
            goto L_0x0045
        L_0x0034:
            com.google.android.gms.internal.measurement.zzfg r7 = r12.zzge()
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzim()
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzfg.zzbm(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.zzg(r9, r8)
        L_0x0045:
            if (r5 != 0) goto L_0x004a
            java.lang.String r5 = "manual_install"
            goto L_0x0053
        L_0x004a:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0053
            r5 = r3
        L_0x0053:
            android.content.Context r7 = r12.getContext()     // Catch:{ NameNotFoundException -> 0x007c }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x007c }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x007c }
            if (r7 == 0) goto L_0x002c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x007c }
            java.lang.CharSequence r1 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x007c }
            boolean r8 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NameNotFoundException -> 0x007c }
            if (r8 != 0) goto L_0x0072
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x007c }
            goto L_0x0073
        L_0x0072:
            r1 = r2
        L_0x0073:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0078 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0078 }
            goto L_0x0091
        L_0x0078:
            r11 = r2
            r2 = r1
            r1 = r11
            goto L_0x007d
        L_0x007c:
            r1 = r2
        L_0x007d:
            com.google.android.gms.internal.measurement.zzfg r7 = r12.zzge()
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzim()
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzfg.zzbm(r0)
            java.lang.String r9 = "Error retrieving package info. appId, appName"
            r7.zze(r9, r8, r2)
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x0091:
            r12.zzti = r0
            r12.zzadt = r5
            r12.zzth = r2
            r12.zzaie = r6
            r12.zztg = r1
            r1 = 0
            r12.zzaif = r1
            android.content.Context r5 = r12.getContext()
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.internal.GoogleServices.initialize(r5)
            r6 = 1
            if (r5 == 0) goto L_0x00b2
            boolean r7 = r5.isSuccess()
            if (r7 == 0) goto L_0x00b2
            r7 = 1
            goto L_0x00b3
        L_0x00b2:
            r7 = 0
        L_0x00b3:
            if (r7 != 0) goto L_0x00de
            if (r5 != 0) goto L_0x00c5
            com.google.android.gms.internal.measurement.zzfg r5 = r12.zzge()
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzim()
            java.lang.String r8 = "GoogleService failed to initialize (no status)"
            r5.log(r8)
            goto L_0x00de
        L_0x00c5:
            com.google.android.gms.internal.measurement.zzfg r8 = r12.zzge()
            com.google.android.gms.internal.measurement.zzfi r8 = r8.zzim()
            int r9 = r5.getStatusCode()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r5 = r5.getStatusMessage()
            java.lang.String r10 = "GoogleService failed to initialize, status"
            r8.zze(r10, r9, r5)
        L_0x00de:
            if (r7 == 0) goto L_0x0136
            com.google.android.gms.internal.measurement.zzef r5 = r12.zzgg()
            java.lang.String r7 = "firebase_analytics_collection_enabled"
            java.lang.Boolean r5 = r5.zzas(r7)
            com.google.android.gms.internal.measurement.zzef r7 = r12.zzgg()
            boolean r7 = r7.zzhg()
            if (r7 == 0) goto L_0x0102
            com.google.android.gms.internal.measurement.zzfg r5 = r12.zzge()
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzir()
            java.lang.String r6 = "Collection disabled with firebase_analytics_collection_deactivated=1"
        L_0x00fe:
            r5.log(r6)
            goto L_0x0136
        L_0x0102:
            if (r5 == 0) goto L_0x0115
            boolean r7 = r5.booleanValue()
            if (r7 != 0) goto L_0x0115
            com.google.android.gms.internal.measurement.zzfg r5 = r12.zzge()
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzir()
            java.lang.String r6 = "Collection disabled with firebase_analytics_collection_enabled=0"
            goto L_0x00fe
        L_0x0115:
            if (r5 != 0) goto L_0x0128
            boolean r5 = com.google.android.gms.common.api.internal.GoogleServices.isMeasurementExplicitlyDisabled()
            if (r5 == 0) goto L_0x0128
            com.google.android.gms.internal.measurement.zzfg r5 = r12.zzge()
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzir()
            java.lang.String r6 = "Collection disabled with google_app_measurement_enable=0"
            goto L_0x00fe
        L_0x0128:
            com.google.android.gms.internal.measurement.zzfg r4 = r12.zzge()
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzit()
            java.lang.String r5 = "Collection enabled"
            r4.log(r5)
            r4 = 1
        L_0x0136:
            r12.zzadm = r3
            r12.zzadx = r1
            java.lang.String r1 = com.google.android.gms.common.api.internal.GoogleServices.getGoogleAppId()     // Catch:{ IllegalStateException -> 0x015c }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IllegalStateException -> 0x015c }
            if (r2 == 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r3 = r1
        L_0x0146:
            r12.zzadm = r3     // Catch:{ IllegalStateException -> 0x015c }
            if (r4 == 0) goto L_0x016e
            com.google.android.gms.internal.measurement.zzfg r1 = r12.zzge()     // Catch:{ IllegalStateException -> 0x015c }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzit()     // Catch:{ IllegalStateException -> 0x015c }
            java.lang.String r2 = "App package, google app id"
            java.lang.String r3 = r12.zzti     // Catch:{ IllegalStateException -> 0x015c }
            java.lang.String r4 = r12.zzadm     // Catch:{ IllegalStateException -> 0x015c }
            r1.zze(r2, r3, r4)     // Catch:{ IllegalStateException -> 0x015c }
            goto L_0x016e
        L_0x015c:
            r1 = move-exception
            com.google.android.gms.internal.measurement.zzfg r2 = r12.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzim()
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzfg.zzbm(r0)
            java.lang.String r3 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId"
            r2.zze(r3, r0, r1)
        L_0x016e:
            android.content.Context r0 = r12.getContext()
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r0)
            r12.zzaen = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfb.zzih():void");
    }

    public final String zzii() {
        byte[] bArr = new byte[16];
        zzgb().zzlc().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final int zzij() {
        zzch();
        return this.zzaie;
    }

    public final int zzik() {
        zzch();
        return this.zzaen;
    }
}
