package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfq> CREATOR = new zzfr();
    public final int statusCode;
    public final zzay zzck;

    public zzfq(int i, zzay zzay) {
        this.statusCode = i;
        this.zzck = zzay;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzck, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
