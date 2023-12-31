package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new GoogleSignInOptionsExtensionCreator();
    private Bundle mBundle;
    private final int versionCode;
    private int zzac;

    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.versionCode = i;
        this.zzac = i2;
        this.mBundle = bundle;
    }

    public GoogleSignInOptionsExtensionParcelable(GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        this(1, googleSignInOptionsExtension.getExtensionType(), googleSignInOptionsExtension.toBundle());
    }

    public Bundle getBundle() {
        return this.mBundle;
    }

    public int getType() {
        return this.zzac;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeInt(parcel, 2, getType());
        SafeParcelWriter.writeBundle(parcel, 3, getBundle(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
