package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzzq;
import com.google.protobuf.C23927r;
import java.util.Set;

final class zzaad implements zzaaw {
    private static final zzaak zzbte = new zzaae();
    private final zzaak zzbtd;

    public zzaad() {
        this(new zzaaf(zzzp.zztl(), zzts()));
    }

    private zzaad(zzaak zzaak) {
        this.zzbtd = (zzaak) zzzr.zza(zzaak, "messageInfoFactory");
    }

    private static boolean zza(zzaaj zzaaj) {
        return zzaaj.zztw() == zzzq.zzb.zzbsk;
    }

    private static zzaak zzts() {
        Class<C23927r> cls = C23927r.class;
        try {
            Set<String> set = C23927r.f68548a;
            return (zzaak) cls.getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return zzbte;
        }
    }

    public final <T> zzaav<T> zzg(Class<T> cls) {
        Class<zzzq> cls2 = zzzq.class;
        zzaax.zzh(cls);
        zzaaj zze = this.zzbtd.zze(cls);
        if (zze.zztx()) {
            return cls2.isAssignableFrom(cls) ? zzaap.zza(zzaax.zzug(), zzzl.zztg(), zze.zzty()) : zzaap.zza(zzaax.zzue(), zzzl.zzth(), zze.zzty());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean zza = zza(zze);
            zzaaq zzub = zzaas.zzub();
            zzzz zztr = zzzz.zztr();
            zzabj<?, ?> zzug = zzaax.zzug();
            if (zza) {
                return zzaao.zza(cls, zze, zzub, zztr, zzug, zzzl.zztg(), zzaai.zztu());
            }
            return zzaao.zza(cls, zze, zzub, zztr, zzug, (zzzj<?>) null, zzaai.zztu());
        }
        boolean zza2 = zza(zze);
        zzaaq zzua = zzaas.zzua();
        zzzz zztq = zzzz.zztq();
        if (zza2) {
            return zzaao.zza(cls, zze, zzua, zztq, zzaax.zzue(), zzzl.zzth(), zzaai.zztt());
        }
        return zzaao.zza(cls, zze, zzua, zztq, zzaax.zzuf(), (zzzj<?>) null, zzaai.zztt());
    }
}
