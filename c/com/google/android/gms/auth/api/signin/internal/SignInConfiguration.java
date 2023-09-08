package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zzy();
    private final String zzfe;
    private GoogleSignInOptions zzff;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.zzfe = Preconditions.checkNotEmpty(str);
        this.zzff = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (this.zzfe.equals(signInConfiguration.zzfe)) {
                GoogleSignInOptions googleSignInOptions = this.zzff;
                if (googleSignInOptions == null) {
                    if (signInConfiguration.zzff == null) {
                        return true;
                    }
                } else if (googleSignInOptions.equals(signInConfiguration.zzff)) {
                    return true;
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public final int hashCode() {
        return new HashAccumulator().addObject(this.zzfe).addObject(this.zzff).hash();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzfe, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzff, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final GoogleSignInOptions zzt() {
        return this.zzff;
    }
}
