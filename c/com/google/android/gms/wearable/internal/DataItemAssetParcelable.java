package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wearable.DataItemAsset;

public class DataItemAssetParcelable extends AbstractSafeParcelable implements ReflectedParcelable, DataItemAsset {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new zzda();
    private final String zzdm;
    private final String zzdn;

    public DataItemAssetParcelable(DataItemAsset dataItemAsset) {
        this.zzdm = (String) Preconditions.checkNotNull(dataItemAsset.getId());
        this.zzdn = (String) Preconditions.checkNotNull(dataItemAsset.getDataItemKey());
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.zzdm = str;
        this.zzdn = str2;
    }

    public /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }

    public String getDataItemKey() {
        return this.zzdn;
    }

    public String getId() {
        return this.zzdm;
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.zzdm == null) {
            str = ",noid";
        } else {
            sb.append(",");
            str = this.zzdm;
        }
        sb.append(str);
        sb.append(", key=");
        sb.append(this.zzdn);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getDataItemKey(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
