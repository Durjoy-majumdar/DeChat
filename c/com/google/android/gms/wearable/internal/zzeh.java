package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzeh implements Parcelable.Creator<zzeg> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        zzfo zzfo = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                zzfo = (zzfo) SafeParcelReader.createParcelable(parcel, readHeader, zzfo.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzeg(i, zzfo);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzeg[i];
    }
}
