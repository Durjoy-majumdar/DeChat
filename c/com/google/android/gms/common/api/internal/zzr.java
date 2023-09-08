package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.SignInOptions;
import com.tencent.xweb.file.XVFSFile;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import p1042u.C111055b;

final class zzr implements zzbp {
    private final Context mContext;
    private final Looper zzcn;
    private final zzav zzfq;
    /* access modifiers changed from: private */
    public final zzbd zzfr;
    /* access modifiers changed from: private */
    public final zzbd zzfs;
    private final Map<Api.AnyClientKey<?>, zzbd> zzft;
    private final Set<SignInConnectionListener> zzfu = Collections.newSetFromMap(new WeakHashMap());
    private final Api.Client zzfv;
    private Bundle zzfw;
    /* access modifiers changed from: private */
    public ConnectionResult zzfx = null;
    /* access modifiers changed from: private */
    public ConnectionResult zzfy = null;
    /* access modifiers changed from: private */
    public boolean zzfz = false;
    /* access modifiers changed from: private */
    public final Lock zzga;
    private int zzgb = 0;

    private zzr(Context context, zzav zzav, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> abstractClientBuilder, Api.Client client, ArrayList<zzp> arrayList, ArrayList<zzp> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.mContext = context;
        this.zzfq = zzav;
        this.zzga = lock;
        this.zzcn = looper;
        this.zzfv = client;
        Context context2 = context;
        zzav zzav2 = zzav;
        Lock lock2 = lock;
        Looper looper2 = looper;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        zzbd zzbd = r3;
        zzbd zzbd2 = new zzbd(context2, zzav2, lock2, looper2, googleApiAvailabilityLight2, map2, (ClientSettings) null, map4, (Api.AbstractClientBuilder<? extends SignInClient, SignInOptions>) null, arrayList2, new zzt(this, (zzs) null));
        this.zzfr = zzbd;
        this.zzfs = new zzbd(context2, zzav2, lock2, looper2, googleApiAvailabilityLight2, map, clientSettings, map3, abstractClientBuilder, arrayList, new zzu(this, (zzs) null));
        C111055b bVar = new C111055b();
        for (Api.AnyClientKey<?> put : map2.keySet()) {
            bVar.put(put, this.zzfr);
        }
        for (Api.AnyClientKey<?> put2 : map.keySet()) {
            bVar.put(put2, this.zzfs);
        }
        this.zzft = Collections.unmodifiableMap(bVar);
    }

