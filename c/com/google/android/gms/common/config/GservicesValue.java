package com.google.android.gms.common.config;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.UserManager;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.stable.zzg;
import com.google.android.gms.internal.stable.zzi;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public abstract class GservicesValue<T> {
    private static final Object sLock = new Object();
    /* access modifiers changed from: private */
    public static zza zzmu = null;
    private static int zzmv = 0;
    private static Context zzmw = null;
    private static String zzmx = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    private static HashSet<String> zzmy;
    public final T mDefaultValue;
    public final String mKey;
    private T zzmz = null;

    public interface zza {
        Long getLong(String str, Long l);

        String getString(String str, String str2);

        Boolean zza(String str, Boolean bool);

        Double zza(String str, Double d);

        Float zza(String str, Float f);

        Integer zza(String str, Integer num);

        String zzb(String str, String str2);
    }

    public static class zzb implements zza {
        /* access modifiers changed from: private */
        public static final Collection<GservicesValue<?>> zzna = new HashSet();

        private zzb() {
        }

        public /* synthetic */ zzb(zza zza) {
            this();
        }

        public final Long getLong(String str, Long l) {
            return l;
        }

        public final String getString(String str, String str2) {
            return str2;
        }

        public final Boolean zza(String str, Boolean bool) {
            return bool;
        }

        public final Double zza(String str, Double d) {
            return d;
        }

        public final Float zza(String str, Float f) {
            return f;
        }

        public final Integer zza(String str, Integer num) {
            return num;
        }

        public final String zzb(String str, String str2) {
            return str2;
        }
    }

    @Deprecated
    public static class zzc implements zza {
        private final Map<String, ?> values;

        public zzc(Map<String, ?> map) {
            this.values = map;
        }

        private final <T> T zza(String str, T t) {
            return this.values.containsKey(str) ? this.values.get(str) : t;
        }

        public final Long getLong(String str, Long l) {
            return (Long) zza(str, l);
        }

        public final String getString(String str, String str2) {
            return (String) zza(str, str2);
        }

        public final Boolean zza(String str, Boolean bool) {
            return (Boolean) zza(str, bool);
        }

        public final Double zza(String str, Double d) {
            return (Double) zza(str, d);
        }

        public final Float zza(String str, Float f) {
            return (Float) zza(str, f);
        }

        public final Integer zza(String str, Integer num) {
            return (Integer) zza(str, num);
        }

        public final String zzb(String str, String str2) {
            return (String) zza(str, str2);
        }
    }

    public static class zzd implements zza {
        private final ContentResolver mContentResolver;

        public zzd(ContentResolver contentResolver) {
            this.mContentResolver = contentResolver;
        }

        public final Long getLong(String str, Long l) {
            return Long.valueOf(zzi.getLong(this.mContentResolver, str, l.longValue()));
        }

        public final String getString(String str, String str2) {
            return zzi.zza(this.mContentResolver, str, str2);
        }

        public final Boolean zza(String str, Boolean bool) {
            return Boolean.valueOf(zzi.zza(this.mContentResolver, str, bool.booleanValue()));
        }

        public final Double zza(String str, Double d) {
            String zza = zzi.zza(this.mContentResolver, str, (String) null);
            if (zza != null) {
                try {
                    return Double.valueOf(Double.parseDouble(zza));
                } catch (NumberFormatException unused) {
                }
            }
            return d;
        }

        public final Float zza(String str, Float f) {
            String zza = zzi.zza(this.mContentResolver, str, (String) null);
            if (zza != null) {
                try {
                    return Float.valueOf(Float.parseFloat(zza));
                } catch (NumberFormatException unused) {
                }
            }
            return f;
        }

        public final Integer zza(String str, Integer num) {
            return Integer.valueOf(zzi.getInt(this.mContentResolver, str, num.intValue()));
        }

        public final String zzb(String str, String str2) {
            return zzg.zza(this.mContentResolver, str, str2);
        }
    }

    public GservicesValue(String str, T t) {
        this.mKey = str;
        this.mDefaultValue = t;
    }

    @Deprecated
    public static void forceInit(Context context) {
        forceInit(context, new HashSet());
    }

    public static void forceInit(Context context, HashSet<String> hashSet) {
        zza(context, new zzd(context.getContentResolver()), hashSet);
    }

    public static SharedPreferences getDirectBootCache(Context context) {
        return context.getApplicationContext().createDeviceProtectedStorageContext().getSharedPreferences("gservices-direboot-cache", 0);
    }

    public static int getSharedUserId() {
        return zzmv;
    }

    @Deprecated
    public static void init(Context context) {
        init(context, zzd(context) ? new HashSet() : null);
    }

    public static void init(Context context, HashSet<String> hashSet) {
        synchronized (sLock) {
            if (zzmu == null) {
                zza(context, new zzd(context.getContentResolver()), hashSet);
            }
            if (zzmv == 0) {
                try {
                    zzmv = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid;
                } catch (PackageManager.NameNotFoundException e) {
                    e.toString();
                }
            }
        }
    }

    @Deprecated
    public static void initForTests() {
        zza((Context) null, new zzb((zza) null), new HashSet());
    }

    public static void initForTests(Context context, HashSet<String> hashSet) {
        zza(context, new zzb((zza) null), hashSet);
    }

    @Deprecated
    public static void initForTests(String str, Object obj) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(str, obj);
        initForTests(hashMap);
    }

    @Deprecated
    public static void initForTests(Map<String, ?> map) {
        synchronized (sLock) {
            zzmu = new zzc(map);
        }
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (sLock) {
            z = zzmu != null;
        }
        return z;
    }

    public static GservicesValue<String> partnerSetting(String str, String str2) {
        return new zzg(str, str2);
    }

    public static void resetAllOverrides() {
        synchronized (sLock) {
            if (zzcg()) {
                for (GservicesValue resetOverride : zzb.zzna) {
                    resetOverride.resetOverride();
                }
                zzb.zzna.clear();
            }
        }
    }

    public static GservicesValue<Double> value(String str, Double d) {
        return new zzd(str, d);
    }

    public static GservicesValue<Float> value(String str, Float f) {
        return new zze(str, f);
    }

    public static GservicesValue<Integer> value(String str, Integer num) {
        return new zzc(str, num);
    }

    public static GservicesValue<Long> value(String str, Long l) {
        return new zzb(str, l);
    }

    public static GservicesValue<String> value(String str, String str2) {
        return new zzf(str, str2);
    }

    public static GservicesValue<Boolean> value(String str, boolean z) {
        return new zza(str, Boolean.valueOf(z));
    }

    private static void zza(Context context, zza zza2, HashSet<String> hashSet) {
        synchronized (sLock) {
            zzmu = zza2;
            zzmy = null;
            zzmw = null;
            if (context != null && zzd(context)) {
                zzmy = hashSet;
                zzmw = context.getApplicationContext().createDeviceProtectedStorageContext();
            }
        }
    }

    private static boolean zzcg() {
        boolean z;
        synchronized (sLock) {
            zza zza2 = zzmu;
            if (!(zza2 instanceof zzb)) {
                if (!(zza2 instanceof zzc)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    private static boolean zzd(Context context) {
        if (!PlatformVersion.isAtLeastN()) {
            return false;
        }
        UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
        return !userManager.isUserUnlocked() && !userManager.isUserRunning(Process.myUserHandle());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0072, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r1 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r3 = retrieve(r5.mKey);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0081, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0084, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0085, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0089, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008a, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008d, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0074 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T get() {
        /*
            r5 = this;
            T r0 = r5.zzmz
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.Object r1 = sLock
            monitor-enter(r1)
            android.content.Context r2 = zzmw     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x0018
            boolean r2 = zzd(r2)     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x0018
            r2 = 1
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.util.HashSet<java.lang.String> r3 = zzmy     // Catch:{ all -> 0x0091 }
            android.content.Context r4 = zzmw     // Catch:{ all -> 0x0091 }
            monitor-exit(r1)     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x0061
            java.lang.String r0 = "GservicesValue"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "Gservice value accessed during directboot: "
            java.lang.String r1 = r5.mKey
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x003a
            r0.concat(r1)
        L_0x003a:
            if (r3 == 0) goto L_0x0058
            java.lang.String r0 = r5.mKey
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "Gservices key not whitelisted for directboot access: "
            java.lang.String r1 = r5.mKey
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x0055
            r0.concat(r1)
        L_0x0055:
            T r0 = r5.mDefaultValue
            return r0
        L_0x0058:
            java.lang.String r0 = r5.mKey
            T r1 = r5.mDefaultValue
            java.lang.Object r0 = r5.retrieveFromDirectBootCache(r4, r0, r1)
            return r0
        L_0x0061:
            monitor-enter(r1)
            r2 = 0
            zzmy = r2     // Catch:{ all -> 0x008e }
            zzmw = r2     // Catch:{ all -> 0x008e }
            monitor-exit(r1)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = r5.mKey     // Catch:{ SecurityException -> 0x0074 }
            java.lang.Object r1 = r5.retrieve(r1)     // Catch:{ SecurityException -> 0x0074 }
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x0072:
            r1 = move-exception
            goto L_0x008a
        L_0x0074:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = r5.mKey     // Catch:{ all -> 0x0085 }
            java.lang.Object r3 = r5.retrieve(r3)     // Catch:{ all -> 0x0085 }
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ all -> 0x0072 }
            android.os.StrictMode.setThreadPolicy(r0)
            return r3
        L_0x0085:
            r3 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ all -> 0x0072 }
            throw r3     // Catch:{ all -> 0x0072 }
        L_0x008a:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        L_0x008e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008e }
            throw r0
        L_0x0091:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0091 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.config.GservicesValue.get():java.lang.Object");
    }

    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    public String getKey() {
        return this.mKey;
    }

    public void override(T t) {
        boolean z = zzmu instanceof zzb;
        this.zzmz = t;
        synchronized (sLock) {
            if (zzcg()) {
                zzb.zzna.add(this);
            }
        }
    }

    public void resetOverride() {
        this.zzmz = null;
    }

    public abstract T retrieve(String str);

    public T retrieveFromDirectBootCache(Context context, String str, T t) {
        throw new UnsupportedOperationException("The Gservices classes used does not support direct-boot");
    }
}
