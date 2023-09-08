package m04;

import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import rx3.C13598b0;
import w04.C118711c;
import w04.C26418g;
import z04.C112550d0;

/* renamed from: m04.e */
public class C24959e implements C24980n {

    /* renamed from: d */
    public static final String f71116d = C112550d0.m153797g0(C24959e.class.getCanonicalName(), ".", "");

    /* renamed from: e */
    public static final C24980n f71117e = new C24960a("NO_LOCKS", C24965f.f71124a, C117490d.f351595b);

    /* renamed from: a */
    public final C24977k f71118a;

    /* renamed from: b */
    public final C24965f f71119b;

    /* renamed from: c */
    public final String f71120c;

    /* renamed from: m04.e$g */
    public static class C21477g<K, V> {

        /* renamed from: a */
        public final K f60808a;

        /* renamed from: b */
        public final C32224a<? extends V> f60809b;

        public C21477g(K k, C32224a<? extends V> aVar) {
            this.f60808a = k;
            this.f60809b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && C21477g.class == obj.getClass() && this.f60808a.equals(((C21477g) obj).f60808a);
        }

        public int hashCode() {
            return this.f60808a.hashCode();
        }
    }

    /* renamed from: m04.e$a */
    public static class C24960a extends C24959e {
        public C24960a(String str, C24965f fVar, C24977k kVar) {
            super(str, fVar, kVar);
        }

        /* renamed from: k */
        public <K, V> C24974o<V> mo52009k(String str, K k) {
            if (str != null) {
                return new C24974o<>(null, true);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{FirebaseAnalytics.C113379b.SOURCE, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1", "recursionDetectedDefault"}));
        }
    }

    /* renamed from: m04.e$b */
    public class C24961b extends C24969j<T> {

        /* renamed from: g */
        public final /* synthetic */ Object f71121g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24961b(C24959e eVar, C24959e eVar2, C32224a aVar, Object obj) {
            super(eVar2, aVar);
            this.f71121g = obj;
        }

        /* renamed from: c */
        public C24974o<T> mo52011c(boolean z) {
            return new C24974o<>(this.f71121g, false);
        }
    }

    /* renamed from: m04.e$c */
    public class C24962c extends C24970k<T> {

        /* renamed from: h */
        public final /* synthetic */ C32226l f71122h;

        /* renamed from: i */
        public final /* synthetic */ C32226l f71123i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24962c(C24959e eVar, C24959e eVar2, C32224a aVar, C32226l lVar, C32226l lVar2) {
            super(eVar2, aVar);
            this.f71122h = lVar;
            this.f71123i = lVar2;
        }

        /* renamed from: a */
        public static /* synthetic */ void m31571a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i != 2 ? 2 : 3)];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: c */
        public C24974o<T> mo52011c(boolean z) {
            C32226l lVar = this.f71122h;
            if (lVar != null) {
                return new C24974o<>(lVar.invoke(Boolean.valueOf(z)), false);
            }
            C24974o<T> c = super.mo52011c(z);
            if (c != null) {
                return c;
            }
            m31571a(0);
            throw null;
        }
    }

    /* renamed from: m04.e$d */
    public static class C24963d<K, V> extends C24964e<K, V> implements C24957a<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24963d(C24959e eVar, ConcurrentMap concurrentMap, C24960a aVar) {
            super(eVar, concurrentMap, (C24960a) null);
            if (eVar == null) {
                m31573a(0);
                throw null;
            } else if (concurrentMap != null) {
            } else {
                m31573a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m31573a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* renamed from: c */
        public V mo52012c(K k, C32224a<? extends V> aVar) {
            if (aVar == null) {
                m31573a(2);
                throw null;
            } else if (aVar != null) {
                V invoke = invoke(new C21477g(k, aVar));
                if (invoke != null) {
                    return invoke;
                }
                m31573a(3);
                throw null;
            } else {
                C24964e.m31575a(2);
                throw null;
            }
        }
    }

