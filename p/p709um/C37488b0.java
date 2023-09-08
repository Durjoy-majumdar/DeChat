package p709um;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: um.b0 */
public enum C37488b0 implements C38174i<C37486a0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99048d;

    public Object get() {
        Object obj = this.f99048d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99048d;
                if (obj == obj2) {
                    obj = new C37486a0();
                    this.f99048d = obj;
                }
            }
        }
        return (C37486a0) obj;
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
        return "provider " + C37486a0.class.getName();
    }
}
