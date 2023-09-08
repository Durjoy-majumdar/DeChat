package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.auth.api.signin.internal.zzh;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzao;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzbn;

public final class Auth {
    public static final Api<AuthCredentialsOptions> CREDENTIALS_API;
    public static final CredentialsApi CredentialsApi = new zzao();
    public static final Api<GoogleSignInOptions> GOOGLE_SIGN_IN_API;
    public static final GoogleSignInApi GoogleSignInApi = new zzg();
    public static final Api<zzh> PROXY_API = zzf.API;
    public static final ProxyApi ProxyApi = new zzbn();
    public static final Api.ClientKey<zzax> zzaj;
    public static final Api.ClientKey<zzh> zzak;
    private static final Api.AbstractClientBuilder<zzax, AuthCredentialsOptions> zzal;
    private static final Api.AbstractClientBuilder<zzh, GoogleSignInOptions> zzam;

    @Deprecated
    public static class AuthCredentialsOptions implements Api.ApiOptions.Optional {
        private static final AuthCredentialsOptions zzan = new Builder().zzh();
        private final String zzao = null;
        private final PasswordSpecification zzap;
        private final boolean zzaq;

        @Deprecated
        public static class Builder {
            public PasswordSpecification zzap = PasswordSpecification.zzdg;
            public Boolean zzar = Boolean.FALSE;

            public Builder forceEnableSaveDialog() {
                this.zzar = Boolean.TRUE;
                return this;
            }

            public AuthCredentialsOptions zzh() {
                return new AuthCredentialsOptions(this);
            }
        }

        public AuthCredentialsOptions(Builder builder) {
            this.zzap = builder.zzap;
            this.zzaq = builder.zzar.booleanValue();
        }

        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", (String) null);
            bundle.putParcelable("password_specification", this.zzap);
            bundle.putBoolean("force_save_dialog", this.zzaq);
            return bundle;
        }

        public final PasswordSpecification zzg() {
            return this.zzap;
        }
    }

    static {
        Api.ClientKey<zzax> clientKey = new Api.ClientKey<>();
        zzaj = clientKey;
        Api.ClientKey<zzh> clientKey2 = new Api.ClientKey<>();
        zzak = clientKey2;
        zzd zzd = new zzd();
        zzal = zzd;
        zze zze = new zze();
        zzam = zze;
        CREDENTIALS_API = new Api<>("Auth.CREDENTIALS_API", zzd, clientKey);
        GOOGLE_SIGN_IN_API = new Api<>("Auth.GOOGLE_SIGN_IN_API", zze, clientKey2);
    }

    private Auth() {
    }
}
