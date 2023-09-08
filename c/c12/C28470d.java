package c12;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: c12.d */
public enum C28470d implements C38174i<C16832c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78260d;

    /* renamed from: c12.d$a */
    public static final class C28471a {

        /* renamed from: a */
        public static final List<Object> f78261a = null;

        static {
            f78261a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f78260d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78260d;
                if (obj == obj2) {
                    obj = new C16832c();
                    this.f78260d = obj;
                }
            }
        }
        return (C16832c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28471a.f78261a;
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
        return "provider " + C16832c.class.getName();
    }
}
