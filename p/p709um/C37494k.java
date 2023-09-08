package p709um;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: um.k */
public enum C37494k implements C38174i<C78234j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99060d;

    public Object get() {
        Object obj = this.f99060d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99060d;
                if (obj == obj2) {
                    obj = new C78234j();
                    this.f99060d = obj;
                }
            }
        }
        return (C78234j) obj;
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
        return "provider " + C78234j.class.getName();
    }
}
