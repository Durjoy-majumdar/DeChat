package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionInfo> CREATOR = new ConnectionInfoCreator();
    private Bundle zzsf;
    private Feature[] zzsg;

    public ConnectionInfo() {
    }

    public ConnectionInfo(Bundle bundle, Feature[] featureArr) {
        this.zzsf = bundle;
        this.zzsg = featureArr;
    }

    public Feature[] getAvailableFeatures() {
        return this.zzsg;
    }

    public Bundle getResolutionBundle() {
        return this.zzsf;
    }

    public ConnectionInfo setAvailableFeatures(Feature[] featureArr) {
        this.zzsg = featureArr;
        return this;
    }

    public ConnectionInfo setResolutionBundle(Bundle bundle) {
        this.zzsf = bundle;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zzsf, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zzsg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
