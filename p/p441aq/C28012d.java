package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.d */
public enum C28012d implements C38174i<C28006c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77309d;

    public Object get() {
        Object obj = this.f77309d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77309d;
                if (obj == obj2) {
                    obj = new C28006c();
                    this.f77309d = obj;
                }
            }
        }
        return (C28006c) obj;
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
        return "provider " + C28006c.class.getName();
    }
}
