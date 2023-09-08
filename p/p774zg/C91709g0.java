package p774zg;

import com.eclipsesource.mmv8.JavaCallback;
import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Function;
import com.eclipsesource.mmv8.V8Object;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zg.g0 */
public class C91709g0 extends C91688c0 {

    /* renamed from: b */
    public WeakReference<C80669j> f262706b = null;

    /* renamed from: zg.g0$a */
    public class C91710a implements JavaCallback {

        /* renamed from: a */
        public final /* synthetic */ C80669j f262707a;

        public C91710a(C91709g0 g0Var, C80669j jVar) {
            this.f262707a = jVar;
        }

        public Object invoke(V8Object v8Object, V8Array v8Array) {
            boolean z;
            ConcurrentLinkedQueue concurrentLinkedQueue;
            int andIncrement;
            if (v8Array.length() >= 2 && v8Array.getType(0) == 1 && v8Array.getType(1) == 7) {
                int integer = v8Array.getInteger(0);
                V8Function v8Function = (V8Function) v8Array.getObject(1);
                C91713d a = C91713d.m115239a();
                C80669j jVar = this.f262707a;
                synchronized (a.f262712a) {
                    try {
                        if (a.f262712a.containsKey(Integer.valueOf(integer))) {
                            concurrentLinkedQueue = a.f262712a.get(Integer.valueOf(integer));
                            z = concurrentLinkedQueue.isEmpty();
                        } else {
                            ConcurrentLinkedQueue concurrentLinkedQueue2 = new ConcurrentLinkedQueue();
                            a.f262712a.put(Integer.valueOf(integer), concurrentLinkedQueue2);
                            concurrentLinkedQueue = concurrentLinkedQueue2;
                            z = true;
                        }
                        andIncrement = a.f262713b.getAndIncrement();
                        C91712c cVar = new C91712c(andIncrement, jVar, v8Function);
                        concurrentLinkedQueue.offer(cVar);
                        if (z) {
                            C80669j jVar2 = cVar.f262709b;
                            jVar2.f236041b.mo112450v(new C91715h0(a, cVar.f262710c, jVar2));
                        }
                        Log.m105927v("MicroMsg.V8DirectApiSharedBufferLock", "hy: request lock %d", Integer.valueOf(andIncrement));
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                return Integer.valueOf(andIncrement);
            }
            Log.m105928w("MicroMsg.V8DirectApiSharedBufferLock", "hy: v8 params error");
            return -1;
        }
    }

    /* renamed from: zg.g0$b */
    public class C91711b implements JavaCallback {
        public C91711b(C91709g0 g0Var) {
        }

        public Object invoke(V8Object v8Object, V8Array v8Array) {
            if (v8Array.length() >= 2 && v8Array.getType(0) == 1 && v8Array.getType(1) == 1) {
                int integer = v8Array.getInteger(0);
                int integer2 = v8Array.getInteger(1);
                C91713d a = C91713d.m115239a();
                synchronized (a.f262712a) {
                    Log.m105927v("MicroMsg.V8DirectApiSharedBufferLock", "hy: request unlock %d", Integer.valueOf(integer2));
                    ConcurrentLinkedQueue concurrentLinkedQueue = a.f262712a.get(Integer.valueOf(integer));
                    Log.m105919d("MicroMsg.V8DirectApiSharedBufferLock", "hy: current queue: %s", concurrentLinkedQueue);
                    if (concurrentLinkedQueue != null) {
                        C91712c cVar = (C91712c) concurrentLinkedQueue.poll();
                        if (cVar != null) {
                            Log.m105919d("MicroMsg.V8DirectApiSharedBufferLock", "hy: toBeRemoved: %d", Integer.valueOf(cVar.f262708a));
                            C91712c cVar2 = (C91712c) concurrentLinkedQueue.peek();
                            if (cVar2 != null) {
                                Log.m105919d("MicroMsg.V8DirectApiSharedBufferLock", "hy: next called: %d", Integer.valueOf(cVar2.f262708a));
                                C80669j jVar = cVar2.f262709b;
                                jVar.f236041b.mo112450v(new C91715h0(a, cVar2.f262710c, jVar));
                            }
                        } else {
                            Log.m105929w("MicroMsg.V8DirectApiSharedBufferLock", "hy: bufferId: %d itemId: %d not found", Integer.valueOf(integer), Integer.valueOf(integer2));
                        }
                    } else {
                        Log.m105927v("MicroMsg.V8DirectApiSharedBufferLock", "hy: can not locate buffer locks %d", Integer.valueOf(integer));
                    }
                }
                return null;
            }
            Log.m105928w("MicroMsg.V8DirectApiSharedBufferLock", "hy: v8 params error");
            return null;
        }
    }

    /* renamed from: zg.g0$c */
    public static class C91712c {

        /* renamed from: a */
        public volatile int f262708a;

        /* renamed from: b */
        public volatile C80669j f262709b;

        /* renamed from: c */
        public volatile V8Function f262710c;

        public C91712c(int i, C80669j jVar, V8Function v8Function) {
            this.f262708a = i;
            this.f262709b = jVar;
            this.f262710c = v8Function;
        }

        public String toString() {
            return "LockItem{itemId=" + this.f262708a + '}';
        }
    }

    /* renamed from: zg.g0$d */
    public static class C91713d {

        /* renamed from: c */
        public static C91713d f262711c;

        /* renamed from: a */
        public final ConcurrentHashMap<Integer, ConcurrentLinkedQueue<C91712c>> f262712a = new ConcurrentHashMap<>(100);

        /* renamed from: b */
        public AtomicInteger f262713b = new AtomicInteger(0);

        /* renamed from: a */
        public static C91713d m115239a() {
            if (f262711c == null) {
                synchronized (C91713d.class) {
                    if (f262711c == null) {
                        f262711c = new C91713d();
                    }
                }
            }
            return f262711c;
        }
    }

    /* renamed from: a */
    public void mo125556a() {
        if (this.f262706b != null) {
            C91713d a = C91713d.m115239a();
            C80669j jVar = this.f262706b.get();
            synchronized (a.f262712a) {
                Log.m105925i("MicroMsg.V8DirectApiSharedBufferLock", "hy: trigger release engine %d", Integer.valueOf(jVar.hashCode()));
                for (Integer num : a.f262712a.keySet()) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = a.f262712a.get(num);
                    if (concurrentLinkedQueue != null) {
                        Iterator it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            C91712c cVar = (C91712c) it.next();
                            if (cVar.f262709b == jVar) {
                                cVar.f262710c.release();
                                concurrentLinkedQueue.remove(cVar);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo125558c(C80669j jVar, V8Object v8Object) {
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(jVar != null ? jVar.hashCode() : 0);
        Log.m105925i("MicroMsg.V8DirectApiSharedBufferLock", "hy: trigger setup worker %d", objArr);
        this.f262706b = new WeakReference<>(jVar);
        v8Object.registerJavaMethod((JavaCallback) new C91710a(this, jVar), "lockSharedNativeBuffer");
        v8Object.registerJavaMethod((JavaCallback) new C91711b(this), "unlockSharedNativeBuffer");
    }
}
