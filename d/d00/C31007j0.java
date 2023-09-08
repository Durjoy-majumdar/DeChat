package d00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d00.j0 */
public enum C31007j0 implements C38174i<C31005i0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83194d;

    public Object get() {
        Object obj = this.f83194d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83194d;
                if (obj == obj2) {
                    obj = new C31005i0();
                    this.f83194d = obj;
                }
            }
        }
        return (C31005i0) obj;
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
        return "provider " + C31005i0.class.getName();
    }
}
