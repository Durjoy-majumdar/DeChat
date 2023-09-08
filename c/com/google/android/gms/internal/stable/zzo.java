package com.google.android.gms.internal.stable;

final class zzo extends zzl {
    private final zzm zzahm = new zzm();

    public final void zza(Throwable th, Throwable th4) {
        if (th4 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th4);
        } else if (th4 != null) {
            this.zzahm.zza(th, true).add(th4);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
