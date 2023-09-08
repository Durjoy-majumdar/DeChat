package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zzad;
import com.google.android.gms.common.api.internal.zzbo;
import com.google.android.gms.common.api.internal.zzby;
import com.google.android.gms.common.api.internal.zzh;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;

public class GoogleApi<O extends Api.ApiOptions> {
    private final Api<O> mApi;
    private final Context mContext;
    private final int mId;
    private final O zzcl;
    private final zzh<O> zzcm;
    private final Looper zzcn;
    private final GoogleApiClient zzco;
    private final StatusExceptionMapper zzcp;
    public final GoogleApiManager zzcq;

    public static class Settings {
        public static final Settings DEFAULT_SETTINGS = new Builder().build();
        public final StatusExceptionMapper zzcr;
        public final Looper zzcs;

        public static class Builder {
            private Looper zzcn;
            private StatusExceptionMapper zzcp;

            public Settings build() {
                if (this.zzcp == null) {
                    this.zzcp = new ApiExceptionMapper();
                }
                if (this.zzcn == null) {
                    this.zzcn = Looper.getMainLooper();
                }
                return new Settings(this.zzcp, this.zzcn);
            }

            public Builder setLooper(Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zzcn = looper;
                return this;
            }

            public Builder setMapper(StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zzcp = statusExceptionMapper;
                return this;
            }
        }

        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.zzcr = statusExceptionMapper;
            this.zzcs = looper;
        }
    }

    public GoogleApi(Activity activity, Api<O> api, O o, Settings settings) {
        Preconditions.checkNotNull(activity, "Null activity is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = activity.getApplicationContext();
        this.mContext = applicationContext;
        this.mApi = api;
        this.zzcl = o;
        this.zzcn = settings.zzcs;
        zzh<O> zza = zzh.zza(api, o);
        this.zzcm = zza;
        this.zzco = new zzbo(this);
        GoogleApiManager zzb = GoogleApiManager.zzb(applicationContext);
        this.zzcq = zzb;
        this.mId = zzb.zzbg();
        this.zzcp = settings.zzcr;
        zzad.zza(activity, zzb, zza);
        zzb.zza((GoogleApi<?>) this);
    }

    @Deprecated
    public GoogleApi(Activity activity, Api<O> api, O o, StatusExceptionMapper statusExceptionMapper) {
        this(activity, api, o, new Settings.Builder().setMapper(statusExceptionMapper).setLooper(activity.getMainLooper()).build());
    }

    public GoogleApi(Context context, Api<O> api, Looper looper) {
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(looper, "Looper must not be null.");
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mApi = api;
        this.zzcl = null;
        this.zzcn = looper;
        this.zzcm = zzh.zza(api);
        this.zzco = new zzbo(this);
        GoogleApiManager zzb = GoogleApiManager.zzb(applicationContext);
        this.zzcq = zzb;
        this.mId = zzb.zzbg();
        this.zzcp = new ApiExceptionMapper();
    }

    @Deprecated
    public GoogleApi(Context context, Api<O> api, O o, Looper looper, StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o, new Settings.Builder().setLooper(looper).setMapper(statusExceptionMapper).build());
    }

    public GoogleApi(Context context, Api<O> api, O o, Settings settings) {
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mApi = api;
        this.zzcl = o;
        this.zzcn = settings.zzcs;
        this.zzcm = zzh.zza(api, o);
        this.zzco = new zzbo(this);
        GoogleApiManager zzb = GoogleApiManager.zzb(applicationContext);
        this.zzcq = zzb;
        this.mId = zzb.zzbg();
        this.zzcp = settings.zzcr;
        zzb.zza((GoogleApi<?>) this);
    }

    @Deprecated
    public GoogleApi(Context context, Api<O> api, O o, StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o, new Settings.Builder().setMapper(statusExceptionMapper).build());
    }

    private final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zza(int i, T t) {
        t.zzx();
        this.zzcq.zza(this, i, (BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>) t);
        return t;
    }

    private final <TResult, A extends Api.AnyClient> Task<TResult> zza(int i, TaskApiCall<A, TResult> taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzcq.zza(this, i, taskApiCall, taskCompletionSource, this.zzcp);
        return taskCompletionSource.getTask();
    }

    public GoogleApiClient asGoogleApiClient() {
        return this.zzco;
    }

    public ClientSettings.Builder createClientSettingsBuilder() {
        Account account;
        GoogleSignInAccount googleSignInAccount;
        GoogleSignInAccount googleSignInAccount2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o = this.zzcl;
        if (!(o instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o).getGoogleSignInAccount()) == null) {
            O o2 = this.zzcl;
            account = o2 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) o2).getAccount() : null;
        } else {
            account = googleSignInAccount2.getAccount();
        }
        ClientSettings.Builder account2 = builder.setAccount(account);
        O o3 = this.zzcl;
        return account2.addAllRequiredScopes((!(o3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o3).getGoogleSignInAccount()) == null) ? Collections.emptySet() : googleSignInAccount.getRequestedScopes()).setRealClientClassName(this.mContext.getClass().getName()).setRealClientPackageName(this.mContext.getPackageName());
    }

    public Task<Boolean> disconnectService() {
        return this.zzcq.zzc((GoogleApi<?>) this);
    }

    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(T t) {
        return zza(2, t);
    }

    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zza(2, taskApiCall);
    }

    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(T t) {
        return zza(0, t);
    }

    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(TaskApiCall<A, TResult> taskApiCall) {
        return zza(0, taskApiCall);
    }

    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(T t, U u) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(u);
        Preconditions.checkNotNull(t.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(u.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(t.getListenerKey().equals(u.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zzcq.zza(this, (RegisterListenerMethod<Api.AnyClient, ?>) t, (UnregisterListenerMethod<Api.AnyClient, ?>) u);
    }

    public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey) {
        Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zzcq.zza(this, listenerKey);
    }

    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(T t) {
        return zza(1, t);
    }

    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zza(1, taskApiCall);
    }

    public final Api<O> getApi() {
        return this.mApi;
    }

    public O getApiOptions() {
        return this.zzcl;
    }

    public Context getApplicationContext() {
        return this.mContext;
    }

    public final int getInstanceId() {
        return this.mId;
    }

    public Looper getLooper() {
        return this.zzcn;
    }

    public <L> ListenerHolder<L> registerListener(L l, String str) {
        return ListenerHolders.createListenerHolder(l, this.zzcn, str);
    }

    public Api.Client zza(Looper looper, GoogleApiManager.zza<O> zza) {
        return this.mApi.zzk().buildClient(this.mContext, looper, createClientSettingsBuilder().build(), this.zzcl, zza, zza);
    }

    public zzby zza(Context context, Handler handler) {
        return new zzby(context, handler, createClientSettingsBuilder().build());
    }

    public final zzh<O> zzm() {
        return this.zzcm;
    }
}
