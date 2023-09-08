package eb0;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: eb0.v0 */
public class C86493v0 {

    /* renamed from: b */
    public static volatile C86493v0 f251316b;

    /* renamed from: a */
    public Map<String, C86496d> f251317a = new C86494b((C45632a) null);

    /* renamed from: eb0.v0$b */
    public static class C86494b<K, V> extends ConcurrentHashMap<K, V> {
        public C86494b(C45632a aVar) {
        }

        public boolean containsValue(Object obj) {
            if (obj == null) {
                return false;
            }
            return super.containsValue(obj);
        }

        public V get(Object obj) {
            if (obj == null) {
                return null;
            }
            return super.get(obj);
        }

        public V put(K k, V v) {
            if (k == null) {
                return null;
            }
            return v == null ? super.remove(k) : super.put(k, v);
        }

        public V remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return super.remove(obj);
        }
    }

    /* renamed from: eb0.v0$c */
    public static class C86495c {

        /* renamed from: a */
        public Map<String, Object> f251318a = new C86494b((C45632a) null);

        /* renamed from: a */
        public boolean mo120954a(String str) {
            return ((ConcurrentHashMap) this.f251318a).containsKey(str);
        }

        /* renamed from: b */
        public Object mo120955b(String str) {
            return ((C86494b) this.f251318a).get(str);
        }

        /* renamed from: c */
        public <T> T mo120956c(String str, T t) {
            T b = mo120955b(str);
            return b != null ? b : t;
        }

        /* renamed from: d */
        public boolean mo120957d(String str, boolean z) {
            if (TextUtils.isEmpty(str)) {
                return z;
            }
            Object obj = ((C86494b) this.f251318a).get(str);
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
        }

        /* renamed from: e */
        public int mo120958e(String str, int i) {
            if (TextUtils.isEmpty(str)) {
                return i;
            }
            Object obj = ((C86494b) this.f251318a).get(str);
            return obj instanceof Integer ? ((Integer) obj).intValue() : i;
        }

        /* renamed from: f */
        public String mo120959f(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return str2;
            }
            Object obj = ((C86494b) this.f251318a).get(str);
            return obj instanceof String ? (String) obj : str2;
        }

        /* renamed from: g */
        public boolean mo120960g(String str) {
            if (!TextUtils.isEmpty(str)) {
                Object obj = ((C86494b) this.f251318a).get(str);
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                }
            }
            return false;
        }

        /* renamed from: h */
        public void mo120961h() {
            ((ConcurrentHashMap) this.f251318a).clear();
        }

        /* renamed from: i */
        public C86495c mo120962i(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                ((C86494b) this.f251318a).put(str, obj);
            }
            return this;
        }

        /* renamed from: j */
        public C86495c mo120963j(String str, boolean z) {
            if (!TextUtils.isEmpty(str)) {
                ((C86494b) this.f251318a).put(str, Boolean.valueOf(z));
            }
            return this;
        }

        /* renamed from: k */
        public C86495c mo120964k(String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                ((C86494b) this.f251318a).put(str, str2);
            }
            return this;
        }
    }

    /* renamed from: eb0.v0$d */
    public static final class C86496d {

        /* renamed from: a */
        public C86495c f251319a = new C86495c();

        /* renamed from: b */
        public long f251320b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static String m107223a(String str) {
        return "SessionId@" + str + "#" + System.nanoTime();
    }

    /* renamed from: d */
    public static C86493v0 m107224d() {
        if (f251316b == null) {
            synchronized (C86493v0.class) {
                if (f251316b == null) {
                    f251316b = new C86493v0();
                }
            }
        }
        return f251316b;
    }

    /* renamed from: b */
    public C86495c mo120946b(String str) {
        C86496d dVar = (C86496d) ((C86494b) this.f251317a).get(str);
        if (dVar != null) {
            return dVar.f251319a;
        }
        return null;
    }

    /* renamed from: c */
    public C86495c mo120947c(String str, boolean z) {
        C86496d dVar = (C86496d) ((C86494b) this.f251317a).get(str);
        if (dVar == null) {
            if (!z) {
                return null;
            }
            dVar = new C86496d();
            ((C86494b) this.f251317a).put(str, dVar);
        }
        return dVar.f251319a;
    }

    /* renamed from: e */
    public C86495c mo120948e(String str) {
        C86496d dVar = (C86496d) ((C86494b) this.f251317a).remove(str);
        if (dVar != null) {
            return dVar.f251319a;
        }
        return null;
    }

    public String toString() {
        C86496d dVar;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("DataCenter \nDataStore size : ");
        sb.append(((ConcurrentHashMap) this.f251317a).size());
        LinkedHashSet<Map.Entry> linkedHashSet = new LinkedHashSet<>(((ConcurrentHashMap) this.f251317a).entrySet());
        for (Map.Entry entry : linkedHashSet) {
            if (!(entry == null || (dVar = (C86496d) entry.getValue()) == null)) {
                sb.append("\nDataStore id : ");
                sb.append((String) entry.getKey());
                sb.append(", CT : ");
                sb.append(dVar.f251320b);
                sb.append(LocaleUtil.MALAY);
                sb.append(", TTL : ");
                sb.append((currentTimeMillis - dVar.f251320b) / 1000);
                sb.append("s");
            }
        }
        linkedHashSet.clear();
        return sb.toString();
    }
}
