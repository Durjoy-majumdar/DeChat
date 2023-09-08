package com.google.android.gms.internal.measurement;

abstract class zzhh extends zzhg {
    private boolean zzvo;

    public zzhh(zzgl zzgl) {
        super(zzgl);
        this.zzacw.zzb(this);
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

    public void zzih() {
    }

    public final void zzjw() {
        if (!this.zzvo) {
            zzih();
            this.zzacw.zzju();
            this.zzvo = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void zzm() {
        if (this.zzvo) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!zzhf()) {
            this.zzacw.zzju();
            this.zzvo = true;
        }
    }
}
