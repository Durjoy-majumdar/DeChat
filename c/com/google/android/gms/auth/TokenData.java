package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new zzn();
    private final Long zzaa;
    private final boolean zzab;
    private final boolean zzac;
    private final List<String> zzad;
    private final int zzy;
    private final String zzz;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list) {
        this.zzy = i;
        this.zzz = Preconditions.checkNotEmpty(str);
        this.zzaa = l;
        this.zzab = z;
        this.zzac = z2;
        this.zzad = list;
    }

    public static TokenData zzd(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.zzz, tokenData.zzz) && Objects.equal(this.zzaa, tokenData.zzaa) && this.zzab == tokenData.zzab && this.zzac == tokenData.zzac && Objects.equal(this.zzad, tokenData.zzad);
    }

    public int hashCode() {
        return Objects.hashCode(this.zzz, this.zzaa, Boolean.valueOf(this.zzab), Boolean.valueOf(this.zzac), this.zzad);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        SafeParcelWriter.writeString(parcel, 2, this.zzz, false);
        SafeParcelWriter.writeLongObject(parcel, 3, this.zzaa, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzab);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzac);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzad, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zze() {
        return this.zzz;
    }
}
