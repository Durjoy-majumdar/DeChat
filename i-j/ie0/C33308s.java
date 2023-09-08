package ie0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ie0.s */
public enum C33308s implements C38174i<C33307r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90322d;

    /* renamed from: ie0.s$a */
    public static final class C33309a {

        /* renamed from: a */
        public static final List<Object> f90323a = null;

        static {
            f90323a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90322d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90322d;
                if (obj == obj2) {
                    obj = new C33307r();
                    this.f90322d = obj;
                }
            }
        }
        return (C33307r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33309a.f90323a;
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
        return "provider " + C33307r.class.getName();
    }
}
