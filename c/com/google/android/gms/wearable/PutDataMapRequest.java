package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.wearable.zze;
import com.google.android.gms.internal.wearable.zzf;
import com.google.android.gms.internal.wearable.zzt;

public class PutDataMapRequest {
    private final DataMap zzr;
    private final PutDataRequest zzs;

    private PutDataMapRequest(PutDataRequest putDataRequest, DataMap dataMap) {
        this.zzs = putDataRequest;
        DataMap dataMap2 = new DataMap();
        this.zzr = dataMap2;
        if (dataMap != null) {
            dataMap2.putAll(dataMap);
        }
    }

    public static PutDataMapRequest create(String str) {
        Asserts.checkNotNull(str, "path must not be null");
        return new PutDataMapRequest(PutDataRequest.create(str), (DataMap) null);
    }

    public static PutDataMapRequest createFromDataMapItem(DataMapItem dataMapItem) {
        Asserts.checkNotNull(dataMapItem, "source must not be null");
        return new PutDataMapRequest(PutDataRequest.zza(dataMapItem.getUri()), dataMapItem.getDataMap());
    }

    public static PutDataMapRequest createWithAutoAppendedId(String str) {
        Asserts.checkNotNull(str, "pathPrefix must not be null");
        return new PutDataMapRequest(PutDataRequest.createWithAutoAppendedId(str), (DataMap) null);
    }

    public PutDataRequest asPutDataRequest() {
        zzf zza = zze.zza(this.zzr);
        this.zzs.setData(zzt.zzb(zza.zzfw));
        int size = zza.zzfx.size();
        int i = 0;
        while (i < size) {
            String num = Integer.toString(i);
            Asset asset = zza.zzfx.get(i);
            if (num == null) {
                String valueOf = String.valueOf(asset);
                StringBuilder sb = new StringBuilder(valueOf.length() + 26);
                sb.append("asset key cannot be null: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (asset == null) {
                throw new IllegalStateException(num.length() != 0 ? "asset cannot be null: key=".concat(num) : new String("asset cannot be null: key="));
            } else {
                if (Log.isLoggable(DataMap.TAG, 3)) {
                    new StringBuilder(num.length() + 33 + String.valueOf(asset).length());
                }
                this.zzs.putAsset(num, asset);
                i++;
            }
        }
        return this.zzs;
    }

    public DataMap getDataMap() {
        return this.zzr;
    }

    public Uri getUri() {
        return this.zzs.getUri();
    }

    public boolean isUrgent() {
        return this.zzs.isUrgent();
    }

    public PutDataMapRequest setUrgent() {
        this.zzs.setUrgent();
        return this;
    }
}
