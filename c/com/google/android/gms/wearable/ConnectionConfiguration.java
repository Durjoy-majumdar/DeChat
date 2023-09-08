package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new zzg();
    private final String name;
    private final int type;
    private final String zzi;
    private final int zzj;
    private final boolean zzk;
    private volatile boolean zzl;
    private volatile String zzm;
    private boolean zzn;
    private String zzo;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.name = str;
        this.zzi = str2;
        this.type = i;
        this.zzj = i2;
        this.zzk = z;
        this.zzl = z2;
        this.zzm = str3;
        this.zzn = z3;
        this.zzo = str4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return Objects.equal(this.name, connectionConfiguration.name) && Objects.equal(this.zzi, connectionConfiguration.zzi) && Objects.equal(Integer.valueOf(this.type), Integer.valueOf(connectionConfiguration.type)) && Objects.equal(Integer.valueOf(this.zzj), Integer.valueOf(connectionConfiguration.zzj)) && Objects.equal(Boolean.valueOf(this.zzk), Boolean.valueOf(connectionConfiguration.zzk)) && Objects.equal(Boolean.valueOf(this.zzn), Boolean.valueOf(connectionConfiguration.zzn));
    }

    public int hashCode() {
        return Objects.hashCode(this.name, this.zzi, Integer.valueOf(this.type), Integer.valueOf(this.zzj), Boolean.valueOf(this.zzk), Boolean.valueOf(this.zzn));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.name);
        sb.append(valueOf.length() != 0 ? "mName=".concat(valueOf) : new String("mName="));
        String valueOf2 = String.valueOf(this.zzi);
        sb.append(valueOf2.length() != 0 ? ", mAddress=".concat(valueOf2) : new String(", mAddress="));
        int i = this.type;
        StringBuilder sb4 = new StringBuilder(19);
        sb4.append(", mType=");
        sb4.append(i);
        sb.append(sb4.toString());
        int i2 = this.zzj;
        StringBuilder sb5 = new StringBuilder(19);
        sb5.append(", mRole=");
        sb5.append(i2);
        sb.append(sb5.toString());
        boolean z = this.zzk;
        StringBuilder sb6 = new StringBuilder(16);
        sb6.append(", mEnabled=");
        sb6.append(z);
        sb.append(sb6.toString());
        boolean z2 = this.zzl;
        StringBuilder sb7 = new StringBuilder(20);
        sb7.append(", mIsConnected=");
        sb7.append(z2);
        sb.append(sb7.toString());
        String valueOf3 = String.valueOf(this.zzm);
        sb.append(valueOf3.length() != 0 ? ", mPeerNodeId=".concat(valueOf3) : new String(", mPeerNodeId="));
        boolean z3 = this.zzn;
        StringBuilder sb8 = new StringBuilder(21);
        sb8.append(", mBtlePriority=");
        sb8.append(z3);
        sb.append(sb8.toString());
        String valueOf4 = String.valueOf(this.zzo);
        sb.append(valueOf4.length() != 0 ? ", mNodeId=".concat(valueOf4) : new String(", mNodeId="));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzi, false);
        SafeParcelWriter.writeInt(parcel, 4, this.type);
        SafeParcelWriter.writeInt(parcel, 5, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzl);
        SafeParcelWriter.writeString(parcel, 8, this.zzm, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzn);
        SafeParcelWriter.writeString(parcel, 10, this.zzo, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
