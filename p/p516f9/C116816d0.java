package p516f9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import p385u2.C111105a;

/* renamed from: f9.d0 */
public final class C116816d0 {
    /* renamed from: a */
    public static C116818e0 m164795a(SharedPreferences sharedPreferences, String str) {
        long j;
        String string = sharedPreferences.getString(C116835n.m164818d(str, "|P|"), (String) null);
        String string2 = sharedPreferences.getString(C116835n.m164818d(str, "|K|"), (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair f = m164798f(string, string2);
        String string3 = sharedPreferences.getString(C116835n.m164818d(str, "cre"), (String) null);
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
            return new C116818e0(f, j);
        }
        j = 0;
        return new C116818e0(f, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        com.google.android.gms.internal.firebase_messaging.zzh.zza(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p516f9.C116818e0 m164796b(java.io.File r4) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            java.util.Properties r4 = new java.util.Properties     // Catch:{ all -> 0x0041 }
            r4.<init>()     // Catch:{ all -> 0x0041 }
            r4.load(r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "pub"
            java.lang.String r1 = r4.getProperty(r1)     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "pri"
            java.lang.String r2 = r4.getProperty(r2)     // Catch:{ all -> 0x0041 }
            r3 = 0
            if (r1 == 0) goto L_0x003d
            if (r2 != 0) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            java.security.KeyPair r1 = m164798f(r1, r2)     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "cre"
            java.lang.String r4 = r4.getProperty(r2)     // Catch:{ NumberFormatException -> 0x0036 }
            long r2 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0036 }
            f9.e0 r4 = new f9.e0     // Catch:{ all -> 0x0041 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0041 }
            r0.close()
            return r4
        L_0x0036:
            r4 = move-exception
            f9.f0 r1 = new f9.f0     // Catch:{ all -> 0x0041 }
            r1.<init>(r4)     // Catch:{ all -> 0x0041 }
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x003d:
            r0.close()
            return r3
        L_0x0041:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r0 = move-exception
            com.google.android.gms.internal.firebase_messaging.zzh.zza(r4, r0)
        L_0x004c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p516f9.C116816d0.m164796b(java.io.File):f9.e0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        throw r4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m164797c(android.content.Context r3, java.lang.String r4, p516f9.C116818e0 r5) {
        /*
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)     // Catch:{ IOException -> 0x005e }
            java.io.File r3 = m164799i(r3, r4)     // Catch:{ IOException -> 0x005e }
            r3.createNewFile()     // Catch:{ IOException -> 0x005e }
            java.util.Properties r4 = new java.util.Properties     // Catch:{ IOException -> 0x005e }
            r4.<init>()     // Catch:{ IOException -> 0x005e }
            java.lang.String r0 = "pub"
            java.security.KeyPair r1 = r5.f350170a     // Catch:{ IOException -> 0x005e }
            java.security.PublicKey r1 = r1.getPublic()     // Catch:{ IOException -> 0x005e }
            byte[] r1 = r1.getEncoded()     // Catch:{ IOException -> 0x005e }
            r2 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)     // Catch:{ IOException -> 0x005e }
            r4.setProperty(r0, r1)     // Catch:{ IOException -> 0x005e }
            java.lang.String r0 = "pri"
            java.security.KeyPair r1 = r5.f350170a     // Catch:{ IOException -> 0x005e }
            java.security.PrivateKey r1 = r1.getPrivate()     // Catch:{ IOException -> 0x005e }
            byte[] r1 = r1.getEncoded()     // Catch:{ IOException -> 0x005e }
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)     // Catch:{ IOException -> 0x005e }
            r4.setProperty(r0, r1)     // Catch:{ IOException -> 0x005e }
            java.lang.String r0 = "cre"
            long r1 = r5.f350171b     // Catch:{ IOException -> 0x005e }
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x005e }
            r4.setProperty(r0, r5)     // Catch:{ IOException -> 0x005e }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005e }
            r5.<init>(r3)     // Catch:{ IOException -> 0x005e }
            r3 = 0
            r4.store(r5, r3)     // Catch:{ all -> 0x0052 }
            r5.close()     // Catch:{ IOException -> 0x005e }
            return
        L_0x0052:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r4 = move-exception
            r5.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r5 = move-exception
            com.google.android.gms.internal.firebase_messaging.zzh.zza(r3, r5)     // Catch:{ IOException -> 0x005e }
        L_0x005d:
            throw r4     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            r3 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r3 = r3.length()
            int r3 = r3 + 21
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p516f9.C116816d0.m164797c(android.content.Context, java.lang.String, f9.e0):void");
    }

    /* renamed from: f */
    public static KeyPair m164798f(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                new StringBuilder(String.valueOf(e).length() + 19);
                throw new C116820f0(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C116820f0(e2);
        }
    }

    /* renamed from: i */
    public static File m164799i(Context context, String str) {
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
        Object obj = C111105a.f332697a;
        File c = C111105a.C111110c.m151512c(context);
        if (c == null || !c.isDirectory()) {
            c = context.getFilesDir();
        }
        return new File(c, str2);
    }

    /* renamed from: d */
    public final void mo180806d(Context context, String str, C116818e0 e0Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (e0Var.equals(m164795a(sharedPreferences, str))) {
                return;
            }
        } catch (C116820f0 unused) {
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(C116835n.m164818d(str, "|P|"), Base64.encodeToString(e0Var.f350170a.getPublic().getEncoded(), 11));
        edit.putString(C116835n.m164818d(str, "|K|"), Base64.encodeToString(e0Var.f350170a.getPrivate().getEncoded(), 11));
        edit.putString(C116835n.m164818d(str, "cre"), String.valueOf(e0Var.f350171b));
        edit.commit();
    }

    /* renamed from: e */
    public final C116818e0 mo180807e(Context context, String str) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            C116818e0 e0Var = new C116818e0(instance.generateKeyPair(), System.currentTimeMillis());
            try {
                C116818e0 g = mo180808g(context, str);
                if (g != null) {
                    Log.isLoggable("FirebaseInstanceId", 3);
                    return g;
                }
            } catch (C116820f0 unused) {
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            m164797c(context, str, e0Var);
            mo180806d(context, str, e0Var);
            return e0Var;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    public final C116818e0 mo180808g(Context context, String str) {
        try {
            C116818e0 h = mo180809h(context, str);
            if (h != null) {
                mo180806d(context, str, h);
                return h;
            }
            e = null;
            try {
                C116818e0 a = m164795a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m164797c(context, str, a);
                    return a;
                }
            } catch (C116820f0 e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (C116820f0 e2) {
            e = e2;
        }
    }

    /* renamed from: h */
    public final C116818e0 mo180809h(Context context, String str) {
        File i = m164799i(context, str);
        if (!i.exists()) {
            return null;
        }
        try {
            return m164796b(i);
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                new StringBuilder(String.valueOf(e).length() + 40);
            }
            try {
                return m164796b(i);
            } catch (IOException e2) {
                new StringBuilder(String.valueOf(e2).length() + 45);
                throw new C116820f0(e2);
            }
        }
    }
}
