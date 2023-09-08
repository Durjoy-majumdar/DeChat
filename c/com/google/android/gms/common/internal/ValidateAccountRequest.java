package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

@Deprecated
public class ValidateAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ValidateAccountRequest> CREATOR = new ValidateAccountRequestCreator();
    private final int zzal;

    public ValidateAccountRequest(int i) {
        this.zzal = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzal);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
