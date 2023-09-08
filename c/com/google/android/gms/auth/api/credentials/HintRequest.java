package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new zzk();
    private final String[] zzcv;
    private final boolean zzcy;
    private final String zzcz;
    private final String zzda;
    private final CredentialPickerConfig zzdc;
    private final boolean zzdd;
    private final boolean zzde;
    private final int zzy;

    public static final class Builder {
        /* access modifiers changed from: private */
        public String[] zzcv;
        /* access modifiers changed from: private */
        public boolean zzcy = false;
        /* access modifiers changed from: private */
        public String zzcz;
        /* access modifiers changed from: private */
        public String zzda;
        /* access modifiers changed from: private */
        public CredentialPickerConfig zzdc = new CredentialPickerConfig.Builder().build();
        /* access modifiers changed from: private */
        public boolean zzdd;
        /* access modifiers changed from: private */
        public boolean zzde;

        public final HintRequest build() {
            if (this.zzcv == null) {
                this.zzcv = new String[0];
            }
            if (this.zzdd || this.zzde || this.zzcv.length != 0) {
                return new HintRequest(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        public final Builder setAccountTypes(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.zzcv = strArr;
            return this;
        }

        public final Builder setEmailAddressIdentifierSupported(boolean z) {
            this.zzdd = z;
            return this;
        }

        public final Builder setHintPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zzdc = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
            return this;
        }

        public final Builder setIdTokenNonce(String str) {
            this.zzda = str;
            return this;
        }

        public final Builder setIdTokenRequested(boolean z) {
            this.zzcy = z;
            return this;
        }

        public final Builder setPhoneNumberIdentifierSupported(boolean z) {
            this.zzde = z;
            return this;
        }

        public final Builder setServerClientId(String str) {
            this.zzcz = str;
            return this;
        }
    }

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.zzy = i;
        this.zzdc = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
        this.zzdd = z;
        this.zzde = z2;
        this.zzcv = (String[]) Preconditions.checkNotNull(strArr);
        if (i < 2) {
            this.zzcy = true;
            this.zzcz = null;
            this.zzda = null;
            return;
        }
        this.zzcy = z3;
        this.zzcz = str;
        this.zzda = str2;
    }

    private HintRequest(Builder builder) {
        this(2, builder.zzdc, builder.zzdd, builder.zzde, builder.zzcv, builder.zzcy, builder.zzcz, builder.zzda);
    }

    public final String[] getAccountTypes() {
        return this.zzcv;
    }

    public final CredentialPickerConfig getHintPickerConfig() {
        return this.zzdc;
    }

    public final String getIdTokenNonce() {
        return this.zzda;
    }

    public final String getServerClientId() {
        return this.zzcz;
    }

    public final boolean isEmailAddressIdentifierSupported() {
        return this.zzdd;
    }

    public final boolean isIdTokenRequested() {
        return this.zzcy;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getHintPickerConfig(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, isEmailAddressIdentifierSupported());
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzde);
        SafeParcelWriter.writeStringArray(parcel, 4, getAccountTypes(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzy);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
