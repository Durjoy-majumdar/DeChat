package com.google.android.gms.internal.measurement;

public class zzzy {
    private static final zzzi zzbsw = zzzi.zzte();
    private zzyw zzbsx;
    private volatile zzaal zzbsy;
    private volatile zzyw zzbsz;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.zzaal zzb(com.google.android.gms.internal.measurement.zzaal r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzaal r0 = r1.zzbsy
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzaal r0 = r1.zzbsy     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.zzbsy = r2     // Catch:{ zzzt -> 0x0012 }
            com.google.android.gms.internal.measurement.zzyw r0 = com.google.android.gms.internal.measurement.zzyw.zzbqx     // Catch:{ zzzt -> 0x0012 }
            r1.zzbsz = r0     // Catch:{ zzzt -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.zzbsy = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.measurement.zzyw r2 = com.google.android.gms.internal.measurement.zzyw.zzbqx     // Catch:{ all -> 0x0019 }
            r1.zzbsz = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            com.google.android.gms.internal.measurement.zzaal r2 = r1.zzbsy
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzzy.zzb(com.google.android.gms.internal.measurement.zzaal):com.google.android.gms.internal.measurement.zzaal");
    }

    private final zzyw zztp() {
        if (this.zzbsz != null) {
            return this.zzbsz;
        }
        synchronized (this) {
            if (this.zzbsz != null) {
                zzyw zzyw = this.zzbsz;
                return zzyw;
            }
            this.zzbsz = this.zzbsy == null ? zzyw.zzbqx : this.zzbsy.zztp();
            zzyw zzyw2 = this.zzbsz;
            return zzyw2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzy)) {
            return false;
        }
        zzzy zzzy = (zzzy) obj;
        zzaal zzaal = this.zzbsy;
        zzaal zzaal2 = zzzy.zzbsy;
        return (zzaal == null && zzaal2 == null) ? zztp().equals(zzzy.zztp()) : (zzaal == null || zzaal2 == null) ? zzaal != null ? zzaal.equals(zzzy.zzb(zzaal.zztz())) : zzb(zzaal2.zztz()).equals(zzaal2) : zzaal.equals(zzaal2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzaal zzc(zzaal zzaal) {
        zzaal zzaal2 = this.zzbsy;
        this.zzbsx = null;
        this.zzbsz = null;
        this.zzbsy = zzaal;
        return zzaal2;
    }
}
