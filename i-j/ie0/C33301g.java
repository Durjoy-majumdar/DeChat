package ie0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ie0.g */
public enum C33301g implements C38174i<C33298f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90310d;

    /* renamed from: ie0.g$a */
    public static final class C33302a {

        /* renamed from: a */
        public static final List<Object> f90311a = null;

        static {
            f90311a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90310d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90310d;
                if (obj == obj2) {
                    obj = new C33298f();
                    this.f90310d = obj;
                }
            }
        }
        return (C33298f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33302a.f90311a;
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
        return "provider " + C33298f.class.getName();
    }
}
