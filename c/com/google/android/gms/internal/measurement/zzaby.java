package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaby;

public abstract class zzaby<M extends zzaby<M>> extends zzace {
    public zzaca zzbww;

    public /* synthetic */ Object clone() {
        zzaby zzaby = (zzaby) super.clone();
        zzacc.zza(this, zzaby);
        return zzaby;
    }

    public int zza() {
        if (this.zzbww == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzbww.size(); i2++) {
            i += this.zzbww.zzau(i2).zza();
        }
        return i;
    }

    public final <T> T zza(zzabz<M, T> zzabz) {
        zzacb zzat;
        zzaca zzaca = this.zzbww;
        if (zzaca == null || (zzat = zzaca.zzat(zzabz.tag >>> 3)) == null) {
            return null;
        }
        return zzat.zzb(zzabz);
    }

    public void zza(zzabw zzabw) {
        if (this.zzbww != null) {
            for (int i = 0; i < this.zzbww.size(); i++) {
                this.zzbww.zzau(i).zza(zzabw);
            }
        }
    }

    public final boolean zza(zzabv zzabv, int i) {
        int position = zzabv.getPosition();
        if (!zzabv.zzak(i)) {
            return false;
        }
        int i2 = i >>> 3;
        zzacg zzacg = new zzacg(i, zzabv.zzc(position, zzabv.getPosition() - position));
        zzacb zzacb = null;
        zzaca zzaca = this.zzbww;
        if (zzaca == null) {
            this.zzbww = new zzaca();
        } else {
            zzacb = zzaca.zzat(i2);
        }
        if (zzacb == null) {
            zzacb = new zzacb();
            this.zzbww.zza(i2, zzacb);
        }
        zzacb.zza(zzacg);
        return true;
    }

    public final /* synthetic */ zzace zzvf() {
        return (zzaby) clone();
    }
}