    public static zzr zza(Context context, zzav zzav, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> abstractClientBuilder, ArrayList<zzp> arrayList) {
        Map<Api<?>, Boolean> map3 = map2;
        C111055b bVar = new C111055b();
        C111055b bVar2 = new C111055b();
        Api.Client client = null;
        for (Map.Entry next : map.entrySet()) {
            Api.Client client2 = (Api.Client) next.getValue();
            if (client2.providesSignIn()) {
                client = client2;
            }
            boolean requiresSignIn = client2.requiresSignIn();
            Api.AnyClientKey anyClientKey = (Api.AnyClientKey) next.getKey();
            if (requiresSignIn) {
                bVar.put(anyClientKey, client2);
            } else {
                bVar2.put(anyClientKey, client2);
            }
        }
        Preconditions.checkState(!bVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C111055b bVar3 = new C111055b();
        C111055b bVar4 = new C111055b();
        for (Api next2 : map2.keySet()) {
            Api.AnyClientKey<?> clientKey = next2.getClientKey();
            if (bVar.containsKey(clientKey)) {
                bVar3.put(next2, map3.get(next2));
            } else if (bVar2.containsKey(clientKey)) {
                bVar4.put(next2, map3.get(next2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            zzp zzp = arrayList.get(i);
            i++;
            zzp zzp2 = zzp;
            if (bVar3.containsKey(zzp2.mApi)) {
                arrayList2.add(zzp2);
            } else if (bVar4.containsKey(zzp2.mApi)) {
                arrayList3.add(zzp2);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new zzr(context, zzav, lock, looper, googleApiAvailabilityLight, bVar, bVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, bVar3, bVar4);
    }

    /* access modifiers changed from: private */
    public final void zza(int i, boolean z) {
        this.zzfq.zzb(i, z);
        this.zzfy = null;
        this.zzfx = null;
    }

    /* access modifiers changed from: private */
    public final void zza(Bundle bundle) {
        Bundle bundle2 = this.zzfw;
        if (bundle2 == null) {
            this.zzfw = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    private final void zza(ConnectionResult connectionResult) {
        int i = this.zzgb;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.zzgb = 0;
            }
            this.zzfq.zzc(connectionResult);
        }
        zzab();
        this.zzgb = 0;
    }

    private final boolean zza(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        Api.AnyClientKey<? extends Api.AnyClient> clientKey = apiMethodImpl.getClientKey();
        Preconditions.checkArgument(this.zzft.containsKey(clientKey), "GoogleApiClient is not configured to use the API required for this call.");
        return this.zzft.get(clientKey).equals(this.zzfs);
    }

    /* access modifiers changed from: private */
    public final void zzaa() {
        ConnectionResult connectionResult;
        if (zzb(this.zzfx)) {
            if (zzb(this.zzfy) || zzac()) {
                int i = this.zzgb;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.zzgb = 0;
                        return;
                    }
                    this.zzfq.zzb(this.zzfw);
                }
                zzab();
                this.zzgb = 0;
                return;
            }
            ConnectionResult connectionResult2 = this.zzfy;
            if (connectionResult2 == null) {
                return;
            }
            if (this.zzgb == 1) {
                zzab();
                return;
            }
            zza(connectionResult2);
            this.zzfr.disconnect();
        } else if (this.zzfx == null || !zzb(this.zzfy)) {
            ConnectionResult connectionResult3 = this.zzfx;
            if (connectionResult3 != null && (connectionResult = this.zzfy) != null) {
                if (this.zzfs.zzje < this.zzfr.zzje) {
                    connectionResult3 = connectionResult;
                }
                zza(connectionResult3);
            }
        } else {
            this.zzfs.disconnect();
            zza(this.zzfx);
        }
    }

    private final void zzab() {
        for (SignInConnectionListener onComplete : this.zzfu) {
            onComplete.onComplete();
        }
        this.zzfu.clear();
    }

    private final boolean zzac() {
        ConnectionResult connectionResult = this.zzfy;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final PendingIntent zzad() {
        if (this.zzfv == null) {
            return null;
        }
        return PendingIntent.getActivity(this.mContext, System.identityHashCode(this.zzfq), this.zzfv.getSignInIntent(), 134217728);
    }

    private static boolean zzb(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    public final ConnectionResult blockingConnect() {
        throw new UnsupportedOperationException();
    }

    public final ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void connect() {
        this.zzgb = 2;
        this.zzfz = false;
        this.zzfy = null;
        this.zzfx = null;
        this.zzfr.connect();
        this.zzfs.connect();
    }

    public final void disconnect() {
        this.zzfy = null;
        this.zzfx = null;
        this.zzgb = 0;
        this.zzfr.disconnect();
        this.zzfs.disconnect();
        zzab();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(XVFSFile.PATH_SEPARATOR);
        this.zzfs.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(XVFSFile.PATH_SEPARATOR);
        this.zzfr.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        if (!zza((BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>) t)) {
            return this.zzfr.enqueue(t);
        }
        if (!zzac()) {
            return this.zzfs.enqueue(t);
        }
        t.setFailedResult(new Status(4, (String) null, zzad()));
        return t;
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t) {
        if (!zza((BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>) t)) {
            return this.zzfr.execute(t);
        }
        if (!zzac()) {
            return this.zzfs.execute(t);
        }
        t.setFailedResult(new Status(4, (String) null, zzad()));
        return t;
    }

    public final ConnectionResult getConnectionResult(Api<?> api) {
        return this.zzft.get(api.getClientKey()).equals(this.zzfs) ? zzac() ? new ConnectionResult(4, zzad()) : this.zzfs.getConnectionResult(api) : this.zzfr.getConnectionResult(api);
    }

    public final boolean isConnected() {
        this.zzga.lock();
        try {
            boolean z = true;
            if (!this.zzfr.isConnected() || (!this.zzfs.isConnected() && !zzac() && this.zzgb != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.zzga.unlock();
        }
    }

    public final boolean isConnecting() {
        this.zzga.lock();
        try {
            return this.zzgb == 2;
        } finally {
            this.zzga.unlock();
        }
    }

    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        this.zzga.lock();
        try {
            if ((isConnecting() || isConnected()) && !this.zzfs.isConnected()) {
                this.zzfu.add(signInConnectionListener);
                if (this.zzgb == 0) {
                    this.zzgb = 1;
                }
                this.zzfy = null;
                this.zzfs.connect();
                return true;
            }
            this.zzga.unlock();
            return false;
        } finally {
            this.zzga.unlock();
        }
    }

    public final void maybeSignOut() {
        this.zzga.lock();
        try {
            boolean isConnecting = isConnecting();
            this.zzfs.disconnect();
            this.zzfy = new ConnectionResult(4);
            if (isConnecting) {
                new Handler(this.zzcn).post(new zzs(this));
            } else {
                zzab();
            }
        } finally {
            this.zzga.unlock();
        }
    }

    public final void zzz() {
        this.zzfr.zzz();
        this.zzfs.zzz();
    }
}
