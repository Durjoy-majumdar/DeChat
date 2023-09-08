package rb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: rb0.t */
public enum C36281t implements C38174i<C48004s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96604d;

    /* renamed from: rb0.t$a */
    public static final class C36282a {

        /* renamed from: a */
        public static final List<Object> f96605a = null;

        static {
            f96605a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96604d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96604d;
                if (obj == obj2) {
                    obj = new C48004s();
                    this.f96604d = obj;
                }
            }
        }
        return (C48004s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36282a.f96605a;
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
        return "provider " + C48004s.class.getName();
    }
}
