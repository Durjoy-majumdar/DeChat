package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbs;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p1042u.C90590d;

public class zzw extends zzbs {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> zzbk;
    private final Set<Integer> zzbl;
    private String zzbx;
    private int zzby;
    private byte[] zzbz;
    private PendingIntent zzca;
    private DeviceMetaData zzcb;
    private final int zzy;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        zzbk = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.forString("accountType", 2));
        hashMap.put("status", FastJsonResponse.Field.forInteger("status", 3));
        hashMap.put("transferBytes", FastJsonResponse.Field.forBase64("transferBytes", 4));
    }

    public zzw() {
        this.zzbl = new C90590d(3);
        this.zzy = 1;
    }

    public zzw(Set<Integer> set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.zzbl = set;
        this.zzy = i;
        this.zzbx = str;
        this.zzby = i2;
        this.zzbz = bArr;
        this.zzca = pendingIntent;
        this.zzcb = deviceMetaData;
    }

    public /* synthetic */ Map getFieldMappings() {
        return zzbk;
    }

    public Object getFieldValue(FastJsonResponse.Field field) {
        int i;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            i = this.zzy;
        } else if (safeParcelableFieldId == 2) {
            return this.zzbx;
        } else {
            if (safeParcelableFieldId == 3) {
                i = this.zzby;
            } else if (safeParcelableFieldId == 4) {
                return this.zzbz;
            } else {
                int safeParcelableFieldId2 = field.getSafeParcelableFieldId();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(safeParcelableFieldId2);
                throw new IllegalStateException(sb.toString());
            }
        }
        return Integer.valueOf(i);
    }

    public boolean isFieldSet(FastJsonResponse.Field field) {
        return this.zzbl.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    public void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> field, String str, byte[] bArr) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.zzbz = bArr;
            this.zzbl.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Field with id=");
        sb.append(safeParcelableFieldId);
        sb.append(" is not known to be an byte array.");
        throw new IllegalArgumentException(sb.toString());
    }

    public void setIntegerInternal(FastJsonResponse.Field<?, ?> field, String str, int i) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 3) {
            this.zzby = i;
            this.zzbl.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(safeParcelableFieldId);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    public void setStringInternal(FastJsonResponse.Field<?, ?> field, String str, String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbx = str2;
            this.zzbl.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(safeParcelableFieldId)}));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set<Integer> set = this.zzbl;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeString(parcel, 2, this.zzbx, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.zzby);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeByteArray(parcel, 4, this.zzbz, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.writeParcelable(parcel, 5, this.zzca, i, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.writeParcelable(parcel, 6, this.zzcb, i, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
