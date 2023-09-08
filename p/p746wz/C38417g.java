package p746wz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wz.g */
public enum C38417g implements C38174i<C38416f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101335d;

    public Object get() {
        Object obj = this.f101335d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101335d;
                if (obj == obj2) {
                    obj = new C38416f();
                    this.f101335d = obj;
                }
            }
        }
        return (C38416f) obj;
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
        return "provider " + C38416f.class.getName();
    }
}
