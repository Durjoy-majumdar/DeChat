package p566is;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: is.d */
public enum C33397d implements C38174i<C33395c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90492d;

    /* renamed from: is.d$a */
    public static final class C33398a {

        /* renamed from: a */
        public static final List<Object> f90493a = null;

        static {
            f90493a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90492d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90492d;
                if (obj == obj2) {
                    obj = new C33395c();
                    this.f90492d = obj;
                }
            }
        }
        return (C33395c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33398a.f90493a;
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
        return "provider " + C33395c.class.getName();
    }
}
