package f62;

import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;
import te3.C50886px;

/* renamed from: f62.f1 */
public interface C75694f1 {

    /* renamed from: f62.f1$a */
    public static class C75695a {

        /* renamed from: a */
        public static ConcurrentHashMap<Integer, C75694f1> f222302a = new ConcurrentHashMap<>();

        /* renamed from: a */
        public static void m90941a(int i, C75694f1 f1Var) {
            Assert.assertTrue(f222302a.get(Integer.valueOf(i)) == null);
            f222302a.put(Integer.valueOf(i), f1Var);
        }
    }

    /* renamed from: a */
    void mo66659a(Object obj, C50886px pxVar, int i, byte[] bArr, boolean z, C75699i1 i1Var);
}
