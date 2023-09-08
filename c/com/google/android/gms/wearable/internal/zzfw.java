package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfw> CREATOR = new zzfx();
    private final int versionCode;
    private final zzem zzaz;

    public zzfw(int i, IBinder iBinder) {
        this.versionCode = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.zzaz = queryLocalInterface instanceof zzem ? (zzem) queryLocalInterface : new zzeo(iBinder);
            return;
        }
        this.zzaz = null;
    }

    public zzfw(zzem zzem) {
        this.versionCode = 1;
        this.zzaz = zzem;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        zzem zzem = this.zzaz;
        SafeParcelWriter.writeIBinder(parcel, 2, zzem == null ? null : zzem.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
