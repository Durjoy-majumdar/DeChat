package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import j20.C117292a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import k20.C9556a;

public abstract class BaseGmsClient<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final int CONNECT_STATE_LOCAL_CONNECTING = 3;
    public static final int CONNECT_STATE_REMOTE_CONNECTING = 2;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String FEATURE_GOOGLE_ME = "service_googleme";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", FEATURE_GOOGLE_ME};
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final Feature[] zzqz = new Feature[0];
    public ConnectionProgressReportCallbacks mConnectionProgressReportCallbacks;
    private final Context mContext;
    public AtomicInteger mDisconnectCount;
    public final Handler mHandler;
    private final Object mLock;
    private final Looper zzcn;
    private final GoogleApiAvailabilityLight zzgk;
    private int zzra;
    private long zzrb;
    private long zzrc;
    private int zzrd;
    private long zzre;
    private GmsServiceEndpoint zzrf;
    private final GmsClientSupervisor zzrg;
    /* access modifiers changed from: private */
    public final Object zzrh;
    /* access modifiers changed from: private */
    public IGmsServiceBroker zzri;
    private T zzrj;
    /* access modifiers changed from: private */
    public final ArrayList<BaseGmsClient<T>.CallbackProxy<?>> zzrk;
    private BaseGmsClient<T>.GmsServiceConnection zzrl;
    private int zzrm;
    /* access modifiers changed from: private */
    public final BaseConnectionCallbacks zzrn;
    /* access modifiers changed from: private */
    public final BaseOnConnectionFailedListener zzro;
    private final int zzrp;
    private final String zzrq;
    /* access modifiers changed from: private */
    public ConnectionResult zzrr;
    /* access modifiers changed from: private */
    public boolean zzrs;
    private volatile ConnectionInfo zzrt;

    public interface BaseConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public abstract class CallbackProxy<TListener> {
        private TListener zzli;
        private boolean zzrv = false;

        public CallbackProxy(TListener tlistener) {
            this.zzli = tlistener;
        }

        public void deliverCallback() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.zzli;
                if (this.zzrv) {
                    new StringBuilder(String.valueOf(this).length() + 47);
                }
            }
            if (tlistener != null) {
                try {
                    deliverCallback(tlistener);
                } catch (RuntimeException e) {
                    onDeliverCallbackFailed();
                    throw e;
                }
            } else {
                onDeliverCallbackFailed();
            }
            synchronized (this) {
                this.zzrv = true;
            }
            unregister();
        }

        public abstract void deliverCallback(TListener tlistener);

        public abstract void onDeliverCallbackFailed();

        public void removeListener() {
            synchronized (this) {
                this.zzli = null;
            }
        }

        public void unregister() {
            removeListener();
            synchronized (BaseGmsClient.this.zzrk) {
                BaseGmsClient.this.zzrk.remove(this);
            }
        }
    }

    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(ConnectionResult connectionResult);
    }

    public static final class GmsCallbacks extends IGmsCallbacks.Stub {
        private BaseGmsClient zzrw;
        private final int zzrx;

        public GmsCallbacks(BaseGmsClient baseGmsClient, int i) {
            this.zzrw = baseGmsClient;
            this.zzrx = i;
        }

        public final void onAccountValidationComplete(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
            Preconditions.checkNotNull(this.zzrw, "onPostInitComplete can be called only once per call to getRemoteService");
            this.zzrw.onPostInitHandler(i, iBinder, bundle, this.zzrx);
            this.zzrw = null;
        }

        public final void onPostInitCompleteWithConnectionInfo(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
            Preconditions.checkNotNull(this.zzrw, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            Preconditions.checkNotNull(connectionInfo);
            this.zzrw.zza(connectionInfo);
            onPostInitComplete(i, iBinder, connectionInfo.getResolutionBundle());
        }
    }

    public final class GmsServiceConnection implements ServiceConnection {
        private final int zzrx;

        public GmsServiceConnection(int i) {
            this.zzrx = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            BaseGmsClient baseGmsClient = BaseGmsClient.this;
            if (iBinder == null) {
                baseGmsClient.zzj(16);
                return;
            }
            synchronized (baseGmsClient.zzrh) {
                IGmsServiceBroker unused = BaseGmsClient.this.zzri = IGmsServiceBroker.Stub.asInterface(iBinder);
            }
            BaseGmsClient.this.onPostServiceBindingHandler(0, (Bundle) null, this.zzrx);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (BaseGmsClient.this.zzrh) {
                IGmsServiceBroker unused = BaseGmsClient.this.zzri = null;
            }
            Handler handler = BaseGmsClient.this.mHandler;
            handler.sendMessage(handler.obtainMessage(6, this.zzrx, 1));
        }
    }

    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        public LegacyClientCallbackAdapter() {
        }

        public void onReportServiceBinding(ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                Set<Scope> scopes = baseGmsClient.getScopes();
                C9556a aVar = new C9556a();
                aVar.mo10233c(scopes);
                aVar.mo10233c((Object) null);
                C117292a.m165364j(baseGmsClient, aVar.mo10232b(), "com/google/android/gms/common/internal/BaseGmsClient$LegacyClientCallbackAdapter", "onReportServiceBinding", "(Lcom/google/android/gms/common/ConnectionResult;)V", "com/google/android/gms/common/internal/BaseGmsClient", "getRemoteService", "(Lcom/google/android/gms/common/internal/IAccountAccessor;Ljava/util/Set;)V");
            } else if (BaseGmsClient.this.zzro != null) {
                BaseGmsClient.this.zzro.onConnectionFailed(connectionResult);
            }
        }
    }

    public final class PostInitCallback extends zza {
        public final IBinder service;

        public PostInitCallback(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.service = iBinder;
        }

        public final void handleServiceFailure(ConnectionResult connectionResult) {
            if (BaseGmsClient.this.zzro != null) {
                BaseGmsClient.this.zzro.onConnectionFailed(connectionResult);
            }
            BaseGmsClient.this.onConnectionFailed(connectionResult);
        }

        public final boolean handleServiceSuccess() {
            try {
                String interfaceDescriptor = this.service.getInterfaceDescriptor();
                if (!BaseGmsClient.this.getServiceDescriptor().equals(interfaceDescriptor)) {
                    new StringBuilder(String.valueOf(BaseGmsClient.this.getServiceDescriptor()).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    return false;
                }
                IInterface createServiceInterface = BaseGmsClient.this.createServiceInterface(this.service);
                if (createServiceInterface == null) {
                    return false;
                }
                if (!BaseGmsClient.this.zza(2, 4, createServiceInterface) && !BaseGmsClient.this.zza(3, 4, createServiceInterface)) {
                    return false;
                }
                ConnectionResult unused = BaseGmsClient.this.zzrr = null;
                Bundle connectionHint = BaseGmsClient.this.getConnectionHint();
                if (BaseGmsClient.this.zzrn != null) {
                    BaseGmsClient.this.zzrn.onConnected(connectionHint);
                }
                return true;
            } catch (RemoteException unused2) {
                return false;
            }
        }
    }

    public final class PostServiceBindingCallback extends zza {
        public PostServiceBindingCallback(int i, Bundle bundle) {
            super(i, bundle);
        }

        public final void handleServiceFailure(ConnectionResult connectionResult) {
            BaseGmsClient.this.mConnectionProgressReportCallbacks.onReportServiceBinding(connectionResult);
            BaseGmsClient.this.onConnectionFailed(connectionResult);
        }

        public final boolean handleServiceSuccess() {
            BaseGmsClient.this.mConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
            return true;
        }
    }

    public interface SignOutCallbacks {
        void onSignOutComplete();
    }

    public abstract class zza extends BaseGmsClient<T>.CallbackProxy<Boolean> {
        public final Bundle resolution;
        public final int statusCode;

        public zza(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.statusCode = i;
            this.resolution = bundle;
        }

        /* JADX WARNING: type inference failed for: r4v10, types: [android.os.Parcelable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void deliverCallback(java.lang.Boolean r4) {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                if (r4 != 0) goto L_0x000a
                com.google.android.gms.common.internal.BaseGmsClient r4 = com.google.android.gms.common.internal.BaseGmsClient.this
                r4.zza((int) r0, null)
                return
            L_0x000a:
                int r4 = r3.statusCode
                if (r4 == 0) goto L_0x003c
                r2 = 10
                if (r4 == r2) goto L_0x002f
                com.google.android.gms.common.internal.BaseGmsClient r4 = com.google.android.gms.common.internal.BaseGmsClient.this
                r4.zza((int) r0, null)
                android.os.Bundle r4 = r3.resolution
                if (r4 == 0) goto L_0x0024
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r4 = r4.getParcelable(r0)
                r1 = r4
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x0024:
                com.google.android.gms.common.ConnectionResult r4 = new com.google.android.gms.common.ConnectionResult
                int r0 = r3.statusCode
                r4.<init>(r0, r1)
                r3.handleServiceFailure(r4)
                goto L_0x0051
            L_0x002f:
                com.google.android.gms.common.internal.BaseGmsClient r4 = com.google.android.gms.common.internal.BaseGmsClient.this
                r4.zza((int) r0, null)
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "A fatal developer error has occurred. Check the logs for further information."
                r4.<init>(r0)
                throw r4
            L_0x003c:
                boolean r4 = r3.handleServiceSuccess()
                if (r4 != 0) goto L_0x0051
                com.google.android.gms.common.internal.BaseGmsClient r4 = com.google.android.gms.common.internal.BaseGmsClient.this
                r4.zza((int) r0, null)
                com.google.android.gms.common.ConnectionResult r4 = new com.google.android.gms.common.ConnectionResult
                r0 = 8
                r4.<init>(r0, r1)
                r3.handleServiceFailure(r4)
            L_0x0051:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.zza.deliverCallback(java.lang.Boolean):void");
        }

        public abstract void handleServiceFailure(ConnectionResult connectionResult);

        public abstract boolean handleServiceSuccess();

        public void onDeliverCallbackFailed() {
        }
    }

    public final class zzb extends Handler {
        public zzb(Looper looper) {
            super(looper);
        }

        private static void zza(Message message) {
            CallbackProxy callbackProxy = (CallbackProxy) message.obj;
            callbackProxy.onDeliverCallbackFailed();
            callbackProxy.unregister();
        }

        private static boolean zzb(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.mDisconnectCount
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x0016
                boolean r0 = zzb(r8)
                if (r0 == 0) goto L_0x0015
                zza(r8)
            L_0x0015:
                return
            L_0x0016:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L_0x0024
                r4 = 7
                if (r0 == r4) goto L_0x0024
                if (r0 == r1) goto L_0x0024
                if (r0 != r3) goto L_0x0030
            L_0x0024:
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                boolean r0 = r0.isConnecting()
                if (r0 != 0) goto L_0x0030
                zza(r8)
                return
            L_0x0030:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L_0x007b
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
                int r8 = r8.arg2
                r1.<init>(r8)
                com.google.android.gms.common.ConnectionResult unused = r0.zzrr = r1
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                boolean r8 = r8.zzcr()
                if (r8 == 0) goto L_0x005a
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                boolean r8 = r8.zzrs
                if (r8 != 0) goto L_0x005a
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                r8.zza((int) r5, null)
                return
            L_0x005a:
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.ConnectionResult r8 = r8.zzrr
                if (r8 == 0) goto L_0x0069
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.ConnectionResult r8 = r8.zzrr
                goto L_0x006e
            L_0x0069:
                com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
                r8.<init>(r4)
            L_0x006e:
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.mConnectionProgressReportCallbacks
                r0.onReportServiceBinding(r8)
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                r0.onConnectionFailed(r8)
                return
            L_0x007b:
                if (r0 != r3) goto L_0x009e
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.ConnectionResult r8 = r8.zzrr
                if (r8 == 0) goto L_0x008c
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.ConnectionResult r8 = r8.zzrr
                goto L_0x0091
            L_0x008c:
                com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
                r8.<init>(r4)
            L_0x0091:
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.mConnectionProgressReportCallbacks
                r0.onReportServiceBinding(r8)
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                r0.onConnectionFailed(r8)
                return
            L_0x009e:
                if (r0 != r5) goto L_0x00bd
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00a9
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00a9:
                com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r8 = r8.mConnectionProgressReportCallbacks
                r8.onReportServiceBinding(r0)
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                r8.onConnectionFailed(r0)
                return
            L_0x00bd:
                r1 = 6
                if (r0 != r1) goto L_0x00e5
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                r0.zza((int) r3, null)
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = r0.zzrn
                if (r0 == 0) goto L_0x00d8
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = r0.zzrn
                int r1 = r8.arg2
                r0.onConnectionSuspended(r1)
            L_0x00d8:
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                int r8 = r8.arg2
                r0.onConnectionSuspended(r8)
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                boolean unused = r8.zza((int) r3, (int) r2, r6)
                return
            L_0x00e5:
                r1 = 2
                if (r0 != r1) goto L_0x00f4
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                boolean r0 = r0.isConnected()
                if (r0 != 0) goto L_0x00f4
                zza(r8)
                return
            L_0x00f4:
                boolean r0 = zzb(r8)
                if (r0 == 0) goto L_0x0102
                java.lang.Object r8 = r8.obj
                com.google.android.gms.common.internal.BaseGmsClient$CallbackProxy r8 = (com.google.android.gms.common.internal.BaseGmsClient.CallbackProxy) r8
                r8.deliverCallback()
                return
            L_0x0102:
                int r8 = r8.what
                r0 = 45
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Don't know how to handle message: "
                r1.append(r0)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "GmsClient"
                android.util.Log.wtf(r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.zzb.handleMessage(android.os.Message):void");
        }
    }

    public BaseGmsClient(Context context, Handler handler, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.mLock = new Object();
        this.zzrh = new Object();
        this.zzrk = new ArrayList<>();
        this.zzrm = 1;
        this.zzrr = null;
        this.zzrs = false;
        this.zzrt = null;
        this.mDisconnectCount = new AtomicInteger(0);
        this.mContext = (Context) Preconditions.checkNotNull(context, "Context must not be null");
        this.mHandler = (Handler) Preconditions.checkNotNull(handler, "Handler must not be null");
        this.zzcn = handler.getLooper();
        this.zzrg = (GmsClientSupervisor) Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzgk = (GoogleApiAvailabilityLight) Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzrp = i;
        this.zzrn = baseConnectionCallbacks;
        this.zzro = baseOnConnectionFailedListener;
        this.zzrq = null;
    }

    public BaseGmsClient(Context context, Looper looper, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailabilityLight.getInstance(), i, (BaseConnectionCallbacks) Preconditions.checkNotNull(baseConnectionCallbacks), (BaseOnConnectionFailedListener) Preconditions.checkNotNull(baseOnConnectionFailedListener), str);
    }

    public BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this.mLock = new Object();
        this.zzrh = new Object();
        this.zzrk = new ArrayList<>();
        this.zzrm = 1;
        this.zzrr = null;
        this.zzrs = false;
        this.zzrt = null;
        this.mDisconnectCount = new AtomicInteger(0);
        this.mContext = (Context) Preconditions.checkNotNull(context, "Context must not be null");
        this.zzcn = (Looper) Preconditions.checkNotNull(looper, "Looper must not be null");
        this.zzrg = (GmsClientSupervisor) Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzgk = (GoogleApiAvailabilityLight) Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.mHandler = new zzb(looper);
        this.zzrp = i;
        this.zzrn = baseConnectionCallbacks;
        this.zzro = baseOnConnectionFailedListener;
        this.zzrq = str;
    }

    /* access modifiers changed from: private */
    public final void zza(int i, T t) {
        GmsServiceEndpoint gmsServiceEndpoint;
        Preconditions.checkArgument((i == 4) == (t != null));
        synchronized (this.mLock) {
            this.zzrm = i;
            this.zzrj = t;
            onSetConnectState(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.zzrl == null || (gmsServiceEndpoint = this.zzrf) == null)) {
                        new StringBuilder(String.valueOf(gmsServiceEndpoint.zzcw()).length() + 70 + String.valueOf(this.zzrf.getPackageName()).length());
                        this.zzrg.unbindService(this.zzrf.zzcw(), this.zzrf.getPackageName(), this.zzrf.getBindFlags(), this.zzrl, getRealClientName());
                        this.mDisconnectCount.incrementAndGet();
                    }
                    this.zzrl = new GmsServiceConnection(this.mDisconnectCount.get());
                    GmsServiceEndpoint gmsServiceEndpoint2 = (this.zzrm != 3 || getLocalStartServiceAction() == null) ? new GmsServiceEndpoint(getStartServicePackage(), getStartServiceAction(), false, getServiceBindFlags()) : new GmsServiceEndpoint(getContext().getPackageName(), getLocalStartServiceAction(), true, getServiceBindFlags());
                    this.zzrf = gmsServiceEndpoint2;
                    if (!this.zzrg.bindService(gmsServiceEndpoint2.zzcw(), this.zzrf.getPackageName(), this.zzrf.getBindFlags(), this.zzrl, getRealClientName())) {
                        new StringBuilder(String.valueOf(this.zzrf.zzcw()).length() + 34 + String.valueOf(this.zzrf.getPackageName()).length());
                        onPostServiceBindingHandler(16, (Bundle) null, this.mDisconnectCount.get());
                    }
                } else if (i == 4) {
                    onConnectedLocked(t);
                }
            } else if (this.zzrl != null) {
                this.zzrg.unbindService(getStartServiceAction(), getStartServicePackage(), getServiceBindFlags(), this.zzrl, getRealClientName());
                this.zzrl = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zza(ConnectionInfo connectionInfo) {
        this.zzrt = connectionInfo;
    }

    /* access modifiers changed from: private */
    public final boolean zza(int i, int i2, T t) {
        synchronized (this.mLock) {
            if (this.zzrm != i) {
                return false;
            }
            zza(i2, t);
            return true;
        }
    }

    private final boolean zzcq() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzrm == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final boolean zzcr() {
        if (this.zzrs || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final void zzj(int i) {
        int i2;
        if (zzcq()) {
            i2 = 5;
            this.zzrs = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(i2, this.mDisconnectCount.get(), 16));
    }

    public void checkAvailabilityAndConnect() {
        int isGooglePlayServicesAvailable = this.zzgk.isGooglePlayServicesAvailable(this.mContext, getMinApkVersion());
        if (isGooglePlayServicesAvailable != 0) {
            zza(1, (IInterface) null);
            triggerNotAvailable(new LegacyClientCallbackAdapter(), isGooglePlayServicesAvailable, (PendingIntent) null);
            return;
        }
        connect(new LegacyClientCallbackAdapter());
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        this.mConnectionProgressReportCallbacks = (ConnectionProgressReportCallbacks) Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        zza(2, (IInterface) null);
    }

    public abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.mDisconnectCount.incrementAndGet();
        synchronized (this.zzrk) {
            int size = this.zzrk.size();
            for (int i = 0; i < size; i++) {
                this.zzrk.get(i).removeListener();
            }
            this.zzrk.clear();
        }
        synchronized (this.zzrh) {
            this.zzri = null;
        }
        zza(1, (IInterface) null);
    }

    @Deprecated
    public final void doCallbackDEPRECATED(BaseGmsClient<T>.CallbackProxy<?> callbackProxy) {
        synchronized (this.zzrk) {
            this.zzrk.add(callbackProxy);
        }
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(2, this.mDisconnectCount.get(), -1, callbackProxy));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.mLock) {
            i = this.zzrm;
            t = this.zzrj;
        }
        synchronized (this.zzrh) {
            iGmsServiceBroker = this.zzri;
        }
        printWriter.append(str).append("mConnectState=");
        printWriter.print(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzrc > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.zzrc;
            String format = simpleDateFormat.format(new Date(this.zzrc));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.zzrb > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.zzra;
            printWriter.append(i2 != 1 ? i2 != 2 ? String.valueOf(i2) : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED");
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzrb;
            String format2 = simpleDateFormat.format(new Date(this.zzrb));
            StringBuilder sb4 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb4.append(j2);
            sb4.append(" ");
            sb4.append(format2);
            append2.println(sb4.toString());
        }
        if (this.zzre > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(CommonStatusCodes.getStatusCodeString(this.zzrd));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzre;
            String format3 = simpleDateFormat.format(new Date(this.zzre));
            StringBuilder sb5 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb5.append(j3);
            sb5.append(" ");
            sb5.append(format3);
            append3.println(sb5.toString());
        }
    }

    public Account getAccount() {
        return null;
    }

    public final Account getAccountOrDefault() {
        return getAccount() != null ? getAccount() : new Account("<<default account>>", "com.google");
    }

    public Feature[] getApiFeatures() {
        return zzqz;
    }

    public final Feature[] getAvailableFeatures() {
        ConnectionInfo connectionInfo = this.zzrt;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.getAvailableFeatures();
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.mContext;
    }

    public String getEndpointPackageName() {
        GmsServiceEndpoint gmsServiceEndpoint;
        if (isConnected() && (gmsServiceEndpoint = this.zzrf) != null) {
            return gmsServiceEndpoint.getPackageName();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public final Handler getHandlerForTesting() {
        return this.mHandler;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzcn;
    }

    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final String getRealClientName() {
        String str = this.zzrq;
        return str == null ? this.mContext.getClass().getName() : str;
    }

    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        GetServiceRequest extraArgs = new GetServiceRequest(this.zzrp).setCallingPackage(this.mContext.getPackageName()).setExtraArgs(getGetServiceRequestExtraArgs());
        if (set != null) {
            extraArgs.setScopes(set);
        }
        if (requiresSignIn()) {
            extraArgs.setClientRequestedAccount(getAccountOrDefault()).setAuthenticatedAccount(iAccountAccessor);
        } else if (requiresAccount()) {
            extraArgs.setClientRequestedAccount(getAccount());
        }
        extraArgs.setClientRequiredFeatures(getRequiredFeatures());
        extraArgs.setClientApiFeatures(getApiFeatures());
        try {
            synchronized (this.zzrh) {
                IGmsServiceBroker iGmsServiceBroker = this.zzri;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.getService(new GmsCallbacks(this, this.mDisconnectCount.get()), extraArgs);
                }
            }
        } catch (DeadObjectException unused) {
            triggerConnectionSuspended(1);
        } catch (SecurityException e) {
            throw e;
        } catch (RemoteException | RuntimeException unused2) {
            onPostInitHandler(8, (IBinder) null, (Bundle) null, this.mDisconnectCount.get());
        }
    }

    public Feature[] getRequiredFeatures() {
        return zzqz;
    }

    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final T getService() {
        T t;
        synchronized (this.mLock) {
            if (this.zzrm != 5) {
                checkConnected();
                Preconditions.checkState(this.zzrj != null, "Client is connected but service is null");
                t = this.zzrj;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    public int getServiceBindFlags() {
        return 129;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzrh) {
            IGmsServiceBroker iGmsServiceBroker = this.zzri;
            if (iGmsServiceBroker == null) {
                return null;
            }
            IBinder asBinder = iGmsServiceBroker.asBinder();
            return asBinder;
        }
    }

    public final IGmsServiceBroker getServiceBrokerForTesting() {
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzrh) {
            iGmsServiceBroker = this.zzri;
        }
        return iGmsServiceBroker;
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzrm == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.mLock) {
            int i = this.zzrm;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void onConnectedLocked(T t) {
        this.zzrc = System.currentTimeMillis();
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzrd = connectionResult.getErrorCode();
        this.zzre = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i) {
        this.zzra = i;
        this.zzrb = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new PostInitCallback(i, iBinder, bundle)));
    }

    public void onPostServiceBindingHandler(int i, Bundle bundle, int i2) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new PostServiceBindingCallback(i, bundle)));
    }

    public void onSetConnectState(int i, T t) {
    }

    public void onUserSignOut(SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setConnectionInfoForTesting(ConnectionInfo connectionInfo) {
        this.zzrt = connectionInfo;
    }

    public final void setServiceBrokerForTesting(IGmsServiceBroker iGmsServiceBroker) {
        synchronized (this.zzrh) {
            this.zzri = iGmsServiceBroker;
        }
    }

    public final void setServiceForTesting(T t) {
        zza(t != null ? 4 : 1, t);
    }

    public void triggerConnectionSuspended(int i) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(6, this.mDisconnectCount.get(), i));
    }

    public void triggerNotAvailable(ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, PendingIntent pendingIntent) {
        this.mConnectionProgressReportCallbacks = (ConnectionProgressReportCallbacks) Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(3, this.mDisconnectCount.get(), i, pendingIntent));
    }
}
