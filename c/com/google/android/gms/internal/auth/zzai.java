package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();
    private final String accountType;
    private final byte[] zzbz;
    private final int zzy;

    public zzai(int i, String str, byte[] bArr) {
        this.zzy = 1;
        this.accountType = (String) Preconditions.checkNotNull(str);
        this.zzbz = (byte[]) Preconditions.checkNotNull(bArr);
    }

    public zzai(String str, byte[] bArr) {
        this(1, str, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        SafeParcelWriter.writeString(parcel, 2, this.accountType, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzbz, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
