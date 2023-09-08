package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    public static final ThreadLocal<Boolean> zzez = new zzo();
    private zza mResultGuardian;
    private Status mStatus;
    /* access modifiers changed from: private */
    public R zzdm;
    private final Object zzfa;
    private final CallbackHandler<R> zzfb;
    private final WeakReference<GoogleApiClient> zzfc;
    private final CountDownLatch zzfd;
    private final ArrayList<PendingResult.StatusListener> zzfe;
    private ResultCallback<? super R> zzff;
    private final AtomicReference<zzcn> zzfg;
    private volatile boolean zzfh;
    private boolean zzfi;
    private boolean zzfj;
    private ICancelToken zzfk;
    private volatile zzch<R> zzfl;
    private boolean zzfm;

    public static class CallbackHandler<R extends Result> extends Handler {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.onResult(result);
                } catch (RuntimeException e) {
                    BasePendingResult.zzb(result);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).zzb(Status.RESULT_TIMEOUT);
            }
        }

        public final void zza(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }
    }

    public final class zza {
        private zza() {
        }

        public /* synthetic */ zza(BasePendingResult basePendingResult, zzo zzo) {
            this();
        }

        public final void finalize() {
            BasePendingResult.zzb(BasePendingResult.this.zzdm);
            super.finalize();
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.zzfa = new Object();
        this.zzfd = new CountDownLatch(1);
        this.zzfe = new ArrayList<>();
        this.zzfg = new AtomicReference<>();
        this.zzfm = false;
        this.zzfb = new CallbackHandler<>(Looper.getMainLooper());
        this.zzfc = new WeakReference<>((Object) null);
    }

    @Deprecated
    public BasePendingResult(Looper looper) {
        this.zzfa = new Object();
        this.zzfd = new CountDownLatch(1);
        this.zzfe = new ArrayList<>();
        this.zzfg = new AtomicReference<>();
        this.zzfm = false;
        this.zzfb = new CallbackHandler<>(looper);
        this.zzfc = new WeakReference<>((Object) null);
    }

    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.zzfa = new Object();
        this.zzfd = new CountDownLatch(1);
        this.zzfe = new ArrayList<>();
        this.zzfg = new AtomicReference<>();
        this.zzfm = false;
        this.zzfb = new CallbackHandler<>(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zzfc = new WeakReference<>(googleApiClient);
    }

    public BasePendingResult(CallbackHandler<R> callbackHandler) {
        this.zzfa = new Object();
        this.zzfd = new CountDownLatch(1);
        this.zzfe = new ArrayList<>();
        this.zzfg = new AtomicReference<>();
        this.zzfm = false;
        this.zzfb = (CallbackHandler) Preconditions.checkNotNull(callbackHandler, "CallbackHandler must not be null");
        this.zzfc = new WeakReference<>((Object) null);
    }

    private final R get() {
        R r;
        synchronized (this.zzfa) {
            Preconditions.checkState(!this.zzfh, "Result has already been consumed.");
            Preconditions.checkState(isReady(), "Result is not ready.");
            r = this.zzdm;
            this.zzdm = null;
            this.zzff = null;
            this.zzfh = true;
        }
        zzcn andSet = this.zzfg.getAndSet((Object) null);
        if (andSet != null) {
            andSet.zzc(this);
        }
        return r;
    }

    private final void zza(R r) {
        this.zzdm = r;
        this.zzfk = null;
        this.zzfd.countDown();
        this.mStatus = this.zzdm.getStatus();
        if (this.zzfi) {
            this.zzff = null;
        } else if (this.zzff != null) {
            this.zzfb.removeMessages(2);
            this.zzfb.zza(this.zzff, get());
        } else if (this.zzdm instanceof Releasable) {
            this.mResultGuardian = new zza(this, (zzo) null);
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.zzfe;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            PendingResult.StatusListener statusListener = arrayList.get(i);
            i++;
            statusListener.onComplete(this.mStatus);
        }
        this.zzfe.clear();
    }

    public static void zzb(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException unused) {
                new StringBuilder(String.valueOf(result).length() + 18);
            }
        }
    }

    public final void addStatusListener(PendingResult.StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.zzfa) {
            if (isReady()) {
                statusListener.onComplete(this.mStatus);
            } else {
                this.zzfe.add(statusListener);
            }
        }
    }

    public final R await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        boolean z = true;
        Preconditions.checkState(!this.zzfh, "Result has already been consumed");
        if (this.zzfl != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            this.zzfd.await();
        } catch (InterruptedException unused) {
            zzb(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        Preconditions.checkState(!this.zzfh, "Result has already been consumed.");
        if (this.zzfl != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            if (!this.zzfd.await(j, timeUnit)) {
                zzb(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            zzb(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.zzfa
            monitor-enter(r0)
            boolean r1 = r2.zzfi     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r2.zzfh     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            com.google.android.gms.common.internal.ICancelToken r1 = r2.zzfk     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            r1.cancel()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0013:
            R r1 = r2.zzdm     // Catch:{ all -> 0x0028 }
            zzb((com.google.android.gms.common.api.Result) r1)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2.zzfi = r1     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_CANCELED     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Result r1 = r2.createFailedResult(r1)     // Catch:{ all -> 0x0028 }
            r2.zza(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.cancel():void");
    }

    public abstract R createFailedResult(Status status);

    public boolean isCanceled() {
        boolean z;
        synchronized (this.zzfa) {
            z = this.zzfi;
        }
        return z;
    }

    public final boolean isReady() {
        return this.zzfd.getCount() == 0;
    }

    public final void setCancelToken(ICancelToken iCancelToken) {
        synchronized (this.zzfa) {
            this.zzfk = iCancelToken;
        }
    }

    public final void setResult(R r) {
        synchronized (this.zzfa) {
            if (this.zzfj || this.zzfi) {
                zzb((Result) r);
                return;
            }
            isReady();
            boolean z = true;
            Preconditions.checkState(!isReady(), "Results have already been set");
            if (this.zzfh) {
                z = false;
            }
            Preconditions.checkState(z, "Result has already been consumed");
            zza(r);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.zzfa
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.zzff = r6     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x000a:
            boolean r1 = r5.zzfh     // Catch:{ all -> 0x003f }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.internal.zzch<R> r1 = r5.zzfl     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch:{ all -> 0x003f }
            boolean r1 = r5.isCanceled()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x002b:
            boolean r1 = r5.isReady()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R> r1 = r5.zzfb     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.Result r2 = r5.get()     // Catch:{ all -> 0x003f }
            r1.zza(r6, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x003b:
            r5.zzff = r6     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r6, long r7, java.util.concurrent.TimeUnit r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.zzfa
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.zzff = r6     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x000a:
            boolean r1 = r5.zzfh     // Catch:{ all -> 0x004d }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch:{ all -> 0x004d }
            com.google.android.gms.common.api.internal.zzch<R> r1 = r5.zzfl     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch:{ all -> 0x004d }
            boolean r1 = r5.isCanceled()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x002b:
            boolean r1 = r5.isReady()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R> r7 = r5.zzfb     // Catch:{ all -> 0x004d }
            com.google.android.gms.common.api.Result r8 = r5.get()     // Catch:{ all -> 0x004d }
            r7.zza(r6, r8)     // Catch:{ all -> 0x004d }
            goto L_0x004b
        L_0x003b:
            r5.zzff = r6     // Catch:{ all -> 0x004d }
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R> r6 = r5.zzfb     // Catch:{ all -> 0x004d }
            long r7 = r9.toMillis(r7)     // Catch:{ all -> 0x004d }
            r9 = 2
            android.os.Message r9 = r6.obtainMessage(r9, r5)     // Catch:{ all -> 0x004d }
            r6.sendMessageDelayed(r9, r7)     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback, long, java.util.concurrent.TimeUnit):void");
    }

    public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> then;
        Preconditions.checkState(!this.zzfh, "Result has already been consumed.");
        synchronized (this.zzfa) {
            boolean z = false;
            Preconditions.checkState(this.zzfl == null, "Cannot call then() twice.");
            Preconditions.checkState(this.zzff == null, "Cannot call then() if callbacks are set.");
            if (!this.zzfi) {
                z = true;
            }
            Preconditions.checkState(z, "Cannot call then() if result was canceled.");
            this.zzfm = true;
            this.zzfl = new zzch<>(this.zzfc);
            then = this.zzfl.then(resultTransform);
            if (isReady()) {
                this.zzfb.zza(this.zzfl, get());
            } else {
                this.zzff = this.zzfl;
            }
        }
        return then;
    }

    public final void zza(zzcn zzcn) {
        this.zzfg.set(zzcn);
    }

    public final void zzb(Status status) {
        synchronized (this.zzfa) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zzfj = true;
            }
        }
    }

    public final Integer zzo() {
        return null;
    }

    public final boolean zzw() {
        boolean isCanceled;
        synchronized (this.zzfa) {
            if (this.zzfc.get() == null || !this.zzfm) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zzx() {
        this.zzfm = this.zzfm || zzez.get().booleanValue();
    }
}
