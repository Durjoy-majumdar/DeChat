package hc1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hc1.d */
public enum C32804d implements C38174i<C98336c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89243d;

    public Object get() {
        Object obj = this.f89243d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89243d;
                if (obj == obj2) {
                    obj = new C98336c();
                    this.f89243d = obj;
                }
            }
        }
        return (C98336c) obj;
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
        return "provider " + C98336c.class.getName();
    }
}
