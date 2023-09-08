package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import p385u2.C118562b;

public abstract class zzws<T> {
    private static final Object zzbnc = new Object();
    private static boolean zzbnd;
    private static volatile Boolean zzbne;
    private static volatile Boolean zzbnf;
    private static Context zzqx;
    private final zzxc zzbng;
    public final String zzbnh;
    private final String zzbni;
    private final T zzbnj;
    private T zzbnk;
    private volatile zzwp zzbnl;
    private volatile SharedPreferences zzbnm;

    private zzws(zzxc zzxc, String str, T t) {
        this.zzbnk = null;
        this.zzbnl = null;
        this.zzbnm = null;
        if (zzxc.zzbns != null) {
            this.zzbng = zzxc;
            String valueOf = String.valueOf(zzxc.zzbnt);
            String valueOf2 = String.valueOf(str);
            this.zzbni = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(zzxc.zzbnu);
            String valueOf4 = String.valueOf(str);
            this.zzbnh = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.zzbnj = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public /* synthetic */ zzws(zzxc zzxc, String str, Object obj, zzww zzww) {
        this(zzxc, str, obj);
    }

    public static void init(Context context) {
        synchronized (zzbnc) {
            if (Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            }
            if (zzqx != context) {
                zzbne = null;
            }
            zzqx = context;
        }
        zzbnd = false;
    }

    /* access modifiers changed from: private */
    public static zzws<Double> zza(zzxc zzxc, String str, double d) {
        return new zzwz(zzxc, str, Double.valueOf(d));
    }

    /* access modifiers changed from: private */
    public static zzws<Integer> zza(zzxc zzxc, String str, int i) {
        return new zzwx(zzxc, str, Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    public static zzws<Long> zza(zzxc zzxc, String str, long j) {
        return new zzww(zzxc, str, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    public static zzws<String> zza(zzxc zzxc, String str, String str2) {
        return new zzxa(zzxc, str, str2);
    }

    /* access modifiers changed from: private */
    public static zzws<Boolean> zza(zzxc zzxc, String str, boolean z) {
        return new zzwy(zzxc, str, Boolean.valueOf(z));
    }

    private static <V> V zza(zzxb<V> zzxb) {
        long clearCallingIdentity;
        try {
            return zzxb.zzsc();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zzsc = zzxb.zzsc();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zzsc;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public static boolean zzd(String str, boolean z) {
        try {
            if (zzsa()) {
                return ((Boolean) zza(new zzwv(str, false))).booleanValue();
            }
        } catch (SecurityException unused) {
        }
        return false;
    }

    private final T zzry() {
        if (zzd("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String valueOf = String.valueOf(this.zzbnh);
            if (valueOf.length() == 0) {
                return null;
            }
            "Bypass reading Phenotype values for flag: ".concat(valueOf);
            return null;
        } else if (this.zzbng.zzbns == null) {
            return null;
        } else {
            if (this.zzbnl == null) {
                this.zzbnl = zzwp.zza(zzqx.getContentResolver(), this.zzbng.zzbns);
            }
            String str = (String) zza(new zzwt(this, this.zzbnl));
            if (str != null) {
                return zzey(str);
            }
            return null;
        }
    }

    private final T zzrz() {
        if (!zzsa()) {
            return null;
        }
        try {
            String str = (String) zza(new zzwu(this));
            if (str != null) {
                return zzey(str);
            }
            return null;
        } catch (SecurityException unused) {
            String valueOf = String.valueOf(this.zzbnh);
            if (valueOf.length() == 0) {
                return null;
            }
            "Unable to read GServices for flag: ".concat(valueOf);
            return null;
        }
    }

    private static boolean zzsa() {
        if (zzbne == null) {
            Context context = zzqx;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (C118562b.m167229a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            zzbne = Boolean.valueOf(z);
        }
        return zzbne.booleanValue();
    }

    public final T get() {
        if (zzqx != null) {
            T zzry = zzry();
            if (zzry != null) {
                return zzry;
            }
            T zzrz = zzrz();
            return zzrz != null ? zzrz : this.zzbnj;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    public abstract T zzey(String str);

    public final /* synthetic */ String zzsb() {
        return zzwn.zza(zzqx.getContentResolver(), this.zzbni, (String) null);
    }
}
