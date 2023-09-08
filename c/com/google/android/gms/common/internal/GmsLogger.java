package com.google.android.gms.common.internal;

import android.util.Log;

public final class GmsLogger {
    public static final int MAX_PII_TAG_LENGTH = 15;
    public static final int MAX_TAG_LENGTH = 23;
    private static final String zzub = null;
    private final String zzuc;
    private final String zzud;

    public GmsLogger(String str) {
        this(str, (String) null);
    }

    public GmsLogger(String str, String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zzuc = str;
        if (str2 == null || str2.length() <= 0) {
            this.zzud = null;
        } else {
            this.zzud = str2;
        }
    }

    public static boolean isBuildPiiEnabled() {
        return false;
    }

    private final String zza(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.zzud;
        return str2 == null ? format : str2.concat(format);
    }

    private final String zzl(String str) {
        String str2 = this.zzud;
        return str2 == null ? str : str2.concat(str);
    }

    public final boolean canLog(int i) {
        return Log.isLoggable(this.zzuc, i);
    }

    public final boolean canLogPii() {
        return false;
    }

    /* renamed from: d */
    public final void mo167155d(String str, String str2) {
        if (canLog(3)) {
            zzl(str2);
        }
    }

    /* renamed from: d */
    public final void mo167156d(String str, String str2, Throwable th) {
        if (canLog(3)) {
            zzl(str2);
        }
    }

    public final void dfmt(String str, String str2, Object... objArr) {
        if (canLog(3)) {
            zza(str2, objArr);
        }
    }

    /* renamed from: e */
    public final void mo167158e(String str, String str2) {
        if (canLog(6)) {
            zzl(str2);
        }
    }

    /* renamed from: e */
    public final void mo167159e(String str, String str2, Throwable th) {
        if (canLog(6)) {
            zzl(str2);
        }
    }

    public final void efmt(String str, String str2, Object... objArr) {
        if (canLog(6)) {
            zza(str2, objArr);
        }
    }

    public final String getTag() {
        return this.zzuc;
    }

    /* renamed from: i */
    public final void mo167162i(String str, String str2) {
        if (canLog(4)) {
            zzl(str2);
        }
    }

    /* renamed from: i */
    public final void mo167163i(String str, String str2, Throwable th) {
        if (canLog(4)) {
            zzl(str2);
        }
    }

    public final void ifmt(String str, String str2, Object... objArr) {
        if (canLog(4)) {
            zza(str2, objArr);
        }
    }

    public final void pii(String str, String str2) {
        if (canLogPii()) {
            String valueOf = String.valueOf(str);
            if (" PII_LOG".length() != 0) {
                valueOf.concat(" PII_LOG");
            }
            zzl(str2);
        }
    }

    public final void pii(String str, String str2, Throwable th) {
        if (canLogPii()) {
            String valueOf = String.valueOf(str);
            if (" PII_LOG".length() != 0) {
                valueOf.concat(" PII_LOG");
            }
            zzl(str2);
        }
    }

    public final void piifmt(String str, String str2, Object... objArr) {
        if (canLogPii()) {
            String valueOf = String.valueOf(str);
            if (" PII_LOG".length() != 0) {
                valueOf.concat(" PII_LOG");
            }
            zza(str2, objArr);
        }
    }

    /* renamed from: v */
    public final void mo167168v(String str, String str2) {
        if (canLog(2)) {
            zzl(str2);
        }
    }

    /* renamed from: v */
    public final void mo167169v(String str, String str2, Throwable th) {
        if (canLog(2)) {
            zzl(str2);
        }
    }

    public final void vfmt(String str, String str2, Object... objArr) {
        if (canLog(2)) {
            zza(str2, objArr);
        }
    }

    /* renamed from: w */
    public final void mo167171w(String str, String str2) {
        if (canLog(5)) {
            zzl(str2);
        }
    }

    /* renamed from: w */
    public final void mo167172w(String str, String str2, Throwable th) {
        if (canLog(5)) {
            zzl(str2);
        }
    }

    public final void wfmt(String str, String str2, Object... objArr) {
        if (canLog(5)) {
            zza(str2, objArr);
        }
    }

    public final GmsLogger withMessagePrefix(String str) {
        return new GmsLogger(this.zzuc, str);
    }

    public final void wtf(String str, String str2, Throwable th) {
        if (canLog(7)) {
            zzl(str2);
            Log.wtf(str, zzl(str2), th);
        }
    }
}
