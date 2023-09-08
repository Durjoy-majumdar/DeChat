package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wearable.ChannelApi;

public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();
    private final int type;
    private final int zzcj;
    private final zzay zzck;
    private final int zzg;

    public zzaw(zzay zzay, int i, int i2, int i3) {
        this.zzck = zzay;
        this.type = i;
        this.zzg = i2;
        this.zzcj = i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzck);
        int i = this.type;
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.zzg;
        String num2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int i3 = this.zzcj;
        StringBuilder sb = new StringBuilder(valueOf.length() + 81 + String.valueOf(num).length() + String.valueOf(num2).length());
        sb.append("ChannelEventParcelable[, channel=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(num);
        sb.append(", closeReason=");
        sb.append(num2);
        sb.append(", appErrorCode=");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzck, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.type);
        SafeParcelWriter.writeInt(parcel, 4, this.zzg);
        SafeParcelWriter.writeInt(parcel, 5, this.zzcj);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zza(ChannelApi.ChannelListener channelListener) {
        int i = this.type;
        if (i == 1) {
            channelListener.onChannelOpened(this.zzck);
        } else if (i == 2) {
            channelListener.onChannelClosed(this.zzck, this.zzg, this.zzcj);
        } else if (i == 3) {
            channelListener.onInputClosed(this.zzck, this.zzg, this.zzcj);
        } else if (i == 4) {
            channelListener.onOutputClosed(this.zzck, this.zzg, this.zzcj);
        }
    }
}
