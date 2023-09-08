package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzjx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjx> CREATOR = new zzjy();
    public final String name;
    public final String origin;
    private final int versionCode;
    private final String zzajf;
    public final long zzaqz;
    private final Long zzara;
    private final Float zzarb;
    private final Double zzarc;

    public zzjx(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.versionCode = i;
        this.name = str;
        this.zzaqz = j;
        this.zzara = l;
        Double d2 = null;
        this.zzarb = null;
        if (i == 1) {
            this.zzarc = f != null ? Double.valueOf(f.doubleValue()) : d2;
        } else {
            this.zzarc = d;
        }
        this.zzajf = str2;
        this.origin = str3;
    }

    public zzjx(zzjz zzjz) {
        this(zzjz.name, zzjz.zzaqz, zzjz.value, zzjz.origin);
    }

    public zzjx(String str, long j, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.versionCode = 2;
        this.name = str;
        this.zzaqz = j;
        this.origin = str2;
        if (obj == null) {
            this.zzara = null;
            this.zzarb = null;
            this.zzarc = null;
            this.zzajf = null;
        } else if (obj instanceof Long) {
            this.zzara = (Long) obj;
            this.zzarb = null;
            this.zzarc = null;
            this.zzajf = null;
        } else if (obj instanceof String) {
            this.zzara = null;
            this.zzarb = null;
            this.zzarc = null;
            this.zzajf = (String) obj;
        } else if (obj instanceof Double) {
            this.zzara = null;
            this.zzarb = null;
            this.zzarc = (Double) obj;
            this.zzajf = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public final Object getValue() {
        Long l = this.zzara;
        if (l != null) {
            return l;
        }
        Double d = this.zzarc;
        if (d != null) {
            return d;
        }
        String str = this.zzajf;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzaqz);
        SafeParcelWriter.writeLongObject(parcel, 4, this.zzara, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, (Float) null, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzajf, false);
        SafeParcelWriter.writeString(parcel, 7, this.origin, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.zzarc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
