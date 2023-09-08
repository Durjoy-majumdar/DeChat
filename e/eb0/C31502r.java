package eb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: eb0.r */
public enum C31502r implements C38174i<C75591q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84242d;

    /* renamed from: eb0.r$a */
    public static final class C31503a {

        /* renamed from: a */
        public static final List<Object> f84243a = null;

        static {
            f84243a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84242d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84242d;
                if (obj == obj2) {
                    obj = new C75591q();
                    this.f84242d = obj;
                }
            }
        }
        return (C75591q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31503a.f84243a;
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
        return "provider " + C75591q.class.getName();
    }
}
