package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;

public final class zzdf extends DataBufferRef implements DataItem {
    private final int zzdl;

    public zzdf(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.zzdl = i2;
    }

    public final /* synthetic */ Object freeze() {
        return new zzdc(this);
    }

    public final Map<String, DataItemAsset> getAssets() {
        HashMap hashMap = new HashMap(this.zzdl);
        for (int i = 0; i < this.zzdl; i++) {
            zzdb zzdb = new zzdb(this.mDataHolder, this.mDataRow + i);
            if (zzdb.getDataItemKey() != null) {
                hashMap.put(zzdb.getDataItemKey(), zzdb);
            }
        }
        return hashMap;
    }

    public final byte[] getData() {
        return getByteArray("data");
    }

    public final Uri getUri() {
        return Uri.parse(getString("path"));
    }

    public final DataItem setData(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] data = getData();
        Map<String, DataItemAsset> assets = getAssets();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        String valueOf = String.valueOf(getUri());
        StringBuilder sb4 = new StringBuilder(valueOf.length() + 4);
        sb4.append("uri=");
        sb4.append(valueOf);
        sb.append(sb4.toString());
        String valueOf2 = String.valueOf(data == null ? "null" : Integer.valueOf(data.length));
        StringBuilder sb5 = new StringBuilder(valueOf2.length() + 9);
        sb5.append(", dataSz=");
        sb5.append(valueOf2);
        sb.append(sb5.toString());
        int size = assets.size();
        StringBuilder sb6 = new StringBuilder(23);
        sb6.append(", numAssets=");
        sb6.append(size);
        sb.append(sb6.toString());
        if (isLoggable && !assets.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry next : assets.entrySet()) {
                String str2 = (String) next.getKey();
                String id = ((DataItemAsset) next.getValue()).getId();
                StringBuilder sb7 = new StringBuilder(str.length() + 2 + String.valueOf(str2).length() + String.valueOf(id).length());
                sb7.append(str);
                sb7.append(str2);
                sb7.append(": ");
                sb7.append(id);
                sb.append(sb7.toString());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }
}