    /* renamed from: m04.e$e */
    public static class C24964e<K, V> extends C24971l<C21477g<K, V>, V> implements C24958b<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24964e(C24959e eVar, ConcurrentMap concurrentMap, C24960a aVar) {
            super(eVar, concurrentMap, new C21478f());
            if (eVar == null) {
                m31575a(0);
                throw null;
            } else if (concurrentMap != null) {
            } else {
                m31575a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m31575a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* renamed from: m04.e$f */
    public interface C24965f {

        /* renamed from: a */
        public static final C24965f f71124a = new C24966a();

        /* renamed from: m04.e$f$a */
        public static class C24966a implements C24965f {
            /* renamed from: a */
            public RuntimeException mo52013a(Throwable th) {
                if (th == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"}));
                }
                C87412m.m108594g(th, "e");
                throw th;
            }
        }
    }

    /* renamed from: m04.e$h */
    public static class C24967h<T> implements C24976j<T> {

        /* renamed from: d */
        public final C24959e f71125d;

        /* renamed from: e */
        public final C32224a<? extends T> f71126e;

        /* renamed from: f */
        public volatile Object f71127f;

        public C24967h(C24959e eVar, C32224a<? extends T> aVar) {
            if (eVar == null) {
                m31577a(0);
                throw null;
            } else if (aVar != null) {
                this.f71127f = C24973n.NOT_COMPUTED;
                this.f71125d = eVar;
                this.f71126e = aVar;
            } else {
                m31577a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m31577a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 3) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i == 2 || i == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 3) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: b */
        public void mo52014b(T t) {
        }

        /* renamed from: c */
        public C24974o<T> mo52011c(boolean z) {
            C24974o<T> k = this.f71125d.mo52009k("in a lazy value", null);
            if (k != null) {
                return k;
            }
            m31577a(2);
            throw null;
        }

        public T invoke() {
            T t;
            T t2 = C24973n.RECURSION_WAS_DETECTED;
            T t3 = C24973n.COMPUTING;
            T t4 = this.f71127f;
            if (!(t4 instanceof C24973n)) {
                C26418g.m34016a(t4);
                return t4;
            }
            this.f71125d.f71118a.lock();
            try {
                T t5 = this.f71127f;
                if (!(t5 instanceof C24973n)) {
                    C26418g.m34016a(t5);
                    this.f71125d.f71118a.unlock();
                    return t5;
                }
                if (t5 == t3) {
                    this.f71127f = t2;
                    C24974o c = mo52011c(true);
                    if (!c.f71137b) {
                        t = c.f71136a;
                        this.f71125d.f71118a.unlock();
                        return t;
                    }
                }
                if (t5 == t2) {
                    C24974o c2 = mo52011c(false);
                    if (!c2.f71137b) {
                        t = c2.f71136a;
                        this.f71125d.f71118a.unlock();
                        return t;
                    }
                }
                this.f71127f = t3;
                t = this.f71126e.invoke();
                mo52014b(t);
                this.f71127f = t;
                this.f71125d.f71118a.unlock();
                return t;
            } catch (Throwable th) {
                this.f71125d.f71118a.unlock();
                throw th;
            }
        }
    }

    /* renamed from: m04.e$i */
    public static abstract class C24968i<T> extends C24967h<T> {

        /* renamed from: g */
        public volatile C24978l<T> f71128g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24968i(C24959e eVar, C32224a<? extends T> aVar) {
            super(eVar, aVar);
            if (eVar == null) {
                m31580a(0);
                throw null;
            } else if (aVar != null) {
                this.f71128g = null;
            } else {
                m31580a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m31580a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        public final void mo52014b(T t) {
            this.f71128g = new C24978l<>(t);
            try {
                C24962c cVar = (C24962c) this;
                if (t != null) {
                    cVar.f71123i.invoke(t);
                } else {
                    C24962c.m31571a(2);
                    throw null;
                }
            } finally {
                this.f71128g = null;
            }
        }

        public T invoke() {
            C24978l<T> lVar = this.f71128g;
            if (lVar != null) {
                boolean z = true;
                if (lVar.f71140b == Thread.currentThread()) {
                    if (lVar.f71140b != Thread.currentThread()) {
                        z = false;
                    }
                    if (z) {
                        return lVar.f71139a;
                    }
                    throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
                }
            }
            return super.invoke();
        }
    }

    /* renamed from: m04.e$j */
    public static class C24969j<T> extends C24967h<T> implements C21480i<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24969j(C24959e eVar, C32224a<? extends T> aVar) {
            super(eVar, aVar);
            if (eVar == null) {
                m31582a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                m31582a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m31582a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke != null) {
                return invoke;
            }
            m31582a(2);
            throw null;
        }
    }

    /* renamed from: m04.e$k */
    public static abstract class C24970k<T> extends C24968i<T> implements C21480i<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24970k(C24959e eVar, C32224a<? extends T> aVar) {
            super(eVar, aVar);
            if (eVar == null) {
                m31583a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                m31583a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m31583a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke != null) {
                return invoke;
            }
            m31583a(2);
            throw null;
        }
    }

    /* renamed from: m04.e$l */
    public static class C24971l<K, V> implements C21479h<K, V> {

        /* renamed from: d */
        public final C24959e f71129d;

        /* renamed from: e */
        public final ConcurrentMap<K, Object> f71130e;

        /* renamed from: f */
        public final C32226l<? super K, ? extends V> f71131f;

        public C24971l(C24959e eVar, ConcurrentMap<K, Object> concurrentMap, C32226l<? super K, ? extends V> lVar) {
            if (eVar == null) {
                m31584a(0);
                throw null;
            } else if (concurrentMap == null) {
                m31584a(1);
                throw null;
            } else if (lVar != null) {
                this.f71129d = eVar;
                this.f71130e = concurrentMap;
                this.f71131f = lVar;
            } else {
                m31584a(2);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m31584a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: b */
        public final AssertionError mo52015b(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f71129d);
            C24959e.m31558l(assertionError);
            return assertionError;
        }

        public V invoke(K k) {
            Object obj;
            AssertionError th;
            AssertionError assertionError;
            V v = C24973n.RECURSION_WAS_DETECTED;
            V v2 = C24973n.COMPUTING;
            V v3 = this.f71130e.get(k);
            V v4 = null;
            if (v3 == null || v3 == v2) {
                this.f71129d.f71118a.lock();
                try {
                    V v5 = this.f71130e.get(k);
                    if (v5 == v2) {
                        C24974o k2 = this.f71129d.mo52009k("", k);
                        if (k2 == null) {
                            m31584a(3);
                            throw null;
                        } else if (!k2.f71137b) {
                            obj = k2.f71136a;
                            return obj;
                        } else {
                            v5 = v;
                        }
                    }
                    if (v5 == v) {
                        C24974o k3 = this.f71129d.mo52009k("", k);
                        if (k3 == null) {
                            m31584a(3);
                            throw null;
                        } else if (!k3.f71137b) {
                            obj = k3.f71136a;
                            return obj;
                        }
                    }
                    if (v5 != null) {
                        C26418g.m34016a(v5);
                        if (v5 != C26418g.f73685a) {
                            v4 = v5;
                        }
                        obj = v4;
                        return obj;
                    }
                    try {
                        this.f71130e.put(k, v2);
                        V invoke = this.f71131f.invoke(k);
                        V put = this.f71130e.put(k, invoke == null ? C26418g.f73685a : invoke);
                        if (put == v2) {
                            this.f71129d.f71118a.unlock();
                            return invoke;
                        }
                        assertionError = mo52015b(k, put);
                        try {
                            throw assertionError;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        assertionError = null;
                        if (C118711c.m167394a(th)) {
                            this.f71130e.remove(k);
                            throw ((RuntimeException) th);
                        } else if (th != assertionError) {
                            V put2 = this.f71130e.put(k, new C26418g.C26420b(th, (C26418g.C26419a) null));
                            if (put2 != v2) {
                                throw mo52015b(k, put2);
                            }
                            ((C24965f.C24966a) this.f71129d.f71119b).mo52013a(th);
                            throw null;
                        } else {
                            ((C24965f.C24966a) this.f71129d.f71119b).mo52013a(th);
                            throw null;
                        }
                    }
                } finally {
                    this.f71129d.f71118a.unlock();
                }
            } else {
                C26418g.m34016a(v3);
                if (v3 == C26418g.f73685a) {
                    return null;
                }
                return v3;
            }
        }
    }

    /* renamed from: m04.e$m */
    public static class C24972m<K, V> extends C24971l<K, V> implements C24975g<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24972m(C24959e eVar, ConcurrentMap<K, Object> concurrentMap, C32226l<? super K, ? extends V> lVar) {
            super(eVar, concurrentMap, lVar);
            if (eVar == null) {
                m31586a(0);
                throw null;
            } else if (concurrentMap == null) {
                m31586a(1);
                throw null;
            } else if (lVar != null) {
            } else {
                m31586a(2);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m31586a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V invoke(K k) {
            V invoke = super.invoke(k);
            if (invoke != null) {
                return invoke;
            }
            m31586a(3);
            throw null;
        }
    }

    /* renamed from: m04.e$n */
    public enum C24973n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* renamed from: m04.e$o */
    public static class C24974o<T> {

        /* renamed from: a */
        public final T f71136a;

        /* renamed from: b */
        public final boolean f71137b;

        public C24974o(T t, boolean z) {
            this.f71136a = t;
            this.f71137b = z;
        }

        public String toString() {
            return this.f71137b ? "FALL_THROUGH" : String.valueOf(this.f71136a);
        }
    }

    public C24959e(String str, C24965f fVar, C24977k kVar) {
        if (str == null) {
            m31557i(4);
            throw null;
        } else if (fVar == null) {
            m31557i(5);
            throw null;
        } else if (kVar != null) {
            this.f71118a = kVar;
            this.f71119b = fVar;
            this.f71120c = str;
        } else {
            m31557i(6);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m31557i(int r13) {
        /*
            r0 = 37
            r1 = 20
            r2 = 13
            r3 = 10
            if (r13 == r3) goto L_0x0013
            if (r13 == r2) goto L_0x0013
            if (r13 == r1) goto L_0x0013
            if (r13 == r0) goto L_0x0013
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x0015
        L_0x0013:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L_0x0015:
            r5 = 3
            r6 = 2
            if (r13 == r3) goto L_0x0021
            if (r13 == r2) goto L_0x0021
            if (r13 == r1) goto L_0x0021
            if (r13 == r0) goto L_0x0021
            r7 = 3
            goto L_0x0022
        L_0x0021:
            r7 = 2
        L_0x0022:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager"
            java.lang.String r9 = "compute"
            r10 = 1
            r11 = 0
            if (r13 == r10) goto L_0x0065
            if (r13 == r5) goto L_0x0065
            r5 = 5
            if (r13 == r5) goto L_0x0065
            r5 = 6
            if (r13 == r5) goto L_0x0060
            switch(r13) {
                case 8: goto L_0x0065;
                case 9: goto L_0x005d;
                case 10: goto L_0x005a;
                case 11: goto L_0x005d;
                case 12: goto L_0x0055;
                case 13: goto L_0x005a;
                case 14: goto L_0x005d;
                case 15: goto L_0x0050;
                case 16: goto L_0x005d;
                case 17: goto L_0x0055;
                case 18: goto L_0x0050;
                case 19: goto L_0x005d;
                case 20: goto L_0x005a;
                case 21: goto L_0x005d;
                case 22: goto L_0x0050;
                case 23: goto L_0x004b;
                case 24: goto L_0x004b;
                case 25: goto L_0x0055;
                case 26: goto L_0x004b;
                case 27: goto L_0x0055;
                case 28: goto L_0x004b;
                case 29: goto L_0x0046;
                case 30: goto L_0x004b;
                case 31: goto L_0x004b;
                case 32: goto L_0x004b;
                case 33: goto L_0x0046;
                case 34: goto L_0x004b;
                case 35: goto L_0x0041;
                case 36: goto L_0x003c;
                case 37: goto L_0x005a;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r5 = "debugText"
            r7[r11] = r5
            goto L_0x0069
        L_0x003c:
            java.lang.String r5 = "throwable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0041:
            java.lang.String r5 = "source"
            r7[r11] = r5
            goto L_0x0069
        L_0x0046:
            java.lang.String r5 = "postCompute"
            r7[r11] = r5
            goto L_0x0069
        L_0x004b:
            java.lang.String r5 = "computable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0050:
            java.lang.String r5 = "map"
            r7[r11] = r5
            goto L_0x0069
        L_0x0055:
            java.lang.String r5 = "onRecursiveCall"
            r7[r11] = r5
            goto L_0x0069
        L_0x005a:
            r7[r11] = r8
            goto L_0x0069
        L_0x005d:
            r7[r11] = r9
            goto L_0x0069
        L_0x0060:
            java.lang.String r5 = "lock"
            r7[r11] = r5
            goto L_0x0069
        L_0x0065:
            java.lang.String r5 = "exceptionHandlingStrategy"
            r7[r11] = r5
        L_0x0069:
            java.lang.String r5 = "sanitizeStackTrace"
            java.lang.String r11 = "createMemoizedFunctionWithNullableValues"
            java.lang.String r12 = "createMemoizedFunction"
            if (r13 == r3) goto L_0x0080
            if (r13 == r2) goto L_0x0080
            if (r13 == r1) goto L_0x007d
            if (r13 == r0) goto L_0x007a
            r7[r10] = r8
            goto L_0x0082
        L_0x007a:
            r7[r10] = r5
            goto L_0x0082
        L_0x007d:
            r7[r10] = r11
            goto L_0x0082
        L_0x0080:
            r7[r10] = r12
        L_0x0082:
            switch(r13) {
                case 4: goto L_0x00be;
                case 5: goto L_0x00be;
                case 6: goto L_0x00be;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00b9;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00b6;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00b6;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00b6;
                case 17: goto L_0x00b6;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b3;
                case 20: goto L_0x00c2;
                case 21: goto L_0x00b3;
                case 22: goto L_0x00b3;
                case 23: goto L_0x00ae;
                case 24: goto L_0x00ae;
                case 25: goto L_0x00ae;
                case 26: goto L_0x00a9;
                case 27: goto L_0x00a9;
                case 28: goto L_0x00a4;
                case 29: goto L_0x00a4;
                case 30: goto L_0x009f;
                case 31: goto L_0x009a;
                case 32: goto L_0x0095;
                case 33: goto L_0x0095;
                case 34: goto L_0x0092;
                case 35: goto L_0x008d;
                case 36: goto L_0x008a;
                case 37: goto L_0x00c2;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.String r5 = "createWithExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x008a:
            r7[r6] = r5
            goto L_0x00c2
        L_0x008d:
            java.lang.String r5 = "recursionDetectedDefault"
            r7[r6] = r5
            goto L_0x00c2
        L_0x0092:
            r7[r6] = r9
            goto L_0x00c2
        L_0x0095:
            java.lang.String r5 = "createNullableLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009a:
            java.lang.String r5 = "createRecursionTolerantNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009f:
            java.lang.String r5 = "createNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a4:
            java.lang.String r5 = "createLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a9:
            java.lang.String r5 = "createRecursionTolerantLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00ae:
            java.lang.String r5 = "createLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00b3:
            r7[r6] = r11
            goto L_0x00c2
        L_0x00b6:
            r7[r6] = r12
            goto L_0x00c2
        L_0x00b9:
            java.lang.String r5 = "replaceExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00be:
            java.lang.String r5 = "<init>"
            r7[r6] = r5
        L_0x00c2:
            java.lang.String r4 = java.lang.String.format(r4, r7)
            if (r13 == r3) goto L_0x00d4
            if (r13 == r2) goto L_0x00d4
            if (r13 == r1) goto L_0x00d4
            if (r13 == r0) goto L_0x00d4
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            goto L_0x00d9
        L_0x00d4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r4)
        L_0x00d9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: m04.C24959e.m31557i(int):void");
    }

    /* renamed from: l */
    public static <T extends Throwable> T m31558l(T t) {
        if (t != null) {
            StackTraceElement[] stackTrace = t.getStackTrace();
            int length = stackTrace.length;
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (!stackTrace[i2].getClassName().startsWith(f71116d)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            List subList = Arrays.asList(stackTrace).subList(i, length);
            t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
            return t;
        }
        m31557i(36);
        throw null;
    }

    /* renamed from: a */
    public <T> C21480i<T> mo52000a(C32224a<? extends T> aVar, C32226l<? super Boolean, ? extends T> lVar, C32226l<? super T, C13598b0> lVar2) {
        if (aVar == null) {
            m31557i(28);
            throw null;
        } else if (lVar2 != null) {
            return new C24962c(this, this, aVar, lVar, lVar2);
        } else {
            m31557i(29);
            throw null;
        }
    }

    /* renamed from: b */
    public <T> C21480i<T> mo52001b(C32224a<? extends T> aVar, T t) {
        if (aVar == null) {
            m31557i(26);
            throw null;
        } else if (t != null) {
            return new C24961b(this, this, aVar, t);
        } else {
            m31557i(27);
            throw null;
        }
    }

    /* renamed from: c */
    public <K, V> C24957a<K, V> mo52002c() {
        return new C24963d(this, new ConcurrentHashMap(3, 1.0f, 2), (C24960a) null);
    }

    /* renamed from: d */
    public <K, V> C24958b<K, V> mo52003d() {
        return new C24964e(this, new ConcurrentHashMap(3, 1.0f, 2), (C24960a) null);
    }

    /* renamed from: e */
    public <K, V> C21479h<K, V> mo52004e(C32226l<? super K, ? extends V> lVar) {
        if (lVar != null) {
            return new C24971l(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
        }
        m31557i(19);
        throw null;
    }

    /* renamed from: f */
    public <T> C24976j<T> mo52005f(C32224a<? extends T> aVar) {
        if (aVar != null) {
            return new C24967h(this, aVar);
        }
        m31557i(30);
        throw null;
    }

    /* renamed from: g */
    public <T> C21480i<T> mo52006g(C32224a<? extends T> aVar) {
        if (aVar != null) {
            return new C24969j(this, aVar);
        }
        m31557i(23);
        throw null;
    }

    /* renamed from: h */
    public <K, V> C24975g<K, V> mo52007h(C32226l<? super K, ? extends V> lVar) {
        if (lVar != null) {
            return new C24972m(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
        }
        m31557i(9);
        throw null;
    }

    /* renamed from: j */
    public <T> T mo52008j(C32224a<? extends T> aVar) {
        if (aVar != null) {
            this.f71118a.lock();
            try {
                T invoke = aVar.invoke();
                this.f71118a.unlock();
                return invoke;
            } catch (Throwable th) {
                this.f71118a.unlock();
                throw th;
            }
        } else {
            m31557i(34);
            throw null;
        }
    }

    /* renamed from: k */
    public <K, V> C24974o<V> mo52009k(String str, K k) {
        String str2;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Recursion detected ");
            sb.append(str);
            if (k == null) {
                str2 = "";
            } else {
                str2 = "on input: " + k;
            }
            sb.append(str2);
            sb.append(" under ");
            sb.append(this);
            AssertionError assertionError = new AssertionError(sb.toString());
            m31558l(assertionError);
            AssertionError assertionError2 = assertionError;
            throw assertionError;
        }
        m31557i(35);
        throw null;
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f71120c + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24959e(java.lang.String r5) {
        /*
            r4 = this;
            m04.e$f r0 = m04.C24959e.C24965f.f71124a
            int r1 = m04.C24977k.f71138a
            m04.c r1 = new m04.c
            r2 = 1
            r3 = 0
            r1.<init>(r3, r2, r3)
            r4.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m04.C24959e.<init>(java.lang.String):void");
    }
}
