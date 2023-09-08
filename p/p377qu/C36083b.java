package p377qu;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qu.b */
public enum C36083b implements C38174i<C22132a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96176d;

    public Object get() {
        Object obj = this.f96176d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96176d;
                if (obj == obj2) {
                    obj = new C22132a();
                    this.f96176d = obj;
                }
            }
        }
        return (C22132a) obj;
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
        return "provider " + C22132a.class.getName();
    }
}
