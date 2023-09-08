package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.ConnectionConfiguration;

public final class zzdx implements Parcelable.Creator<zzdw> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        ConnectionConfiguration connectionConfiguration = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                connectionConfiguration = (ConnectionConfiguration) SafeParcelReader.createParcelable(parcel, readHeader, ConnectionConfiguration.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzdw(i, connectionConfiguration);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdw[i];
    }
}
