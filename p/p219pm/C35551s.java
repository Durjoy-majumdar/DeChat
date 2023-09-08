package p219pm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: pm.s */
public enum C35551s implements C38174i<C77112r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95058d;

    /* renamed from: pm.s$a */
    public static final class C35552a {

        /* renamed from: a */
        public static final List<Object> f95059a = null;

        static {
            f95059a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95058d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95058d;
                if (obj == obj2) {
                    obj = new C77112r();
                    this.f95058d = obj;
                }
            }
        }
        return (C77112r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35552a.f95059a;
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
        return "provider " + C77112r.class.getName();
    }
}
