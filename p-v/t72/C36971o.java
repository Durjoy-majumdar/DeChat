package t72;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: t72.o */
public enum C36971o implements C38174i<C118391i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98054d;

    /* renamed from: t72.o$a */
    public static final class C36972a {

        /* renamed from: a */
        public static final List<Object> f98055a = null;

        static {
            f98055a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98054d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98054d;
                if (obj == obj2) {
                    obj = new C118391i();
                    this.f98054d = obj;
                }
            }
        }
        return (C118391i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C36972a.f98055a;
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
        return "provider " + C118391i.class.getName();
    }
}
