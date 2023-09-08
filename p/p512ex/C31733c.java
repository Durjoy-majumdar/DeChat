package p512ex;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ex.c */
public enum C31733c implements C38174i<C45694b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84730d;

    public Object get() {
        Object obj = this.f84730d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84730d;
                if (obj == obj2) {
                    obj = new C45694b();
                    this.f84730d = obj;
                }
            }
        }
        return (C45694b) obj;
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
        return "provider " + C45694b.class.getName();
    }
}
