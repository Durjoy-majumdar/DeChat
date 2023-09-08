package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzed extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzed> CREATOR = new zzee();
    public boolean active;
    public long creationTimestamp;
    public String origin;
    public String packageName;
    public long timeToLive;
    public String triggerEventName;
    public long triggerTimeout;
    public zzjx zzaep;
    public zzeu zzaeq;
    public zzeu zzaer;
    public zzeu zzaes;

    public zzed(zzed zzed) {
        Preconditions.checkNotNull(zzed);
        this.packageName = zzed.packageName;
        this.origin = zzed.origin;
        this.zzaep = zzed.zzaep;
        this.creationTimestamp = zzed.creationTimestamp;
        this.active = zzed.active;
        this.triggerEventName = zzed.triggerEventName;
        this.zzaeq = zzed.zzaeq;
        this.triggerTimeout = zzed.triggerTimeout;
        this.zzaer = zzed.zzaer;
        this.timeToLive = zzed.timeToLive;
        this.zzaes = zzed.zzaes;
    }

    public zzed(String str, String str2, zzjx zzjx, long j, boolean z, String str3, zzeu zzeu, long j2, zzeu zzeu2, long j3, zzeu zzeu3) {
        this.packageName = str;
        this.origin = str2;
        this.zzaep = zzjx;
        this.creationTimestamp = j;
        this.active = z;
        this.triggerEventName = str3;
        this.zzaeq = zzeu;
        this.triggerTimeout = j2;
        this.zzaer = zzeu2;
        this.timeToLive = j3;
        this.zzaes = zzeu3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeString(parcel, 3, this.origin, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzaep, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.creationTimestamp);
        SafeParcelWriter.writeBoolean(parcel, 6, this.active);
        SafeParcelWriter.writeString(parcel, 7, this.triggerEventName, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzaeq, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.triggerTimeout);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzaer, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.timeToLive);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzaes, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
