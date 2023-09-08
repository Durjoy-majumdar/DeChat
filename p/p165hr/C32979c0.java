package p165hr;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hr.c0 */
public enum C32979c0 implements C38174i<C60106t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89602d;

    /* renamed from: hr.c0$a */
    public static final class C32980a {

        /* renamed from: a */
        public static final List<Object> f89603a = null;

        static {
            f89603a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89602d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89602d;
                if (obj == obj2) {
                    obj = new C60106t();
                    this.f89602d = obj;
                }
            }
        }
        return (C60106t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32980a.f89603a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C60106t.class.getName();
    }
}
