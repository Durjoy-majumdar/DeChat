package p231rv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rv.f */
public enum C36499f implements C38174i<C77571e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97105d;

    public Object get() {
        Object obj = this.f97105d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97105d;
                if (obj == obj2) {
                    obj = new C77571e();
                    this.f97105d = obj;
                }
            }
        }
        return (C77571e) obj;
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
        return "provider " + C77571e.class.getName();
    }
}
