package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzfv implements Parcelable.Creator<zzfu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        zzdd zzdd = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                zzdd = (zzdd) SafeParcelReader.createParcelable(parcel, readHeader, zzdd.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzfu(i, zzdd);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfu[i];
    }
}
