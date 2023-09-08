package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

public class Logger {
    private final String mTag;
    private final String zzud;
    private final GmsLogger zzvd;
    private final int zzve;

    private Logger(String str, String str2) {
        this.zzud = str2;
        this.mTag = str;
        this.zzvd = new GmsLogger(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.mTag, i)) {
            i++;
        }
        this.zzve = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Logger(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L_0x0006
            java.lang.String r8 = ""
            goto L_0x0036
        L_0x0006:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            int r1 = r8.length
            r2 = 0
        L_0x0012:
            if (r2 >= r1) goto L_0x0028
            r3 = r8[r2]
            int r4 = r0.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0022
            java.lang.String r4 = ","
            r0.append(r4)
        L_0x0022:
            r0.append(r3)
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0028:
            r8 = 93
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L_0x0036:
            r6.<init>((java.lang.String) r7, (java.lang.String) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.logging.Logger.<init>(java.lang.String, java.lang.String[]):void");
    }

    /* renamed from: d */
    public void mo167267d(String str, Throwable th, Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    /* renamed from: d */
    public void mo167268d(String str, Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    /* renamed from: e */
    public void mo167269e(String str, Throwable th, Object... objArr) {
        format(str, objArr);
    }

    /* renamed from: e */
    public void mo167270e(String str, Object... objArr) {
        format(str, objArr);
    }

    public String elidePii(Object obj) {
        boolean canLogPii = this.zzvd.canLogPii();
        if (obj == null) {
            return "<NULL>";
        }
        String trim = obj.toString().trim();
        if (trim.isEmpty()) {
            return "<EMPTY>";
        }
        if (canLogPii) {
            return trim;
        }
        return String.format("<ELLIDED:%s>", new Object[]{Integer.valueOf(trim.hashCode())});
    }

    public String format(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzud.concat(str);
    }

    public String getTag() {
        return this.mTag;
    }

    /* renamed from: i */
    public void mo167274i(String str, Throwable th, Object... objArr) {
        format(str, objArr);
    }

    /* renamed from: i */
    public void mo167275i(String str, Object... objArr) {
        format(str, objArr);
    }

    public boolean isLoggable(int i) {
        return this.zzve <= i;
    }

    public boolean isPiiLoggable() {
        return this.zzvd.canLogPii();
    }

    /* renamed from: v */
    public void mo167278v(String str, Throwable th, Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    /* renamed from: v */
    public void mo167279v(String str, Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    /* renamed from: w */
    public void mo167280w(String str, Throwable th, Object... objArr) {
        format(str, objArr);
    }

    /* renamed from: w */
    public void mo167281w(String str, Object... objArr) {
        format(str, objArr);
    }

    /* renamed from: w */
    public void mo167282w(Throwable th) {
    }

    public void wtf(String str, Throwable th, Object... objArr) {
        Log.wtf(this.mTag, format(str, objArr), th);
    }

    public void wtf(String str, Object... objArr) {
        Log.wtf(this.mTag, format(str, objArr));
    }

    public void wtf(Throwable th) {
        Log.wtf(this.mTag, th);
    }
}
