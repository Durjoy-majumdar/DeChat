package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zzd();
    private final int zzh;
    private final long zzi;
    private final String zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.zzh = i;
        this.zzi = j;
        this.zzj = (String) Preconditions.checkNotNull(str);
        this.zzk = i2;
        this.zzl = i3;
        this.zzm = str2;
    }

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.zzh = 1;
        this.zzi = j;
        this.zzj = (String) Preconditions.checkNotNull(str);
        this.zzk = i;
        this.zzl = i2;
        this.zzm = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            return this.zzh == accountChangeEvent.zzh && this.zzi == accountChangeEvent.zzi && Objects.equal(this.zzj, accountChangeEvent.zzj) && this.zzk == accountChangeEvent.zzk && this.zzl == accountChangeEvent.zzl && Objects.equal(this.zzm, accountChangeEvent.zzm);
        }
    }

    public String getAccountName() {
        return this.zzj;
    }

    public String getChangeData() {
        return this.zzm;
    }

    public int getChangeType() {
        return this.zzk;
    }

    public int getEventIndex() {
        return this.zzl;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzh), Long.valueOf(this.zzi), this.zzj, Integer.valueOf(this.zzk), Integer.valueOf(this.zzl), this.zzm);
    }

    public String toString() {
        int i = this.zzk;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.zzj;
        String str3 = this.zzm;
        int i2 = this.zzl;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzh);
        SafeParcelWriter.writeLong(parcel, 2, this.zzi);
        SafeParcelWriter.writeString(parcel, 3, this.zzj, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzk);
        SafeParcelWriter.writeInt(parcel, 5, this.zzl);
        SafeParcelWriter.writeString(parcel, 6, this.zzm, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
