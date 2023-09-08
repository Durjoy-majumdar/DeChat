package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zze();
    @Deprecated
    private String zzeo;
    private GoogleSignInAccount zzep;
    @Deprecated
    private String zzeq;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.zzep = googleSignInAccount;
        this.zzeo = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zzeq = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzep;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, this.zzeo, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzep, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzeq, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
