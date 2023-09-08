package com.google.android.gms.common.api.internal;

abstract class zzat implements Runnable {
    private final /* synthetic */ zzaj zzhv;

    private zzat(zzaj zzaj) {
        this.zzhv = zzaj;
    }

    public /* synthetic */ zzat(zzaj zzaj, zzak zzak) {
        this(zzaj);
    }

    public void run() {
        this.zzhv.zzga.lock();
        try {
            if (!Thread.interrupted()) {
                zzaq();
            }
        } catch (RuntimeException e) {
            this.zzhv.zzhf.zzb(e);
        } catch (Throwable th) {
            this.zzhv.zzga.unlock();
            throw th;
        }
        this.zzhv.zzga.unlock();
    }

    public abstract void zzaq();
}
