package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.wearable.zze;
import com.google.android.gms.internal.wearable.zzf;
import com.google.android.gms.internal.wearable.zzg;
import com.google.android.gms.internal.wearable.zzs;
import java.util.ArrayList;

public class DataMapItem {
    private final Uri uri;
    private final DataMap zzr;

    private DataMapItem(DataItem dataItem) {
        this.uri = dataItem.getUri();
        this.zzr = zza((DataItem) dataItem.freeze());
    }

    public static DataMapItem fromDataItem(DataItem dataItem) {
        Asserts.checkNotNull(dataItem, "dataItem must not be null");
        return new DataMapItem(dataItem);
    }

    private static DataMap zza(DataItem dataItem) {
        if (dataItem.getData() == null && dataItem.getAssets().size() > 0) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        } else if (dataItem.getData() == null) {
            return new DataMap();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                int size = dataItem.getAssets().size();
                int i = 0;
                while (i < size) {
                    DataItemAsset dataItemAsset = dataItem.getAssets().get(Integer.toString(i));
                    if (dataItemAsset != null) {
                        arrayList.add(Asset.createFromRef(dataItemAsset.getId()));
                        i++;
                    } else {
                        String valueOf = String.valueOf(dataItem);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 64);
                        sb.append("Cannot find DataItemAsset referenced in data at ");
                        sb.append(i);
                        sb.append(" for ");
                        sb.append(valueOf);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                return zze.zza(new zzf(zzg.zza(dataItem.getData()), arrayList));
            } catch (zzs | NullPointerException e) {
                new StringBuilder(String.valueOf(dataItem.getUri()).length() + 50 + String.valueOf(Base64.encodeToString(dataItem.getData(), 0)).length());
                String valueOf2 = String.valueOf(dataItem.getUri());
                StringBuilder sb4 = new StringBuilder(valueOf2.length() + 44);
                sb4.append("Unable to parse datamap from dataItem.  uri=");
                sb4.append(valueOf2);
                throw new IllegalStateException(sb4.toString(), e);
            }
        }
    }

    public DataMap getDataMap() {
        return this.zzr;
    }

    public Uri getUri() {
        return this.uri;
    }
}
