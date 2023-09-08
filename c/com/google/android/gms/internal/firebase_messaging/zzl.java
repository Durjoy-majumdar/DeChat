package com.google.android.gms.internal.firebase_messaging;

final class zzl extends zzi {
    private final zzj zzk = new zzj();

    public final void zza(Throwable th, Throwable th4) {
        if (th4 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th4);
        } else if (th4 != null) {
            this.zzk.zza(th, true).add(th4);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
