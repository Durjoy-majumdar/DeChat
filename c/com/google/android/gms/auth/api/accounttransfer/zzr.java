package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbs;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p1042u.C111055b;

public class zzr extends zzbs {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    private static final C111055b<String, FastJsonResponse.Field<?, ?>> zzbp;
    private List<String> zzbq;
    private List<String> zzbr;
    private List<String> zzbs;
    private List<String> zzbt;
    private List<String> zzbu;
    private final int zzy;

    static {
        C111055b<String, FastJsonResponse.Field<?, ?>> bVar = new C111055b<>();
        zzbp = bVar;
        bVar.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        bVar.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        bVar.put("success", FastJsonResponse.Field.forStrings("success", 4));
        bVar.put(StateEvent.ProcessResult.FAILED, FastJsonResponse.Field.forStrings(StateEvent.ProcessResult.FAILED, 5));
        bVar.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzr() {
        this.zzy = 1;
    }

    public zzr(int i, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.zzy = i;
        this.zzbq = list;
        this.zzbr = list2;
        this.zzbs = list3;
        this.zzbt = list4;
        this.zzbu = list5;
    }

    public Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        return zzbp;
    }

    public Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zzy);
            case 2:
                return this.zzbq;
            case 3:
                return this.zzbr;
            case 4:
                return this.zzbs;
            case 5:
                return this.zzbt;
            case 6:
                return this.zzbu;
            default:
                int safeParcelableFieldId = field.getSafeParcelableFieldId();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(safeParcelableFieldId);
                throw new IllegalStateException(sb.toString());
        }
    }

    public boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    public void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbq = arrayList;
        } else if (safeParcelableFieldId == 3) {
            this.zzbr = arrayList;
        } else if (safeParcelableFieldId == 4) {
            this.zzbs = arrayList;
        } else if (safeParcelableFieldId == 5) {
            this.zzbt = arrayList;
        } else if (safeParcelableFieldId == 6) {
            this.zzbu = arrayList;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(safeParcelableFieldId)}));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzbq, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzbr, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zzbs, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzbt, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzbu, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
