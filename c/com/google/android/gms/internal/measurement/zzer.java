package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Iterator;

public final class zzer extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzer> CREATOR = new zzet();
    /* access modifiers changed from: private */
    public final Bundle zzafy;

    public zzer(Bundle bundle) {
        this.zzafy = bundle;
    }

    public final Object get(String str) {
        return this.zzafy.get(str);
    }

    public final Long getLong(String str) {
        return Long.valueOf(this.zzafy.getLong(str));
    }

    public final String getString(String str) {
        return this.zzafy.getString(str);
    }

    public final Iterator<String> iterator() {
        return new zzes(this);
    }

    public final int size() {
        return this.zzafy.size();
    }

    public final String toString() {
        return this.zzafy.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzif(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Double zzbh(String str) {
        return Double.valueOf(this.zzafy.getDouble(str));
    }

    public final Bundle zzif() {
        return new Bundle(this.zzafy);
    }
}
