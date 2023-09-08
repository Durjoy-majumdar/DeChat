package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    private final zzem zzaz;
    private final IntentFilter[] zzba;
    private final String zzbb;
    private final String zzbc;

    public zzd(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.zzaz = queryLocalInterface instanceof zzem ? (zzem) queryLocalInterface : new zzeo(iBinder);
        } else {
            this.zzaz = null;
        }
        this.zzba = intentFilterArr;
        this.zzbb = str;
        this.zzbc = str2;
    }

    public zzd(zzhk zzhk) {
        this.zzaz = zzhk;
        this.zzba = zzhk.zze();
        this.zzbb = zzhk.zzf();
        this.zzbc = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzem zzem = this.zzaz;
        SafeParcelWriter.writeIBinder(parcel, 2, zzem == null ? null : zzem.asBinder(), false);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.zzba, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzbb, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
