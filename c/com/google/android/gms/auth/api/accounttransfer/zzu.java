package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbs;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class zzu extends zzbs {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> zzbk;
    private String mPackageName;
    private final Set<Integer> zzbl;
    private zzw zzbv;
    private String zzbw;
    private final int zzy;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        zzbk = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.forConcreteType("authenticatorInfo", 2, zzw.class));
        hashMap.put("signature", FastJsonResponse.Field.forString("signature", 3));
        hashMap.put("package", FastJsonResponse.Field.forString("package", 4));
    }

    public zzu() {
        this.zzbl = new HashSet(3);
        this.zzy = 1;
    }

    public zzu(Set<Integer> set, int i, zzw zzw, String str, String str2) {
        this.zzbl = set;
        this.zzy = i;
        this.zzbv = zzw;
        this.zzbw = str;
        this.mPackageName = str2;
    }

    public <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> field, String str, T t) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbv = (zzw) t;
            this.zzbl.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(safeParcelableFieldId), t.getClass().getCanonicalName()}));
    }

    public /* synthetic */ Map getFieldMappings() {
        return zzbk;
    }

    public Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return Integer.valueOf(this.zzy);
        }
        if (safeParcelableFieldId == 2) {
            return this.zzbv;
        }
        if (safeParcelableFieldId == 3) {
            return this.zzbw;
        }
        if (safeParcelableFieldId == 4) {
            return this.mPackageName;
        }
        int safeParcelableFieldId2 = field.getSafeParcelableFieldId();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(safeParcelableFieldId2);
        throw new IllegalStateException(sb.toString());
    }

    public boolean isFieldSet(FastJsonResponse.Field field) {
        return this.zzbl.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    public void setStringInternal(FastJsonResponse.Field<?, ?> field, String str, String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 3) {
            this.zzbw = str2;
        } else if (safeParcelableFieldId == 4) {
            this.mPackageName = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(safeParcelableFieldId)}));
        }
        this.zzbl.add(Integer.valueOf(safeParcelableFieldId));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set<Integer> set = this.zzbl;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeParcelable(parcel, 2, this.zzbv, i, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeString(parcel, 3, this.zzbw, true);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeString(parcel, 4, this.mPackageName, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
