package com.google.android.gms.internal.measurement;

abstract class zzjq extends zzjp {
    private boolean zzvo;

    public zzjq(zzjr zzjr) {
        super(zzjr);
        this.zzajp.zzb(this);
    }

    public final boolean isInitialized() {
        return this.zzvo;
    }

    public final void zzch() {
        if (!isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public abstract boolean zzhf();

    public final void zzm() {
        if (!this.zzvo) {
            zzhf();
            this.zzajp.zzkz();
            this.zzvo = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
