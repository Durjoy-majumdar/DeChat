package f00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: f00.e0 */
public enum C31759e0 implements C38174i<C7960d0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84794d;

    /* renamed from: f00.e0$a */
    public static final class C31760a {

        /* renamed from: a */
        public static final List<Object> f84795a = null;

        static {
            f84795a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84794d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84794d;
                if (obj == obj2) {
                    obj = new C7960d0();
                    this.f84794d = obj;
                }
            }
        }
        return (C7960d0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31760a.f84795a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "hijackconfig");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C7960d0.class.getName();
    }
}
