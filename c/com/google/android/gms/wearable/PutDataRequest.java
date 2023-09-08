package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PutDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PutDataRequest> CREATOR = new zzh();
    public static final String WEAR_URI_SCHEME = "wear";
    private static final long zzt = TimeUnit.MINUTES.toMillis(30);
    private static final Random zzu = new SecureRandom();
    private byte[] data;
    private final Uri uri;
    private final Bundle zzv;
    private long zzw;

    private PutDataRequest(Uri uri2) {
        this(uri2, new Bundle(), (byte[]) null, zzt);
    }

    public PutDataRequest(Uri uri2, Bundle bundle, byte[] bArr, long j) {
        this.uri = uri2;
        this.zzv = bundle;
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.data = bArr;
        this.zzw = j;
    }

    public static PutDataRequest create(String str) {
        Asserts.checkNotNull(str, "path must not be null");
        return zza(zza(str));
    }

    public static PutDataRequest createFromDataItem(DataItem dataItem) {
        Asserts.checkNotNull(dataItem, "source must not be null");
        PutDataRequest zza = zza(dataItem.getUri());
        for (Map.Entry next : dataItem.getAssets().entrySet()) {
            if (((DataItemAsset) next.getValue()).getId() == null) {
                String valueOf = String.valueOf((String) next.getKey());
                throw new IllegalStateException(valueOf.length() != 0 ? "Cannot create an asset for a put request without a digest: ".concat(valueOf) : new String("Cannot create an asset for a put request without a digest: "));
            }
            zza.putAsset((String) next.getKey(), Asset.createFromRef(((DataItemAsset) next.getValue()).getId()));
        }
        zza.setData(dataItem.getData());
        return zza;
    }

    public static PutDataRequest createWithAutoAppendedId(String str) {
        Asserts.checkNotNull(str, "pathPrefix must not be null");
        StringBuilder sb = new StringBuilder(str);
        if (!str.endsWith("/")) {
            sb.append("/");
        }
        sb.append("PN");
        sb.append(zzu.nextLong());
        return new PutDataRequest(zza(sb.toString()));
    }

    private static Uri zza(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        } else if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else if (!str.startsWith("//")) {
            return new Uri.Builder().scheme(WEAR_URI_SCHEME).path(str).build();
        } else {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
    }

    public static PutDataRequest zza(Uri uri2) {
        Asserts.checkNotNull(uri2, "uri must not be null");
        return new PutDataRequest(uri2);
    }

    public Asset getAsset(String str) {
        Asserts.checkNotNull(str, "key must not be null");
        return (Asset) this.zzv.getParcelable(str);
    }

    public Map<String, Asset> getAssets() {
        HashMap hashMap = new HashMap();
        for (String next : this.zzv.keySet()) {
            hashMap.put(next, (Asset) this.zzv.getParcelable(next));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public byte[] getData() {
        return this.data;
    }

    public Uri getUri() {
        return this.uri;
    }

    public boolean hasAsset(String str) {
        Asserts.checkNotNull(str, "key must not be null");
        return this.zzv.containsKey(str);
    }

    public boolean isUrgent() {
        return this.zzw == 0;
    }

    public PutDataRequest putAsset(String str, Asset asset) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(asset);
        this.zzv.putParcelable(str, asset);
        return this;
    }

    public PutDataRequest removeAsset(String str) {
        Asserts.checkNotNull(str, "key must not be null");
        this.zzv.remove(str);
        return this;
    }

    public PutDataRequest setData(byte[] bArr) {
        this.data = bArr;
        return this;
    }

    public PutDataRequest setUrgent() {
        this.zzw = 0;
        return this;
    }

    public String toString() {
        return toString(Log.isLoggable(DataMap.TAG, 3));
    }

    public String toString(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.data;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb4 = new StringBuilder(valueOf.length() + 7);
        sb4.append("dataSz=");
        sb4.append(valueOf);
        sb.append(sb4.toString());
        int size = this.zzv.size();
        StringBuilder sb5 = new StringBuilder(23);
        sb5.append(", numAssets=");
        sb5.append(size);
        sb.append(sb5.toString());
        String valueOf2 = String.valueOf(this.uri);
        StringBuilder sb6 = new StringBuilder(valueOf2.length() + 6);
        sb6.append(", uri=");
        sb6.append(valueOf2);
        sb.append(sb6.toString());
        long j = this.zzw;
        StringBuilder sb7 = new StringBuilder(35);
        sb7.append(", syncDeadline=");
        sb7.append(j);
        sb.append(sb7.toString());
        if (!z) {
            str = "]";
        } else {
            sb.append("]\n  assets: ");
            for (String next : this.zzv.keySet()) {
                String valueOf3 = String.valueOf(this.zzv.getParcelable(next));
                StringBuilder sb8 = new StringBuilder(String.valueOf(next).length() + 7 + valueOf3.length());
                sb8.append("\n    ");
                sb8.append(next);
                sb8.append(": ");
                sb8.append(valueOf3);
                sb.append(sb8.toString());
            }
            str = "\n  ]";
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Asserts.checkNotNull(parcel, "dest must not be null");
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getUri(), i, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.zzv, false);
        SafeParcelWriter.writeByteArray(parcel, 5, getData(), false);
        SafeParcelWriter.writeLong(parcel, 6, this.zzw);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
