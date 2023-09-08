package hb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hb0.s */
public enum C32788s implements C38174i<C32787r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89210d;

    /* renamed from: hb0.s$a */
    public static final class C32789a {

        /* renamed from: a */
        public static final List<Object> f89211a = null;

        static {
            f89211a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89210d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89210d;
                if (obj == obj2) {
                    obj = new C32787r();
                    this.f89210d = obj;
                }
            }
        }
        return (C32787r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32789a.f89211a;
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
        return "provider " + C32787r.class.getName();
    }
}
