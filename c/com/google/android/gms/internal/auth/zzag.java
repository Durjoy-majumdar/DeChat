package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new zzah();
    private final String accountType;
    private final int zzy;

    public zzag(int i, String str) {
        this.zzy = 1;
        this.accountType = (String) Preconditions.checkNotNull(str);
    }

    public zzag(String str) {
        this(1, str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        SafeParcelWriter.writeString(parcel, 2, this.accountType, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
