package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wearable.MessageEvent;

public final class zzfe extends AbstractSafeParcelable implements MessageEvent {
    public static final Parcelable.Creator<zzfe> CREATOR = new zzff();
    private final byte[] data;
    private final String zzcl;
    private final int zzeh;
    private final String zzek;

    public zzfe(int i, String str, byte[] bArr, String str2) {
        this.zzeh = i;
        this.zzcl = str;
        this.data = bArr;
        this.zzek = str2;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final String getPath() {
        return this.zzcl;
    }

    public final int getRequestId() {
        return this.zzeh;
    }

    public final String getSourceNodeId() {
        return this.zzek;
    }

    public final String toString() {
        int i = this.zzeh;
        String str = this.zzcl;
        byte[] bArr = this.data;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + valueOf.length());
        sb.append("MessageEventParcelable[");
        sb.append(i);
        sb.append(",");
        sb.append(str);
        sb.append(", size=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getRequestId());
        SafeParcelWriter.writeString(parcel, 3, getPath(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getData(), false);
        SafeParcelWriter.writeString(parcel, 5, getSourceNodeId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
