package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzeu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeu> CREATOR = new zzev();
    public final String name;
    public final String origin;
    public final zzer zzafq;
    public final long zzagb;

    public zzeu(zzeu zzeu, long j) {
        Preconditions.checkNotNull(zzeu);
        this.name = zzeu.name;
        this.zzafq = zzeu.zzafq;
        this.origin = zzeu.origin;
        this.zzagb = j;
    }

    public zzeu(String str, zzer zzer, String str2, long j) {
        this.name = str;
        this.zzafq = zzer;
        this.origin = str2;
        this.zzagb = j;
    }

    public final String toString() {
        String str = this.origin;
        String str2 = this.name;
        String valueOf = String.valueOf(this.zzafq);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + valueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzafq, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.origin, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzagb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
