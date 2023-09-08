package p165hr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hr.d */
public enum C32981d implements C38174i<C60092c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89606d;

    public Object get() {
        Object obj = this.f89606d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89606d;
                if (obj == obj2) {
                    obj = new C60092c();
                    this.f89606d = obj;
                }
            }
        }
        return (C60092c) obj;
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
        return "provider " + C60092c.class.getName();
    }
}
