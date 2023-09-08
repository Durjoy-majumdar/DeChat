package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzdc implements DataItem {
    private byte[] data;
    private Uri uri;
    private Map<String, DataItemAsset> zzdo;

    public zzdc(DataItem dataItem) {
        this.uri = dataItem.getUri();
        this.data = dataItem.getData();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : dataItem.getAssets().entrySet()) {
            if (next.getKey() != null) {
                hashMap.put((String) next.getKey(), (DataItemAsset) ((DataItemAsset) next.getValue()).freeze());
            }
        }
        this.zzdo = Collections.unmodifiableMap(hashMap);
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

    public final DataItem setData(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        String valueOf = String.valueOf(this.uri);
        StringBuilder sb4 = new StringBuilder(valueOf.length() + 4);
        sb4.append("uri=");
        sb4.append(valueOf);
        sb.append(sb4.toString());
        byte[] bArr = this.data;
        String valueOf2 = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb5 = new StringBuilder(valueOf2.length() + 9);
        sb5.append(", dataSz=");
        sb5.append(valueOf2);
        sb.append(sb5.toString());
        int size = this.zzdo.size();
        StringBuilder sb6 = new StringBuilder(23);
        sb6.append(", numAssets=");
        sb6.append(size);
        sb.append(sb6.toString());
        if (isLoggable && !this.zzdo.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry next : this.zzdo.entrySet()) {
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
