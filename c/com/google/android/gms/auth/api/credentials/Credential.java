package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new zzd();
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    /* access modifiers changed from: private */
    public final String mName;
    /* access modifiers changed from: private */
    public final String zzbx;
    /* access modifiers changed from: private */
    public final String zzci;
    /* access modifiers changed from: private */
    public final Uri zzcj;
    /* access modifiers changed from: private */
    public final List<IdToken> zzck;
    /* access modifiers changed from: private */
    public final String zzcl;
    /* access modifiers changed from: private */
    public final String zzcm;
    /* access modifiers changed from: private */
    public final String zzcn;
    /* access modifiers changed from: private */
    public final String zzco;
    /* access modifiers changed from: private */
    public final String zzcp;

    public static class Builder {
        private String mName;
        private String zzbx;
        private final String zzci;
        private Uri zzcj;
        private List<IdToken> zzck;
        private String zzcl;
        private String zzcm;
        private String zzcn;
        private String zzco;
        private String zzcp;

        public Builder(Credential credential) {
            this.zzci = credential.zzci;
            this.mName = credential.mName;
            this.zzcj = credential.zzcj;
            this.zzck = credential.zzck;
            this.zzcl = credential.zzcl;
            this.zzbx = credential.zzbx;
            this.zzcm = credential.zzcm;
            this.zzcn = credential.zzcn;
            this.zzco = credential.zzco;
            this.zzcp = credential.zzcp;
        }

        public Builder(String str) {
            this.zzci = str;
        }

        public Credential build() {
            return new Credential(this.zzci, this.mName, this.zzcj, this.zzck, this.zzcl, this.zzbx, this.zzcm, this.zzcn, this.zzco, this.zzcp);
        }

        public Builder setAccountType(String str) {
            this.zzbx = str;
            return this;
        }

        public Builder setName(String str) {
            this.mName = str;
            return this;
        }

        public Builder setPassword(String str) {
            this.zzcl = str;
            return this;
        }

        public Builder setProfilePictureUri(Uri uri) {
            this.zzcj = uri;
            return this;
        }
    }

    public Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6, String str7, String str8) {
        String trim = ((String) Preconditions.checkNotNull(str, "credential identifier cannot be null")).trim();
        Preconditions.checkNotEmpty(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || C113600ck.f339986i.equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.mName = str2;
                this.zzcj = uri;
                this.zzck = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
                this.zzci = trim;
                this.zzcl = str3;
                this.zzbx = str4;
                this.zzcm = str5;
                this.zzcn = str6;
                this.zzco = str7;
                this.zzcp = str8;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.zzci, credential.zzci) && TextUtils.equals(this.mName, credential.mName) && Objects.equal(this.zzcj, credential.zzcj) && TextUtils.equals(this.zzcl, credential.zzcl) && TextUtils.equals(this.zzbx, credential.zzbx) && TextUtils.equals(this.zzcm, credential.zzcm);
    }

    public String getAccountType() {
        return this.zzbx;
    }

    public String getFamilyName() {
        return this.zzcp;
    }

    public String getGeneratedPassword() {
        return this.zzcm;
    }

    public String getGivenName() {
        return this.zzco;
    }

    public String getId() {
        return this.zzci;
    }

    public List<IdToken> getIdTokens() {
        return this.zzck;
    }

    public String getName() {
        return this.mName;
    }

    public String getPassword() {
        return this.zzcl;
    }

    public Uri getProfilePictureUri() {
        return this.zzcj;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzci, this.mName, this.zzcj, this.zzcl, this.zzbx, this.zzcm);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getProfilePictureUri(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 4, getIdTokens(), false);
        SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 6, getAccountType(), false);
        SafeParcelWriter.writeString(parcel, 7, getGeneratedPassword(), false);
        SafeParcelWriter.writeString(parcel, 8, this.zzcn, false);
        SafeParcelWriter.writeString(parcel, 9, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 10, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
