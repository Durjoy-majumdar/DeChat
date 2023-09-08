package p466cn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cn.j */
public enum C28628j implements C38174i<C67407i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78555d;

    public Object get() {
        Object obj = this.f78555d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78555d;
                if (obj == obj2) {
                    obj = new C67407i();
                    this.f78555d = obj;
                }
            }
        }
        return (C67407i) obj;
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
        return "provider " + C67407i.class.getName();
    }
}
