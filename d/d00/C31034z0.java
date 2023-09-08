package d00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d00.z0 */
public enum C31034z0 implements C38174i<C7158y0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83260d;

    public Object get() {
        Object obj = this.f83260d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83260d;
                if (obj == obj2) {
                    obj = new C7158y0();
                    this.f83260d = obj;
                }
            }
        }
        return (C7158y0) obj;
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
        return "provider " + C7158y0.class.getName();
    }
}
