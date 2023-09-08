package eb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: eb0.c6 */
public enum C31453c6 implements C38174i<C97619b6> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84170d;

    /* renamed from: eb0.c6$a */
    public static final class C31454a {

        /* renamed from: a */
        public static final List<Object> f84171a = null;

        static {
            f84171a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84170d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84170d;
                if (obj == obj2) {
                    obj = new C97619b6();
                    this.f84170d = obj;
                }
            }
        }
        return (C97619b6) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31454a.f84171a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, -1879048175);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C97619b6.class.getName();
    }
}
