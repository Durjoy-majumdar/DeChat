package tf0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: tf0.x0 */
public enum C37059x0 implements C38174i<C64922w0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98227d;

    public Object get() {
        Object obj = this.f98227d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98227d;
                if (obj == obj2) {
                    obj = new C64922w0();
                    this.f98227d = obj;
                }
            }
        }
        return (C64922w0) obj;
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
        return "provider " + C64922w0.class.getName();
    }
}
