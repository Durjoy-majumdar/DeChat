package p507eq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: eq.f */
public enum C31658f implements C38174i<C31657e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84568d;

    public Object get() {
        Object obj = this.f84568d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84568d;
                if (obj == obj2) {
                    obj = new C31657e();
                    this.f84568d = obj;
                }
            }
        }
        return (C31657e) obj;
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
        return "provider " + C31657e.class.getName();
    }
}
