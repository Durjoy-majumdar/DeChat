package eg1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: eg1.o */
public enum C31591o implements C38174i<C31588n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84424d;

    /* renamed from: eg1.o$a */
    public static final class C31592a {

        /* renamed from: a */
        public static final List<Object> f84425a = null;

        static {
            f84425a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84424d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84424d;
                if (obj == obj2) {
                    obj = new C31588n();
                    this.f84424d = obj;
                }
            }
        }
        return (C31588n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31592a.f84425a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C31588n.class.getName();
    }
}
