package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new zzh();
    private final boolean zzcu;
    private final String[] zzcv;
    private final CredentialPickerConfig zzcw;
    private final CredentialPickerConfig zzcx;
    private final boolean zzcy;
    private final String zzcz;
    private final String zzda;
    private final boolean zzdb;
    private final int zzy;

    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzcu;
        /* access modifiers changed from: private */
        public String[] zzcv;
        /* access modifiers changed from: private */
        public CredentialPickerConfig zzcw;
        /* access modifiers changed from: private */
        public CredentialPickerConfig zzcx;
        /* access modifiers changed from: private */
        public boolean zzcy = false;
        /* access modifiers changed from: private */
        public String zzcz = null;
        /* access modifiers changed from: private */
        public String zzda;
        private boolean zzdb = false;

        public final CredentialRequest build() {
            if (this.zzcv == null) {
                this.zzcv = new String[0];
            }
            if (this.zzcu || this.zzcv.length != 0) {
                return new CredentialRequest(this);
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

        public final Builder setCredentialHintPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zzcx = credentialPickerConfig;
            return this;
        }

        public final Builder setCredentialPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zzcw = credentialPickerConfig;
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

        public final Builder setPasswordLoginSupported(boolean z) {
            this.zzcu = z;
            return this;
        }

        public final Builder setServerClientId(String str) {
            this.zzcz = str;
            return this;
        }

        @Deprecated
        public final Builder setSupportsPasswordLogin(boolean z) {
            return setPasswordLoginSupported(z);
        }
    }

    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.zzy = i;
        this.zzcu = z;
        this.zzcv = (String[]) Preconditions.checkNotNull(strArr);
        this.zzcw = credentialPickerConfig == null ? new CredentialPickerConfig.Builder().build() : credentialPickerConfig;
        this.zzcx = credentialPickerConfig2 == null ? new CredentialPickerConfig.Builder().build() : credentialPickerConfig2;
        if (i < 3) {
            this.zzcy = true;
            this.zzcz = null;
            this.zzda = null;
        } else {
            this.zzcy = z2;
            this.zzcz = str;
            this.zzda = str2;
        }
        this.zzdb = z3;
    }

    private CredentialRequest(Builder builder) {
        this(4, builder.zzcu, builder.zzcv, builder.zzcw, builder.zzcx, builder.zzcy, builder.zzcz, builder.zzda, false);
    }

    public final String[] getAccountTypes() {
        return this.zzcv;
    }

    public final Set<String> getAccountTypesSet() {
        return new HashSet(Arrays.asList(this.zzcv));
    }

    public final CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zzcx;
    }

    public final CredentialPickerConfig getCredentialPickerConfig() {
        return this.zzcw;
    }

    public final String getIdTokenNonce() {
        return this.zzda;
    }

    public final String getServerClientId() {
        return this.zzcz;
    }

    @Deprecated
    public final boolean getSupportsPasswordLogin() {
        return isPasswordLoginSupported();
    }

    public final boolean isIdTokenRequested() {
        return this.zzcy;
    }

    public final boolean isPasswordLoginSupported() {
        return this.zzcu;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, isPasswordLoginSupported());
        SafeParcelWriter.writeStringArray(parcel, 2, getAccountTypes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCredentialPickerConfig(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getCredentialHintPickerConfig(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzy);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
