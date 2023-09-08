package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;

public final class zzdd extends AbstractSafeParcelable implements DataItem {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();
    private byte[] data;
    private final Uri uri;
    private final Map<String, DataItemAsset> zzdo;

    public zzdd(Uri uri2, Bundle bundle, byte[] bArr) {
        this.uri = uri2;
        HashMap hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String next : bundle.keySet()) {
            hashMap.put(next, (DataItemAssetParcelable) bundle.getParcelable(next));
        }
        this.zzdo = hashMap;
        this.data = bArr;
    }

    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }

    public final Map<String, DataItemAsset> getAssets() {
        return this.zzdo;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final boolean isDataValid() {
        return true;
    }

    public final /* synthetic */ DataItem setData(byte[] bArr) {
        this.data = bArr;
        return this;
    }

    public final String toString() {
        String str;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.data;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb4 = new StringBuilder(valueOf.length() + 8);
        sb4.append(",dataSz=");
        sb4.append(valueOf);
        sb.append(sb4.toString());
        int size = this.zzdo.size();
        StringBuilder sb5 = new StringBuilder(23);
        sb5.append(", numAssets=");
        sb5.append(size);
        sb.append(sb5.toString());
        String valueOf2 = String.valueOf(this.uri);
        StringBuilder sb6 = new StringBuilder(valueOf2.length() + 6);
        sb6.append(", uri=");
        sb6.append(valueOf2);
        sb.append(sb6.toString());
        if (!isLoggable) {
            str = "]";
        } else {
            sb.append("]\n  assets: ");
            for (String next : this.zzdo.keySet()) {
                String valueOf3 = String.valueOf(this.zzdo.get(next));
                StringBuilder sb7 = new StringBuilder(String.valueOf(next).length() + 7 + valueOf3.length());
                sb7.append("\n    ");
                sb7.append(next);
                sb7.append(": ");
                sb7.append(valueOf3);
                sb.append(sb7.toString());
            }
            str = "\n  ]";
        }
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getUri(), i, false);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Map.Entry next : this.zzdo.entrySet()) {
            bundle.putParcelable((String) next.getKey(), new DataItemAssetParcelable((DataItemAsset) next.getValue()));
        }
        SafeParcelWriter.writeBundle(parcel, 4, bundle, false);
        SafeParcelWriter.writeByteArray(parcel, 5, getData(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
