package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzzo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzzm<FieldDescriptorType extends zzzo<FieldDescriptorType>> {
    private static final zzzm zzbru = new zzzm(true);
    private boolean zzbls;
    private final zzaay<FieldDescriptorType, Object> zzbrs;
    private boolean zzbrt;

    private zzzm() {
        this.zzbrt = false;
        this.zzbrs = zzaay.zzag(16);
    }

    private zzzm(boolean z) {
        this.zzbrt = false;
        zzaay<FieldDescriptorType, Object> zzag = zzaay.zzag(0);
        this.zzbrs = zzag;
        if (!this.zzbls) {
            zzag.zzrg();
            this.zzbls = true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzzs) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzzu) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(com.google.android.gms.internal.measurement.zzabp r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzzr.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.measurement.zzzn.zzbrv
            com.google.android.gms.internal.measurement.zzabu r2 = r2.zzuv()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0041;
                case 2: goto L_0x003e;
                case 3: goto L_0x003b;
                case 4: goto L_0x0038;
                case 5: goto L_0x0035;
                case 6: goto L_0x0032;
                case 7: goto L_0x0029;
                case 8: goto L_0x0020;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0044
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzaal
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzzu
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x001e:
            r0 = 0
            goto L_0x0043
        L_0x0020:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzzs
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0029:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzyw
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0032:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0043
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0043
        L_0x0038:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0043
        L_0x003b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0043
        L_0x003e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0043
        L_0x0041:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0043:
            r1 = r0
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzzm.zza(com.google.android.gms.internal.measurement.zzabp, java.lang.Object):void");
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zztk()) {
            zza(fielddescriptortype.zztj(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                zza(fielddescriptortype.zztj(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzzu) {
            this.zzbrt = true;
        }
        this.zzbrs.put(fielddescriptortype, obj);
    }

    public static <T extends zzzo<T>> zzzm<T> zzti() {
        return zzbru;
    }

    public final /* synthetic */ Object clone() {
        zzzm zzzm = new zzzm();
        for (int i = 0; i < this.zzbrs.zzuj(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzah = this.zzbrs.zzah(i);
            zzzm.zza((zzzo) zzah.getKey(), zzah.getValue());
        }
        for (Map.Entry next : this.zzbrs.zzuk()) {
            zzzm.zza((zzzo) next.getKey(), next.getValue());
        }
        zzzm.zzbrt = this.zzbrt;
        return zzzm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzm)) {
            return false;
        }
        return this.zzbrs.equals(((zzzm) obj).zzbrs);
    }

    public final int hashCode() {
        return this.zzbrs.hashCode();
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzbrt ? new zzzx(this.zzbrs.entrySet().iterator()) : this.zzbrs.entrySet().iterator();
    }
}
