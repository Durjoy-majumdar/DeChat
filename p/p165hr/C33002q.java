package p165hr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hr.q */
public enum C33002q implements C38174i<C60102p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89658d;

    public Object get() {
        Object obj = this.f89658d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89658d;
                if (obj == obj2) {
                    obj = new C60102p();
                    this.f89658d = obj;
                }
            }
        }
        return (C60102p) obj;
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
        return "provider " + C60102p.class.getName();
    }
}
