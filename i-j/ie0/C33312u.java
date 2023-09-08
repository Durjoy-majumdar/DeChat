package ie0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ie0.u */
public enum C33312u implements C38174i<C33310t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90326d;

    /* renamed from: ie0.u$a */
    public static final class C33313a {

        /* renamed from: a */
        public static final List<Object> f90327a = null;

        static {
            f90327a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90326d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90326d;
                if (obj == obj2) {
                    obj = new C33310t();
                    this.f90326d = obj;
                }
            }
        }
        return (C33310t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33313a.f90327a;
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
        return "provider " + C33310t.class.getName();
    }
}
