package ed2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ed2.c */
public enum C31564c implements C38174i<C31563b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84368d;

    /* renamed from: ed2.c$a */
    public static final class C31565a {

        /* renamed from: a */
        public static final List<Object> f84369a = null;

        static {
            f84369a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84368d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84368d;
                if (obj == obj2) {
                    obj = new C31563b();
                    this.f84368d = obj;
                }
            }
        }
        return (C31563b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31565a.f84369a;
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
        return "provider " + C31563b.class.getName();
    }
}
