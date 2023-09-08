package bl3;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39630m0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: bl3.a0 */
public final class C39812a0 extends C39630m0 {

    /* renamed from: b */
    public boolean f106823b;

    /* renamed from: c */
    public final Object f106824c;

    /* renamed from: d */
    public boolean f106825d;

    /* renamed from: e */
    public HashMap<String, C39622i0> f106826e;

    /* renamed from: f */
    public final C13601g f106827f;

    /* renamed from: bl3.a0$b */
    public static final class C39814b extends C87413o implements C32224a<HashSet<Class<? extends C54495t>>> {

        /* renamed from: d */
        public static final C39814b f106830d = new C39814b();

        public C39814b() {
            super(0);
        }

        public Object invoke() {
            return new HashSet();
        }
    }

    public C39812a0() {
        this(false, 1, (C8480h) null);
    }

    public C39812a0(boolean z) {
        this.f106823b = z;
        this.f106824c = new Object();
        this.f106827f = C36568h.m40985a(C39814b.f106830d);
        Field declaredField = C39630m0.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        C39813a aVar = new C39813a(this);
        this.f106826e = aVar;
        declaredField.set(this, aVar);
    }

    /* renamed from: b */
    public final void mo62428b(C32226l<? super C39622i0, Boolean> lVar) {
        C87412m.m108594g(lVar, "isExecuteOnCleared");
        HashMap<String, C39622i0> hashMap = this.f106826e;
        if (hashMap != null) {
            synchronized (this.f106824c) {
                this.f106823b = true;
                HashMap hashMap2 = new HashMap(hashMap);
                HashMap hashMap3 = new HashMap();
                Set<Map.Entry<String, C39622i0>> entrySet = hashMap.entrySet();
                C87412m.m108593f(entrySet, "it.entries");
                for (Map.Entry entry : entrySet) {
                    Object value = entry.getValue();
                    C87412m.m108593f(value, "entry.value");
                    if (lVar.invoke(value).booleanValue()) {
                        Object key = entry.getKey();
                        C87412m.m108593f(key, "entry.key");
                        Object value2 = entry.getValue();
                        C87412m.m108593f(value2, "entry.value");
                        hashMap3.put(key, value2);
                    }
                }
                hashMap.clear();
                hashMap.putAll(hashMap3);
                mo62188a();
                hashMap.putAll(hashMap2);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public String toString() {
        String str;
        synchronized (this.f106824c) {
            HashMap<String, C39622i0> hashMap = this.f106826e;
            if (hashMap == null || (str = hashMap.toString()) == null) {
                str = "null";
            }
        }
        return str;
    }

    /* renamed from: bl3.a0$a */
    public static final class C39813a extends HashMap<String, C39622i0> {

        /* renamed from: d */
        public final C39812a0 f106828d;

        /* renamed from: e */
        public final HashMap<String, C39622i0> f106829e = new HashMap<>(0);

        public C39813a(C39812a0 a0Var) {
            C87412m.m108594g(a0Var, "store");
            this.f106828d = a0Var;
        }

        public void clear() {
            synchronized (this.f106828d.f106824c) {
                if (this.f106828d.f106823b) {
                    super.clear();
                    this.f106828d.f106825d = true;
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof C39622i0)) {
                return false;
            }
            return super.containsValue((C39622i0) obj);
        }

        public final /* bridge */ Set<Map.Entry<String, C39622i0>> entrySet() {
            return super.entrySet();
        }

        public final Object get(Object obj) {
            C39622i0 i0Var;
            if (!(obj instanceof String)) {
                return null;
            }
            String str = (String) obj;
            C87412m.m108594g(str, "key");
            synchronized (this.f106828d.f106824c) {
                i0Var = (C39622i0) super.get(str);
            }
            return i0Var;
        }

        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : (C39622i0) super.getOrDefault((String) obj, (C39622i0) obj2);
        }

        public final /* bridge */ Set<String> keySet() {
            return super.keySet();
        }

        public Object put(Object obj, Object obj2) {
            C39622i0 i0Var;
            String str = (String) obj;
            C39622i0 i0Var2 = (C39622i0) obj2;
            C87412m.m108594g(str, "key");
            C87412m.m108594g(i0Var2, "value");
            synchronized (this.f106828d.f106824c) {
                i0Var = (C39622i0) super.put(str, i0Var2);
            }
            return i0Var;
        }

        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return (C39622i0) super.remove((String) obj);
        }

        public final /* bridge */ int size() {
            return super.size();
        }

        public final Collection<C39622i0> values() {
            Collection<C39622i0> values;
            synchronized (this.f106828d.f106824c) {
                values = this.f106828d.f106823b ? super.values() : this.f106829e.values();
            }
            C87412m.m108593f(values, "synchronized(store.lock)…alues else empty.values }");
            return values;
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof C39622i0)) {
                return super.remove((String) obj, (C39622i0) obj2);
            }
            return false;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39812a0(boolean z, int i, C8480h hVar) {
        this((i & 1) != 0 ? false : z);
    }
}
