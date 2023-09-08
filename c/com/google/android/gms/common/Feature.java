package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamite.ProviderConstants;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new FeatureCreator();
    private final String name;
    @Deprecated
    private final int zzaq;
    private final long zzar;

    public Feature(String str, int i, long j) {
        this.name = str;
        this.zzaq = i;
        this.zzar = j;
    }

    public Feature(String str, long j) {
        this.name = str;
        this.zzar = j;
        this.zzaq = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            return ((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && getVersion() == feature.getVersion();
        }
    }

    public String getName() {
        return this.name;
    }

    public long getVersion() {
        long j = this.zzar;
        return j == -1 ? (long) this.zzaq : j;
    }

    public int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", getName()).add(ProviderConstants.API_COLNAME_FEATURE_VERSION, Long.valueOf(getVersion())).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzaq);
        SafeParcelWriter.writeLong(parcel, 3, getVersion());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
