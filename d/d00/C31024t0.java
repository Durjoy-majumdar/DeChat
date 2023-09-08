package d00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d00.t0 */
public enum C31024t0 implements C38174i<C75317s0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83239d;

    public Object get() {
        Object obj = this.f83239d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83239d;
                if (obj == obj2) {
                    obj = new C75317s0();
                    this.f83239d = obj;
                }
            }
        }
        return (C75317s0) obj;
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
        return "provider " + C75317s0.class.getName();
    }
}
