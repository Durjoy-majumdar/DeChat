package com.tencent.p014mm.vending.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vending.base.C97314b;
import gp3.C87315b;
import gp3.C87316c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import jp3.C9486a;
import kp3.C88253a;
import mp3.C88819d;
import mp3.C88825i;
import np3.C89049b;
import op3.C117876a;
import op3.C117882j;

/* renamed from: com.tencent.mm.vending.base.Vending */
public abstract class Vending<_Struct, _Index, _Change> implements C9486a {
    private static final int MESSAGE_DO_DESTROY = 2;
    private static final int MESSAGE_NOTIFY_DATA_LOADED = 1;
    private static final int MESSAGE_PREPARE_VENDING_DATA = 1;
    private static final int SYNC_MESSAGE_APPLY_CHANGE = 1;
    private static final int SYNC_MESSAGE_CLEAR_RESOLVED_ONLY = 3;
    private static final int SYNC_MESSAGE_PREPARE_DATA_DEGRADE = 2;
    private static final String TAG = "Vending";
    /* access modifiers changed from: private */
    public C97308o<_Index, C97310q<_Struct, _Index>> mArray;
    private byte[] mArrayDataLock;
    private AtomicBoolean mCallDestroyed;
    /* access modifiers changed from: private */
    public volatile C87316c mDataChangedCallback;
    private volatile C87316c mDataResolvedCallback;
    private C97301k<_Index> mDeadlock;
    private boolean mFreezeDataChange;
    private boolean mHasPendingDataChange;
    /* access modifiers changed from: private */
    public C97304n mLoader;
    private byte[] mPendingDataChangeLock;
    private boolean mResolveFromVending;
    /* access modifiers changed from: private */
    public Handler mSubscriberHandler;
    private Looper mSubscriberLooper;
    public HashSet<Vending<_Struct, _Index, _Change>.p> mVendingDeferring;
    /* access modifiers changed from: private */
    public Handler mVendingHandler;
    /* access modifiers changed from: private */
    public Looper mVendingLooper;
    private C97314b mVendingSync;

    /* renamed from: com.tencent.mm.vending.base.Vending$a */
    public class C97291a extends C87316c<C97302l> {
        public C97291a(Vending vending, C88819d dVar) {
            super(dVar);
        }

