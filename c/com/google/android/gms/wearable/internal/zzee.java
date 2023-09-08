package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new zzef();
    public final int statusCode;
    public final ParcelFileDescriptor zzdz;

    public zzee(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.statusCode = i;
        this.zzdz = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdz, i | 1, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
