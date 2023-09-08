package eb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: eb0.x0 */
public enum C31529x0 implements C38174i<C97631w0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84282d;

    /* renamed from: eb0.x0$a */
    public static final class C31530a {

        /* renamed from: a */
        public static final List<Object> f84283a = null;

        static {
            f84283a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84282d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84282d;
                if (obj == obj2) {
                    obj = new C97631w0();
                    this.f84282d = obj;
                }
            }
        }
        return (C97631w0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31530a.f84283a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, -1879048174);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C97631w0.class.getName();
    }
}
