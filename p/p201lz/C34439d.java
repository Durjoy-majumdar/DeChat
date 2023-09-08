package p201lz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: lz.d */
public enum C34439d implements C38174i<C88671c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92721d;

    public Object get() {
        Object obj = this.f92721d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92721d;
                if (obj == obj2) {
                    obj = new C88671c();
                    this.f92721d = obj;
                }
            }
        }
        return (C88671c) obj;
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
        return "provider " + C88671c.class.getName();
    }
}
