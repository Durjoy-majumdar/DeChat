package eb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: eb0.y5 */
public enum C31538y5 implements C38174i<C31533x5> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84298d;

    /* renamed from: eb0.y5$a */
    public static final class C31539a {

        /* renamed from: a */
        public static final List<Object> f84299a = null;

        static {
            f84299a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84298d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84298d;
                if (obj == obj2) {
                    obj = new C31533x5();
                    this.f84298d = obj;
                }
            }
        }
        return (C31533x5) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31539a.f84299a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 9999);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31533x5.class.getName();
    }
}
