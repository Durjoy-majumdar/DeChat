package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzm implements Parcelable.Creator<PasswordSpecification> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
        ArrayList<Integer> arrayList2 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                arrayList = SafeParcelReader.createStringList(parcel, readHeader);
            } else if (fieldId == 3) {
                arrayList2 = SafeParcelReader.createIntegerList(parcel, readHeader);
            } else if (fieldId == 4) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                i2 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new PasswordSpecification(str, arrayList, arrayList2, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PasswordSpecification[i];
    }
}
