package com.google.android.gms.internal.measurement;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class zzacb implements Cloneable {
    private Object value;
    private zzabz<?, ?> zzbxe;
    private List<zzacg> zzbxf = new ArrayList();

    private final byte[] toByteArray() {
        byte[] bArr = new byte[zza()];
        zza(zzabw.zzj(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzvg */
    public final zzacb clone() {
        Object clone;
        zzacb zzacb = new zzacb();
        try {
            zzacb.zzbxe = this.zzbxe;
            List<zzacg> list = this.zzbxf;
            if (list == null) {
                zzacb.zzbxf = null;
            } else {
                zzacb.zzbxf.addAll(list);
            }
            Object obj = this.value;
            if (obj != null) {
                if (obj instanceof zzace) {
                    clone = (zzace) ((zzace) obj).clone();
                } else if (obj instanceof byte[]) {
                    clone = ((byte[]) obj).clone();
                } else {
                    int i = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        zzacb.value = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        clone = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        clone = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        clone = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        clone = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        clone = ((double[]) obj).clone();
                    } else if (obj instanceof zzace[]) {
                        zzace[] zzaceArr = (zzace[]) obj;
                        zzace[] zzaceArr2 = new zzace[zzaceArr.length];
                        zzacb.value = zzaceArr2;
                        while (i < zzaceArr.length) {
                            zzaceArr2[i] = (zzace) zzaceArr[i].clone();
                            i++;
                        }
                    }
                }
                zzacb.value = clone;
            }
            return zzacb;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        List<zzacg> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacb)) {
            return false;
        }
        zzacb zzacb = (zzacb) obj;
        if (this.value == null || zzacb.value == null) {
            List<zzacg> list2 = this.zzbxf;
            if (list2 != null && (list = zzacb.zzbxf) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(toByteArray(), zzacb.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            zzabz<?, ?> zzabz = this.zzbxe;
            if (zzabz != zzacb.zzbxe) {
                return false;
            }
            if (!zzabz.zzbwx.isArray()) {
                return this.value.equals(zzacb.value);
            }
            Object obj2 = this.value;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) zzacb.value) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) zzacb.value) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) zzacb.value) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) zzacb.value) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) zzacb.value) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) zzacb.value) : Arrays.deepEquals((Object[]) obj2, (Object[]) zzacb.value);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + C1883v2.CTRL_INDEX;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int zza() {
        Object obj = this.value;
        if (obj != null) {
            zzabz<?, ?> zzabz = this.zzbxe;
            if (!zzabz.zzbwy) {
                return zzabz.zzv(obj);
            }
            int length = Array.getLength(obj);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Array.get(obj, i2) != null) {
                    i += zzabz.zzv(Array.get(obj, i2));
                }
            }
            return i;
        }
        int i3 = 0;
        for (zzacg next : this.zzbxf) {
            i3 += zzabw.zzas(next.tag) + 0 + next.zzbrc.length;
        }
        return i3;
    }

    public final void zza(zzabw zzabw) {
        Object obj = this.value;
        if (obj != null) {
            zzabz<?, ?> zzabz = this.zzbxe;
            if (zzabz.zzbwy) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        zzabz.zza(obj2, zzabw);
                    }
                }
                return;
            }
            zzabz.zza(obj, zzabw);
            return;
        }
        for (zzacg next : this.zzbxf) {
            zzabw.zzar(next.tag);
            zzabw.zzk(next.zzbrc);
        }
    }

    public final void zza(zzacg zzacg) {
        Object obj;
        List<zzacg> list = this.zzbxf;
        if (list != null) {
            list.add(zzacg);
            return;
        }
        Object obj2 = this.value;
        if (obj2 instanceof zzace) {
            byte[] bArr = zzacg.zzbrc;
            zzabv zza = zzabv.zza(bArr, 0, bArr.length);
            int zzuy = zza.zzuy();
            if (zzuy == bArr.length - zzabw.zzao(zzuy)) {
                obj = ((zzace) this.value).zzb(zza);
            } else {
                throw zzacd.zzvh();
            }
        } else if (obj2 instanceof zzace[]) {
            zzace[] zzaceArr = (zzace[]) this.zzbxe.zzi(Collections.singletonList(zzacg));
            zzace[] zzaceArr2 = (zzace[]) this.value;
            zzace[] zzaceArr3 = (zzace[]) Arrays.copyOf(zzaceArr2, zzaceArr2.length + zzaceArr.length);
            System.arraycopy(zzaceArr, 0, zzaceArr3, zzaceArr2.length, zzaceArr.length);
            obj = zzaceArr3;
        } else {
            obj = this.zzbxe.zzi(Collections.singletonList(zzacg));
        }
        this.zzbxe = this.zzbxe;
        this.value = obj;
        this.zzbxf = null;
    }

    public final <T> T zzb(zzabz<?, T> zzabz) {
        if (this.value == null) {
            this.zzbxe = zzabz;
            this.value = zzabz.zzi(this.zzbxf);
            this.zzbxf = null;
        } else if (!this.zzbxe.equals(zzabz)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return this.value;
    }
}
