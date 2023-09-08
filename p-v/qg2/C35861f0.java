package qg2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: qg2.f0 */
public enum C35861f0 implements C38174i<C101140e0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95713d;

    /* renamed from: qg2.f0$a */
    public static final class C35862a {

        /* renamed from: a */
        public static final List<Object> f95714a = null;

        static {
            f95714a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95713d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95713d;
                if (obj == obj2) {
                    obj = new C101140e0();
                    this.f95713d = obj;
                }
            }
        }
        return (C101140e0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35862a.f95714a;
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
        return "provider " + C101140e0.class.getName();
    }
}
