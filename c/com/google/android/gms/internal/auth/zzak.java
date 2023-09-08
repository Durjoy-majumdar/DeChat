package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzal();
    private final String accountType;
    private final PendingIntent zzch;
    private final int zzy;

    public zzak(int i, String str, PendingIntent pendingIntent) {
        this.zzy = 1;
        this.accountType = (String) Preconditions.checkNotNull(str);
        this.zzch = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    public zzak(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        SafeParcelWriter.writeString(parcel, 2, this.accountType, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzch, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
