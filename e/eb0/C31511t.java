package eb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: eb0.t */
public enum C31511t implements C38174i<C31507s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84256d;

    /* renamed from: eb0.t$a */
    public static final class C31512a {

        /* renamed from: a */
        public static final List<Object> f84257a = null;

        static {
            f84257a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84256d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84256d;
                if (obj == obj2) {
                    obj = new C31507s();
                    this.f84256d = obj;
                }
            }
        }
        return (C31507s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31512a.f84257a;
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
        return "provider " + C31507s.class.getName();
    }
}
