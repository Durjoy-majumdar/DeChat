package ma1;

import ei3.C31607a;
import f81.C116807d;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ma1.c */
public enum C34493c implements C38174i<C117543a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92831d;

    /* renamed from: ma1.c$a */
    public static final class C34494a {

        /* renamed from: a */
        public static final List<Object> f92832a = null;

        static {
            f92832a = Arrays.asList(new Object[]{C116807d.class});
        }
    }

    public Object get() {
        Object obj = this.f92831d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92831d;
                if (obj == obj2) {
                    obj = new C117543a();
                    this.f92831d = obj;
                }
            }
        }
        return (C117543a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C34494a.f92832a;
        }
        if ("onProcess".equals(str)) {
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
        return "provider " + C117543a.class.getName();
    }
}
