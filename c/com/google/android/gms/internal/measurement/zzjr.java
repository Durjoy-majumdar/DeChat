package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.eclipsesource.mmv8.Platform;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tencent.tmassistantsdk.downloadservice.Downloads;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p1042u.C111055b;

public class zzjr implements zzec {
    private zzgl zzacw;
    public zzgf zzaqa;
    public zzfk zzaqb;
    private zzei zzaqc;
    private zzfp zzaqd;
    private zzjn zzaqe;
    private zzeb zzaqf;
    private boolean zzaqg;
    private long zzaqh;
    private List<Runnable> zzaqi;
    private int zzaqj;
    private int zzaqk;
    private boolean zzaql;
    private boolean zzaqm;
    private boolean zzaqn;
    private FileLock zzaqo;
    private FileChannel zzaqp;
    private List<Long> zzaqq;
    private List<Long> zzaqr;
    public long zzaqs;
    private boolean zzvo = false;

    private final int zza(FileChannel fileChannel) {
        zzab();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzge().zzim().log("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    zzge().zzip().zzg("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e) {
            zzge().zzim().zzg("Failed to read from channel", e);
            return 0;
        }
    }

    private final zzdz zza(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j) {
        String str3;
        String str4;
        int i;
        String str5 = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            zzge().zzim().log("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str3 = packageManager.getInstallerPackageName(str5);
        } catch (IllegalArgumentException unused) {
            zzge().zzim().zzg("Error retrieving installer package name. appId", zzfg.zzbm(str));
            str3 = "Unknown";
        }
        if (str3 == null) {
            str3 = "manual_install";
        } else if ("com.android.vending".equals(str3)) {
            str3 = "";
        }
        String str6 = str3;
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str5, 0);
            if (packageInfo != null) {
                CharSequence applicationLabel = Wrappers.packageManager(context).getApplicationLabel(str5);
                if (!TextUtils.isEmpty(applicationLabel)) {
                    String charSequence = applicationLabel.toString();
                }
                String str7 = packageInfo.versionName;
                i = packageInfo.versionCode;
                str4 = str7;
            } else {
                i = Integer.MIN_VALUE;
                str4 = "Unknown";
            }
            return new zzdz(str, str2, str4, (long) i, str6, 12451, zzgb().zzd(context, str5), (String) null, z, false, "", 0, zzgg().zzba(str5) ? j : 0, 0, z2, z3, false);
        } catch (PackageManager.NameNotFoundException unused2) {
            zzge().zzim().zze("Error retrieving newly installed package info. appId, appName", zzfg.zzbm(str), "Unknown");
            return null;
        }
    }

    private static void zza(zzjq zzjq) {
        if (zzjq == null) {
            throw new IllegalStateException("Upload component not created");
        } else if (!zzjq.isInitialized()) {
            String valueOf = String.valueOf(zzjq.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private final boolean zza(int i, FileChannel fileChannel) {
        zzab();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzge().zzim().log("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                zzge().zzim().zzg("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            zzge().zzim().zzg("Failed to write to channel", e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zza(java.lang.String r14, com.google.android.gms.internal.measurement.zzeu r15) {
        /*
            r13 = this;
            com.google.android.gms.internal.measurement.zzer r0 = r15.zzafq
            java.lang.String r1 = "currency"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = r15.name
            java.lang.String r2 = "ecommerce_purchase"
            boolean r1 = r2.equals(r1)
            r2 = 0
            java.lang.String r3 = "value"
            if (r1 == 0) goto L_0x0060
            com.google.android.gms.internal.measurement.zzer r1 = r15.zzafq
            java.lang.Double r1 = r1.zzbh(r3)
            double r4 = r1.doubleValue()
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 * r6
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0039
            com.google.android.gms.internal.measurement.zzer r1 = r15.zzafq
            java.lang.Long r1 = r1.getLong(r3)
            long r3 = r1.longValue()
            double r3 = (double) r3
            double r4 = r3 * r6
        L_0x0039:
            r6 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x004a
            r6 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x004a
            long r3 = java.lang.Math.round(r4)
            goto L_0x006a
        L_0x004a:
            com.google.android.gms.internal.measurement.zzfg r15 = r13.zzge()
            com.google.android.gms.internal.measurement.zzfi r15 = r15.zzip()
            java.lang.Object r14 = com.google.android.gms.internal.measurement.zzfg.zzbm(r14)
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            java.lang.String r1 = "Data lost. Currency value is too big. appId"
            r15.zze(r1, r14, r0)
            return r2
        L_0x0060:
            com.google.android.gms.internal.measurement.zzer r1 = r15.zzafq
            java.lang.Long r1 = r1.getLong(r3)
            long r3 = r1.longValue()
        L_0x006a:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r5 = 1
            if (r1 != 0) goto L_0x014b
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "[A-Z]{3}"
            boolean r1 = r0.matches(r1)
            if (r1 == 0) goto L_0x014b
            java.lang.String r1 = "_ltv_"
            int r6 = r0.length()
            if (r6 == 0) goto L_0x008c
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0091
        L_0x008c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0091:
            r9 = r0
            com.google.android.gms.internal.measurement.zzei r0 = r13.zzix()
            com.google.android.gms.internal.measurement.zzjz r0 = r0.zzh(r14, r9)
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r0.value
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 != 0) goto L_0x00a3
            goto L_0x00c0
        L_0x00a3:
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            com.google.android.gms.internal.measurement.zzjz r2 = new com.google.android.gms.internal.measurement.zzjz
            java.lang.String r8 = r15.origin
            com.google.android.gms.common.util.Clock r15 = r13.zzbt()
            long r10 = r15.currentTimeMillis()
            long r0 = r0 + r3
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            r6 = r2
            r7 = r14
            r6.<init>(r7, r8, r9, r10, r12)
            goto L_0x0117
        L_0x00c0:
            com.google.android.gms.internal.measurement.zzei r0 = r13.zzix()
            com.google.android.gms.internal.measurement.zzef r1 = r13.zzgg()
            com.google.android.gms.internal.measurement.zzex<java.lang.Integer> r6 = com.google.android.gms.internal.measurement.zzew.zzahm
            int r1 = r1.zzb(r14, r6)
            int r1 = r1 - r5
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            r0.zzab()
            r0.zzch()
            android.database.sqlite.SQLiteDatabase r6 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r7 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x00f0 }
            r8[r2] = r14     // Catch:{ SQLiteException -> 0x00f0 }
            r8[r5] = r14     // Catch:{ SQLiteException -> 0x00f0 }
            r2 = 2
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            r8[r2] = r1     // Catch:{ SQLiteException -> 0x00f0 }
            r6.execSQL(r7, r8)     // Catch:{ SQLiteException -> 0x00f0 }
            goto L_0x0102
        L_0x00f0:
            r1 = move-exception
            com.google.android.gms.internal.measurement.zzfg r0 = r0.zzge()
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()
            java.lang.Object r2 = com.google.android.gms.internal.measurement.zzfg.zzbm(r14)
            java.lang.String r6 = "Error pruning currencies. appId"
            r0.zze(r6, r2, r1)
        L_0x0102:
            com.google.android.gms.internal.measurement.zzjz r2 = new com.google.android.gms.internal.measurement.zzjz
            java.lang.String r8 = r15.origin
            com.google.android.gms.common.util.Clock r15 = r13.zzbt()
            long r10 = r15.currentTimeMillis()
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r6 = r2
            r7 = r14
            r6.<init>(r7, r8, r9, r10, r12)
        L_0x0117:
            com.google.android.gms.internal.measurement.zzei r15 = r13.zzix()
            boolean r15 = r15.zza((com.google.android.gms.internal.measurement.zzjz) r2)
            if (r15 != 0) goto L_0x014b
            com.google.android.gms.internal.measurement.zzfg r15 = r13.zzge()
            com.google.android.gms.internal.measurement.zzfi r15 = r15.zzim()
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzfg.zzbm(r14)
            com.google.android.gms.internal.measurement.zzfe r1 = r13.zzga()
            java.lang.String r3 = r2.name
            java.lang.String r1 = r1.zzbl(r3)
            java.lang.Object r2 = r2.value
            java.lang.String r3 = "Too many unique user properties are set. Ignoring user property. appId"
            r15.zzd(r3, r0, r1, r2)
            com.google.android.gms.internal.measurement.zzka r6 = r13.zzgb()
            r8 = 9
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r14
            r6.zza((java.lang.String) r7, (int) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11)
        L_0x014b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zza(java.lang.String, com.google.android.gms.internal.measurement.zzeu):boolean");
    }

    private final zzkm[] zza(String str, zzks[] zzksArr, zzkn[] zzknArr) {
        Preconditions.checkNotEmpty(str);
        return zziw().zza(str, zzknArr, zzksArr);
    }

    private final void zzb(zzdy zzdy) {
        C111055b bVar;
        zzab();
        if (TextUtils.isEmpty(zzdy.getGmpAppId())) {
            zzb(zzdy.zzah(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String gmpAppId = zzdy.getGmpAppId();
        String appInstanceId = zzdy.getAppInstanceId();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder encodedAuthority = builder.scheme(zzew.zzagm.get()).encodedAuthority(zzew.zzagn.get());
        String valueOf = String.valueOf(gmpAppId);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", appInstanceId).appendQueryParameter("platform", Platform.ANDROID).appendQueryParameter("gmp_version", "12451");
        String uri = builder.build().toString();
        try {
            URL url = new URL(uri);
            zzge().zzit().zzg("Fetching remote configuration", zzdy.zzah());
            zzkk zzbu = zzkm().zzbu(zzdy.zzah());
            String zzbv = zzkm().zzbv(zzdy.zzah());
            if (zzbu == null || TextUtils.isEmpty(zzbv)) {
                bVar = null;
            } else {
                C111055b bVar2 = new C111055b();
                bVar2.put("If-Modified-Since", zzbv);
                bVar = bVar2;
            }
            this.zzaql = true;
            zzfk zzkn = zzkn();
            String zzah = zzdy.zzah();
            zzjt zzjt = new zzjt(this);
            zzkn.zzab();
            zzkn.zzch();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzjt);
            zzkn.zzgd().zzd((Runnable) new zzfo(zzkn, zzah, url, (byte[]) null, bVar, zzjt));
        } catch (MalformedURLException unused) {
            zzge().zzim().zze("Failed to parse config URL. Not fetching. appId", zzfg.zzbm(zzdy.zzah()), uri);
        }
    }

    private final Boolean zzc(zzdy zzdy) {
        try {
            if (zzdy.zzgm() != -2147483648L) {
                if (zzdy.zzgm() == ((long) Wrappers.packageManager(getContext()).getPackageInfo(zzdy.zzah(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(getContext()).getPackageInfo(zzdy.zzah(), 0).versionName;
                if (zzdy.zzag() != null && zzdy.zzag().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0564, code lost:
        r14 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzc(com.google.android.gms.internal.measurement.zzeu r26, com.google.android.gms.internal.measurement.zzdz r27) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = r27
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r27)
            java.lang.String r3 = r2.packageName
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            long r3 = java.lang.System.nanoTime()
            r25.zzab()
            r25.zzkq()
            java.lang.String r15 = r2.packageName
            r25.zzgb()
            boolean r5 = com.google.android.gms.internal.measurement.zzka.zzd((com.google.android.gms.internal.measurement.zzeu) r26, (com.google.android.gms.internal.measurement.zzdz) r27)
            if (r5 != 0) goto L_0x0024
            return
        L_0x0024:
            boolean r5 = r2.zzadw
            if (r5 != 0) goto L_0x002c
            r1.zzg((com.google.android.gms.internal.measurement.zzdz) r2)
            return
        L_0x002c:
            com.google.android.gms.internal.measurement.zzgf r5 = r25.zzkm()
            java.lang.String r6 = r0.name
            boolean r5 = r5.zzn(r15, r6)
            java.lang.String r6 = "_err"
            r19 = 1
            if (r5 == 0) goto L_0x00ce
            com.google.android.gms.internal.measurement.zzfg r2 = r25.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfg.zzbm(r15)
            com.google.android.gms.internal.measurement.zzfe r4 = r25.zzga()
            java.lang.String r5 = r0.name
            java.lang.String r4 = r4.zzbj(r5)
            java.lang.String r5 = "Dropping blacklisted event. appId"
            r2.zze(r5, r3, r4)
            com.google.android.gms.internal.measurement.zzgf r2 = r25.zzkm()
            boolean r2 = r2.zzby(r15)
            if (r2 != 0) goto L_0x006e
            com.google.android.gms.internal.measurement.zzgf r2 = r25.zzkm()
            boolean r2 = r2.zzbz(r15)
            if (r2 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r14 = 0
            goto L_0x006f
        L_0x006e:
            r14 = 1
        L_0x006f:
            if (r14 != 0) goto L_0x0088
            java.lang.String r2 = r0.name
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0088
            com.google.android.gms.internal.measurement.zzka r5 = r25.zzgb()
            r7 = 11
            java.lang.String r9 = r0.name
            r10 = 0
            java.lang.String r8 = "_ev"
            r6 = r15
            r5.zza((java.lang.String) r6, (int) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10)
        L_0x0088:
            if (r14 == 0) goto L_0x00cd
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()
            com.google.android.gms.internal.measurement.zzdy r0 = r0.zzbc(r15)
            if (r0 == 0) goto L_0x00cd
            long r2 = r0.zzgs()
            long r4 = r0.zzgr()
            long r2 = java.lang.Math.max(r2, r4)
            com.google.android.gms.common.util.Clock r4 = r25.zzbt()
            long r4 = r4.currentTimeMillis()
            long r4 = r4 - r2
            long r2 = java.lang.Math.abs(r4)
            com.google.android.gms.internal.measurement.zzex<java.lang.Long> r4 = com.google.android.gms.internal.measurement.zzew.zzahh
            java.lang.Object r4 = r4.get()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cd
            com.google.android.gms.internal.measurement.zzfg r2 = r25.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzis()
            java.lang.String r3 = "Fetching config for blacklisted app"
            r2.log(r3)
            r1.zzb((com.google.android.gms.internal.measurement.zzdy) r0)
        L_0x00cd:
            return
        L_0x00ce:
            com.google.android.gms.internal.measurement.zzfg r5 = r25.zzge()
            r13 = 2
            boolean r5 = r5.isLoggable(r13)
            if (r5 == 0) goto L_0x00ee
            com.google.android.gms.internal.measurement.zzfg r5 = r25.zzge()
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzit()
            com.google.android.gms.internal.measurement.zzfe r7 = r25.zzga()
            java.lang.String r7 = r7.zzb((com.google.android.gms.internal.measurement.zzeu) r0)
            java.lang.String r8 = "Logging event"
            r5.zzg(r8, r7)
        L_0x00ee:
            com.google.android.gms.internal.measurement.zzei r5 = r25.zzix()
            r5.beginTransaction()
            r1.zzg((com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x060b }
            java.lang.String r5 = "_iap"
            java.lang.String r7 = r0.name     // Catch:{ all -> 0x060b }
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x060b }
            if (r5 != 0) goto L_0x010c
            java.lang.String r5 = "ecommerce_purchase"
            java.lang.String r7 = r0.name     // Catch:{ all -> 0x060b }
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x060b }
            if (r5 == 0) goto L_0x0121
        L_0x010c:
            boolean r5 = r1.zza((java.lang.String) r15, (com.google.android.gms.internal.measurement.zzeu) r0)     // Catch:{ all -> 0x060b }
            if (r5 != 0) goto L_0x0121
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()     // Catch:{ all -> 0x060b }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()
            r0.endTransaction()
            return
        L_0x0121:
            java.lang.String r5 = r0.name     // Catch:{ all -> 0x060b }
            boolean r16 = com.google.android.gms.internal.measurement.zzka.zzcc(r5)     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r0.name     // Catch:{ all -> 0x060b }
            boolean r17 = r6.equals(r5)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzei r5 = r25.zzix()     // Catch:{ all -> 0x060b }
            long r6 = r25.zzkr()     // Catch:{ all -> 0x060b }
            r9 = 1
            r11 = 0
            r18 = 0
            r8 = r15
            r10 = r16
            r12 = r17
            r13 = r18
            com.google.android.gms.internal.measurement.zzej r5 = r5.zza(r6, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x060b }
            long r6 = r5.zzafe     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzex<java.lang.Integer> r8 = com.google.android.gms.internal.measurement.zzew.zzags     // Catch:{ all -> 0x060b }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x060b }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x060b }
            int r8 = r8.intValue()     // Catch:{ all -> 0x060b }
            long r8 = (long) r8     // Catch:{ all -> 0x060b }
            long r6 = r6 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            r10 = 1
            r12 = 0
            int r18 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r18 <= 0) goto L_0x0189
            long r6 = r6 % r8
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x017a
            com.google.android.gms.internal.measurement.zzfg r0 = r25.zzge()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ all -> 0x060b }
            java.lang.String r2 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfg.zzbm(r15)     // Catch:{ all -> 0x060b }
            long r4 = r5.zzafe     // Catch:{ all -> 0x060b }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x060b }
            r0.zze(r2, r3, r4)     // Catch:{ all -> 0x060b }
        L_0x017a:
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()     // Catch:{ all -> 0x060b }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()
            r0.endTransaction()
            return
        L_0x0189:
            if (r16 == 0) goto L_0x01db
            long r6 = r5.zzafd     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzex<java.lang.Integer> r18 = com.google.android.gms.internal.measurement.zzew.zzagu     // Catch:{ all -> 0x060b }
            java.lang.Object r18 = r18.get()     // Catch:{ all -> 0x060b }
            java.lang.Integer r18 = (java.lang.Integer) r18     // Catch:{ all -> 0x060b }
            int r14 = r18.intValue()     // Catch:{ all -> 0x060b }
            long r10 = (long) r14     // Catch:{ all -> 0x060b }
            long r6 = r6 - r10
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x01db
            long r6 = r6 % r8
            r2 = 1
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x01bd
            com.google.android.gms.internal.measurement.zzfg r2 = r25.zzge()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzim()     // Catch:{ all -> 0x060b }
            java.lang.String r3 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzfg.zzbm(r15)     // Catch:{ all -> 0x060b }
            long r5 = r5.zzafd     // Catch:{ all -> 0x060b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x060b }
            r2.zze(r3, r4, r5)     // Catch:{ all -> 0x060b }
        L_0x01bd:
            com.google.android.gms.internal.measurement.zzka r5 = r25.zzgb()     // Catch:{ all -> 0x060b }
            r7 = 16
            java.lang.String r8 = "_ev"
            java.lang.String r9 = r0.name     // Catch:{ all -> 0x060b }
            r10 = 0
            r6 = r15
            r5.zza((java.lang.String) r6, (int) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()     // Catch:{ all -> 0x060b }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()
            r0.endTransaction()
            return
        L_0x01db:
            if (r17 == 0) goto L_0x0229
            long r6 = r5.zzafg     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzef r8 = r25.zzgg()     // Catch:{ all -> 0x060b }
            java.lang.String r9 = r2.packageName     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzex<java.lang.Integer> r10 = com.google.android.gms.internal.measurement.zzew.zzagt     // Catch:{ all -> 0x060b }
            int r8 = r8.zzb(r9, r10)     // Catch:{ all -> 0x060b }
            r9 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = java.lang.Math.min(r9, r8)     // Catch:{ all -> 0x060b }
            r14 = 0
            int r8 = java.lang.Math.max(r14, r8)     // Catch:{ all -> 0x060b }
            long r8 = (long) r8     // Catch:{ all -> 0x060b }
            long r6 = r6 - r8
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x022a
            r8 = 1
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x021a
            com.google.android.gms.internal.measurement.zzfg r0 = r25.zzge()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ all -> 0x060b }
            java.lang.String r2 = "Too many error events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfg.zzbm(r15)     // Catch:{ all -> 0x060b }
            long r4 = r5.zzafg     // Catch:{ all -> 0x060b }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x060b }
            r0.zze(r2, r3, r4)     // Catch:{ all -> 0x060b }
        L_0x021a:
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()     // Catch:{ all -> 0x060b }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()
            r0.endTransaction()
            return
        L_0x0229:
            r14 = 0
        L_0x022a:
            com.google.android.gms.internal.measurement.zzer r5 = r0.zzafq     // Catch:{ all -> 0x060b }
            android.os.Bundle r10 = r5.zzif()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzka r5 = r25.zzgb()     // Catch:{ all -> 0x060b }
            java.lang.String r6 = "_o"
            java.lang.String r7 = r0.origin     // Catch:{ all -> 0x060b }
            r5.zza((android.os.Bundle) r10, (java.lang.String) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzka r5 = r25.zzgb()     // Catch:{ all -> 0x060b }
            boolean r5 = r5.zzcj(r15)     // Catch:{ all -> 0x060b }
            java.lang.String r11 = "_r"
            if (r5 == 0) goto L_0x0261
            com.google.android.gms.internal.measurement.zzka r5 = r25.zzgb()     // Catch:{ all -> 0x060b }
            java.lang.String r6 = "_dbg"
            r7 = 1
            java.lang.Long r9 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x060b }
            r5.zza((android.os.Bundle) r10, (java.lang.String) r6, (java.lang.Object) r9)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzka r5 = r25.zzgb()     // Catch:{ all -> 0x060b }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x060b }
            r5.zza((android.os.Bundle) r10, (java.lang.String) r11, (java.lang.Object) r6)     // Catch:{ all -> 0x060b }
        L_0x0261:
            com.google.android.gms.internal.measurement.zzei r5 = r25.zzix()     // Catch:{ all -> 0x060b }
            long r5 = r5.zzbd(r15)     // Catch:{ all -> 0x060b }
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0282
            com.google.android.gms.internal.measurement.zzfg r7 = r25.zzge()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzip()     // Catch:{ all -> 0x060b }
            java.lang.String r8 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzfg.zzbm(r15)     // Catch:{ all -> 0x060b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x060b }
            r7.zze(r8, r9, r5)     // Catch:{ all -> 0x060b }
        L_0x0282:
            com.google.android.gms.internal.measurement.zzep r9 = new com.google.android.gms.internal.measurement.zzep     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzgl r6 = r1.zzacw     // Catch:{ all -> 0x060b }
            java.lang.String r7 = r0.origin     // Catch:{ all -> 0x060b }
            java.lang.String r8 = r0.name     // Catch:{ all -> 0x060b }
            long r12 = r0.zzagb     // Catch:{ all -> 0x060b }
            r20 = 0
            r5 = r9
            r0 = r8
            r8 = r15
            r22 = r3
            r3 = r9
            r9 = r0
            r0 = r10
            r4 = r11
            r10 = r12
            r12 = r20
            r20 = 0
            r14 = r0
            r5.<init>((com.google.android.gms.internal.measurement.zzgl) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (long) r10, (long) r12, (android.os.Bundle) r14)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r3.name     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzeq r0 = r0.zzf(r15, r5)     // Catch:{ all -> 0x060b }
            if (r0 != 0) goto L_0x0313
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()     // Catch:{ all -> 0x060b }
            long r5 = r0.zzbg(r15)     // Catch:{ all -> 0x060b }
            r7 = 500(0x1f4, double:2.47E-321)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x02f2
            if (r16 == 0) goto L_0x02f2
            com.google.android.gms.internal.measurement.zzfg r0 = r25.zzge()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ all -> 0x060b }
            java.lang.String r2 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzfg.zzbm(r15)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfe r5 = r25.zzga()     // Catch:{ all -> 0x060b }
            java.lang.String r3 = r3.name     // Catch:{ all -> 0x060b }
            java.lang.String r3 = r5.zzbj(r3)     // Catch:{ all -> 0x060b }
            r5 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x060b }
            r0.zzd(r2, r4, r3, r5)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzka r5 = r25.zzgb()     // Catch:{ all -> 0x060b }
            r7 = 8
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r15
            r5.zza((java.lang.String) r6, (int) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()
            r0.endTransaction()
            return
        L_0x02f2:
            com.google.android.gms.internal.measurement.zzeq r0 = new com.google.android.gms.internal.measurement.zzeq     // Catch:{ all -> 0x060b }
            java.lang.String r7 = r3.name     // Catch:{ all -> 0x060b }
            r8 = 0
            r10 = 0
            long r12 = r3.timestamp     // Catch:{ all -> 0x060b }
            r16 = 0
            r18 = 0
            r21 = 0
            r24 = 0
            r5 = r0
            r6 = r15
            r14 = r16
            r16 = r18
            r17 = r21
            r18 = r24
            r5.<init>(r6, r7, r8, r10, r12, r14, r16, r17, r18)     // Catch:{ all -> 0x060b }
            r9 = r3
            goto L_0x0321
        L_0x0313:
            com.google.android.gms.internal.measurement.zzgl r5 = r1.zzacw     // Catch:{ all -> 0x060b }
            long r6 = r0.zzaft     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzep r9 = r3.zza(r5, r6)     // Catch:{ all -> 0x060b }
            long r5 = r9.timestamp     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzeq r0 = r0.zzac(r5)     // Catch:{ all -> 0x060b }
        L_0x0321:
            com.google.android.gms.internal.measurement.zzei r3 = r25.zzix()     // Catch:{ all -> 0x060b }
            r3.zza((com.google.android.gms.internal.measurement.zzeq) r0)     // Catch:{ all -> 0x060b }
            r25.zzab()     // Catch:{ all -> 0x060b }
            r25.zzkq()     // Catch:{ all -> 0x060b }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)     // Catch:{ all -> 0x060b }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r27)     // Catch:{ all -> 0x060b }
            java.lang.String r0 = r9.zzti     // Catch:{ all -> 0x060b }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)     // Catch:{ all -> 0x060b }
            java.lang.String r0 = r9.zzti     // Catch:{ all -> 0x060b }
            java.lang.String r3 = r2.packageName     // Catch:{ all -> 0x060b }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x060b }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzkq r3 = new com.google.android.gms.internal.measurement.zzkq     // Catch:{ all -> 0x060b }
            r3.<init>()     // Catch:{ all -> 0x060b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x060b }
            r3.zzath = r0     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "android"
            r3.zzatp = r0     // Catch:{ all -> 0x060b }
            java.lang.String r0 = r2.packageName     // Catch:{ all -> 0x060b }
            r3.zzti = r0     // Catch:{ all -> 0x060b }
            java.lang.String r0 = r2.zzadt     // Catch:{ all -> 0x060b }
            r3.zzadt = r0     // Catch:{ all -> 0x060b }
            java.lang.String r0 = r2.zzth     // Catch:{ all -> 0x060b }
            r3.zzth = r0     // Catch:{ all -> 0x060b }
            long r5 = r2.zzads     // Catch:{ all -> 0x060b }
            r7 = -2147483648(0xffffffff80000000, double:NaN)
            r0 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x036b
            r5 = r0
            goto L_0x0370
        L_0x036b:
            int r6 = (int) r5     // Catch:{ all -> 0x060b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x060b }
        L_0x0370:
            r3.zzaub = r5     // Catch:{ all -> 0x060b }
            long r5 = r2.zzadu     // Catch:{ all -> 0x060b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x060b }
            r3.zzatt = r5     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r2.zzadm     // Catch:{ all -> 0x060b }
            r3.zzadm = r5     // Catch:{ all -> 0x060b }
            long r5 = r2.zzadv     // Catch:{ all -> 0x060b }
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0388
            r5 = r0
            goto L_0x038c
        L_0x0388:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x060b }
        L_0x038c:
            r3.zzatx = r5     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfr r5 = r25.zzgf()     // Catch:{ all -> 0x060b }
            java.lang.String r6 = r2.packageName     // Catch:{ all -> 0x060b }
            android.util.Pair r5 = r5.zzbo(r6)     // Catch:{ all -> 0x060b }
            if (r5 == 0) goto L_0x03b5
            java.lang.Object r6 = r5.first     // Catch:{ all -> 0x060b }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x060b }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x060b }
            if (r6 != 0) goto L_0x03b5
            boolean r6 = r2.zzady     // Catch:{ all -> 0x060b }
            if (r6 == 0) goto L_0x042b
            java.lang.Object r6 = r5.first     // Catch:{ all -> 0x060b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x060b }
            r3.zzatv = r6     // Catch:{ all -> 0x060b }
            java.lang.Object r5 = r5.second     // Catch:{ all -> 0x060b }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x060b }
            r3.zzatw = r5     // Catch:{ all -> 0x060b }
            goto L_0x042b
        L_0x03b5:
            com.google.android.gms.internal.measurement.zzeo r5 = r25.zzfw()     // Catch:{ all -> 0x060b }
            android.content.Context r6 = r25.getContext()     // Catch:{ all -> 0x060b }
            boolean r5 = r5.zzf(r6)     // Catch:{ all -> 0x060b }
            if (r5 != 0) goto L_0x042b
            boolean r5 = r2.zzadz     // Catch:{ all -> 0x060b }
            if (r5 == 0) goto L_0x042b
            android.content.Context r5 = r25.getContext()     // Catch:{ all -> 0x060b }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x060b }
            java.lang.String r6 = "android_id"
            k20.a r10 = new k20.a     // Catch:{ all -> 0x060b }
            r10.<init>()     // Catch:{ all -> 0x060b }
            r10.mo10233c(r6)     // Catch:{ all -> 0x060b }
            r10.mo10233c(r5)     // Catch:{ all -> 0x060b }
            java.lang.Object r11 = new java.lang.Object     // Catch:{ all -> 0x060b }
            r11.<init>()     // Catch:{ all -> 0x060b }
            java.lang.Object[] r12 = r10.mo10232b()     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "com/google/android/gms/internal/measurement/zzjr"
            java.lang.String r14 = "zzc"
            java.lang.String r15 = "(Lcom/google/android/gms/internal/measurement/zzeu;Lcom/google/android/gms/internal/measurement/zzdz;)V"
            java.lang.String r16 = "android/provider/Settings$Secure"
            java.lang.String r17 = "getString"
            java.lang.String r18 = "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;"
            java.lang.Object r5 = j20.C117292a.m165364j(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x060b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x060b }
            if (r5 != 0) goto L_0x0410
            com.google.android.gms.internal.measurement.zzfg r5 = r25.zzge()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzip()     // Catch:{ all -> 0x060b }
            java.lang.String r6 = "null secure ID. appId"
            java.lang.String r10 = r3.zzti     // Catch:{ all -> 0x060b }
            java.lang.Object r10 = com.google.android.gms.internal.measurement.zzfg.zzbm(r10)     // Catch:{ all -> 0x060b }
            r5.zzg(r6, r10)     // Catch:{ all -> 0x060b }
            java.lang.String r5 = "null"
            goto L_0x0429
        L_0x0410:
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x060b }
            if (r6 == 0) goto L_0x0429
            com.google.android.gms.internal.measurement.zzfg r6 = r25.zzge()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfi r6 = r6.zzip()     // Catch:{ all -> 0x060b }
            java.lang.String r10 = "empty secure ID. appId"
            java.lang.String r11 = r3.zzti     // Catch:{ all -> 0x060b }
            java.lang.Object r11 = com.google.android.gms.internal.measurement.zzfg.zzbm(r11)     // Catch:{ all -> 0x060b }
            r6.zzg(r10, r11)     // Catch:{ all -> 0x060b }
        L_0x0429:
            r3.zzaue = r5     // Catch:{ all -> 0x060b }
        L_0x042b:
            com.google.android.gms.internal.measurement.zzeo r5 = r25.zzfw()     // Catch:{ all -> 0x060b }
            r5.zzch()     // Catch:{ all -> 0x060b }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x060b }
            r3.zzatr = r5     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzeo r5 = r25.zzfw()     // Catch:{ all -> 0x060b }
            r5.zzch()     // Catch:{ all -> 0x060b }
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x060b }
            r3.zzatq = r5     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzeo r5 = r25.zzfw()     // Catch:{ all -> 0x060b }
            long r5 = r5.zzic()     // Catch:{ all -> 0x060b }
            int r6 = (int) r5     // Catch:{ all -> 0x060b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x060b }
            r3.zzats = r5     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzeo r5 = r25.zzfw()     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r5.zzid()     // Catch:{ all -> 0x060b }
            r3.zzafn = r5     // Catch:{ all -> 0x060b }
            r3.zzatu = r0     // Catch:{ all -> 0x060b }
            r3.zzatk = r0     // Catch:{ all -> 0x060b }
            r3.zzatl = r0     // Catch:{ all -> 0x060b }
            r3.zzatm = r0     // Catch:{ all -> 0x060b }
            long r5 = r2.zzadx     // Catch:{ all -> 0x060b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x060b }
            r3.zzaug = r5     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzgl r5 = r1.zzacw     // Catch:{ all -> 0x060b }
            boolean r5 = r5.isEnabled()     // Catch:{ all -> 0x060b }
            if (r5 == 0) goto L_0x047a
            boolean r5 = com.google.android.gms.internal.measurement.zzef.zzhk()     // Catch:{ all -> 0x060b }
            if (r5 == 0) goto L_0x047a
            r3.zzauh = r0     // Catch:{ all -> 0x060b }
        L_0x047a:
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r2.packageName     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzdy r0 = r0.zzbc(r5)     // Catch:{ all -> 0x060b }
            if (r0 != 0) goto L_0x04e6
            com.google.android.gms.internal.measurement.zzdy r0 = new com.google.android.gms.internal.measurement.zzdy     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzgl r5 = r1.zzacw     // Catch:{ all -> 0x060b }
            java.lang.String r6 = r2.packageName     // Catch:{ all -> 0x060b }
            r0.<init>(r5, r6)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzgl r5 = r1.zzacw     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfb r5 = r5.zzfv()     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r5.zzii()     // Catch:{ all -> 0x060b }
            r0.zzal(r5)     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r2.zzado     // Catch:{ all -> 0x060b }
            r0.zzao(r5)     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r2.zzadm     // Catch:{ all -> 0x060b }
            r0.zzam(r5)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfr r5 = r25.zzgf()     // Catch:{ all -> 0x060b }
            java.lang.String r6 = r2.packageName     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r5.zzbp(r6)     // Catch:{ all -> 0x060b }
            r0.zzan(r5)     // Catch:{ all -> 0x060b }
            r0.zzr(r7)     // Catch:{ all -> 0x060b }
            r0.zzm(r7)     // Catch:{ all -> 0x060b }
            r0.zzn(r7)     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r2.zzth     // Catch:{ all -> 0x060b }
            r0.setAppVersion(r5)     // Catch:{ all -> 0x060b }
            long r5 = r2.zzads     // Catch:{ all -> 0x060b }
            r0.zzo(r5)     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r2.zzadt     // Catch:{ all -> 0x060b }
            r0.zzap(r5)     // Catch:{ all -> 0x060b }
            long r5 = r2.zzadu     // Catch:{ all -> 0x060b }
            r0.zzp(r5)     // Catch:{ all -> 0x060b }
            long r5 = r2.zzadv     // Catch:{ all -> 0x060b }
            r0.zzq(r5)     // Catch:{ all -> 0x060b }
            boolean r5 = r2.zzadw     // Catch:{ all -> 0x060b }
            r0.setMeasurementEnabled(r5)     // Catch:{ all -> 0x060b }
            long r5 = r2.zzadx     // Catch:{ all -> 0x060b }
            r0.zzaa(r5)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzei r5 = r25.zzix()     // Catch:{ all -> 0x060b }
            r5.zza((com.google.android.gms.internal.measurement.zzdy) r0)     // Catch:{ all -> 0x060b }
        L_0x04e6:
            java.lang.String r5 = r0.getAppInstanceId()     // Catch:{ all -> 0x060b }
            r3.zzadl = r5     // Catch:{ all -> 0x060b }
            java.lang.String r0 = r0.zzgj()     // Catch:{ all -> 0x060b }
            r3.zzado = r0     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()     // Catch:{ all -> 0x060b }
            java.lang.String r2 = r2.packageName     // Catch:{ all -> 0x060b }
            java.util.List r0 = r0.zzbb(r2)     // Catch:{ all -> 0x060b }
            int r2 = r0.size()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzks[] r2 = new com.google.android.gms.internal.measurement.zzks[r2]     // Catch:{ all -> 0x060b }
            r3.zzatj = r2     // Catch:{ all -> 0x060b }
            r14 = 0
        L_0x0505:
            int r2 = r0.size()     // Catch:{ all -> 0x060b }
            if (r14 >= r2) goto L_0x053e
            com.google.android.gms.internal.measurement.zzks r2 = new com.google.android.gms.internal.measurement.zzks     // Catch:{ all -> 0x060b }
            r2.<init>()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzks[] r5 = r3.zzatj     // Catch:{ all -> 0x060b }
            r5[r14] = r2     // Catch:{ all -> 0x060b }
            java.lang.Object r5 = r0.get(r14)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzjz r5 = (com.google.android.gms.internal.measurement.zzjz) r5     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x060b }
            r2.name = r5     // Catch:{ all -> 0x060b }
            java.lang.Object r5 = r0.get(r14)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzjz r5 = (com.google.android.gms.internal.measurement.zzjz) r5     // Catch:{ all -> 0x060b }
            long r5 = r5.zzaqz     // Catch:{ all -> 0x060b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x060b }
            r2.zzaun = r5     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzka r5 = r25.zzgb()     // Catch:{ all -> 0x060b }
            java.lang.Object r6 = r0.get(r14)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzjz r6 = (com.google.android.gms.internal.measurement.zzjz) r6     // Catch:{ all -> 0x060b }
            java.lang.Object r6 = r6.value     // Catch:{ all -> 0x060b }
            r5.zza((com.google.android.gms.internal.measurement.zzks) r2, (java.lang.Object) r6)     // Catch:{ all -> 0x060b }
            int r14 = r14 + 1
            goto L_0x0505
        L_0x053e:
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()     // Catch:{ IOException -> 0x05a6 }
            long r2 = r0.zza((com.google.android.gms.internal.measurement.zzkq) r3)     // Catch:{ IOException -> 0x05a6 }
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzer r5 = r9.zzafq     // Catch:{ all -> 0x060b }
            if (r5 == 0) goto L_0x059c
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x060b }
        L_0x0552:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x060b }
            if (r6 == 0) goto L_0x0566
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x060b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x060b }
            boolean r6 = r4.equals(r6)     // Catch:{ all -> 0x060b }
            if (r6 == 0) goto L_0x0552
        L_0x0564:
            r14 = 1
            goto L_0x059d
        L_0x0566:
            com.google.android.gms.internal.measurement.zzgf r4 = r25.zzkm()     // Catch:{ all -> 0x060b }
            java.lang.String r5 = r9.zzti     // Catch:{ all -> 0x060b }
            java.lang.String r6 = r9.name     // Catch:{ all -> 0x060b }
            boolean r4 = r4.zzo(r5, r6)     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzei r10 = r25.zzix()     // Catch:{ all -> 0x060b }
            long r11 = r25.zzkr()     // Catch:{ all -> 0x060b }
            java.lang.String r13 = r9.zzti     // Catch:{ all -> 0x060b }
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.google.android.gms.internal.measurement.zzej r5 = r10.zza(r11, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x060b }
            if (r4 == 0) goto L_0x059c
            long r4 = r5.zzafh     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzef r6 = r25.zzgg()     // Catch:{ all -> 0x060b }
            java.lang.String r10 = r9.zzti     // Catch:{ all -> 0x060b }
            int r6 = r6.zzar(r10)     // Catch:{ all -> 0x060b }
            long r10 = (long) r6     // Catch:{ all -> 0x060b }
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x059c
            goto L_0x0564
        L_0x059c:
            r14 = 0
        L_0x059d:
            boolean r0 = r0.zza((com.google.android.gms.internal.measurement.zzep) r9, (long) r2, (boolean) r14)     // Catch:{ all -> 0x060b }
            if (r0 == 0) goto L_0x05ba
            r1.zzaqh = r7     // Catch:{ all -> 0x060b }
            goto L_0x05ba
        L_0x05a6:
            r0 = move-exception
            com.google.android.gms.internal.measurement.zzfg r2 = r25.zzge()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzim()     // Catch:{ all -> 0x060b }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r3 = r3.zzti     // Catch:{ all -> 0x060b }
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfg.zzbm(r3)     // Catch:{ all -> 0x060b }
            r2.zze(r4, r3, r0)     // Catch:{ all -> 0x060b }
        L_0x05ba:
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()     // Catch:{ all -> 0x060b }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfg r0 = r25.zzge()     // Catch:{ all -> 0x060b }
            r2 = 2
            boolean r0 = r0.isLoggable(r2)     // Catch:{ all -> 0x060b }
            if (r0 == 0) goto L_0x05e1
            com.google.android.gms.internal.measurement.zzfg r0 = r25.zzge()     // Catch:{ all -> 0x060b }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzit()     // Catch:{ all -> 0x060b }
            java.lang.String r2 = "Event recorded"
            com.google.android.gms.internal.measurement.zzfe r3 = r25.zzga()     // Catch:{ all -> 0x060b }
            java.lang.String r3 = r3.zza((com.google.android.gms.internal.measurement.zzep) r9)     // Catch:{ all -> 0x060b }
            r0.zzg(r2, r3)     // Catch:{ all -> 0x060b }
        L_0x05e1:
            com.google.android.gms.internal.measurement.zzei r0 = r25.zzix()
            r0.endTransaction()
            r25.zzku()
            com.google.android.gms.internal.measurement.zzfg r0 = r25.zzge()
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzit()
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r22
            r4 = 500000(0x7a120, double:2.47033E-318)
            long r2 = r2 + r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Background event processing time, ms"
            r0.zzg(r3, r2)
            return
        L_0x060b:
            r0 = move-exception
            com.google.android.gms.internal.measurement.zzei r2 = r25.zzix()
            r2.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzc(com.google.android.gms.internal.measurement.zzeu, com.google.android.gms.internal.measurement.zzdz):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x021a, code lost:
        if (r4 == null) goto L_0x021e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04d3 A[Catch:{ SQLiteException -> 0x0a41, all -> 0x0a7c }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x05b3 A[Catch:{ SQLiteException -> 0x0a41, all -> 0x0a7c }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x05c9 A[Catch:{ SQLiteException -> 0x0a41, all -> 0x0a7c }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x05e5 A[Catch:{ SQLiteException -> 0x0a41, all -> 0x0a7c }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0703 A[Catch:{ SQLiteException -> 0x0a41, all -> 0x0a7c }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0712 A[Catch:{ SQLiteException -> 0x0a41, all -> 0x0a7c }] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0715 A[Catch:{ SQLiteException -> 0x0a41, all -> 0x0a7c }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0734 A[Catch:{ SQLiteException -> 0x0a41, all -> 0x0a7c }] */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0a64 A[SYNTHETIC, Splitter:B:375:0x0a64] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0a78 A[SYNTHETIC, Splitter:B:382:0x0a78] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x05c6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0222 A[Catch:{ SQLiteException -> 0x0a41, all -> 0x0a7c }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x022e A[Catch:{ SQLiteException -> 0x0a41, all -> 0x0a7c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzd(java.lang.String r38, long r39) {
        /*
            r37 = this;
            r1 = r37
            java.lang.String r2 = "_lte"
            com.google.android.gms.internal.measurement.zzei r3 = r37.zzix()
            r3.beginTransaction()
            com.google.android.gms.internal.measurement.zzjv r3 = new com.google.android.gms.internal.measurement.zzjv     // Catch:{ all -> 0x0a7c }
            r4 = 0
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzei r5 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            long r6 = r1.zzaqs     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x0a7c }
            r5.zzab()     // Catch:{ all -> 0x0a7c }
            r5.zzch()     // Catch:{ all -> 0x0a7c }
            r8 = -1
            r10 = 2
            r11 = 0
            r12 = 1
            android.database.sqlite.SQLiteDatabase r15 = r5.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            java.lang.String r14 = ""
            if (r13 == 0) goto L_0x0089
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x0044
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            java.lang.String r16 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            r4[r11] = r16     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            java.lang.String r16 = java.lang.String.valueOf(r39)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            r4[r12] = r16     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            goto L_0x004c
        L_0x0044:
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            java.lang.String r16 = java.lang.String.valueOf(r39)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            r4[r11] = r16     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
        L_0x004c:
            if (r13 == 0) goto L_0x0050
            java.lang.String r14 = "rowid <= ? and "
        L_0x0050:
            int r13 = r14.length()     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            int r13 = r13 + 148
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            r10.<init>(r13)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            java.lang.String r13 = "select app_id, metadata_fingerprint from raw_events where "
            r10.append(r13)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            r10.append(r14)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            java.lang.String r13 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r10.append(r13)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            java.lang.String r10 = r10.toString()     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            android.database.Cursor r4 = r15.rawQuery(r10, r4)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            boolean r10 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01fd }
            if (r10 != 0) goto L_0x007b
        L_0x0076:
            r4.close()     // Catch:{ all -> 0x0a7c }
            goto L_0x021e
        L_0x007b:
            java.lang.String r10 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x01fd }
            java.lang.String r13 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01fa }
            r4.close()     // Catch:{ SQLiteException -> 0x01fa }
            r22 = r13
            goto L_0x00d4
        L_0x0089:
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x009a
            r10 = 2
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            r10 = 0
            r13[r11] = r10     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            r13[r12] = r10     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            goto L_0x009f
        L_0x009a:
            r10 = 0
            java.lang.String[] r13 = new java.lang.String[]{r10}     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
        L_0x009f:
            if (r4 == 0) goto L_0x00a3
            java.lang.String r14 = " and rowid <= ?"
        L_0x00a3:
            int r4 = r14.length()     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            int r4 = r4 + 84
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            r10.<init>(r4)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            java.lang.String r4 = "select metadata_fingerprint from raw_events where app_id = ?"
            r10.append(r4)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            r10.append(r14)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            java.lang.String r4 = " order by rowid limit 1;"
            r10.append(r4)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            java.lang.String r4 = r10.toString()     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            android.database.Cursor r4 = r15.rawQuery(r4, r13)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0200 }
            boolean r10 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01fd }
            if (r10 != 0) goto L_0x00ca
            goto L_0x0076
        L_0x00ca:
            java.lang.String r13 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x01fd }
            r4.close()     // Catch:{ SQLiteException -> 0x01fd }
            r22 = r13
            r10 = 0
        L_0x00d4:
            java.lang.String r14 = "raw_events_metadata"
            java.lang.String r13 = "metadata"
            java.lang.String[] r16 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x01fa }
            java.lang.String r17 = "app_id = ? and metadata_fingerprint = ?"
            r13 = 2
            java.lang.String[] r8 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x01fa }
            r8[r11] = r10     // Catch:{ SQLiteException -> 0x01fa }
            r8[r12] = r22     // Catch:{ SQLiteException -> 0x01fa }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "2"
            r13 = r15
            r9 = r15
            r15 = r16
            r16 = r17
            r17 = r8
            android.database.Cursor r4 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x01fa }
            boolean r8 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01fa }
            if (r8 != 0) goto L_0x0112
            com.google.android.gms.internal.measurement.zzfg r6 = r5.zzge()     // Catch:{ SQLiteException -> 0x01fa }
            com.google.android.gms.internal.measurement.zzfi r6 = r6.zzim()     // Catch:{ SQLiteException -> 0x01fa }
            java.lang.String r7 = "Raw event metadata record is missing. appId"
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzfg.zzbm(r10)     // Catch:{ SQLiteException -> 0x01fa }
            r6.zzg(r7, r8)     // Catch:{ SQLiteException -> 0x01fa }
            goto L_0x0076
        L_0x0112:
            byte[] r8 = r4.getBlob(r11)     // Catch:{ SQLiteException -> 0x01fa }
            int r13 = r8.length     // Catch:{ SQLiteException -> 0x01fa }
            com.google.android.gms.internal.measurement.zzabv r8 = com.google.android.gms.internal.measurement.zzabv.zza(r8, r11, r13)     // Catch:{ SQLiteException -> 0x01fa }
            com.google.android.gms.internal.measurement.zzkq r13 = new com.google.android.gms.internal.measurement.zzkq     // Catch:{ SQLiteException -> 0x01fa }
            r13.<init>()     // Catch:{ SQLiteException -> 0x01fa }
            r13.zzb(r8)     // Catch:{ IOException -> 0x01e5 }
            boolean r8 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01fa }
            if (r8 == 0) goto L_0x013a
            com.google.android.gms.internal.measurement.zzfg r8 = r5.zzge()     // Catch:{ SQLiteException -> 0x01fa }
            com.google.android.gms.internal.measurement.zzfi r8 = r8.zzip()     // Catch:{ SQLiteException -> 0x01fa }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r15 = com.google.android.gms.internal.measurement.zzfg.zzbm(r10)     // Catch:{ SQLiteException -> 0x01fa }
            r8.zzg(r14, r15)     // Catch:{ SQLiteException -> 0x01fa }
        L_0x013a:
            r4.close()     // Catch:{ SQLiteException -> 0x01fa }
            r3.zzb(r13)     // Catch:{ SQLiteException -> 0x01fa }
            r8 = 3
            r13 = -1
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x015b
            java.lang.String r13 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x01fa }
            r14[r11] = r10     // Catch:{ SQLiteException -> 0x01fa }
            r14[r12] = r22     // Catch:{ SQLiteException -> 0x01fa }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x01fa }
            r7 = 2
            r14[r7] = r6     // Catch:{ SQLiteException -> 0x01fa }
            r16 = r13
            r17 = r14
            goto L_0x0168
        L_0x015b:
            java.lang.String r6 = "app_id = ? and metadata_fingerprint = ?"
            r7 = 2
            java.lang.String[] r13 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x01fa }
            r13[r11] = r10     // Catch:{ SQLiteException -> 0x01fa }
            r13[r12] = r22     // Catch:{ SQLiteException -> 0x01fa }
            r16 = r6
            r17 = r13
        L_0x0168:
            java.lang.String r14 = "raw_events"
            java.lang.String r6 = "rowid"
            java.lang.String r7 = "name"
            java.lang.String r13 = "timestamp"
            java.lang.String r15 = "data"
            java.lang.String[] r15 = new java.lang.String[]{r6, r7, r13, r15}     // Catch:{ SQLiteException -> 0x01fa }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            r21 = 0
            r13 = r9
            android.database.Cursor r4 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x01fa }
            boolean r6 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01fa }
            if (r6 != 0) goto L_0x019c
            com.google.android.gms.internal.measurement.zzfg r6 = r5.zzge()     // Catch:{ SQLiteException -> 0x01fa }
            com.google.android.gms.internal.measurement.zzfi r6 = r6.zzip()     // Catch:{ SQLiteException -> 0x01fa }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzfg.zzbm(r10)     // Catch:{ SQLiteException -> 0x01fa }
            r6.zzg(r7, r8)     // Catch:{ SQLiteException -> 0x01fa }
            goto L_0x0076
        L_0x019c:
            long r6 = r4.getLong(r11)     // Catch:{ SQLiteException -> 0x01fa }
            byte[] r9 = r4.getBlob(r8)     // Catch:{ SQLiteException -> 0x01fa }
            int r13 = r9.length     // Catch:{ SQLiteException -> 0x01fa }
            com.google.android.gms.internal.measurement.zzabv r9 = com.google.android.gms.internal.measurement.zzabv.zza(r9, r11, r13)     // Catch:{ SQLiteException -> 0x01fa }
            com.google.android.gms.internal.measurement.zzkn r13 = new com.google.android.gms.internal.measurement.zzkn     // Catch:{ SQLiteException -> 0x01fa }
            r13.<init>()     // Catch:{ SQLiteException -> 0x01fa }
            r13.zzb(r9)     // Catch:{ IOException -> 0x01ca }
            java.lang.String r9 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01fa }
            r13.name = r9     // Catch:{ SQLiteException -> 0x01fa }
            r9 = 2
            long r14 = r4.getLong(r9)     // Catch:{ SQLiteException -> 0x01fa }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x01fa }
            r13.zzatb = r9     // Catch:{ SQLiteException -> 0x01fa }
            boolean r6 = r3.zza(r6, r13)     // Catch:{ SQLiteException -> 0x01fa }
            if (r6 != 0) goto L_0x01dd
            goto L_0x0076
        L_0x01ca:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.internal.measurement.zzfg r7 = r5.zzge()     // Catch:{ SQLiteException -> 0x01fa }
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzim()     // Catch:{ SQLiteException -> 0x01fa }
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.zzfg.zzbm(r10)     // Catch:{ SQLiteException -> 0x01fa }
            r7.zze(r9, r13, r6)     // Catch:{ SQLiteException -> 0x01fa }
        L_0x01dd:
            boolean r6 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01fa }
            if (r6 != 0) goto L_0x019c
            goto L_0x0076
        L_0x01e5:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.internal.measurement.zzfg r7 = r5.zzge()     // Catch:{ SQLiteException -> 0x01fa }
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzim()     // Catch:{ SQLiteException -> 0x01fa }
            java.lang.String r8 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzfg.zzbm(r10)     // Catch:{ SQLiteException -> 0x01fa }
            r7.zze(r8, r9, r6)     // Catch:{ SQLiteException -> 0x01fa }
            goto L_0x0076
        L_0x01fa:
            r0 = move-exception
            r6 = r0
            goto L_0x0209
        L_0x01fd:
            r0 = move-exception
            r6 = r0
            goto L_0x0208
        L_0x0200:
            r0 = move-exception
            r1 = r0
            r4 = 0
            goto L_0x0a76
        L_0x0205:
            r0 = move-exception
            r6 = r0
            r4 = 0
        L_0x0208:
            r10 = 0
        L_0x0209:
            com.google.android.gms.internal.measurement.zzfg r5 = r5.zzge()     // Catch:{ all -> 0x0a74 }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzim()     // Catch:{ all -> 0x0a74 }
            java.lang.String r7 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzfg.zzbm(r10)     // Catch:{ all -> 0x0a74 }
            r5.zze(r7, r8, r6)     // Catch:{ all -> 0x0a74 }
            if (r4 == 0) goto L_0x021e
            goto L_0x0076
        L_0x021e:
            java.util.List<com.google.android.gms.internal.measurement.zzkn> r4 = r3.zzaqx     // Catch:{ all -> 0x0a7c }
            if (r4 == 0) goto L_0x022b
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0a7c }
            if (r4 == 0) goto L_0x0229
            goto L_0x022b
        L_0x0229:
            r4 = 0
            goto L_0x022c
        L_0x022b:
            r4 = 1
        L_0x022c:
            if (r4 != 0) goto L_0x0a64
            com.google.android.gms.internal.measurement.zzkq r4 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.util.List<com.google.android.gms.internal.measurement.zzkn> r5 = r3.zzaqx     // Catch:{ all -> 0x0a7c }
            int r5 = r5.size()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkn[] r5 = new com.google.android.gms.internal.measurement.zzkn[r5]     // Catch:{ all -> 0x0a7c }
            r4.zzati = r5     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzef r5 = r37.zzgg()     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r4.zzti     // Catch:{ all -> 0x0a7c }
            boolean r5 = r5.zzav(r6)     // Catch:{ all -> 0x0a7c }
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
        L_0x0249:
            java.util.List<com.google.android.gms.internal.measurement.zzkn> r15 = r3.zzaqx     // Catch:{ all -> 0x0a7c }
            int r15 = r15.size()     // Catch:{ all -> 0x0a7c }
            r16 = 1
            if (r8 >= r15) goto L_0x0527
            java.util.List<com.google.android.gms.internal.measurement.zzkn> r15 = r3.zzaqx     // Catch:{ all -> 0x0a7c }
            java.lang.Object r15 = r15.get(r8)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkn r15 = (com.google.android.gms.internal.measurement.zzkn) r15     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzgf r6 = r37.zzkm()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r7 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r7 = r7.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.String r12 = r15.name     // Catch:{ all -> 0x0a7c }
            boolean r6 = r6.zzn(r7, r12)     // Catch:{ all -> 0x0a7c }
            java.lang.String r7 = "_err"
            if (r6 == 0) goto L_0x02d7
            com.google.android.gms.internal.measurement.zzfg r6 = r37.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r6 = r6.zzip()     // Catch:{ all -> 0x0a7c }
            java.lang.String r12 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.zzkq r11 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r11 = r11.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.Object r11 = com.google.android.gms.internal.measurement.zzfg.zzbm(r11)     // Catch:{ all -> 0x0a7c }
            r20 = r10
            com.google.android.gms.internal.measurement.zzfe r10 = r37.zzga()     // Catch:{ all -> 0x0a7c }
            java.lang.String r1 = r15.name     // Catch:{ all -> 0x0a7c }
            java.lang.String r1 = r10.zzbj(r1)     // Catch:{ all -> 0x0a7c }
            r6.zze(r12, r11, r1)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzgf r1 = r37.zzkm()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r6 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r6.zzti     // Catch:{ all -> 0x0a7c }
            boolean r1 = r1.zzby(r6)     // Catch:{ all -> 0x0a7c }
            if (r1 != 0) goto L_0x02ad
            com.google.android.gms.internal.measurement.zzgf r1 = r37.zzkm()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r6 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r6.zzti     // Catch:{ all -> 0x0a7c }
            boolean r1 = r1.zzbz(r6)     // Catch:{ all -> 0x0a7c }
            if (r1 == 0) goto L_0x02ab
            goto L_0x02ad
        L_0x02ab:
            r1 = 0
            goto L_0x02ae
        L_0x02ad:
            r1 = 1
        L_0x02ae:
            if (r1 != 0) goto L_0x02cf
            java.lang.String r1 = r15.name     // Catch:{ all -> 0x0a7c }
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x0a7c }
            if (r1 != 0) goto L_0x02cf
            com.google.android.gms.internal.measurement.zzka r23 = r37.zzgb()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r1 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r1 = r1.zzti     // Catch:{ all -> 0x0a7c }
            r25 = 11
            java.lang.String r26 = "_ev"
            java.lang.String r6 = r15.name     // Catch:{ all -> 0x0a7c }
            r28 = 0
            r24 = r1
            r27 = r6
            r23.zza((java.lang.String) r24, (int) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28)     // Catch:{ all -> 0x0a7c }
        L_0x02cf:
            r22 = r2
            r23 = r8
            r10 = r20
            goto L_0x051d
        L_0x02d7:
            r20 = r10
            com.google.android.gms.internal.measurement.zzgf r1 = r37.zzkm()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r6 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r6.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.String r10 = r15.name     // Catch:{ all -> 0x0a7c }
            boolean r1 = r1.zzo(r6, r10)     // Catch:{ all -> 0x0a7c }
            if (r1 != 0) goto L_0x02ff
            r37.zzgb()     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r15.name     // Catch:{ all -> 0x0a7c }
            boolean r6 = com.google.android.gms.internal.measurement.zzka.zzcl(r6)     // Catch:{ all -> 0x0a7c }
            if (r6 == 0) goto L_0x02f5
            goto L_0x02ff
        L_0x02f5:
            r22 = r2
            r23 = r8
            r24 = r13
            r10 = r20
            goto L_0x04c3
        L_0x02ff:
            com.google.android.gms.internal.measurement.zzko[] r6 = r15.zzata     // Catch:{ all -> 0x0a7c }
            if (r6 != 0) goto L_0x0308
            r6 = 0
            com.google.android.gms.internal.measurement.zzko[] r10 = new com.google.android.gms.internal.measurement.zzko[r6]     // Catch:{ all -> 0x0a7c }
            r15.zzata = r10     // Catch:{ all -> 0x0a7c }
        L_0x0308:
            com.google.android.gms.internal.measurement.zzko[] r6 = r15.zzata     // Catch:{ all -> 0x0a7c }
            int r10 = r6.length     // Catch:{ all -> 0x0a7c }
            r22 = r2
            r11 = 0
            r12 = 0
            r21 = 0
        L_0x0311:
            java.lang.String r2 = "_r"
            r23 = r8
            java.lang.String r8 = "_c"
            if (r12 >= r10) goto L_0x0348
            r24 = r10
            r10 = r6[r12]     // Catch:{ all -> 0x0a7c }
            r25 = r6
            java.lang.String r6 = r10.name     // Catch:{ all -> 0x0a7c }
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x0a7c }
            if (r6 == 0) goto L_0x032f
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0a7c }
            r10.zzate = r2     // Catch:{ all -> 0x0a7c }
            r11 = 1
            goto L_0x033f
        L_0x032f:
            java.lang.String r6 = r10.name     // Catch:{ all -> 0x0a7c }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0a7c }
            if (r2 == 0) goto L_0x033f
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0a7c }
            r10.zzate = r2     // Catch:{ all -> 0x0a7c }
            r21 = 1
        L_0x033f:
            int r12 = r12 + 1
            r8 = r23
            r10 = r24
            r6 = r25
            goto L_0x0311
        L_0x0348:
            if (r11 != 0) goto L_0x0382
            if (r1 == 0) goto L_0x0382
            com.google.android.gms.internal.measurement.zzfg r6 = r37.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r6 = r6.zzit()     // Catch:{ all -> 0x0a7c }
            java.lang.String r10 = "Marking event as conversion"
            com.google.android.gms.internal.measurement.zzfe r11 = r37.zzga()     // Catch:{ all -> 0x0a7c }
            java.lang.String r12 = r15.name     // Catch:{ all -> 0x0a7c }
            java.lang.String r11 = r11.zzbj(r12)     // Catch:{ all -> 0x0a7c }
            r6.zzg(r10, r11)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r6 = r15.zzata     // Catch:{ all -> 0x0a7c }
            int r10 = r6.length     // Catch:{ all -> 0x0a7c }
            r11 = 1
            int r10 = r10 + r11
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r10)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r6 = (com.google.android.gms.internal.measurement.zzko[]) r6     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko r10 = new com.google.android.gms.internal.measurement.zzko     // Catch:{ all -> 0x0a7c }
            r10.<init>()     // Catch:{ all -> 0x0a7c }
            r10.name = r8     // Catch:{ all -> 0x0a7c }
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0a7c }
            r10.zzate = r11     // Catch:{ all -> 0x0a7c }
            int r11 = r6.length     // Catch:{ all -> 0x0a7c }
            r12 = 1
            int r11 = r11 - r12
            r6[r11] = r10     // Catch:{ all -> 0x0a7c }
            r15.zzata = r6     // Catch:{ all -> 0x0a7c }
        L_0x0382:
            if (r21 != 0) goto L_0x03ba
            com.google.android.gms.internal.measurement.zzfg r6 = r37.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r6 = r6.zzit()     // Catch:{ all -> 0x0a7c }
            java.lang.String r10 = "Marking event as real-time"
            com.google.android.gms.internal.measurement.zzfe r11 = r37.zzga()     // Catch:{ all -> 0x0a7c }
            java.lang.String r12 = r15.name     // Catch:{ all -> 0x0a7c }
            java.lang.String r11 = r11.zzbj(r12)     // Catch:{ all -> 0x0a7c }
            r6.zzg(r10, r11)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r6 = r15.zzata     // Catch:{ all -> 0x0a7c }
            int r10 = r6.length     // Catch:{ all -> 0x0a7c }
            r11 = 1
            int r10 = r10 + r11
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r10)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r6 = (com.google.android.gms.internal.measurement.zzko[]) r6     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko r10 = new com.google.android.gms.internal.measurement.zzko     // Catch:{ all -> 0x0a7c }
            r10.<init>()     // Catch:{ all -> 0x0a7c }
            r10.name = r2     // Catch:{ all -> 0x0a7c }
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0a7c }
            r10.zzate = r11     // Catch:{ all -> 0x0a7c }
            int r11 = r6.length     // Catch:{ all -> 0x0a7c }
            r12 = 1
            int r11 = r11 - r12
            r6[r11] = r10     // Catch:{ all -> 0x0a7c }
            r15.zzata = r6     // Catch:{ all -> 0x0a7c }
        L_0x03ba:
            com.google.android.gms.internal.measurement.zzei r24 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            long r25 = r37.zzkr()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r6 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r6.zzti     // Catch:{ all -> 0x0a7c }
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 1
            r27 = r6
            com.google.android.gms.internal.measurement.zzej r6 = r24.zza(r25, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x0a7c }
            long r10 = r6.zzafh     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzef r6 = r37.zzgg()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r12 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r12 = r12.zzti     // Catch:{ all -> 0x0a7c }
            int r6 = r6.zzar(r12)     // Catch:{ all -> 0x0a7c }
            r24 = r13
            long r12 = (long) r6     // Catch:{ all -> 0x0a7c }
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x041b
            r6 = 0
        L_0x03ec:
            com.google.android.gms.internal.measurement.zzko[] r10 = r15.zzata     // Catch:{ all -> 0x0a7c }
            int r11 = r10.length     // Catch:{ all -> 0x0a7c }
            if (r6 >= r11) goto L_0x0418
            r10 = r10[r6]     // Catch:{ all -> 0x0a7c }
            java.lang.String r10 = r10.name     // Catch:{ all -> 0x0a7c }
            boolean r10 = r2.equals(r10)     // Catch:{ all -> 0x0a7c }
            if (r10 == 0) goto L_0x0415
            com.google.android.gms.internal.measurement.zzko[] r2 = r15.zzata     // Catch:{ all -> 0x0a7c }
            int r10 = r2.length     // Catch:{ all -> 0x0a7c }
            r11 = 1
            int r10 = r10 - r11
            com.google.android.gms.internal.measurement.zzko[] r11 = new com.google.android.gms.internal.measurement.zzko[r10]     // Catch:{ all -> 0x0a7c }
            if (r6 <= 0) goto L_0x0408
            r12 = 0
            java.lang.System.arraycopy(r2, r12, r11, r12, r6)     // Catch:{ all -> 0x0a7c }
        L_0x0408:
            if (r6 >= r10) goto L_0x0412
            com.google.android.gms.internal.measurement.zzko[] r2 = r15.zzata     // Catch:{ all -> 0x0a7c }
            int r12 = r6 + 1
            int r10 = r10 - r6
            java.lang.System.arraycopy(r2, r12, r11, r6, r10)     // Catch:{ all -> 0x0a7c }
        L_0x0412:
            r15.zzata = r11     // Catch:{ all -> 0x0a7c }
            goto L_0x0418
        L_0x0415:
            int r6 = r6 + 1
            goto L_0x03ec
        L_0x0418:
            r10 = r20
            goto L_0x041c
        L_0x041b:
            r10 = 1
        L_0x041c:
            java.lang.String r2 = r15.name     // Catch:{ all -> 0x0a7c }
            boolean r2 = com.google.android.gms.internal.measurement.zzka.zzcc(r2)     // Catch:{ all -> 0x0a7c }
            if (r2 == 0) goto L_0x04c3
            if (r1 == 0) goto L_0x04c3
            com.google.android.gms.internal.measurement.zzei r26 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            long r27 = r37.zzkr()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r1 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r1 = r1.zzti     // Catch:{ all -> 0x0a7c }
            r30 = 0
            r31 = 0
            r32 = 1
            r33 = 0
            r34 = 0
            r29 = r1
            com.google.android.gms.internal.measurement.zzej r1 = r26.zza(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0a7c }
            long r1 = r1.zzaff     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzef r6 = r37.zzgg()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r11 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r11 = r11.zzti     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzex<java.lang.Integer> r12 = com.google.android.gms.internal.measurement.zzew.zzagv     // Catch:{ all -> 0x0a7c }
            int r6 = r6.zzb(r11, r12)     // Catch:{ all -> 0x0a7c }
            long r11 = (long) r6     // Catch:{ all -> 0x0a7c }
            int r6 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x04c3
            com.google.android.gms.internal.measurement.zzfg r1 = r37.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzip()     // Catch:{ all -> 0x0a7c }
            java.lang.String r2 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzkq r6 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r6.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r6)     // Catch:{ all -> 0x0a7c }
            r1.zzg(r2, r6)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r1 = r15.zzata     // Catch:{ all -> 0x0a7c }
            int r2 = r1.length     // Catch:{ all -> 0x0a7c }
            r6 = 0
            r11 = 0
            r12 = 0
        L_0x0472:
            if (r12 >= r2) goto L_0x048c
            r13 = r1[r12]     // Catch:{ all -> 0x0a7c }
            java.lang.String r14 = r13.name     // Catch:{ all -> 0x0a7c }
            boolean r14 = r8.equals(r14)     // Catch:{ all -> 0x0a7c }
            if (r14 == 0) goto L_0x0480
            r6 = r13
            goto L_0x0489
        L_0x0480:
            java.lang.String r13 = r13.name     // Catch:{ all -> 0x0a7c }
            boolean r13 = r7.equals(r13)     // Catch:{ all -> 0x0a7c }
            if (r13 == 0) goto L_0x0489
            r11 = 1
        L_0x0489:
            int r12 = r12 + 1
            goto L_0x0472
        L_0x048c:
            if (r11 == 0) goto L_0x04a1
            if (r6 == 0) goto L_0x04a1
            com.google.android.gms.internal.measurement.zzko[] r1 = r15.zzata     // Catch:{ all -> 0x0a7c }
            r2 = 1
            com.google.android.gms.internal.measurement.zzko[] r7 = new com.google.android.gms.internal.measurement.zzko[r2]     // Catch:{ all -> 0x0a7c }
            r2 = 0
            r7[r2] = r6     // Catch:{ all -> 0x0a7c }
            java.lang.Object[] r1 = com.google.android.gms.common.util.ArrayUtils.removeAll((T[]) r1, (T[]) r7)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r1 = (com.google.android.gms.internal.measurement.zzko[]) r1     // Catch:{ all -> 0x0a7c }
            r15.zzata = r1     // Catch:{ all -> 0x0a7c }
            goto L_0x04c3
        L_0x04a1:
            if (r6 == 0) goto L_0x04ae
            r6.name = r7     // Catch:{ all -> 0x0a7c }
            r1 = 10
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0a7c }
            r6.zzate = r1     // Catch:{ all -> 0x0a7c }
            goto L_0x04c3
        L_0x04ae:
            com.google.android.gms.internal.measurement.zzfg r1 = r37.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch:{ all -> 0x0a7c }
            java.lang.String r2 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzkq r6 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r6.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r6)     // Catch:{ all -> 0x0a7c }
            r1.zzg(r2, r6)     // Catch:{ all -> 0x0a7c }
        L_0x04c3:
            if (r5 == 0) goto L_0x0514
            java.lang.String r1 = "_e"
            java.lang.String r2 = r15.name     // Catch:{ all -> 0x0a7c }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0a7c }
            if (r1 == 0) goto L_0x0514
            com.google.android.gms.internal.measurement.zzko[] r1 = r15.zzata     // Catch:{ all -> 0x0a7c }
            if (r1 == 0) goto L_0x0501
            int r1 = r1.length     // Catch:{ all -> 0x0a7c }
            if (r1 != 0) goto L_0x04d7
            goto L_0x0501
        L_0x04d7:
            r37.zzgb()     // Catch:{ all -> 0x0a7c }
            java.lang.String r1 = "_et"
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzka.zzb(r15, r1)     // Catch:{ all -> 0x0a7c }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0a7c }
            if (r1 != 0) goto L_0x04fa
            com.google.android.gms.internal.measurement.zzfg r1 = r37.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzip()     // Catch:{ all -> 0x0a7c }
            java.lang.String r2 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.zzkq r6 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r6.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r6)     // Catch:{ all -> 0x0a7c }
        L_0x04f6:
            r1.zzg(r2, r6)     // Catch:{ all -> 0x0a7c }
            goto L_0x0514
        L_0x04fa:
            long r1 = r1.longValue()     // Catch:{ all -> 0x0a7c }
            long r13 = r24 + r1
            goto L_0x0516
        L_0x0501:
            com.google.android.gms.internal.measurement.zzfg r1 = r37.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzip()     // Catch:{ all -> 0x0a7c }
            java.lang.String r2 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.zzkq r6 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r6.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r6)     // Catch:{ all -> 0x0a7c }
            goto L_0x04f6
        L_0x0514:
            r13 = r24
        L_0x0516:
            com.google.android.gms.internal.measurement.zzkn[] r1 = r4.zzati     // Catch:{ all -> 0x0a7c }
            int r2 = r9 + 1
            r1[r9] = r15     // Catch:{ all -> 0x0a7c }
            r9 = r2
        L_0x051d:
            int r8 = r23 + 1
            r2 = r22
            r11 = 0
            r12 = 1
            r1 = r37
            goto L_0x0249
        L_0x0527:
            r22 = r2
            r20 = r10
            r24 = r13
            java.util.List<com.google.android.gms.internal.measurement.zzkn> r1 = r3.zzaqx     // Catch:{ all -> 0x0a7c }
            int r1 = r1.size()     // Catch:{ all -> 0x0a7c }
            if (r9 >= r1) goto L_0x053f
            com.google.android.gms.internal.measurement.zzkn[] r1 = r4.zzati     // Catch:{ all -> 0x0a7c }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r9)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkn[] r1 = (com.google.android.gms.internal.measurement.zzkn[]) r1     // Catch:{ all -> 0x0a7c }
            r4.zzati = r1     // Catch:{ all -> 0x0a7c }
        L_0x053f:
            if (r5 == 0) goto L_0x05fb
            com.google.android.gms.internal.measurement.zzei r1 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            java.lang.String r2 = r4.zzti     // Catch:{ all -> 0x0a7c }
            r5 = r22
            com.google.android.gms.internal.measurement.zzjz r1 = r1.zzh(r2, r5)     // Catch:{ all -> 0x0a7c }
            if (r1 == 0) goto L_0x0577
            java.lang.Object r2 = r1.value     // Catch:{ all -> 0x0a7c }
            if (r2 != 0) goto L_0x0554
            goto L_0x0577
        L_0x0554:
            com.google.android.gms.internal.measurement.zzjz r2 = new com.google.android.gms.internal.measurement.zzjz     // Catch:{ all -> 0x0a7c }
            java.lang.String r7 = r4.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.String r8 = "auto"
            java.lang.String r9 = "_lte"
            com.google.android.gms.common.util.Clock r6 = r37.zzbt()     // Catch:{ all -> 0x0a7c }
            long r10 = r6.currentTimeMillis()     // Catch:{ all -> 0x0a7c }
            java.lang.Object r1 = r1.value     // Catch:{ all -> 0x0a7c }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0a7c }
            long r12 = r1.longValue()     // Catch:{ all -> 0x0a7c }
            long r12 = r12 + r24
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0a7c }
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x0a7c }
            goto L_0x0592
        L_0x0577:
            com.google.android.gms.internal.measurement.zzjz r2 = new com.google.android.gms.internal.measurement.zzjz     // Catch:{ all -> 0x0a7c }
            java.lang.String r1 = r4.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.String r28 = "auto"
            java.lang.String r29 = "_lte"
            com.google.android.gms.common.util.Clock r6 = r37.zzbt()     // Catch:{ all -> 0x0a7c }
            long r30 = r6.currentTimeMillis()     // Catch:{ all -> 0x0a7c }
            java.lang.Long r32 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0a7c }
            r26 = r2
            r27 = r1
            r26.<init>(r27, r28, r29, r30, r32)     // Catch:{ all -> 0x0a7c }
        L_0x0592:
            com.google.android.gms.internal.measurement.zzks r1 = new com.google.android.gms.internal.measurement.zzks     // Catch:{ all -> 0x0a7c }
            r1.<init>()     // Catch:{ all -> 0x0a7c }
            r1.name = r5     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.common.util.Clock r6 = r37.zzbt()     // Catch:{ all -> 0x0a7c }
            long r6 = r6.currentTimeMillis()     // Catch:{ all -> 0x0a7c }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0a7c }
            r1.zzaun = r6     // Catch:{ all -> 0x0a7c }
            java.lang.Object r6 = r2.value     // Catch:{ all -> 0x0a7c }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0a7c }
            r1.zzate = r6     // Catch:{ all -> 0x0a7c }
            r6 = 0
        L_0x05ae:
            com.google.android.gms.internal.measurement.zzks[] r7 = r4.zzatj     // Catch:{ all -> 0x0a7c }
            int r8 = r7.length     // Catch:{ all -> 0x0a7c }
            if (r6 >= r8) goto L_0x05c6
            r7 = r7[r6]     // Catch:{ all -> 0x0a7c }
            java.lang.String r7 = r7.name     // Catch:{ all -> 0x0a7c }
            boolean r7 = r5.equals(r7)     // Catch:{ all -> 0x0a7c }
            if (r7 == 0) goto L_0x05c3
            com.google.android.gms.internal.measurement.zzks[] r5 = r4.zzatj     // Catch:{ all -> 0x0a7c }
            r5[r6] = r1     // Catch:{ all -> 0x0a7c }
            r5 = 1
            goto L_0x05c7
        L_0x05c3:
            int r6 = r6 + 1
            goto L_0x05ae
        L_0x05c6:
            r5 = 0
        L_0x05c7:
            if (r5 != 0) goto L_0x05df
            com.google.android.gms.internal.measurement.zzks[] r5 = r4.zzatj     // Catch:{ all -> 0x0a7c }
            int r6 = r5.length     // Catch:{ all -> 0x0a7c }
            r7 = 1
            int r6 = r6 + r7
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzks[] r5 = (com.google.android.gms.internal.measurement.zzks[]) r5     // Catch:{ all -> 0x0a7c }
            r4.zzatj = r5     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r6 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzks[] r6 = r6.zzatj     // Catch:{ all -> 0x0a7c }
            int r6 = r6.length     // Catch:{ all -> 0x0a7c }
            r7 = 1
            int r6 = r6 - r7
            r5[r6] = r1     // Catch:{ all -> 0x0a7c }
        L_0x05df:
            r5 = 0
            int r1 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x05fb
            com.google.android.gms.internal.measurement.zzei r1 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            r1.zza((com.google.android.gms.internal.measurement.zzjz) r2)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfg r1 = r37.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzis()     // Catch:{ all -> 0x0a7c }
            java.lang.String r5 = "Updated lifetime engagement user property with value. Value"
            java.lang.Object r2 = r2.value     // Catch:{ all -> 0x0a7c }
            r1.zzg(r5, r2)     // Catch:{ all -> 0x0a7c }
        L_0x05fb:
            java.lang.String r1 = r4.zzti     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzks[] r2 = r4.zzatj     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkn[] r5 = r4.zzati     // Catch:{ all -> 0x0a7c }
            r6 = r37
            com.google.android.gms.internal.measurement.zzkm[] r1 = r6.zza(r1, r2, r5)     // Catch:{ all -> 0x0a7c }
            r4.zzaua = r1     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzef r1 = r37.zzgg()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r2 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r2 = r2.zzti     // Catch:{ all -> 0x0a7c }
            boolean r1 = r1.zzau(r2)     // Catch:{ all -> 0x0a7c }
            if (r1 == 0) goto L_0x08b0
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0a7c }
            r1.<init>()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkn[] r2 = r4.zzati     // Catch:{ all -> 0x0a7c }
            int r2 = r2.length     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkn[] r2 = new com.google.android.gms.internal.measurement.zzkn[r2]     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzka r5 = r37.zzgb()     // Catch:{ all -> 0x0a7c }
            java.security.SecureRandom r5 = r5.zzlc()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkn[] r7 = r4.zzati     // Catch:{ all -> 0x0a7c }
            int r8 = r7.length     // Catch:{ all -> 0x0a7c }
            r9 = 0
            r10 = 0
        L_0x062e:
            if (r9 >= r8) goto L_0x087f
            r11 = r7[r9]     // Catch:{ all -> 0x0a7c }
            java.lang.String r12 = r11.name     // Catch:{ all -> 0x0a7c }
            java.lang.String r13 = "_ep"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0a7c }
            java.lang.String r13 = "_efs"
            java.lang.String r14 = "_sr"
            if (r12 == 0) goto L_0x06ac
            r37.zzgb()     // Catch:{ all -> 0x0a7c }
            java.lang.String r12 = "_en"
            java.lang.Object r12 = com.google.android.gms.internal.measurement.zzka.zzb(r11, r12)     // Catch:{ all -> 0x0a7c }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0a7c }
            java.lang.Object r15 = r1.get(r12)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzeq r15 = (com.google.android.gms.internal.measurement.zzeq) r15     // Catch:{ all -> 0x0a7c }
            if (r15 != 0) goto L_0x0662
            com.google.android.gms.internal.measurement.zzei r15 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r6 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r6.zzti     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzeq r15 = r15.zzf(r6, r12)     // Catch:{ all -> 0x0a7c }
            r1.put(r12, r15)     // Catch:{ all -> 0x0a7c }
        L_0x0662:
            java.lang.Long r6 = r15.zzafv     // Catch:{ all -> 0x0a7c }
            if (r6 != 0) goto L_0x06a6
            java.lang.Long r6 = r15.zzafw     // Catch:{ all -> 0x0a7c }
            long r23 = r6.longValue()     // Catch:{ all -> 0x0a7c }
            int r6 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x067d
            r37.zzgb()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r6 = r11.zzata     // Catch:{ all -> 0x0a7c }
            java.lang.Long r12 = r15.zzafw     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r6 = com.google.android.gms.internal.measurement.zzka.zza((com.google.android.gms.internal.measurement.zzko[]) r6, (java.lang.String) r14, (java.lang.Object) r12)     // Catch:{ all -> 0x0a7c }
            r11.zzata = r6     // Catch:{ all -> 0x0a7c }
        L_0x067d:
            java.lang.Boolean r6 = r15.zzafx     // Catch:{ all -> 0x0a7c }
            if (r6 == 0) goto L_0x0696
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0a7c }
            if (r6 == 0) goto L_0x0696
            r37.zzgb()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r6 = r11.zzata     // Catch:{ all -> 0x0a7c }
            java.lang.Long r12 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r6 = com.google.android.gms.internal.measurement.zzka.zza((com.google.android.gms.internal.measurement.zzko[]) r6, (java.lang.String) r13, (java.lang.Object) r12)     // Catch:{ all -> 0x0a7c }
            r11.zzata = r6     // Catch:{ all -> 0x0a7c }
        L_0x0696:
            int r6 = r10 + 1
            r2[r10] = r11     // Catch:{ all -> 0x0a7c }
            r13 = r3
            r23 = r4
            r24 = r5
            r10 = r6
        L_0x06a0:
            r21 = r7
            r22 = r8
            goto L_0x0870
        L_0x06a6:
            r13 = r3
            r23 = r4
            r24 = r5
            goto L_0x06a0
        L_0x06ac:
            java.lang.String r6 = "_dbg"
            java.lang.Long r12 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0a7c }
            boolean r15 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a7c }
            if (r15 != 0) goto L_0x06fc
            if (r12 != 0) goto L_0x06bb
            goto L_0x06fc
        L_0x06bb:
            com.google.android.gms.internal.measurement.zzko[] r15 = r11.zzata     // Catch:{ all -> 0x0a7c }
            r21 = r7
            int r7 = r15.length     // Catch:{ all -> 0x0a7c }
            r22 = r8
            r8 = 0
        L_0x06c3:
            if (r8 >= r7) goto L_0x0700
            r23 = r7
            r7 = r15[r8]     // Catch:{ all -> 0x0a7c }
            r24 = r15
            java.lang.String r15 = r7.name     // Catch:{ all -> 0x0a7c }
            boolean r15 = r6.equals(r15)     // Catch:{ all -> 0x0a7c }
            if (r15 == 0) goto L_0x06f5
            java.lang.Long r6 = r7.zzate     // Catch:{ all -> 0x0a7c }
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x0a7c }
            if (r6 != 0) goto L_0x06f3
            boolean r6 = r12 instanceof java.lang.String     // Catch:{ all -> 0x0a7c }
            if (r6 == 0) goto L_0x06e7
            java.lang.String r6 = r7.zzajf     // Catch:{ all -> 0x0a7c }
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x0a7c }
            if (r6 != 0) goto L_0x06f3
        L_0x06e7:
            boolean r6 = r12 instanceof java.lang.Double     // Catch:{ all -> 0x0a7c }
            if (r6 == 0) goto L_0x0700
            java.lang.Double r6 = r7.zzarc     // Catch:{ all -> 0x0a7c }
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x0a7c }
            if (r6 == 0) goto L_0x0700
        L_0x06f3:
            r6 = 1
            goto L_0x0701
        L_0x06f5:
            int r8 = r8 + 1
            r7 = r23
            r15 = r24
            goto L_0x06c3
        L_0x06fc:
            r21 = r7
            r22 = r8
        L_0x0700:
            r6 = 0
        L_0x0701:
            if (r6 != 0) goto L_0x0712
            com.google.android.gms.internal.measurement.zzgf r6 = r37.zzkm()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r7 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r7 = r7.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.String r8 = r11.name     // Catch:{ all -> 0x0a7c }
            int r6 = r6.zzp(r7, r8)     // Catch:{ all -> 0x0a7c }
            goto L_0x0713
        L_0x0712:
            r6 = 1
        L_0x0713:
            if (r6 > 0) goto L_0x0734
            com.google.android.gms.internal.measurement.zzfg r7 = r37.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzip()     // Catch:{ all -> 0x0a7c }
            java.lang.String r8 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r11.name     // Catch:{ all -> 0x0a7c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0a7c }
            r7.zze(r8, r12, r6)     // Catch:{ all -> 0x0a7c }
            int r6 = r10 + 1
            r2[r10] = r11     // Catch:{ all -> 0x0a7c }
        L_0x072c:
            r13 = r3
            r23 = r4
            r24 = r5
            r10 = r6
            goto L_0x0870
        L_0x0734:
            java.lang.String r7 = r11.name     // Catch:{ all -> 0x0a7c }
            java.lang.Object r7 = r1.get(r7)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzeq r7 = (com.google.android.gms.internal.measurement.zzeq) r7     // Catch:{ all -> 0x0a7c }
            if (r7 != 0) goto L_0x0784
            com.google.android.gms.internal.measurement.zzei r7 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r8 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r8 = r8.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.String r12 = r11.name     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzeq r7 = r7.zzf(r8, r12)     // Catch:{ all -> 0x0a7c }
            if (r7 != 0) goto L_0x0784
            com.google.android.gms.internal.measurement.zzfg r7 = r37.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzip()     // Catch:{ all -> 0x0a7c }
            java.lang.String r8 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzkq r12 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r12 = r12.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.String r15 = r11.name     // Catch:{ all -> 0x0a7c }
            r7.zze(r8, r12, r15)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzeq r7 = new com.google.android.gms.internal.measurement.zzeq     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r8 = r3.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r8 = r8.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.String r12 = r11.name     // Catch:{ all -> 0x0a7c }
            r26 = 1
            r28 = 1
            java.lang.Long r15 = r11.zzatb     // Catch:{ all -> 0x0a7c }
            long r30 = r15.longValue()     // Catch:{ all -> 0x0a7c }
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r23 = r7
            r24 = r8
            r25 = r12
            r23.<init>(r24, r25, r26, r28, r30, r32, r34, r35, r36)     // Catch:{ all -> 0x0a7c }
        L_0x0784:
            r37.zzgb()     // Catch:{ all -> 0x0a7c }
            java.lang.String r8 = "_eid"
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzka.zzb(r11, r8)     // Catch:{ all -> 0x0a7c }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0a7c }
            if (r8 == 0) goto L_0x0793
            r12 = 1
            goto L_0x0794
        L_0x0793:
            r12 = 0
        L_0x0794:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0a7c }
            r15 = 1
            if (r6 != r15) goto L_0x07bd
            int r6 = r10 + 1
            r2[r10] = r11     // Catch:{ all -> 0x0a7c }
            boolean r8 = r12.booleanValue()     // Catch:{ all -> 0x0a7c }
            if (r8 == 0) goto L_0x072c
            java.lang.Long r8 = r7.zzafv     // Catch:{ all -> 0x0a7c }
            if (r8 != 0) goto L_0x07b1
            java.lang.Long r8 = r7.zzafw     // Catch:{ all -> 0x0a7c }
            if (r8 != 0) goto L_0x07b1
            java.lang.Boolean r8 = r7.zzafx     // Catch:{ all -> 0x0a7c }
            if (r8 == 0) goto L_0x072c
        L_0x07b1:
            r8 = 0
            com.google.android.gms.internal.measurement.zzeq r7 = r7.zza(r8, r8, r8)     // Catch:{ all -> 0x0a7c }
            java.lang.String r8 = r11.name     // Catch:{ all -> 0x0a7c }
            r1.put(r8, r7)     // Catch:{ all -> 0x0a7c }
            goto L_0x072c
        L_0x07bd:
            int r15 = r5.nextInt(r6)     // Catch:{ all -> 0x0a7c }
            if (r15 != 0) goto L_0x07fe
            r37.zzgb()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r8 = r11.zzata     // Catch:{ all -> 0x0a7c }
            r15 = r5
            long r5 = (long) r6     // Catch:{ all -> 0x0a7c }
            java.lang.Long r13 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r8 = com.google.android.gms.internal.measurement.zzka.zza((com.google.android.gms.internal.measurement.zzko[]) r8, (java.lang.String) r14, (java.lang.Object) r13)     // Catch:{ all -> 0x0a7c }
            r11.zzata = r8     // Catch:{ all -> 0x0a7c }
            int r8 = r10 + 1
            r2[r10] = r11     // Catch:{ all -> 0x0a7c }
            boolean r10 = r12.booleanValue()     // Catch:{ all -> 0x0a7c }
            if (r10 == 0) goto L_0x07e7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a7c }
            r6 = 0
            com.google.android.gms.internal.measurement.zzeq r7 = r7.zza(r6, r5, r6)     // Catch:{ all -> 0x0a7c }
        L_0x07e7:
            java.lang.String r5 = r11.name     // Catch:{ all -> 0x0a7c }
            java.lang.Long r6 = r11.zzatb     // Catch:{ all -> 0x0a7c }
            long r10 = r6.longValue()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzeq r6 = r7.zzad(r10)     // Catch:{ all -> 0x0a7c }
            r1.put(r5, r6)     // Catch:{ all -> 0x0a7c }
            r13 = r3
            r23 = r4
            r10 = r8
            r24 = r15
            goto L_0x0870
        L_0x07fe:
            r23 = r4
            r15 = r5
            r5 = r3
            long r3 = r7.zzafu     // Catch:{ all -> 0x0a7c }
            r24 = r15
            java.lang.Long r15 = r11.zzatb     // Catch:{ all -> 0x0a7c }
            long r25 = r15.longValue()     // Catch:{ all -> 0x0a7c }
            long r25 = r25 - r3
            long r3 = java.lang.Math.abs(r25)     // Catch:{ all -> 0x0a7c }
            r25 = 86400000(0x5265c00, double:4.2687272E-316)
            int r15 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r15 < 0) goto L_0x085f
            r37.zzgb()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r3 = r11.zzata     // Catch:{ all -> 0x0a7c }
            java.lang.Long r4 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r3 = com.google.android.gms.internal.measurement.zzka.zza((com.google.android.gms.internal.measurement.zzko[]) r3, (java.lang.String) r13, (java.lang.Object) r4)     // Catch:{ all -> 0x0a7c }
            r11.zzata = r3     // Catch:{ all -> 0x0a7c }
            r37.zzgb()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r3 = r11.zzata     // Catch:{ all -> 0x0a7c }
            r13 = r5
            long r4 = (long) r6     // Catch:{ all -> 0x0a7c }
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzko[] r3 = com.google.android.gms.internal.measurement.zzka.zza((com.google.android.gms.internal.measurement.zzko[]) r3, (java.lang.String) r14, (java.lang.Object) r6)     // Catch:{ all -> 0x0a7c }
            r11.zzata = r3     // Catch:{ all -> 0x0a7c }
            int r3 = r10 + 1
            r2[r10] = r11     // Catch:{ all -> 0x0a7c }
            boolean r6 = r12.booleanValue()     // Catch:{ all -> 0x0a7c }
            if (r6 == 0) goto L_0x084e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0a7c }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0a7c }
            r6 = 0
            com.google.android.gms.internal.measurement.zzeq r7 = r7.zza(r6, r4, r5)     // Catch:{ all -> 0x0a7c }
        L_0x084e:
            java.lang.String r4 = r11.name     // Catch:{ all -> 0x0a7c }
            java.lang.Long r5 = r11.zzatb     // Catch:{ all -> 0x0a7c }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzeq r5 = r7.zzad(r5)     // Catch:{ all -> 0x0a7c }
            r1.put(r4, r5)     // Catch:{ all -> 0x0a7c }
            r10 = r3
            goto L_0x0870
        L_0x085f:
            r13 = r5
            boolean r3 = r12.booleanValue()     // Catch:{ all -> 0x0a7c }
            if (r3 == 0) goto L_0x0870
            java.lang.String r3 = r11.name     // Catch:{ all -> 0x0a7c }
            r4 = 0
            com.google.android.gms.internal.measurement.zzeq r5 = r7.zza(r8, r4, r4)     // Catch:{ all -> 0x0a7c }
            r1.put(r3, r5)     // Catch:{ all -> 0x0a7c }
        L_0x0870:
            int r9 = r9 + 1
            r6 = r37
            r3 = r13
            r7 = r21
            r8 = r22
            r4 = r23
            r5 = r24
            goto L_0x062e
        L_0x087f:
            r13 = r3
            r3 = r4
            com.google.android.gms.internal.measurement.zzkn[] r4 = r3.zzati     // Catch:{ all -> 0x0a7c }
            int r4 = r4.length     // Catch:{ all -> 0x0a7c }
            if (r10 >= r4) goto L_0x088e
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r10)     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkn[] r2 = (com.google.android.gms.internal.measurement.zzkn[]) r2     // Catch:{ all -> 0x0a7c }
            r3.zzati = r2     // Catch:{ all -> 0x0a7c }
        L_0x088e:
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0a7c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0a7c }
        L_0x0896:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0a7c }
            if (r2 == 0) goto L_0x08b2
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0a7c }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzei r4 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzeq r2 = (com.google.android.gms.internal.measurement.zzeq) r2     // Catch:{ all -> 0x0a7c }
            r4.zza((com.google.android.gms.internal.measurement.zzeq) r2)     // Catch:{ all -> 0x0a7c }
            goto L_0x0896
        L_0x08b0:
            r13 = r3
            r3 = r4
        L_0x08b2:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0a7c }
            r3.zzatl = r1     // Catch:{ all -> 0x0a7c }
            r1 = -9223372036854775808
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0a7c }
            r3.zzatm = r1     // Catch:{ all -> 0x0a7c }
            r1 = 0
        L_0x08c6:
            com.google.android.gms.internal.measurement.zzkn[] r2 = r3.zzati     // Catch:{ all -> 0x0a7c }
            int r4 = r2.length     // Catch:{ all -> 0x0a7c }
            if (r1 >= r4) goto L_0x08f8
            r2 = r2[r1]     // Catch:{ all -> 0x0a7c }
            java.lang.Long r4 = r2.zzatb     // Catch:{ all -> 0x0a7c }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0a7c }
            java.lang.Long r6 = r3.zzatl     // Catch:{ all -> 0x0a7c }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0a7c }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x08e1
            java.lang.Long r4 = r2.zzatb     // Catch:{ all -> 0x0a7c }
            r3.zzatl = r4     // Catch:{ all -> 0x0a7c }
        L_0x08e1:
            java.lang.Long r4 = r2.zzatb     // Catch:{ all -> 0x0a7c }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0a7c }
            java.lang.Long r6 = r3.zzatm     // Catch:{ all -> 0x0a7c }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0a7c }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x08f5
            java.lang.Long r2 = r2.zzatb     // Catch:{ all -> 0x0a7c }
            r3.zzatm = r2     // Catch:{ all -> 0x0a7c }
        L_0x08f5:
            int r1 = r1 + 1
            goto L_0x08c6
        L_0x08f8:
            r1 = r13
            com.google.android.gms.internal.measurement.zzkq r2 = r1.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r2 = r2.zzti     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzei r4 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzdy r4 = r4.zzbc(r2)     // Catch:{ all -> 0x0a7c }
            if (r4 != 0) goto L_0x091d
            com.google.android.gms.internal.measurement.zzfg r4 = r37.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzim()     // Catch:{ all -> 0x0a7c }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzkq r6 = r1.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r6.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r6)     // Catch:{ all -> 0x0a7c }
            r4.zzg(r5, r6)     // Catch:{ all -> 0x0a7c }
            goto L_0x0979
        L_0x091d:
            com.google.android.gms.internal.measurement.zzkn[] r5 = r3.zzati     // Catch:{ all -> 0x0a7c }
            int r5 = r5.length     // Catch:{ all -> 0x0a7c }
            if (r5 <= 0) goto L_0x0979
            long r5 = r4.zzgl()     // Catch:{ all -> 0x0a7c }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0931
            java.lang.Long r10 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a7c }
            goto L_0x0932
        L_0x0931:
            r10 = 0
        L_0x0932:
            r3.zzato = r10     // Catch:{ all -> 0x0a7c }
            long r7 = r4.zzgk()     // Catch:{ all -> 0x0a7c }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x093f
            goto L_0x0940
        L_0x093f:
            r5 = r7
        L_0x0940:
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0949
            java.lang.Long r10 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a7c }
            goto L_0x094a
        L_0x0949:
            r10 = 0
        L_0x094a:
            r3.zzatn = r10     // Catch:{ all -> 0x0a7c }
            r4.zzgt()     // Catch:{ all -> 0x0a7c }
            long r5 = r4.zzgq()     // Catch:{ all -> 0x0a7c }
            int r6 = (int) r5     // Catch:{ all -> 0x0a7c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0a7c }
            r3.zzaty = r5     // Catch:{ all -> 0x0a7c }
            java.lang.Long r5 = r3.zzatl     // Catch:{ all -> 0x0a7c }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0a7c }
            r4.zzm(r5)     // Catch:{ all -> 0x0a7c }
            java.lang.Long r5 = r3.zzatm     // Catch:{ all -> 0x0a7c }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0a7c }
            r4.zzn(r5)     // Catch:{ all -> 0x0a7c }
            java.lang.String r5 = r4.zzhb()     // Catch:{ all -> 0x0a7c }
            r3.zzaek = r5     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzei r5 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            r5.zza((com.google.android.gms.internal.measurement.zzdy) r4)     // Catch:{ all -> 0x0a7c }
        L_0x0979:
            com.google.android.gms.internal.measurement.zzkn[] r4 = r3.zzati     // Catch:{ all -> 0x0a7c }
            int r4 = r4.length     // Catch:{ all -> 0x0a7c }
            if (r4 <= 0) goto L_0x09c3
            com.google.android.gms.internal.measurement.zzgf r4 = r37.zzkm()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkq r5 = r1.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r5 = r5.zzti     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzkk r4 = r4.zzbu(r5)     // Catch:{ all -> 0x0a7c }
            if (r4 == 0) goto L_0x0994
            java.lang.Long r4 = r4.zzasp     // Catch:{ all -> 0x0a7c }
            if (r4 != 0) goto L_0x0991
            goto L_0x0994
        L_0x0991:
            r3.zzauf = r4     // Catch:{ all -> 0x0a7c }
            goto L_0x09ba
        L_0x0994:
            com.google.android.gms.internal.measurement.zzkq r4 = r1.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r4 = r4.zzadm     // Catch:{ all -> 0x0a7c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a7c }
            if (r4 == 0) goto L_0x09a5
            r4 = -1
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0a7c }
            goto L_0x0991
        L_0x09a5:
            com.google.android.gms.internal.measurement.zzfg r4 = r37.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzip()     // Catch:{ all -> 0x0a7c }
            java.lang.String r5 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzkq r6 = r1.zzaqv     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = r6.zzti     // Catch:{ all -> 0x0a7c }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r6)     // Catch:{ all -> 0x0a7c }
            r4.zzg(r5, r6)     // Catch:{ all -> 0x0a7c }
        L_0x09ba:
            com.google.android.gms.internal.measurement.zzei r4 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            r10 = r20
            r4.zza((com.google.android.gms.internal.measurement.zzkq) r3, (boolean) r10)     // Catch:{ all -> 0x0a7c }
        L_0x09c3:
            com.google.android.gms.internal.measurement.zzei r3 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            java.util.List<java.lang.Long> r1 = r1.zzaqw     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch:{ all -> 0x0a7c }
            r3.zzab()     // Catch:{ all -> 0x0a7c }
            r3.zzch()     // Catch:{ all -> 0x0a7c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a7c }
            java.lang.String r5 = "rowid in ("
            r4.<init>(r5)     // Catch:{ all -> 0x0a7c }
            r5 = 0
        L_0x09da:
            int r6 = r1.size()     // Catch:{ all -> 0x0a7c }
            if (r5 >= r6) goto L_0x09f7
            if (r5 == 0) goto L_0x09e7
            java.lang.String r6 = ","
            r4.append(r6)     // Catch:{ all -> 0x0a7c }
        L_0x09e7:
            java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x0a7c }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0a7c }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0a7c }
            r4.append(r6)     // Catch:{ all -> 0x0a7c }
            int r5 = r5 + 1
            goto L_0x09da
        L_0x09f7:
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ all -> 0x0a7c }
            android.database.sqlite.SQLiteDatabase r5 = r3.getWritableDatabase()     // Catch:{ all -> 0x0a7c }
            java.lang.String r6 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0a7c }
            r7 = 0
            int r4 = r5.delete(r6, r4, r7)     // Catch:{ all -> 0x0a7c }
            int r5 = r1.size()     // Catch:{ all -> 0x0a7c }
            if (r4 == r5) goto L_0x0a2a
            com.google.android.gms.internal.measurement.zzfg r3 = r3.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch:{ all -> 0x0a7c }
            java.lang.String r5 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0a7c }
            int r1 = r1.size()     // Catch:{ all -> 0x0a7c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0a7c }
            r3.zze(r5, r4, r1)     // Catch:{ all -> 0x0a7c }
        L_0x0a2a:
            com.google.android.gms.internal.measurement.zzei r1 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            android.database.sqlite.SQLiteDatabase r3 = r1.getWritableDatabase()     // Catch:{ all -> 0x0a7c }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0a41 }
            r6 = 0
            r5[r6] = r2     // Catch:{ SQLiteException -> 0x0a41 }
            r6 = 1
            r5[r6] = r2     // Catch:{ SQLiteException -> 0x0a41 }
            r3.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x0a41 }
            goto L_0x0a54
        L_0x0a41:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.internal.measurement.zzfg r1 = r1.zzge()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch:{ all -> 0x0a7c }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = com.google.android.gms.internal.measurement.zzfg.zzbm(r2)     // Catch:{ all -> 0x0a7c }
            r1.zze(r4, r2, r3)     // Catch:{ all -> 0x0a7c }
        L_0x0a54:
            com.google.android.gms.internal.measurement.zzei r1 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzei r1 = r37.zzix()
            r1.endTransaction()
            r1 = 1
            return r1
        L_0x0a64:
            com.google.android.gms.internal.measurement.zzei r1 = r37.zzix()     // Catch:{ all -> 0x0a7c }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x0a7c }
            com.google.android.gms.internal.measurement.zzei r1 = r37.zzix()
            r1.endTransaction()
            r1 = 0
            return r1
        L_0x0a74:
            r0 = move-exception
            r1 = r0
        L_0x0a76:
            if (r4 == 0) goto L_0x0a7b
            r4.close()     // Catch:{ all -> 0x0a7c }
        L_0x0a7b:
            throw r1     // Catch:{ all -> 0x0a7c }
        L_0x0a7c:
            r0 = move-exception
            r1 = r0
            com.google.android.gms.internal.measurement.zzei r2 = r37.zzix()
            r2.endTransaction()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzd(java.lang.String, long):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzdy zzg(com.google.android.gms.internal.measurement.zzdz r9) {
        /*
            r8 = this;
            r8.zzab()
            r8.zzkq()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            java.lang.String r0 = r9.packageName
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.internal.measurement.zzei r0 = r8.zzix()
            java.lang.String r1 = r9.packageName
            com.google.android.gms.internal.measurement.zzdy r0 = r0.zzbc(r1)
            com.google.android.gms.internal.measurement.zzfr r1 = r8.zzgf()
            java.lang.String r2 = r9.packageName
            java.lang.String r1 = r1.zzbp(r2)
            r2 = 1
            if (r0 != 0) goto L_0x0040
            com.google.android.gms.internal.measurement.zzdy r0 = new com.google.android.gms.internal.measurement.zzdy
            com.google.android.gms.internal.measurement.zzgl r3 = r8.zzacw
            java.lang.String r4 = r9.packageName
            r0.<init>(r3, r4)
            com.google.android.gms.internal.measurement.zzgl r3 = r8.zzacw
            com.google.android.gms.internal.measurement.zzfb r3 = r3.zzfv()
            java.lang.String r3 = r3.zzii()
            r0.zzal(r3)
            r0.zzan(r1)
        L_0x003e:
            r1 = 1
            goto L_0x005c
        L_0x0040:
            java.lang.String r3 = r0.zzgi()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005b
            r0.zzan(r1)
            com.google.android.gms.internal.measurement.zzgl r1 = r8.zzacw
            com.google.android.gms.internal.measurement.zzfb r1 = r1.zzfv()
            java.lang.String r1 = r1.zzii()
            r0.zzal(r1)
            goto L_0x003e
        L_0x005b:
            r1 = 0
        L_0x005c:
            java.lang.String r3 = r9.zzadm
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0076
            java.lang.String r3 = r9.zzadm
            java.lang.String r4 = r0.getGmpAppId()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0076
            java.lang.String r1 = r9.zzadm
            r0.zzam(r1)
            r1 = 1
        L_0x0076:
            java.lang.String r3 = r9.zzado
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0090
            java.lang.String r3 = r9.zzado
            java.lang.String r4 = r0.zzgj()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0090
            java.lang.String r1 = r9.zzado
            r0.zzao(r1)
            r1 = 1
        L_0x0090:
            long r3 = r9.zzadu
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00a6
            long r5 = r0.zzgo()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00a6
            long r3 = r9.zzadu
            r0.zzp(r3)
            r1 = 1
        L_0x00a6:
            java.lang.String r3 = r9.zzth
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = r9.zzth
            java.lang.String r4 = r0.zzag()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r1 = r9.zzth
            r0.setAppVersion(r1)
            r1 = 1
        L_0x00c0:
            long r3 = r9.zzads
            long r5 = r0.zzgm()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00d0
            long r3 = r9.zzads
            r0.zzo(r3)
            r1 = 1
        L_0x00d0:
            java.lang.String r3 = r9.zzadt
            if (r3 == 0) goto L_0x00e4
            java.lang.String r4 = r0.zzgn()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00e4
            java.lang.String r1 = r9.zzadt
            r0.zzap(r1)
            r1 = 1
        L_0x00e4:
            long r3 = r9.zzadv
            long r5 = r0.zzgp()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00f4
            long r3 = r9.zzadv
            r0.zzq(r3)
            r1 = 1
        L_0x00f4:
            boolean r3 = r9.zzadw
            boolean r4 = r0.isMeasurementEnabled()
            if (r3 == r4) goto L_0x0102
            boolean r1 = r9.zzadw
            r0.setMeasurementEnabled(r1)
            r1 = 1
        L_0x0102:
            java.lang.String r3 = r9.zzaek
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x011c
            java.lang.String r3 = r9.zzaek
            java.lang.String r4 = r0.zzha()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x011c
            java.lang.String r1 = r9.zzaek
            r0.zzaq(r1)
            r1 = 1
        L_0x011c:
            long r3 = r9.zzadx
            long r5 = r0.zzhc()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x012c
            long r3 = r9.zzadx
            r0.zzaa(r3)
            r1 = 1
        L_0x012c:
            boolean r3 = r9.zzady
            boolean r4 = r0.zzhd()
            if (r3 == r4) goto L_0x013a
            boolean r1 = r9.zzady
            r0.zzd(r1)
            r1 = 1
        L_0x013a:
            boolean r3 = r9.zzadz
            boolean r4 = r0.zzhe()
            if (r3 == r4) goto L_0x0148
            boolean r9 = r9.zzadz
            r0.zze(r9)
            goto L_0x0149
        L_0x0148:
            r2 = r1
        L_0x0149:
            if (r2 == 0) goto L_0x0152
            com.google.android.gms.internal.measurement.zzei r9 = r8.zzix()
            r9.zza((com.google.android.gms.internal.measurement.zzdy) r0)
        L_0x0152:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzg(com.google.android.gms.internal.measurement.zzdz):com.google.android.gms.internal.measurement.zzdy");
    }

    private final zzgf zzkm() {
        zza((zzjq) this.zzaqa);
        return this.zzaqa;
    }

    private final zzfp zzko() {
        zzfp zzfp = this.zzaqd;
        if (zzfp != null) {
            return zzfp;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzjn zzkp() {
        zza((zzjq) this.zzaqe);
        return this.zzaqe;
    }

    private final long zzkr() {
        long currentTimeMillis = zzbt().currentTimeMillis();
        zzfr zzgf = zzgf();
        zzgf.zzch();
        zzgf.zzab();
        long j = zzgf.zzajy.get();
        if (j == 0) {
            j = 1 + ((long) zzgf.zzgb().zzlc().nextInt(Downloads.MAX_RETYR_AFTER));
            zzgf.zzajy.set(j);
        }
        return ((((currentTimeMillis + j) / 1000) / 60) / 60) / 24;
    }

    private final boolean zzkt() {
        zzab();
        zzkq();
        return zzix().zzhs() || !TextUtils.isEmpty(zzix().zzhn());
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzku() {
        /*
            r20 = this;
            r0 = r20
            r20.zzab()
            r20.zzkq()
            boolean r1 = r20.zzky()
            if (r1 != 0) goto L_0x000f
            return
        L_0x000f:
            long r1 = r0.zzaqh
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0050
            com.google.android.gms.common.util.Clock r1 = r20.zzbt()
            long r1 = r1.elapsedRealtime()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.zzaqh
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004e
            com.google.android.gms.internal.measurement.zzfg r1 = r20.zzge()
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzit()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.zzg(r3, r2)
            com.google.android.gms.internal.measurement.zzfp r1 = r20.zzko()
            r1.unregister()
            com.google.android.gms.internal.measurement.zzjn r1 = r20.zzkp()
            r1.cancel()
            return
        L_0x004e:
            r0.zzaqh = r3
        L_0x0050:
            com.google.android.gms.internal.measurement.zzgl r1 = r0.zzacw
            boolean r1 = r1.zzjv()
            if (r1 == 0) goto L_0x0222
            boolean r1 = r20.zzkt()
            if (r1 != 0) goto L_0x0060
            goto L_0x0222
        L_0x0060:
            com.google.android.gms.common.util.Clock r1 = r20.zzbt()
            long r1 = r1.currentTimeMillis()
            com.google.android.gms.internal.measurement.zzex<java.lang.Long> r5 = com.google.android.gms.internal.measurement.zzew.zzahi
            java.lang.Object r5 = r5.get()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.internal.measurement.zzei r7 = r20.zzix()
            boolean r7 = r7.zzht()
            if (r7 != 0) goto L_0x008f
            com.google.android.gms.internal.measurement.zzei r7 = r20.zzix()
            boolean r7 = r7.zzho()
            if (r7 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r7 = 0
            goto L_0x0090
        L_0x008f:
            r7 = 1
        L_0x0090:
            if (r7 == 0) goto L_0x00ae
            com.google.android.gms.internal.measurement.zzef r9 = r20.zzgg()
            java.lang.String r9 = r9.zzhj()
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x00ab
            java.lang.String r10 = ".none."
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00ab
            com.google.android.gms.internal.measurement.zzex<java.lang.Long> r9 = com.google.android.gms.internal.measurement.zzew.zzahd
            goto L_0x00b0
        L_0x00ab:
            com.google.android.gms.internal.measurement.zzex<java.lang.Long> r9 = com.google.android.gms.internal.measurement.zzew.zzahc
            goto L_0x00b0
        L_0x00ae:
            com.google.android.gms.internal.measurement.zzex<java.lang.Long> r9 = com.google.android.gms.internal.measurement.zzew.zzahb
        L_0x00b0:
            java.lang.Object r9 = r9.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            com.google.android.gms.internal.measurement.zzfr r11 = r20.zzgf()
            com.google.android.gms.internal.measurement.zzfu r11 = r11.zzaju
            long r11 = r11.get()
            com.google.android.gms.internal.measurement.zzfr r13 = r20.zzgf()
            com.google.android.gms.internal.measurement.zzfu r13 = r13.zzajv
            long r13 = r13.get()
            com.google.android.gms.internal.measurement.zzei r15 = r20.zzix()
            r16 = r9
            long r8 = r15.zzhq()
            com.google.android.gms.internal.measurement.zzei r10 = r20.zzix()
            r18 = r5
            long r5 = r10.zzhr()
            long r5 = java.lang.Math.max(r8, r5)
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00f1
        L_0x00ee:
            r10 = r3
            goto L_0x0165
        L_0x00f1:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r11 = r11 - r1
            long r8 = java.lang.Math.abs(r11)
            long r8 = r1 - r8
            long r13 = r13 - r1
            long r10 = java.lang.Math.abs(r13)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r5 + r18
            if (r7 == 0) goto L_0x0117
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0117
            long r10 = java.lang.Math.min(r5, r8)
            long r10 = r10 + r16
        L_0x0117:
            com.google.android.gms.internal.measurement.zzka r7 = r20.zzgb()
            r12 = r16
            boolean r7 = r7.zza((long) r8, (long) r12)
            if (r7 != 0) goto L_0x0125
            long r10 = r8 + r12
        L_0x0125:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0165
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0165
            r5 = 0
        L_0x012e:
            r6 = 20
            com.google.android.gms.internal.measurement.zzex<java.lang.Integer> r7 = com.google.android.gms.internal.measurement.zzew.zzahk
            java.lang.Object r7 = r7.get()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x00ee
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.internal.measurement.zzex<java.lang.Long> r9 = com.google.android.gms.internal.measurement.zzew.zzahj
            java.lang.Object r9 = r9.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r10 = r10 + r12
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0162
            goto L_0x0165
        L_0x0162:
            int r5 = r5 + 1
            goto L_0x012e
        L_0x0165:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0185
            com.google.android.gms.internal.measurement.zzfg r1 = r20.zzge()
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzit()
            java.lang.String r2 = "Next upload time is 0"
            r1.log(r2)
            com.google.android.gms.internal.measurement.zzfp r1 = r20.zzko()
            r1.unregister()
            com.google.android.gms.internal.measurement.zzjn r1 = r20.zzkp()
            r1.cancel()
            return
        L_0x0185:
            com.google.android.gms.internal.measurement.zzfk r1 = r20.zzkn()
            boolean r1 = r1.zzex()
            if (r1 != 0) goto L_0x01ab
            com.google.android.gms.internal.measurement.zzfg r1 = r20.zzge()
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzit()
            java.lang.String r2 = "No network"
            r1.log(r2)
            com.google.android.gms.internal.measurement.zzfp r1 = r20.zzko()
            r1.zzeu()
            com.google.android.gms.internal.measurement.zzjn r1 = r20.zzkp()
            r1.cancel()
            return
        L_0x01ab:
            com.google.android.gms.internal.measurement.zzfr r1 = r20.zzgf()
            com.google.android.gms.internal.measurement.zzfu r1 = r1.zzajw
            long r1 = r1.get()
            com.google.android.gms.internal.measurement.zzex<java.lang.Long> r5 = com.google.android.gms.internal.measurement.zzew.zzagz
            java.lang.Object r5 = r5.get()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.internal.measurement.zzka r7 = r20.zzgb()
            boolean r7 = r7.zza((long) r1, (long) r5)
            if (r7 != 0) goto L_0x01d4
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01d4:
            com.google.android.gms.internal.measurement.zzfp r1 = r20.zzko()
            r1.unregister()
            com.google.android.gms.common.util.Clock r1 = r20.zzbt()
            long r1 = r1.currentTimeMillis()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0209
            com.google.android.gms.internal.measurement.zzex<java.lang.Long> r1 = com.google.android.gms.internal.measurement.zzew.zzahe
            java.lang.Object r1 = r1.get()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.internal.measurement.zzfr r1 = r20.zzgf()
            com.google.android.gms.internal.measurement.zzfu r1 = r1.zzaju
            com.google.android.gms.common.util.Clock r2 = r20.zzbt()
            long r2 = r2.currentTimeMillis()
            r1.set(r2)
        L_0x0209:
            com.google.android.gms.internal.measurement.zzfg r1 = r20.zzge()
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzit()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.zzg(r3, r2)
            com.google.android.gms.internal.measurement.zzjn r1 = r20.zzkp()
            r1.zzh(r10)
            return
        L_0x0222:
            com.google.android.gms.internal.measurement.zzfg r1 = r20.zzge()
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzit()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.log(r2)
            com.google.android.gms.internal.measurement.zzfp r1 = r20.zzko()
            r1.unregister()
            com.google.android.gms.internal.measurement.zzjn r1 = r20.zzkp()
            r1.cancel()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzku():void");
    }

    private final void zzkv() {
        zzab();
        if (this.zzaql || this.zzaqm || this.zzaqn) {
            zzge().zzit().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzaql), Boolean.valueOf(this.zzaqm), Boolean.valueOf(this.zzaqn));
            return;
        }
        zzge().zzit().log("Stopping uploading service(s)");
        List<Runnable> list = this.zzaqi;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.zzaqi.clear();
        }
    }

    private final boolean zzkw() {
        String str;
        zzfi zzfi;
        zzab();
        try {
            FileChannel channel = new RandomAccessFile(new File(getContext().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzaqp = channel;
            FileLock tryLock = channel.tryLock();
            this.zzaqo = tryLock;
            if (tryLock != null) {
                zzge().zzit().log("Storage concurrent access okay");
                return true;
            }
            zzge().zzim().log("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            e = e;
            zzfi = zzge().zzim();
            str = "Failed to acquire storage lock";
            zzfi.zzg(str, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            zzfi = zzge().zzim();
            str = "Failed to access storage lock file";
            zzfi.zzg(str, e);
            return false;
        }
    }

    private final boolean zzky() {
        zzab();
        zzkq();
        return this.zzaqg;
    }

    public Context getContext() {
        return this.zzacw.getContext();
    }

    public void start() {
        zzab();
        zzix().zzhp();
        if (zzgf().zzaju.get() == 0) {
            zzgf().zzaju.set(zzbt().currentTimeMillis());
        }
        zzku();
    }

    /* JADX INFO: finally extract failed */
    public final void zza(int i, Throwable th, byte[] bArr, String str) {
        zzei zzix;
        zzab();
        zzkq();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th4) {
                this.zzaqm = false;
                zzkv();
                throw th4;
            }
        }
        List<Long> list = this.zzaqq;
        this.zzaqq = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                zzgf().zzaju.set(zzbt().currentTimeMillis());
                zzgf().zzajv.set(0);
                zzku();
                zzge().zzit().zze("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzix().beginTransaction();
                try {
                    for (Long next : list) {
                        try {
                            zzix = zzix();
                            long longValue = next.longValue();
                            zzix.zzab();
                            zzix.zzch();
                            if (zzix.getWritableDatabase().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            zzix.zzge().zzim().zzg("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List<Long> list2 = this.zzaqr;
                            if (list2 == null || !list2.contains(next)) {
                                throw e2;
                            }
                        }
                    }
                    zzix().setTransactionSuccessful();
                    zzix().endTransaction();
                    this.zzaqr = null;
                    if (!zzkn().zzex() || !zzkt()) {
                        this.zzaqs = -1;
                        zzku();
                    } else {
                        zzks();
                    }
                    this.zzaqh = 0;
                } catch (Throwable th5) {
                    zzix().endTransaction();
                    throw th5;
                }
            } catch (SQLiteException e3) {
                zzge().zzim().zzg("Database error while trying to delete uploaded bundles", e3);
                this.zzaqh = zzbt().elapsedRealtime();
                zzge().zzit().zzg("Disable upload, time", Long.valueOf(this.zzaqh));
            }
        } else {
            zzge().zzit().zze("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            zzgf().zzajv.set(zzbt().currentTimeMillis());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                zzgf().zzajw.set(zzbt().currentTimeMillis());
            }
            if (zzgg().zzax(str)) {
                zzix().zzc(list);
            }
            zzku();
        }
        this.zzaqm = false;
        zzkv();
    }

    public final void zza(zzgl zzgl) {
        this.zzacw = zzgl;
    }

    public final void zza(zzjw zzjw) {
        zzab();
        zzei zzei = new zzei(this.zzacw);
        zzei.zzm();
        this.zzaqc = zzei;
        zzgg().zza(this.zzaqa);
        zzeb zzeb = new zzeb(this.zzacw);
        zzeb.zzm();
        this.zzaqf = zzeb;
        zzjn zzjn = new zzjn(this.zzacw);
        zzjn.zzm();
        this.zzaqe = zzjn;
        this.zzaqd = new zzfp(this.zzacw);
        if (this.zzaqj != this.zzaqk) {
            zzge().zzim().zze("Not all upload components initialized", Integer.valueOf(this.zzaqj), Integer.valueOf(this.zzaqk));
        }
        this.zzvo = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zza(com.google.android.gms.internal.measurement.zzeu r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r0 = r31
            r15 = r32
            java.lang.String r2 = "_et"
            java.lang.String r3 = "_iap"
            r30.zzkq()
            r30.zzab()
            com.google.android.gms.internal.measurement.zzgl.zzfr()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r31)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r32)
            com.google.android.gms.internal.measurement.zzkp r14 = new com.google.android.gms.internal.measurement.zzkp
            r14.<init>()
            com.google.android.gms.internal.measurement.zzei r4 = r30.zzix()
            r4.beginTransaction()
            com.google.android.gms.internal.measurement.zzei r4 = r30.zzix()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzdy r13 = r4.zzbc(r15)     // Catch:{ all -> 0x04ae }
            r11 = 0
            if (r13 != 0) goto L_0x0047
            com.google.android.gms.internal.measurement.zzfg r0 = r30.zzge()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzis()     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = "Log and bundle not available. package_name"
            r0.zzg(r2, r15)     // Catch:{ all -> 0x04ae }
        L_0x003d:
            byte[] r0 = new byte[r11]     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzei r2 = r30.zzix()
            r2.endTransaction()
            return r0
        L_0x0047:
            boolean r4 = r13.isMeasurementEnabled()     // Catch:{ all -> 0x04ae }
            if (r4 != 0) goto L_0x005b
            com.google.android.gms.internal.measurement.zzfg r0 = r30.zzge()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzis()     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = "Log and bundle disabled. package_name"
            r0.zzg(r2, r15)     // Catch:{ all -> 0x04ae }
            goto L_0x003d
        L_0x005b:
            java.lang.String r4 = r0.name     // Catch:{ all -> 0x04ae }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x04ae }
            if (r4 != 0) goto L_0x006d
            java.lang.String r4 = "ecommerce_purchase"
            java.lang.String r5 = r0.name     // Catch:{ all -> 0x04ae }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x04ae }
            if (r4 == 0) goto L_0x0084
        L_0x006d:
            boolean r4 = r1.zza((java.lang.String) r15, (com.google.android.gms.internal.measurement.zzeu) r0)     // Catch:{ all -> 0x04ae }
            if (r4 != 0) goto L_0x0084
            com.google.android.gms.internal.measurement.zzfg r4 = r30.zzge()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzip()     // Catch:{ all -> 0x04ae }
            java.lang.String r5 = "Failed to handle purchase event at single event bundle creation. appId"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r32)     // Catch:{ all -> 0x04ae }
            r4.zzg(r5, r6)     // Catch:{ all -> 0x04ae }
        L_0x0084:
            com.google.android.gms.internal.measurement.zzef r4 = r30.zzgg()     // Catch:{ all -> 0x04ae }
            boolean r4 = r4.zzav(r15)     // Catch:{ all -> 0x04ae }
            r16 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x04ae }
            if (r4 == 0) goto L_0x00d9
            java.lang.String r6 = "_e"
            java.lang.String r7 = r0.name     // Catch:{ all -> 0x04ae }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x04ae }
            if (r6 == 0) goto L_0x00d9
            com.google.android.gms.internal.measurement.zzer r6 = r0.zzafq     // Catch:{ all -> 0x04ae }
            if (r6 == 0) goto L_0x00ca
            int r6 = r6.size()     // Catch:{ all -> 0x04ae }
            if (r6 != 0) goto L_0x00a9
            goto L_0x00ca
        L_0x00a9:
            com.google.android.gms.internal.measurement.zzer r6 = r0.zzafq     // Catch:{ all -> 0x04ae }
            java.lang.Long r6 = r6.getLong(r2)     // Catch:{ all -> 0x04ae }
            if (r6 != 0) goto L_0x00c3
            com.google.android.gms.internal.measurement.zzfg r2 = r30.zzge()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = "The engagement event does not include duration. appId"
            java.lang.Object r7 = com.google.android.gms.internal.measurement.zzfg.zzbm(r32)     // Catch:{ all -> 0x04ae }
        L_0x00bf:
            r2.zzg(r6, r7)     // Catch:{ all -> 0x04ae }
            goto L_0x00d9
        L_0x00c3:
            com.google.android.gms.internal.measurement.zzer r5 = r0.zzafq     // Catch:{ all -> 0x04ae }
            java.lang.Long r5 = r5.getLong(r2)     // Catch:{ all -> 0x04ae }
            goto L_0x00d9
        L_0x00ca:
            com.google.android.gms.internal.measurement.zzfg r2 = r30.zzge()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = "The engagement event does not contain any parameters. appId"
            java.lang.Object r7 = com.google.android.gms.internal.measurement.zzfg.zzbm(r32)     // Catch:{ all -> 0x04ae }
            goto L_0x00bf
        L_0x00d9:
            com.google.android.gms.internal.measurement.zzkq r12 = new com.google.android.gms.internal.measurement.zzkq     // Catch:{ all -> 0x04ae }
            r12.<init>()     // Catch:{ all -> 0x04ae }
            r9 = 1
            com.google.android.gms.internal.measurement.zzkq[] r2 = new com.google.android.gms.internal.measurement.zzkq[r9]     // Catch:{ all -> 0x04ae }
            r2[r11] = r12     // Catch:{ all -> 0x04ae }
            r14.zzatf = r2     // Catch:{ all -> 0x04ae }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x04ae }
            r12.zzath = r2     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = "android"
            r12.zzatp = r2     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = r13.zzah()     // Catch:{ all -> 0x04ae }
            r12.zzti = r2     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = r13.zzgn()     // Catch:{ all -> 0x04ae }
            r12.zzadt = r2     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = r13.zzag()     // Catch:{ all -> 0x04ae }
            r12.zzth = r2     // Catch:{ all -> 0x04ae }
            long r6 = r13.zzgm()     // Catch:{ all -> 0x04ae }
            r18 = -2147483648(0xffffffff80000000, double:NaN)
            r10 = 0
            int r2 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r2 != 0) goto L_0x010f
            r2 = r10
            goto L_0x0114
        L_0x010f:
            int r2 = (int) r6     // Catch:{ all -> 0x04ae }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x04ae }
        L_0x0114:
            r12.zzaub = r2     // Catch:{ all -> 0x04ae }
            long r6 = r13.zzgo()     // Catch:{ all -> 0x04ae }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x04ae }
            r12.zzatt = r2     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = r13.getGmpAppId()     // Catch:{ all -> 0x04ae }
            r12.zzadm = r2     // Catch:{ all -> 0x04ae }
            long r6 = r13.zzgp()     // Catch:{ all -> 0x04ae }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x04ae }
            r12.zzatx = r2     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzgl r2 = r1.zzacw     // Catch:{ all -> 0x04ae }
            boolean r2 = r2.isEnabled()     // Catch:{ all -> 0x04ae }
            if (r2 == 0) goto L_0x014c
            boolean r2 = com.google.android.gms.internal.measurement.zzef.zzhk()     // Catch:{ all -> 0x04ae }
            if (r2 == 0) goto L_0x014c
            com.google.android.gms.internal.measurement.zzef r2 = r30.zzgg()     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = r12.zzti     // Catch:{ all -> 0x04ae }
            boolean r2 = r2.zzat(r6)     // Catch:{ all -> 0x04ae }
            if (r2 == 0) goto L_0x014c
            r12.zzauh = r10     // Catch:{ all -> 0x04ae }
        L_0x014c:
            com.google.android.gms.internal.measurement.zzfr r2 = r30.zzgf()     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = r13.zzah()     // Catch:{ all -> 0x04ae }
            android.util.Pair r2 = r2.zzbo(r6)     // Catch:{ all -> 0x04ae }
            boolean r6 = r13.zzhd()     // Catch:{ all -> 0x04ae }
            if (r6 == 0) goto L_0x0176
            if (r2 == 0) goto L_0x0176
            java.lang.Object r6 = r2.first     // Catch:{ all -> 0x04ae }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x04ae }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x04ae }
            if (r6 != 0) goto L_0x0176
            java.lang.Object r6 = r2.first     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x04ae }
            r12.zzatv = r6     // Catch:{ all -> 0x04ae }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x04ae }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x04ae }
            r12.zzatw = r2     // Catch:{ all -> 0x04ae }
        L_0x0176:
            com.google.android.gms.internal.measurement.zzeo r2 = r30.zzfw()     // Catch:{ all -> 0x04ae }
            r2.zzch()     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ all -> 0x04ae }
            r12.zzatr = r2     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzeo r2 = r30.zzfw()     // Catch:{ all -> 0x04ae }
            r2.zzch()     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x04ae }
            r12.zzatq = r2     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzeo r2 = r30.zzfw()     // Catch:{ all -> 0x04ae }
            long r6 = r2.zzic()     // Catch:{ all -> 0x04ae }
            int r2 = (int) r6     // Catch:{ all -> 0x04ae }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x04ae }
            r12.zzats = r2     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzeo r2 = r30.zzfw()     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = r2.zzid()     // Catch:{ all -> 0x04ae }
            r12.zzafn = r2     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = r13.getAppInstanceId()     // Catch:{ all -> 0x04ae }
            r12.zzadl = r2     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = r13.zzgj()     // Catch:{ all -> 0x04ae }
            r12.zzado = r2     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzei r2 = r30.zzix()     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = r13.zzah()     // Catch:{ all -> 0x04ae }
            java.util.List r2 = r2.zzbb(r6)     // Catch:{ all -> 0x04ae }
            int r6 = r2.size()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzks[] r6 = new com.google.android.gms.internal.measurement.zzks[r6]     // Catch:{ all -> 0x04ae }
            r12.zzatj = r6     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = "_lte"
            if (r4 == 0) goto L_0x0227
            com.google.android.gms.internal.measurement.zzei r7 = r30.zzix()     // Catch:{ all -> 0x04ae }
            java.lang.String r8 = r12.zzti     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzjz r7 = r7.zzh(r8, r6)     // Catch:{ all -> 0x04ae }
            if (r7 == 0) goto L_0x020d
            java.lang.Object r8 = r7.value     // Catch:{ all -> 0x04ae }
            if (r8 != 0) goto L_0x01da
            goto L_0x020d
        L_0x01da:
            long r18 = r5.longValue()     // Catch:{ all -> 0x04ae }
            int r8 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x0228
            com.google.android.gms.internal.measurement.zzjz r8 = new com.google.android.gms.internal.measurement.zzjz     // Catch:{ all -> 0x04ae }
            java.lang.String r10 = r12.zzti     // Catch:{ all -> 0x04ae }
            java.lang.String r20 = "auto"
            java.lang.String r21 = "_lte"
            com.google.android.gms.common.util.Clock r18 = r30.zzbt()     // Catch:{ all -> 0x04ae }
            long r22 = r18.currentTimeMillis()     // Catch:{ all -> 0x04ae }
            java.lang.Object r7 = r7.value     // Catch:{ all -> 0x04ae }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x04ae }
            long r18 = r7.longValue()     // Catch:{ all -> 0x04ae }
            long r26 = r5.longValue()     // Catch:{ all -> 0x04ae }
            long r18 = r18 + r26
            java.lang.Long r24 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x04ae }
            r18 = r8
            r19 = r10
            r18.<init>(r19, r20, r21, r22, r24)     // Catch:{ all -> 0x04ae }
            r7 = r8
            goto L_0x0228
        L_0x020d:
            com.google.android.gms.internal.measurement.zzjz r7 = new com.google.android.gms.internal.measurement.zzjz     // Catch:{ all -> 0x04ae }
            java.lang.String r8 = r12.zzti     // Catch:{ all -> 0x04ae }
            java.lang.String r20 = "auto"
            java.lang.String r21 = "_lte"
            com.google.android.gms.common.util.Clock r10 = r30.zzbt()     // Catch:{ all -> 0x04ae }
            long r22 = r10.currentTimeMillis()     // Catch:{ all -> 0x04ae }
            r18 = r7
            r19 = r8
            r24 = r5
            r18.<init>(r19, r20, r21, r22, r24)     // Catch:{ all -> 0x04ae }
            goto L_0x0228
        L_0x0227:
            r7 = 0
        L_0x0228:
            r8 = 0
            r10 = 0
        L_0x022a:
            int r11 = r2.size()     // Catch:{ all -> 0x04ae }
            if (r8 >= r11) goto L_0x028b
            com.google.android.gms.internal.measurement.zzks r11 = new com.google.android.gms.internal.measurement.zzks     // Catch:{ all -> 0x04ae }
            r11.<init>()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzks[] r9 = r12.zzatj     // Catch:{ all -> 0x04ae }
            r9[r8] = r11     // Catch:{ all -> 0x04ae }
            java.lang.Object r9 = r2.get(r8)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzjz r9 = (com.google.android.gms.internal.measurement.zzjz) r9     // Catch:{ all -> 0x04ae }
            java.lang.String r9 = r9.name     // Catch:{ all -> 0x04ae }
            r11.name = r9     // Catch:{ all -> 0x04ae }
            java.lang.Object r9 = r2.get(r8)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzjz r9 = (com.google.android.gms.internal.measurement.zzjz) r9     // Catch:{ all -> 0x04ae }
            r21 = r13
            r20 = r14
            long r13 = r9.zzaqz     // Catch:{ all -> 0x04ae }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x04ae }
            r11.zzaun = r9     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzka r9 = r30.zzgb()     // Catch:{ all -> 0x04ae }
            java.lang.Object r13 = r2.get(r8)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzjz r13 = (com.google.android.gms.internal.measurement.zzjz) r13     // Catch:{ all -> 0x04ae }
            java.lang.Object r13 = r13.value     // Catch:{ all -> 0x04ae }
            r9.zza((com.google.android.gms.internal.measurement.zzks) r11, (java.lang.Object) r13)     // Catch:{ all -> 0x04ae }
            if (r4 == 0) goto L_0x0283
            java.lang.String r9 = r11.name     // Catch:{ all -> 0x04ae }
            boolean r9 = r6.equals(r9)     // Catch:{ all -> 0x04ae }
            if (r9 == 0) goto L_0x0283
            java.lang.Object r9 = r7.value     // Catch:{ all -> 0x04ae }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x04ae }
            r11.zzate = r9     // Catch:{ all -> 0x04ae }
            com.google.android.gms.common.util.Clock r9 = r30.zzbt()     // Catch:{ all -> 0x04ae }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x04ae }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x04ae }
            r11.zzaun = r9     // Catch:{ all -> 0x04ae }
            r10 = r11
        L_0x0283:
            int r8 = r8 + 1
            r14 = r20
            r13 = r21
            r9 = 1
            goto L_0x022a
        L_0x028b:
            r21 = r13
            r20 = r14
            if (r4 == 0) goto L_0x02c0
            if (r10 != 0) goto L_0x02c0
            com.google.android.gms.internal.measurement.zzks r2 = new com.google.android.gms.internal.measurement.zzks     // Catch:{ all -> 0x04ae }
            r2.<init>()     // Catch:{ all -> 0x04ae }
            r2.name = r6     // Catch:{ all -> 0x04ae }
            com.google.android.gms.common.util.Clock r4 = r30.zzbt()     // Catch:{ all -> 0x04ae }
            long r8 = r4.currentTimeMillis()     // Catch:{ all -> 0x04ae }
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x04ae }
            r2.zzaun = r4     // Catch:{ all -> 0x04ae }
            java.lang.Object r4 = r7.value     // Catch:{ all -> 0x04ae }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x04ae }
            r2.zzate = r4     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzks[] r4 = r12.zzatj     // Catch:{ all -> 0x04ae }
            int r6 = r4.length     // Catch:{ all -> 0x04ae }
            r9 = 1
            int r6 = r6 + r9
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzks[] r4 = (com.google.android.gms.internal.measurement.zzks[]) r4     // Catch:{ all -> 0x04ae }
            r12.zzatj = r4     // Catch:{ all -> 0x04ae }
            int r6 = r4.length     // Catch:{ all -> 0x04ae }
            int r6 = r6 - r9
            r4[r6] = r2     // Catch:{ all -> 0x04ae }
            goto L_0x02c1
        L_0x02c0:
            r9 = 1
        L_0x02c1:
            long r4 = r5.longValue()     // Catch:{ all -> 0x04ae }
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x02d0
            com.google.android.gms.internal.measurement.zzei r2 = r30.zzix()     // Catch:{ all -> 0x04ae }
            r2.zza((com.google.android.gms.internal.measurement.zzjz) r7)     // Catch:{ all -> 0x04ae }
        L_0x02d0:
            com.google.android.gms.internal.measurement.zzer r2 = r0.zzafq     // Catch:{ all -> 0x04ae }
            android.os.Bundle r14 = r2.zzif()     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = r0.name     // Catch:{ all -> 0x04ae }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = "_r"
            r4 = 1
            if (r2 == 0) goto L_0x02f7
            java.lang.String r2 = "_c"
            r14.putLong(r2, r4)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzfg r2 = r30.zzge()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzis()     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = "Marking in-app purchase as real-time"
            r2.log(r6)     // Catch:{ all -> 0x04ae }
            r14.putLong(r3, r4)     // Catch:{ all -> 0x04ae }
        L_0x02f7:
            java.lang.String r2 = "_o"
            java.lang.String r6 = r0.origin     // Catch:{ all -> 0x04ae }
            r14.putString(r2, r6)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzka r2 = r30.zzgb()     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = r12.zzti     // Catch:{ all -> 0x04ae }
            boolean r2 = r2.zzcj(r6)     // Catch:{ all -> 0x04ae }
            if (r2 == 0) goto L_0x0322
            com.google.android.gms.internal.measurement.zzka r2 = r30.zzgb()     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = "_dbg"
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x04ae }
            r2.zza((android.os.Bundle) r14, (java.lang.String) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzka r2 = r30.zzgb()     // Catch:{ all -> 0x04ae }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x04ae }
            r2.zza((android.os.Bundle) r14, (java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x04ae }
        L_0x0322:
            com.google.android.gms.internal.measurement.zzei r2 = r30.zzix()     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = r0.name     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzeq r2 = r2.zzf(r15, r3)     // Catch:{ all -> 0x04ae }
            if (r2 != 0) goto L_0x0367
            com.google.android.gms.internal.measurement.zzeq r13 = new com.google.android.gms.internal.measurement.zzeq     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = r0.name     // Catch:{ all -> 0x04ae }
            r5 = 1
            r7 = 0
            long r10 = r0.zzagb     // Catch:{ all -> 0x04ae }
            r22 = 0
            r19 = 0
            r24 = 0
            r26 = 0
            r2 = r13
            r3 = r32
            r25 = 0
            r9 = r10
            r28 = r12
            r11 = r22
            r29 = r13
            r18 = r21
            r13 = r19
            r19 = r20
            r20 = r14
            r14 = r24
            r15 = r26
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r14, r15)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzei r2 = r30.zzix()     // Catch:{ all -> 0x04ae }
            r3 = r29
            r2.zza((com.google.android.gms.internal.measurement.zzeq) r3)     // Catch:{ all -> 0x04ae }
            r9 = r16
            goto L_0x0385
        L_0x0367:
            r28 = r12
            r19 = r20
            r18 = r21
            r25 = 0
            r20 = r14
            long r3 = r2.zzaft     // Catch:{ all -> 0x04ae }
            long r5 = r0.zzagb     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzeq r2 = r2.zzac(r5)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzeq r2 = r2.zzie()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzei r5 = r30.zzix()     // Catch:{ all -> 0x04ae }
            r5.zza((com.google.android.gms.internal.measurement.zzeq) r2)     // Catch:{ all -> 0x04ae }
            r9 = r3
        L_0x0385:
            com.google.android.gms.internal.measurement.zzep r12 = new com.google.android.gms.internal.measurement.zzep     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzgl r3 = r1.zzacw     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = r0.origin     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = r0.name     // Catch:{ all -> 0x04ae }
            long r7 = r0.zzagb     // Catch:{ all -> 0x04ae }
            r2 = r12
            r5 = r32
            r11 = r20
            r2.<init>((com.google.android.gms.internal.measurement.zzgl) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (long) r7, (long) r9, (android.os.Bundle) r11)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzkn r0 = new com.google.android.gms.internal.measurement.zzkn     // Catch:{ all -> 0x04ae }
            r0.<init>()     // Catch:{ all -> 0x04ae }
            r2 = 1
            com.google.android.gms.internal.measurement.zzkn[] r2 = new com.google.android.gms.internal.measurement.zzkn[r2]     // Catch:{ all -> 0x04ae }
            r3 = 0
            r2[r3] = r0     // Catch:{ all -> 0x04ae }
            r4 = r28
            r4.zzati = r2     // Catch:{ all -> 0x04ae }
            long r5 = r12.timestamp     // Catch:{ all -> 0x04ae }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x04ae }
            r0.zzatb = r2     // Catch:{ all -> 0x04ae }
            java.lang.String r2 = r12.name     // Catch:{ all -> 0x04ae }
            r0.name = r2     // Catch:{ all -> 0x04ae }
            long r5 = r12.zzafp     // Catch:{ all -> 0x04ae }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x04ae }
            r0.zzatc = r2     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzer r2 = r12.zzafq     // Catch:{ all -> 0x04ae }
            int r2 = r2.size()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzko[] r2 = new com.google.android.gms.internal.measurement.zzko[r2]     // Catch:{ all -> 0x04ae }
            r0.zzata = r2     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzer r2 = r12.zzafq     // Catch:{ all -> 0x04ae }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x04ae }
            r11 = 0
        L_0x03cb:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x04ae }
            if (r5 == 0) goto L_0x03f3
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x04ae }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzko r6 = new com.google.android.gms.internal.measurement.zzko     // Catch:{ all -> 0x04ae }
            r6.<init>()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzko[] r7 = r0.zzata     // Catch:{ all -> 0x04ae }
            int r8 = r11 + 1
            r7[r11] = r6     // Catch:{ all -> 0x04ae }
            r6.name = r5     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzer r7 = r12.zzafq     // Catch:{ all -> 0x04ae }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzka r7 = r30.zzgb()     // Catch:{ all -> 0x04ae }
            r7.zza((com.google.android.gms.internal.measurement.zzko) r6, (java.lang.Object) r5)     // Catch:{ all -> 0x04ae }
            r11 = r8
            goto L_0x03cb
        L_0x03f3:
            java.lang.String r2 = r18.zzah()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzks[] r5 = r4.zzatj     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzkn[] r6 = r4.zzati     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzkm[] r2 = r1.zza(r2, r5, r6)     // Catch:{ all -> 0x04ae }
            r4.zzaua = r2     // Catch:{ all -> 0x04ae }
            java.lang.Long r0 = r0.zzatb     // Catch:{ all -> 0x04ae }
            r4.zzatl = r0     // Catch:{ all -> 0x04ae }
            r4.zzatm = r0     // Catch:{ all -> 0x04ae }
            long r5 = r18.zzgl()     // Catch:{ all -> 0x04ae }
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0414
            java.lang.Long r10 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x04ae }
            goto L_0x0416
        L_0x0414:
            r10 = r25
        L_0x0416:
            r4.zzato = r10     // Catch:{ all -> 0x04ae }
            long r7 = r18.zzgk()     // Catch:{ all -> 0x04ae }
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0421
            goto L_0x0422
        L_0x0421:
            r5 = r7
        L_0x0422:
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x042b
            java.lang.Long r10 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x04ae }
            goto L_0x042d
        L_0x042b:
            r10 = r25
        L_0x042d:
            r4.zzatn = r10     // Catch:{ all -> 0x04ae }
            r18.zzgt()     // Catch:{ all -> 0x04ae }
            long r5 = r18.zzgq()     // Catch:{ all -> 0x04ae }
            int r0 = (int) r5     // Catch:{ all -> 0x04ae }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04ae }
            r4.zzaty = r0     // Catch:{ all -> 0x04ae }
            r5 = 12451(0x30a3, double:6.1516E-320)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x04ae }
            r4.zzatu = r0     // Catch:{ all -> 0x04ae }
            com.google.android.gms.common.util.Clock r0 = r30.zzbt()     // Catch:{ all -> 0x04ae }
            long r5 = r0.currentTimeMillis()     // Catch:{ all -> 0x04ae }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x04ae }
            r4.zzatk = r0     // Catch:{ all -> 0x04ae }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x04ae }
            r4.zzatz = r0     // Catch:{ all -> 0x04ae }
            java.lang.Long r0 = r4.zzatl     // Catch:{ all -> 0x04ae }
            long r5 = r0.longValue()     // Catch:{ all -> 0x04ae }
            r0 = r18
            r0.zzm(r5)     // Catch:{ all -> 0x04ae }
            java.lang.Long r2 = r4.zzatm     // Catch:{ all -> 0x04ae }
            long r4 = r2.longValue()     // Catch:{ all -> 0x04ae }
            r0.zzn(r4)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzei r2 = r30.zzix()     // Catch:{ all -> 0x04ae }
            r2.zza((com.google.android.gms.internal.measurement.zzdy) r0)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzei r0 = r30.zzix()     // Catch:{ all -> 0x04ae }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.internal.measurement.zzei r0 = r30.zzix()
            r0.endTransaction()
            int r0 = r19.zzvm()     // Catch:{ IOException -> 0x049b }
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x049b }
            com.google.android.gms.internal.measurement.zzabw r0 = com.google.android.gms.internal.measurement.zzabw.zzb(r2, r3, r0)     // Catch:{ IOException -> 0x049b }
            r3 = r19
            r3.zza(r0)     // Catch:{ IOException -> 0x049b }
            r0.zzve()     // Catch:{ IOException -> 0x049b }
            com.google.android.gms.internal.measurement.zzka r0 = r30.zzgb()     // Catch:{ IOException -> 0x049b }
            byte[] r0 = r0.zza((byte[]) r2)     // Catch:{ IOException -> 0x049b }
            return r0
        L_0x049b:
            r0 = move-exception
            com.google.android.gms.internal.measurement.zzfg r2 = r30.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzim()
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfg.zzbm(r32)
            java.lang.String r4 = "Data loss. Failed to bundle and serialize. appId"
            r2.zze(r4, r3, r0)
            return r25
        L_0x04ae:
            r0 = move-exception
            com.google.android.gms.internal.measurement.zzei r2 = r30.zzix()
            r2.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zza(com.google.android.gms.internal.measurement.zzeu, java.lang.String):byte[]");
    }

    public void zzab() {
        zzgd().zzab();
    }

    public final void zzb(zzed zzed, zzdz zzdz) {
        zzfi zzim;
        String str;
        Object zzbm;
        String zzbl;
        Object value;
        zzfi zzim2;
        String str2;
        Object zzbm2;
        String zzbl2;
        Object obj;
        boolean z;
        Preconditions.checkNotNull(zzed);
        Preconditions.checkNotEmpty(zzed.packageName);
        Preconditions.checkNotNull(zzed.origin);
        Preconditions.checkNotNull(zzed.zzaep);
        Preconditions.checkNotEmpty(zzed.zzaep.name);
        zzab();
        zzkq();
        if (!TextUtils.isEmpty(zzdz.zzadm)) {
            if (!zzdz.zzadw) {
                zzg(zzdz);
                return;
            }
            zzed zzed2 = new zzed(zzed);
            boolean z2 = false;
            zzed2.active = false;
            zzix().beginTransaction();
            try {
                zzed zzi = zzix().zzi(zzed2.packageName, zzed2.zzaep.name);
                if (zzi != null && !zzi.origin.equals(zzed2.origin)) {
                    zzge().zzip().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", zzga().zzbl(zzed2.zzaep.name), zzed2.origin, zzi.origin);
                }
                if (zzi != null && (z = zzi.active)) {
                    zzed2.origin = zzi.origin;
                    zzed2.creationTimestamp = zzi.creationTimestamp;
                    zzed2.triggerTimeout = zzi.triggerTimeout;
                    zzed2.triggerEventName = zzi.triggerEventName;
                    zzed2.zzaer = zzi.zzaer;
                    zzed2.active = z;
                    zzjx zzjx = zzed2.zzaep;
                    zzed2.zzaep = new zzjx(zzjx.name, zzi.zzaep.zzaqz, zzjx.getValue(), zzi.zzaep.origin);
                } else if (TextUtils.isEmpty(zzed2.triggerEventName)) {
                    zzjx zzjx2 = zzed2.zzaep;
                    zzed2.zzaep = new zzjx(zzjx2.name, zzed2.creationTimestamp, zzjx2.getValue(), zzed2.zzaep.origin);
                    zzed2.active = true;
                    z2 = true;
                }
                if (zzed2.active) {
                    zzjx zzjx3 = zzed2.zzaep;
                    zzjz zzjz = new zzjz(zzed2.packageName, zzed2.origin, zzjx3.name, zzjx3.zzaqz, zzjx3.getValue());
                    if (zzix().zza(zzjz)) {
                        zzim2 = zzge().zzis();
                        str2 = "User property updated immediately";
                        zzbm2 = zzed2.packageName;
                        zzbl2 = zzga().zzbl(zzjz.name);
                        obj = zzjz.value;
                    } else {
                        zzim2 = zzge().zzim();
                        str2 = "(2)Too many active user properties, ignoring";
                        zzbm2 = zzfg.zzbm(zzed2.packageName);
                        zzbl2 = zzga().zzbl(zzjz.name);
                        obj = zzjz.value;
                    }
                    zzim2.zzd(str2, zzbm2, zzbl2, obj);
                    if (z2 && zzed2.zzaer != null) {
                        zzc(new zzeu(zzed2.zzaer, zzed2.creationTimestamp), zzdz);
                    }
                }
                if (zzix().zza(zzed2)) {
                    zzim = zzge().zzis();
                    str = "Conditional property added";
                    zzbm = zzed2.packageName;
                    zzbl = zzga().zzbl(zzed2.zzaep.name);
                    value = zzed2.zzaep.getValue();
                } else {
                    zzim = zzge().zzim();
                    str = "Too many conditional properties, ignoring";
                    zzbm = zzfg.zzbm(zzed2.packageName);
                    zzbl = zzga().zzbl(zzed2.zzaep.name);
                    value = zzed2.zzaep.getValue();
                }
                zzim.zzd(str, zzbm, zzbl, value);
                zzix().setTransactionSuccessful();
            } finally {
                zzix().endTransaction();
            }
        }
    }

    public final void zzb(zzeu zzeu, zzdz zzdz) {
        List<zzed> list;
        List<zzed> list2;
        List<zzed> list3;
        zzfi zzim;
        String str;
        Object zzbm;
        String zzbl;
        Object obj;
        zzeu zzeu2 = zzeu;
        zzdz zzdz2 = zzdz;
        Preconditions.checkNotNull(zzdz);
        Preconditions.checkNotEmpty(zzdz2.packageName);
        zzab();
        zzkq();
        String str2 = zzdz2.packageName;
        long j = zzeu2.zzagb;
        zzgb();
        if (zzka.zzd(zzeu, zzdz)) {
            if (!zzdz2.zzadw) {
                zzg(zzdz2);
                return;
            }
            zzix().beginTransaction();
            try {
                zzei zzix = zzix();
                Preconditions.checkNotEmpty(str2);
                zzix.zzab();
                zzix.zzch();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    zzix.zzge().zzip().zze("Invalid time querying timed out conditional properties", zzfg.zzbm(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = zzix.zzb("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzed next : list) {
                    if (next != null) {
                        zzge().zzis().zzd("User property timed out", next.packageName, zzga().zzbl(next.zzaep.name), next.zzaep.getValue());
                        if (next.zzaeq != null) {
                            zzc(new zzeu(next.zzaeq, j), zzdz2);
                        }
                        zzix().zzj(str2, next.zzaep.name);
                    }
                }
                zzei zzix2 = zzix();
                Preconditions.checkNotEmpty(str2);
                zzix2.zzab();
                zzix2.zzch();
                if (i < 0) {
                    zzix2.zzge().zzip().zze("Invalid time querying expired conditional properties", zzfg.zzbm(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = zzix2.zzb("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzed next2 : list2) {
                    if (next2 != null) {
                        zzge().zzis().zzd("User property expired", next2.packageName, zzga().zzbl(next2.zzaep.name), next2.zzaep.getValue());
                        zzix().zzg(str2, next2.zzaep.name);
                        zzeu zzeu3 = next2.zzaes;
                        if (zzeu3 != null) {
                            arrayList.add(zzeu3);
                        }
                        zzix().zzj(str2, next2.zzaep.name);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    zzc(new zzeu((zzeu) obj2, j), zzdz2);
                }
                zzei zzix3 = zzix();
                String str3 = zzeu2.name;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzix3.zzab();
                zzix3.zzch();
                if (i < 0) {
                    zzix3.zzge().zzip().zzd("Invalid time querying triggered conditional properties", zzfg.zzbm(str2), zzix3.zzga().zzbj(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = zzix3.zzb("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (zzed next3 : list3) {
                    if (next3 != null) {
                        zzjx zzjx = next3.zzaep;
                        zzjz zzjz = r4;
                        zzjz zzjz2 = new zzjz(next3.packageName, next3.origin, zzjx.name, j, zzjx.getValue());
                        if (zzix().zza(zzjz)) {
                            zzim = zzge().zzis();
                            str = "User property triggered";
                            zzbm = next3.packageName;
                            zzbl = zzga().zzbl(zzjz.name);
                            obj = zzjz.value;
                        } else {
                            zzim = zzge().zzim();
                            str = "Too many active user properties, ignoring";
                            zzbm = zzfg.zzbm(next3.packageName);
                            zzbl = zzga().zzbl(zzjz.name);
                            obj = zzjz.value;
                        }
                        zzim.zzd(str, zzbm, zzbl, obj);
                        zzeu zzeu4 = next3.zzaer;
                        if (zzeu4 != null) {
                            arrayList2.add(zzeu4);
                        }
                        next3.zzaep = new zzjx(zzjz);
                        next3.active = true;
                        zzix().zza(next3);
                    }
                }
                zzc(zzeu, zzdz);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    zzc(new zzeu((zzeu) obj3, j), zzdz2);
                }
                zzix().setTransactionSuccessful();
            } finally {
                zzix().endTransaction();
            }
        }
    }

    public final void zzb(zzjq zzjq) {
        this.zzaqj++;
    }

    public final void zzb(zzjx zzjx, zzdz zzdz) {
        zzab();
        zzkq();
        if (!TextUtils.isEmpty(zzdz.zzadm)) {
            if (!zzdz.zzadw) {
                zzg(zzdz);
                return;
            }
            int zzcf = zzgb().zzcf(zzjx.name);
            if (zzcf != 0) {
                zzgb();
                String zza = zzka.zza(zzjx.name, 24, true);
                String str = zzjx.name;
                zzgb().zza(zzdz.packageName, zzcf, "_ev", zza, str != null ? str.length() : 0);
                return;
            }
            int zzi = zzgb().zzi(zzjx.name, zzjx.getValue());
            if (zzi != 0) {
                zzgb();
                String zza2 = zzka.zza(zzjx.name, 24, true);
                Object value = zzjx.getValue();
                zzgb().zza(zzdz.packageName, zzi, "_ev", zza2, (value == null || (!(value instanceof String) && !(value instanceof CharSequence))) ? 0 : String.valueOf(value).length());
                return;
            }
            Object zzj = zzgb().zzj(zzjx.name, zzjx.getValue());
            if (zzj != null) {
                zzjz zzjz = new zzjz(zzdz.packageName, zzjx.origin, zzjx.name, zzjx.zzaqz, zzj);
                zzge().zzis().zze("Setting user property", zzga().zzbl(zzjz.name), zzj);
                zzix().beginTransaction();
                try {
                    zzg(zzdz);
                    boolean zza3 = zzix().zza(zzjz);
                    zzix().setTransactionSuccessful();
                    if (zza3) {
                        zzge().zzis().zze("User property set", zzga().zzbl(zzjz.name), zzjz.value);
                    } else {
                        zzge().zzim().zze("Too many unique user properties are set. Ignoring user property", zzga().zzbl(zzjz.name), zzjz.value);
                        zzgb().zza(zzdz.packageName, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    zzix().endTransaction();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0120 A[Catch:{ all -> 0x0163, all -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012e A[Catch:{ all -> 0x0163, all -> 0x016c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.zzab()
            r6.zzkq()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x016c }
        L_0x000e:
            com.google.android.gms.internal.measurement.zzfg r1 = r6.zzge()     // Catch:{ all -> 0x016c }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzit()     // Catch:{ all -> 0x016c }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x016c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x016c }
            r1.zzg(r2, r3)     // Catch:{ all -> 0x016c }
            com.google.android.gms.internal.measurement.zzei r1 = r6.zzix()     // Catch:{ all -> 0x016c }
            r1.beginTransaction()     // Catch:{ all -> 0x016c }
            com.google.android.gms.internal.measurement.zzei r1 = r6.zzix()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzdy r1 = r1.zzbc(r7)     // Catch:{ all -> 0x0163 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003c
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003c
            if (r8 != r3) goto L_0x0040
        L_0x003c:
            if (r9 != 0) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            if (r1 != 0) goto L_0x0056
            com.google.android.gms.internal.measurement.zzfg r8 = r6.zzge()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzfi r8 = r8.zzip()     // Catch:{ all -> 0x0163 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.internal.measurement.zzfg.zzbm(r7)     // Catch:{ all -> 0x0163 }
            r8.zzg(r9, r7)     // Catch:{ all -> 0x0163 }
            goto L_0x0157
        L_0x0056:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ba
            if (r8 != r5) goto L_0x005d
            goto L_0x00ba
        L_0x005d:
            com.google.android.gms.common.util.Clock r10 = r6.zzbt()     // Catch:{ all -> 0x0163 }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x0163 }
            r1.zzt(r10)     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzei r10 = r6.zzix()     // Catch:{ all -> 0x0163 }
            r10.zza((com.google.android.gms.internal.measurement.zzdy) r1)     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzfg r10 = r6.zzge()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzfi r10 = r10.zzit()     // Catch:{ all -> 0x0163 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0163 }
            r10.zze(r11, r1, r9)     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzgf r9 = r6.zzkm()     // Catch:{ all -> 0x0163 }
            r9.zzbw(r7)     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzfr r7 = r6.zzgf()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzfu r7 = r7.zzajv     // Catch:{ all -> 0x0163 }
            com.google.android.gms.common.util.Clock r9 = r6.zzbt()     // Catch:{ all -> 0x0163 }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x0163 }
            r7.set(r9)     // Catch:{ all -> 0x0163 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a2
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r4 = 0
        L_0x00a2:
            if (r4 == 0) goto L_0x00b5
            com.google.android.gms.internal.measurement.zzfr r7 = r6.zzgf()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzfu r7 = r7.zzajw     // Catch:{ all -> 0x0163 }
            com.google.android.gms.common.util.Clock r8 = r6.zzbt()     // Catch:{ all -> 0x0163 }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x0163 }
            r7.set(r8)     // Catch:{ all -> 0x0163 }
        L_0x00b5:
            r6.zzku()     // Catch:{ all -> 0x0163 }
            goto L_0x0157
        L_0x00ba:
            r9 = 0
            if (r11 == 0) goto L_0x00c6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0163 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0163 }
            goto L_0x00c7
        L_0x00c6:
            r11 = r9
        L_0x00c7:
            if (r11 == 0) goto L_0x00d6
            int r2 = r11.size()     // Catch:{ all -> 0x0163 }
            if (r2 <= 0) goto L_0x00d6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0163 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0163 }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r8 == r5) goto L_0x00f3
            if (r8 != r3) goto L_0x00dc
            goto L_0x00f3
        L_0x00dc:
            com.google.android.gms.internal.measurement.zzgf r9 = r6.zzkm()     // Catch:{ all -> 0x0163 }
            boolean r9 = r9.zza(r7, r10, r11)     // Catch:{ all -> 0x0163 }
            if (r9 != 0) goto L_0x010c
            com.google.android.gms.internal.measurement.zzei r7 = r6.zzix()     // Catch:{ all -> 0x016c }
        L_0x00ea:
            r7.endTransaction()     // Catch:{ all -> 0x016c }
            r6.zzaql = r0
            r6.zzkv()
            return
        L_0x00f3:
            com.google.android.gms.internal.measurement.zzgf r11 = r6.zzkm()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzkk r11 = r11.zzbu(r7)     // Catch:{ all -> 0x0163 }
            if (r11 != 0) goto L_0x010c
            com.google.android.gms.internal.measurement.zzgf r11 = r6.zzkm()     // Catch:{ all -> 0x0163 }
            boolean r9 = r11.zza(r7, r9, r9)     // Catch:{ all -> 0x0163 }
            if (r9 != 0) goto L_0x010c
            com.google.android.gms.internal.measurement.zzei r7 = r6.zzix()     // Catch:{ all -> 0x016c }
            goto L_0x00ea
        L_0x010c:
            com.google.android.gms.common.util.Clock r9 = r6.zzbt()     // Catch:{ all -> 0x0163 }
            long r2 = r9.currentTimeMillis()     // Catch:{ all -> 0x0163 }
            r1.zzs(r2)     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzei r9 = r6.zzix()     // Catch:{ all -> 0x0163 }
            r9.zza((com.google.android.gms.internal.measurement.zzdy) r1)     // Catch:{ all -> 0x0163 }
            if (r8 != r5) goto L_0x012e
            com.google.android.gms.internal.measurement.zzfg r8 = r6.zzge()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzfi r8 = r8.zziq()     // Catch:{ all -> 0x0163 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.zzg(r9, r7)     // Catch:{ all -> 0x0163 }
            goto L_0x0144
        L_0x012e:
            com.google.android.gms.internal.measurement.zzfg r7 = r6.zzge()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzit()     // Catch:{ all -> 0x0163 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0163 }
            int r10 = r10.length     // Catch:{ all -> 0x0163 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0163 }
            r7.zze(r9, r8, r10)     // Catch:{ all -> 0x0163 }
        L_0x0144:
            com.google.android.gms.internal.measurement.zzfk r7 = r6.zzkn()     // Catch:{ all -> 0x0163 }
            boolean r7 = r7.zzex()     // Catch:{ all -> 0x0163 }
            if (r7 == 0) goto L_0x00b5
            boolean r7 = r6.zzkt()     // Catch:{ all -> 0x0163 }
            if (r7 == 0) goto L_0x00b5
            r6.zzks()     // Catch:{ all -> 0x0163 }
        L_0x0157:
            com.google.android.gms.internal.measurement.zzei r7 = r6.zzix()     // Catch:{ all -> 0x0163 }
            r7.setTransactionSuccessful()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.zzei r7 = r6.zzix()     // Catch:{ all -> 0x016c }
            goto L_0x00ea
        L_0x0163:
            r7 = move-exception
            com.google.android.gms.internal.measurement.zzei r8 = r6.zzix()     // Catch:{ all -> 0x016c }
            r8.endTransaction()     // Catch:{ all -> 0x016c }
            throw r7     // Catch:{ all -> 0x016c }
        L_0x016c:
            r7 = move-exception
            r6.zzaql = r0
            r6.zzkv()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzb(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public Clock zzbt() {
        return this.zzacw.zzbt();
    }

    public final void zzc(zzed zzed, zzdz zzdz) {
        Preconditions.checkNotNull(zzed);
        Preconditions.checkNotEmpty(zzed.packageName);
        Preconditions.checkNotNull(zzed.zzaep);
        Preconditions.checkNotEmpty(zzed.zzaep.name);
        zzab();
        zzkq();
        if (!TextUtils.isEmpty(zzdz.zzadm)) {
            if (!zzdz.zzadw) {
                zzg(zzdz);
                return;
            }
            zzix().beginTransaction();
            try {
                zzg(zzdz);
                zzed zzi = zzix().zzi(zzed.packageName, zzed.zzaep.name);
                if (zzi != null) {
                    zzge().zzis().zze("Removing conditional user property", zzed.packageName, zzga().zzbl(zzed.zzaep.name));
                    zzix().zzj(zzed.packageName, zzed.zzaep.name);
                    if (zzi.active) {
                        zzix().zzg(zzed.packageName, zzed.zzaep.name);
                    }
                    zzeu zzeu = zzed.zzaes;
                    if (zzeu != null) {
                        Bundle bundle = null;
                        zzer zzer = zzeu.zzafq;
                        if (zzer != null) {
                            bundle = zzer.zzif();
                        }
                        zzka zzgb = zzgb();
                        zzeu zzeu2 = zzed.zzaes;
                        zzc(zzgb.zza(zzeu2.name, bundle, zzi.origin, zzeu2.zzagb, true, false), zzdz);
                    }
                } else {
                    zzge().zzip().zze("Conditional user property doesn't exist", zzfg.zzbm(zzed.packageName), zzga().zzbl(zzed.zzaep.name));
                }
                zzix().setTransactionSuccessful();
            } finally {
                zzix().endTransaction();
            }
        }
    }

    public final void zzc(zzeu zzeu, String str) {
        zzeu zzeu2 = zzeu;
        String str2 = str;
        zzdy zzbc = zzix().zzbc(str2);
        if (zzbc == null || TextUtils.isEmpty(zzbc.zzag())) {
            zzge().zzis().zzg("No app data available; dropping event", str2);
            return;
        }
        Boolean zzc = zzc(zzbc);
        if (zzc == null) {
            if (!"_ui".equals(zzeu2.name)) {
                zzge().zzip().zzg("Could not find package. appId", zzfg.zzbm(str));
            }
        } else if (!zzc.booleanValue()) {
            zzge().zzim().zzg("App version does not match; dropping event. appId", zzfg.zzbm(str));
            return;
        }
        zzdz zzdz = r2;
        zzdy zzdy = zzbc;
        zzdz zzdz2 = new zzdz(str, zzbc.getGmpAppId(), zzbc.zzag(), zzbc.zzgm(), zzbc.zzgn(), zzbc.zzgo(), zzbc.zzgp(), (String) null, zzbc.isMeasurementEnabled(), false, zzdy.zzgj(), zzdy.zzhc(), 0, 0, zzdy.zzhd(), zzdy.zzhe(), false);
        zzb(zzeu2, zzdz);
    }

    public final void zzc(zzjx zzjx, zzdz zzdz) {
        zzab();
        zzkq();
        if (!TextUtils.isEmpty(zzdz.zzadm)) {
            if (!zzdz.zzadw) {
                zzg(zzdz);
                return;
            }
            zzge().zzis().zzg("Removing user property", zzga().zzbl(zzjx.name));
            zzix().beginTransaction();
            try {
                zzg(zzdz);
                zzix().zzg(zzdz.packageName, zzjx.name);
                zzix().setTransactionSuccessful();
                zzge().zzis().zzg("User property removed", zzga().zzbl(zzjx.name));
            } finally {
                zzix().endTransaction();
            }
        }
    }

    public final zzdz zzcb(String str) {
        zzfi zzis;
        String str2;
        Object obj;
        String str3 = str;
        zzdy zzbc = zzix().zzbc(str3);
        if (zzbc == null || TextUtils.isEmpty(zzbc.zzag())) {
            zzis = zzge().zzis();
            str2 = "No app data available; dropping";
            obj = str3;
        } else {
            Boolean zzc = zzc(zzbc);
            if (zzc == null || zzc.booleanValue()) {
                zzdy zzdy = zzbc;
                return new zzdz(str, zzbc.getGmpAppId(), zzbc.zzag(), zzbc.zzgm(), zzbc.zzgn(), zzbc.zzgo(), zzbc.zzgp(), (String) null, zzbc.isMeasurementEnabled(), false, zzbc.zzgj(), zzbc.zzhc(), 0, 0, zzdy.zzhd(), zzdy.zzhe(), false);
            }
            zzis = zzge().zzim();
            str2 = "App version does not match; dropping. appId";
            obj = zzfg.zzbm(str);
        }
        zzis.zzg(str2, obj);
        return null;
    }

    public final void zzd(zzdz zzdz) {
        if (this.zzaqq != null) {
            ArrayList arrayList = new ArrayList();
            this.zzaqr = arrayList;
            arrayList.addAll(this.zzaqq);
        }
        zzei zzix = zzix();
        String str = zzdz.packageName;
        Preconditions.checkNotEmpty(str);
        zzix.zzab();
        zzix.zzch();
        try {
            SQLiteDatabase writableDatabase = zzix.getWritableDatabase();
            String[] strArr = {str};
            int delete = writableDatabase.delete("apps", "app_id=?", strArr) + 0 + writableDatabase.delete("events", "app_id=?", strArr) + writableDatabase.delete("user_attributes", "app_id=?", strArr) + writableDatabase.delete("conditional_properties", "app_id=?", strArr) + writableDatabase.delete("raw_events", "app_id=?", strArr) + writableDatabase.delete("raw_events_metadata", "app_id=?", strArr) + writableDatabase.delete("queue", "app_id=?", strArr) + writableDatabase.delete("audience_filter_values", "app_id=?", strArr) + writableDatabase.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzix.zzge().zzit().zze("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzix.zzge().zzim().zze("Error resetting analytics data. appId, error", zzfg.zzbm(str), e);
        }
        zzdz zza = zza(getContext(), zzdz.packageName, zzdz.zzadm, zzdz.zzadw, zzdz.zzady, zzdz.zzadz, zzdz.zzaem);
        if (!zzgg().zzaz(zzdz.packageName) || zzdz.zzadw) {
            zzf(zza);
        }
    }

    public final void zze(zzdz zzdz) {
        zzab();
        zzkq();
        Preconditions.checkNotEmpty(zzdz.packageName);
        zzg(zzdz);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02d4 A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0301 A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0385 A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01bc A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c9 A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d7 A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0281 A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(com.google.android.gms.internal.measurement.zzdz r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.zzab()
            r21.zzkq()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r22)
            java.lang.String r7 = r2.packageName
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            java.lang.String r7 = r2.zzadm
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0025
            return
        L_0x0025:
            com.google.android.gms.internal.measurement.zzei r7 = r21.zzix()
            java.lang.String r8 = r2.packageName
            com.google.android.gms.internal.measurement.zzdy r7 = r7.zzbc(r8)
            r8 = 0
            if (r7 == 0) goto L_0x0058
            java.lang.String r10 = r7.getGmpAppId()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0058
            java.lang.String r10 = r2.zzadm
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0058
            r7.zzs(r8)
            com.google.android.gms.internal.measurement.zzei r10 = r21.zzix()
            r10.zza((com.google.android.gms.internal.measurement.zzdy) r7)
            com.google.android.gms.internal.measurement.zzgf r7 = r21.zzkm()
            java.lang.String r10 = r2.packageName
            r7.zzbx(r10)
        L_0x0058:
            boolean r7 = r2.zzadw
            if (r7 != 0) goto L_0x0060
            r21.zzg((com.google.android.gms.internal.measurement.zzdz) r22)
            return
        L_0x0060:
            long r10 = r2.zzaem
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x006e
            com.google.android.gms.common.util.Clock r7 = r21.zzbt()
            long r10 = r7.currentTimeMillis()
        L_0x006e:
            int r7 = r2.zzaen
            r15 = 0
            r14 = 1
            if (r7 == 0) goto L_0x008e
            if (r7 == r14) goto L_0x008e
            com.google.android.gms.internal.measurement.zzfg r12 = r21.zzge()
            com.google.android.gms.internal.measurement.zzfi r12 = r12.zzip()
            java.lang.String r13 = r2.packageName
            java.lang.Object r13 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "Incorrect app type, assuming installed app. appId, appType"
            r12.zze(r8, r13, r7)
            r7 = 0
        L_0x008e:
            com.google.android.gms.internal.measurement.zzei r8 = r21.zzix()
            r8.beginTransaction()
            com.google.android.gms.internal.measurement.zzei r8 = r21.zzix()     // Catch:{ all -> 0x03b1 }
            java.lang.String r9 = r2.packageName     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzdy r8 = r8.zzbc(r9)     // Catch:{ all -> 0x03b1 }
            if (r8 == 0) goto L_0x0147
            java.lang.String r12 = r8.getGmpAppId()     // Catch:{ all -> 0x03b1 }
            if (r12 == 0) goto L_0x0147
            java.lang.String r12 = r8.getGmpAppId()     // Catch:{ all -> 0x03b1 }
            java.lang.String r13 = r2.zzadm     // Catch:{ all -> 0x03b1 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x03b1 }
            if (r12 != 0) goto L_0x0147
            com.google.android.gms.internal.measurement.zzfg r12 = r21.zzge()     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzfi r12 = r12.zzip()     // Catch:{ all -> 0x03b1 }
            java.lang.String r13 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r16 = r8.zzah()     // Catch:{ all -> 0x03b1 }
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzfg.zzbm(r16)     // Catch:{ all -> 0x03b1 }
            r12.zzg(r13, r9)     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzei r9 = r21.zzix()     // Catch:{ all -> 0x03b1 }
            java.lang.String r8 = r8.zzah()     // Catch:{ all -> 0x03b1 }
            r9.zzch()     // Catch:{ all -> 0x03b1 }
            r9.zzab()     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)     // Catch:{ all -> 0x03b1 }
            android.database.sqlite.SQLiteDatabase r12 = r9.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0134 }
            java.lang.String[] r13 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x0134 }
            r13[r15] = r8     // Catch:{ SQLiteException -> 0x0134 }
            java.lang.String r14 = "events"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "user_attributes"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r0 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x0146
            com.google.android.gms.internal.measurement.zzfg r0 = r9.zzge()     // Catch:{ SQLiteException -> 0x0134 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzit()     // Catch:{ SQLiteException -> 0x0134 }
            java.lang.String r12 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x0134 }
            r0.zze(r12, r8, r13)     // Catch:{ SQLiteException -> 0x0134 }
            goto L_0x0146
        L_0x0134:
            r0 = move-exception
            com.google.android.gms.internal.measurement.zzfg r9 = r9.zzge()     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzfi r9 = r9.zzim()     // Catch:{ all -> 0x03b1 }
            java.lang.String r12 = "Error deleting application data. appId, error"
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzfg.zzbm(r8)     // Catch:{ all -> 0x03b1 }
            r9.zze(r12, r8, r0)     // Catch:{ all -> 0x03b1 }
        L_0x0146:
            r8 = 0
        L_0x0147:
            if (r8 == 0) goto L_0x01b6
            long r12 = r8.zzgm()     // Catch:{ all -> 0x03b1 }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            java.lang.String r0 = "_pv"
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0183
            long r12 = r8.zzgm()     // Catch:{ all -> 0x03b1 }
            long r14 = r2.zzads     // Catch:{ all -> 0x03b1 }
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x01b6
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x03b1 }
            r9.<init>()     // Catch:{ all -> 0x03b1 }
            java.lang.String r8 = r8.zzag()     // Catch:{ all -> 0x03b1 }
            r9.putString(r0, r8)     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzeu r0 = new com.google.android.gms.internal.measurement.zzeu     // Catch:{ all -> 0x03b1 }
            java.lang.String r13 = "_au"
            com.google.android.gms.internal.measurement.zzer r14 = new com.google.android.gms.internal.measurement.zzer     // Catch:{ all -> 0x03b1 }
            r14.<init>(r9)     // Catch:{ all -> 0x03b1 }
            java.lang.String r15 = "auto"
            r12 = r0
            r9 = 1
            r8 = 0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03b1 }
        L_0x017f:
            r1.zzb((com.google.android.gms.internal.measurement.zzeu) r0, (com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x03b1 }
            goto L_0x01b7
        L_0x0183:
            r9 = 1
            r15 = 0
            java.lang.String r12 = r8.zzag()     // Catch:{ all -> 0x03b1 }
            if (r12 == 0) goto L_0x01b7
            java.lang.String r12 = r8.zzag()     // Catch:{ all -> 0x03b1 }
            java.lang.String r13 = r2.zzth     // Catch:{ all -> 0x03b1 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x03b1 }
            if (r12 != 0) goto L_0x01b7
            android.os.Bundle r12 = new android.os.Bundle     // Catch:{ all -> 0x03b1 }
            r12.<init>()     // Catch:{ all -> 0x03b1 }
            java.lang.String r8 = r8.zzag()     // Catch:{ all -> 0x03b1 }
            r12.putString(r0, r8)     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzeu r0 = new com.google.android.gms.internal.measurement.zzeu     // Catch:{ all -> 0x03b1 }
            java.lang.String r13 = "_au"
            com.google.android.gms.internal.measurement.zzer r14 = new com.google.android.gms.internal.measurement.zzer     // Catch:{ all -> 0x03b1 }
            r14.<init>(r12)     // Catch:{ all -> 0x03b1 }
            java.lang.String r8 = "auto"
            r12 = r0
            r15 = r8
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03b1 }
            goto L_0x017f
        L_0x01b6:
            r9 = 1
        L_0x01b7:
            r21.zzg((com.google.android.gms.internal.measurement.zzdz) r22)     // Catch:{ all -> 0x03b1 }
            if (r7 != 0) goto L_0x01c9
            com.google.android.gms.internal.measurement.zzei r0 = r21.zzix()     // Catch:{ all -> 0x03b1 }
            java.lang.String r8 = r2.packageName     // Catch:{ all -> 0x03b1 }
            java.lang.String r12 = "_f"
        L_0x01c4:
            com.google.android.gms.internal.measurement.zzeq r0 = r0.zzf(r8, r12)     // Catch:{ all -> 0x03b1 }
            goto L_0x01d5
        L_0x01c9:
            if (r7 != r9) goto L_0x01d4
            com.google.android.gms.internal.measurement.zzei r0 = r21.zzix()     // Catch:{ all -> 0x03b1 }
            java.lang.String r8 = r2.packageName     // Catch:{ all -> 0x03b1 }
            java.lang.String r12 = "_v"
            goto L_0x01c4
        L_0x01d4:
            r0 = 0
        L_0x01d5:
            if (r0 != 0) goto L_0x0385
            r12 = 3600000(0x36ee80, double:1.7786363E-317)
            long r14 = r10 / r12
            r18 = r10
            r9 = 1
            long r14 = r14 + r9
            long r14 = r14 * r12
            java.lang.String r0 = "_dac"
            java.lang.String r11 = "_r"
            java.lang.String r13 = "_c"
            if (r7 != 0) goto L_0x0319
            com.google.android.gms.internal.measurement.zzjx r7 = new com.google.android.gms.internal.measurement.zzjx     // Catch:{ all -> 0x03b1 }
            java.lang.String r16 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x03b1 }
            java.lang.String r20 = "auto"
            r12 = r7
            r14 = r13
            r13 = r16
            r8 = r14
            r14 = r18
            r16 = r17
            r17 = r20
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x03b1 }
            r1.zzb((com.google.android.gms.internal.measurement.zzjx) r7, (com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x03b1 }
            r21.zzab()     // Catch:{ all -> 0x03b1 }
            r21.zzkq()     // Catch:{ all -> 0x03b1 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x03b1 }
            r7.<init>()     // Catch:{ all -> 0x03b1 }
            r7.putLong(r8, r9)     // Catch:{ all -> 0x03b1 }
            r7.putLong(r11, r9)     // Catch:{ all -> 0x03b1 }
            r11 = 0
            r7.putLong(r6, r11)     // Catch:{ all -> 0x03b1 }
            r7.putLong(r5, r11)     // Catch:{ all -> 0x03b1 }
            r7.putLong(r4, r11)     // Catch:{ all -> 0x03b1 }
            r7.putLong(r3, r11)     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzef r8 = r21.zzgg()     // Catch:{ all -> 0x03b1 }
            java.lang.String r11 = r2.packageName     // Catch:{ all -> 0x03b1 }
            boolean r8 = r8.zzaz(r11)     // Catch:{ all -> 0x03b1 }
            if (r8 == 0) goto L_0x0238
            boolean r8 = r2.zzaeo     // Catch:{ all -> 0x03b1 }
            if (r8 == 0) goto L_0x0238
            r7.putLong(r0, r9)     // Catch:{ all -> 0x03b1 }
        L_0x0238:
            android.content.Context r0 = r21.getContext()     // Catch:{ all -> 0x03b1 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x03b1 }
            if (r0 != 0) goto L_0x0257
            com.google.android.gms.internal.measurement.zzfg r0 = r21.zzge()     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ all -> 0x03b1 }
            java.lang.String r3 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r4 = r2.packageName     // Catch:{ all -> 0x03b1 }
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzfg.zzbm(r4)     // Catch:{ all -> 0x03b1 }
            r0.zzg(r3, r4)     // Catch:{ all -> 0x03b1 }
            goto L_0x02e6
        L_0x0257:
            android.content.Context r0 = r21.getContext()     // Catch:{ NameNotFoundException -> 0x0269 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x0269 }
            java.lang.String r8 = r2.packageName     // Catch:{ NameNotFoundException -> 0x0269 }
            r11 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r8, r11)     // Catch:{ NameNotFoundException -> 0x0267 }
            goto L_0x027f
        L_0x0267:
            r0 = move-exception
            goto L_0x026b
        L_0x0269:
            r0 = move-exception
            r11 = 0
        L_0x026b:
            com.google.android.gms.internal.measurement.zzfg r8 = r21.zzge()     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzfi r8 = r8.zzim()     // Catch:{ all -> 0x03b1 }
            java.lang.String r12 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r13 = r2.packageName     // Catch:{ all -> 0x03b1 }
            java.lang.Object r13 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)     // Catch:{ all -> 0x03b1 }
            r8.zze(r12, r13, r0)     // Catch:{ all -> 0x03b1 }
            r0 = 0
        L_0x027f:
            if (r0 == 0) goto L_0x02ae
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x03b1 }
            r14 = 0
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x02ae
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x03b1 }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0294
            r7.putLong(r6, r9)     // Catch:{ all -> 0x03b1 }
            r15 = 0
            goto L_0x0295
        L_0x0294:
            r15 = 1
        L_0x0295:
            com.google.android.gms.internal.measurement.zzjx r0 = new com.google.android.gms.internal.measurement.zzjx     // Catch:{ all -> 0x03b1 }
            java.lang.String r13 = "_fi"
            if (r15 == 0) goto L_0x029d
            r14 = r9
            goto L_0x029f
        L_0x029d:
            r14 = 0
        L_0x029f:
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x03b1 }
            java.lang.String r17 = "auto"
            r12 = r0
            r14 = r18
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x03b1 }
            r1.zzb((com.google.android.gms.internal.measurement.zzjx) r0, (com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x03b1 }
        L_0x02ae:
            android.content.Context r0 = r21.getContext()     // Catch:{ NameNotFoundException -> 0x02bd }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x02bd }
            java.lang.String r6 = r2.packageName     // Catch:{ NameNotFoundException -> 0x02bd }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r6, r11)     // Catch:{ NameNotFoundException -> 0x02bd }
            goto L_0x02d2
        L_0x02bd:
            r0 = move-exception
            com.google.android.gms.internal.measurement.zzfg r6 = r21.zzge()     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzfi r6 = r6.zzim()     // Catch:{ all -> 0x03b1 }
            java.lang.String r8 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r11 = r2.packageName     // Catch:{ all -> 0x03b1 }
            java.lang.Object r11 = com.google.android.gms.internal.measurement.zzfg.zzbm(r11)     // Catch:{ all -> 0x03b1 }
            r6.zze(r8, r11, r0)     // Catch:{ all -> 0x03b1 }
            r0 = 0
        L_0x02d2:
            if (r0 == 0) goto L_0x02e6
            int r6 = r0.flags     // Catch:{ all -> 0x03b1 }
            r8 = 1
            r6 = r6 & r8
            if (r6 == 0) goto L_0x02dd
            r7.putLong(r4, r9)     // Catch:{ all -> 0x03b1 }
        L_0x02dd:
            int r0 = r0.flags     // Catch:{ all -> 0x03b1 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x02e6
            r7.putLong(r3, r9)     // Catch:{ all -> 0x03b1 }
        L_0x02e6:
            com.google.android.gms.internal.measurement.zzei r0 = r21.zzix()     // Catch:{ all -> 0x03b1 }
            java.lang.String r3 = r2.packageName     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)     // Catch:{ all -> 0x03b1 }
            r0.zzab()     // Catch:{ all -> 0x03b1 }
            r0.zzch()     // Catch:{ all -> 0x03b1 }
            java.lang.String r4 = "first_open_count"
            long r3 = r0.zzm(r3, r4)     // Catch:{ all -> 0x03b1 }
            r11 = 0
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0304
            r7.putLong(r5, r3)     // Catch:{ all -> 0x03b1 }
        L_0x0304:
            com.google.android.gms.internal.measurement.zzeu r0 = new com.google.android.gms.internal.measurement.zzeu     // Catch:{ all -> 0x03b1 }
            java.lang.String r13 = "_f"
            com.google.android.gms.internal.measurement.zzer r14 = new com.google.android.gms.internal.measurement.zzer     // Catch:{ all -> 0x03b1 }
            r14.<init>(r7)     // Catch:{ all -> 0x03b1 }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r18
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03b1 }
        L_0x0315:
            r1.zzb((com.google.android.gms.internal.measurement.zzeu) r0, (com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x03b1 }
            goto L_0x0366
        L_0x0319:
            r8 = r13
            r3 = 1
            if (r7 != r3) goto L_0x0366
            com.google.android.gms.internal.measurement.zzjx r3 = new com.google.android.gms.internal.measurement.zzjx     // Catch:{ all -> 0x03b1 }
            java.lang.String r13 = "_fvt"
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x03b1 }
            java.lang.String r17 = "auto"
            r12 = r3
            r14 = r18
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x03b1 }
            r1.zzb((com.google.android.gms.internal.measurement.zzjx) r3, (com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x03b1 }
            r21.zzab()     // Catch:{ all -> 0x03b1 }
            r21.zzkq()     // Catch:{ all -> 0x03b1 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x03b1 }
            r3.<init>()     // Catch:{ all -> 0x03b1 }
            r3.putLong(r8, r9)     // Catch:{ all -> 0x03b1 }
            r3.putLong(r11, r9)     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzef r4 = r21.zzgg()     // Catch:{ all -> 0x03b1 }
            java.lang.String r5 = r2.packageName     // Catch:{ all -> 0x03b1 }
            boolean r4 = r4.zzaz(r5)     // Catch:{ all -> 0x03b1 }
            if (r4 == 0) goto L_0x0354
            boolean r4 = r2.zzaeo     // Catch:{ all -> 0x03b1 }
            if (r4 == 0) goto L_0x0354
            r3.putLong(r0, r9)     // Catch:{ all -> 0x03b1 }
        L_0x0354:
            com.google.android.gms.internal.measurement.zzeu r0 = new com.google.android.gms.internal.measurement.zzeu     // Catch:{ all -> 0x03b1 }
            java.lang.String r13 = "_v"
            com.google.android.gms.internal.measurement.zzer r14 = new com.google.android.gms.internal.measurement.zzer     // Catch:{ all -> 0x03b1 }
            r14.<init>(r3)     // Catch:{ all -> 0x03b1 }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r18
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03b1 }
            goto L_0x0315
        L_0x0366:
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x03b1 }
            r0.<init>()     // Catch:{ all -> 0x03b1 }
            java.lang.String r3 = "_et"
            r0.putLong(r3, r9)     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzeu r3 = new com.google.android.gms.internal.measurement.zzeu     // Catch:{ all -> 0x03b1 }
            java.lang.String r13 = "_e"
            com.google.android.gms.internal.measurement.zzer r14 = new com.google.android.gms.internal.measurement.zzer     // Catch:{ all -> 0x03b1 }
            r14.<init>(r0)     // Catch:{ all -> 0x03b1 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r18
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03b1 }
        L_0x0381:
            r1.zzb((com.google.android.gms.internal.measurement.zzeu) r3, (com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x03b1 }
            goto L_0x03a2
        L_0x0385:
            r18 = r10
            boolean r0 = r2.zzael     // Catch:{ all -> 0x03b1 }
            if (r0 == 0) goto L_0x03a2
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x03b1 }
            r0.<init>()     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzeu r3 = new com.google.android.gms.internal.measurement.zzeu     // Catch:{ all -> 0x03b1 }
            java.lang.String r13 = "_cd"
            com.google.android.gms.internal.measurement.zzer r14 = new com.google.android.gms.internal.measurement.zzer     // Catch:{ all -> 0x03b1 }
            r14.<init>(r0)     // Catch:{ all -> 0x03b1 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r18
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03b1 }
            goto L_0x0381
        L_0x03a2:
            com.google.android.gms.internal.measurement.zzei r0 = r21.zzix()     // Catch:{ all -> 0x03b1 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x03b1 }
            com.google.android.gms.internal.measurement.zzei r0 = r21.zzix()
            r0.endTransaction()
            return
        L_0x03b1:
            r0 = move-exception
            com.google.android.gms.internal.measurement.zzei r2 = r21.zzix()
            r2.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzf(com.google.android.gms.internal.measurement.zzdz):void");
    }

    public zzeo zzfw() {
        return this.zzacw.zzfw();
    }

    public final void zzg(Runnable runnable) {
        zzab();
        if (this.zzaqi == null) {
            this.zzaqi = new ArrayList();
        }
        this.zzaqi.add(runnable);
    }

    public zzfe zzga() {
        return this.zzacw.zzga();
    }

    public zzka zzgb() {
        return this.zzacw.zzgb();
    }

    public zzgg zzgd() {
        return this.zzacw.zzgd();
    }

    public zzfg zzge() {
        return this.zzacw.zzge();
    }

    public zzfr zzgf() {
        return this.zzacw.zzgf();
    }

    public zzef zzgg() {
        return this.zzacw.zzgg();
    }

    public final String zzh(zzdz zzdz) {
        try {
            return (String) zzgd().zzb(new zzju(this, zzdz)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzge().zzim().zze("Failed to get app instance id. appId", zzfg.zzbm(zzdz.packageName), e);
            return null;
        }
    }

    public final zzeb zziw() {
        zza((zzjq) this.zzaqf);
        return this.zzaqf;
    }

    public final zzei zzix() {
        zza((zzjq) this.zzaqc);
        return this.zzaqc;
    }

    public final zzfk zzkn() {
        zza((zzjq) this.zzaqb);
        return this.zzaqb;
    }

    public final void zzkq() {
        if (!this.zzvo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:81|82) */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        zzge().zzim().zze("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(r5), r6);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x024c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzks() {
        /*
            r17 = this;
            r1 = r17
            r17.zzab()
            r17.zzkq()
            r0 = 1
            r1.zzaqn = r0
            r2 = 0
            com.google.android.gms.internal.measurement.zzgl r3 = r1.zzacw     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzii r3 = r3.zzfx()     // Catch:{ all -> 0x0283 }
            java.lang.Boolean r3 = r3.zzkf()     // Catch:{ all -> 0x0283 }
            if (r3 != 0) goto L_0x002b
            com.google.android.gms.internal.measurement.zzfg r0 = r17.zzge()     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzip()     // Catch:{ all -> 0x0283 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
        L_0x0022:
            r0.log(r3)     // Catch:{ all -> 0x0283 }
        L_0x0025:
            r1.zzaqn = r2
            r17.zzkv()
            return
        L_0x002b:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0283 }
            if (r3 == 0) goto L_0x003c
            com.google.android.gms.internal.measurement.zzfg r0 = r17.zzge()     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ all -> 0x0283 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            goto L_0x0022
        L_0x003c:
            long r3 = r1.zzaqh     // Catch:{ all -> 0x0283 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0048
        L_0x0044:
            r17.zzku()     // Catch:{ all -> 0x0283 }
            goto L_0x0025
        L_0x0048:
            r17.zzab()     // Catch:{ all -> 0x0283 }
            java.util.List<java.lang.Long> r3 = r1.zzaqq     // Catch:{ all -> 0x0283 }
            if (r3 == 0) goto L_0x0051
            r3 = 1
            goto L_0x0052
        L_0x0051:
            r3 = 0
        L_0x0052:
            if (r3 == 0) goto L_0x005f
            com.google.android.gms.internal.measurement.zzfg r0 = r17.zzge()     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzit()     // Catch:{ all -> 0x0283 }
            java.lang.String r3 = "Uploading requested multiple times"
            goto L_0x0022
        L_0x005f:
            com.google.android.gms.internal.measurement.zzfk r3 = r17.zzkn()     // Catch:{ all -> 0x0283 }
            boolean r3 = r3.zzex()     // Catch:{ all -> 0x0283 }
            if (r3 != 0) goto L_0x0077
            com.google.android.gms.internal.measurement.zzfg r0 = r17.zzge()     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzit()     // Catch:{ all -> 0x0283 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.log(r3)     // Catch:{ all -> 0x0283 }
            goto L_0x0044
        L_0x0077:
            com.google.android.gms.common.util.Clock r3 = r17.zzbt()     // Catch:{ all -> 0x0283 }
            long r3 = r3.currentTimeMillis()     // Catch:{ all -> 0x0283 }
            long r7 = com.google.android.gms.internal.measurement.zzef.zzhi()     // Catch:{ all -> 0x0283 }
            long r7 = r3 - r7
            r9 = 0
            r1.zzd(r9, r7)     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzfr r7 = r17.zzgf()     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzfu r7 = r7.zzaju     // Catch:{ all -> 0x0283 }
            long r7 = r7.get()     // Catch:{ all -> 0x0283 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00ae
            com.google.android.gms.internal.measurement.zzfg r5 = r17.zzge()     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzis()     // Catch:{ all -> 0x0283 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0283 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0283 }
            r5.zzg(r6, r7)     // Catch:{ all -> 0x0283 }
        L_0x00ae:
            com.google.android.gms.internal.measurement.zzei r5 = r17.zzix()     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = r5.zzhn()     // Catch:{ all -> 0x0283 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0283 }
            r7 = -1
            if (r6 != 0) goto L_0x025f
            long r10 = r1.zzaqs     // Catch:{ all -> 0x0283 }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00ce
            com.google.android.gms.internal.measurement.zzei r6 = r17.zzix()     // Catch:{ all -> 0x0283 }
            long r6 = r6.zzhu()     // Catch:{ all -> 0x0283 }
            r1.zzaqs = r6     // Catch:{ all -> 0x0283 }
        L_0x00ce:
            com.google.android.gms.internal.measurement.zzef r6 = r17.zzgg()     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzex<java.lang.Integer> r7 = com.google.android.gms.internal.measurement.zzew.zzago     // Catch:{ all -> 0x0283 }
            int r6 = r6.zzb(r5, r7)     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzef r7 = r17.zzgg()     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzex<java.lang.Integer> r8 = com.google.android.gms.internal.measurement.zzew.zzagp     // Catch:{ all -> 0x0283 }
            int r7 = r7.zzb(r5, r8)     // Catch:{ all -> 0x0283 }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzei r8 = r17.zzix()     // Catch:{ all -> 0x0283 }
            java.util.List r6 = r8.zzb((java.lang.String) r5, (int) r6, (int) r7)     // Catch:{ all -> 0x0283 }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x0283 }
            if (r7 != 0) goto L_0x0025
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x0283 }
        L_0x00f8:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0283 }
            if (r8 == 0) goto L_0x0113
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0283 }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x0283 }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzkq r8 = (com.google.android.gms.internal.measurement.zzkq) r8     // Catch:{ all -> 0x0283 }
            java.lang.String r10 = r8.zzatv     // Catch:{ all -> 0x0283 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0283 }
            if (r10 != 0) goto L_0x00f8
            java.lang.String r7 = r8.zzatv     // Catch:{ all -> 0x0283 }
            goto L_0x0114
        L_0x0113:
            r7 = r9
        L_0x0114:
            if (r7 == 0) goto L_0x013f
            r8 = 0
        L_0x0117:
            int r10 = r6.size()     // Catch:{ all -> 0x0283 }
            if (r8 >= r10) goto L_0x013f
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x0283 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0283 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzkq r10 = (com.google.android.gms.internal.measurement.zzkq) r10     // Catch:{ all -> 0x0283 }
            java.lang.String r11 = r10.zzatv     // Catch:{ all -> 0x0283 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0283 }
            if (r11 != 0) goto L_0x013c
            java.lang.String r10 = r10.zzatv     // Catch:{ all -> 0x0283 }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x0283 }
            if (r10 != 0) goto L_0x013c
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x0283 }
            goto L_0x013f
        L_0x013c:
            int r8 = r8 + 1
            goto L_0x0117
        L_0x013f:
            com.google.android.gms.internal.measurement.zzkp r7 = new com.google.android.gms.internal.measurement.zzkp     // Catch:{ all -> 0x0283 }
            r7.<init>()     // Catch:{ all -> 0x0283 }
            int r8 = r6.size()     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzkq[] r8 = new com.google.android.gms.internal.measurement.zzkq[r8]     // Catch:{ all -> 0x0283 }
            r7.zzatf = r8     // Catch:{ all -> 0x0283 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0283 }
            int r10 = r6.size()     // Catch:{ all -> 0x0283 }
            r8.<init>(r10)     // Catch:{ all -> 0x0283 }
            boolean r10 = com.google.android.gms.internal.measurement.zzef.zzhk()     // Catch:{ all -> 0x0283 }
            if (r10 == 0) goto L_0x0167
            com.google.android.gms.internal.measurement.zzef r10 = r17.zzgg()     // Catch:{ all -> 0x0283 }
            boolean r10 = r10.zzat(r5)     // Catch:{ all -> 0x0283 }
            if (r10 == 0) goto L_0x0167
            r10 = 1
            goto L_0x0168
        L_0x0167:
            r10 = 0
        L_0x0168:
            r11 = 0
        L_0x0169:
            com.google.android.gms.internal.measurement.zzkq[] r12 = r7.zzatf     // Catch:{ all -> 0x0283 }
            int r13 = r12.length     // Catch:{ all -> 0x0283 }
            if (r11 >= r13) goto L_0x01ac
            java.lang.Object r13 = r6.get(r11)     // Catch:{ all -> 0x0283 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x0283 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzkq r13 = (com.google.android.gms.internal.measurement.zzkq) r13     // Catch:{ all -> 0x0283 }
            r12[r11] = r13     // Catch:{ all -> 0x0283 }
            java.lang.Object r12 = r6.get(r11)     // Catch:{ all -> 0x0283 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x0283 }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x0283 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0283 }
            r8.add(r12)     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzkq[] r12 = r7.zzatf     // Catch:{ all -> 0x0283 }
            r12 = r12[r11]     // Catch:{ all -> 0x0283 }
            r13 = 12451(0x30a3, double:6.1516E-320)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0283 }
            r12.zzatu = r13     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzkq[] r12 = r7.zzatf     // Catch:{ all -> 0x0283 }
            r12 = r12[r11]     // Catch:{ all -> 0x0283 }
            java.lang.Long r13 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0283 }
            r12.zzatk = r13     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzkq[] r12 = r7.zzatf     // Catch:{ all -> 0x0283 }
            r12 = r12[r11]     // Catch:{ all -> 0x0283 }
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0283 }
            r12.zzatz = r13     // Catch:{ all -> 0x0283 }
            if (r10 != 0) goto L_0x01a9
            r12.zzauh = r9     // Catch:{ all -> 0x0283 }
        L_0x01a9:
            int r11 = r11 + 1
            goto L_0x0169
        L_0x01ac:
            com.google.android.gms.internal.measurement.zzfg r6 = r17.zzge()     // Catch:{ all -> 0x0283 }
            r10 = 2
            boolean r6 = r6.isLoggable(r10)     // Catch:{ all -> 0x0283 }
            if (r6 == 0) goto L_0x01bf
            com.google.android.gms.internal.measurement.zzfe r6 = r17.zzga()     // Catch:{ all -> 0x0283 }
            java.lang.String r9 = r6.zza((com.google.android.gms.internal.measurement.zzkp) r7)     // Catch:{ all -> 0x0283 }
        L_0x01bf:
            com.google.android.gms.internal.measurement.zzka r6 = r17.zzgb()     // Catch:{ all -> 0x0283 }
            byte[] r14 = r6.zzb((com.google.android.gms.internal.measurement.zzkp) r7)     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzex<java.lang.String> r6 = com.google.android.gms.internal.measurement.zzew.zzagy     // Catch:{ all -> 0x0283 }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x0283 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0283 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x024c }
            r13.<init>(r6)     // Catch:{ MalformedURLException -> 0x024c }
            boolean r10 = r8.isEmpty()     // Catch:{ MalformedURLException -> 0x024c }
            if (r10 != 0) goto L_0x01dc
            r10 = 1
            goto L_0x01dd
        L_0x01dc:
            r10 = 0
        L_0x01dd:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)     // Catch:{ MalformedURLException -> 0x024c }
            java.util.List<java.lang.Long> r10 = r1.zzaqq     // Catch:{ MalformedURLException -> 0x024c }
            if (r10 == 0) goto L_0x01f2
            com.google.android.gms.internal.measurement.zzfg r8 = r17.zzge()     // Catch:{ MalformedURLException -> 0x024c }
            com.google.android.gms.internal.measurement.zzfi r8 = r8.zzim()     // Catch:{ MalformedURLException -> 0x024c }
            java.lang.String r10 = "Set uploading progress before finishing the previous upload"
            r8.log(r10)     // Catch:{ MalformedURLException -> 0x024c }
            goto L_0x01f9
        L_0x01f2:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x024c }
            r10.<init>(r8)     // Catch:{ MalformedURLException -> 0x024c }
            r1.zzaqq = r10     // Catch:{ MalformedURLException -> 0x024c }
        L_0x01f9:
            com.google.android.gms.internal.measurement.zzfr r8 = r17.zzgf()     // Catch:{ MalformedURLException -> 0x024c }
            com.google.android.gms.internal.measurement.zzfu r8 = r8.zzajv     // Catch:{ MalformedURLException -> 0x024c }
            r8.set(r3)     // Catch:{ MalformedURLException -> 0x024c }
            java.lang.String r3 = "?"
            com.google.android.gms.internal.measurement.zzkq[] r4 = r7.zzatf     // Catch:{ MalformedURLException -> 0x024c }
            int r7 = r4.length     // Catch:{ MalformedURLException -> 0x024c }
            if (r7 <= 0) goto L_0x020d
            r3 = r4[r2]     // Catch:{ MalformedURLException -> 0x024c }
            java.lang.String r3 = r3.zzti     // Catch:{ MalformedURLException -> 0x024c }
        L_0x020d:
            com.google.android.gms.internal.measurement.zzfg r4 = r17.zzge()     // Catch:{ MalformedURLException -> 0x024c }
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzit()     // Catch:{ MalformedURLException -> 0x024c }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x024c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x024c }
            r4.zzd(r7, r3, r8, r9)     // Catch:{ MalformedURLException -> 0x024c }
            r1.zzaqm = r0     // Catch:{ MalformedURLException -> 0x024c }
            com.google.android.gms.internal.measurement.zzfk r11 = r17.zzkn()     // Catch:{ MalformedURLException -> 0x024c }
            com.google.android.gms.internal.measurement.zzjs r0 = new com.google.android.gms.internal.measurement.zzjs     // Catch:{ MalformedURLException -> 0x024c }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x024c }
            r11.zzab()     // Catch:{ MalformedURLException -> 0x024c }
            r11.zzch()     // Catch:{ MalformedURLException -> 0x024c }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)     // Catch:{ MalformedURLException -> 0x024c }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)     // Catch:{ MalformedURLException -> 0x024c }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ MalformedURLException -> 0x024c }
            com.google.android.gms.internal.measurement.zzgg r3 = r11.zzgd()     // Catch:{ MalformedURLException -> 0x024c }
            com.google.android.gms.internal.measurement.zzfo r4 = new com.google.android.gms.internal.measurement.zzfo     // Catch:{ MalformedURLException -> 0x024c }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x024c }
            r3.zzd((java.lang.Runnable) r4)     // Catch:{ MalformedURLException -> 0x024c }
            goto L_0x0025
        L_0x024c:
            com.google.android.gms.internal.measurement.zzfg r0 = r17.zzge()     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ all -> 0x0283 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzfg.zzbm(r5)     // Catch:{ all -> 0x0283 }
            r0.zze(r3, r4, r6)     // Catch:{ all -> 0x0283 }
            goto L_0x0025
        L_0x025f:
            r1.zzaqs = r7     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzei r0 = r17.zzix()     // Catch:{ all -> 0x0283 }
            long r5 = com.google.android.gms.internal.measurement.zzef.zzhi()     // Catch:{ all -> 0x0283 }
            long r3 = r3 - r5
            java.lang.String r0 = r0.zzab(r3)     // Catch:{ all -> 0x0283 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0283 }
            if (r3 != 0) goto L_0x0025
            com.google.android.gms.internal.measurement.zzei r3 = r17.zzix()     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.measurement.zzdy r0 = r3.zzbc(r0)     // Catch:{ all -> 0x0283 }
            if (r0 == 0) goto L_0x0025
            r1.zzb((com.google.android.gms.internal.measurement.zzdy) r0)     // Catch:{ all -> 0x0283 }
            goto L_0x0025
        L_0x0283:
            r0 = move-exception
            r1.zzaqn = r2
            r17.zzkv()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzks():void");
    }

    public final void zzkx() {
        zzfi zzim;
        Integer valueOf;
        Integer valueOf2;
        String str;
        zzab();
        zzkq();
        if (!this.zzaqg) {
            zzge().zzir().log("This instance being marked as an uploader");
            zzab();
            zzkq();
            if (zzky() && zzkw()) {
                int zza = zza(this.zzaqp);
                int zzij = this.zzacw.zzfv().zzij();
                zzab();
                if (zza > zzij) {
                    zzim = zzge().zzim();
                    valueOf = Integer.valueOf(zza);
                    valueOf2 = Integer.valueOf(zzij);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (zza < zzij) {
                    if (zza(zzij, this.zzaqp)) {
                        zzim = zzge().zzit();
                        valueOf = Integer.valueOf(zza);
                        valueOf2 = Integer.valueOf(zzij);
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        zzim = zzge().zzim();
                        valueOf = Integer.valueOf(zza);
                        valueOf2 = Integer.valueOf(zzij);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                zzim.zze(str, valueOf, valueOf2);
            }
            this.zzaqg = true;
            zzku();
        }
    }

    public final void zzkz() {
        this.zzaqk++;
    }

    public final zzgl zzla() {
        return this.zzacw;
    }

    public final void zzm(boolean z) {
        zzku();
    }
}
