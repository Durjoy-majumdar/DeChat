package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new zzf();
    private final int zzh;
    private final List<AccountChangeEvent> zzo;

    public AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.zzh = i;
        this.zzo = (List) Preconditions.checkNotNull(list);
    }

    public AccountChangeEventsResponse(List<AccountChangeEvent> list) {
        this.zzh = 1;
        this.zzo = (List) Preconditions.checkNotNull(list);
    }

    public List<AccountChangeEvent> getEvents() {
        return this.zzo;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzh);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzo, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
