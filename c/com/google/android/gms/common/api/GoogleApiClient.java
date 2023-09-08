package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zzav;
import com.google.android.gms.common.api.internal.zzch;
import com.google.android.gms.common.api.internal.zzi;
import com.google.android.gms.common.api.internal.zzp;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignIn;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p1042u.C111055b;

public abstract class GoogleApiClient {
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    /* access modifiers changed from: private */
    public static final Set<GoogleApiClient> zzcu = Collections.newSetFromMap(new WeakHashMap());

    public static final class Builder {
        private final Context mContext;
        private Looper zzcn;
        private final Set<Scope> zzcv;
        private final Set<Scope> zzcw;
        private int zzcx;
        private View zzcy;
        private String zzcz;
        private String zzda;
        private final Map<Api<?>, ClientSettings.OptionalApiSettings> zzdb;
        private final Map<Api<?>, Api.ApiOptions> zzdc;
        private LifecycleActivity zzdd;
        private int zzde;
        private OnConnectionFailedListener zzdf;
        private GoogleApiAvailability zzdg;
        private Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> zzdh;
        private final ArrayList<ConnectionCallbacks> zzdi;
        private final ArrayList<OnConnectionFailedListener> zzdj;
        private boolean zzdk;
        private Account zzs;

        public Builder(Context context) {
            this.zzcv = new HashSet();
            this.zzcw = new HashSet();
            this.zzdb = new C111055b();
            this.zzdc = new C111055b();
            this.zzde = -1;
            this.zzdg = GoogleApiAvailability.getInstance();
            this.zzdh = SignIn.CLIENT_BUILDER;
            this.zzdi = new ArrayList<>();
            this.zzdj = new ArrayList<>();
            this.zzdk = false;
            this.mContext = context;
            this.zzcn = context.getMainLooper();
            this.zzcz = context.getPackageName();
            this.zzda = context.getClass().getName();
        }

        public Builder(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zzdi.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zzdj.add(onConnectionFailedListener);
        }

        private final <O extends Api.ApiOptions> void zza(Api<O> api, O o, Scope... scopeArr) {
            HashSet hashSet = new HashSet(api.zzj().getImpliedScopes(o));
            for (Scope add : scopeArr) {
                hashSet.add(add);
            }
            this.zzdb.put(api, new ClientSettings.OptionalApiSettings(hashSet));
        }

        public final Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zzdc.put(api, (Object) null);
            List<Scope> impliedScopes = api.zzj().getImpliedScopes(null);
            this.zzcw.addAll(impliedScopes);
            this.zzcv.addAll(impliedScopes);
            return this;
        }

