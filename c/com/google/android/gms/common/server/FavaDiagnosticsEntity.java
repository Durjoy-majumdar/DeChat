package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new FavaDiagnosticsEntityCreator();
    public static final String EXTRA_NAMESPACE = "namespace";
    public static final String EXTRA_TYPE_NUM = "typeNum";
    public final String namespace;
    public final int typeNum;
    private final int zzal;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.zzal = i;
        this.namespace = str;
        this.typeNum = i2;
    }

    public FavaDiagnosticsEntity(String str, int i) {
        this.zzal = 1;
        this.namespace = str;
        this.typeNum = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzal);
        SafeParcelWriter.writeString(parcel, 2, this.namespace, false);
        SafeParcelWriter.writeInt(parcel, 3, this.typeNum);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
