package tf0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: tf0.v0 */
public enum C37053v0 implements C38174i<C64921u0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98218d;

    public Object get() {
        Object obj = this.f98218d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98218d;
                if (obj == obj2) {
                    obj = new C64921u0();
                    this.f98218d = obj;
                }
            }
        }
        return (C64921u0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
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
        return "provider " + C64921u0.class.getName();
    }
}
