package sv2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: sv2.i */
public enum C36852i implements C38174i<C118315h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97824d;

    /* renamed from: sv2.i$a */
    public static final class C36853a {

        /* renamed from: a */
        public static final List<Object> f97825a = null;

        static {
            f97825a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97824d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97824d;
                if (obj == obj2) {
                    obj = new C118315h();
                    this.f97824d = obj;
                }
            }
        }
        return (C118315h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36853a.f97825a;
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
        return "provider " + C118315h.class.getName();
    }
}
