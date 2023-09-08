package c13;

import di3.C86301e;
import ei3.C86522b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import p592kz.C99274d;

@C86522b
/* renamed from: c13.p */
public class C79917p extends C86301e implements C99274d {

    /* renamed from: d */
    public static boolean f234136d;

    /* renamed from: c13.p$a */
    public enum C79918a implements C99274d.C88338a {
        INSTANCE;
        

        /* renamed from: d */
        public final ConcurrentMap<String, AtomicLong> f234139d;

        /* renamed from: e */
        public final ConcurrentMap<String, AtomicLong> f234140e;

        /* renamed from: a */
        public final Map<String, Long> mo110080a(ConcurrentMap<String, AtomicLong> concurrentMap) {
            if (!C79917p.f234136d) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (Map.Entry next : concurrentMap.entrySet()) {
                if (((AtomicLong) next.getValue()).get() >= 100) {
                    hashMap.put((String) next.getKey(), Long.valueOf(((AtomicLong) next.getValue()).get()));
                }
            }
            return hashMap;
        }

        /* renamed from: b */
        public void mo110081b(String str, long j, long j2, long j3, long j4) {
            if (C79917p.f234136d) {
                AtomicLong atomicLong = (AtomicLong) ((ConcurrentHashMap) this.f234139d).get(str);
                AtomicLong atomicLong2 = (AtomicLong) ((ConcurrentHashMap) this.f234140e).get(str);
                if (atomicLong == null) {
                    atomicLong = new AtomicLong(0);
                    ((ConcurrentHashMap) this.f234139d).put(str, atomicLong);
                }
                if (atomicLong2 == null) {
                    atomicLong2 = new AtomicLong(0);
                    ((ConcurrentHashMap) this.f234140e).put(str, atomicLong2);
                }
                atomicLong.addAndGet(j4);
                atomicLong2.addAndGet(j3);
            }
        }
    }

    /* renamed from: wT */
    public C99274d.C88338a mo110079wT() {
        return C79918a.INSTANCE;
    }
}
