package fm1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fm1.d */
public enum C32133d implements C38174i<C8137c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85436d;

    public Object get() {
        Object obj = this.f85436d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85436d;
                if (obj == obj2) {
                    obj = new C8137c();
                    this.f85436d = obj;
                }
            }
        }
        return (C8137c) obj;
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
        return "provider " + C8137c.class.getName();
    }
}
