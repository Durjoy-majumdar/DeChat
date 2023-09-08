package ly2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ly2.d */
public enum C34420d implements C38174i<C34419c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92680d;

    /* renamed from: ly2.d$a */
    public static final class C34421a {

        /* renamed from: a */
        public static final List<Object> f92681a = null;

        static {
            f92681a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92680d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92680d;
                if (obj == obj2) {
                    obj = new C34419c();
                    this.f92680d = obj;
                }
            }
        }
        return (C34419c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34421a.f92681a;
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
        return "provider " + C34419c.class.getName();
    }
}
