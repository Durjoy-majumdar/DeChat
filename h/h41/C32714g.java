package h41;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: h41.g */
public enum C32714g implements C38174i<C117067b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86775d;

    /* renamed from: h41.g$a */
    public static final class C32715a {

        /* renamed from: a */
        public static final List<Object> f86776a = null;

        static {
            f86776a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f86775d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86775d;
                if (obj == obj2) {
                    obj = C117067b.wx0();
                    this.f86775d = obj;
                }
            }
        }
        return (C117067b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C117067b.class;
        }
        if ("onProcess".equals(str)) {
            return C32715a.f86776a;
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
        return "provider " + C117067b.class.getName();
    }
}
