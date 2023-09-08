package androidx.lifecycle;

import androidx.lifecycle.C39623j;
import java.util.Iterator;
import java.util.Map;
import p1135n.C109660b;
import p856m.C61417a;

public abstract class LiveData<T> {
    public static final Object NOT_SET = new Object();
    public static final int START_VERSION = -1;
    public int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    public final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C109660b<C0120a0<? super T>, LiveData<T>.c> mObservers;
    public volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public class LifecycleBoundObserver extends LiveData<T>.c implements C103764p {

        /* renamed from: h */
        public final C0125s f306495h;

        public LifecycleBoundObserver(C0125s sVar, C0120a0<? super T> a0Var) {
            super(a0Var);
            this.f306495h = sVar;
        }

        /* renamed from: b */
        public void mo145120b() {
            this.f306495h.getLifecycle().removeObserver(this);
        }

        /* renamed from: c */
        public boolean mo145121c(C0125s sVar) {
            return this.f306495h == sVar;
        }

        /* renamed from: d */
        public boolean mo145122d() {
            return this.f306495h.getLifecycle().getCurrentState().mo62187a(C39623j.C39626c.STARTED);
        }

        /* renamed from: k4 */
        public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
            C39623j.C39626c currentState = this.f306495h.getLifecycle().getCurrentState();
            if (currentState == C39623j.C39626c.DESTROYED) {
                LiveData.this.removeObserver(this.f306498d);
                return;
            }
            C39623j.C39626c cVar = null;
            while (cVar != currentState) {
                mo145124a(mo145122d());
                cVar = currentState;
                currentState = this.f306495h.getLifecycle().getCurrentState();
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C103749a implements Runnable {
        public C103749a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public class C103750b extends LiveData<T>.c {
        public C103750b(LiveData liveData, C0120a0<? super T> a0Var) {
            super(a0Var);
        }

        /* renamed from: d */
        public boolean mo145122d() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    public abstract class C103751c {

        /* renamed from: d */
        public final C0120a0<? super T> f306498d;

        /* renamed from: e */
        public boolean f306499e;

        /* renamed from: f */
        public int f306500f = -1;

        public C103751c(C0120a0<? super T> a0Var) {
            this.f306498d = a0Var;
        }

        /* renamed from: a */
        public void mo145124a(boolean z) {
            if (z != this.f306499e) {
                this.f306499e = z;
                LiveData.this.changeActiveCounter(z ? 1 : -1);
                if (this.f306499e) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo145120b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo145121c(C0125s sVar) {
            return false;
        }

        /* renamed from: d */
        public abstract boolean mo145122d();
    }

    public LiveData(T t) {
        this.mDataLock = new Object();
        this.mObservers = new C109660b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new C103749a();
        this.mData = t;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (!C61417a.m72117a().mo86363b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void considerNotify(LiveData<T>.c cVar) {
        if (cVar.f306499e) {
            if (!cVar.mo145122d()) {
                cVar.mo145124a(false);
                return;
            }
            int i = cVar.f306500f;
            int i2 = this.mVersion;
            if (i < i2) {
                cVar.f306500f = i2;
                cVar.f306498d.onChanged(this.mData);
            }
        }
    }

    public void changeActiveCounter(int i) {
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (!this.mChangingActiveState) {
            this.mChangingActiveState = true;
            while (true) {
                try {
                    int i3 = this.mActiveCount;
                    if (i2 != i3) {
                        boolean z = i2 == 0 && i3 > 0;
                        boolean z2 = i2 > 0 && i3 == 0;
                        if (z) {
                            onActive();
                        } else if (z2) {
                            onInactive();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.mChangingActiveState = false;
                }
            }
        }
    }

    public void dispatchingValue(LiveData<T>.c cVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (cVar == null) {
                C109660b<C0120a0<? super T>, LiveData<T>.c> bVar = this.mObservers;
                bVar.getClass();
                C109660b.C109664d dVar = new C109660b.C109664d();
                bVar.f328281f.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    considerNotify((C103751c) ((Map.Entry) dVar.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(cVar);
                cVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t = this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.f328282g > 0;
    }

    public void observe(C0125s sVar, C0120a0<? super T> a0Var) {
        assertMainThread("observe");
        if (sVar.getLifecycle().getCurrentState() != C39623j.C39626c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(sVar, a0Var);
            C103751c h = this.mObservers.mo160872h(a0Var, lifecycleBoundObserver);
            if (h != null && !h.mo145121c(sVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (h == null) {
                sVar.getLifecycle().addObserver(lifecycleBoundObserver);
            }
        }
    }

    public void observeForever(C0120a0<? super T> a0Var) {
        assertMainThread("observeForever");
        C103750b bVar = new C103750b(this, a0Var);
        C103751c h = this.mObservers.mo160872h(a0Var, bVar);
        if (h instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (h == null) {
            bVar.mo145124a(true);
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = t;
        }
        if (z) {
            C61417a.m72117a().mo86364c(this.mPostValueRunnable);
        }
    }

    public void removeObserver(C0120a0<? super T> a0Var) {
        assertMainThread("removeObserver");
        C103751c i = this.mObservers.mo160873i(a0Var);
        if (i != null) {
            i.mo145120b();
            i.mo145124a(false);
        }
    }

    public void removeObservers(C0125s sVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<C0120a0<? super T>, LiveData<T>.c>> it = this.mObservers.iterator();
        while (true) {
            C109660b.C109665e eVar = (C109660b.C109665e) it;
            if (eVar.hasNext()) {
                Map.Entry entry = (Map.Entry) eVar.next();
                if (((C103751c) entry.getValue()).mo145121c(sVar)) {
                    removeObserver((C0120a0) entry.getKey());
                }
            } else {
                return;
            }
        }
    }

    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue((LiveData<T>.c) null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new C109660b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new C103749a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
