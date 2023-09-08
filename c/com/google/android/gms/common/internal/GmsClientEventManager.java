package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class GmsClientEventManager implements Handler.Callback {
    private final Handler mHandler;
    private final Object mLock = new Object();
    private final GmsClientEventState zztf;
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> zztg = new ArrayList<>();
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> zzth = new ArrayList<>();
    private final ArrayList<GoogleApiClient.OnConnectionFailedListener> zzti = new ArrayList<>();
    private volatile boolean zztj = false;
    private final AtomicInteger zztk = new AtomicInteger(0);
    private boolean zztl = false;

    public interface GmsClientEventState {
        Bundle getConnectionHint();

        boolean isConnected();
    }

    public GmsClientEventManager(Looper looper, GmsClientEventState gmsClientEventState) {
        this.zztf = gmsClientEventState;
        this.mHandler = new Handler(looper, this);
    }

    public final boolean areCallbacksEnabled() {
        return this.zztj;
    }

    public final void disableCallbacks() {
        this.zztj = false;
        this.zztk.incrementAndGet();
    }

    public final void enableCallbacks() {
        this.zztj = true;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.mLock) {
                if (this.zztj && this.zztf.isConnected() && this.zztg.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(this.zztf.getConnectionHint());
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }

    public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean contains;
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.mLock) {
            contains = this.zztg.contains(connectionCallbacks);
        }
        return contains;
    }

    public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean contains;
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.mLock) {
            contains = this.zzti.contains(onConnectionFailedListener);
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConnectionFailure(com.google.android.gms.common.ConnectionResult r8) {
        /*
            r7 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r7.mHandler
            android.os.Looper r1 = r1.getLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            android.os.Handler r0 = r7.mHandler
            r0.removeMessages(r3)
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0056 }
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r3 = r7.zzti     // Catch:{ all -> 0x0056 }
            r1.<init>(r3)     // Catch:{ all -> 0x0056 }
            java.util.concurrent.atomic.AtomicInteger r3 = r7.zztk     // Catch:{ all -> 0x0056 }
            int r3 = r3.get()     // Catch:{ all -> 0x0056 }
            int r4 = r1.size()     // Catch:{ all -> 0x0056 }
        L_0x002f:
            if (r2 >= r4) goto L_0x0054
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x0056 }
            int r2 = r2 + 1
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r5 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r5     // Catch:{ all -> 0x0056 }
            boolean r6 = r7.zztj     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0052
            java.util.concurrent.atomic.AtomicInteger r6 = r7.zztk     // Catch:{ all -> 0x0056 }
            int r6 = r6.get()     // Catch:{ all -> 0x0056 }
            if (r6 == r3) goto L_0x0046
            goto L_0x0052
        L_0x0046:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r6 = r7.zzti     // Catch:{ all -> 0x0056 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x002f
            r5.onConnectionFailed(r8)     // Catch:{ all -> 0x0056 }
            goto L_0x002f
        L_0x0052:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0056:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GmsClientEventManager.onConnectionFailure(com.google.android.gms.common.ConnectionResult):void");
    }

    public final void onConnectionSuccess() {
        synchronized (this.mLock) {
            onConnectionSuccess(this.zztf.getConnectionHint());
        }
    }

    public final void onConnectionSuccess(Bundle bundle) {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() == this.mHandler.getLooper(), "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.mLock) {
            Preconditions.checkState(!this.zztl);
            this.mHandler.removeMessages(1);
            this.zztl = true;
            if (this.zzth.size() != 0) {
                z = false;
            }
            Preconditions.checkState(z);
            ArrayList arrayList = new ArrayList(this.zztg);
            int i = this.zztk.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.zztj || !this.zztf.isConnected() || this.zztk.get() != i) {
                    break;
                } else if (!this.zzth.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            this.zzth.clear();
            this.zztl = false;
        }
    }

    public final void onUnintentionalDisconnection(int i) {
        Preconditions.checkState(Looper.myLooper() == this.mHandler.getLooper(), "onUnintentionalDisconnection must only be called on the Handler thread");
        this.mHandler.removeMessages(1);
        synchronized (this.mLock) {
            this.zztl = true;
            ArrayList arrayList = new ArrayList(this.zztg);
            int i2 = this.zztk.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.zztj || this.zztk.get() != i2) {
                    break;
                } else if (this.zztg.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i);
                }
            }
            this.zzth.clear();
            this.zztl = false;
        }
    }

    public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.mLock) {
            if (this.zztg.contains(connectionCallbacks)) {
                new StringBuilder(String.valueOf(connectionCallbacks).length() + 62);
            } else {
                this.zztg.add(connectionCallbacks);
            }
        }
        if (this.zztf.isConnected()) {
            Handler handler = this.mHandler;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.mLock) {
            if (this.zzti.contains(onConnectionFailedListener)) {
                new StringBuilder(String.valueOf(onConnectionFailedListener).length() + 67);
            } else {
                this.zzti.add(onConnectionFailedListener);
            }
        }
    }

    public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.mLock) {
            if (!this.zztg.remove(connectionCallbacks)) {
                new StringBuilder(String.valueOf(connectionCallbacks).length() + 52);
            } else if (this.zztl) {
                this.zzth.add(connectionCallbacks);
            }
        }
    }

    public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.mLock) {
            if (!this.zzti.remove(onConnectionFailedListener)) {
                new StringBuilder(String.valueOf(onConnectionFailedListener).length() + 57);
            }
        }
    }
}
