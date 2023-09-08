package ie0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ie0.o */
public enum C33305o implements C38174i<C46224n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90318d;

    /* renamed from: ie0.o$a */
    public static final class C33306a {

        /* renamed from: a */
        public static final List<Object> f90319a = null;

        static {
            f90319a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90318d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90318d;
                if (obj == obj2) {
                    obj = new C46224n();
                    this.f90318d = obj;
                }
            }
        }
        return (C46224n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33306a.f90319a;
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
        return "provider " + C46224n.class.getName();
    }
}
