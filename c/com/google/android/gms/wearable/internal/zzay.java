package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;

public final class zzay extends AbstractSafeParcelable implements Channel, ChannelClient.Channel {
    public static final Parcelable.Creator<zzay> CREATOR = new zzbi();
    /* access modifiers changed from: private */
    public final String zzce;
    private final String zzcl;
    private final String zzo;

    public zzay(String str, String str2, String str3) {
        this.zzce = (String) Preconditions.checkNotNull(str);
        this.zzo = (String) Preconditions.checkNotNull(str2);
        this.zzcl = (String) Preconditions.checkNotNull(str3);
    }

    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener) {
        return zzb.zza(googleApiClient, new zzbf(this.zzce, new IntentFilter[]{zzgj.zzc("com.google.android.gms.wearable.CHANNEL_EVENT")}), channelListener);
    }

    public final PendingResult<Status> close(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzaz(this, googleApiClient));
    }

    public final PendingResult<Status> close(GoogleApiClient googleApiClient, int i) {
        return googleApiClient.enqueue(new zzba(this, googleApiClient, i));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzay)) {
            return false;
        }
        zzay zzay = (zzay) obj;
        return this.zzce.equals(zzay.zzce) && Objects.equal(zzay.zzo, this.zzo) && Objects.equal(zzay.zzcl, this.zzcl);
    }

    public final PendingResult<Channel.GetInputStreamResult> getInputStream(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzbb(this, googleApiClient));
    }

    public final String getNodeId() {
        return this.zzo;
    }

    public final PendingResult<Channel.GetOutputStreamResult> getOutputStream(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzbc(this, googleApiClient));
    }

    public final String getPath() {
        return this.zzcl;
    }

    public final int hashCode() {
        return this.zzce.hashCode();
    }

    public final PendingResult<Status> receiveFile(GoogleApiClient googleApiClient, Uri uri, boolean z) {
        Preconditions.checkNotNull(googleApiClient, "client is null");
        Preconditions.checkNotNull(uri, "uri is null");
        return googleApiClient.enqueue(new zzbd(this, googleApiClient, uri, z));
    }

    public final PendingResult<Status> removeListener(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener) {
        Preconditions.checkNotNull(googleApiClient, "client is null");
        Preconditions.checkNotNull(channelListener, "listener is null");
        return googleApiClient.enqueue(new zzan(googleApiClient, channelListener, this.zzce));
    }

    public final PendingResult<Status> sendFile(GoogleApiClient googleApiClient, Uri uri) {
        return sendFile(googleApiClient, uri, 0, -1);
    }

    public final PendingResult<Status> sendFile(GoogleApiClient googleApiClient, Uri uri, long j, long j2) {
        GoogleApiClient googleApiClient2 = googleApiClient;
        Preconditions.checkNotNull(googleApiClient, "client is null");
        Preconditions.checkNotNull(this.zzce, "token is null");
        Uri uri2 = uri;
        Preconditions.checkNotNull(uri, "uri is null");
        Preconditions.checkArgument(j >= 0, "startOffset is negative: %s", Long.valueOf(j));
        Preconditions.checkArgument(j2 >= 0 || j2 == -1, "invalid length: %s", Long.valueOf(j2));
        return googleApiClient.enqueue(new zzbe(this, googleApiClient, uri, j, j2));
    }

    public final String toString() {
        int i = 0;
        for (char c : this.zzce.toCharArray()) {
            i += c;
        }
        String trim = this.zzce.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 16 + String.valueOf(substring2).length());
            sb.append(substring);
            sb.append("...");
            sb.append(substring2);
            sb.append("::");
            sb.append(i);
            trim = sb.toString();
        }
        String str = this.zzo;
        String str2 = this.zzcl;
        StringBuilder sb4 = new StringBuilder(String.valueOf(trim).length() + 31 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb4.append("Channel{token=");
        sb4.append(trim);
        sb4.append(", nodeId=");
        sb4.append(str);
        sb4.append(", path=");
        sb4.append(str2);
        sb4.append("}");
        return sb4.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzce, false);
        SafeParcelWriter.writeString(parcel, 3, getNodeId(), false);
        SafeParcelWriter.writeString(parcel, 4, getPath(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzc() {
        return this.zzce;
    }
}
