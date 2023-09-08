package com.google.android.gms.internal.gcm;

final class zzj extends zzg {
    private final zzh zzdi = new zzh();

    public final void zzd(Throwable th, Throwable th4) {
        if (th4 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th4);
        } else if (th4 != null) {
            this.zzdi.zzd(th, true).add(th4);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
