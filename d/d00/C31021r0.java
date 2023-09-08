package d00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d00.r0 */
public enum C31021r0 implements C38174i<C31019q0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83230d;

    public Object get() {
        Object obj = this.f83230d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83230d;
                if (obj == obj2) {
                    obj = new C31019q0();
                    this.f83230d = obj;
                }
            }
        }
        return (C31019q0) obj;
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
        return "provider " + C31019q0.class.getName();
    }
}