        public final <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> api, O o) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zzdc.put(api, o);
            List<Scope> impliedScopes = api.zzj().getImpliedScopes(o);
            this.zzcw.addAll(impliedScopes);
            this.zzcv.addAll(impliedScopes);
            return this;
        }

        public final <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(Api<O> api, O o, Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zzdc.put(api, o);
            zza(api, o, scopeArr);
            return this;
        }

        public final Builder addApiIfAvailable(Api<? extends Api.ApiOptions.NotRequiredOptions> api, Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zzdc.put(api, (Object) null);
            zza(api, (Api.ApiOptions) null, scopeArr);
            return this;
        }

        public final Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zzdi.add(connectionCallbacks);
            return this;
        }

        public final Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zzdj.add(onConnectionFailedListener);
            return this;
        }

        public final Builder addScope(Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zzcv.add(scope);
            return this;
        }

        public final Builder addScopeNames(String[] strArr) {
            for (String scope : strArr) {
                this.zzcv.add(new Scope(scope));
            }
            return this;
        }

        public final GoogleApiClient build() {
            Preconditions.checkArgument(!this.zzdc.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings buildClientSettings = buildClientSettings();
            Map<Api<?>, ClientSettings.OptionalApiSettings> optionalApiSettings = buildClientSettings.getOptionalApiSettings();
            C111055b bVar = new C111055b();
            C111055b bVar2 = new C111055b();
            ArrayList arrayList = new ArrayList();
            Api api = null;
            boolean z = false;
            for (Api next : this.zzdc.keySet()) {
                Api.ApiOptions apiOptions = this.zzdc.get(next);
                boolean z2 = optionalApiSettings.get(next) != null;
                bVar.put(next, Boolean.valueOf(z2));
                zzp zzp = new zzp(next, z2);
                arrayList.add(zzp);
                Api.AbstractClientBuilder zzk = next.zzk();
                Api api2 = next;
                Api.Client buildClient = zzk.buildClient(this.mContext, this.zzcn, buildClientSettings, apiOptions, zzp, zzp);
                bVar2.put(api2.getClientKey(), buildClient);
                if (zzk.getPriority() == 1) {
                    z = apiOptions != null;
                }
                if (buildClient.providesSignIn()) {
                    if (api == null) {
                        api = api2;
                    } else {
                        String name = api2.getName();
                        String name2 = api.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21 + String.valueOf(name2).length());
                        sb.append(name);
                        sb.append(" cannot be used with ");
                        sb.append(name2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (api != null) {
                if (!z) {
                    Preconditions.checkState(this.zzs == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.getName());
                    Preconditions.checkState(this.zzcv.equals(this.zzcw), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.getName());
                } else {
                    String name3 = api.getName();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(name3).length() + 82);
                    sb4.append("With using ");
                    sb4.append(name3);
                    sb4.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb4.toString());
                }
            }
            zzav zzav = new zzav(this.mContext, new ReentrantLock(), this.zzcn, buildClientSettings, this.zzdg, this.zzdh, bVar, this.zzdi, this.zzdj, bVar2, this.zzde, zzav.zza(bVar2.values(), true), arrayList, false);
            synchronized (GoogleApiClient.zzcu) {
                GoogleApiClient.zzcu.add(zzav);
            }
            if (this.zzde >= 0) {
                zzi.zza(this.zzdd).zza(this.zzde, zzav, this.zzdf);
            }
            return zzav;
        }

        public final ClientSettings buildClientSettings() {
            SignInOptions signInOptions = SignInOptions.DEFAULT;
            Map<Api<?>, Api.ApiOptions> map = this.zzdc;
            Api<SignInOptions> api = SignIn.API;
            if (map.containsKey(api)) {
                signInOptions = (SignInOptions) this.zzdc.get(api);
            }
            return new ClientSettings(this.zzs, this.zzcv, this.zzdb, this.zzcx, this.zzcy, this.zzcz, this.zzda, signInOptions);
        }

        public final Builder enableAutoManage(FragmentActivity fragmentActivity, int i, OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity(fragmentActivity);
            Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.zzde = i;
            this.zzdf = onConnectionFailedListener;
            this.zzdd = lifecycleActivity;
            return this;
        }

        public final Builder enableAutoManage(FragmentActivity fragmentActivity, OnConnectionFailedListener onConnectionFailedListener) {
            return enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
        }

        public final Builder setAccountName(String str) {
            this.zzs = str == null ? null : new Account(str, "com.google");
            return this;
        }

        public final Builder setGravityForPopups(int i) {
            this.zzcx = i;
            return this;
        }

        public final Builder setHandler(Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zzcn = handler.getLooper();
            return this;
        }

        public final Builder setViewForPopups(View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.zzcy = view;
            return this;
        }

        public final Builder useDefaultAccount() {
            return setAccountName("<<default account>>");
        }
    }

    public interface ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public static void dumpAll(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Set<GoogleApiClient> set = zzcu;
        synchronized (set) {
            int i = 0;
            String concat = String.valueOf(str).concat("  ");
            for (GoogleApiClient dump : set) {
                printWriter.append(str).append("GoogleApiClient#").println(i);
                dump.dump(concat, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set = zzcu;
        synchronized (set) {
        }
        return set;
    }

    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long j, TimeUnit timeUnit);

    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        throw new UnsupportedOperationException();
    }

    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t) {
        throw new UnsupportedOperationException();
    }

    public <C extends Api.Client> C getClient(Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    public abstract ConnectionResult getConnectionResult(Api<?> api);

    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    public boolean hasApi(Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onConnectionFailedListener);

    public boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public <L> ListenerHolder<L> registerListener(L l) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public void zza(zzch zzch) {
        throw new UnsupportedOperationException();
    }

    public void zzb(zzch zzch) {
        throw new UnsupportedOperationException();
    }
}
