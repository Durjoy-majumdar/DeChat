package dm2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: dm2.k */
public enum C31204k implements C38174i<C31203j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83617d;

    public Object get() {
        Object obj = this.f83617d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83617d;
                if (obj == obj2) {
                    obj = new C31203j();
                    this.f83617d = obj;
                }
            }
        }
        return (C31203j) obj;
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
        return "provider " + C31203j.class.getName();
    }
}
