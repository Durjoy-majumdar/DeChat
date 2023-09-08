package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public final class zzea extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzea> CREATOR = new zzeb();
    public final int statusCode;
    public final List<zzfo> zzdx;

    public zzea(int i, List<zzfo> list) {
        this.statusCode = i;
        this.zzdx = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzdx, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
