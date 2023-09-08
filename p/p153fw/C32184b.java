package p153fw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fw.b */
public enum C32184b implements C38174i<C45811a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85559d;

    public Object get() {
        Object obj = this.f85559d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85559d;
                if (obj == obj2) {
                    obj = new C45811a();
                    this.f85559d = obj;
                }
            }
        }
        return (C45811a) obj;
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
        return "provider " + C45811a.class.getName();
    }
}
