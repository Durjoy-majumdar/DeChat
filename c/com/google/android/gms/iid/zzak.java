package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p1042u.C111055b;
import p385u2.C111105a;

public final class zzak {
    private SharedPreferences zzcz;
    private final zzn zzda;
    private final Map<String, zzo> zzdb;
    private Context zzk;

    public zzak(Context context) {
        this(context, new zzn());
    }

    private zzak(Context context, zzn zzn) {
        this.zzdb = new C111055b();
        this.zzk = context;
        this.zzcz = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.zzda = zzn;
        Context context2 = this.zzk;
        Object obj = C111105a.f332697a;
        File file = new File(C111105a.C111110c.m151512c(context2), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !isEmpty()) {
                    InstanceIDListenerService.zzd(this.zzk, this);
                }
            } catch (IOException e) {
                if (Log.isLoggable("InstanceID/Store", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        "Error creating file in no backup dir: ".concat(valueOf);
                    }
                }
            }
        }
    }

    private static String zzd(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    public static String zzh(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized String get(String str) {
        return this.zzcz.getString(str, (String) null);
    }

    public final boolean isEmpty() {
        return this.zzcz.getAll().isEmpty();
    }

    public final synchronized void zzd(String str, String str2, String str3, String str4, String str5) {
        String zzd = zzd(str, str2, str3);
        SharedPreferences.Editor edit = this.zzcz.edit();
        edit.putString(zzd, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000));
        edit.commit();
    }

    public final synchronized String zze(String str, String str2, String str3) {
        return this.zzcz.getString(zzd(str, str2, str3), (String) null);
    }

    public final synchronized void zzf(String str, String str2, String str3) {
        String zzd = zzd(str, str2, str3);
        SharedPreferences.Editor edit = this.zzcz.edit();
        edit.remove(zzd);
        edit.commit();
    }

    public final synchronized void zzi(String str) {
        SharedPreferences.Editor edit = this.zzcz.edit();
        for (String next : this.zzcz.getAll().keySet()) {
            if (next.startsWith(str)) {
                edit.remove(next);
            }
        }
        edit.commit();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        com.google.android.gms.iid.InstanceIDListenerService.zzd(r2.zzk, r2);
        r0 = r2.zzda.zzf(r2.zzk, r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.iid.zzo zzj(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.google.android.gms.iid.zzo> r0 = r2.zzdb     // Catch:{ all -> 0x002a }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x002a }
            com.google.android.gms.iid.zzo r0 = (com.google.android.gms.iid.zzo) r0     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)
            return r0
        L_0x000d:
            com.google.android.gms.iid.zzn r0 = r2.zzda     // Catch:{ zzp -> 0x0016 }
            android.content.Context r1 = r2.zzk     // Catch:{ zzp -> 0x0016 }
            com.google.android.gms.iid.zzo r0 = r0.zze((android.content.Context) r1, (java.lang.String) r3)     // Catch:{ zzp -> 0x0016 }
            goto L_0x0023
        L_0x0016:
            android.content.Context r0 = r2.zzk     // Catch:{ all -> 0x002a }
            com.google.android.gms.iid.InstanceIDListenerService.zzd(r0, r2)     // Catch:{ all -> 0x002a }
            com.google.android.gms.iid.zzn r0 = r2.zzda     // Catch:{ all -> 0x002a }
            android.content.Context r1 = r2.zzk     // Catch:{ all -> 0x002a }
            com.google.android.gms.iid.zzo r0 = r0.zzf(r1, r3)     // Catch:{ all -> 0x002a }
        L_0x0023:
            java.util.Map<java.lang.String, com.google.android.gms.iid.zzo> r1 = r2.zzdb     // Catch:{ all -> 0x002a }
            r1.put(r3, r0)     // Catch:{ all -> 0x002a }
            monitor-exit(r2)
            return r0
        L_0x002a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzak.zzj(java.lang.String):com.google.android.gms.iid.zzo");
    }

    public final void zzk(String str) {
        synchronized (this) {
            this.zzdb.remove(str);
        }
        zzn.zzg(this.zzk, str);
        zzi(String.valueOf(str).concat("|"));
    }

    public final synchronized void zzx() {
        this.zzdb.clear();
        zzn.zzi(this.zzk);
        this.zzcz.edit().clear().commit();
    }
}
