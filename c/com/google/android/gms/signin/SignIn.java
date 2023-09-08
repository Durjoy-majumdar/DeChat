package com.google.android.gms.signin;

import android.os.Bundle;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.SignInClientImpl;

public final class SignIn {
    public static final Api<SignInOptions> API;
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> CLIENT_BUILDER;
    public static final Api.ClientKey<SignInClientImpl> CLIENT_KEY;
    public static final Api<SignInOptionsInternal> INTERNAL_API;
    public static final Api.ClientKey<SignInClientImpl> INTERNAL_CLIENT_KEY;
    public static final Scope SCOPE_EMAIL = new Scope(Scopes.EMAIL);
    public static final Scope SCOPE_PROFILE = new Scope(Scopes.PROFILE);
    private static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptionsInternal> zzacz;

    public static class SignInOptionsInternal implements Api.ApiOptions.HasOptions {
        private final Bundle zzada;

        private SignInOptionsInternal(Bundle bundle) {
            this.zzada = bundle == null ? new Bundle() : bundle;
        }

        public static SignInOptionsInternal create(Bundle bundle) {
            return new SignInOptionsInternal(bundle);
        }

        public Bundle getSignInOptionsBundle() {
            return this.zzada;
        }
    }

    static {
        Api.ClientKey<SignInClientImpl> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        Api.ClientKey<SignInClientImpl> clientKey2 = new Api.ClientKey<>();
        INTERNAL_CLIENT_KEY = clientKey2;
        zza zza = new zza();
        CLIENT_BUILDER = zza;
        zzb zzb = new zzb();
        zzacz = zzb;
        API = new Api<>("SignIn.API", zza, clientKey);
        INTERNAL_API = new Api<>("SignIn.INTERNAL_API", zzb, clientKey2);
    }

    private SignIn() {
    }
}