        /* renamed from: o */
        public void mo121712o(Object obj, C117882j jVar) {
            ((C97302l) obj).mo133003a();
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$b */
    public class C97292b extends C87316c<C97303m> {
        public C97292b(Vending vending, C88819d dVar) {
            super(dVar);
        }

        /* renamed from: o */
        public void mo121712o(Object obj, C117882j jVar) {
            ((C97303m) obj).mo136387a(jVar.mo182596a(0));
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$c */
    public class C97293c implements C97300j {
        public C97293c() {
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$d */
    public class C97294d implements C97314b.C97317c {
        public C97294d() {
        }

        /* renamed from: a */
        public void mo136383a(int i, Object obj) {
            C88253a.m109903b(Vending.TAG, "%s synchronizing", Vending.this);
            Vending.this.mVendingDeferring.clear();
            Vending.this.mLoader.mo136388a();
            Vending.this.mSubscriberHandler.removeCallbacksAndMessages((Object) null);
            if (i == 2) {
                obj = Vending.this.prepareVendingDataAsynchronous();
            }
            if (i == 2 || i == 1) {
                Vending.this.applyChangeSynchronized(obj);
            }
            Vending.this.synchronizing(i, obj);
            Vending.this.mArray.clear();
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$e */
    public class C97295e extends Handler {
        public C97295e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C97310q qVar = (C97310q) message.obj;
                Vending.this.onDataResolved(qVar.f285591a, qVar.f285592b);
            }
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$f */
    public class C97296f extends Handler {
        public C97296f(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Vending.this.callPrepareVendingData();
            } else if (i == 2) {
                Vending.this.destroyAsynchronous();
            }
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$g */
    public class C97297g implements C97304n.C97306b<_Index> {
        public C97297g() {
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$h */
    public class C97298h implements Runnable {
        public C97298h(Vending vending) {
        }

        public void run() {
            C88253a.m109903b(Vending.TAG, "WTTTTF", new Object[0]);
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$i */
    public static final class C97299i<T> {

        /* renamed from: a */
        public volatile T f285576a;

        public C97299i(C97291a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$j */
    public interface C97300j {
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$k */
    public static final class C97301k<_Index> {

        /* renamed from: a */
        public C97299i<_Index> f285577a = new C97299i<>((C97291a) null);

        /* renamed from: b */
        public C97310q f285578b;

        public C97301k(C97291a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$l */
    public interface C97302l {
        /* renamed from: a */
        void mo133003a();
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$m */
    public interface C97303m<_Index> {
        /* renamed from: a */
        void mo136387a(_Index _index);
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$n */
    public static final class C97304n<_Index> {

        /* renamed from: a */
        public HashMap<_Index, C97307c> f285579a = new HashMap<>();

        /* renamed from: b */
        public C97306b<_Index> f285580b = null;

        /* renamed from: c */
        public AtomicBoolean f285581c = new AtomicBoolean(false);

        /* renamed from: d */
        public byte[] f285582d = new byte[0];

        /* renamed from: e */
        public Handler f285583e;

        /* renamed from: com.tencent.mm.vending.base.Vending$n$a */
        public class C97305a extends Handler {
            public C97305a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (C97304n.this.f285581c.get()) {
                    C97297g gVar = (C97297g) C97304n.this.f285580b;
                    Vending.this.loaderClear();
                    Vending.this.deadlock();
                    return;
                }
                Object obj = message.obj;
                C97297g gVar2 = (C97297g) C97304n.this.f285580b;
                C97310q lock = Vending.this.getLock(obj);
                boolean access$1100 = Vending.this.loadFromVending(lock, obj);
                if (lock.f285597g) {
                    Object[] objArr = {lock, obj};
                    if (C88253a.f255069a != null) {
                        Log.m105919d(Vending.TAG, "This lock is defer to return %s %s", objArr);
                    }
                } else if (!access$1100) {
                    Vending.this.notifyDataLoadedIfNeed(lock);
                }
                synchronized (C97304n.this.f285582d) {
                    C97304n.this.f285579a.put(obj, C97307c.FILLED);
                }
            }
        }

        /* renamed from: com.tencent.mm.vending.base.Vending$n$b */
        public interface C97306b<_Index> {
        }

        /* renamed from: com.tencent.mm.vending.base.Vending$n$c */
        public enum C97307c {
            NIL,
            PENDING,
            FILLED
        }

        public C97304n(Looper looper, C97306b<_Index> bVar) {
            this.f285580b = bVar;
            this.f285583e = new C97305a(looper);
        }

        /* renamed from: a */
        public final void mo136388a() {
            this.f285583e.removeCallbacksAndMessages((Object) null);
            C88253a.m109903b("Vending.Loader", "clear()", new Object[0]);
            synchronized (this.f285582d) {
                this.f285579a.clear();
            }
            C97297g gVar = (C97297g) this.f285580b;
            Vending.this.loaderClear();
            Vending.this.deadlock();
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$o */
    public static class C97308o<K, V> extends HashMap<K, V> {

        /* renamed from: d */
        public C97300j f285589d = null;

        public void clear() {
            super.clear();
            C97300j jVar = this.f285589d;
            if (jVar != null) {
                C97293c cVar = (C97293c) jVar;
                cVar.getClass();
                C88253a.m109903b(Vending.TAG, "SafeSparseArray fusing.", new Object[0]);
                Vending.this.deadlock();
            }
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$p */
    public class C97309p {

        /* renamed from: a */
        public _Index f285590a;

        public C97309p(Vending vending, _Index _index) {
            this.f285590a = _index;
        }
    }

    /* renamed from: com.tencent.mm.vending.base.Vending$q */
    public static final class C97310q<_Struct, _Index> {

        /* renamed from: a */
        public _Index f285591a;

        /* renamed from: b */
        public _Struct f285592b;

        /* renamed from: c */
        public byte[] f285593c = new byte[0];

        /* renamed from: d */
        public boolean f285594d = false;

        /* renamed from: e */
        public boolean f285595e = false;

        /* renamed from: f */
        public boolean f285596f = false;

        /* renamed from: g */
        public boolean f285597g = false;

        /* renamed from: h */
        public boolean f285598h = false;
    }

    public Vending() {
        this(Looper.getMainLooper());
    }

    /* access modifiers changed from: private */
    public void callPrepareVendingData() {
        if (!this.mCallDestroyed.get()) {
            C88253a.m109903b(TAG, "Vending.callPrepareVendingData()", new Object[0]);
            this.mVendingSync.mo136394a(1, prepareVendingDataAsynchronous());
        }
    }

    /* access modifiers changed from: private */
    public void deadlock() {
        if (this.mDeadlock.f285577a.f285576a != null) {
            C88253a.m109902a(TAG, "Catch deadlock! Tell Carl! .. " + this.mDeadlock.f285577a.f285576a, new Object[0]);
            C97310q qVar = this.mDeadlock.f285578b;
            if (qVar != null) {
                synchronized (qVar.f285593c) {
                    this.mDeadlock.f285578b.f285593c.notify();
                }
                C97301k<_Index> kVar = this.mDeadlock;
                kVar.f285577a.f285576a = null;
                kVar.f285578b = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public void deferResolved(Vending<_Struct, _Index, _Change>.p pVar, _Index _index, _Struct _struct) {
        if (this.mVendingDeferring.contains(pVar)) {
            C97310q lock = getLock(_index);
            synchronized (lock.f285593c) {
                lock.f285597g = false;
                lockResolved(lock, _index, _struct);
            }
            notifyDataLoadedIfNeed(lock);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        return r10;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.p014mm.vending.base.Vending.C97310q<_Struct, _Index> forSubscriberSync(com.tencent.p014mm.vending.base.Vending.C97310q<_Struct, _Index> r10, _Index r11) {
        /*
            r9 = this;
            np3.b r0 = np3.C89049b.f256699b
            android.os.HandlerThread r0 = r0.f256700a
            boolean r0 = r0.isAlive()
            r1 = 0
            if (r0 != 0) goto L_0x0015
            java.lang.String r11 = "Vending"
            java.lang.String r0 = "Vending thread is not running!"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            kp3.C88253a.m109902a(r11, r0, r1)
            return r10
        L_0x0015:
            byte[] r0 = r10.f285593c
            monitor-enter(r0)
            boolean r2 = r9.requestIndex(r10, r11)     // Catch:{ all -> 0x006b }
            boolean r3 = r10.f285596f     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x0024
            boolean r3 = r10.f285594d     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x0069
        L_0x0024:
            if (r2 != 0) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            return r10
        L_0x0028:
            com.tencent.mm.vending.base.Vending$k<_Index> r2 = r9.mDeadlock     // Catch:{ all -> 0x006b }
            com.tencent.mm.vending.base.Vending$i<_Index> r2 = r2.f285577a     // Catch:{ all -> 0x006b }
            r2.f285576a = r11     // Catch:{ all -> 0x006b }
            com.tencent.mm.vending.base.Vending$k<_Index> r2 = r9.mDeadlock     // Catch:{ all -> 0x006b }
            r2.f285578b = r10     // Catch:{ all -> 0x006b }
            java.lang.String r2 = "Vending"
            java.lang.String r3 = "%s waiting %s"
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x006b }
            r5[r1] = r9     // Catch:{ all -> 0x006b }
            r6 = 1
            r5[r6] = r11     // Catch:{ all -> 0x006b }
            kp3.C88253a.m109903b(r2, r3, r5)     // Catch:{ all -> 0x006b }
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x006b }
            byte[] r11 = r10.f285593c     // Catch:{ InterruptedException -> 0x004a }
            r11.wait()     // Catch:{ InterruptedException -> 0x004a }
        L_0x004a:
            long r7 = java.lang.System.nanoTime()     // Catch:{ all -> 0x006b }
            long r7 = r7 - r2
            java.lang.String r11 = "Vending"
            java.lang.String r2 = "%s waiting duration %s"
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x006b }
            r3[r1] = r9     // Catch:{ all -> 0x006b }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x006b }
            r3[r6] = r1     // Catch:{ all -> 0x006b }
            kp3.C88253a.m109903b(r11, r2, r3)     // Catch:{ all -> 0x006b }
            com.tencent.mm.vending.base.Vending$k<_Index> r11 = r9.mDeadlock     // Catch:{ all -> 0x006b }
            com.tencent.mm.vending.base.Vending$i<_Index> r1 = r11.f285577a     // Catch:{ all -> 0x006b }
            r2 = 0
            r1.f285576a = r2     // Catch:{ all -> 0x006b }
            r11.f285578b = r2     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            return r10
        L_0x006b:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vending.base.Vending.forSubscriberSync(com.tencent.mm.vending.base.Vending$q, java.lang.Object):com.tencent.mm.vending.base.Vending$q");
    }

    private _Struct getAsync(_Index _index) {
        if (invalidIndex(_index)) {
            return null;
        }
        C97310q lock = getLock(_index);
        if (requestIndex(lock, _index) && !lock.f285594d) {
            return lock.f285592b;
        }
        return null;
    }

    private _Struct getSync(_Index _index) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != this.mSubscriberLooper && myLooper != this.mVendingLooper) {
            throw new IllegalAccessError("Call from wrong looper");
        } else if (this.mCallDestroyed.get()) {
            return null;
        } else {
            C97310q lock = getLock(_index);
            if (invalidIndex(_index)) {
                return lock.f285592b;
            }
            if (myLooper == this.mSubscriberLooper) {
                return forSubscriberSync(lock, _index).f285592b;
            }
            loadFromVending(lock, _index);
            return lock.f285592b;
        }
    }

    /* access modifiers changed from: private */
    public boolean loadFromVending(C97310q<_Struct, _Index> qVar, _Index _index) {
        synchronized (qVar.f285593c) {
            if (qVar.f285596f && !qVar.f285594d) {
                if (!qVar.f285595e) {
                    return true;
                }
            }
            this.mResolveFromVending = true;
            Object resolveAsynchronous = resolveAsynchronous(_index);
            this.mResolveFromVending = false;
            if (qVar.f285597g) {
                return false;
            }
            lockResolved(qVar, _index, resolveAsynchronous);
            return false;
        }
    }

    private void lockResolved(C97310q<_Struct, _Index> qVar, _Index _index, _Struct _struct) {
        qVar.f285592b = _struct;
        qVar.f285591a = _index;
        qVar.f285594d = false;
        qVar.f285595e = false;
        qVar.f285596f = true;
        if (this.mDeadlock.f285578b == qVar) {
            qVar.f285598h = true;
        }
        qVar.f285593c.notify();
    }

    /* access modifiers changed from: private */
    public void notifyDataLoadedIfNeed(C97310q<_Struct, _Index> qVar) {
        if (qVar.f285598h) {
            qVar.f285598h = false;
            return;
        }
        Handler handler = this.mSubscriberHandler;
        handler.sendMessage(handler.obtainMessage(1, qVar));
    }

    /* access modifiers changed from: private */
    public void onDataResolved(_Index _index, _Struct _struct) {
        if (!this.mCallDestroyed.get() && this.mDataResolvedCallback != null) {
            C87316c cVar = this.mDataResolvedCallback;
            C117876a b = C117882j.m166283b(_index);
            synchronized (cVar) {
                cVar.mo121711n(b);
            }
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 121 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void refillImpl(_Index r4, boolean r5) {
        /*
            r3 = this;
            r3.looperCheckBoth()
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.mCallDestroyed
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            com.tencent.mm.vending.base.Vending$q r0 = r3.getLock(r4)
            byte[] r1 = r0.f285593c
            monitor-enter(r1)
            boolean r2 = r0.f285596f     // Catch:{ all -> 0x0026 }
            if (r2 == 0) goto L_0x001f
            r2 = 1
            if (r5 == 0) goto L_0x001d
            r0.f285594d = r2     // Catch:{ all -> 0x0026 }
            goto L_0x001f
        L_0x001d:
            r0.f285595e = r2     // Catch:{ all -> 0x0026 }
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            r3.getAsync(r4)
            return
        L_0x0024:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r4
        L_0x0026:
            r4 = move-exception
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vending.base.Vending.refillImpl(java.lang.Object, boolean):void");
    }

    private boolean requestIndex(C97310q<_Struct, _Index> qVar, _Index _index) {
        if (invalidIndex(_index)) {
            return false;
        }
        if (this.mCallDestroyed.get()) {
            C88253a.m109902a(TAG, "Vending.destroyed() has called.", new Object[0]);
            return false;
        }
        C97304n nVar = this.mLoader;
        if (!nVar.f285581c.get()) {
            synchronized (nVar.f285582d) {
                nVar.f285579a.put(_index, C97304n.C97307c.PENDING);
            }
            Handler handler = nVar.f285583e;
            handler.sendMessageAtFrontOfQueue(handler.obtainMessage(0, _index));
        }
        requestIndexImpl(qVar, _index);
        return true;
    }

    public C87315b<C97302l> addVendingDataChangedCallback(C97302l lVar) {
        C87316c cVar = this.mDataChangedCallback;
        cVar.getClass();
        return cVar.add(new C87315b(lVar, cVar));
    }

    public C87315b<C97303m> addVendingDataResolvedCallback(C97303m mVar) {
        C87316c cVar = this.mDataResolvedCallback;
        cVar.getClass();
        return cVar.add(new C87315b(mVar, cVar));
    }

    public abstract void applyChangeSynchronized(_Change _change);

    public final void dead() {
        looperCheckBoth();
        C88253a.m109903b(TAG, "Vending.destroy()", new Object[0]);
        this.mCallDestroyed.set(true);
        this.mVendingHandler.removeCallbacksAndMessages((Object) null);
        this.mSubscriberHandler.removeCallbacksAndMessages((Object) null);
        this.mLoader.f285581c.set(true);
        this.mLoader.mo136388a();
        Handler handler = this.mVendingHandler;
        handler.sendMessage(handler.obtainMessage(2));
    }

    public Vending<_Struct, _Index, _Change>.p defer(_Index _index) {
        looperCheckForVending();
        if (!this.mResolveFromVending) {
            C88253a.m109904c(TAG, "Please call defer in resolveAsynchronous()", new Object[0]);
            return null;
        }
        getLock(_index).f285597g = true;
        Vending<_Struct, _Index, _Change>.p pVar = new C97309p(this, _index);
        this.mVendingDeferring.add(pVar);
        return pVar;
    }

    public abstract void destroyAsynchronous();

    public void freezeDataChange() {
        if (!this.mCallDestroyed.get()) {
            synchronized (this.mPendingDataChangeLock) {
                this.mFreezeDataChange = true;
            }
        }
    }

    public <T> T get(_Index _index) {
        return getSync(_index);
    }

    public C97304n<_Index> getLoader() {
        return this.mLoader;
    }

    public C97310q<_Struct, _Index> getLock(_Index _index) {
        C97310q<_Struct, _Index> qVar;
        synchronized (this.mArrayDataLock) {
            qVar = this.mArray.get(_index);
            if (qVar == null) {
                qVar = new C97310q<>();
                this.mArray.put(_index, qVar);
            }
        }
        return qVar;
    }

    public Looper getLooper() {
        return this.mVendingLooper;
    }

    public boolean invalidIndex(_Index _index) {
        return false;
    }

    public void loaderClear() {
    }

    public void looperCheckBoth() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != this.mSubscriberLooper && myLooper != this.mVendingLooper) {
            throw new IllegalAccessError("Call from wrong looper");
        }
    }

    public void looperCheckForSubscriber() {
        if (Looper.myLooper() != this.mSubscriberLooper) {
            throw new IllegalAccessError("Call from wrong looper");
        }
    }

    public void looperCheckForVending() {
        if (Looper.myLooper() != this.mVendingLooper) {
            throw new IllegalAccessError("Call from wrong looper");
        }
    }

    public void notifyVendingDataChange() {
        notifyVendingDataChange(false);
    }

    public void notifyVendingDataChangeSynchronize() {
        notifyVendingDataChange(true);
    }

    public <T> T peek(_Index _index) {
        C97310q peekLock;
        if (!this.mCallDestroyed.get() && !invalidIndex(_index) && (peekLock = peekLock(_index)) != null && !peekLock.f285594d) {
            return peekLock.f285592b;
        }
        return null;
    }

    public C97310q<_Struct, _Index> peekLock(_Index _index) {
        C97310q<_Struct, _Index> qVar;
        synchronized (this.mArrayDataLock) {
            qVar = this.mArray.get(_index);
        }
        return qVar;
    }

    public abstract _Change prepareVendingDataAsynchronous();

    public void removeVendingDataChangedCallback(C97302l lVar) {
        C87316c cVar = this.mDataChangedCallback;
        cVar.getClass();
        cVar.remove(new C87315b(lVar, cVar));
    }

    public void removeVendingDataResolvedCallback(C97303m mVar) {
        C87316c cVar = this.mDataResolvedCallback;
        cVar.getClass();
        cVar.remove(new C87315b(mVar, cVar));
    }

    public void request(_Index _index) {
        refillImpl(_index, false);
    }

    public void requestConsistent(_Index _index) {
        refillImpl(_index, true);
    }

    public void requestIndexImpl(C97310q<_Struct, _Index> qVar, _Index _index) {
    }

    public abstract _Struct resolveAsynchronous(_Index _index);

    public void resolvedClear() {
        looperCheckBoth();
        if (!this.mCallDestroyed.get()) {
            this.mVendingSync.mo136394a(3, (Object) null);
        }
    }

    public void synchronizing(int i, Object obj) {
    }

    public void unfreezeDataChange() {
        if (!this.mCallDestroyed.get()) {
            synchronized (this.mPendingDataChangeLock) {
                this.mFreezeDataChange = false;
                if (this.mHasPendingDataChange) {
                    notifyVendingDataChange();
                    this.mHasPendingDataChange = false;
                }
            }
        }
    }

    public Vending(Looper looper) {
        this.mCallDestroyed = new AtomicBoolean(false);
        this.mArrayDataLock = new byte[0];
        this.mPendingDataChangeLock = new byte[0];
        this.mHasPendingDataChange = false;
        this.mFreezeDataChange = false;
        this.mDeadlock = new C97301k<>((C97291a) null);
        C88825i iVar = C88819d.f256219UI;
        this.mDataChangedCallback = new C97291a(this, iVar);
        this.mDataResolvedCallback = new C97292b(this, iVar);
        this.mArray = new C97308o<>();
        this.mVendingDeferring = new HashSet<>();
        this.mResolveFromVending = false;
        this.mSubscriberLooper = looper;
        Looper looper2 = C89049b.f256699b.f256700a.getLooper();
        this.mVendingLooper = looper2;
        this.mArray.f285589d = new C97293c();
        C97314b bVar = new C97314b(this.mSubscriberLooper, looper2);
        this.mVendingSync = bVar;
        bVar.f285610f = new C97294d();
        this.mSubscriberHandler = new C97295e(this.mSubscriberLooper);
        this.mVendingHandler = new C97296f(this.mVendingLooper);
        this.mLoader = new C97304n(this.mVendingLooper, new C97297g());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (android.os.Looper.myLooper() != r2.mVendingLooper) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        callPrepareVendingData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r2.mVendingHandler.removeMessages(1);
        r3 = r2.mVendingHandler;
        r3.sendMessage(r3.obtainMessage(1));
        r2.mVendingHandler.post(new com.tencent.p014mm.vending.base.Vending.C97298h(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void notifyVendingDataChange(boolean r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mCallDestroyed
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r2.mSubscriberLooper
            if (r0 == r1) goto L_0x0022
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r2.mVendingLooper
            if (r0 != r1) goto L_0x001a
            goto L_0x0022
        L_0x001a:
            java.lang.IllegalAccessError r3 = new java.lang.IllegalAccessError
            java.lang.String r0 = "Call from wrong thread"
            r3.<init>(r0)
            throw r3
        L_0x0022:
            if (r3 == 0) goto L_0x002c
            com.tencent.mm.vending.base.b r3 = r2.mVendingSync
            r0 = 2
            r1 = 0
            r3.mo136394a(r0, r1)
            return
        L_0x002c:
            byte[] r3 = r2.mPendingDataChangeLock
            monitor-enter(r3)
            boolean r0 = r2.mFreezeDataChange     // Catch:{ all -> 0x005e }
            r1 = 1
            if (r0 == 0) goto L_0x0038
            r2.mHasPendingDataChange = r1     // Catch:{ all -> 0x005e }
            monitor-exit(r3)     // Catch:{ all -> 0x005e }
            return
        L_0x0038:
            monitor-exit(r3)     // Catch:{ all -> 0x005e }
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r0 = r2.mVendingLooper
            if (r3 != r0) goto L_0x0045
            r2.callPrepareVendingData()
            goto L_0x005d
        L_0x0045:
            android.os.Handler r3 = r2.mVendingHandler
            r3.removeMessages(r1)
            android.os.Handler r3 = r2.mVendingHandler
            android.os.Message r0 = r3.obtainMessage(r1)
            r3.sendMessage(r0)
            android.os.Handler r3 = r2.mVendingHandler
            com.tencent.mm.vending.base.Vending$h r0 = new com.tencent.mm.vending.base.Vending$h
            r0.<init>(r2)
            r3.post(r0)
        L_0x005d:
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vending.base.Vending.notifyVendingDataChange(boolean):void");
    }
}
