package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzo extends zzbs {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> zzbk;
    private final Set<Integer> zzbl;
    private ArrayList<zzu> zzbm;
    private int zzbn;
    private zzr zzbo;
    private final int zzy;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        zzbk = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, zzu.class));
        hashMap.put("progress", FastJsonResponse.Field.forConcreteType("progress", 4, zzr.class));
    }

    public zzo() {
        this.zzbl = new HashSet(1);
        this.zzy = 1;
    }

    public zzo(Set<Integer> set, int i, ArrayList<zzu> arrayList, int i2, zzr zzr) {
        this.zzbl = set;
        this.zzy = i;
        this.zzbm = arrayList;
        this.zzbn = i2;
        this.zzbo = zzr;
    }

    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<T> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbm = arrayList;
            this.zzbl.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[]{Integer.valueOf(safeParcelableFieldId), arrayList.getClass().getCanonicalName()}));
    }

    public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> field, String str, T t) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.zzbo = (zzr) t;
            this.zzbl.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(safeParcelableFieldId), t.getClass().getCanonicalName()}));
    }

    public final /* synthetic */ Map getFieldMappings() {
        return zzbk;
    }

    public final Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return Integer.valueOf(this.zzy);
        }
        if (safeParcelableFieldId == 2) {
            return this.zzbm;
        }
        if (safeParcelableFieldId == 4) {
            return this.zzbo;
        }
        int safeParcelableFieldId2 = field.getSafeParcelableFieldId();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(safeParcelableFieldId2);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.zzbl.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set<Integer> set = this.zzbl;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeTypedList(parcel, 2, this.zzbm, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.zzbn);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeParcelable(parcel, 4, this.zzbo, i, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
