package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckServerAuthResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CheckServerAuthResult> CREATOR = new CheckServerAuthResultCreator();
    private final boolean zzadp;
    private final List<Scope> zzadq;
    private final int zzal;

    public CheckServerAuthResult(int i, boolean z, List<Scope> list) {
        this.zzal = i;
        this.zzadp = z;
        this.zzadq = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CheckServerAuthResult(boolean z, Set<Scope> set) {
        this(1, z, set == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(set)));
    }

    public Set<Scope> getAdditionalScopes() {
        return new HashSet(this.zzadq);
    }

    public boolean isNewAuthCodeRequired() {
        return this.zzadp;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzal);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzadp);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzadq, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
