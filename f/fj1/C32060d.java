package fj1;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39630m0;
import bl3.C39816f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: fj1.d */
public abstract class C32060d implements C39816f {

    /* renamed from: d */
    public final C32061a<String, C39622i0> f85307d;

    /* renamed from: e */
    public final C39630m0 f85308e;

    /* renamed from: fj1.d$a */
    public static final class C32061a<K, V> extends HashMap<K, V> {

        /* renamed from: d */
        public final int f85309d;

        /* renamed from: e */
        public final String f85310e;

        public C32061a(int i, String str) {
            C87412m.m108594g(str, "tag");
            this.f85309d = i;
            this.f85310e = str;
        }

        public synchronized void clear() {
            Log.m105924i("LiveContext", "clear(" + hashCode() + ')');
            super.clear();
        }

        public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
            return super.entrySet();
        }

        public synchronized V get(Object obj) {
            return super.get(obj);
        }

        public final /* bridge */ Set<K> keySet() {
            return super.keySet();
        }

        public synchronized V put(K k, V v) {
            Log.m105924i("LiveContext", "put(" + hashCode() + ") ,buContext(" + this.f85309d + ") buContextTag(" + this.f85310e + ")," + k);
            return super.put(k, v);
        }

        public synchronized V remove(Object obj) {
            Log.m105924i("LiveContext", "remove(" + hashCode() + ") " + obj);
            return super.remove(obj);
        }

        public final /* bridge */ int size() {
            return super.size();
        }

        public final /* bridge */ Collection<V> values() {
            return super.values();
        }
    }

    public C32060d(String str) {
        C87412m.m108594g(str, "nameTag");
        C32061a<String, C39622i0> aVar = new C32061a<>(hashCode(), str);
        this.f85307d = aVar;
        C39630m0 m0Var = new C39630m0();
        this.f85308e = m0Var;
        Log.m105924i("LiveContext", "init " + hashCode() + " check map " + aVar);
        Field declaredField = C39630m0.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(m0Var);
        declaredField.set(m0Var, aVar);
        Object obj2 = declaredField.get(m0Var);
        Log.m105924i("LiveContext", "init check map srcMap1:" + obj.hashCode() + " srcMap2:" + obj2.hashCode() + " storeMap:" + aVar.hashCode());
    }

    public C39630m0 getViewModelStore() {
        return this.f85308e;
    }
}
