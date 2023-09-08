package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import java.util.ArrayList;

public class FieldMappingDictionaryCreator implements Parcelable.Creator<FieldMappingDictionary> {
    public static final int CONTENT_DESCRIPTION = 0;

    public FieldMappingDictionary createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList<FieldMappingDictionary.Entry> arrayList = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, FieldMappingDictionary.Entry.CREATOR);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new FieldMappingDictionary(i, arrayList, str);
    }

    public FieldMappingDictionary[] newArray(int i) {
        return new FieldMappingDictionary[i];
    }
}
