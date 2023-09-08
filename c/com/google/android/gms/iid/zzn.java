package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.gcm.zzf;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import p385u2.C111105a;

final class zzn {
    private static zzo zzd(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(zzak.zzh(str, "|P|"), (String) null);
        String string2 = sharedPreferences.getString(zzak.zzh(str, "|K|"), (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        return new zzo(zzg(string, string2), zze(sharedPreferences, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        zzd(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.iid.zzo zzd(java.io.File r6) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r6)
            java.util.Properties r6 = new java.util.Properties     // Catch:{ all -> 0x0041 }
            r6.<init>()     // Catch:{ all -> 0x0041 }
            r6.load(r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "pub"
            java.lang.String r1 = r6.getProperty(r1)     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "pri"
            java.lang.String r2 = r6.getProperty(r2)     // Catch:{ all -> 0x0041 }
            r3 = 0
            if (r1 == 0) goto L_0x003d
            if (r2 != 0) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            java.security.KeyPair r1 = zzg((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "cre"
            java.lang.String r6 = r6.getProperty(r2)     // Catch:{ NumberFormatException -> 0x0036 }
            long r4 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0036 }
            com.google.android.gms.iid.zzo r6 = new com.google.android.gms.iid.zzo     // Catch:{ all -> 0x0041 }
            r6.<init>(r1, r4)     // Catch:{ all -> 0x0041 }
            zzd((java.lang.Throwable) r3, (java.io.FileInputStream) r0)
            return r6
        L_0x0036:
            r6 = move-exception
            com.google.android.gms.iid.zzp r1 = new com.google.android.gms.iid.zzp     // Catch:{ all -> 0x0041 }
            r1.<init>(r6)     // Catch:{ all -> 0x0041 }
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x003d:
            zzd((java.lang.Throwable) r3, (java.io.FileInputStream) r0)
            return r3
        L_0x0041:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            zzd((java.lang.Throwable) r6, (java.io.FileInputStream) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzn.zzd(java.io.File):com.google.android.gms.iid.zzo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        zzd(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzd(android.content.Context r3, java.lang.String r4, com.google.android.gms.iid.zzo r5) {
        /*
            java.lang.String r0 = "InstanceID"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ IOException -> 0x0046 }
            java.io.File r3 = zzj(r3, r4)     // Catch:{ IOException -> 0x0046 }
            r3.createNewFile()     // Catch:{ IOException -> 0x0046 }
            java.util.Properties r4 = new java.util.Properties     // Catch:{ IOException -> 0x0046 }
            r4.<init>()     // Catch:{ IOException -> 0x0046 }
            java.lang.String r0 = "pub"
            java.lang.String r1 = r5.zzo()     // Catch:{ IOException -> 0x0046 }
            r4.setProperty(r0, r1)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r0 = "pri"
            java.lang.String r1 = r5.zzp()     // Catch:{ IOException -> 0x0046 }
            r4.setProperty(r0, r1)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r0 = "cre"
            long r1 = r5.zzbx     // Catch:{ IOException -> 0x0046 }
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0046 }
            r4.setProperty(r0, r5)     // Catch:{ IOException -> 0x0046 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0046 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0046 }
            r3 = 0
            r4.store(r5, r3)     // Catch:{ all -> 0x003f }
            zzd((java.lang.Throwable) r3, (java.io.FileOutputStream) r5)     // Catch:{ IOException -> 0x0046 }
            return
        L_0x003f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r4 = move-exception
            zzd((java.lang.Throwable) r3, (java.io.FileOutputStream) r5)     // Catch:{ IOException -> 0x0046 }
            throw r4     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            r3 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r3 = r3.length()
            int r3 = r3 + 21
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzn.zzd(android.content.Context, java.lang.String, com.google.android.gms.iid.zzo):void");
    }

    private static /* synthetic */ void zzd(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                zzf.zzd(th, th4);
            }
        } else {
            fileInputStream.close();
        }
    }

    private static /* synthetic */ void zzd(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th4) {
                zzf.zzd(th, th4);
            }
        } else {
            fileOutputStream.close();
        }
    }

    private static long zze(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(zzak.zzh(str, "cre"), (String) null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private final void zze(Context context, String str, zzo zzo) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (zzo.equals(zzd(sharedPreferences, str))) {
                return;
            }
        } catch (zzp unused) {
        }
        Log.isLoggable("InstanceID", 3);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(zzak.zzh(str, "|P|"), zzo.zzo());
        edit.putString(zzak.zzh(str, "|K|"), zzo.zzp());
        edit.putString(zzak.zzh(str, "cre"), String.valueOf(zzo.zzbx));
        edit.commit();
    }

    private static KeyPair zzg(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                new StringBuilder(String.valueOf(e).length() + 19);
                throw new zzp(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new zzp(e2);
        }
    }

    public static void zzg(Context context, String str) {
        File zzj = zzj(context, str);
        if (zzj.exists()) {
            zzj.delete();
        }
    }

    private final zzo zzh(Context context, String str) {
        try {
            zzo zzi = zzi(context, str);
            if (zzi != null) {
                zze(context, str, zzi);
                return zzi;
            }
            e = null;
            try {
                zzo zzd = zzd(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (zzd != null) {
                    zzd(context, str, zzd);
                    return zzd;
                }
            } catch (zzp e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (zzp e2) {
            e = e2;
        }
    }

    private final zzo zzi(Context context, String str) {
        File zzj = zzj(context, str);
        if (!zzj.exists()) {
            return null;
        }
        try {
            return zzd(zzj);
        } catch (IOException e) {
            if (Log.isLoggable("InstanceID", 3)) {
                new StringBuilder(String.valueOf(e).length() + 40);
            }
            try {
                return zzd(zzj);
            } catch (IOException e2) {
                new StringBuilder(String.valueOf(e2).length() + 45);
                throw new zzp(e2);
            }
        }
    }

    public static void zzi(Context context) {
        for (File file : zzj(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private static File zzj(Context context) {
        Object obj = C111105a.f332697a;
        File c = C111105a.C111110c.m151512c(context);
        return (c == null || !c.isDirectory()) ? context.getFilesDir() : c;
    }

    private static File zzj(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(zzj(context), str2);
    }

    public final zzo zze(Context context, String str) {
        zzo zzh = zzh(context, str);
        return zzh != null ? zzh : zzf(context, str);
    }

    public final zzo zzf(Context context, String str) {
        zzo zzo = new zzo(zzd.zzk(), System.currentTimeMillis());
        try {
            zzo zzh = zzh(context, str);
            if (zzh != null) {
                Log.isLoggable("InstanceID", 3);
                return zzh;
            }
        } catch (zzp unused) {
        }
        Log.isLoggable("InstanceID", 3);
        zzd(context, str, zzo);
        zze(context, str, zzo);
        return zzo;
    }
}
