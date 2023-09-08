package p495dq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: dq.f */
public enum C31239f implements C38174i<C31238e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83695d;

    public Object get() {
        Object obj = this.f83695d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83695d;
                if (obj == obj2) {
                    obj = new C31238e();
                    this.f83695d = obj;
                }
            }
        }
        return (C31238e) obj;
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
        return "provider " + C31238e.class.getName();
    }
}
