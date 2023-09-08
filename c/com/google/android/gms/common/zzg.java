package com.google.android.gms.common;

import com.google.android.gms.common.GoogleCertificates;

class zzg {
    private static final zzg zzbk = new zzg(true, (String) null, (Throwable) null);
    private final Throwable cause;
    public final boolean zzbl;
    private final String zzbm;

    public zzg(boolean z, String str, Throwable th) {
        this.zzbl = z;
        this.zzbm = str;
        this.cause = th;
    }

    public static zzg zza(String str, GoogleCertificates.CertData certData, boolean z, boolean z2) {
        return new zzi(str, certData, z, z2);
    }

    public static zzg zza(String str, Throwable th) {
        return new zzg(false, str, th);
    }

    public static zzg zze(String str) {
        return new zzg(false, str, (Throwable) null);
    }

    public static zzg zzg() {
        return zzbk;
    }

    public String getErrorMessage() {
        return this.zzbm;
    }

    public final void zzh() {
        if (!this.zzbl) {
            String valueOf = String.valueOf(getErrorMessage());
            String concat = valueOf.length() != 0 ? "GoogleCertificatesRslt: ".concat(valueOf) : new String("GoogleCertificatesRslt: ");
            if (this.cause != null) {
                throw new SecurityException(concat, this.cause);
            }
            throw new SecurityException(concat);
        }
    }

    public final void zzi() {
        if (!this.zzbl) {
            Throwable th = this.cause;
            getErrorMessage();
            if (th != null) {
            }
        }
    }
}
