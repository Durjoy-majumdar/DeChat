package com.google.android.gms.internal.measurement;

final class zzaaf implements zzaak {
    private zzaak[] zzbtf;

    public zzaaf(zzaak... zzaakArr) {
        this.zzbtf = zzaakArr;
    }

    public final boolean zzd(Class<?> cls) {
        for (zzaak zzd : this.zzbtf) {
            if (zzd.zzd(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzaaj zze(Class<?> cls) {
        for (zzaak zzaak : this.zzbtf) {
            if (zzaak.zzd(cls)) {
                return zzaak.zze(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
