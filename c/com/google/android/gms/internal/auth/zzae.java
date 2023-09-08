package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();
    private final String accountType;
    private final int zzcg;
    private final int zzy;

    public zzae(int i, String str, int i2) {
        this.zzy = 1;
        this.accountType = (String) Preconditions.checkNotNull(str);
        this.zzcg = i2;
    }

    public zzae(String str, int i) {
        this(1, str, i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        SafeParcelWriter.writeString(parcel, 2, this.accountType, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzcg);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
