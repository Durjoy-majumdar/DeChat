package p439ao;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ao.p */
public enum C27968p implements C38174i<C27967o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77204d;

    /* renamed from: ao.p$a */
    public static final class C27969a {

        /* renamed from: a */
        public static final List<Object> f77205a = null;

        static {
            f77205a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77204d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77204d;
                if (obj == obj2) {
                    obj = new C27967o();
                    this.f77204d = obj;
                }
            }
        }
        return (C27967o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27969a.f77205a;
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
        return "provider " + C27967o.class.getName();
    }
}
