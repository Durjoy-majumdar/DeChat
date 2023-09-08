package d00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d00.b0 */
public enum C30984b0 implements C38174i<C30982a0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83143d;

    public Object get() {
        Object obj = this.f83143d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83143d;
                if (obj == obj2) {
                    obj = new C30982a0();
                    this.f83143d = obj;
                }
            }
        }
        return (C30982a0) obj;
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
        return "provider " + C30982a0.class.getName();
    }
}
