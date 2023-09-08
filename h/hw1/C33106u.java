package hw1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hw1.u */
public enum C33106u implements C38174i<C60221t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89893d;

    public Object get() {
        Object obj = this.f89893d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89893d;
                if (obj == obj2) {
                    obj = new C60221t();
                    this.f89893d = obj;
                }
            }
        }
        return (C60221t) obj;
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
        return "provider " + C60221t.class.getName();
    }
}
